// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.badge;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.pinterest.kit.log.PLog;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.pinterest.ui.badge:
//            AppBadgeBase

public class AppBadgeGeneric extends AppBadgeBase
{

    private static final String CONTENT_ICON = "icon";
    private static final String CONTENT_ICON_TYPE = "iconType";
    private static final String CONTENT_ITEM_TYPE = "itemType";
    private static final String CONTENT_NAME = "title=?";
    private static final String CONTENT_URI = "content://com.android.launcher2.settings/favorites?notify=true";
    public static final String LAUNCHERS[] = {
        "com.android.launcher", "com.android.launcher2", "com.google.android.googlequicksearchbox"
    };
    private static final String RESOURCE_APP_NAME = "app_name";
    private static final String RESOURCE_TYPE_STRING = "string";

    public AppBadgeGeneric()
    {
    }

    private static byte[] bitmapToByteArray(Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    private static byte[] drawBadgeOnAppIcon(Context context, int i)
    {
        String s = String.valueOf(i);
        Object obj1;
        try
        {
            obj1 = drawableToBitmap(context.getPackageManager().getApplicationIcon(context.getPackageName()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            PLog.info("Could not load the app Icon pm name not found.", new Object[0]);
            return null;
        }
        if (obj1 == null)
        {
            PLog.info("Could not draw the app Icon", new Object[0]);
            return null;
        }
        if (i == 0)
        {
            return bitmapToByteArray(((Bitmap) (obj1)));
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        Object obj = ((Bitmap) (obj1)).getConfig();
        context = ((Context) (obj));
        if (obj == null)
        {
            context = android.graphics.Bitmap.Config.ARGB_8888;
        }
        context = ((Bitmap) (obj1)).copy(context, true);
        float f = context.getWidth();
        float f1 = context.getHeight();
        float f3;
        float f4;
        Rect rect;
        if (f <= f1)
        {
            f = f1;
        }
        f3 = f / 4F;
        f4 = (float)context.getWidth() - f3;
        obj = new Canvas(context);
        obj1 = new Paint(1);
        ((Paint) (obj1)).setColor(-1);
        ((Canvas) (obj)).drawCircle(f4, f3, f3, ((Paint) (obj1)));
        ((Paint) (obj1)).setColor(0xffff0000);
        ((Canvas) (obj)).drawCircle(f4, f3, (6F * f3) / 7F, ((Paint) (obj1)));
        ((Paint) (obj1)).setColor(-1);
        i = (int)((double)f3 * 0.69999999999999996D);
        if (s.length() > 1)
        {
            i = (int)((double)f3 * 0.5D);
        }
        ((Paint) (obj1)).setTextSize((int)((float)i * f2));
        ((Paint) (obj1)).setFakeBoldText(true);
        rect = new Rect();
        ((Paint) (obj1)).getTextBounds(s, 0, s.length(), rect);
        f1 = rect.width() / 2;
        f = f1;
        if (s.endsWith("1"))
        {
            f = (float)((double)f1 * 1.25D);
        }
        ((Canvas) (obj)).drawText(s, f4 - f, f3 + (float)(rect.height() / 2), ((Paint) (obj1)));
        return bitmapToByteArray(context);
    }

    private static Bitmap drawableToBitmap(Drawable drawable)
    {
        int i = drawable.getIntrinsicWidth();
        int j = drawable.getIntrinsicHeight();
        Object obj;
        Canvas canvas;
        if (drawable.getOpacity() != -1)
        {
            obj = android.graphics.Bitmap.Config.ARGB_8888;
        } else
        {
            obj = android.graphics.Bitmap.Config.RGB_565;
        }
        obj = Bitmap.createBitmap(i, j, ((android.graphics.Bitmap.Config) (obj)));
        canvas = new Canvas(((Bitmap) (obj)));
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return ((Bitmap) (obj));
    }

    public void updateBadge(Context context, int i)
    {
        byte abyte0[] = drawBadgeOnAppIcon(context, i);
        Object obj = context.getResources();
        obj = ((Resources) (obj)).getText(((Resources) (obj)).getIdentifier("app_name", "string", getPackageName(context))).toString();
        Uri uri = Uri.parse("content://com.android.launcher2.settings/favorites?notify=true");
        context = context.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("iconType", Integer.valueOf(1));
        contentvalues.put("itemType", Integer.valueOf(1));
        contentvalues.put("icon", abyte0);
        context.update(uri, contentvalues, "title=?", new String[] {
            obj
        });
    }

}
