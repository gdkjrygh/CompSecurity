// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class dwd
    implements android.view.View.OnClickListener
{

    final Context a;
    final dwk b;
    private ImageButton c;
    private dwa d;

    dwd(dwa dwa1, Context context, ImageButton imagebutton, dwk dwk)
    {
        d = dwa1;
        a = context;
        c = imagebutton;
        b = dwk;
        super();
    }

    public final void onClick(View view)
    {
        view = new aeh(a, c);
        vu vu = ((aeh) (view)).a;
        HashMap hashmap = new HashMap(d.c.size());
        dwi dwi1;
        for (Iterator iterator = d.c.iterator(); iterator.hasNext(); hashmap.put(vu.add(dwi1.a), dwi1))
        {
            dwi1 = (dwi)iterator.next();
        }

        view.c = new dwe(this, hashmap);
        ((aeh) (view)).b.b();
    }
}
