// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class deu
    implements dfb
{

    private final View a;
    private final List b = new LinkedList();

    public deu(View view, List list)
    {
        a = view;
        b.addAll(list);
    }

    public final void a(float f)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((Property)iterator.next()).set(a, Float.valueOf(f))) { }
    }
}
