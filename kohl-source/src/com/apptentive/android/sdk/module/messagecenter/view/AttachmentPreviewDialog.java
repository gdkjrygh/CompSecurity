// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.apptentive.android.sdk.module.rating.view.ApptentiveBaseDialog;
import com.apptentive.android.sdk.util.ImageUtil;
import com.apptentive.android.sdk.util.Util;
import java.io.FileNotFoundException;

public class AttachmentPreviewDialog extends ApptentiveBaseDialog
{
    public static interface OnAttachmentAcceptedListener
    {

        public abstract void onAttachmentAccepted();
    }


    private OnAttachmentAcceptedListener listener;

    public AttachmentPreviewDialog(Context context)
    {
        super(context, com.apptentive.android.sdk.R.layout.apptentive_message_center_attachment_preview);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ((Button)findViewById(com.apptentive.android.sdk.R.id.no)).setOnClickListener(new android.view.View.OnClickListener() {

            final AttachmentPreviewDialog this$0;

            public void onClick(View view)
            {
                dismiss();
            }

            
            {
                this$0 = AttachmentPreviewDialog.this;
                super();
            }
        });
        ((Button)findViewById(com.apptentive.android.sdk.R.id.yes)).setOnClickListener(new android.view.View.OnClickListener() {

            final AttachmentPreviewDialog this$0;

            public void onClick(View view)
            {
                if (listener != null)
                {
                    listener.onAttachmentAccepted();
                    dismiss();
                }
            }

            
            {
                this$0 = AttachmentPreviewDialog.this;
                super();
            }
        });
    }

    public void setImage(Uri uri)
    {
        ImageView imageview;
        final Bitmap thumbnail;
        imageview = (ImageView)findViewById(com.apptentive.android.sdk.R.id.image);
        Uri uri2 = null;
        Uri uri1 = null;
        try
        {
            uri = getContext().getContentResolver().openInputStream(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Util.ensureClosed(uri1);
            return;
        }
        finally
        {
            Util.ensureClosed(uri2);
        }
        uri1 = uri;
        uri2 = uri;
        thumbnail = ImageUtil.createLightweightScaledBitmapFromStream(uri, 200, 300, null);
        Util.ensureClosed(uri);
        if (thumbnail == null)
        {
            return;
        } else
        {
            imageview.setImageBitmap(thumbnail);
            setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final AttachmentPreviewDialog this$0;
                final Bitmap val$thumbnail;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    thumbnail.recycle();
                    System.gc();
                }

            
            {
                this$0 = AttachmentPreviewDialog.this;
                thumbnail = bitmap;
                super();
            }
            });
            return;
        }
        throw uri;
    }

    public void setOnAttachmentAcceptedListener(OnAttachmentAcceptedListener onattachmentacceptedlistener)
    {
        listener = onattachmentacceptedlistener;
    }

}
