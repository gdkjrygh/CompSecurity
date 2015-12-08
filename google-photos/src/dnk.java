// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class dnk
    implements drx
{

    private dnd a;

    dnk(dni dni, dnd dnd1)
    {
        a = dnd1;
        super();
    }

    public final erm a(erm erm1)
    {
        String s = a.b;
        if (s != null)
        {
            erm1.b("remote_media.collection_id = ?");
            erm1.e.add(s);
            erm1.m = true;
        }
        erm1.a = null;
        s = String.valueOf("remote_media.position, ");
        String s1 = String.valueOf(b.b("media1", "capture_timestamp"));
        String s2 = String.valueOf(b.b("media1", "_id"));
        erm1.b = (new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", ").append(s2).toString();
        erm1.j = true;
        erm1.l = false;
        return erm1;
    }
}
