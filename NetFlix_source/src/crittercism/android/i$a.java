// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

// Referenced classes of package crittercism.android:
//            i

static final class c
    implements Callable
{

    private static boolean d = false;
    private static Object f;
    private StringBuilder a;
    private StringBuilder b;
    private String c[];
    private Process e;
    private d g;
    private d h;

    public static boolean a()
    {
        return d;
    }

    public static void b()
    {
        d = true;
    }

    private StringBuilder d()
    {
        g = null;
        h = null;
        if (d)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        e = Runtime.getRuntime().exec(c);
        g = new <init>(e.getInputStream());
        h = new <init>(e.getErrorStream());
        g.start();
        h.start();
        e.waitFor();
        if (g != null)
        {
            a = g.a();
            (new StringBuilder("this.inputStreamStringBuilder.toString() = ")).append(a.toString());
        }
        if (h != null)
        {
            b = h.a();
            (new StringBuilder("this.errorStreamStringBuilder.toString() = ")).append(b.toString());
        }
        Exception exception;
        if (e != null)
        {
            try
            {
                e.getInputStream().close();
                e.getErrorStream().close();
                e.getOutputStream().close();
                e.destroy();
            }
            catch (Exception exception1) { }
        }
        return a;
        exception;
        d = true;
        if (g != null)
        {
            a = g.a();
            (new StringBuilder("this.inputStreamStringBuilder.toString() = ")).append(a.toString());
        }
        if (h != null)
        {
            b = h.a();
            (new StringBuilder("this.errorStreamStringBuilder.toString() = ")).append(b.toString());
        }
        if (e == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        e.getInputStream().close();
        e.getErrorStream().close();
        e.getOutputStream().close();
        e.destroy();
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_340;
_L2:
        break MISSING_BLOCK_LABEL_208;
        Exception exception2;
        exception2;
        if (g != null)
        {
            a = g.a();
            (new StringBuilder("this.inputStreamStringBuilder.toString() = ")).append(a.toString());
        }
        if (h != null)
        {
            b = h.a();
            (new StringBuilder("this.errorStreamStringBuilder.toString() = ")).append(b.toString());
        }
        if (e != null)
        {
            try
            {
                e.getInputStream().close();
                e.getErrorStream().close();
                e.getOutputStream().close();
                e.destroy();
            }
            catch (Exception exception3) { }
        }
        throw exception2;
    }

    public final void c()
    {
        Exception exception1;
        synchronized (f)
        {
            try
            {
                g.b();
                h.b();
                if (e != null)
                {
                    e.getInputStream().close();
                    e.getErrorStream().close();
                    e.getOutputStream().close();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception1) { }
            try
            {
                if (e != null)
                {
                    e.destroy();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception1) { }
        }
    }

    public final Object call()
    {
        return d();
    }


    public (Object obj)
    {
        a = new StringBuilder();
        b = new StringBuilder();
        e = null;
        f = obj;
        if (android.os.d.VERSION.SDK_INT >= 8)
        {
            c = new String[5];
            c[0] = "logcat";
            c[1] = "-t";
            c[2] = "100";
            c[3] = "-v";
            c[4] = "time";
            return;
        } else
        {
            c = new String[4];
            c[0] = "logcat";
            c[1] = "-d";
            c[2] = "-v";
            c[3] = "time";
            return;
        }
    }
}
