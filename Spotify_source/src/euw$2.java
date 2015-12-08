// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import com.spotify.mobile.android.util.SpotifyLink;
import java.util.Map;

final class ang.Object
    implements android.view.nClickListener
{

    private euw a;

    public final void onClick(View view)
    {
        boolean flag1 = true;
        if (euw.c(a) != null)
        {
            view = a.n;
            String s = euw.c(a).uri;
            com.spotify.mobile.android.util.yLink.LinkType linktype;
            boolean flag;
            if (!euw.b(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            linktype = (new SpotifyLink(s)).c;
            if (((eun) (view)).a.containsKey(linktype))
            {
                ((eup)((eun) (view)).a.get(linktype)).a(s, flag);
            }
            view = a;
            if (!euw.b(a))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view.b(flag);
        }
    }

    (euw euw1)
    {
        a = euw1;
        super();
    }
}
