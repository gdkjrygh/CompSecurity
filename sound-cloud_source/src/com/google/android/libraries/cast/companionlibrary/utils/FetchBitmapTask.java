// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class FetchBitmapTask extends AsyncTask
{

    private final int mPreferredHeight;
    private final int mPreferredWidth;

    public FetchBitmapTask()
    {
        this(0, 0);
    }

    public FetchBitmapTask(int i, int j)
    {
        mPreferredWidth = i;
        mPreferredHeight = j;
    }

    private Bitmap scaleBitmap(Bitmap bitmap)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        int k = i - mPreferredWidth;
        int l = j - mPreferredHeight;
        if (k == 0 && l == 0)
        {
            return bitmap;
        }
        float f;
        if (k > 0 || l > 0)
        {
            f = (float)mPreferredWidth / (float)i;
            f = Math.min((float)mPreferredHeight / (float)j, f);
        } else
        {
            f = (float)i / (float)mPreferredWidth;
            f = Math.min((float)j / (float)mPreferredHeight, f);
        }
        return Bitmap.createScaledBitmap(bitmap, (int)((float)i * f + 0.5F), (int)(f * (float)j + 0.5F), false);
    }

    protected transient Bitmap doInBackground(Uri auri[])
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        obj1 = null;
        obj2 = null;
        if (auri.length == 1 && auri[0] != null) goto _L2; else goto _L1
_L1:
        obj1 = null;
_L4:
        return ((Bitmap) (obj1));
_L2:
        try
        {
            auri = new URL(auri[0].toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri auri[])
        {
            return null;
        }
        auri = (HttpURLConnection)auri.openConnection();
        auri.setDoInput(true);
        obj1 = obj2;
        if (auri.getResponseCode() != 200)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj = BitmapFactory.decodeStream(new BufferedInputStream(auri.getInputStream()));
        obj1 = obj;
        if (mPreferredWidth <= 0)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj1 = obj;
        if (mPreferredHeight > 0)
        {
            obj1 = scaleBitmap(((Bitmap) (obj)));
        }
        if (auri != null)
        {
            auri.disconnect();
            return ((Bitmap) (obj1));
        } else
        {
            return ((Bitmap) (obj1));
        }
        auri;
        auri = null;
_L7:
        obj1 = auri;
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((HttpURLConnection) (obj)).disconnect();
        return auri;
        obj;
        auri = ((Uri []) (obj1));
_L6:
        if (auri != null)
        {
            auri.disconnect();
        }
        throw obj;
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        obj1 = null;
        obj = auri;
        auri = ((Uri []) (obj1));
          goto _L7
        obj1;
        obj1 = auri;
        auri = ((Uri []) (obj));
        obj = obj1;
          goto _L7
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Uri[])aobj);
    }

    public void execute(Uri uri)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[] {
                uri
            });
            return;
        } else
        {
            execute(((Object []) (new Uri[] {
                uri
            })));
            return;
        }
    }
}
