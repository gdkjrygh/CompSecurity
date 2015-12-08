// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.app.data.OnUserEventListener;
import com.skype.android.widget.PendingKeyboardDismissal;

// Referenced classes of package com.skype.android.app.search:
//            SearchWidget

final class sal extends PendingKeyboardDismissal
{

    final is._cls0 this$1;
    final int val$objectId;

    protected final void proceed()
    {
        ContactImpl contactimpl = new ContactImpl();
        SearchWidget.access$000(_fld0).getContact(val$objectId, contactimpl);
        ConversationImpl conversationimpl = new ConversationImpl();
        contactimpl.openConversation(conversationimpl);
        SearchWidget.access$1000(_fld0).chat(conversationimpl);
    }

    is._cls0(View view, int i)
    {
        this$1 = final__pcls0;
        val$objectId = i;
        super(InputMethodManager.this, view);
    }

    // Unreferenced inner class com/skype/android/app/search/SearchWidget$3

/* anonymous class */
    final class SearchWidget._cls3
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
            i = ((ContactItem)obj).getContactObjectId();
            (SearchWidget.access$800(SearchWidget.this). new SearchWidget._cls3._cls1(SearchWidget.access$900(SearchWidget.this), i)).hideKeyboardAndProceed();
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
