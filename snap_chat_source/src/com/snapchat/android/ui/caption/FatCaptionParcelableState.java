// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.snapchat.android.ui.caption:
//            FatCaptionEditText, CaptionEditText

public class FatCaptionParcelableState
    implements Parcelable
{

    protected float a;
    protected float b;
    protected float c[];
    protected int d;
    protected int e;
    protected double f;
    protected double g;
    private float h;
    private float i;

    public FatCaptionParcelableState(FatCaptionEditText fatcaptionedittext)
    {
        a = fatcaptionedittext.v;
        b = fatcaptionedittext.w;
        c = (new float[] {
            ((CaptionEditText) (fatcaptionedittext)).k + (float)(fatcaptionedittext.getWidth() / 2), ((CaptionEditText) (fatcaptionedittext)).l + (float)(fatcaptionedittext.getHeight() / 2)
        });
        h = ((CaptionEditText) (fatcaptionedittext)).k;
        i = ((CaptionEditText) (fatcaptionedittext)).l;
        d = fatcaptionedittext.getWidth();
        e = fatcaptionedittext.getHeight();
        f = fatcaptionedittext.y;
        g = fatcaptionedittext.x;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeFloat(a);
        parcel.writeFloat(b);
        parcel.writeFloatArray(c);
        parcel.writeFloat(h);
        parcel.writeFloat(i);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeDouble(f);
        parcel.writeDouble(g);
    }
}
