// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.google.android.apps.unveil.env:
//            af, ag, Size

public class Viewport
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ag();
    private static final af e = new af();
    public int a;
    Size b;
    int c;
    Rect d;

    public Viewport(int i)
    {
        a = 0;
        a = i;
    }

    public static int a(Context context)
    {
        int k = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getOrientation();
        int j = context.getResources().getConfiguration().orientation;
        String s;
        af af1;
        int i;
        if (j != 2 && j != 1)
        {
            e.a("Current orientation is neither landscape nor portrait! Fallback as portrait", new Object[0]);
            i = 1;
        } else
        if (k == 1 || k == 3)
        {
            if (j == 2)
            {
                i = 1;
            } else
            {
                i = 2;
            }
        } else
        {
            i = j;
        }
        af1 = e;
        if (j == 2)
        {
            context = "landscape";
        } else
        {
            context = "portrait";
        }
        if (i == 2)
        {
            s = "landscape.";
        } else
        {
            s = "portrait.";
        }
        af1.a("Current orientation %s, screen rotated %d counter-clockwisely ==> natural orientation %s", new Object[] {
            context, Integer.valueOf(k * 90), s
        });
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeParcelable(d, 0);
        parcel.writeInt(c);
        parcel.writeSerializable(b);
    }

}
