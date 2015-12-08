// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import com.google.android.gms.internal.kn;

// Referenced classes of package com.google.android.gms.people:
//            People

public static final class 
{

    int aBH;

    public final  build()
    {
        boolean flag;
        if (aBH > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "Must provide valid client application ID!");
        return new aBH(this, null);
    }

    public final aBH setClientApplicationId(int i)
    {
        aBH = i;
        return this;
    }

    public ()
    {
    }
}
