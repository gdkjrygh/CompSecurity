// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.RadioButton;

final class ghh
    implements android.view.View.OnClickListener
{

    private ghc a;

    ghh(ghc ghc1)
    {
        a = ghc1;
        super();
    }

    public final void onClick(View view)
    {
        ghc.a(a).setChecked(true);
    }
}
