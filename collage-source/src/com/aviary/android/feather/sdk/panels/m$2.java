// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.text.Editable;
import android.view.View;
import com.aviary.android.feather.library.graphics.a.c;
import com.aviary.android.feather.sdk.widget.AviaryButton;
import com.aviary.android.feather.sdk.widget.d;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            m

class <init> extends <init>
{

    final m a;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        c c1;
label0:
        {
            i = 0;
            a.q.c("onTextChanged", new Object[] {
                b
            });
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
        if (!b.equals(a.y)) goto _L2; else goto _L1
_L1:
        a.s.setText(charsequence);
        View view = a.D;
        if (charsequence != null && charsequence.length() > 0)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
_L4:
        if (b.o())
        {
            a.c.invalidate(b.f());
        }
        m.a(a);
        return;
_L2:
        if (b.equals(a.z))
        {
            a.t.setText(charsequence);
            View view1 = a.E;
            if (charsequence == null || charsequence.length() <= 0)
            {
                i = 4;
            }
            view1.setVisibility(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    geViewTouch(m m1)
    {
        a = m1;
        super(m1);
    }
}
