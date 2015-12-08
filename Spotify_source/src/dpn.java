// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText;
import java.util.ArrayList;
import java.util.List;

public final class dpn
{

    private List a;

    public dpn()
    {
        a = new ArrayList();
    }

    public final PorcelainJsonText a()
    {
        return new PorcelainJsonText((com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText.PorcelainJsonLine[])a.toArray(new com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonText.PorcelainJsonLine[a.size()]));
    }

    public final dpn a(dpo dpo1)
    {
        dpo1 = dpo1.a();
        a.add(ctz.a(dpo1));
        return this;
    }

    public final dpn a(String s)
    {
        a.add((new dpo((String)ctz.a(s))).a());
        return this;
    }

    public final transient dpn a(dpo adpo[])
    {
        for (int i = 0; i < 2; i++)
        {
            a(adpo[i]);
        }

        return this;
    }
}
