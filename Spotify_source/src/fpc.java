// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.android.paste.graphics.SpotifyIcon;
import java.util.Collections;
import java.util.List;

public final class fpc extends af
{

    public List b;

    public fpc(aa aa)
    {
        super(aa);
        b = Collections.emptyList();
    }

    public final Fragment a(int i)
    {
        giu giu1 = (giu)b.get(i);
        fpb fpb1 = new fpb();
        Bundle bundle = new Bundle();
        bundle.putString("showcase-id", giu1.a);
        bundle.putInt("showcase-title", giu1.b);
        bundle.putInt("showcase-descr", giu1.c);
        if (giu1.d > 0)
        {
            i = giu1.d;
        } else
        {
            i = -1;
        }
        bundle.putInt("showcase-icon", i);
        if (giu1.e != null)
        {
            bundle.putString("showcase-spoticon", giu1.e.name());
        }
        bundle.putInt("showcase-image", giu1.f);
        fpb1.f(bundle);
        return fpb1;
    }

    public final int b()
    {
        return b.size();
    }
}
