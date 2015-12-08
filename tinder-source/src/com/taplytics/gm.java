// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import java.io.ByteArrayOutputStream;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, shrike, bd, gs

public final class gm
{

    private static Bitmap a(Drawable drawable)
    {
        boolean flag = true;
        if (drawable instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        if (drawable.getBounds().isEmpty()) goto _L2; else goto _L1
_L1:
        int i = drawable.getBounds().width();
_L6:
        if (drawable.getBounds().isEmpty()) goto _L4; else goto _L3
_L3:
        int j = drawable.getBounds().height();
          goto _L5
_L7:
        Bitmap bitmap;
        int k;
        try
        {
            bitmap = Bitmap.createBitmap(k, i, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            return null;
        }
        return bitmap;
_L2:
        i = drawable.getIntrinsicWidth();
          goto _L6
_L4:
        j = drawable.getIntrinsicHeight();
          goto _L5
_L9:
        i = j;
          goto _L7
_L5:
        k = i;
        if (i <= 0)
        {
            k = 1;
        }
        if (j > 0) goto _L9; else goto _L8
_L8:
        i = ((flag) ? 1 : 0);
          goto _L7
    }

    public static File a(Object obj)
    {
        float f;
        String s;
        Object obj2;
        Object obj3;
        int j;
        Object obj1;
        JSONArray jsonarray;
        shrike shrike1;
        JSONArray jsonarray1;
        int i;
        try
        {
            jsonarray = (JSONArray)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b("error retriving file: ", ((Exception) (obj)));
            return new File("sofuh28yr2jkjdkjadal");
        }
        obj = "";
        f = ci.b().u.getResources().getDisplayMetrics().density;
        if ((double)f >= 0.75D)
        {
            obj = "ldpi";
        } else
        if (f == 1.0F)
        {
            obj = "mdpi";
        } else
        if (f > 1.0F && (double)f < 1.5D)
        {
            obj = "tvdpi";
        } else
        if ((double)f == 1.5D)
        {
            obj = "hdpi";
        } else
        if (f == 2.0F)
        {
            obj = "xhdpi";
        } else
        if (f == 3F)
        {
            obj = "xxhdpi";
        } else
        if (f == 4F)
        {
            obj = "xxxhdpi";
        }
        shrike1 = shrike.valueOf(((String) (obj)));
        obj1 = null;
        s = "";
        obj = "";
        i = 0;
_L7:
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_367;
        }
        obj3 = ci.b().t.g.optJSONObject(((JSONObject)jsonarray.get(i)).optString("image_id"));
        jsonarray1 = ((JSONObject) (obj3)).optJSONArray("deviceTags");
        j = 0;
_L12:
        if (j >= jsonarray1.length()) goto _L2; else goto _L1
_L1:
        obj2 = shrike.valueOf(jsonarray1.optString(j));
        if (!((shrike) (obj2)).equals(shrike1)) goto _L4; else goto _L3
_L3:
        obj = ((JSONObject) (obj3)).optString("filename");
_L2:
        obj2 = s;
        obj3 = obj;
        if (!((String) (obj)).equals("")) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        if (obj1 != null) goto _L9; else goto _L8
_L8:
        s = ((JSONObject) (obj3)).optString("filename");
        obj1 = obj2;
          goto _L10
_L9:
        if (((shrike) (obj2)).ordinal() <= ((shrike) (obj1)).ordinal()) goto _L10; else goto _L11
_L11:
        s = ((JSONObject) (obj3)).optString("filename");
        obj1 = obj2;
          goto _L10
_L6:
        obj = obj3;
        if (((String) (obj3)).equals(""))
        {
            obj = obj2;
        }
        obj = new File(ci.b().u.getFilesDir(), ((String) (obj)));
        return ((File) (obj));
_L10:
        j++;
          goto _L12
        obj2 = s;
        obj3 = obj;
          goto _L6
    }

    public static byte[] a()
    {
        Object obj = null;
        byte abyte0[];
        Object obj1;
        ByteArrayOutputStream bytearrayoutputstream;
        try
        {
            obj1 = b();
        }
        catch (Exception exception)
        {
            return null;
        }
        abyte0 = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj1 = a(((Drawable) (obj1)));
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        ((Bitmap) (obj1)).compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
        abyte0 = bytearrayoutputstream.toByteArray();
        return abyte0;
    }

    private static Drawable b()
    {
        Object obj;
        obj = ci.b().u.getPackageManager();
        obj = ci.b().u.getApplicationInfo().loadIcon(((android.content.pm.PackageManager) (obj)));
        if (obj != null)
        {
            return ((Drawable) (obj));
        }
        break MISSING_BLOCK_LABEL_36;
        Exception exception;
        exception;
        gs.c("problem getting app icon");
        return null;
    }
}
