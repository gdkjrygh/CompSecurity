// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;

public final class d
{
    private static final class a extends b
    {

        public final int a(Context context, String s, String s1)
        {
            return ((AppOpsManager)context.getSystemService(android/app/AppOpsManager)).noteProxyOp(s, s1);
        }

        public final String a(String s)
        {
            return AppOpsManager.permissionToOp(s);
        }

        private a()
        {
            super((byte)0);
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static class b
    {

        public int a(Context context, String s, String s1)
        {
            return 1;
        }

        public String a(String s)
        {
            return null;
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final b a;

    public static int a(Context context, String s, String s1)
    {
        return a.a(context, s, s1);
    }

    public static String a(String s)
    {
        return a.a(s);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            a = new a((byte)0);
        } else
        {
            a = new b((byte)0);
        }
    }
}
