// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import lom;

public class CheckServerAuthResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lom();
    public final int a;
    public final boolean b;
    public final List c;

    public CheckServerAuthResult(int i, boolean flag, List list)
    {
        a = i;
        b = flag;
        c = list;
    }

    public CheckServerAuthResult(boolean flag, Set set)
    {
        if (set == null)
        {
            set = Collections.emptyList();
        } else
        {
            set = Collections.unmodifiableList(new ArrayList(set));
        }
        this(1, flag, ((List) (set)));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lom.a(this, parcel);
    }

}
