// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cj;

import android.content.Intent;
import android.support.v4.content.j;
import android.view.View;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.p;

// Referenced classes of package p.cj:
//            b

class .Object
    implements android.view..OnClickListener
{

    final p.cj.b a;

    public void onClick(View view)
    {
        b.a.C().a((new PandoraIntent("show_page")).putExtra("intent_page_name", p.A).putExtra("intent_show_force_screen", true));
    }

    iew.View(p.cj.b b1)
    {
        a = b1;
        super();
    }
}
