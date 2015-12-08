// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.gson.JsonPrimitive;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;

// Referenced classes of package com.pinterest.ui.grid:
//            PinGridCell

class dBitmap.ImageListener extends dBitmap.ImageListener
{

    final PinGridCell this$0;

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.From from)
    {
        long l = 0L;
        long l1 = SystemClock.elapsedRealtime();
        bitmap = PinGridCell.this;
        if (PinGridCell.access$100(PinGridCell.this) > 0L)
        {
            l = l1 - PinGridCell.access$100(PinGridCell.this);
        }
        PinGridCell.access$002(bitmap, l);
        bitmap = PinGridCell.this;
        boolean flag;
        if (from == com.squareup.picasso.From.a || from == com.squareup.picasso.From.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PinGridCell.access$202(bitmap, flag);
        StopWatch.get().stopSubWatch("ttrfp_tmp_log", "du_80_1st_img_loaded").putAuxData("ttrfp_tmp_log", "sts_80_1st_loaded_img_url", new JsonPrimitive(PinGridCell.access$300(PinGridCell.this)), false).putAuxData("ttrfp_tmp_log", "sts_80_1st_loaded_img_from", new JsonPrimitive(String.valueOf(from)), false);
        Events.post(new ageLoadEvent());
    }

    rom()
    {
        this$0 = PinGridCell.this;
        super();
    }
}
