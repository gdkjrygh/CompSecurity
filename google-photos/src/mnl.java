// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.util.Arrays;

public final class mnl
    implements mvx, onc
{

    private final mmv b;

    public mnl(mmv mmv1)
    {
        Arrays.asList(new ond[] {
            new mnm(this, "print")
        });
        b = mmv1;
    }

    public final String a()
    {
        return "AccountStore";
    }

    public final void a(PrintWriter printwriter)
    {
        printwriter.append(b.b());
    }

    public final String b()
    {
        return "Prints all attributes for each account.";
    }
}
