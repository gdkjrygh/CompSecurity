// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.caverock.androidsvg;

import android.content.Context;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.os.AsyncTask;
import cn;
import cp;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.caverock.androidsvg:
//            SVGImageView

final class <init> extends AsyncTask
{

    private SVGImageView a;

    private transient Picture a(String as[])
    {
        Picture picture = cn.a(a.getContext().getAssets(), as[0]).a();
        return picture;
        Object obj;
        obj;
        (new StringBuilder("Error loading file ")).append(as).append(": ").append(((cp) (obj)).getMessage());
_L2:
        return null;
        obj;
        (new StringBuilder("File not found: ")).append(as);
        continue; /* Loop/switch isn't completed */
        obj;
        (new StringBuilder("Unable to load asset file: ")).append(as);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Picture)obj;
        if (obj != null)
        {
            SVGImageView.a(a);
            a.setImageDrawable(new PictureDrawable(((Picture) (obj))));
        }
    }

    private le(SVGImageView svgimageview)
    {
        a = svgimageview;
        super();
    }

    a(SVGImageView svgimageview, byte byte0)
    {
        this(svgimageview);
    }
}
