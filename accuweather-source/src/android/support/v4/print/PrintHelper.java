// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;

// Referenced classes of package android.support.v4.print:
//            PrintHelperKitkat

public final class PrintHelper
{
    private static final class PrintHelperKitkatImpl
        implements PrintHelperVersionImpl
    {

        private final PrintHelperKitkat mPrintHelper;

        public int getColorMode()
        {
            return mPrintHelper.getColorMode();
        }

        public int getOrientation()
        {
            return mPrintHelper.getOrientation();
        }

        public int getScaleMode()
        {
            return mPrintHelper.getScaleMode();
        }

        public void printBitmap(String s, Bitmap bitmap)
        {
            mPrintHelper.printBitmap(s, bitmap);
        }

        public void printBitmap(String s, Uri uri)
            throws FileNotFoundException
        {
            mPrintHelper.printBitmap(s, uri);
        }

        public void setColorMode(int i)
        {
            mPrintHelper.setColorMode(i);
        }

        public void setOrientation(int i)
        {
            mPrintHelper.setOrientation(i);
        }

        public void setScaleMode(int i)
        {
            mPrintHelper.setScaleMode(i);
        }

        PrintHelperKitkatImpl(Context context)
        {
            mPrintHelper = new PrintHelperKitkat(context);
        }
    }

    private static final class PrintHelperStubImpl
        implements PrintHelperVersionImpl
    {

        int mColorMode;
        int mOrientation;
        int mScaleMode;

        public int getColorMode()
        {
            return mColorMode;
        }

        public int getOrientation()
        {
            return mOrientation;
        }

        public int getScaleMode()
        {
            return mScaleMode;
        }

        public void printBitmap(String s, Bitmap bitmap)
        {
        }

        public void printBitmap(String s, Uri uri)
        {
        }

        public void setColorMode(int i)
        {
            mColorMode = i;
        }

        public void setOrientation(int i)
        {
            mOrientation = i;
        }

        public void setScaleMode(int i)
        {
            mScaleMode = i;
        }

        private PrintHelperStubImpl()
        {
            mScaleMode = 2;
            mColorMode = 2;
            mOrientation = 1;
        }

    }

    static interface PrintHelperVersionImpl
    {

        public abstract int getColorMode();

        public abstract int getOrientation();

        public abstract int getScaleMode();

        public abstract void printBitmap(String s, Bitmap bitmap);

        public abstract void printBitmap(String s, Uri uri)
            throws FileNotFoundException;

        public abstract void setColorMode(int i);

        public abstract void setOrientation(int i);

        public abstract void setScaleMode(int i);
    }


    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    PrintHelperVersionImpl mImpl;

    public PrintHelper(Context context)
    {
        if (systemSupportsPrint())
        {
            mImpl = new PrintHelperKitkatImpl(context);
            return;
        } else
        {
            mImpl = new PrintHelperStubImpl();
            return;
        }
    }

    public static boolean systemSupportsPrint()
    {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    public int getColorMode()
    {
        return mImpl.getColorMode();
    }

    public int getOrientation()
    {
        return mImpl.getOrientation();
    }

    public int getScaleMode()
    {
        return mImpl.getScaleMode();
    }

    public void printBitmap(String s, Bitmap bitmap)
    {
        mImpl.printBitmap(s, bitmap);
    }

    public void printBitmap(String s, Uri uri)
        throws FileNotFoundException
    {
        mImpl.printBitmap(s, uri);
    }

    public void setColorMode(int i)
    {
        mImpl.setColorMode(i);
    }

    public void setOrientation(int i)
    {
        mImpl.setOrientation(i);
    }

    public void setScaleMode(int i)
    {
        mImpl.setScaleMode(i);
    }
}
