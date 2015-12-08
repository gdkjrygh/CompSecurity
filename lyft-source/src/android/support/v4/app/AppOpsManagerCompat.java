// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;

public class AppOpsManagerCompat
{

    private static final AppOpsManagerImpl IMPL;
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_IGNORED = 1;

    public AppOpsManagerCompat()
    {
    }

    public static int noteOp(Context context, String s, int i, String s1)
    {
        return IMPL.noteOp(context, s, i, s1);
    }

    public static int noteProxyOp(Context context, String s, String s1)
    {
        return IMPL.noteProxyOp(context, s, s1);
    }

    public static String permissionToOp(String s)
    {
        return IMPL.permissionToOp(s);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            IMPL = new AppOpsManager23();
        } else
        {
            IMPL = new AppOpsManagerImpl();
        }
    }

    private class AppOpsManagerImpl
    {

        public int noteOp(Context context, String s, int i, String s1)
        {
            return 1;
        }

        public int noteProxyOp(Context context, String s, String s1)
        {
            return 1;
        }

        public String permissionToOp(String s)
        {
            return null;
        }

        private AppOpsManagerImpl()
        {
        }

    }


    private class AppOpsManager23 extends AppOpsManagerImpl
    {

        public int noteOp(Context context, String s, int i, String s1)
        {
            return AppOpsManagerCompat23.noteOp(context, s, i, s1);
        }

        public int noteProxyOp(Context context, String s, String s1)
        {
            return AppOpsManagerCompat23.noteProxyOp(context, s, s1);
        }

        public String permissionToOp(String s)
        {
            return AppOpsManagerCompat23.permissionToOp(s);
        }

        private AppOpsManager23()
        {
        }

    }

}
