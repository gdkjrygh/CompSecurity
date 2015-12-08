// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.spotlets.momentsstart.MomentsStartFragment;

public final class euf
    implements gab
{

    private MomentsStartFragment a;

    private euf(MomentsStartFragment momentsstartfragment)
    {
        a = momentsstartfragment;
        super();
    }

    public euf(MomentsStartFragment momentsstartfragment, byte byte0)
    {
        this(momentsstartfragment);
    }

    public final void a(EmptyView emptyview, com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate)
    {
        if (com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.a.equals(contentstate))
        {
            MomentsStartFragment.l(a).a(null, null, 0, null, "offline");
        } else
        if (com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.b.equals(contentstate))
        {
            MomentsStartFragment.l(a).a(null, null, 0, null, "error");
            return;
        }
    }
}
