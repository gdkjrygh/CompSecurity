// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.Button;
import com.spotify.android.paste.widget.EmptyView;

final class g.Object
    implements android.view.lickListener
{

    private a a;

    public final void onClick(View view)
    {
        fjd.c(a.a);
        a.a.J();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class fjd$5

/* anonymous class */
    final class fjd._cls5
        implements gab
    {

        final fjd a;

        public final void a(EmptyView emptyview, com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate)
        {
            if (contentstate == com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.d)
            {
                contentstate = dgp.b(a.k(), null);
                contentstate.setId(0x7f110022);
                contentstate.setText(0x7f080517);
                contentstate.setSingleLine(true);
                contentstate.setOnClickListener(new fjd._cls5._cls1(this));
                emptyview.a(contentstate);
                return;
            } else
            {
                emptyview.a(null);
                return;
            }
        }

            
            {
                a = fjd1;
                super();
            }
    }

}
