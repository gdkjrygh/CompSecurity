// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            y, cm

public final class x
    implements SafeParcelable
{

    public static final y CREATOR = new y();
    public final String ew;
    public final boolean ex;
    public final int height;
    public final int heightPixels;
    public final int versionCode;
    public final int width;
    public final int widthPixels;

    public x()
    {
        this(1, "interstitial_mb", 0, 0, true, 0, 0);
    }

    x(int i, String s, int j, int k, boolean flag, int l, int i1)
    {
        versionCode = i;
        ew = s;
        height = j;
        heightPixels = k;
        ex = flag;
        width = l;
        widthPixels = i1;
    }

    public x(Context context, AdSize adsize)
    {
        boolean flag1 = true;
        super();
        versionCode = 1;
        ex = false;
        width = adsize.getWidth();
        height = adsize.getHeight();
        boolean flag;
        int i;
        int j;
        if (width == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (height != -2)
        {
            flag1 = false;
        }
        context = context.getResources().getDisplayMetrics();
        if (flag)
        {
            widthPixels = a(context);
            i = (int)((float)widthPixels / ((DisplayMetrics) (context)).density);
        } else
        {
            i = width;
            widthPixels = cm.a(context, width);
        }
        if (flag1)
        {
            j = c(context);
        } else
        {
            j = height;
        }
        heightPixels = cm.a(context, j);
        if (flag || flag1)
        {
            ew = (new StringBuilder()).append(i).append("x").append(j).append("_as").toString();
            return;
        } else
        {
            ew = adsize.toString();
            return;
        }
    }

    public static int a(DisplayMetrics displaymetrics)
    {
        return displaymetrics.widthPixels;
    }

    public static int b(DisplayMetrics displaymetrics)
    {
        return (int)((float)c(displaymetrics) * displaymetrics.density);
    }

    private static int c(DisplayMetrics displaymetrics)
    {
        int i = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (i <= 400)
        {
            return 32;
        }
        return i > 720 ? 90 : 50;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        y.a(this, parcel, i);
    }

}
