// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class isx
{

    public final List a = new ArrayList();
    private final List b[];

    public isx(int i)
    {
        ArrayList aarraylist[] = new ArrayList[i];
        for (int j = 0; j < i; j++)
        {
            aarraylist[j] = new ArrayList();
        }

        b = aarraylist;
    }

    public View a(int i)
    {
        List list = b[i];
        if (list.isEmpty())
        {
            return null;
        } else
        {
            return (View)list.remove(0);
        }
    }

    public void a(View view, int i)
    {
        if (view instanceof oiz)
        {
            ((oiz)view).ax_();
        }
        if (android.os.Build.VERSION.SDK_INT < 16 || !view.hasTransientState())
        {
            b[i].add(view);
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                ((isy)iterator.next()).a(view);
            }
        }
    }
}
