// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hp.mss.hpprint.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import com.hp.mss.hpprint.model.asset.a;

public abstract class PrintItem
    implements Parcelable
{

    public static a e = null;
    android.print.PrintAttributes.MediaSize b;
    a c;
    a d;

    PrintItem()
    {
    }

    PrintItem(android.print.PrintAttributes.MediaSize mediasize, a a1, a a2)
    {
        c = a1;
        b = mediasize;
        d = a2;
    }

    public android.print.PrintAttributes.MediaSize a()
    {
        return b;
    }

    public abstract void a(Canvas canvas, float f, RectF rectf);

    public a b()
    {
        return c;
    }

    public a c()
    {
        return d;
    }

    public Bitmap d()
    {
        return d.a();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b.getId());
        parcel.writeInt(b.getWidthMils());
        parcel.writeInt(b.getHeightMils());
        parcel.writeValue(c);
        parcel.writeValue(d);
    }


    // Unreferenced inner class com/hp/mss/hpprint/model/PrintItem$a
    /* block-local class not found */
    class a {}

}
