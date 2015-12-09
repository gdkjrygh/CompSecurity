// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import ly.kite.util.IImageConsumer;
import ly.kite.util.IImageTransformer;
import ly.kite.util.ImageAgent;

// Referenced classes of package ly.kite.catalogue:
//            Asset

public class AssetHelper
{

    public static final String IMAGE_CLASS_STRING_ASSET = "asset";
    private static final String LOG_TAG = "AssetHelper";
    private static final int READ_BUFFER_SIZE_IN_BYTES = 8192;

    public AssetHelper()
    {
    }

    public static void clearCachedImages(Context context)
    {
        context = new File(ImageAgent.getInstance(context).getImageDirectoryPath("asset"));
        if (context.listFiles() != null)
        {
            context = context.listFiles();
            int j = context.length;
            for (int i = 0; i < j; i++)
            {
                context[i].delete();
            }

        }
    }

    public static Asset createAsCachedFile(Context context, Bitmap bitmap)
    {
        FileOutputStream fileoutputstream1;
        fileoutputstream1 = null;
        context = ImageAgent.getInstance(context).getImageDirectoryAndFilePath("asset", UUID.randomUUID().toString());
        (new File((String)((Pair) (context)).first)).mkdirs();
        FileOutputStream fileoutputstream;
        String s;
        s = (new StringBuilder()).append((String)((Pair) (context)).second).append(Asset.MIMEType.JPEG.primaryFileSuffix()).toString();
        fileoutputstream = new FileOutputStream(s);
        Context context1;
        try
        {
            context = new BufferedOutputStream(fileoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            context = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            bitmap = fileoutputstream1;
            continue; /* Loop/switch isn't completed */
        }
        context1 = context;
        fileoutputstream1 = fileoutputstream;
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, context);
        context1 = context;
        fileoutputstream1 = fileoutputstream;
        bitmap = new Asset(s);
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return bitmap;
            }
        }
        return bitmap;
        bitmap;
        context = null;
        fileoutputstream = null;
_L4:
        context1 = context;
        fileoutputstream1 = fileoutputstream;
        Log.e("AssetHelper", "Unable to encode bitmap to JPEG", bitmap);
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return null;
        context;
        fileoutputstream = null;
        bitmap = fileoutputstream1;
_L2:
        if (bitmap != null)
        {
            try
            {
                bitmap.close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap) { }
        }
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap) { }
        }
        throw context;
        context;
        bitmap = context1;
        fileoutputstream = fileoutputstream1;
        if (true) goto _L2; else goto _L1
        bitmap;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Asset createAsCachedFile(Context context, byte abyte0[], Asset.MIMEType mimetype)
    {
        context = ImageAgent.getInstance(context).getImageDirectoryAndFilePath("asset", UUID.randomUUID().toString());
        (new File((String)((Pair) (context)).first)).mkdirs();
        return createAsCachedFile(abyte0, (new StringBuilder()).append((String)((Pair) (context)).second).append(mimetype.primaryFileSuffix()).toString());
    }

    public static Asset createAsCachedFile(byte abyte0[], String s)
    {
        Object obj = new FileOutputStream(s);
        ((FileOutputStream) (obj)).write(abyte0);
        abyte0 = new Asset(s);
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return abyte0;
            }
        }
        return abyte0;
        abyte0;
        abyte0 = null;
_L4:
        Log.e("AssetHelper", "Unable to write bitmap to file");
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                abyte0.printStackTrace();
            }
        }
        return null;
        abyte0;
        s = null;
_L2:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw abyte0;
        abyte0;
        s = ((String) (obj));
        continue; /* Loop/switch isn't completed */
        obj;
        s = abyte0;
        abyte0 = ((byte []) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        abyte0 = ((byte []) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Object getBytes(BufferedInputStream bufferedinputstream)
        throws Exception
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(bufferedinputstream.available());
        byte abyte0[] = new byte[8192];
        do
        {
            int i = bufferedinputstream.read(abyte0);
            if (i >= 0)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                return bytearrayoutputstream.toByteArray();
            }
        } while (true);
    }

    public static Asset.MIMEType getMimeType(Context context, Asset asset)
    {
        Asset.Type type = asset.getType();
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1..SwitchMap.ly.kite.catalogue.Asset.Type[type.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid asset type: ").append(type).toString());

        case 3: // '\003'
            context = context.getContentResolver();
            MimeTypeMap.getSingleton();
            return Asset.MIMEType.fromString(context.getType(asset.getImageURI()));

        case 4: // '\004'
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(context.getResources(), asset.getBitmapResourceId(), options);
            if (options.outMimeType != null)
            {
                return Asset.MIMEType.fromString(options.outMimeType);
            } else
            {
                return Asset.MIMEType.JPEG;
            }

        case 1: // '\001'
            return Asset.MIMEType.JPEG;

        case 2: // '\002'
            return asset.getMIMEType();

        case 5: // '\005'
            context = asset.getImageFilePath().toLowerCase();
            if (context.endsWith(".jpg") || context.endsWith(".jpeg"))
            {
                return Asset.MIMEType.JPEG;
            }
            if (context.endsWith(".png"))
            {
                return Asset.MIMEType.PNG;
            } else
            {
                throw new IllegalStateException("Currently only JPEG & PNG assets are supported");
            }

        case 6: // '\006'
            return asset.getMIMEType();
        }
    }

    public static Asset parcelableAsset(Context context, Asset asset)
    {
        Asset.Type type = asset.getType();
        if (type.isParcelable())
        {
            return asset;
        }
        switch (_cls1..SwitchMap.ly.kite.catalogue.Asset.Type[type.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unable to create parcelable asset from type: ").append(type).toString());

        case 1: // '\001'
            return createAsCachedFile(context, asset.getBitmap());

        case 2: // '\002'
            return createAsCachedFile(context, asset.getImageBytes(), asset.getMIMEType());
        }
    }

    public static void requestImage(Context context, Asset asset, IImageConsumer iimageconsumer)
    {
        requestImage(context, asset, null, 0, iimageconsumer);
    }

    public static void requestImage(Context context, Asset asset, IImageTransformer iimagetransformer, int i, IImageConsumer iimageconsumer)
    {
        switch (_cls1..SwitchMap.ly.kite.catalogue.Asset.Type[asset.getType().ordinal()])
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Cannot get image from unknown asset type: ").append(asset.getType()).toString());

        case 5: // '\005'
            File file = new File(asset.getImageFilePath());
            ImageAgent.getInstance(context).requestImage(asset, file, iimagetransformer, i, iimageconsumer);
            return;

        case 4: // '\004'
            ImageAgent.getInstance(context).requestImage(asset, asset.getBitmapResourceId(), iimagetransformer, i, iimageconsumer);
            return;

        case 3: // '\003'
            ImageAgent.getInstance(context).requestImage(asset, asset.getImageURI(), iimagetransformer, i, iimageconsumer);
            return;

        case 6: // '\006'
            ImageAgent.getInstance(context).requestImage("asset", asset, asset.getRemoteURL(), iimagetransformer, i, iimageconsumer);
            return;

        case 1: // '\001'
            ImageAgent.getInstance(context).requestImage(asset, asset.getBitmap(), iimagetransformer, i, iimageconsumer);
            return;

        case 2: // '\002'
            ImageAgent.getInstance(context).requestImage(asset, asset.getImageBytes(), iimagetransformer, i, iimageconsumer);
            return;
        }
    }

    public static void requestImageBytes(Context context, Asset asset, IImageBytesConsumer iimagebytesconsumer)
    {
    /* block-local class not found */
    class BitmapToBytesConvertorTask {}

        switch (_cls1..SwitchMap.ly.kite.catalogue.Asset.Type[asset.getType().ordinal()])
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Cannot get image bytes from unknown asset type: ").append(asset.getType()).toString());

        case 1: // '\001'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
    /* block-local class not found */
    class GetBytesTask {}

            (new GetBytesTask(context, asset, iimagebytesconsumer)).execute(new Void[0]);
            return;

        case 2: // '\002'
    /* block-local class not found */
    class IImageBytesConsumer {}

            iimagebytesconsumer.onAssetBytes(asset, asset.getImageBytes());
            return;

        case 6: // '\006'
            iimagebytesconsumer = new BitmapToBytesConvertorTask(asset, iimagebytesconsumer);
            break;
        }
        ImageAgent.getInstance(context).requestImage("asset", asset, asset.getRemoteURL(), iimagebytesconsumer);
    }

    public static ArrayList toParcelableList(Context context, ArrayList arraylist)
    {
        for (int i = 0; i < arraylist.size(); i++)
        {
            Asset asset = (Asset)arraylist.get(i);
            if (!asset.getType().isParcelable())
            {
                arraylist.set(i, parcelableAsset(context, asset));
            }
        }

        return arraylist;
    }

    public static Bitmap transformBitmap(Bitmap bitmap, IImageTransformer iimagetransformer)
    {
        if (iimagetransformer == null)
        {
            return bitmap;
        } else
        {
            return iimagetransformer.getTransformedBitmap(bitmap);
        }
    }

}
