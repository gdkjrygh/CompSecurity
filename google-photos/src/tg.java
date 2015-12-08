// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;

final class tg
    implements xs
{

    private td a;

    tg(td td1)
    {
        a = td1;
        super();
    }

    public final void a(Rect rect)
    {
        rect.top = td.b(a, rect.top);
    }
}
