// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.app.Activity;
import android.view.View;
import com.skype.Conversation;
import com.skype.android.app.Navigation;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.recents.RecentAdapter;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;

public class CallHistoryAdapter extends RecentAdapter
{

    ConversationUtil conversationUtil;
    ObjectIdMap map;
    Navigation navigation;

    public CallHistoryAdapter(Activity activity)
    {
        super(activity);
    }

    protected int getItemLayoutId()
    {
        return 0x7f0300ee;
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        onBindViewHolder((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i);
    }

    public void onBindViewHolder(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, final int position)
    {
        super.onBindViewHolder(itemviewholder, position);
        itemviewholder.itemView.findViewById(0x7f1004e5).setOnClickListener(new android.view.View.OnClickListener() {

            final CallHistoryAdapter this$0;
            final int val$position;

            public final void onClick(View view)
            {
                view = ((View) (getItem(position)));
                if (view instanceof Recent)
                {
                    int i = ((Recent)view).getConversationObjectId();
                    view = (Conversation)map.a(i, com/skype/Conversation);
                    navigation.placeCall(view);
                }
            }

            
            {
                this$0 = CallHistoryAdapter.this;
                position = i;
                super();
            }
        });
    }
}
