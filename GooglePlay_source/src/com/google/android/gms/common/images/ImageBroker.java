// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.common.provider.SelectionArgs;
import com.google.android.gms.common.server.BaseApiaryServer;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public final class ImageBroker
{

    private static final String IMAGE_STORE_PROJECTION[] = {
        "url", "local"
    };
    private static ImageBroker sInstance;
    private final BaseApiaryServer mServer;

    private ImageBroker(Context context)
    {
        mServer = BaseApiaryServer.getPathlessServer(context.getApplicationContext());
    }

    public static ImageBroker acquireBroker$3d64b9a2(Context context)
    {
        com/google/android/gms/common/images/ImageBroker;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new ImageBroker(context);
        }
        sInstance.mServer.setNetworkClientTag(3584);
        context = sInstance;
        com/google/android/gms/common/images/ImageBroker;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static Pair getImageStoreInfo(Context context, Uri uri)
    {
        Object obj;
        Cursor cursor;
        obj = null;
        cursor = null;
        if (!"android.resource".equals(uri.getScheme())) goto _L2; else goto _L1
_L1:
        int i;
        i = 1;
        context = cursor;
_L6:
        context = Pair.create(Integer.valueOf(i), context);
_L4:
        return context;
_L2:
        cursor = context.getContentResolver().query(uri, IMAGE_STORE_PROJECTION, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        int j;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        uri = cursor.getString(0);
        j = cursor.getInt(1);
        context = uri;
        i = j;
        if (cursor != null)
        {
            cursor.close();
            context = uri;
            i = j;
        }
        continue; /* Loop/switch isn't completed */
        Log.w("ImageBroker", (new StringBuilder("No image store record found for image ID ")).append(uri).toString());
        context = obj;
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return null;
        context;
        if (cursor != null)
        {
            cursor.close();
        }
        throw context;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private byte[] loadRemoteImage(Context context, Uri uri, String s)
    {
        try
        {
            context = mServer.fetchImageBlocking(context, uri, s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("ImageBroker", (new StringBuilder("Error retrieving image at URL ")).append(s).toString());
            return null;
        }
        return context;
    }

    private void loadRemoteImageAsync(Context context, Uri uri, String s)
    {
        mServer.fetchImageNonBlocking(context, uri, s);
    }

    public final void fetchImageData(Context context, Uri uri, ArrayList arraylist)
    {
        arraylist = SelectionArgs.forObjects("url IN ", arraylist);
        arraylist = context.getContentResolver().query(uri, IMAGE_STORE_PROJECTION, arraylist.getSelection(), ((SelectionArgs) (arraylist)).mSelectionArgs, null);
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
_L1:
        String s;
        int i;
        do
        {
            if (!arraylist.moveToNext())
            {
                break MISSING_BLOCK_LABEL_94;
            }
            i = arraylist.getInt(1);
            s = arraylist.getString(0);
        } while (i == 1 || s == null);
        loadRemoteImageAsync(context, uri, s);
          goto _L1
        context;
        if (arraylist != null)
        {
            arraylist.close();
        }
        throw context;
        if (arraylist != null)
        {
            arraylist.close();
        }
        return;
    }

    public final AssetFileDescriptor loadImageFile(Context context, Uri uri)
    {
        Object obj = getImageStoreInfo(context, uri);
        if (obj == null)
        {
            return null;
        }
        int i = ((Integer)((Pair) (obj)).first).intValue();
        obj = (String)((Pair) (obj)).second;
        if (i == 0)
        {
            if (obj == null)
            {
                Log.e("ImageBroker", (new StringBuilder("No local image data and no external image URL found for image ")).append(uri).toString());
                return null;
            }
            if (loadRemoteImage(context, uri, ((String) (obj))) == null)
            {
                return null;
            }
        } else
        if (i == 2 && obj != null)
        {
            loadRemoteImageAsync(context, uri, ((String) (obj)));
        }
        try
        {
            context = context.getContentResolver().openAssetFileDescriptor(uri, "r");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("ImageBroker", (new StringBuilder("Fetched image data was not stored for image URI ")).append(uri).toString());
            return null;
        }
        return context;
    }

}
