// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import jp.co.cyberagent.android.gpuimage.util.FileType;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImage

class mImageFile extends mImageFile
{

    private final File mImageFile;
    final GPUImage this$0;

    protected Bitmap decode(android.graphics.oadImageFileTask oadimagefiletask)
    {
        Bitmap bitmap;
        bitmap = BitmapFactory.decodeFile(mImageFile.getAbsolutePath(), oadimagefiletask);
        oadimagefiletask = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        FileInputStream fileinputstream = new FileInputStream(mImageFile);
        Object obj;
        obj = bitmap;
        oadimagefiletask = fileinputstream;
        if (!FileType.getTypeByStream(fileinputstream).equals("gif"))
        {
            break MISSING_BLOCK_LABEL_68;
        }
        oadimagefiletask = fileinputstream;
        obj = bitmap.copy(android.graphics.ype.getTypeByStream, true);
        oadimagefiletask = fileinputstream;
        bitmap.recycle();
        FileNotFoundException filenotfoundexception;
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.oadImageFileTask oadimagefiletask)
        {
            return ((Bitmap) (obj));
        }
        oadimagefiletask = ((android.graphics.ype.getTypeByStream) (obj));
        return oadimagefiletask;
        filenotfoundexception;
        obj = null;
_L4:
        oadimagefiletask = ((android.graphics.ype.getTypeByStream) (obj));
        filenotfoundexception.printStackTrace();
        oadimagefiletask = bitmap;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.oadImageFileTask oadimagefiletask)
            {
                return bitmap;
            }
            return bitmap;
        } else
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj;
        oadimagefiletask = null;
_L2:
        if (oadimagefiletask != null)
        {
            try
            {
                oadimagefiletask.close();
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.oadImageFileTask oadimagefiletask) { }
        }
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        filenotfoundexception;
        obj = fileinputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected int getImageOrientation()
    {
        switch ((new ExifInterface(mImageFile.getAbsolutePath())).getAttributeInt("Orientation", 1))
        {
        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0;

        case 6: // '\006'
            return 90;

        case 3: // '\003'
            return 180;

        case 8: // '\b'
            return 270;
        }
    }

    public tener(GPUImage gpuimage1, File file, tener tener)
    {
        this$0 = GPUImage.this;
        super(GPUImage.this, gpuimage1, tener);
        mImageFile = file;
    }
}
