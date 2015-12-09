// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.porcelain.view.PorcelainCompactCardView;
import com.squareup.picasso.Picasso;

public final class ewq extends ewu
{

    public ewq(ViewGroup viewgroup)
    {
        super(viewgroup);
    }

    static Bitmap a(Bitmap bitmap)
    {
        int i = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int j = i / 2;
        Bitmap bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        Paint paint = new Paint(1);
        Rect rect = new Rect(bitmap.getWidth() / 2 - j, bitmap.getHeight() / 2 - j, bitmap.getWidth() / 2 + j, bitmap.getHeight() / 2 + j);
        canvas.drawCircle(j, j, j, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        paint.setColorFilter(new PorterDuffColorFilter(Color.argb(104, 0, 0, 0), android.graphics.PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, rect, new Rect(0, 0, i, i), paint);
        return bitmap1;
    }

    protected final void a(String s)
    {
        ((gft)dmz.a(gft)).a().a(s).a(dff.b(k, SpotifyIcon.d, 0.5F, false)).a(gft.a(j.c, new dfv() {

            private ewq a;

            public final Drawable a(Bitmap bitmap)
            {
                bitmap = ewq.a(bitmap);
                return new eww(a.k, 0x7f02007d, Bitmap.createScaledBitmap(bitmap, ((ewu) (a)).m, ((ewu) (a)).m, false));
            }

            
            {
                a = ewq.this;
                super();
            }
        }));
    }
}
