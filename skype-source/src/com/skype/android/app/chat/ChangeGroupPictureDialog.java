// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.skype.Conversation;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.app.ChangePictureDialogFragment;
import com.skype.android.app.media.ImageTransformer;
import com.skype.android.app.transfer.PathRetriever;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.util.ImageCache;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

public class ChangeGroupPictureDialog extends ChangePictureDialogFragment
{

    private static final int QUALITY = 90;
    AsyncService asyncService;
    private Conversation conversation;
    ImageCache imageCache;
    private ImageTransformer imageTransformer;
    private AsyncCallback transformImageCallback;

    public ChangeGroupPictureDialog()
    {
        transformImageCallback = new AsyncCallback() {

            final ChangeGroupPictureDialog this$0;

            public final void done(AsyncResult asyncresult)
            {
                if (!asyncresult.d())
                {
                    asyncresult = (Bitmap)asyncresult.a();
                    setPicture(asyncresult);
                }
            }

            
            {
                this$0 = ChangeGroupPictureDialog.this;
                super();
            }
        };
    }

    protected void clearPicture()
    {
        conversation.setPicture(new byte[0]);
        imageCache.b(conversation.getIdentityProp());
    }

    protected CharSequence getTitle()
    {
        return getString(0x7f080122);
    }

    protected void handleImageIntent(Intent intent)
        throws FileNotFoundException
    {
        Uri uri = null;
        if (intent != null)
        {
            uri = intent.getData();
        }
        intent = uri;
        if (uri == null)
        {
            intent = imageUri;
        }
        if (intent != null)
        {
            transformAndSetPictureAsync(intent);
        }
        dismissOnResume = true;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            dialoginterface = new Intent("android.intent.action.GET_CONTENT", null);
            dialoginterface.setType("image/*");
            startActivityForResult(dialoginterface, 10);
            return;

        case 1: // '\001'
            dialoginterface = new Intent("android.media.action.IMAGE_CAPTURE", null);
            imageUri = Uri.fromFile(new File(getActivity().getExternalCacheDir(), (new StringBuilder()).append(System.currentTimeMillis()).append(".jpg").toString()));
            dialoginterface.putExtra("output", imageUri);
            startActivityForResult(dialoginterface, 11);
            return;

        case 2: // '\002'
            clearPicture();
            break;
        }
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        imageTransformer = new ImageTransformer();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
        return super.onCreateDialog(bundle);
    }

    protected void setPicture(Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        if (bitmap != null)
        {
            if (bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, bytearrayoutputstream = new ByteArrayOutputStream()))
            {
                bitmap = bytearrayoutputstream.toByteArray();
                conversation.setPicture(bitmap);
                imageCache.b(conversation.getIdentityProp());
                return;
            }
        }
    }

    protected void transformAndSetPictureAsync(final Uri uri)
    {
        uri = new Callable() {

            final ChangeGroupPictureDialog this$0;
            final Uri val$uri;

            public final Bitmap call()
                throws Exception
            {
                return imageTransformer.transform(PathRetriever.getPath(getActivity().getBaseContext(), uri, false));
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = ChangeGroupPictureDialog.this;
                uri = uri1;
                super();
            }
        };
        asyncService.a(uri, transformImageCallback);
    }

}
