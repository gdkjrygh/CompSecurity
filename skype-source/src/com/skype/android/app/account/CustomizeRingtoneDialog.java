// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.Participant;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.ringtone.RingtoneStorage;
import com.skype.android.util.ConversationUtil;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

public class CustomizeRingtoneDialog extends SkypeDialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    private static final int MEDIA_REQUEST_CODE = 1;
    private static final Logger log = Logger.getLogger("CustomizeRingtoneDialog");
    private final int SET_CUSTOM_RINGTONE = 0;
    private final int SET_DEFAULT_RINGTONE = 1;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    RingtoneStorage ringtoneStorage;

    public CustomizeRingtoneDialog()
    {
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            intent = (Uri)intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (intent != null)
            {
                String s = conversation.getIdentityProp();
                String s1 = conversationUtil.o(conversation).getIdentityProp();
                log.info((new StringBuilder("onActivityResult() selectedMedia:")).append(intent).append(" convId:").append(s).append(" selfId:").append(s1).toString());
                ringtoneStorage.a(s1, s, intent);
            }
        }
        dismiss();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Object obj;
        dialoginterface = conversation.getIdentityProp();
        obj = conversationUtil.o(conversation).getIdentityProp();
        i;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 61
    //                   1 224;
           goto _L1 _L2 _L3
_L1:
        log.warning("Wrong id in the CustomizeRingtoneDialog");
        return;
_L2:
        Intent intent;
        intent = new Intent("android.intent.action.RINGTONE_PICKER");
        intent.putExtra("android.intent.extra.ringtone.TITLE", 0x7f08026c);
        intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", false);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        dialoginterface = ringtoneStorage.a(((String) (obj)), dialoginterface);
        obj = getActivity().getContentResolver();
        if (dialoginterface == null)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        if (dialoginterface.get() != null && ((ContentResolver) (obj)).getType((Uri)dialoginterface.get()) != null)
        {
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", (Parcelable)dialoginterface.get());
            log.info((new StringBuilder("onClick() SET_CUSTOM_RINGTONE we have ringtone:")).append(dialoginterface.get()).toString());
        }
_L4:
        startActivityForResult(intent, 1);
        return;
        dialoginterface;
_L5:
        log.info((new StringBuilder("onClick() SET_CUSTOM_RINGTONE Exception:")).append(dialoginterface).toString());
          goto _L4
_L3:
        log.info((new StringBuilder("onClick() SET_DEFAULT_RINGTONE convId:")).append(dialoginterface).append(" selfId").append(((String) (obj))).toString());
        ringtoneStorage.b(((String) (obj)), dialoginterface);
        dismiss();
        return;
        dialoginterface;
          goto _L5
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(0x7f08026b);
        ArrayAdapter arrayadapter = new ArrayAdapter(getActivity(), 0x7f0300fd) {

            final CustomizeRingtoneDialog this$0;

            public final View getView(int j, View view, ViewGroup viewgroup)
            {
                return (TextView)super.getView(j, view, viewgroup);
            }

            
            {
                this$0 = CustomizeRingtoneDialog.this;
                super(context, i);
            }
        };
        for (int i = 0; i < 2; i++)
        {
            arrayadapter.add(getString((new int[] {
                0x7f080186, 0x7f080187
            })[i]));
        }

        bundle.a(arrayadapter, -1, this);
        return bundle.c();
    }

}
