// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.Map;
import lnz;
import lod;

public class MediaState
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lod();
    public final int a;
    public String b[];
    public int c[];
    public long d[];
    private Map e;

    public MediaState()
    {
        a = 1;
    }

    public MediaState(int i, String as[], int ai[], long al[])
    {
        a = i;
        b = as;
        c = ai;
        d = al;
        e = new HashMap();
        for (i = 0; i < as.length; i++)
        {
            e.put(as[i], new lnz(this, ai[i], al[i]));
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lod.a(this, parcel);
    }

}
