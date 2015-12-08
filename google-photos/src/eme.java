// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class eme
{

    private final Map a = new HashMap();

    public eme()
    {
    }

    public final elb a(ekq ekq, ekk ekk)
    {
        emd emd1 = (emd)a.get(ekq.getClass());
        if (emd1 == null)
        {
            ekq = String.valueOf(ekq);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 56)).append("Cannot load features for unknown media collection type: ").append(ekq).toString());
        }
        elm elm;
        try
        {
            elm = emd1.a(ekq, ekk);
        }
        // Misplaced declaration of an exception variable
        catch (ekq ekq)
        {
            return b.a(ekq);
        }
        if (elm == null)
        {
            ekk = String.valueOf(ekk);
            ekq = String.valueOf(ekq);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekk).length() + 47 + String.valueOf(ekq).length())).append("Unable to load features ").append(ekk).append(" for media collection: ").append(ekq).toString());
        } else
        {
            return b.b(emd1.a(ekq, elm));
        }
    }

    public final eme a(emd emd1)
    {
        a.put(emd1.a(), emd1);
        return this;
    }
}
