// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class emg
{

    private final Map a = new HashMap();

    public emg()
    {
    }

    public final elb a(ekp ekp, ekk ekk)
    {
        emf emf1 = (emf)a.get(ekp.getClass());
        if (emf1 == null)
        {
            ekp = String.valueOf(ekp);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekp).length() + 45)).append("Cannot load features for unknown media type: ").append(ekp).toString());
        }
        elm elm;
        try
        {
            elm = emf1.a(ekp, ekk);
        }
        // Misplaced declaration of an exception variable
        catch (ekp ekp)
        {
            return b.a(ekp);
        }
        if (elm == null)
        {
            ekk = String.valueOf(ekk);
            ekp = String.valueOf(ekp);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekk).length() + 36 + String.valueOf(ekp).length())).append("Unable to load features ").append(ekk).append(" for media: ").append(ekp).toString());
        } else
        {
            return b.b(emf1.a(ekp, elm));
        }
    }

    public final emg a(emf emf1)
    {
        a.put(emf1.a(), emf1);
        return this;
    }
}
