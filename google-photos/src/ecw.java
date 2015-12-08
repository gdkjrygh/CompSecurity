// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class ecw
    implements dwj
{

    private final int a;
    private final dui b;
    private final noz c;
    private ecs d;

    public ecw(ecs ecs1, Context context, int i, dui dui)
    {
        d = ecs1;
        super();
        a = i;
        b = dui;
        c = noz.a(context, "AddStoriesCardRenderer", new String[0]);
    }

    public final void a(Context context, View view, ekq ekq, ekp ekp)
    {
        d.b.a(new ecv(ekq, a, d.c, b, c));
    }
}
