// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.comments;

import android.text.Editable;
import android.text.TextWatcher;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.pin.view.comments:
//            PinCommentEditView

class this._cls0
    implements TextWatcher
{

    final PinCommentEditView this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        Events.post(new nCommentChangedEvent(charsequence.toString()));
    }

    nCommentChangedEvent()
    {
        this$0 = PinCommentEditView.this;
        super();
    }
}
