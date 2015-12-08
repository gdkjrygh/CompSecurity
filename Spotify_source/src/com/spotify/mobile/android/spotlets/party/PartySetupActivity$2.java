// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party;

import android.view.View;
import eyh;
import eyi;
import eyu;

// Referenced classes of package com.spotify.mobile.android.spotlets.party:
//            PartySetupActivity

final class a
    implements android.view.s.party.PartySetupActivity._cls2
{

    private PartySetupActivity a;

    public final void onClick(View view)
    {
        view = PartySetupActivity.a(a);
        if (((eyh) (view)).i != null)
        {
            ((eyh) (view)).d.a(((eyh) (view)).i, 0);
            ((eyh) (view)).a.g();
        }
    }

    (PartySetupActivity partysetupactivity)
    {
        a = partysetupactivity;
        super();
    }
}
