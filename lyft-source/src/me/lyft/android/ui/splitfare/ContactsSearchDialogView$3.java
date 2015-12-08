// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import com.lyft.scoop.Screen;
import me.lyft.android.common.DialogFlow;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            ContactsSearchDialogView

class this._cls0
    implements Action1
{

    final ContactsSearchDialogView this$0;

    public void call(Screen screen)
    {
        dialogFlow.dismiss(me/lyft/android/ui/splitfare/SplitFareDialogs$ContactsSearchDialog);
    }

    public volatile void call(Object obj)
    {
        call((Screen)obj);
    }

    archDialog()
    {
        this$0 = ContactsSearchDialogView.this;
        super();
    }
}
