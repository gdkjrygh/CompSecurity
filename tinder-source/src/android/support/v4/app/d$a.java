// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;

// Referenced classes of package android.support.v4.app:
//            d

private static final class <init> extends <init>
{

    public final int a(Context context, String s, String s1)
    {
        return ((AppOpsManager)context.getSystemService(android/app/AppOpsManager)).noteProxyOp(s, s1);
    }

    public final String a(String s)
    {
        return AppOpsManager.permissionToOp(s);
    }

    private ()
    {
        super((byte)0);
    }

    <init>(byte byte0)
    {
        this();
    }
}
