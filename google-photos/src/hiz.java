// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;

final class hiz
    implements nug
{

    private hiy a;

    hiz(hiy hiy1)
    {
        a = hiy1;
        super();
    }

    public final void b_(Object obj)
    {
        obj = (hkl)obj;
        hiy.a(a, ((hkl) (obj)).b);
        if (hiy.a(a) != null)
        {
            TextView textview = hiy.a(a);
            boolean flag;
            if (!((hkl) (obj)).b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            textview.setTextIsSelectable(flag);
        }
    }
}
