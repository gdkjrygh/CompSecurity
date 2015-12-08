// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class ddu
    implements ddt
{

    private final View a;
    private final TextView b;
    private CharSequence c;
    private final dfz d;

    public ddu(View view)
    {
        a = view;
        b = (TextView)view.findViewById(0x1020014);
        d = new dfz(b.getContext(), SpotifyIcon.l, b.getTextSize() / 2.0F);
        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
    }

    public final View a()
    {
        return a;
    }

    public final void a(CharSequence charsequence)
    {
        c = charsequence;
        b.setText(c);
    }
}
