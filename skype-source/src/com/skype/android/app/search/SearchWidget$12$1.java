// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.app.Navigation;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.widget.PendingKeyboardDismissal;

// Referenced classes of package com.skype.android.app.search:
//            SearchWidget, MessageItem

final class al extends PendingKeyboardDismissal
{

    final sageObjectId this$1;
    final String val$conversationIdentity;
    final MessageItem val$message;

    protected final void proceed()
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        SearchWidget.access$000(_fld0).getConversationByIdentity(val$conversationIdentity, conversationimpl, false);
        long l = val$message.getTimestamp();
        SearchWidget.access$1000(_fld0).chat(conversationimpl, val$message.getMessageObjectId(), l - 60L);
    }

    is._cls0(String s, MessageItem messageitem)
    {
        this$1 = final__pcls0;
        val$conversationIdentity = s;
        val$message = messageitem;
        super(final_inputmethodmanager, View.this);
    }

    // Unreferenced inner class com/skype/android/app/search/SearchWidget$12

/* anonymous class */
    final class SearchWidget._cls12
        implements OnUserEventListener
    {

        final SearchWidget this$0;

        public final volatile void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag)
        {
            onItemChecked((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, obj, flag);
        }

        public final void onItemChecked(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, Object obj, boolean flag)
        {
        }

        public final volatile void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
        {
            onItemClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
        }

        public final void onItemClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
        {
            itemviewholder = (MessageItem)obj;
            obj = itemviewholder.getConversationIdentity();
            (SearchWidget.access$900(SearchWidget.this). new SearchWidget._cls12._cls1(((String) (obj)), itemviewholder)).hideKeyboardAndProceed();
        }

        public final volatile boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj)
        {
            return onItemLongClick((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i, obj);
        }

        public final boolean onItemLongClick(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i, Object obj)
        {
            return false;
        }

            
            {
                this$0 = SearchWidget.this;
                super();
            }
    }

}
