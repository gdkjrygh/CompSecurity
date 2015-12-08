// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.widget.EditText;
import me.lyft.android.infrastructure.s3.ConfigsDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.utils.Keyboard;

// Referenced classes of package me.lyft.android.ui.development:
//            EnvironmentSwitcherView

class this._cls0 extends AsyncCall
{

    final EnvironmentSwitcherView this$0;

    public void onFail(Throwable throwable)
    {
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((ConfigsDTO)obj);
    }

    public void onSuccess(ConfigsDTO configsdto)
    {
        EnvironmentSwitcherView.access$002(EnvironmentSwitcherView.this, configsdto);
        EnvironmentSwitcherView.access$100(EnvironmentSwitcherView.this);
        searchEditText.addTextChangedListener(EnvironmentSwitcherView.access$200(EnvironmentSwitcherView.this));
        Keyboard.showKeyboard(searchEditText);
    }

    ()
    {
        this$0 = EnvironmentSwitcherView.this;
        super();
    }
}
