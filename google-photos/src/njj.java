// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class njj extends FrameLayout
{

    public int a;
    public mmv b;
    public View c;
    public View d;
    public TextView e;
    public TextView f;
    public AvatarView g;

    public njj(Context context)
    {
        super(context);
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(b.GC, this, true);
        c = findViewById(p.bG);
        d = findViewById(p.bJ);
        e = (TextView)findViewById(p.bI);
        f = (TextView)findViewById(p.bH);
        g = (AvatarView)findViewById(p.bF);
        b = (mmv)olm.a(getContext(), mmv);
    }
}
