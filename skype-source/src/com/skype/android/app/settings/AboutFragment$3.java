// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.support.v4.app.l;
import android.support.v4.app.o;
import android.view.View;

// Referenced classes of package com.skype.android.app.settings:
//            AboutFragment, AttributionsFragment

final class this._cls0
    implements android.view.ener
{

    final AboutFragment this$0;

    public final void onClick(View view)
    {
        view = getFragmentManager().a();
        view.a(0x7f100006, new AttributionsFragment());
        view.a("tps");
        view.a();
    }

    ment()
    {
        this$0 = AboutFragment.this;
        super();
    }
}
