// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.spotify.mobile.android.util.Assertion;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private gat a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag2 = true;
        int j;
        boolean flag;
        if (i < a.c.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertion.a(flag, "position is outside adapter length");
        j = a.c.b(i);
        if (j != 0x80000000)
        {
            i = a.c.a(i, j);
            switch (j)
            {
            default:
                Assertion.a((new StringBuilder("ID ")).append(l).append("is unknown.").toString());
                return;

            case 0: // '\0'
                ((gdk)a.e.getItem(i)).a(a.a);
                a.f.dismiss();
                a.e.notifyDataSetChanged();
                return;

            case 1: // '\001'
                adapterview = (gfp)a.d.getItem(i);
                break;
            }
            if (a.d.a == i)
            {
                if (((gfp) (adapterview)).c)
                {
                    boolean flag1;
                    if (!adapterview.b())
                    {
                        flag1 = flag2;
                    } else
                    {
                        flag1 = false;
                    }
                    adapterview.a(flag1);
                }
            } else
            {
                adapterview.a(false);
            }
            if (a.b != null)
            {
                a.b.a(adapterview);
            }
            a.f.dismiss();
            adapterview = a.d;
            if (((fto) (adapterview)).a != i)
            {
                adapterview.a = i;
                adapterview.notifyDataSetChanged();
                return;
            }
        }
    }

    (gat gat1)
    {
        a = gat1;
        super();
    }
}
