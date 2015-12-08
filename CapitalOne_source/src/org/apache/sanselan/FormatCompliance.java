// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

public class FormatCompliance
{

    private final boolean a = false;
    private final String b;
    private final ArrayList c = new ArrayList();

    private FormatCompliance(String s)
    {
        b = s;
    }

    public static final FormatCompliance a()
    {
        return new FormatCompliance("ignore");
    }

    private void a(PrintWriter printwriter)
    {
        printwriter.println((new StringBuilder("Format Compliance: ")).append(b).toString());
        if (c.size() == 0)
        {
            printwriter.println("\tNo comments.");
        } else
        {
            int i = 0;
            while (i < c.size()) 
            {
                printwriter.println((new StringBuilder("\t")).append(i + 1).append(": ").append(c.get(i)).toString());
                i++;
            }
        }
        printwriter.println("");
        printwriter.flush();
    }

    public String toString()
    {
        StringWriter stringwriter = new StringWriter();
        a(new PrintWriter(stringwriter));
        return stringwriter.getBuffer().toString();
    }
}
