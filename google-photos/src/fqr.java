// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.CompoundButton;

final class fqr
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private fqm a;

    fqr(fqm fqm1)
    {
        a = fqm1;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (!fqm.h(a))
        {
            if ((compoundbutton = (fqv)olm.b(compoundbutton.getContext(), fqv)) != null)
            {
                compoundbutton.a(flag, fqm.e(a));
                return;
            }
        }
    }
}
