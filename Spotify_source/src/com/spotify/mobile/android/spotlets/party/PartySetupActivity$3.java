// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party;

import com.spotify.mobile.android.spotlets.party.json.TrackJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.TracksJacksonModel;
import eyh;
import eyi;
import eyk;
import eyu;
import gex;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.party:
//            PartySetupActivity

final class a
    implements eyk
{

    private PartySetupActivity a;

    public final void a(TrackJacksonModel trackjacksonmodel)
    {
        eyh eyh1 = PartySetupActivity.a(a);
        if (eyh1.b != null)
        {
            if (gex.a(eyh1.e))
            {
                int i = eyh1.i.tracks.indexOf(trackjacksonmodel);
                trackjacksonmodel = eyh1.d;
                TracksJacksonModel tracksjacksonmodel = eyh1.i;
                if (i < 0)
                {
                    i = 0;
                }
                trackjacksonmodel.a(tracksjacksonmodel, i);
            } else
            {
                eyh1.d.a(eyh1.i, 0);
            }
            eyh1.a.g();
        }
    }

    l(PartySetupActivity partysetupactivity)
    {
        a = partysetupactivity;
        super();
    }
}
