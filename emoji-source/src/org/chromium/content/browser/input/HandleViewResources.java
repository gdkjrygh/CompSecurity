// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public class HandleViewResources
{

    static final boolean $assertionsDisabled;
    private static final int CENTER_HANDLE_ATTRS[] = {
        0x10102c7
    };
    private static final int LEFT_HANDLE_ATTRS[] = {
        0x10102c5
    };
    private static final int RIGHT_HANDLE_ATTRS[] = {
        0x10102c6
    };

    public HandleViewResources()
    {
    }

    private static Bitmap getCenterHandleBitmap(Context context)
    {
        return getHandleBitmap(context, CENTER_HANDLE_ATTRS);
    }

    public static Drawable getCenterHandleDrawable(Context context)
    {
        return getHandleDrawable(context, CENTER_HANDLE_ATTRS);
    }

    private static Bitmap getHandleBitmap(Context context, int ai[])
    {
        Object obj = context.getTheme().obtainStyledAttributes(ai);
        int i = ((TypedArray) (obj)).getResourceId(((TypedArray) (obj)).getIndex(0), 0);
        Resources resources = ((TypedArray) (obj)).getResources();
        ((TypedArray) (obj)).recycle();
        obj = android.graphics.Bitmap.Config.ARGB_8888;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = ((android.graphics.Bitmap.Config) (obj));
        Bitmap bitmap1 = BitmapFactory.decodeResource(resources, i, options);
        if (bitmap1 != null)
        {
            return bitmap1;
        }
        if (resources != context.getResources())
        {
            Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), i, options);
            if (bitmap != null)
            {
                return bitmap;
            }
        }
        context = getHandleDrawable(context, ai);
        if (!$assertionsDisabled && context == null)
        {
            throw new AssertionError();
        } else
        {
            int j = context.getIntrinsicWidth();
            int k = context.getIntrinsicHeight();
            ai = Bitmap.createBitmap(j, k, ((android.graphics.Bitmap.Config) (obj)));
            obj = new Canvas(ai);
            context.setBounds(0, 0, j, k);
            context.draw(((Canvas) (obj)));
            return ai;
        }
    }

    private static Drawable getHandleDrawable(Context context, int ai[])
    {
        TypedArray typedarray = context.getTheme().obtainStyledAttributes(ai);
        Drawable drawable = typedarray.getDrawable(0);
        ai = drawable;
        if (drawable == null)
        {
            try
            {
                ai = context.getResources().getDrawable(typedarray.getResourceId(0, 0));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ai = drawable;
            }
        }
        typedarray.recycle();
        return ai;
    }

    private static Bitmap getLeftHandleBitmap(Context context)
    {
        return getHandleBitmap(context, LEFT_HANDLE_ATTRS);
    }

    public static Drawable getLeftHandleDrawable(Context context)
    {
        return getHandleDrawable(context, LEFT_HANDLE_ATTRS);
    }

    private static Bitmap getRightHandleBitmap(Context context)
    {
        return getHandleBitmap(context, RIGHT_HANDLE_ATTRS);
    }

    public static Drawable getRightHandleDrawable(Context context)
    {
        return getHandleDrawable(context, RIGHT_HANDLE_ATTRS);
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/input/HandleViewResources.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
