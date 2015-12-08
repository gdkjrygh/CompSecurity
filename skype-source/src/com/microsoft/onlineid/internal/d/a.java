// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.http.HttpResponseCache;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.microsoft.onlineid.b.c;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.transport.TransportFactory;
import com.microsoft.onlineid.sts.b;
import com.microsoft.onlineid.sts.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public final class a extends AsyncTask
{

    private final b a;
    private final ImageView b;
    private final com.microsoft.onlineid.internal.transport.b c;
    private final n d;
    private final Context e;
    private final String f;
    private boolean g;

    public a(Context context, b b1, ImageView imageview)
    {
        e = context;
        a = b1;
        c = (new TransportFactory(context)).createTransport();
        d = new n(context);
        b = imageview;
        f = (new StringBuilder()).append(a.b()).append(".png").toString();
        g = false;
    }

    private transient Bitmap a()
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj6;
        Object obj7;
        obj6 = null;
        obj7 = null;
        obj4 = null;
        obj2 = obj4;
        obj3 = obj6;
        obj = obj7;
        String s = a.d();
        obj2 = obj4;
        obj3 = obj6;
        obj = obj7;
        Object obj1;
        if (d.b().equals(com.microsoft.onlineid.sts.n.d.a.a()))
        {
            obj1 = "live.com";
        } else
        {
            obj1 = "live-int.com";
        }
        obj2 = obj4;
        obj3 = obj6;
        obj = obj7;
        obj1 = String.format("https://cid-%1$s.users.storage.%2$s/users/0x%1$s/myprofile/expressionprofile/profilephoto:UserTileStatic", new Object[] {
            s, obj1
        });
        obj2 = obj4;
        obj3 = obj6;
        obj = obj7;
        c.b(new URL(((String) (obj1))));
        obj2 = obj4;
        obj3 = obj6;
        obj = obj7;
        c.f();
        obj2 = obj4;
        obj3 = obj6;
        obj = obj7;
        obj1 = c.a();
        obj2 = obj1;
        obj3 = obj1;
        obj = obj1;
        obj6 = BitmapFactory.decodeStream(((InputStream) (obj1)));
        if (obj6 == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        obj4 = e.openFileOutput(f, 0);
        obj = obj4;
        ((Bitmap) (obj6)).compress(android.graphics.Bitmap.CompressFormat.PNG, 100, ((java.io.OutputStream) (obj4)));
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        obj2 = obj1;
        obj3 = obj1;
        obj = obj1;
        ((FileOutputStream) (obj4)).close();
_L1:
        obj2 = obj1;
        obj3 = obj1;
        obj = obj1;
        g = true;
        Object obj5;
        c.e();
        FileNotFoundException filenotfoundexception;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.microsoft.onlineid.internal.c.d.c("Error closing response stream.", ((Throwable) (obj)));
                return ((Bitmap) (obj6));
            }
        }
_L3:
        return ((Bitmap) (obj6));
        obj4;
        obj2 = obj1;
        obj3 = obj1;
        obj = obj1;
        com.microsoft.onlineid.internal.c.d.c("Error closing file output stream.", ((Throwable) (obj4)));
          goto _L1
        obj1;
        obj = obj2;
        com.microsoft.onlineid.internal.c.d.c("Error downloading image from url.", ((Throwable) (obj1)));
        c.e();
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.microsoft.onlineid.internal.c.d.c("Error closing response stream.", ((Throwable) (obj)));
            }
        }
        return null;
        filenotfoundexception;
        obj4 = null;
_L6:
        obj = obj4;
        com.microsoft.onlineid.internal.c.d.c("Error saving user tile image.", filenotfoundexception);
        if (obj4 == null) goto _L1; else goto _L2
_L2:
        filenotfoundexception = ((FileNotFoundException) (obj1));
        obj3 = obj1;
        obj = obj1;
        ((FileOutputStream) (obj4)).close();
          goto _L1
        obj5;
        filenotfoundexception = ((FileNotFoundException) (obj1));
        obj3 = obj1;
        obj = obj1;
        com.microsoft.onlineid.internal.c.d.c("Error closing file output stream.", ((Throwable) (obj5)));
          goto _L1
        obj1;
        obj = obj3;
        com.microsoft.onlineid.internal.c.d.c("Error downloading image from url.", ((Throwable) (obj1)));
        c.e();
        if (obj3 != null)
        {
            try
            {
                ((InputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.microsoft.onlineid.internal.c.d.c("Error closing response stream.", ((Throwable) (obj)));
            }
        }
        break MISSING_BLOCK_LABEL_293;
        obj5;
        obj6 = null;
_L5:
        if (obj6 == null)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        filenotfoundexception = ((FileNotFoundException) (obj1));
        obj3 = obj1;
        obj = obj1;
        ((FileOutputStream) (obj6)).close();
_L4:
        filenotfoundexception = ((FileNotFoundException) (obj1));
        obj3 = obj1;
        obj = obj1;
        throw obj5;
        obj1;
        c.e();
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.microsoft.onlineid.internal.c.d.c("Error closing response stream.", ((Throwable) (obj)));
            }
        }
        throw obj1;
        obj6;
        filenotfoundexception = ((FileNotFoundException) (obj1));
        obj3 = obj1;
        obj = obj1;
        com.microsoft.onlineid.internal.c.d.c("Error closing file output stream.", ((Throwable) (obj6)));
        if (true) goto _L4; else goto _L3
        obj5;
        obj6 = obj;
          goto _L5
        filenotfoundexception;
          goto _L6
    }

    private Bitmap b()
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = null;
        FileInputStream fileinputstream = e.openFileInput(f);
        obj = fileinputstream;
        obj1 = fileinputstream;
        Bitmap bitmap = BitmapFactory.decodeStream(fileinputstream);
        obj = bitmap;
        obj1 = obj;
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            catch (IOException ioexception1)
            {
                com.microsoft.onlineid.internal.c.d.c("Error closing file input stream.", ioexception1);
                return ((Bitmap) (obj));
            }
            obj1 = obj;
        }
_L2:
        return ((Bitmap) (obj1));
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        obj1 = obj2;
        if (obj == null) goto _L2; else goto _L1
_L1:
        try
        {
            ((FileInputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            com.microsoft.onlineid.internal.c.d.c("Error closing file input stream.", ioexception);
            return null;
        }
        return null;
        Exception exception;
        exception;
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            catch (IOException ioexception2)
            {
                com.microsoft.onlineid.internal.c.d.c("Error closing file input stream.", ioexception2);
            }
        }
        throw exception;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        Bitmap bitmap = (Bitmap)obj;
        if (bitmap != null)
        {
            obj = HttpResponseCache.getInstalled();
            if (obj != null)
            {
                if (((HttpResponseCache) (obj)).getHitCount() == 0)
                {
                    obj = "from network";
                } else
                {
                    obj = "from cache";
                }
                com.microsoft.onlineid.a.a.a().a("Performance", "Load profile image", ((String) (obj)));
            }
            b.setImageBitmap(bitmap);
        } else
        {
            obj = e.getFileStreamPath(f);
            if (((File) (obj)).exists() && g)
            {
                com.microsoft.onlineid.a.a.a().a("Performance", "Load profile image", "deleted");
                ((File) (obj)).delete();
                b.setImageDrawable(e.getResources().getDrawable(e.getResources().getIdentifier("msa_default_user_tile", "drawable", e.getPackageName())));
                return;
            }
        }
    }

    protected final void onPreExecute()
    {
        Bitmap bitmap = b();
        if (bitmap != null)
        {
            b.setImageBitmap(bitmap);
        }
    }
}
