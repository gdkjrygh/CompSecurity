// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// Referenced classes of package com.c.b:
//            aw, ai, bh, bg, 
//            d, a, bk, v

final class bj
{

    static final StringBuilder a = new StringBuilder();

    static int a(Resources resources, aw aw1)
    {
        if (aw1.e != 0 || aw1.d == null)
        {
            return aw1.e;
        }
        String s = aw1.d.getAuthority();
        if (s == null)
        {
            throw new FileNotFoundException((new StringBuilder("No package provided: ")).append(aw1.d).toString());
        }
        List list = aw1.d.getPathSegments();
        if (list == null || list.isEmpty())
        {
            throw new FileNotFoundException((new StringBuilder("No path segments: ")).append(aw1.d).toString());
        }
        if (list.size() == 1)
        {
            int i;
            try
            {
                i = Integer.parseInt((String)list.get(0));
            }
            // Misplaced declaration of an exception variable
            catch (Resources resources)
            {
                throw new FileNotFoundException((new StringBuilder("Last path segment is not a resource ID: ")).append(aw1.d).toString());
            }
            return i;
        }
        if (list.size() == 2)
        {
            aw1 = (String)list.get(0);
            return resources.getIdentifier((String)list.get(1), aw1, s);
        } else
        {
            throw new FileNotFoundException((new StringBuilder("More than two path segments: ")).append(aw1.d).toString());
        }
    }

    static int a(Bitmap bitmap)
    {
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            i = bitmap.getByteCount();
        } else
        {
            i = bitmap.getRowBytes() * bitmap.getHeight();
        }
        if (i < 0)
        {
            throw new IllegalStateException((new StringBuilder("Negative size: ")).append(bitmap).toString());
        } else
        {
            return i;
        }
    }

    static long a(File file)
    {
        long l;
        try
        {
            file = new StatFs(file.getAbsolutePath());
            l = file.getBlockCount();
            l = ((long)file.getBlockSize() * l) / 50L;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            l = 0x500000L;
        }
        return Math.max(Math.min(l, 0x3200000L), 0x500000L);
    }

    static Resources a(Context context, aw aw1)
    {
        if (aw1.e != 0 || aw1.d == null)
        {
            return context.getResources();
        }
        String s = aw1.d.getAuthority();
        if (s == null)
        {
            throw new FileNotFoundException((new StringBuilder("No package provided: ")).append(aw1.d).toString());
        }
        try
        {
            context = context.getPackageManager().getResourcesForApplication(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new FileNotFoundException((new StringBuilder("Unable to obtain resources for package: ")).append(aw1.d).toString());
        }
        return context;
    }

    static v a(Context context)
    {
        ai ai1;
        try
        {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            ai1 = new ai(context);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return new bh(context);
        }
        return ai1;
    }

    static Object a(Context context, String s)
    {
        return context.getSystemService(s);
    }

    static Object a(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException(s);
        } else
        {
            return obj;
        }
    }

    static String a(aw aw1)
    {
        StringBuilder stringbuilder;
        stringbuilder = a;
        int i;
        int j;
        if (aw1.f != null)
        {
            stringbuilder.ensureCapacity(aw1.f.length() + 50);
            stringbuilder.append(aw1.f);
        } else
        if (aw1.d != null)
        {
            String s = aw1.d.toString();
            stringbuilder.ensureCapacity(s.length() + 50);
            stringbuilder.append(s);
        } else
        {
            stringbuilder.ensureCapacity(50);
            stringbuilder.append(aw1.e);
        }
        stringbuilder.append('\n');
        if (aw1.m != 0.0F)
        {
            stringbuilder.append("rotation:").append(aw1.m);
            if (aw1.p)
            {
                stringbuilder.append('@').append(aw1.n).append('x').append(aw1.o);
            }
            stringbuilder.append('\n');
        }
        if (aw1.c())
        {
            stringbuilder.append("resize:").append(aw1.h).append('x').append(aw1.i);
            stringbuilder.append('\n');
        }
        if (!aw1.j) goto _L2; else goto _L1
_L1:
        stringbuilder.append("centerCrop\n");
_L4:
        if (aw1.g != null)
        {
            j = aw1.g.size();
            for (i = 0; i < j; i++)
            {
                stringbuilder.append(((bg)aw1.g.get(i)).b());
                stringbuilder.append('\n');
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        if (aw1.k)
        {
            stringbuilder.append("centerInside\n");
        }
        if (true) goto _L4; else goto _L3
_L3:
        aw1 = stringbuilder.toString();
        a.setLength(0);
        return aw1;
    }

    static String a(d d1)
    {
        return a(d1, "");
    }

    static String a(d d1, String s)
    {
        s = new StringBuilder(s);
        a a1 = d1.k;
        if (a1 != null)
        {
            s.append(a1.b.a());
        }
        d1 = d1.l;
        if (d1 != null)
        {
            int j = d1.size();
            for (int i = 0; i < j; i++)
            {
                if (i > 0 || a1 != null)
                {
                    s.append(", ");
                }
                s.append(((a)d1.get(i)).b.a());
            }

        }
        return s.toString();
    }

    static void a()
    {
        boolean flag;
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new IllegalStateException("Method call should happen from the main thread.");
        } else
        {
            return;
        }
    }

    static void a(Looper looper)
    {
        looper = new bk(looper);
        looper.sendMessageDelayed(looper.obtainMessage(), 1000L);
    }

    static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return;
        }
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return;
        }
    }

    static void a(String s, String s1, String s2)
    {
        a(s, s1, s2, "");
    }

    static void a(String s, String s1, String s2, String s3)
    {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[] {
            s, s1, s2, s3
        }));
    }

    static boolean a(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        s = s.split(" ", 2);
        if ("CACHE".equals(s[0]))
        {
            return true;
        }
        if (s.length == 1) goto _L1; else goto _L3
_L3:
        if (!"CONDITIONAL_CACHE".equals(s[0])) goto _L1; else goto _L4
_L4:
        int i = Integer.parseInt(s[1]);
        if (i == 304)
        {
            return true;
        }
          goto _L1
        s;
        return false;
    }

    static File b(Context context)
    {
        context = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!context.exists())
        {
            context.mkdirs();
        }
        return context;
    }

    static boolean b(Context context, String s)
    {
        return context.checkCallingOrSelfPermission(s) == 0;
    }

    static byte[] b(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[4096];
        do
        {
            int i = inputstream.read(abyte0);
            if (-1 != i)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                return bytearrayoutputstream.toByteArray();
            }
        } while (true);
    }

    static int c(Context context)
    {
        ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
        int i;
        int j;
        if ((context.getApplicationInfo().flags & 0x100000) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = activitymanager.getMemoryClass();
        if (i != 0 && android.os.Build.VERSION.SDK_INT >= 11)
        {
            i = activitymanager.getLargeMemoryClass();
        } else
        {
            i = j;
        }
        return (i * 0x100000) / 7;
    }

    static boolean c(InputStream inputstream)
    {
        boolean flag1 = false;
        byte abyte0[] = new byte[12];
        boolean flag = flag1;
        if (inputstream.read(abyte0, 0, 12) == 12)
        {
            flag = flag1;
            if ("RIFF".equals(new String(abyte0, 0, 4, "US-ASCII")))
            {
                flag = flag1;
                if ("WEBP".equals(new String(abyte0, 8, 4, "US-ASCII")))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    static boolean d(Context context)
    {
        boolean flag = false;
        context = context.getContentResolver();
        int i;
        try
        {
            i = android.provider.Settings.System.getInt(context, "airplane_mode_on", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (i != 0)
        {
            flag = true;
        }
        return flag;
    }

}
