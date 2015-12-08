// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.discover.ui:
//            DiscoverLoadingStatePresenter

final class a
    implements android.view.gStatePresenter._cls1._cls1
{

    private a a;

    public final void onClick(View view)
    {
        a.a.b();
        a.a.a(view);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/discover/ui/DiscoverLoadingStatePresenter$1

/* anonymous class */
    public final class DiscoverLoadingStatePresenter._cls1
        implements PI.a
    {

        final android.view.View.OnClickListener a;
        final DiscoverLoadingStatePresenter b;

        public final void a(View view)
        {
            b.b = (TextView)view.findViewById(0x7f0d025d);
            b.c = (ImageView)view.findViewById(0x7f0d025e);
            b.d = view.findViewById(0x7f0d025f);
            b.d.setClickable(false);
            b.e = (ImageView)b.d.findViewById(0x7f0d0260);
            b.d.setOnClickListener(new DiscoverLoadingStatePresenter._cls1._cls1(this));
        }

            public 
            {
                b = discoverloadingstatepresenter;
                a = onclicklistener;
                super();
            }
    }

}
