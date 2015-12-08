// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.HashMap;

public final class mml
    implements android.content.DialogInterface.OnClickListener
{

    private mmm a;
    private ar b;
    private HashMap c;

    mml(Activity activity)
    {
        if (!(activity instanceof ar))
        {
            throw new IllegalArgumentException("Must instantiate the AccessibilityMenuHelper with a FragmentActivity.");
        } else
        {
            b = (ar)activity;
            c = new HashMap();
            return;
        }
    }

    public final void a(mmm mmm1)
    {
        mmm1 = mmm1.b();
        if (c.containsKey(mmm1))
        {
            c.remove(mmm1);
        }
    }

    public final void a(mmm mmm1, String s)
    {
        c.put(s, mmm1);
    }

    public final void b(mmm mmm1)
    {
        p.b(mmm1, "Handler must be non-null");
        a = mmm1;
        am am1;
        if (mmm1.a().size() != 0)
        {
            if ((am1 = b.c().a("AccessibilityMenu")) == null || !(am1 instanceof al) || !((al)am1).e.isShowing())
            {
                mmk.a(b, mmm1, mmm1.b()).a(b.c(), "AccessibilityMenu");
                return;
            }
        }
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (a == null)
        {
            am am1 = b.c().a("AccessibilityMenu");
            if (!(am1 instanceof mmk))
            {
                return;
            }
            a = (mmm)c.get(((am) ((mmk)am1)).q.getString("dialogIdTag"));
        }
        jz jz1 = a.a();
        int ai[] = new int[jz1.size()];
        for (int j = 0; j < jz1.size(); j++)
        {
            ai[j] = ((Integer)jz1.b(j)).intValue();
        }

        if (i == ai.length)
        {
            dialoginterface.dismiss();
            return;
        } else
        {
            a.a(ai[i]);
            return;
        }
    }
}
