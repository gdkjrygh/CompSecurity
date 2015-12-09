// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.text.Editable;
import com.aviary.android.feather.library.graphics.a.c;
import com.aviary.android.feather.sdk.widget.d;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            r

class <init> extends <init>
{

    final r a;

    public void afterTextChanged(Editable editable)
    {
        a.q.b("afterTextChanged");
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.q.b("beforeTextChanged");
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        c c1;
label0:
        {
            if (b != null && (b.n() instanceof c))
            {
                c1 = (c)b.n();
                if (c1.q())
                {
                    break label0;
                }
            }
            return;
        }
        c1.a(charsequence.toString());
    }

    s.a.c(r r1)
    {
        a = r1;
        super(r1);
    }
}
