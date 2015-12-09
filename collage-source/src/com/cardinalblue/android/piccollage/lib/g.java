// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.graphics.Bitmap;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.k;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import pl.droidsonroids.gif.c;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            a

public class g
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/lib/g$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("THUMB", 0);
            b = new a("NORMAL", 1);
            c = new a("BACKGROUND", 2);
            d = new a("CAPTURING", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private final com.cardinalblue.android.piccollage.view.g a;
    private final com.cardinalblue.android.piccollage.lib.a b;
    private bolts.j.a c;
    private int d;

    public g(com.cardinalblue.android.piccollage.view.g g1)
    {
        d = -1;
        a = g1;
        b = com.cardinalblue.android.piccollage.lib.a.e.a(g1);
    }

    private Bitmap a(int i, android.graphics.Bitmap.Config config)
    {
        Bitmap bitmap = a(config);
        if (bitmap == null || Math.max(bitmap.getWidth(), bitmap.getHeight()) <= i) goto _L2; else goto _L1
_L1:
        return bitmap;
_L2:
        try
        {
            config = b.a(i, config);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            com.cardinalblue.android.piccollage.a.f.a(config);
            config = null;
        }
        if (config != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (bitmap != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            config = f.d(a.i(), i);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        if (bitmap == null)
        {
            i = 0;
        } else
        {
            i = Math.max(bitmap.getWidth(), bitmap.getHeight());
        }
        if (bitmap == null || i < com.cardinalblue.android.piccollage.controller.f.b && com.cardinalblue.android.b.a.a(config, bitmap))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        if (i != 0)
        {
            a(((Bitmap) (config)));
        }
        return config;
    }

    private Bitmap a(android.graphics.Bitmap.Config config)
    {
        Bitmap bitmap = null;
        if (e())
        {
            try
            {
                bitmap = k.a(a.k(), config);
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.Bitmap.Config config)
            {
                config.printStackTrace();
                return null;
            }
        }
        return bitmap;
    }

    static bolts.j.a a(g g1)
    {
        return g1.c;
    }

    private void a(Bitmap bitmap)
    {
        c = j.a();
        j.a(new Callable(bitmap) {

            final Bitmap a;
            final g b;

            public File a()
                throws Exception
            {
                File file;
                try
                {
                    file = k.a(a, "png");
                }
                catch (AssertionError assertionerror)
                {
                    throw new com.cardinalblue.android.piccollage.model.k.a(assertionerror);
                }
                return file;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = g.this;
                a = bitmap;
                super();
            }
        }).c(new i() {

            final g a;

            public Void a(j j1)
                throws Exception
            {
                j1 = (File)j1.e();
                if (j1 != null && j1.exists())
                {
                    g.b(a).a(j1);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = g.this;
                super();
            }
        }).a(new i() {

            final g a;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    com.cardinalblue.android.piccollage.a.f.a(new IOException("[ImageResourcer] write resource to file failed."));
                }
                bolts.j.a a1 = com.cardinalblue.android.piccollage.lib.g.a(a);
                boolean flag;
                if (!j1.c() && !j1.d())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a1.b(Boolean.valueOf(flag));
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = g.this;
                super();
            }
        });
    }

    private void a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return;
        } else
        {
            c = j.a();
            j.a(new Callable(abyte0) {

                final byte a[];
                final g b;

                public File a()
                    throws Exception
                {
                    File file = k.a("gif");
                    FileOutputStream fileoutputstream = new FileOutputStream(file);
                    com.cardinalblue.android.b.k.a(new ByteArrayInputStream(a), fileoutputstream);
                    return file;
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                b = g.this;
                a = abyte0;
                super();
            }
            }).c(new i() {

                final g a;

                public Void a(j j1)
                    throws Exception
                {
                    j1 = (File)j1.e();
                    if (j1 != null && j1.exists())
                    {
                        g.b(a).a(j1);
                    }
                    return null;
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = g.this;
                super();
            }
            }).a(new i() {

                final g a;

                public Void a(j j1)
                    throws Exception
                {
                    if (j1.d())
                    {
                        com.cardinalblue.android.piccollage.a.f.a(new IOException("[ImageResourcer] write resource to file failed."));
                    }
                    bolts.j.a a1 = com.cardinalblue.android.piccollage.lib.g.a(a);
                    boolean flag;
                    if (!j1.c() && !j1.d())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a1.b(Boolean.valueOf(flag));
                    return null;
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = g.this;
                super();
            }
            });
            return;
        }
    }

    private j b(a a1)
    {
        return j.a(new Callable(a1) {

            final a a;
            final g b;

            public Bitmap a()
                throws Exception
            {
                return b.a(a, com.cardinalblue.android.piccollage.controller.f.e);
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = g.this;
                a = a1;
                super();
            }
        }, b.c());
    }

    static com.cardinalblue.android.piccollage.view.g b(g g1)
    {
        return g1.a;
    }

    private int d()
    {
        if (d <= 0)
        {
            if (com.cardinalblue.android.b.k.r())
            {
                d = Math.min(com.cardinalblue.android.b.k.c() * 2, 1024);
            } else
            {
                d = com.cardinalblue.android.piccollage.controller.f.b;
            }
        }
        return d;
    }

    private boolean e()
    {
        Object obj;
        if (c != null)
        {
            try
            {
                c.a().g();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
            }
        }
        obj = a.k();
        if (obj == null)
        {
            return false;
        } else
        {
            return ((File) (obj)).exists();
        }
    }

    public Bitmap a(a a1, android.graphics.Bitmap.Config config)
    {
        static class _cls8
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[com.cardinalblue.android.piccollage.lib.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.lib.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.cardinalblue.android.piccollage.lib._cls8.a[a1.ordinal()])
        {
        default:
            a1 = a(config);
            if (a1 != null && Math.max(a1.getWidth(), a1.getHeight()) > 400)
            {
                return a1;
            } else
            {
                return a(com.cardinalblue.android.piccollage.controller.f.b, config);
            }

        case 1: // '\001'
            return a(150, config);

        case 2: // '\002'
            return a(1024, config);

        case 3: // '\003'
            return a(d(), config);
        }
    }

    public j a()
    {
        return b(a.b);
    }

    public j a(a a1)
    {
        return b(a1);
    }

    public c b()
    {
        if (!e()) goto _L2; else goto _L1
_L1:
        Object obj = new c(a.k());
_L8:
        if (obj != null)
        {
            return ((c) (obj));
        }
          goto _L3
        obj;
_L6:
        obj = null;
        continue; /* Loop/switch isn't completed */
_L3:
        byte abyte0[] = b.b();
        c c1 = new c(abyte0);
_L4:
        IOException ioexception;
        boolean flag;
        if (obj == null && c1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj != null)
        {
            ((c) (obj)).a();
        }
        if (flag)
        {
            a(abyte0);
        }
        return c1;
        ioexception;
        ioexception = null;
_L5:
        c1 = null;
          goto _L4
        IOException ioexception1;
        ioexception1;
          goto _L5
        obj;
        if (true) goto _L6; else goto _L2
_L2:
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean c()
    {
        return e();
    }
}
