// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.b:
//            f

public static class b
{

    protected Class a;
    protected String b;

    public Enum a(Parcel parcel)
    {
        return ((Enum[])a.getEnumConstants())[parcel.readInt()];
    }

    public (Class class1)
    {
        a = class1;
        b = class1.getName();
    }
}
