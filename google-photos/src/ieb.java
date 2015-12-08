// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;

final class ieb
    implements android.view.View.OnClickListener
{

    private idu a;

    ieb(idu idu1)
    {
        a = idu1;
        super();
    }

    public final void onClick(View view)
    {
        idu.a(a).c();
        view = idu.l(a);
        view.c = false;
        ((ejo) (view)).b.clear();
        ((ejo) (view)).a.b("DownloadMediaToCacheTask");
    }
}
