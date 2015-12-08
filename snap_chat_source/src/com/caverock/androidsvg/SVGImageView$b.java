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

// Referenced classes of package com.caverock.androidsvg:
//            SVGImageView

final class <init> extends AsyncTask
{

    private SVGImageView a;

    private transient Picture a(Integer ainteger[])
    {
        Object obj;
        try
        {
            obj = a.getContext();
            int i = ainteger[0].intValue();
            obj = cn.a(((Context) (obj)).getResources(), i).a();
        }
        catch (cp cp1)
        {
            String.format("Error loading resource 0x%x: %s", new Object[] {
                ainteger, cp1.getMessage()
            });
            return null;
        }
        return ((Picture) (obj));
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((Integer[])aobj);
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
