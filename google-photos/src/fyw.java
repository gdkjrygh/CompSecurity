// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

public final class fyw extends hgu
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fyx();
    private String a;
    private String b;
    private int c;

    public fyw(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readInt();
    }

    public fyw(String s, String s1, int i)
    {
        a = s;
        b = s1;
        c = i;
    }

    public final int a()
    {
        return q.an;
    }

    public final void a(afn afn)
    {
        afn = (fyy)afn;
        if (c != 0)
        {
            ((fyy) (afn)).o.setImageResource(c);
        }
        ((fyy) (afn)).p.setText(a);
        ((fyy) (afn)).q.setText(b);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeInt(c);
    }

}
