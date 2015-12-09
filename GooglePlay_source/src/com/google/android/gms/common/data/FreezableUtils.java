// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            Freezable

public final class FreezableUtils
{

    public static ArrayList freeze(ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList(arraylist.size());
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            arraylist1.add(((Freezable)arraylist.get(i)).freeze());
        }

        return arraylist1;
    }

    public static ArrayList freeze(Freezable afreezable[])
    {
        ArrayList arraylist = new ArrayList(afreezable.length);
        for (int i = 0; i < afreezable.length; i++)
        {
            arraylist.add(afreezable[i].freeze());
        }

        return arraylist;
    }
}
