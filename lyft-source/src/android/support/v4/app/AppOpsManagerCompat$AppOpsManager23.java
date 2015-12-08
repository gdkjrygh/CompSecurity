// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;

// Referenced classes of package android.support.v4.app:
//            AppOpsManagerCompat23

class <init> extends l
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

    private l()
    {
        super(null);
    }

    l(l l)
    {
        this();
    }
}
