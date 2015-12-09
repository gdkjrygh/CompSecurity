// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.io.InterruptedIOException;

// Referenced classes of package p.bs:
//            a, b

public class p.bs.c
{
    public static class a extends Exception
    {

        public a()
        {
        }
    }

    public static class b extends Exception
    {

        private final String a;

        public String a()
        {
            return a;
        }

        public b(String s)
        {
            a = s;
        }
    }

    public static class c extends Exception
    {

        private final long a;

        public c(long l)
        {
            a = l;
        }
    }

    public static class d extends Exception
    {

        public d()
        {
        }
    }


    static boolean a;
    private static final Intent b = (new Intent("com.google.android.now.NOW_AUTH_SERVICE")).setPackage("com.google.android.googlequicksearchbox");

    public static String a(Context context, String s)
        throws IOException, d, c, b, a
    {
        p.bs.a a1;
        a();
        a1 = new p.bs.a();
        if (!context.bindService(b, a1, 1)) goto _L2; else goto _L1
_L1:
        s = p.bs.b.a.a(a1.a()).a(s, context.getPackageName());
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        throw new IOException("Unexpected response from Google Now app");
        s;
        throw new IOException("Call to Google Now app failed", s);
        s;
        a1.a(context);
        throw s;
        if (!s.containsKey("error")) goto _L4; else goto _L3
_L3:
        int i = s.getInt("error");
        i;
        JVM INSTR tableswitch 0 3: default 268
    //                   0 200
    //                   1 208
    //                   2 222
    //                   3 236;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        Log.e("NowAuthService", (new StringBuilder(26)).append("Unknown error: ").append(i).toString());
        throw new IOException((new StringBuilder(49)).append("Unexpected error from Google Now app: ").append(i).toString());
        s;
        Log.w("NowAuthService", "Interrupted", s);
        throw new InterruptedIOException("Interrupted while contacting Google Now app");
_L6:
        throw new d();
_L7:
        throw new c(s.getLong("next-retry-timestamp-millis"));
_L8:
        throw new b(s.getString("access-token"));
_L9:
        throw new a();
_L4:
        s = s.getString("auth-code");
        a1.a(context);
        return s;
_L2:
        throw new IOException("Failed to contact Google Now app");
    }

    private static void a()
    {
        if (Looper.myLooper() == Looper.getMainLooper() && !a)
        {
            throw new IllegalStateException("Cannot call this API from the main thread");
        } else
        {
            return;
        }
    }

}
