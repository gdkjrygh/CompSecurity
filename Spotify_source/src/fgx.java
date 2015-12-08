// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;

final class fgx
{

    SpotifyIcon a;
    Integer b;
    Integer c;
    private int d;
    private android.view.View.OnClickListener e;
    private fgw f;

    fgx(fgw fgw1)
    {
        f = fgw1;
        super();
    }

    final EmptyView a()
    {
        EmptyView emptyview = new EmptyView(f.a);
        if (b != null)
        {
            emptyview.a(f.a.getString(b.intValue()));
        }
        if (c != null)
        {
            emptyview.b(f.a.getString(c.intValue()));
        }
        if (e != null)
        {
            Button button = dgp.b(f.a, emptyview);
            button.setOnClickListener(e);
            button.setText(d);
            emptyview.a(button);
        }
        if (a != null)
        {
            emptyview.a(dff.a(f.a, a, (0.0F / 0.0F), true, true));
        }
        return emptyview;
    }

    final fgx a(int i, android.view.View.OnClickListener onclicklistener)
    {
        d = i;
        e = (android.view.View.OnClickListener)ctz.a(onclicklistener);
        return this;
    }
}
