// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package android.support.design.widget:
//            TextInputLayout

final class a
    implements TextWatcher
{

    final TextInputLayout a;

    public final void afterTextChanged(Editable editable)
    {
        TextInputLayout.a(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (TextInputLayout textinputlayout)
    {
        a = textinputlayout;
        super();
    }
}
