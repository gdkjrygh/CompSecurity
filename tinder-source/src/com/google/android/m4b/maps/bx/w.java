// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bi.b;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            r, ah, v

public abstract class w extends r
{
    public static interface a
    {

        public abstract void a(v v);
    }


    public a d;
    protected final ah e;

    public w(ah ah)
    {
        e = ah;
    }

    public abstract void a(List list, float f, float f1, b b, int i);

    protected final boolean a(v v)
    {
        boolean flag = j_();
        if (d != null)
        {
            d.a(v);
            flag = true;
        }
        return flag;
    }

    public final boolean m()
    {
        return true;
    }
}
