// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package android.support.design.widget:
//            TextInputLayout

class this._cls0
    implements TextWatcher
{

    final TextInputLayout this$0;

    public void afterTextChanged(Editable editable)
    {
        TextInputLayout.access$100(TextInputLayout.this, true);
        if (TextInputLayout.access$200(TextInputLayout.this))
        {
            TextInputLayout.access$300(TextInputLayout.this, editable.length());
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    ()
    {
        this$0 = TextInputLayout.this;
        super();
    }
}
