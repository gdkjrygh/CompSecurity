// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

final class iif
{

    private final Context a;

    iif(Context context)
    {
        a = context;
    }

    private String a(mmx mmx, hjz hjz1, int i)
    {
        StringBuilder stringbuilder;
        int j;
        int k;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, (new StringBuilder(43)).append("numNames must be >= 1, but was: ").append(i).toString());
        j = Collections.unmodifiableList(hjz1.a).size();
        if (i <= j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, String.format(Locale.US, "numNames must be <= numRecipients, numNames: %d, numRecipients: %d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
        k = j - i;
        stringbuilder = new StringBuilder();
        j = 0;
        while (j < i) 
        {
            if (j > 0)
            {
                stringbuilder.append(a.getString(b.zT));
            }
            Object obj = (diy)Collections.unmodifiableList(hjz1.a).get(j);
            if (((diy) (obj)).a(mmx))
            {
                obj = a.getString(b.zS);
            } else
            {
                obj = ((diy) (obj)).b;
            }
            stringbuilder.append(((String) (obj)));
            j++;
        }
        mmx = stringbuilder.toString();
        if (k == 0)
        {
            return mmx;
        } else
        {
            return a.getResources().getQuantityString(b.zC, k, new Object[] {
                mmx, Integer.valueOf(k)
            });
        }
    }

    public final String a(mmx mmx, ekq ekq1, TextView textview)
    {
        hjz hjz1 = (hjz)ekq1.a(hjz);
        if (Collections.unmodifiableList(hjz1.a).isEmpty())
        {
            return "";
        }
        ekq1 = a(mmx, hjz1, 1);
        int j = Math.min(10, Collections.unmodifiableList(hjz1.a).size());
        int i = 2;
        do
        {
            if (i >= j)
            {
                break;
            }
            String s = a(mmx, hjz1, i);
            boolean flag;
            if (textview.getPaint().measureText(s) < (float)textview.getWidth())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                break;
            }
            i++;
            ekq1 = s;
        } while (true);
        return ekq1;
    }
}
