// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.show.model.Show;
import java.util.Map;

final class ang.Object
    implements epc
{

    private fin a;
    private String b;

    public final void a(Throwable throwable)
    {
        a.a(throwable);
    }

    public final void a(Map map)
    {
        a.a((Show)map.get(b), null);
    }

    (fin fin1, String s)
    {
        a = fin1;
        b = s;
        super();
    }
}
