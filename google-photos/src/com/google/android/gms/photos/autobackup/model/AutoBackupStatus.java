// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kct;
import lob;

public class AutoBackupStatus
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lob();
    public final int a;
    public int b;
    public String c;
    public String d;
    public float e;
    public int f;
    public int g;
    public int h;
    public String i[];
    public String j;

    public AutoBackupStatus()
    {
        a = 1;
    }

    public AutoBackupStatus(int k, int l, String s, String s1, float f1, int i1, int j1, 
            int k1, String as[], String s2)
    {
        a = k;
        b = l;
        c = s;
        d = s1;
        e = f1;
        f = i1;
        g = j1;
        h = k1;
        i = as;
        j = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return c.b(this).a("accountName", c).a("autoBackupState", Integer.valueOf(b)).a("currentItem", d).a("currentItemProgress", Float.valueOf(e)).a("numCompleted", Integer.valueOf(f)).a("numPending", Integer.valueOf(g)).a("numFailed", Integer.valueOf(h)).a("failedItems", i).a("enabledAccountName", j).toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        lob.a(this, parcel);
    }

}
