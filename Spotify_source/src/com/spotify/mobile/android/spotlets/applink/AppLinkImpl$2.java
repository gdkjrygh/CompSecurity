// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.applink;

import ato;
import awf;
import awi;
import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.proxy.rpc.enums.TextAlignment;
import com.spotify.mobile.android.util.logging.Logger;
import egc;
import egp;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.spotify.mobile.android.spotlets.applink:
//            AppLinkImpl, SessionState

final class e
    implements Runnable
{

    private egc a;
    private boolean b;
    private boolean c;
    private String d;
    private String e;
    private AppLinkImpl f;

    public final void run()
    {
        Object obj;
        if (f.f != SessionState.b)
        {
            return;
        }
        int i = f.c(a);
        obj = f.e;
        Object obj1 = Boolean.valueOf(b);
        if (obj1 != null)
        {
            ((awi) (obj)).e.put("isHighlighted", obj1);
        } else
        {
            ((awi) (obj)).e.remove("isHighlighted");
        }
        if (c)
        {
            f.d.a(egp.b);
        } else
        {
            f.d.a(egp.a);
        }
        try
        {
            obj = new awf();
            ((awf) (obj)).a(d);
            ((awf) (obj)).b(e);
            ((awf) (obj)).b.put("mainField3", "");
            ((awf) (obj)).b.put("mainField4", "");
            obj1 = f.c;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logger.c("Failed to set now playing screen: %s", new Object[] {
                obj
            });
            f.a(i);
            return;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        ((awf) (obj)).b.put("softButtons", obj1);
_L1:
        obj1 = new Vector();
        ((awf) (obj)).b.put("customPresets", obj1);
        ((awf) (obj)).a(TextAlignment.a);
        ((awf) (obj)).a(Integer.valueOf(i));
        f.g.a(((atk) (obj)));
        return;
        ((awf) (obj)).b.remove("softButtons");
          goto _L1
    }

    (AppLinkImpl applinkimpl, egc egc, boolean flag, boolean flag1, String s, String s1)
    {
        f = applinkimpl;
        a = egc;
        b = flag;
        c = flag1;
        d = s;
        e = s1;
        super();
    }
}
