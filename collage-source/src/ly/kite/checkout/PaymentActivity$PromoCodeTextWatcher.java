// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.checkout;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

// Referenced classes of package ly.kite.checkout:
//            PaymentActivity

private class <init>
    implements TextWatcher
{

    final PaymentActivity this$0;

    public void afterTextChanged(Editable editable)
    {
        PaymentActivity.access$700(PaymentActivity.this).setTextColor(getResources().getColor(ly.kite.lt));
        boolean _tmp = PaymentActivity.access$800(PaymentActivity.this);
        PaymentActivity.access$900(PaymentActivity.this).setText(ly.kite.ply);
        PaymentActivity.access$1002(PaymentActivity.this, false);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    private ()
    {
        this$0 = PaymentActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
