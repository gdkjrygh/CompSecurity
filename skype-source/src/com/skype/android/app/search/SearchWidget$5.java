// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.content.Context;
import android.content.Intent;
import com.skype.android.app.contacts.ContactDirectorySearchActivity;
import com.skype.android.app.data.OnUserEventListener;

// Referenced classes of package com.skype.android.app.search:
//            SearchWidget

final class this._cls0
    implements OnUserEventListener
{

    final SearchWidget this$0;

    public final volatile void onItemChecked(android.support.v7.widget.._cls5 _pcls5, Object obj, boolean flag)
    {
        onItemChecked((com.skype.android.app.data.mViewHolder)_pcls5, obj, flag);
    }

    public final void onItemChecked(com.skype.android.app.data.mViewHolder mviewholder, Object obj, boolean flag)
    {
    }

    public final volatile void onItemClick(android.support.v7.widget.._cls5 _pcls5, int i, Object obj)
    {
        onItemClick((com.skype.android.app.data.mViewHolder)_pcls5, i, obj);
    }

    public final void onItemClick(com.skype.android.app.data.mViewHolder mviewholder, int i, Object obj)
    {
        mviewholder = new Intent(SearchWidget.access$300(SearchWidget.this), com/skype/android/app/contacts/ContactDirectorySearchActivity);
        mviewholder.putExtra("android.intent.extra.TEXT", SearchWidget.access$1300(SearchWidget.this));
        SearchWidget.access$300(SearchWidget.this).startActivity(mviewholder);
    }

    public final volatile boolean onItemLongClick(android.support.v7.widget.._cls5 _pcls5, int i, Object obj)
    {
        return onItemLongClick((com.skype.android.app.data.mViewHolder)_pcls5, i, obj);
    }

    public final boolean onItemLongClick(com.skype.android.app.data.mViewHolder mviewholder, int i, Object obj)
    {
        return false;
    }

    iewHolder()
    {
        this$0 = SearchWidget.this;
        super();
    }
}
