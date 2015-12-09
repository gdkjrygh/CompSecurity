// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class elv extends AsyncTask
{

    private final ImageView a;
    private String b;
    private elu c;

    public elv(elu elu1, ImageView imageview, String s)
    {
        c = elu1;
        super();
        imageview.setTag(s);
        a = imageview;
        b = s;
    }

    private transient Bitmap a()
    {
        Object obj2;
        String s;
        obj2 = null;
        s = hda.a(b);
        Object obj = (HttpURLConnection)(new URL(b)).openConnection();
        Object obj1;
        try
        {
            ((HttpURLConnection) (obj)).setDoInput(true);
            ((HttpURLConnection) (obj)).connect();
            obj1 = BitmapFactory.decodeStream(((HttpURLConnection) (obj)).getInputStream());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Object obj3 = null;
            obj2 = obj;
            obj = obj3;
            continue; /* Loop/switch isn't completed */
        }
        obj2 = c;
        obj = ((elu) (obj2)).a.b(s);
        if (obj == null)
        {
            return ((Bitmap) (obj1));
        }
        if (!((elu) (obj2)).a(((Bitmap) (obj1)), ((cvr) (obj))))
        {
            break MISSING_BLOCK_LABEL_89;
        }
        ((elu) (obj2)).a.b();
        ((cvr) (obj)).a();
        return ((Bitmap) (obj1));
        ((cvr) (obj)).b();
        return ((Bitmap) (obj1));
        obj;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((cvr) (obj)).b();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return ((Bitmap) (obj1));
            }
        }
        return ((Bitmap) (obj1));
        obj1;
        obj = null;
_L2:
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
        }
        obj2 = b;
        ((IOException) (obj1)).getMessage();
        return ((Bitmap) (obj));
        IOException ioexception1;
        ioexception1;
        obj2 = obj;
        obj = obj1;
        obj1 = ioexception1;
        if (true) goto _L2; else goto _L1
_L1:
        IOException ioexception;
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Bitmap)obj;
        if (obj != null && cty.a(a.getTag(), b))
        {
            a.setImageBitmap(((Bitmap) (obj)));
        }
    }
}
