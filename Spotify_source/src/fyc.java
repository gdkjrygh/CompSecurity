// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;

public final class fyc extends fyl
    implements ggt
{

    private ggq a;

    public fyc()
    {
    }

    public static fyc a(Flags flags)
    {
        fyc fyc1 = new fyc();
        fyw.a(fyc1, flags);
        return fyc1;
    }

    public final void B()
    {
        super.B();
        if (a != null)
        {
            a.b();
            a = null;
        }
    }

    protected final void a()
    {
        u u1 = k();
        dwc dwc1 = dwb.a(u1.getIntent().getData());
        Uri uri = dwc1.b;
        if (!gjp.b(uri))
        {
            Assertion.b((new StringBuilder("Initial uri is not deemed secure, aborting. ")).append(uri).toString());
            u1.finish();
            return;
        }
        if (dwc1.a)
        {
            a = ggq.a(u1, u1.S_());
            a.a(uri.toString(), this);
            return;
        } else
        {
            c(uri.toString());
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        s();
    }

    protected final boolean a(Uri uri)
    {
        if (SpotifyLink.b(uri.toString()))
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(uri);
            a(intent);
            return true;
        } else
        {
            return false;
        }
    }

    public final void a_(Uri uri)
    {
        if (a != null)
        {
            a.b();
            a = null;
        }
        if (uri == null)
        {
            Logger.a("Not ready to load web, web token null", new Object[0]);
            return;
        } else
        {
            c(uri.toString());
            return;
        }
    }
}
