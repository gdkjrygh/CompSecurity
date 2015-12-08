// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.net.Uri;

final class <init>
    implements pl
{

    int mColorMode;
    int mOrientation;
    int mScaleMode;

    public final int getColorMode()
    {
        return mColorMode;
    }

    public final int getOrientation()
    {
        return mOrientation;
    }

    public final int getScaleMode()
    {
        return mScaleMode;
    }

    public final void printBitmap(String s, Bitmap bitmap, k k)
    {
    }

    public final void printBitmap(String s, Uri uri, k k)
    {
    }

    public final void setColorMode(int i)
    {
        mColorMode = i;
    }

    public final void setOrientation(int i)
    {
        mOrientation = i;
    }

    public final void setScaleMode(int i)
    {
        mScaleMode = i;
    }

    private k()
    {
        mScaleMode = 2;
        mColorMode = 2;
        mOrientation = 1;
    }

    mOrientation(mOrientation morientation)
    {
        this();
    }
}
