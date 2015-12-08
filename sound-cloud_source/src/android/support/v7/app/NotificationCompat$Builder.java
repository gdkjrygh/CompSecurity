// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;

// Referenced classes of package android.support.v7.app:
//            NotificationCompat

public static class <init> extends android.support.v4.app.<init>
{

    protected android.support.v4.app.xtender getExtender()
    {
        if (android.os.pat._fld1 >= 21)
        {
            return new Extender(null);
        }
        if (android.os.pat._fld1 >= 16)
        {
            return new nExtender(null);
        }
        if (android.os.pat._fld1 >= 14)
        {
            return new SandwichExtender(null);
        } else
        {
            return super.getExtender();
        }
    }

    public xtender(Context context)
    {
        super(context);
    }
}
