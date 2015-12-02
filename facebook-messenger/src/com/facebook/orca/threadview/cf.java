// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.ui.images.base.a;
import java.util.List;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewImageAttachmentView, cc

class cf
    implements a
{

    final ThreadViewImageAttachmentView a;

    private cf(ThreadViewImageAttachmentView threadviewimageattachmentview)
    {
        a = threadviewimageattachmentview;
        super();
    }

    cf(ThreadViewImageAttachmentView threadviewimageattachmentview, cc cc)
    {
        this(threadviewimageattachmentview);
    }

    private Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectf = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        canvas.drawRoundRect(rectf, com.facebook.orca.threadview.ThreadViewImageAttachmentView.a(a), com.facebook.orca.threadview.ThreadViewImageAttachmentView.a(a), paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        paint.setColor(Color.argb(128, 0, 0, 0));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(ThreadViewImageAttachmentView.b(a));
        canvas.drawRoundRect(rectf, com.facebook.orca.threadview.ThreadViewImageAttachmentView.a(a), com.facebook.orca.threadview.ThreadViewImageAttachmentView.a(a), paint);
        return bitmap1;
    }

    public Drawable a(List list)
    {
        BitmapDrawable bitmapdrawable = new BitmapDrawable(a.getResources(), a((Bitmap)list.get(0)));
        list = new BitmapDrawable(a.getResources(), a((Bitmap)list.get(1)));
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(com.facebook.orca.threadview.ThreadViewImageAttachmentView.a(), list);
        statelistdrawable.addState(ThreadViewImageAttachmentView.b(), bitmapdrawable);
        return statelistdrawable;
    }
}
