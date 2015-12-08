// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.os.Bundle;
import android.view.View;
import com.pinterest.activity.conversation.view.BlockConversationUserAdapter;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.model.Conversation;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BlockConversationUserDialog extends BaseDialog
{

    private BlockConversationUserAdapter _adapter;
    private Conversation _conversation;

    public BlockConversationUserDialog()
    {
    }

    private void initAdapter()
    {
        _adapter = new BlockConversationUserAdapter(getContext());
        Object obj = _conversation.getCachedUsers();
        ArrayList arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            User user = (User)((Iterator) (obj)).next();
            if (!MyUser.isUserMe(user))
            {
                arraylist.add(user);
            }
        } while (true);
        _adapter.setDatasource(arraylist);
        setListViewOptions(_adapter, null);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        initAdapter();
        setTitle(0x7f070071);
        setPositiveButton(0x7f0703d2, new _cls1());
        setNegativeButton(0x7f0700af, null);
    }

    public void setConversation(Conversation conversation)
    {
        _conversation = conversation;
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BlockConversationUserDialog this$0;

        public void onClick(View view)
        {
            view = _adapter.getSelectedUsers();
            if (view != null && !view.isEmpty())
            {
                for (view = _adapter.getSelectedUsers().iterator(); view.hasNext(); UserApi.i(((User)view.next()).getUid(), new ApiResponseHandler(), null)) { }
                (new HideConversationTask(_conversation)).execute();
            }
            dismiss();
        }

        _cls1()
        {
            this$0 = BlockConversationUserDialog.this;
            super();
        }
    }

}
