// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.text.Editable;
import android.text.TextWatcher;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationCreateFragment, ConversationCreateAdapter

class this._cls0
    implements TextWatcher
{

    final ConversationCreateFragment this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        ConversationCreateFragment.access$102(ConversationCreateFragment.this, StringUtils.trimToEmpty(charsequence.toString()));
        ConversationCreateFragment.access$000(ConversationCreateFragment.this).onSearchQueryChanged(ConversationCreateFragment.access$100(ConversationCreateFragment.this));
    }

    ()
    {
        this$0 = ConversationCreateFragment.this;
        super();
    }
}
