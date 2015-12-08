// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class elg
{

    private final Map a = new HashMap();

    public elg()
    {
    }

    private elf a(ekq ekq)
    {
        elf elf1 = (elf)a.get(ekq.getClass());
        if (elf1 == null)
        {
            ekq = String.valueOf(ekq);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 43)).append("No registered handler for collection type: ").append(ekq).toString());
        } else
        {
            return elf1;
        }
    }

    public final long a(ekq ekq, ekw ekw)
    {
        elf elf1 = a(ekq);
        if (!elf1.c().a(ekw))
        {
            ekq = String.valueOf(ekw);
            ekw = String.valueOf(elf1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 59 + String.valueOf(ekw).length())).append("getMediaCount given unsupported query options ").append(ekq).append(" for handler ").append(ekw).toString());
        } else
        {
            return elf1.a(ekq, ekw);
        }
    }

    public final elb a(ekq ekq, ekw ekw, ekk ekk)
    {
        elf elf1 = a(ekq);
        if (!elf1.b().a(ekw))
        {
            ekq = String.valueOf(ekw);
            ekw = String.valueOf(elf1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 56 + String.valueOf(ekw).length())).append("loadMedia given unsupported query options: ").append(ekq).append(" for handler ").append(ekw).toString());
        }
        try
        {
            ekq = elf1.a(ekq, ekw, ekk);
        }
        // Misplaced declaration of an exception variable
        catch (ekq ekq)
        {
            return b.a(ekq);
        }
        return b.b(Collections.unmodifiableList(ekq));
    }

    public final elg a(elf elf1)
    {
        a.put(elf1.a(), elf1);
        return this;
    }
}
