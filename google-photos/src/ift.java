// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.view.View;

final class ift
    implements android.view.View.OnClickListener
{

    private int a;
    private ihk b;
    private ifr c;

    ift(ifr ifr1, int i, ihk ihk1)
    {
        c = ifr1;
        a = i;
        b = ihk1;
        super();
    }

    public final void onClick(View view)
    {
        view = new fhm(ifr.c(c));
        view.a = a;
        view.d = Uri.parse(b.b);
        view.e = true;
        view = view.a();
        ifr.c(c).startActivity(view);
    }
}
