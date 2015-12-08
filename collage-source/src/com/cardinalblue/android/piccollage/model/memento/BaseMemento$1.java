// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.memento;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.model.memento:
//            BaseMemento, IMemento

static final class 
    implements android.os.ator
{

    public IMemento a(Parcel parcel)
    {
        return new BaseMemento(parcel);
    }

    public IMemento[] a(int i)
    {
        return new BaseMemento[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
