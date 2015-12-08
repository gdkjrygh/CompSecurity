// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            ContactsSearchDialogView

class this._cls0
    implements Action1
{

    final ContactsSearchDialogView this$0;

    public void call(CharSequence charsequence)
    {
        search(charsequence);
    }

    public volatile void call(Object obj)
    {
        call((CharSequence)obj);
    }

    ()
    {
        this$0 = ContactsSearchDialogView.this;
        super();
    }
}
