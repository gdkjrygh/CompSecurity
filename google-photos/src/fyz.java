// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import java.util.Locale;

public final class fyz extends hgu
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fza();
    private double a;
    private double b;

    public fyz(Double double1, Double double2)
    {
        a = double1.doubleValue();
        b = double2.doubleValue();
    }

    public final int a()
    {
        return q.ao;
    }

    public final void a(afn afn)
    {
        afn = (fzc)afn;
        Object obj = ((fzc) (afn)).o;
        double d = a;
        double d1 = b;
        byte byte0 = 1;
        int j = (int)(float)b.x(((android.content.Context) (obj))).widthPixels;
        int i = j;
        if (j > 640)
        {
            byte0 = 2;
            i = j / 2;
        }
        obj = Uri.parse("https://maps.googleapis.com/maps/api/staticmap").buildUpon();
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("zoom", "13").appendQueryParameter("size", String.format(Locale.US, "%dx%d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(i)
        })).appendQueryParameter("scale", Integer.toString(byte0)).appendQueryParameter("format", "png").appendQueryParameter("maptype", "roadmap").appendQueryParameter("sensor", "true").appendQueryParameter("markers", String.format(Locale.US, "color:%s|%.6f,%.6f", new Object[] {
            "red", Double.valueOf(d), Double.valueOf(d1)
        }));
        obj = ((android.net.Uri.Builder) (obj)).build().toString();
        aly.c(((fzc) (afn)).o).a(obj).a(((fzc) (afn)).p);
        ((fzc) (afn)).p.setOnClickListener(new fzb(a, b));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeDouble(a);
        parcel.writeDouble(b);
    }

}
