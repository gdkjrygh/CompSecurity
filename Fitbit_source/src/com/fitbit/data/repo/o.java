// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.util.n;
import com.fitbit.util.t;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

// Referenced classes of package com.fitbit.data.repo:
//            l

public class o extends l
{
    public class a
    {

        final o a;
        private boolean b;
        private InputStream c;

        public void a(InputStream inputstream)
        {
            c = inputstream;
        }

        public void a(boolean flag)
        {
            b = flag;
        }

        public boolean a()
        {
            return b;
        }

        public InputStream b()
        {
            return c;
        }

        public a()
        {
            a = o.this;
            super();
        }
    }


    public static final long a = 0x1d4c0L;
    private static final String b = "DiskDataCache";
    private static final String c = "datacache";
    private static final String d = "tmp_assert_";
    private static final int e = 0x1400000;
    private final File f = g();

    public o()
    {
    }

    private boolean a(File file, long l1, boolean flag)
    {
        long l2 = Calendar.getInstance().getTimeInMillis();
        long l3 = file.lastModified();
        if (file.exists() && l2 - l3 > l1)
        {
            if (flag)
            {
                com.fitbit.e.a.a("DiskDataCache", "file %s is expired and removed.", new Object[] {
                    file.getName()
                });
                file.delete();
            }
            return true;
        } else
        {
            return false;
        }
    }

    private void e()
    {
        File afile[] = f.listFiles();
        if (afile != null && afile.length != 0)
        {
            Arrays.sort(afile, new Comparator() {

                final o a;

                public int a(File file1, File file2)
                {
                    return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file1.lastModified()));
                }

                public int compare(Object obj, Object obj1)
                {
                    return a((File)obj, (File)obj1);
                }

            
            {
                a = o.this;
                super();
            }
            });
            long l1 = 0L;
            int j = afile.length;
            int i = 0;
            while (i < j) 
            {
                File file = afile[i];
                l1 += file.length();
                if (l1 > 0x1400000L)
                {
                    file.delete();
                    com.fitbit.e.a.a("DiskDataCache", "Size exceeded  %s(%s). Removing old file: %s", new Object[] {
                        Long.valueOf(l1), Integer.valueOf(0x1400000), file.getAbsolutePath()
                    });
                }
                i++;
            }
        }
    }

    private void f()
    {
        if (!f.exists())
        {
            f.mkdirs();
        }
    }

    private static File g()
    {
        File file = new File(FitBitApplication.a().getCacheDir(), "datacache");
        if (!file.exists() || !file.isDirectory())
        {
            file.mkdir();
        }
        return file;
    }

    public a a(String s, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        File file;
        a1 = new a();
        file = new File(f, t.a(s));
        a1.a(new FileInputStream(file));
        com.fitbit.e.a.a("DiskDataCache", "got %s from cache", new Object[] {
            s
        });
        a1.a(a(file, l1, false));
_L2:
        this;
        JVM INSTR monitorexit ;
        return a1;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        a1.a(true);
        com.fitbit.e.a.a("DiskDataCache", "failed to get %s from cache ", filenotfoundexception, new Object[] {
            s
        });
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    public void a(String s, InputStream inputstream)
    {
        this;
        JVM INSTR monitorenter ;
        a(s, inputstream, 0x1d4c0L);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void a(String s, InputStream inputstream, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new File(f, t.a(s));
        a(((File) (obj)), l1, true);
        f();
        e();
        if (!((File) (obj)).createNewFile()) goto _L2; else goto _L1
_L1:
        FileOutputStream fileoutputstream = new FileOutputStream(((File) (obj)));
        obj = fileoutputstream;
        n.a(inputstream, fileoutputstream);
_L8:
        n.a(inputstream);
        n.a(fileoutputstream);
_L3:
        com.fitbit.e.a.a("DiskDataCache", "Successfuly put %s to cache with expiration time: %s", new Object[] {
            s, Long.valueOf(l1)
        });
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        IOException ioexception;
        ioexception;
        fileoutputstream = null;
_L6:
        obj = fileoutputstream;
        com.fitbit.e.a.e("DiskDataCache", ioexception);
        n.a(inputstream);
        n.a(fileoutputstream);
          goto _L3
        s;
        throw s;
        s;
        obj = null;
_L5:
        n.a(inputstream);
        n.a(((java.io.Closeable) (obj)));
        throw s;
        s;
        if (true) goto _L5; else goto _L4
_L4:
        ioexception;
          goto _L6
_L2:
        fileoutputstream = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(String s, byte abyte0[])
    {
        Object obj = null;
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        File file;
        f();
        e();
        file = new File(f, t.a(s));
        if (!file.createNewFile()) goto _L2; else goto _L1
_L1:
        s = new ByteArrayInputStream(abyte0);
        abyte0 = new FileOutputStream(file);
        n.a(s, abyte0);
_L8:
        n.a(s);
        n.a(abyte0);
_L3:
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        s = null;
        abyte0 = obj1;
_L6:
        com.fitbit.e.a.e("DiskDataCache", ((Throwable) (obj)));
        n.a(abyte0);
        n.a(s);
          goto _L3
        s;
        throw s;
        abyte0;
        s = null;
_L5:
        n.a(s);
        n.a(((java.io.Closeable) (obj)));
        throw abyte0;
        abyte0;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj = abyte0;
        abyte0 = exception;
        continue; /* Loop/switch isn't completed */
        obj;
        byte abyte1[] = abyte0;
        abyte0 = ((byte []) (obj));
        obj = s;
        s = abyte1;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        Object obj2 = null;
        abyte0 = s;
        s = obj2;
          goto _L6
        obj;
        String s1 = s;
        s = abyte0;
        abyte0 = s1;
          goto _L6
_L2:
        abyte0 = null;
        s = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public byte[] a(String s)
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        boolean flag;
        f();
        obj = new File(f, t.a(s));
        flag = ((File) (obj)).exists();
        if (!flag) goto _L2; else goto _L1
_L1:
        FileInputStream fileinputstream = new FileInputStream(((File) (obj)));
        obj = new ByteArrayOutputStream();
        FileInputStream fileinputstream1;
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = ((ByteArrayOutputStream) (obj));
        fileinputstream1 = fileinputstream;
        n.a(fileinputstream, ((java.io.OutputStream) (obj)));
        bytearrayoutputstream = ((ByteArrayOutputStream) (obj));
        fileinputstream1 = fileinputstream;
        byte abyte0[] = ((ByteArrayOutputStream) (obj)).toByteArray();
        s = abyte0;
        n.a(fileinputstream);
        n.a(((java.io.Closeable) (obj)));
_L3:
        this;
        JVM INSTR monitorexit ;
        return s;
        IOException ioexception;
        ioexception;
        obj = null;
        fileinputstream = null;
_L6:
        bytearrayoutputstream = ((ByteArrayOutputStream) (obj));
        fileinputstream1 = fileinputstream;
        com.fitbit.e.a.e("DiskDataCache", ioexception);
        n.a(fileinputstream);
        n.a(((java.io.Closeable) (obj)));
_L2:
        com.fitbit.e.a.a("DiskDataCache", "File does not exist: %s", new Object[] {
            s
        });
        s = obj1;
          goto _L3
        s;
        throw s;
        s;
        bytearrayoutputstream = null;
        fileinputstream = null;
_L5:
        n.a(fileinputstream);
        n.a(bytearrayoutputstream);
        throw s;
        s;
        bytearrayoutputstream = null;
        continue; /* Loop/switch isn't completed */
        s;
        fileinputstream = fileinputstream1;
        if (true) goto _L5; else goto _L4
_L4:
        ioexception;
        obj = null;
          goto _L6
        ioexception;
          goto _L6
    }

    public String b(String s, byte abyte0[])
    {
        Object obj1 = null;
        Object obj2 = null;
        this;
        JVM INSTR monitorenter ;
        f();
        e();
        Object obj = File.createTempFile("tmp_assert_", s.substring(s.length() - 4), f);
        if (obj == null) goto _L2; else goto _L1
_L1:
        s = new ByteArrayInputStream(abyte0);
        abyte0 = new FileOutputStream(((File) (obj)));
        n.a(s, abyte0);
_L10:
        n.a(s);
        n.a(abyte0);
_L5:
        e();
        if (obj != null) goto _L4; else goto _L3
_L3:
        s = "";
_L6:
        this;
        JVM INSTR monitorexit ;
        return s;
        abyte0;
        obj1 = null;
        s = null;
        obj = obj2;
_L8:
        com.fitbit.e.a.e("DiskDataCache", abyte0);
        n.a(s);
        n.a(((java.io.Closeable) (obj)));
        obj = obj1;
          goto _L5
        s;
        throw s;
        abyte0;
        s = null;
        obj = obj1;
_L7:
        n.a(s);
        n.a(((java.io.Closeable) (obj)));
        throw abyte0;
_L4:
        s = ((File) (obj)).getAbsolutePath();
          goto _L6
        abyte0;
        obj = obj1;
          goto _L7
        obj1;
        obj = abyte0;
        abyte0 = ((byte []) (obj1));
          goto _L7
        abyte0;
          goto _L7
        abyte0;
        s = null;
        obj1 = obj;
        obj = obj2;
          goto _L8
        abyte0;
        obj1 = obj;
        obj = obj2;
          goto _L8
        IOException ioexception;
        ioexception;
        byte abyte1[] = abyte0;
        abyte0 = ioexception;
        ioexception = ((IOException) (obj));
        obj = abyte1;
          goto _L8
_L2:
        abyte0 = null;
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new File(f, t.a(s));
        if (s.exists())
        {
            s.delete();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        File afile[] = f.listFiles();
        if (afile == null) goto _L2; else goto _L1
_L1:
        int i = afile.length;
        if (i != 0) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        int j = afile.length;
        i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        afile[i].delete();
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L2; else goto _L6
_L6:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean c(String s)
    {
        return (new File(f, t.a(s))).exists();
    }

    public long d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new File(f, t.a(s));
        if (!s.exists()) goto _L2; else goto _L1
_L1:
        long l1 = s.lastModified();
_L4:
        this;
        JVM INSTR monitorexit ;
        return l1;
_L2:
        l1 = 0L;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        File afile[] = f.listFiles();
        if (afile == null) goto _L2; else goto _L1
_L1:
        int i = afile.length;
        if (i != 0) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        int j = afile.length;
        i = 0;
_L5:
        File file;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        file = afile[i];
        if (file.getName().startsWith("tmp_assert_"))
        {
            file.delete();
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L2; else goto _L6
_L6:
        Exception exception;
        exception;
        throw exception;
    }

    public void e(String s)
    {
        this;
        JVM INSTR monitorenter ;
        f();
        s = new File(f, t.a(s));
        if (s.exists())
        {
            s.setLastModified(System.currentTimeMillis());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
