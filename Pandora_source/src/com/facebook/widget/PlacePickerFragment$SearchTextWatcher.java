// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.facebook.widget:
//            PlacePickerFragment

private class <init>
    implements TextWatcher
{

    final PlacePickerFragment this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        onSearchBoxTextChanged(charsequence.toString(), false);
    }

    private ()
    {
        this$0 = PlacePickerFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
