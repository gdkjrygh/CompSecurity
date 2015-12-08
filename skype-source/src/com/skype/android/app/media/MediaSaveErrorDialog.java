// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.skype.android.SkypeDialogFragment;

// Referenced classes of package com.skype.android.app.media:
//            MediaLinkSaveError

public class MediaSaveErrorDialog extends SkypeDialogFragment
{

    private static final String ERROR_EXTRA = "com.skype.error";
    private static int resMessageId;
    private static int resSdCardMissingMessageId;
    private static int resTitleId;

    public MediaSaveErrorDialog()
    {
    }

    public static MediaSaveErrorDialog create(MediaLinkSaveError medialinksaveerror, int i, int j, int k)
    {
        MediaSaveErrorDialog mediasaveerrordialog = new MediaSaveErrorDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("com.skype.error", medialinksaveerror.ordinal());
        mediasaveerrordialog.setArguments(bundle);
        resTitleId = i;
        resMessageId = j;
        resSdCardMissingMessageId = k;
        return mediasaveerrordialog;
    }

    private Dialog createDialog(String s, String s1)
    {
        android.support.v7.app.AlertDialog.a a = getMaterialDialogBuilder(getActivity());
        a.a(s);
        a.b(s1);
        a.a(0x7f0802f6, new android.content.DialogInterface.OnClickListener() {

            final MediaSaveErrorDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                dismiss();
            }

            
            {
                this$0 = MediaSaveErrorDialog.this;
                super();
            }
        });
        return a.c();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        int i = getArguments().getInt("com.skype.error", MediaLinkSaveError.UNKNOWN_ERROR.ordinal());
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$android$app$media$MediaLinkSaveError[];

            static 
            {
                $SwitchMap$com$skype$android$app$media$MediaLinkSaveError = new int[MediaLinkSaveError.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkSaveError[MediaLinkSaveError.MISSING_EXTERNAL_DEVICE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkSaveError[MediaLinkSaveError.OUT_OF_MEMORY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.skype.android.app.media.MediaLinkSaveError[MediaLinkSaveError.value(i).ordinal()];
        JVM INSTR tableswitch 1 2: default 48
    //                   1 71
    //                   2 81;
           goto _L1 _L2 _L3
_L1:
        int j;
        j = resTitleId;
        i = resMessageId;
_L5:
        return createDialog(getString(j), getString(i));
_L2:
        j = 0x7f08026e;
        i = resSdCardMissingMessageId;
        continue; /* Loop/switch isn't completed */
_L3:
        j = 0x7f080261;
        i = 0x7f080400;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
