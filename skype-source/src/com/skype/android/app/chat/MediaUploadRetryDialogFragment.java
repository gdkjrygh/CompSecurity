// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.android.SkypeDialogFragment;

// Referenced classes of package com.skype.android.app.chat:
//            RetryDialogCallback

public class MediaUploadRetryDialogFragment extends SkypeDialogFragment
{

    private static final String EXTRA_MEDIA_DOCUMENT_ID = "mediaDocumentId";
    private static final String EXTRA_MESSAGE_ID = "messageId";
    private static final String EXTRA_NEGATIVE = "negativeButton";
    private static final String EXTRA_POSITIVE = "positiveButton";
    private static final String EXTRA_TEXT = "text";
    private static final String EXTRA_TITLE = "title";
    private RetryDialogCallback retryDialogCallback;

    public MediaUploadRetryDialogFragment()
    {
    }

    public static MediaUploadRetryDialogFragment create(int i, int j, String s, String s1, String s2, String s3)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("messageId", i);
        bundle.putInt("mediaDocumentId", j);
        bundle.putString("title", s);
        bundle.putString("text", s1);
        bundle.putString("positiveButton", s2);
        bundle.putString("negativeButton", s3);
        return (MediaUploadRetryDialogFragment)SkypeDialogFragment.create(bundle, com/skype/android/app/chat/MediaUploadRetryDialogFragment);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(getArguments().getString("title"));
        bundle.b(getArguments().getString("text"));
        bundle.a(getArguments().getString("positiveButton"), new android.content.DialogInterface.OnClickListener() {

            final MediaUploadRetryDialogFragment this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                if (retryDialogCallback != null)
                {
                    retryDialogCallback.onRetryButtonClick(getArguments().getInt("messageId"), getArguments().getInt("mediaDocumentId"));
                }
            }

            
            {
                this$0 = MediaUploadRetryDialogFragment.this;
                super();
            }
        });
        bundle.b(getArguments().getString("negativeButton"), new android.content.DialogInterface.OnClickListener() {

            final MediaUploadRetryDialogFragment this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = MediaUploadRetryDialogFragment.this;
                super();
            }
        });
        bundle.a(true);
        return bundle.c();
    }

    public void setRetryDialogCallback(RetryDialogCallback retrydialogcallback)
    {
        retryDialogCallback = retrydialogcallback;
    }

}
