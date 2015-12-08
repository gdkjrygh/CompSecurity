// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.Context;

class XWalkDevToolsServer
{
    public static final class Security extends Enum
    {

        private static final Security $VALUES[];
        public static final Security ALLOW_DEBUG_PERMISSION;
        public static final Security ALLOW_SOCKET_ACCESS;
        public static final Security DEFAULT;

        public static Security valueOf(String s)
        {
            return (Security)Enum.valueOf(org/xwalk/core/internal/XWalkDevToolsServer$Security, s);
        }

        public static Security[] values()
        {
            return (Security[])$VALUES.clone();
        }

        static 
        {
            DEFAULT = new Security("DEFAULT", 0);
            ALLOW_DEBUG_PERMISSION = new Security("ALLOW_DEBUG_PERMISSION", 1);
            ALLOW_SOCKET_ACCESS = new Security("ALLOW_SOCKET_ACCESS", 2);
            $VALUES = (new Security[] {
                DEFAULT, ALLOW_DEBUG_PERMISSION, ALLOW_SOCKET_ACCESS
            });
        }

        private Security(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String DEBUG_PERMISSION_SIFFIX = ".permission.DEBUG";
    private long mNativeDevToolsServer;
    private String mSocketName;

    public XWalkDevToolsServer(String s)
    {
        mNativeDevToolsServer = 0L;
        mSocketName = null;
        mNativeDevToolsServer = nativeInitRemoteDebugging(s);
        mSocketName = s;
    }

    private static boolean checkDebugPermission(Context context, int i, int j)
    {
        return context.checkPermission((new StringBuilder()).append(context.getPackageName()).append(".permission.DEBUG").toString(), i, j) == 0;
    }

    private native void nativeDestroyRemoteDebugging(long l);

    private native long nativeInitRemoteDebugging(String s);

    private native boolean nativeIsRemoteDebuggingEnabled(long l);

    private native void nativeSetRemoteDebuggingEnabled(long l, boolean flag, boolean flag1, boolean flag2);

    public void destroy()
    {
        nativeDestroyRemoteDebugging(mNativeDevToolsServer);
        mNativeDevToolsServer = 0L;
    }

    public String getSocketName()
    {
        return mSocketName;
    }

    public boolean isRemoteDebuggingEnabled()
    {
        return nativeIsRemoteDebuggingEnabled(mNativeDevToolsServer);
    }

    public void setRemoteDebuggingEnabled(boolean flag)
    {
        setRemoteDebuggingEnabled(flag, Security.DEFAULT);
    }

    public void setRemoteDebuggingEnabled(boolean flag, Security security)
    {
        boolean flag1;
        boolean flag2;
        if (security == Security.ALLOW_DEBUG_PERMISSION)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (security == Security.ALLOW_SOCKET_ACCESS)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        nativeSetRemoteDebuggingEnabled(mNativeDevToolsServer, flag, flag1, flag2);
    }
}
