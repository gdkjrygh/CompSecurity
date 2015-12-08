// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.BaseScrapModel;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeData;
import com.cardinalblue.android.piccollage.model.gson.ImageScrapModel;
import com.cardinalblue.android.piccollage.model.gson.TagModel;
import com.cardinalblue.android.piccollage.model.gson.VideoScrapModel;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            g

public class o extends g
{

    String r;
    String s;
    String t;
    String u;
    String v;
    private Bitmap w;
    private Paint x;
    private Rect y;
    private boolean z;

    public o(Context context, Bitmap bitmap, File file)
    {
        super(context, bitmap, file, 0, false);
        x = new Paint();
    }

    public o(Context context, VideoScrapModel videoscrapmodel)
        throws IllegalArgumentException
    {
        super(context, videoscrapmodel);
        x = new Paint();
        r = videoscrapmodel.getVideoModel().getTitle();
        s = videoscrapmodel.getVideoModel().getSourceUrl();
        t = videoscrapmodel.getVideoModel().getVideoThumbDefault();
        u = videoscrapmodel.getVideoModel().getVideoThumbMedium();
        v = videoscrapmodel.getVideoModel().getVideoThumbHigh();
    }

    public static o a(VideoScrapModel videoscrapmodel)
        throws IllegalArgumentException
    {
        return new o(k.a(), videoscrapmodel);
    }

    public static o c(Bitmap bitmap)
    {
        return new o(k.a(), bitmap, new File(""));
    }

    public BaseScrapModel D()
    {
        return al();
    }

    public void a(Canvas canvas)
    {
        super.a(canvas);
        if (z || a == null)
        {
            return;
        }
        if (w == null)
        {
            w = BitmapFactory.decodeResource(c.getResources(), 0x7f020135);
            y = new Rect(a.left / 2, a.top / 2, a.right / 2, a.bottom / 2);
        }
        canvas.drawBitmap(w, null, y, x);
    }

    public void a(CBYoutubeData cbyoutubedata)
    {
        b(cbyoutubedata.getSourceUrl());
        r = cbyoutubedata.getTitle();
        s = cbyoutubedata.getSourceUrl();
        t = cbyoutubedata.getVideoThumbUrlDefault();
        u = cbyoutubedata.getVideoThumbUrlMedium();
        v = cbyoutubedata.getVideoThumbUrlHigh();
    }

    public String ag()
    {
        return s;
    }

    public String ah()
    {
        return r;
    }

    public String ai()
    {
        return t;
    }

    public String aj()
    {
        return u;
    }

    public String ak()
    {
        return v;
    }

    public VideoScrapModel al()
    {
        return VideoScrapModel.newInstance(this);
    }

    public void c(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            a(TagModel.newSearchTermTag(s1));
        }
    }

    public void h(boolean flag)
    {
        z = flag;
    }

    public ImageScrapModel y()
    {
        return al();
    }
}
