// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party;

import com.google.common.collect.Lists;
import eyh;
import eyq;
import eyx;

// Referenced classes of package com.spotify.mobile.android.spotlets.party:
//            PartySetupActivity

final class a
    implements eyx
{

    private PartySetupActivity a;

    public final void a(int i)
    {
        eyh eyh1 = PartySetupActivity.a(a);
        i++;
        if (eyh1.h != i)
        {
            eyh1.h = i;
            eyh1.a();
            eyh1.b.a(eyh1.f, eyh1.h, Lists.a(new String[] {
                eyh1.g
            }), eyh1.k);
        }
    }

    (PartySetupActivity partysetupactivity)
    {
        a = partysetupactivity;
        super();
    }
}
