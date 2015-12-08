// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;

final class hym
    implements Runnable
{

    private hyl a;

    hym(hyl hyl1)
    {
        a = hyl1;
        super();
    }

    public final void run()
    {
        Object obj = (ekp)a.a.getIntent().getParcelableExtra(a.b);
        ehr ehr1 = new ehr(((ejz)a.c.ai_().a(ejz)).b());
        obj = new hyj(ehr1, ((android.os.Parcelable) (obj)), a.d.d(ehr1));
        a.e.a(((mtf) (obj)));
    }
}
