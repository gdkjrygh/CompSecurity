// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;

// Referenced classes of package android.support.v4.print:
//            PrintHelper

static interface A
{

    public abstract int getColorMode();

    public abstract int getOrientation();

    public abstract int getScaleMode();

    public abstract void printBitmap(String s, Bitmap bitmap, A a);

    public abstract void printBitmap(String s, Uri uri, A a)
        throws FileNotFoundException;

    public abstract void setColorMode(int i);

    public abstract void setOrientation(int i);

    public abstract void setScaleMode(int i);
}
