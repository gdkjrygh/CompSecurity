// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.widget.TextView;
import me.lyft.android.controls.Toggle;
import me.lyft.android.domain.User;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            MenuView

class this._cls0
    implements Action1
{

    final MenuView this$0;

    public volatile void call(Object obj)
    {
        call((User)obj);
    }

    public void call(User user)
    {
        modeSwitchToggle.setChecked(user.isInDriverMode(), false);
        fullNameTextView.setText(user.getFullName());
        MenuView.access$100(MenuView.this);
        MenuView.access$200(MenuView.this);
    }

    e()
    {
        this$0 = MenuView.this;
        super();
    }
}
