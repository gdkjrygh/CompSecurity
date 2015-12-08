// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;

// Referenced classes of package android.support.v4.print:
//            PrintHelper, PrintHelperKitkat

private static final class printHelper
    implements 
{

    private final PrintHelperKitkat printHelper;

    public int getColorMode()
    {
        return printHelper.getColorMode();
    }

    public int getScaleMode()
    {
        return printHelper.getScaleMode();
    }

    public void printBitmap(String s, Bitmap bitmap)
    {
        printHelper.printBitmap(s, bitmap);
    }

    public void printBitmap(String s, Uri uri)
        throws FileNotFoundException
    {
        printHelper.printBitmap(s, uri);
    }

    public void setColorMode(int i)
    {
        printHelper.setColorMode(i);
    }

    public void setScaleMode(int i)
    {
        printHelper.setScaleMode(i);
    }

    (Context context)
    {
        printHelper = new PrintHelperKitkat(context);
    }
}
