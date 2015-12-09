// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import com.google.android.apps.wallet.api.QuitIntent;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            ChangeOrSetPinActivity

final class val.tag
    implements stener
{

    final ChangeOrSetPinActivity this$0;
    final String val$tag;

    private void reset()
    {
        if ("dialog_try_again_verify_pin".equals(val$tag))
        {
            ChangeOrSetPinActivity.access$200(ChangeOrSetPinActivity.this);
            ChangeOrSetPinActivity.access$300(ChangeOrSetPinActivity.this, true);
        } else
        if ("dialog_try_again_change_pin".equals(val$tag) || "dialog_try_again_set_pin".equals(val$tag))
        {
            ChangeOrSetPinActivity.access$400(ChangeOrSetPinActivity.this);
            ChangeOrSetPinActivity.access$300(ChangeOrSetPinActivity.this, true);
            return;
        }
    }

    public final void onCancel()
    {
        reset();
        if (ChangeOrSetPinActivity.access$100(ChangeOrSetPinActivity.this).equals(splayState.ENTER_INITIAL_PIN))
        {
            startActivity(QuitIntent.create());
            return;
        } else
        {
            setResult(0);
            finish();
            return;
        }
    }

    public final void onTryAgain()
    {
        reset();
    }

    splayState()
    {
        this$0 = final_changeorsetpinactivity;
        val$tag = String.this;
        super();
    }
}
