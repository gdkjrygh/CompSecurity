// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package kik.android.chat.fragment:
//            KikStartGroupFragment

final class pu
    implements TextWatcher
{

    final KikStartGroupFragment a;

    pu(KikStartGroupFragment kikstartgroupfragment)
    {
        a = kikstartgroupfragment;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.M = true;
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
