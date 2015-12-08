// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.util.Util;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AvatarView extends View
{

    private static final int RADIUS_DIPS = 7;
    private static float radius;
    Bitmap avatar;

    public AvatarView(Context context, String s)
    {
        super(context);
        setBackgroundColor(0);
        radius = Util.dipsToPixelsFloat(context, 7);
        avatar = BitmapFactory.decodeStream((new URL(s)).openStream());
        if (avatar == null)
        {
            avatar = BitmapFactory.decodeResource(getResources(), com.apptentive.android.sdk.R.drawable.avatar);
        }
_L2:
        return;
        context;
        if (avatar != null) goto _L2; else goto _L1
_L1:
        avatar = BitmapFactory.decodeResource(getResources(), com.apptentive.android.sdk.R.drawable.avatar);
        return;
        context;
        Log.d("Error opening avatar from URL: \"%s\"", context, new Object[] {
            s
        });
        if (avatar != null) goto _L2; else goto _L3
_L3:
        avatar = BitmapFactory.decodeResource(getResources(), com.apptentive.android.sdk.R.drawable.avatar);
        return;
        context;
        if (avatar == null)
        {
            avatar = BitmapFactory.decodeResource(getResources(), com.apptentive.android.sdk.R.drawable.avatar);
        }
        throw context;
    }

    protected void onDraw(Canvas canvas)
    {
        int i = getWidth() + 1;
        int j = getHeight() + 1;
        Object obj = new RectF(1.0F, 1.0F, i - 1, j - 1);
        Matrix matrix = new Matrix();
        Paint paint = new Paint(1);
        paint.setColor(-256);
        Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        Bitmap bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        (new Canvas(bitmap1)).drawRoundRect(((RectF) (obj)), radius, radius, paint);
        matrix.setScale((float)i / (float)avatar.getWidth(), (float)j / (float)avatar.getHeight());
        obj = new Canvas(bitmap);
        ((Canvas) (obj)).drawBitmap(avatar, matrix, null);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        ((Canvas) (obj)).drawBitmap(bitmap1, 0.0F, 0.0F, paint);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
    }
}
