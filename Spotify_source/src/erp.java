// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.connect.Tech;
import com.spotify.mobile.android.spotlets.connect.view.ConnectView;
import java.util.EnumSet;

public final class erp
    implements ezj
{

    private final ConnectView a;

    public erp(ConnectView connectview)
    {
        a = connectview;
        a.a = true;
    }

    public final void a()
    {
        a.setVisibility(0);
        a.a();
    }

    public final void a(Tech tech)
    {
        a.setVisibility(0);
        a.a(tech);
    }

    public final void a(Tech tech, String s)
    {
        a.setVisibility(0);
        a.a(tech, s);
    }

    public final void a(EnumSet enumset)
    {
        a.setVisibility(0);
        a.a(enumset);
    }

    public final void b()
    {
        a.setVisibility(8);
    }
}
