// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.net.URL;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImage

class mUri extends mUri
{

    private final Uri mUri;
    final GPUImage this$0;

    protected Bitmap decode(android.graphics.LoadImageUriTask loadimageuritask)
    {
        try
        {
            java.io.InputStream inputstream;
            if (mUri.getScheme().startsWith("http") || mUri.getScheme().startsWith("https"))
            {
                inputstream = (new URL(mUri.toString())).openStream();
            } else
            {
                inputstream = GPUImage.access$100(GPUImage.this).getContentResolver().openInputStream(mUri);
            }
            return BitmapFactory.decodeStream(inputstream, null, loadimageuritask);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.LoadImageUriTask loadimageuritask)
        {
            loadimageuritask.printStackTrace();
        }
        return null;
    }

    protected int getImageOrientation()
    {
        Cursor cursor = GPUImage.access$100(GPUImage.this).getContentResolver().query(mUri, new String[] {
            "orientation"
        }, null, null, null);
        if (cursor == null || cursor.getCount() != 1)
        {
            return 0;
        } else
        {
            cursor.moveToFirst();
            int i = cursor.getInt(0);
            cursor.close();
            return i;
        }
    }

    public stener(GPUImage gpuimage1, Uri uri)
    {
        this$0 = GPUImage.this;
        super(GPUImage.this, gpuimage1, null);
        mUri = uri;
    }
}
