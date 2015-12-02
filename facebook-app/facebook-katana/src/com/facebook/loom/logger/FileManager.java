// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import android.content.Context;
import android.os.Environment;
import com.facebook.analytics.logger.AnalyticsLogger;
import com.facebook.common.build.BuildConstants;
import com.facebook.debug.log.BLog;
import com.google.common.collect.Iterables;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileManager
{

    private static final FilenameFilter c = new _cls1();
    private static final FilenameFilter d = new _cls2();
    private int a;
    private long b;
    private final File e;
    private AnalyticsLogger f;

    public FileManager(Context context)
    {
        this(a(context));
    }

    private FileManager(File file)
    {
        a = 0;
        b = 0L;
        e = file;
    }

    static AnalyticsLogger a(FileManager filemanager)
    {
        return filemanager.f;
    }

    private static File a(Context context)
    {
        File file = context.getCacheDir();
        File file1 = context.getFilesDir();
        if (BuildConstants.c() && Environment.getExternalStorageState().equals("mounted"))
        {
            context = context.getExternalCacheDir();
            if (context != null && (context.exists() || context.mkdirs()))
            {
                return context;
            }
        }
        if (file != null && (file.exists() || file.mkdirs()))
        {
            return file;
        } else
        {
            return file1;
        }
    }

    private static List a(File file, FilenameFilter filenamefilter)
    {
        if (file.listFiles(filenamefilter) == null)
        {
            return Collections.EMPTY_LIST;
        } else
        {
            return Arrays.asList(file.listFiles(filenamefilter));
        }
    }

    private void a(File file, int i)
    {
        if (file.exists() || file.isDirectory())
        {
            if ((file = a(file, c)).size() > i)
            {
                Collections.sort(file, new _cls5());
                file = file.subList(0, file.size() - i).iterator();
                while (file.hasNext()) 
                {
                    File file1 = (File)file.next();
                    if (!file1.delete())
                    {
                        BLog.a("Dextr", "Can't delete cache file: %s", new Object[] {
                            file1.getName()
                        });
                    }
                }
            }
        }
    }

    private void a(File file, File file1, long l)
    {
        if (file.exists() || file.isDirectory())
        {
            long l1 = System.currentTimeMillis();
            file = a(file, c).iterator();
            while (file.hasNext()) 
            {
                File file2 = (File)file.next();
                if (file2.lastModified() < l1 - l)
                {
                    file2.getName();
                    a(file2, new File(file1, file2.getName()));
                    (new _cls6()).run();
                }
            }
        }
    }

    private static boolean a(File file, File file1)
    {
        if (file1 != null)
        {
            if (file.renameTo(file1))
            {
                return true;
            }
            BLog.a("Dextr", "Can't move file: %s", new Object[] {
                file.getName()
            });
        }
        if (file.exists() && !file.delete())
        {
            BLog.b("Dextr", "Can't delete file: %s", new Object[] {
                file.getName()
            });
        }
        return false;
    }

    private File f()
    {
        return new File(e, "upload");
    }

    public final List a()
    {
        Object obj = f();
        a(((File) (obj)), e, b);
        obj = a(((File) (obj)), c);
        Collections.sort(((List) (obj)), new _cls3());
        return ((List) (obj));
    }

    public final void a(int i)
    {
        a = i;
    }

    public final void a(long l)
    {
        b = 1000L * l;
    }

    public final void a(File file)
    {
        if (a(file, new File(e, file.getName())))
        {
            a(e, a);
        }
    }

    public final void a(File file, boolean flag)
    {
        Object obj = file.getName();
        int i = ((String) (obj)).lastIndexOf('.');
        String s = ((String) (obj));
        if (i != -1)
        {
            s = ((String) (obj)).substring(0, i);
        }
        obj = (new StringBuilder()).append(s).append(".log").toString();
        s = ((String) (obj));
        if (!flag)
        {
            s = (new StringBuilder("override-")).append(((String) (obj))).toString();
        }
        obj = f();
        if (((File) (obj)).isDirectory() || ((File) (obj)).mkdirs())
        {
            if (!file.renameTo(new File(((File) (obj)), s)))
            {
                BLog.a("Dextr", "Can't move file to upload folder: %s", new Object[] {
                    file
                });
            }
            a(((File) (obj)), e, b);
            a(e, a);
            return;
        } else
        {
            BLog.a("Dextr", "Couldn't create upload directory");
            return;
        }
    }

    public final List b()
    {
        List list = a(f(), d);
        Collections.sort(list, new _cls4());
        return list;
    }

    public final boolean c()
    {
        Iterator iterator = d().iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            File file = (File)iterator.next();
            if (file.exists())
            {
                if (flag && file.delete())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
        } while (true);
        return flag;
    }

    public final Iterable d()
    {
        List list = a(f(), d);
        List list1 = a(f(), c);
        return Iterables.a(a(e(), d), a(e(), c), list, list1);
    }

    public final File e()
    {
        return e;
    }


    private class _cls5
        implements Comparator
    {

        final FileManager a;

        private static int a(File file, File file1)
        {
            return file.getName().compareTo(file1.getName());
        }

        public int compare(Object obj, Object obj1)
        {
            return a((File)obj, (File)obj1);
        }

        _cls5()
        {
            a = FileManager.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final FileManager a;

        public void run()
        {
            if (FileManager.a(a) != null)
            {
                HoneyClientEventFast honeyclienteventfast = FileManager.a(a).a("dextr_trace_trimmed", false);
                if (honeyclienteventfast.a())
                {
                    honeyclienteventfast.b();
                }
            }
        }

        _cls6()
        {
            a = FileManager.this;
            super();
        }
    }


    private class _cls3
        implements Comparator
    {

        final FileManager a;

        private static int a(File file, File file1)
        {
            return file.getName().compareTo(file1.getName());
        }

        public int compare(Object obj, Object obj1)
        {
            return a((File)obj, (File)obj1);
        }

        _cls3()
        {
            a = FileManager.this;
            super();
        }
    }


    private class _cls4
        implements Comparator
    {

        final FileManager a;

        private static int a(File file, File file1)
        {
            return file.getName().compareTo(file1.getName());
        }

        public int compare(Object obj, Object obj1)
        {
            return a((File)obj, (File)obj1);
        }

        _cls4()
        {
            a = FileManager.this;
            super();
        }
    }


    private class _cls1
        implements FilenameFilter
    {

        public final boolean accept(File file, String s)
        {
            return !s.startsWith("override-") && (s.endsWith(".log") || s.endsWith(".tmp"));
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements FilenameFilter
    {

        public final boolean accept(File file, String s)
        {
            return s.startsWith("override-") && s.endsWith(".log");
        }

        _cls2()
        {
        }
    }

}
