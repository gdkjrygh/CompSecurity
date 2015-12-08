// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.text.TextUtils;
import android.widget.Filter;
import com.skype.android.app.recents.Recent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.contacts:
//            ConversationAdapter

final class this._cls0 extends Filter
{

    final ConversationAdapter this$0;

    protected final android.widget.sationAdapter._cls1 performFiltering(CharSequence charsequence)
    {
        android.widget.sationAdapter sationadapter = new android.widget.init>();
        ArrayList arraylist = new ArrayList();
        if (!TextUtils.isEmpty(charsequence))
        {
            Iterator iterator = ConversationAdapter.access$100(ConversationAdapter.this).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Recent recent = (Recent)iterator.next();
                if (recent.getDisplayName().toLowerCase().contains(charsequence.toString().toLowerCase()))
                {
                    arraylist.add(recent);
                }
            } while (true);
        } else
        {
            arraylist.addAll(ConversationAdapter.access$100(ConversationAdapter.this));
        }
        sationadapter.alues = arraylist;
        return sationadapter;
    }

    protected final void publishResults(CharSequence charsequence, android.widget.sationAdapter._cls1 _pcls1)
    {
        ConversationAdapter.access$202(ConversationAdapter.this, (ArrayList)_pcls1.alues);
        setData(ConversationAdapter.access$200(ConversationAdapter.this));
    }

    ()
    {
        this$0 = ConversationAdapter.this;
        super();
    }
}
