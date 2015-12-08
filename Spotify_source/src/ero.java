// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.connect.Tech;
import com.spotify.mobile.android.spotlets.connect.view.ConnectView;
import java.util.EnumSet;

public final class ero
    implements ezj
{

    private final ConnectView a;

    public ero(ConnectView connectview, int i)
    {
        boolean flag = true;
        super();
        a = connectview;
        connectview = a;
        if (i != 1)
        {
            flag = false;
        }
        connectview.a = flag;
    }

    public final void a()
    {
        a.a();
    }

    public final void a(Tech tech)
    {
        a.a(tech);
    }

    public final void a(Tech tech, String s)
    {
        a.a(tech, s);
    }

    public final void a(EnumSet enumset)
    {
        a.a(enumset);
    }

    public final void b()
    {
    }
}
