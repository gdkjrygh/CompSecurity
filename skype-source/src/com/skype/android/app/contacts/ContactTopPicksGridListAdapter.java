// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Activity;
import android.view.View;
import com.skype.Contact;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.widget.GridListAdapter;
import com.skype.android.widget.GridListAdapterViewBuilder;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactItem

public class ContactTopPicksGridListAdapter extends GridListAdapter
{
    final class a extends com.skype.android.widget.GridListAdapter.GridItemViewHolder
    {

        final ContactTopPicksGridListAdapter this$0;

        protected final void onSetData(ContactItem contactitem)
        {
            
// JavaClassFileOutputException: get_constant: invalid tag

        protected final volatile void onSetData(Object obj)
        {
            onSetData((ContactItem)obj);
        }

        public a(View view)
        {
            this$0 = ContactTopPicksGridListAdapter.this;
            super(view);
        }
    }


    private ObjectIdMap map;

    public ContactTopPicksGridListAdapter(Activity activity, ContactUtil contactutil, ImageCache imagecache, ConversationUtil conversationutil, GridListAdapterViewBuilder gridlistadapterviewbuilder, ObjectIdMap objectidmap)
    {
        GridListAdapter(activity, contactutil, imagecache, conversationutil, gridlistadapterviewbuilder);
        map = objectidmap;
        setItemViewAdapter(0, new com.skype.android.widget.GridListAdapter.GridItemViewAdapter() {

            final ContactTopPicksGridListAdapter this$0;

            protected final int getItemId(ContactItem contactitem)
            {
                return contactitem.getContactObjectId();
            }

            protected final volatile int getItemId(Object obj)
            {
                return getItemId((ContactItem)obj);
            }

            protected final volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
            {
                return onCreateViewHolder(view);
            }

            protected final com.skype.android.widget.GridListAdapter.GridItemViewHolder onCreateViewHolder(View view)
            {
                return new a(view);
            }

            
            {
                this$0 = ContactTopPicksGridListAdapter.this;
                super();
            }
        });
    }


}
