// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import PG;
import PI;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.Timber;
import ws;

// Referenced classes of package com.snapchat.android.discover.ui:
//            ChannelGroupView

public final class DiscoverLoadingStatePresenter
{
    public static final class LoadingState extends Enum
    {

        private static final LoadingState $VALUES[];
        public static final LoadingState EXTERNAL_STORAGE_UNAVAILABLE;
        public static final LoadingState GENERIC_ERROR;
        public static final LoadingState LOADED;
        public static final LoadingState LOADING;
        public static final LoadingState NETWORK_ERROR;

        public static LoadingState valueOf(String s)
        {
            return (LoadingState)Enum.valueOf(com/snapchat/android/discover/ui/DiscoverLoadingStatePresenter$LoadingState, s);
        }

        public static LoadingState[] values()
        {
            return (LoadingState[])$VALUES.clone();
        }

        static 
        {
            LOADING = new LoadingState("LOADING", 0);
            LOADED = new LoadingState("LOADED", 1);
            NETWORK_ERROR = new LoadingState("NETWORK_ERROR", 2);
            EXTERNAL_STORAGE_UNAVAILABLE = new LoadingState("EXTERNAL_STORAGE_UNAVAILABLE", 3);
            GENERIC_ERROR = new LoadingState("GENERIC_ERROR", 4);
            $VALUES = (new LoadingState[] {
                LOADING, LOADED, NETWORK_ERROR, EXTERNAL_STORAGE_UNAVAILABLE, GENERIC_ERROR
            });
        }

        private LoadingState(String s, int j)
        {
            super(s, j);
        }
    }


    public PI a;
    TextView b;
    ImageView c;
    View d;
    ImageView e;
    public ChannelGroupView f;
    public View g;
    public ws h;
    com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility i;

    public DiscoverLoadingStatePresenter()
    {
        i = com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.SUPPORTED;
    }

    final void a()
    {
        d.setVisibility(0);
        g.setVisibility(8);
        d.setClickable(true);
        e.setVisibility(0);
    }

    final void a(int j)
    {
        f.setVisibility(8);
        if (d != null)
        {
            d.setVisibility(8);
        }
        g.setVisibility(8);
        if (d != null)
        {
            d.setVisibility(4);
        }
        a.a(0);
        c.setVisibility(8);
        b.setVisibility(0);
        b.setText(j);
    }

    public final void a(LoadingState loadingstate)
    {
        PG.a(new Runnable(loadingstate) {

            private LoadingState a;
            private DiscoverLoadingStatePresenter b;

            public final void run()
            {
                DiscoverLoadingStatePresenter discoverloadingstatepresenter;
                LoadingState loadingstate1;
                discoverloadingstatepresenter = b;
                loadingstate1 = a;
                Timber.c("DiscoverLoadingStatePresenter", "Setting loading state %s (compatibility is %s)", new Object[] {
                    loadingstate1, discoverloadingstatepresenter.i
                });
                if (discoverloadingstatepresenter.i == com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.UNKNOWN || discoverloadingstatepresenter.i == com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.SUPPORTED) goto _L2; else goto _L1
_L1:
                static final class _cls3
                {

                    static final int a[];
                    static final int b[];

                    static 
                    {
                        b = new int[com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.values().length];
                        try
                        {
                            b[com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.REGION_NOT_SUPPORTED.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            b[com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.DEVICE_NOT_SUPPORTED.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            b[com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.NOT_SUPPORTED.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        a = new int[LoadingState.values().length];
                        try
                        {
                            a[LoadingState.LOADED.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            a[LoadingState.LOADING.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[LoadingState.NETWORK_ERROR.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[LoadingState.EXTERNAL_STORAGE_UNAVAILABLE.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[LoadingState.GENERIC_ERROR.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls3.b[discoverloadingstatepresenter.i.ordinal()];
                JVM INSTR tableswitch 1 1: default 80
            //                           1 87;
                   goto _L3 _L4
_L3:
                discoverloadingstatepresenter.a(0x7f080117);
_L6:
                return;
_L4:
                discoverloadingstatepresenter.a(0x7f080118);
                return;
_L2:
                if (discoverloadingstatepresenter.h == null) goto _L6; else goto _L5
_L5:
                if (discoverloadingstatepresenter.h.b() != 0) goto _L8; else goto _L7
_L7:
                _cls3.a[loadingstate1.ordinal()];
                JVM INSTR tableswitch 1 5: default 152
            //                           1 157
            //                           2 162
            //                           3 167
            //                           4 214
            //                           5 262;
                   goto _L8 _L9 _L10 _L11 _L12 _L13
_L8:
                discoverloadingstatepresenter.c();
                return;
_L9:
                discoverloadingstatepresenter.c();
                return;
_L10:
                discoverloadingstatepresenter.b();
                return;
_L11:
                discoverloadingstatepresenter.f.setVisibility(8);
                discoverloadingstatepresenter.a.a(0);
                discoverloadingstatepresenter.c.setVisibility(0);
                discoverloadingstatepresenter.b.setVisibility(0);
                discoverloadingstatepresenter.b.setText(0x7f080108);
                discoverloadingstatepresenter.a();
                return;
_L12:
                discoverloadingstatepresenter.f.setVisibility(8);
                discoverloadingstatepresenter.a.a(0);
                discoverloadingstatepresenter.c.setVisibility(8);
                discoverloadingstatepresenter.b.setVisibility(0);
                discoverloadingstatepresenter.b.setText(0x7f08010a);
                discoverloadingstatepresenter.a();
                return;
_L13:
                discoverloadingstatepresenter.a(0x7f080117);
                return;
            }

            
            {
                b = DiscoverLoadingStatePresenter.this;
                a = loadingstate;
                super();
            }
        });
    }

    public final void a(com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility compatibility)
    {
        Timber.c("DiscoverLoadingStatePresenter", "Setting compatibility %s (from %s)", new Object[] {
            compatibility, i
        });
        i = compatibility;
        if (i != com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.SUPPORTED && i != com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.UNKNOWN)
        {
            a(LoadingState.GENERIC_ERROR);
        }
    }

    final void b()
    {
        a.a(8);
        if (d != null)
        {
            d.setVisibility(8);
        }
        g.setVisibility(0);
    }

    final void c()
    {
        f.setVisibility(0);
        a.a(8);
        if (d != null)
        {
            d.setVisibility(8);
        }
        g.setVisibility(8);
    }

    // Unreferenced inner class com/snapchat/android/discover/ui/DiscoverLoadingStatePresenter$1

/* anonymous class */
    public final class _cls1
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
            b.d.setOnClickListener(new android.view.View.OnClickListener(this) {

                private _cls1 a;

                public final void onClick(View view)
                {
    public final class _cls1
        implements PI.a
    {
                    a.b.b();
                    a.a.onClick(view);
                }

            
            {
                a = _pcls1;
                super();
            }
            });
        }

            public 
            {
                b = DiscoverLoadingStatePresenter.this;
                a = onclicklistener;
                super();
            }
    }

}
