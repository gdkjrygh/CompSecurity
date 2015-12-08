// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.view.View;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            AdapterWrapper, StickyListHeadersAdapter

class val.position
    implements android.view.ner
{

    final AdapterWrapper this$0;
    final int val$position;

    public void onClick(View view)
    {
        if (AdapterWrapper.access$300(AdapterWrapper.this) != null)
        {
            long l = mDelegate.getHeaderId(val$position);
            AdapterWrapper.access$300(AdapterWrapper.this).onHeaderClick(view, val$position, l);
        }
    }

    HeaderClickListener()
    {
        this$0 = final_adapterwrapper;
        val$position = I.this;
        super();
    }
}
