// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.caverock.androidsvg;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.os.AsyncTask;
import cn;
import cp;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.caverock.androidsvg:
//            SVGImageView

final class <init> extends AsyncTask
{

    private SVGImageView a;

    private static transient Picture a(InputStream ainputstream[])
    {
        Object obj = cn.a(ainputstream[0]).a();
        try
        {
            ainputstream[0].close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream ainputstream[])
        {
            return ((Picture) (obj));
        }
        return ((Picture) (obj));
        obj;
        (new StringBuilder("Parse error loading URI: ")).append(((cp) (obj)).getMessage());
        try
        {
            ainputstream[0].close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream ainputstream[]) { }
        return null;
        obj;
        try
        {
            ainputstream[0].close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream ainputstream[]) { }
        throw obj;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((InputStream[])aobj);
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
