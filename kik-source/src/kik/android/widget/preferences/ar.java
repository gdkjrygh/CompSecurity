// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package kik.android.widget.preferences:
//            NamePreference

final class ar
    implements TextWatcher
{

    final NamePreference a;

    ar(NamePreference namepreference)
    {
        a = namepreference;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        if (NamePreference.a(a).getText().toString().contains(" "))
        {
            NamePreference.a(a).setText(NamePreference.a(a).getText().toString().replace(" ", ""));
            NamePreference.b(a).requestFocus();
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
