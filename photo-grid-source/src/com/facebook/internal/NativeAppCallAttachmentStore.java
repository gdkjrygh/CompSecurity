// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            Utility, Validate

public final class NativeAppCallAttachmentStore
{

    static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";
    private static final String TAG = com/facebook/internal/NativeAppCallAttachmentStore.getName();
    private static File attachmentsDirectory;

    private NativeAppCallAttachmentStore()
    {
    }

    public static void addAttachments(Collection collection)
    {
        if (collection != null && collection.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        if (attachmentsDirectory == null)
        {
            cleanupAllAttachments();
        }
        ensureAttachmentsDirectoryExists();
        obj = new ArrayList();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Object obj1 = (Attachment)collection.next();
            if (!((Attachment) (obj1)).isBinaryData)
            {
                continue;
            }
            File file = getAttachmentFile(((Attachment) (obj1)).callId, ((Attachment) (obj1)).attachmentName, true);
            ((List) (obj)).add(file);
            if (((Attachment) (obj1)).bitmap != null)
            {
                processAttachmentBitmap(((Attachment) (obj1)).bitmap, file);
                continue;
            }
            try
            {
                if (((Attachment) (obj1)).imageUri != null)
                {
                    processAttachmentFile(((Attachment) (obj1)).imageUri, ((Attachment) (obj1)).isContentUri, file);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Collection collection)
            {
                Log.e(TAG, (new StringBuilder("Got unexpected exception:")).append(collection).toString());
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                {
                    obj1 = (File)((Iterator) (obj)).next();
                    try
                    {
                        ((File) (obj1)).delete();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1) { }
                }

                break MISSING_BLOCK_LABEL_191;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        throw new FacebookException(collection);
    }

    public static void cleanupAllAttachments()
    {
        Utility.deleteDirectory(getAttachmentsDirectory());
    }

    public static void cleanupAttachmentsForCall(UUID uuid)
    {
        uuid = getAttachmentsDirectoryForCall(uuid, false);
        if (uuid != null)
        {
            Utility.deleteDirectory(uuid);
        }
    }

    public static Attachment createAttachment(UUID uuid, Bitmap bitmap)
    {
        Validate.notNull(uuid, "callId");
        Validate.notNull(bitmap, "attachmentBitmap");
        return new Attachment(uuid, bitmap, null, null);
    }

    public static Attachment createAttachment(UUID uuid, Uri uri)
    {
        Validate.notNull(uuid, "callId");
        Validate.notNull(uri, "attachmentUri");
        return new Attachment(uuid, null, uri, null);
    }

    static File ensureAttachmentsDirectoryExists()
    {
        File file = getAttachmentsDirectory();
        file.mkdirs();
        return file;
    }

    static File getAttachmentFile(UUID uuid, String s, boolean flag)
    {
        uuid = getAttachmentsDirectoryForCall(uuid, flag);
        if (uuid == null)
        {
            return null;
        }
        try
        {
            uuid = new File(uuid, URLEncoder.encode(s, "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            return null;
        }
        return uuid;
    }

    static File getAttachmentsDirectory()
    {
        com/facebook/internal/NativeAppCallAttachmentStore;
        JVM INSTR monitorenter ;
        File file;
        if (attachmentsDirectory == null)
        {
            attachmentsDirectory = new File(FacebookSdk.getApplicationContext().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
        }
        file = attachmentsDirectory;
        com/facebook/internal/NativeAppCallAttachmentStore;
        JVM INSTR monitorexit ;
        return file;
        Exception exception;
        exception;
        throw exception;
    }

    static File getAttachmentsDirectoryForCall(UUID uuid, boolean flag)
    {
        if (attachmentsDirectory == null)
        {
            uuid = null;
        } else
        {
            File file = new File(attachmentsDirectory, uuid.toString());
            uuid = file;
            if (flag)
            {
                uuid = file;
                if (!file.exists())
                {
                    file.mkdirs();
                    return file;
                }
            }
        }
        return uuid;
    }

    public static File openAttachment(UUID uuid, String s)
    {
        if (Utility.isNullOrEmpty(s) || uuid == null)
        {
            throw new FileNotFoundException();
        }
        try
        {
            uuid = getAttachmentFile(uuid, s, false);
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            throw new FileNotFoundException();
        }
        return uuid;
    }

    private static void processAttachmentBitmap(Bitmap bitmap, File file)
    {
        file = new FileOutputStream(file);
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, file);
        Utility.closeQuietly(file);
        return;
        bitmap;
        Utility.closeQuietly(file);
        throw bitmap;
    }

    private static void processAttachmentFile(Uri uri, boolean flag, File file)
    {
        file = new FileOutputStream(file);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        uri = new FileInputStream(uri.getPath());
_L1:
        Utility.copyAndCloseInputStream(uri, file);
        Utility.closeQuietly(file);
        return;
        uri = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri);
          goto _L1
        uri;
        Utility.closeQuietly(file);
        throw uri;
    }


    private class Attachment
    {

        private final String attachmentName;
        private final String attachmentUrl;
        private Bitmap bitmap;
        private final UUID callId;
        private Uri imageUri;
        private boolean isBinaryData;
        private boolean isContentUri;

        public final String getAttachmentUrl()
        {
            return attachmentUrl;
        }







        private Attachment(UUID uuid, Bitmap bitmap1, Uri uri)
        {
            callId = uuid;
            bitmap = bitmap1;
            imageUri = uri;
            if (uri == null)
            {
                break MISSING_BLOCK_LABEL_133;
            }
            bitmap1 = uri.getScheme();
            if (!"content".equalsIgnoreCase(bitmap1)) goto _L2; else goto _L1
_L1:
            isContentUri = true;
            isBinaryData = true;
_L5:
            if (!isBinaryData)
            {
                bitmap1 = null;
            } else
            {
                bitmap1 = UUID.randomUUID().toString();
            }
            attachmentName = bitmap1;
            if (!isBinaryData)
            {
                uuid = imageUri.toString();
            } else
            {
                uuid = FacebookContentProvider.getAttachmentUrl(FacebookSdk.getApplicationId(), uuid, attachmentName);
            }
            attachmentUrl = uuid;
            return;
_L2:
            if (!"file".equalsIgnoreCase(uri.getScheme())) goto _L4; else goto _L3
_L3:
            isBinaryData = true;
              goto _L5
_L4:
            if (Utility.isWebUri(uri)) goto _L5; else goto _L6
_L6:
            throw new FacebookException((new StringBuilder("Unsupported scheme for image Uri : ")).append(bitmap1).toString());
            if (bitmap1 != null)
            {
                isBinaryData = true;
            } else
            {
                throw new FacebookException("Cannot share a photo without a bitmap or Uri set");
            }
              goto _L5
        }

        Attachment(UUID uuid, Bitmap bitmap1, Uri uri, _cls1 _pcls1)
        {
            this(uuid, bitmap1, uri);
        }
    }

}
