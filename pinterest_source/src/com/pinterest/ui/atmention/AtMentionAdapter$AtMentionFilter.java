// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.atmention;

import android.widget.Filter;
import com.pinterest.api.model.AtMention;
import java.util.List;

// Referenced classes of package com.pinterest.ui.atmention:
//            AtMentionAdapter

class <init> extends Filter
{

    final AtMentionAdapter this$0;

    public CharSequence convertResultToString(Object obj)
    {
        return ((AtMention)obj).getUsername();
    }

    protected android.widget.ntionFilter performFiltering(CharSequence charsequence)
    {
        charsequence = new android.widget.ntionFilter();
        charsequence.ntionFilter = AtMentionAdapter.access$100(AtMentionAdapter.this);
        charsequence._fld0 = AtMentionAdapter.access$100(AtMentionAdapter.this).size();
        return charsequence;
    }

    protected void publishResults(CharSequence charsequence, android.widget.ntionFilter ntionfilter)
    {
    }

    private A()
    {
        this$0 = AtMentionAdapter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
