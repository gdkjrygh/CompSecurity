// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class dvw
{

    public static final gip d = gip.a("cache_location_v4");
    public static final gip e = gip.a("cache_location");
    public static final gip f = gip.a("settings_location");
    public static final gip g = gip.a("storage_location");
    public static final gip h = gip.a("previous_cache_path");
    public static final gip i = gip.a("previous_cache_size");
    public boolean a;
    public String b;
    public final gin c;
    private final Context j;
    private String k;
    private boolean l;
    private final dvx m;
    private List n;

    public dvw(Context context)
    {
        dvx dvx1 = new dvx(context);
        gin gin1 = ((giq)dmz.a(giq)).a(context);
        new dmd();
        this(context, dvx1, gin1);
    }

    private dvw(Context context, dvx dvx1, gin gin1)
    {
        j = context;
        c = gin1;
        m = dvx1;
    }

    private String a(Context context)
    {
_L5:
        boolean flag5 = dvx.e();
        if (!h()) goto _L2; else goto _L1
_L1:
        Object obj = c.c(d);
        if (obj == null || !((String) (obj)).endsWith(m.a())) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L13:
        Iterator iterator;
        StringBuilder stringbuilder;
        String s4;
        IOException ioexception;
        long l1;
        long l2;
        if (flag)
        {
            String s3 = c.c(d);
            String s = a(s3, m.a(), m.d());
            obj = s;
            if (!s.equals(s3))
            {
                c.b().a(d, s).b();
                obj = s;
            }
        } else
        if (h())
        {
            obj = c.c(d);
        } else
        {
            obj = c.a(e, null);
            boolean flag3;
            if (obj == null)
            {
                flag3 = false;
            } else
            {
                flag3 = (new File(((String) (obj)))).isDirectory();
            }
            if (flag3)
            {
                obj = c.c(e);
                if (((String) (obj)).endsWith(m.c()))
                {
                    String s1 = a(((String) (obj)), m.c(), m.d());
                    if (!s1.equals(obj))
                    {
                        c.b().a(e, null).a(d, s1).b();
                        obj = s1;
                    }
                } else
                {
                    c.b().a(e, null).a(d, ((String) (obj))).b();
                }
            } else
            {
                obj = c.a(e, null);
                boolean flag1;
                if (obj == null)
                {
                    flag1 = false;
                } else
                {
                    obj = new File(((String) (obj)));
                    if (!((File) (obj)).isDirectory())
                    {
                        if (((File) (obj)).mkdirs())
                        {
                            c.b().a(e, null).b();
                            Logger.a("Deleted temporary cache dir: %b", new Object[] {
                                Boolean.valueOf(((File) (obj)).delete())
                            });
                            flag1 = false;
                        } else
                        {
                            flag1 = true;
                        }
                    } else
                    {
                        flag1 = true;
                    }
                }
                if (flag1)
                {
                    obj = c.c(e);
                } else
                {
                    if (n == null)
                    {
                        obj = dmd.a("/proc/mounts");
                        LinkedList linkedlist = new LinkedList();
                        a(((Set) (obj)), m.d(), ((List) (linkedlist)));
                        a(((Set) (obj)), m.c(), ((List) (linkedlist)));
                        n = linkedlist;
                    }
                    Logger.a("Found %d volume(s) containing a pre-existing cache", new Object[] {
                        Integer.valueOf(n.size())
                    });
                    boolean flag2;
                    if (!n.isEmpty())
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    if (flag2)
                    {
                        obj = (File)n.iterator().next();
                        Logger.a("Using orphan cache stored on %s", new Object[] {
                            obj
                        });
                        obj = a(((File) (obj)));
                    } else
                    {
                        boolean flag4;
                        if (c.f(g))
                        {
                            flag4 = g();
                        } else
                        {
                            flag4 = (new File(i(), m.a())).isDirectory();
                        }
                        if (flag4)
                        {
                            obj = (new File(i(), m.a())).getAbsolutePath();
                        } else
                        if (f())
                        {
                            obj = "/sdcard/spotify2/";
                        } else
                        {
                            obj = null;
                        }
                    }
                }
            }
        }
        if (flag5 != dvx.e()) goto _L5; else goto _L4
_L4:
        if (gcl.j && obj != null && !gdv.a(new File(((String) (obj)))))
        {
            Logger.c("Found inaccessible cache directory: %s", new Object[] {
                obj
            });
            obj = null;
        }
        if (obj != null) goto _L7; else goto _L6
_L6:
        if (gcl.i)
        {
            b(context);
        }
        Logger.a("No cache location set", new Object[0]);
        obj = dmd.a("/proc/mounts");
        a(context, ((Set) (obj)));
        stringbuilder = new StringBuilder();
        Logger.a("Choosing cache volume between %d candidate(s): ", new Object[] {
            Integer.valueOf(((Set) (obj)).size())
        });
        context = new gfq();
        iterator = ((Set) (obj)).iterator();
_L12:
        if (!iterator.hasNext()) goto _L9; else goto _L8
_L8:
        s4 = (String)iterator.next();
        context.a(s4);
        l2 = context.b();
        if (!gcl.h) goto _L11; else goto _L10
_L10:
        l1 = ((gfq) (context)).a.getBlockCountLong();
_L14:
        l1 *= context.a();
        stringbuilder.append(String.format("%s %d %d;", new Object[] {
            s4, Long.valueOf(l2), Long.valueOf(l1)
        }));
        Logger.a("%s (%d/%d bytes free/total)", new Object[] {
            s4, Long.valueOf(l2), Long.valueOf(l1)
        });
          goto _L12
        ioexception;
        Logger.b("cannot stat %s", new Object[] {
            s4
        });
          goto _L12
_L2:
        flag = false;
          goto _L13
_L11:
        int i1 = ((gfq) (context)).a.getBlockCount();
        l1 = i1;
          goto _L14
_L9:
        context = dmc.a(((Set) (obj)), c.a(h, null), c.a(i, 0L));
        Logger.a("Chose cache volume: %s", new Object[] {
            context
        });
        obj = context;
        if (context == null)
        {
            obj = Environment.getExternalStorageDirectory().getAbsolutePath();
            Logger.a("Falling back to volume: %s", new Object[] {
                obj
            });
        }
        String s2 = a(new File(((String) (obj)), m.d()));
        context = s2;
        if (s2 == null)
        {
            Object obj1 = new File(j.getFilesDir(), "spotifycache");
            if (!((File) (obj1)).isDirectory() && ((File) (obj1)).mkdirs())
            {
                context = ((File) (obj1)).getAbsolutePath();
            } else
            {
                context = null;
                Logger.c("Could not create cache location %s", new Object[] {
                    obj1
                });
            }
        }
        obj1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.J);
        ((ClientEvent) (obj1)).a("cache-volume", ((String) (obj)));
        ((ClientEvent) (obj1)).a("candidate-volumes", stringbuilder.toString());
        dmz.a(fop);
        fop.a(ViewUri.as, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ((ClientEvent) (obj1)));
_L16:
        if (context != null)
        {
            obj = new File(context);
            if (((File) (obj)).exists() && ((File) (obj)).isDirectory())
            {
                break; /* Loop/switch isn't completed */
            }
        }
        return context;
_L7:
        File file = new File(((String) (obj)));
        if (!file.exists() || !file.isDirectory())
        {
            Logger.a("Recreating cache directory %s, success: %b", new Object[] {
                file, Boolean.valueOf(file.mkdirs())
            });
        }
        context = ((Context) (obj));
        if (!file.exists())
        {
            continue; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj));
        if (!file.isDirectory())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((String) (obj)).startsWith("/sdcard/spotify2"))
        {
            context = ((Context) (obj));
            if (Math.random() >= 0.001D)
            {
                continue; /* Loop/switch isn't completed */
            }
            context = ((Context) (obj));
            if (!((String) (obj)).endsWith("/cache"))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        Assertion.b((new StringBuilder("Using legacy path ")).append(((String) (obj))).toString());
        context = ((Context) (obj));
        if (true) goto _L16; else goto _L15
_L15:
        c.b().a(d, context).b();
        return context;
          goto _L12
    }

    private static String a(File file)
    {
        if (!file.isDirectory() && !file.mkdirs())
        {
            return null;
        } else
        {
            return file.getAbsolutePath();
        }
    }

    private static String a(String s, String s1, String s2)
    {
label0:
        {
            File file = new File(s);
            s2 = new File(s.substring(0, s.length() - s1.length()), s2);
            s1 = s2.getParentFile();
            boolean flag;
            if (s1.exists())
            {
                flag = true;
            } else
            {
                flag = s1.mkdirs();
            }
            s1 = s;
            if (flag)
            {
                if (!file.renameTo(s2))
                {
                    break label0;
                }
                s1 = s2.toString();
            }
            return s1;
        }
        Assertion.b((new StringBuilder("Could not move cache location from ")).append(s).append(" to ").append(s2).toString());
        return s;
    }

    private static void a(Context context, Set set)
    {
        if (gcl.j)
        {
            Logger.a("Doing additional check for post-Lollipop devices.", new Object[0]);
            set = set.iterator();
            do
            {
                if (!set.hasNext())
                {
                    break;
                }
                String s = (String)set.next();
                if (!gdv.a(new File((new StringBuilder()).append(s).append("/Android/data/").append(context.getPackageName()).toString())))
                {
                    set.remove();
                    Logger.b("Removed possible cache path %s. Reason: it is not accessible", new Object[] {
                        s
                    });
                }
            } while (true);
        }
    }

    private static void a(Set set, String s, List list)
    {
        if (set != null)
        {
            set = set.iterator();
            do
            {
                if (!set.hasNext())
                {
                    break;
                }
                File file = new File((String)set.next(), s);
                if (file.isDirectory())
                {
                    list.add(file);
                }
            } while (true);
        }
    }

    private boolean a(String s)
    {
        Object obj;
        File file;
        Object obj1;
        file = e();
        obj1 = j();
        obj = new ArrayList(Arrays.asList((new File(s)).listFiles()));
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            File file2 = new File(s, (String)((Iterator) (obj1)).next());
            if (((List) (obj)).contains(file2))
            {
                ((List) (obj)).remove(file2);
            }
        } while (true);
        obj1 = ((List) (obj)).iterator();
_L7:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        s = (File)((Iterator) (obj1)).next();
        File file3 = new File(file, s.getName());
        if (!s.isDirectory()) goto _L4; else goto _L3
_L3:
        hdb.b(s, file3);
_L5:
        s.setWritable(true);
        if (s.canWrite() && !s.delete())
        {
            Logger.c("Failed to delete settings file: %s", new Object[] {
                s
            });
        }
        continue; /* Loop/switch isn't completed */
_L4:
        try
        {
            hdb.a(s, file3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logger.c("Exception thrown while migrating settings file: %s ", new Object[] {
                s
            });
            return false;
        }
        if (true) goto _L5; else goto _L2
_L2:
        s = new ArrayList(Arrays.asList(file.listFiles()));
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            File file1 = (File)((Iterator) (obj)).next();
            if (s.contains(file1))
            {
                Logger.c("Did not manage to migrate settings file: %s", new Object[] {
                    file1
                });
                return false;
            }
        }

        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static void b(Context context)
    {
        context = context.getExternalCacheDirs();
        int j1 = context.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = context[i1];
            if (file != null)
            {
                Logger.a("Cache dir=%s", new Object[] {
                    file.getAbsolutePath()
                });
            }
        }

    }

    private static boolean b(String s)
    {
        if (!s.isEmpty())
        {
            s = (new File(s)).listFiles();
            if (s == null)
            {
                Logger.a("Settingsdir not a valid directory, or is inacessible", new Object[0]);
                return false;
            }
            List list = j();
            int j1 = s.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                if (!list.contains(s[i1].getName()))
                {
                    return true;
                }
                i1++;
            }
        }
        return false;
    }

    private File e()
    {
        return new File(j.getFilesDir(), "settings");
    }

    private static boolean f()
    {
        return (new File("/sdcard/spotify2/")).isDirectory();
    }

    private boolean g()
    {
        return !dvx.e() || (new File(c.c(g))).isDirectory();
    }

    private boolean h()
    {
        return c.f(d);
    }

    private String i()
    {
        return c.a(g, Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    private static List j()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("spotifycache");
        return arraylist;
    }

    public final String a()
    {
        if (!l)
        {
            k = a(j);
            Logger.a("Using cache location %s", new Object[] {
                k
            });
            l = true;
        }
        return k;
    }

    public final String b()
    {
        return c.a(d, null);
    }

    public final String c()
    {
        return c.a(f, null);
    }

    public final String d()
    {
label0:
        {
label1:
            {
                Object obj;
                File file;
                boolean flag;
                boolean flag1;
                do
                {
                    boolean flag2 = dvx.e();
                    Object obj1;
                    if (c.f(f))
                    {
                        obj = c.c(f);
                    } else
                    {
                        if (c.f(g))
                        {
                            flag1 = g();
                        } else
                        {
                            obj = new File(i(), m.b());
                            if (((File) (obj)).isDirectory() && b(((File) (obj)).toString()))
                            {
                                flag1 = true;
                            } else
                            {
                                flag1 = false;
                            }
                        }
                        if (flag1)
                        {
                            obj = (new File(i(), m.b())).getAbsolutePath();
                        } else
                        if (f() && b("/sdcard/spotify2/"))
                        {
                            obj = "/sdcard/spotify2/";
                        } else
                        {
                            obj = "";
                        }
                    }
                } while (flag2 != dvx.e());
                if ("".equals(obj))
                {
                    file = e();
                    obj = file.getAbsolutePath();
                    flag = false;
                } else
                {
                    file = new File(((String) (obj)));
                    if (file.toString().contains(Environment.getExternalStorageDirectory().toString()) && b(file.toString()))
                    {
                        Logger.a("Will migrate settings dir in %s.", new Object[] {
                            file
                        });
                        file = e();
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
                if (file.isDirectory())
                {
                    flag1 = true;
                } else
                {
                    flag1 = file.mkdirs();
                }
                if (!flag1)
                {
                    break label0;
                }
                obj1 = obj;
                if (flag)
                {
                    if (!a(((String) (obj))))
                    {
                        break label1;
                    }
                    obj1 = file.getAbsolutePath();
                }
                c.b().a(f, ((String) (obj1))).b();
                return ((String) (obj1));
            }
            Logger.c("Failed to migrate settings directory, possibly because of full or inaccessible file system: %s", new Object[] {
                file
            });
            return ((String) (obj));
        }
        Logger.a("Failed to create settings directory, possibly because of full file system: %s", new Object[] {
            file
        });
        return ((String) (obj));
    }

}
