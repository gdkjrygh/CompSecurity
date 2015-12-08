// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;

class aai extends ys
{

    protected aai(Context context)
    {
        super(context, new yv(new ComponentName("android", aai.getName())));
    }

    public static aai a(Context context, aas aas)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new aao(context, aas);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return new aan(context, aas);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new aaj(context, aas);
        } else
        {
            return new aap(context);
        }
    }

    public void a(zk zk)
    {
    }

    public void b(zk zk)
    {
    }

    public void c(zk zk)
    {
    }

    public void d(zk zk)
    {
    }
}
