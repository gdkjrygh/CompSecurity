// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.os.Environment;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            LayoutCostMeter

static final class port
    implements port
{

    private static void a(PrintWriter printwriter, Object obj)
    {
        printwriter.print("\"");
        printwriter.print(obj);
        printwriter.print("\"");
    }

    private static void a(PrintWriter printwriter, String s, Number number)
    {
        a(printwriter, s);
        printwriter.print(", ");
        a(printwriter, number);
        printwriter.println();
    }

    public final void a(String s, Enum aenum[], long al[], Enum aenum1[], int ai[])
    {
        Enum enum;
        int i;
        int j;
        try
        {
            s = new PrintWriter(new FileWriter(new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append(s).append(".csv").toString())));
            j = aenum.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        enum = aenum[i];
        a(((PrintWriter) (s)), enum.name(), ((Number) (Long.valueOf(al[enum.ordinal()]))));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_51;
_L1:
        j = aenum1.length;
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        aenum = aenum1[i];
        a(((PrintWriter) (s)), aenum.name(), ((Number) (Integer.valueOf(ai[aenum.ordinal()]))));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        s.flush();
        s.close();
        return;
    }

    port()
    {
    }
}
