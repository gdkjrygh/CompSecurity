// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.app.ChangePictureDialogFragment;
import com.skype.android.app.transfer.PathRetriever;
import com.skype.android.config.FileUtil;
import com.skype.android.util.ImageCache;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ChangeAvatarDialog extends ChangePictureDialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    private static final int BITMAP_SIZE_LIMIT = Math.max(256, 256) * 2;
    private static final int HIGH_RES_PHOTO_SIZE_X = 256;
    private static final int HIGH_RES_PHOTO_SIZE_Y = 256;
    private static final String IDENTITY_FORMAT = "%s/MyAvatar";
    private static final int PHOTO_SIZE_X = 96;
    private static final int PHOTO_SIZE_Y = 96;
    private static final String PROFILE_ATTACHMENT_PREFIX = "profile://";
    private static final int QUALITY = 90;
    Account account;
    ImageCache imageCache;

    public ChangeAvatarDialog()
    {
    }

    private Bitmap getMediaBitmap(ContentResolver contentresolver, Uri uri, int i)
        throws IOException
    {
        java.io.InputStream inputstream1;
        android.graphics.BitmapFactory.Options options1;
        options1 = new android.graphics.BitmapFactory.Options();
        inputstream1 = null;
        java.io.InputStream inputstream = contentresolver.openInputStream(uri);
        inputstream1 = inputstream;
        options1.inJustDecodeBounds = true;
        inputstream1 = inputstream;
        BitmapFactory.decodeStream(inputstream, null, options1);
        android.graphics.BitmapFactory.Options options;
        int k;
        FileUtil.closeStream(inputstream);
        int j = Math.max(options1.outHeight, options1.outWidth);
        options = new android.graphics.BitmapFactory.Options();
        k = 1;
        for (; j > i; j /= 2)
        {
            k *= 2;
        }

        break MISSING_BLOCK_LABEL_103;
        contentresolver;
        FileUtil.closeStream(inputstream1);
        throw contentresolver;
        options.inSampleSize = k;
        inputstream1 = contentresolver.openInputStream(uri);
        inputstream = inputstream1;
        options1.inJustDecodeBounds = true;
        inputstream = inputstream1;
        contentresolver = BitmapFactory.decodeStream(inputstream1, null, options);
        boolean flag;
        FileUtil.closeStream(inputstream1);
        flag = false;
        i = ((flag) ? 1 : 0);
        (new ExifInterface((new File(PathRetriever.getPath(getActivity(), uri, true))).getAbsolutePath())).getAttributeInt("Orientation", 1);
        JVM INSTR tableswitch 3 8: default 297
    //                   3 277
    //                   4 220
    //                   5 220
    //                   6 284
    //                   7 220
    //                   8 270;
           goto _L1 _L2 _L3 _L3 _L4 _L3 _L5
_L3:
        uri = contentresolver;
        if (i != 0)
        {
            try
            {
                uri = new Matrix();
                uri.postRotate(i);
                uri = Bitmap.createBitmap(contentresolver, 0, 0, options.outWidth, options.outHeight, uri, true);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                uri.printStackTrace();
                return contentresolver;
            }
        }
        return uri;
        contentresolver;
        FileUtil.closeStream(inputstream);
        throw contentresolver;
_L5:
        i = 270;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 180;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 90;
        continue; /* Loop/switch isn't completed */
_L1:
        i = ((flag) ? 1 : 0);
        if (true) goto _L3; else goto _L6
_L6:
    }

    private String getProfileAttachmentIdentity()
    {
        return String.format("%s/MyAvatar", new Object[] {
            account.getSkypenameProp()
        });
    }

    protected void clearPicture()
    {
        byte abyte0[] = new byte[0];
        String s = getProfileAttachmentIdentity();
        account.setProfileAttachment((new StringBuilder("profile://")).append(s).toString(), abyte0);
        account.setBinProperty(PROPKEY.CONTACT_AVATAR_IMAGE, abyte0);
        imageCache.b(s);
        imageCache.b(account.getSkypenameProp());
    }

    protected CharSequence getTitle()
    {
        return getString(0x7f080123);
    }

    protected void handleImageIntent(Intent intent)
        throws IOException
    {
        int j = 0;
        Object obj = null;
        if (intent.getExtras() == null)
        {
            try
            {
                intent = getMediaBitmap(getActivity().getContentResolver(), intent.getData(), BITMAP_SIZE_LIMIT);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent.printStackTrace();
                intent = obj;
            }
        } else
        if (intent.hasExtra("data"))
        {
            intent = (Bitmap)intent.getExtras().get("data");
        } else
        {
            Uri uri = intent.getData();
            intent = uri;
            if (uri == null)
            {
                intent = imageUri;
            }
            intent = getMediaBitmap(getActivity().getContentResolver(), intent, BITMAP_SIZE_LIMIT);
        }
        if (intent != null)
        {
            int k = intent.getHeight();
            int l = intent.getWidth();
            int i;
            if (l > k)
            {
                i = (l - k) / 2;
            } else
            {
                i = 0;
            }
            if (k > l)
            {
                j = (k - l) / 2;
            }
            k = Math.min(k, l);
            setPicture(Bitmap.createBitmap(intent, i, j, k, k));
        }
        dismissOnResume = true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    protected void setPicture(Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bytearrayoutputstream.write(0);
        if (bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, bytearrayoutputstream))
        {
            byte abyte0[] = bytearrayoutputstream.toByteArray();
            String s = getProfileAttachmentIdentity();
            account.setProfileAttachment((new StringBuilder("profile://")).append(s).toString(), abyte0);
            bytearrayoutputstream.reset();
            bitmap = Bitmap.createScaledBitmap(bitmap, 96, 96, true);
            bytearrayoutputstream.write(0);
            if (bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, bytearrayoutputstream))
            {
                bitmap = bytearrayoutputstream.toByteArray();
                account.setBinProperty(PROPKEY.CONTACT_AVATAR_IMAGE, bitmap);
            }
            imageCache.b(s);
            imageCache.b(account.getSkypenameProp());
        }
    }

}
