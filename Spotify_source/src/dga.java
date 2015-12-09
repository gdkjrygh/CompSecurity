// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.spotify.mobile.android.util.Assertion;
import java.util.Locale;

public final class dga
{

    public static Bitmap a(Bitmap bitmap, int i, float f, int j)
    {
        Bitmap bitmap1 = Bitmap.createBitmap((int)((float)bitmap.getWidth() * f), (int)((float)bitmap.getHeight() * f), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmap1);
        canvas.scale(f, f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setAlpha(j);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
        bitmap.recycle();
        try
        {
            dfn.a(bitmap1, i);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            Assertion.a(String.format(Locale.getDefault(), "Failed bluring bitmap - r: %d, w: %d, h: %d, config: %s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(bitmap1.getWidth()), Integer.valueOf(bitmap1.getHeight()), bitmap1.getConfig().toString()
            }), bitmap);
            return bitmap1;
        }
        return bitmap1;
    }
}
