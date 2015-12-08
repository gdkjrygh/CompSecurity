// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.spotlets.findfriends.model.FindFriendsModel;
import java.util.List;

final class ang.Object
    implements android.view.nClickListener
{

    private esh a;

    public final void onClick(View view)
    {
        int i = esh.c(a).getResults().size();
        if (i > 25)
        {
            esh.a(a, esg.c(i));
            esh.d(a).a(a, 0);
            view = esh.d(a);
            aa aa = a.m();
            esh.d(a);
            view.a(aa, "spotify:findfriends:confirm");
            return;
        } else
        {
            esh.e(a);
            return;
        }
    }

    (esh esh1)
    {
        a = esh1;
        super();
    }
}
