// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.pandora.android.util:
//            SearchMusicLayout, s

class a
    implements TextWatcher
{

    final SearchMusicLayout a;

    public void afterTextChanged(Editable editable)
    {
        editable = s.a(editable);
        if (SearchMusicLayout.g(a) == null)
        {
            SearchMusicLayout.a(a, SearchMusicLayout.a(a, editable));
            return;
        } else
        {
            SearchMusicLayout.b(a, editable);
            return;
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        SearchMusicLayout searchmusiclayout = a;
        boolean flag;
        if (charsequence.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SearchMusicLayout.a(searchmusiclayout, flag);
        SearchMusicLayout.f(a).a();
    }

    (SearchMusicLayout searchmusiclayout)
    {
        a = searchmusiclayout;
        super();
    }
}
