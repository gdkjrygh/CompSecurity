// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import com.spotify.mobile.android.porcelain.view.PorcelainCompactCardView;

public final class elz
{

    private elu a;
    private int b;

    public elz(Context context)
    {
        a = new elu(context, com/spotify/mobile/android/porcelain/view/PorcelainCompactCardView.getName(), android.graphics.Bitmap.CompressFormat.JPEG);
        Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        b = point.x / context.getResources().getInteger(0x7f0e0001);
    }

    public final void a(ImageView imageview, String s)
    {
        elu elu1 = a;
        int i = b;
        if (s != null)
        {
            android.graphics.Bitmap bitmap = elu1.a(hda.a(s), i);
            if (bitmap == null)
            {
                (new elv(elu1, imageview, s)).execute(new Void[0]);
                return;
            } else
            {
                imageview.setImageBitmap(bitmap);
                return;
            }
        } else
        {
            imageview.setTag(null);
            imageview.setImageResource(0);
            return;
        }
    }
}
