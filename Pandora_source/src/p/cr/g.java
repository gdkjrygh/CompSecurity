// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import android.net.Uri;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.util.p;

public class g
    implements k.c
{

    public g()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        return new p.cp.b.c((new PandoraIntent("show_page")).putExtra("intent_page_name", p.j).putExtra("intent_sub_page_name", 0).putExtra("intent_show_force_screen", true));
    }
}
