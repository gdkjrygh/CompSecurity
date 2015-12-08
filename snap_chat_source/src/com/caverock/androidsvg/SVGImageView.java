// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.caverock.androidsvg;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import cn;
import cp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SVGImageView extends ImageView
{
    final class a extends AsyncTask
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

        private a()
        {
            a = SVGImageView.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b extends AsyncTask
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

        private b()
        {
            a = SVGImageView.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c extends AsyncTask
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

        private c()
        {
            a = SVGImageView.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }


    private static Method a = null;

    public SVGImageView(Context context)
    {
        super(context);
        try
        {
            a = android/view/View.getMethod("setLayerType", new Class[] {
                Integer.TYPE, android/graphics/Paint
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public SVGImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        try
        {
            a = android/view/View.getMethod("setLayerType", new Class[] {
                Integer.TYPE, android/graphics/Paint
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        a(attributeset, 0);
    }

    public SVGImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        try
        {
            a = android/view/View.getMethod("setLayerType", new Class[] {
                Integer.TYPE, android/graphics/Paint
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        a(attributeset, i);
    }

    private void a()
    {
        if (a == null)
        {
            return;
        }
        try
        {
            int i = android/view/View.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()));
            a.invoke(this, new Object[] {
                Integer.valueOf(i), null
            });
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void a(AttributeSet attributeset, int i)
    {
        if (isInEditMode())
        {
            return;
        }
        attributeset = getContext().getTheme().obtainStyledAttributes(attributeset, cm.a.SVGImageView, i, 0);
        i = attributeset.getResourceId(cm.a.SVGImageView_svg, -1);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        setImageResource(i);
        attributeset.recycle();
        return;
        String s = attributeset.getString(cm.a.SVGImageView_svg);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        boolean flag = a(Uri.parse(s), false);
        if (flag)
        {
            attributeset.recycle();
            return;
        }
        setImageAsset(s);
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    static void a(SVGImageView svgimageview)
    {
        svgimageview.a();
    }

    private boolean a(Uri uri, boolean flag)
    {
        InputStream inputstream;
        try
        {
            inputstream = getContext().getContentResolver().openInputStream(uri);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            if (flag)
            {
                (new StringBuilder("File not found: ")).append(uri);
            }
            return false;
        }
        (new c((byte)0)).execute(new InputStream[] {
            inputstream
        });
        return true;
    }

    public void setImageAsset(String s)
    {
        (new a((byte)0)).execute(new String[] {
            s
        });
    }

    public void setImageResource(int i)
    {
        (new b((byte)0)).execute(new Integer[] {
            Integer.valueOf(i)
        });
    }

    public void setImageURI(Uri uri)
    {
        a(uri, true);
    }

    public void setSVG(cn cn1)
    {
        if (cn1 == null)
        {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        } else
        {
            a();
            setImageDrawable(new PictureDrawable(cn1.a()));
            return;
        }
    }

}
