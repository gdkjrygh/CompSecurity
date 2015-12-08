// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.tinder.adapters.l;
import com.tinder.managers.i;

// Referenced classes of package com.tinder.fragments:
//            ac, aj

final class a
    implements TextWatcher
{

    final ac a;

    public final void afterTextChanged(Editable editable)
    {
        if (!ac.e(a)) goto _L2; else goto _L1
_L1:
        editable = editable.toString();
        if (!TextUtils.isEmpty(editable)) goto _L4; else goto _L3
_L3:
        editable = ac.f(a).d;
        if (editable == null) goto _L2; else goto _L5
_L5:
        editable.a(null);
        if (!((aj) (editable)).i || !((aj) (editable)).c.i()) goto _L7; else goto _L6
_L6:
        editable.e();
_L2:
        return;
_L7:
        editable.i = false;
        return;
_L4:
        if (ac.b(editable))
        {
            ac.g(a);
        }
        aj aj1 = ac.f(a).d;
        if (aj1 != null)
        {
            aj1.a(editable);
            return;
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public final void beforeTextChanged(CharSequence charsequence, int j, int k, int i1)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int j, int k, int i1)
    {
    }

    (ac ac1)
    {
        a = ac1;
        super();
    }
}
