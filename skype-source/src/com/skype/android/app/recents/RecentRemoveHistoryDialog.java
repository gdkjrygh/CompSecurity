// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.TimeUtil;
import java.util.ArrayList;

public class RecentRemoveHistoryDialog extends SkypeDialogFragment
{

    Analytics analytics;
    private boolean isCanceled;
    ObjectIdMap map;
    private ArrayList selectedConversations;

    public RecentRemoveHistoryDialog()
    {
    }

    public boolean isCanceled()
    {
        return isCanceled;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        getComponent().inject(this);
        isCanceled = true;
        bundle = getArguments();
        selectedConversations = new ArrayList();
        if (bundle != null && bundle.containsKey("com.skype.objIds"))
        {
            bundle = bundle.getIntArray("com.skype.objIds");
            int k = bundle.length;
            for (int i = 0; i < k; i++)
            {
                int l = bundle[i];
                selectedConversations.add(map.a(l, com/skype/Conversation));
            }

        }
        bundle = getMaterialDialogBuilder(getActivity());
        View view = LayoutInflater.from(getActivity()).inflate(0x7f0300f2, null);
        ((TextView)view.findViewById(0x7f1004f0)).setText(getResources().getQuantityString(0x7f0b0005, selectedConversations.size()));
        final CheckBox leaveConvCheckBox = (CheckBox)view.findViewById(0x7f1004f1);
        leaveConvCheckBox.setText(getResources().getQuantityString(0x7f0b0004, selectedConversations.size()));
        leaveConvCheckBox.setChecked(false);
        bundle.a(getResources().getQuantityString(0x7f0b0006, selectedConversations.size()));
        bundle.b(view);
        boolean flag1 = false;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < selectedConversations.size())
                {
                    if (((Conversation)selectedConversations.get(j)).getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
                    {
                        break label0;
                    }
                    flag = true;
                }
                android.content.DialogInterface.OnClickListener onclicklistener;
                if (flag)
                {
                    leaveConvCheckBox.setVisibility(0);
                } else
                {
                    leaveConvCheckBox.setVisibility(8);
                }
                onclicklistener = new android.content.DialogInterface.OnClickListener() {

                    final RecentRemoveHistoryDialog this$0;
                    final CheckBox val$leaveConvCheckBox;

                    public final void onClick(DialogInterface dialoginterface, int i1)
                    {
                        isCanceled = false;
                        dialoginterface = new SkypeTelemetryEvent(LogEvent.c);
                        int j1 = 0;
                        while (j1 < selectedConversations.size()) 
                        {
                            Conversation conversation = (Conversation)selectedConversations.get(j1);
                            if (conversation.getTypeProp() != com.skype.Conversation.TYPE.DIALOG)
                            {
                                if (leaveConvCheckBox.isChecked())
                                {
                                    conversation.retireFrom();
                                    conversation.unPin();
                                    dialoginterface.put(LogAttributeName.ah, Boolean.valueOf(true));
                                } else
                                {
                                    dialoginterface.put(LogAttributeName.ah, Boolean.valueOf(false));
                                }
                            }
                            if (i1 == -1)
                            {
                                conversation.setConsumedHorizon((int)TimeUtil.a(), true);
                                conversation.delete();
                                dialoginterface.put(LogAttributeName.ag, "DELETE");
                            } else
                            if (i1 == -2)
                            {
                                conversation.setConsumedHorizon((int)TimeUtil.a(), true);
                                conversation.removeFromInbox();
                                dialoginterface.put(LogAttributeName.ag, "HIDE");
                            }
                            analytics.a(dialoginterface);
                            j1++;
                        }
                    }

            
            {
                this$0 = RecentRemoveHistoryDialog.this;
                leaveConvCheckBox = checkbox;
                super();
            }
                };
                bundle.a(0x7f0802aa, onclicklistener);
                bundle.b(0x7f0802c2, onclicklistener);
                return bundle.c();
            }
            j++;
        } while (true);
    }


/*
    static boolean access$002(RecentRemoveHistoryDialog recentremovehistorydialog, boolean flag)
    {
        recentremovehistorydialog.isCanceled = flag;
        return flag;
    }

*/

}
