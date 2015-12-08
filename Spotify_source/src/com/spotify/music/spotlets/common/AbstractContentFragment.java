// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.common;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.viewuri.Verified;
import ctz;
import eda;
import edb;
import fxy;
import gaa;
import gab;
import ggl;
import ggn;
import gjf;
import gjn;
import gnn;
import gno;
import u;

public abstract class AbstractContentFragment extends Fragment
    implements fxy, gjn
{

    private LoadingView Y;
    private ContentViewManager Z;
    private ggl a;
    private final eda aa = new eda() {

        private AbstractContentFragment a;

        public final void a(SessionState sessionstate)
        {
label0:
            {
                boolean flag;
label1:
                {
                    boolean flag1 = true;
                    if (sessionstate == null)
                    {
                        return;
                    }
                    AbstractContentFragment abstractcontentfragment = a;
                    if (sessionstate.j || abstractcontentfragment.af == DataRetrievingState.c)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    if (!a.b(a.ae))
                    {
                        a.ab.a(a.ae);
                        return;
                    }
                    sessionstate = a;
                    if (((AbstractContentFragment) (sessionstate)).af != DataRetrievingState.c)
                    {
                        flag = flag1;
                        if (((AbstractContentFragment) (sessionstate)).af != DataRetrievingState.b)
                        {
                            break label1;
                        }
                    }
                    if (((AbstractContentFragment) (sessionstate)).af != DataRetrievingState.c);
                    flag = false;
                }
                if (flag)
                {
                    a.P();
                    return;
                } else
                {
                    AbstractContentFragment.a(a).b(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.d);
                    return;
                }
            }
            AbstractContentFragment.a(sessionstate, AbstractContentFragment.a(a));
        }

            
            {
                a = AbstractContentFragment.this;
                super();
            }
    };
    public final gnn ab = new gno(this, (byte)0);
    public EmptyView ac;
    public View ad;
    public Parcelable ae;
    DataRetrievingState af;
    private gjf b;

    public AbstractContentFragment()
    {
        af = DataRetrievingState.a;
    }

    public static ContentViewManager a(AbstractContentFragment abstractcontentfragment)
    {
        return abstractcontentfragment.Z;
    }

    public static DataRetrievingState a(AbstractContentFragment abstractcontentfragment, DataRetrievingState dataretrievingstate)
    {
        abstractcontentfragment.af = dataretrievingstate;
        return dataretrievingstate;
    }

    protected static void a(SessionState sessionstate, ContentViewManager contentviewmanager)
    {
        boolean flag;
        if (!sessionstate.j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        contentviewmanager.a(flag);
    }

    public static gjf b(AbstractContentFragment abstractcontentfragment)
    {
        return abstractcontentfragment.b;
    }

    public void A()
    {
        super.A();
        b.c();
        a.b();
        edb.a(k()).b(aa);
    }

    public final Fragment F()
    {
        return this;
    }

    public final void P()
    {
        af = DataRetrievingState.b;
        s_();
        a(ab);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        b = gjf.a(k(), v_().toString());
        b.c(bundle);
        a = ggn.a(k(), v_());
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f03007d, viewgroup, false);
        ad = d(layoutinflater, viewgroup, bundle);
        viewgroup.addView(ad);
        return viewgroup;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ae = bundle.getParcelable("AbstractContentFragment.KEY_INSTANCE_STATE_PARCELABLE_DATA");
            af = (DataRetrievingState)bundle.getSerializable("AbstractContentFragment.KEY_INSTANCE_STATE_DATA_RETRIEVING_STATE");
        }
    }

    public abstract void a(Parcelable parcelable, View view);

    public void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        ac = (EmptyView)view.findViewById(0x7f110356);
        ctz.a(ad);
        view = new gaa(k(), ac, ad);
        view.a = new gab() {

            private AbstractContentFragment a;

            public final void a(EmptyView emptyview, com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate)
            {
                a.a(emptyview, contentstate);
            }

            
            {
                a = AbstractContentFragment.this;
                super();
            }
        };
        a(((gaa) (view)));
        Z = view.a();
        boolean flag;
        if (Z.a(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.d) && Z.a(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.b) && Z.a(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.b(flag, "In setupContentViewManager(), EMPTY_CONTENT, SERVICE_ERROR, NO_NETWORK states' text should be defined. Otherwise, the app could be crashed.");
    }

    public void a(EmptyView emptyview, com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate)
    {
    }

    public abstract void a(gaa gaa1);

    public abstract void a(gnn gnn);

    public final void b()
    {
        ae = null;
        af = DataRetrievingState.a;
    }

    public boolean b(Parcelable parcelable)
    {
        return parcelable == null;
    }

    public abstract View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle);

    public void e(Bundle bundle)
    {
        super.e(bundle);
        b.a(bundle);
        bundle.putParcelable("AbstractContentFragment.KEY_INSTANCE_STATE_PARCELABLE_DATA", ae);
        DataRetrievingState dataretrievingstate;
        if (af != DataRetrievingState.b)
        {
            dataretrievingstate = af;
        } else
        {
            dataretrievingstate = DataRetrievingState.a;
        }
        bundle.putSerializable("AbstractContentFragment.KEY_INSTANCE_STATE_DATA_RETRIEVING_STATE", dataretrievingstate);
    }

    public void s_()
    {
        LoadingView loadingview = Y;
        if (Y == null)
        {
            loadingview = LoadingView.a(LayoutInflater.from(k()));
            Y = loadingview;
            ((ViewGroup)y()).addView(loadingview);
        }
        Z.a(loadingview);
    }

    public void z()
    {
        super.z();
        b.a();
        a.a();
        edb.a(k()).a(aa);
    }

    private class DataRetrievingState extends Enum
    {

        public static final DataRetrievingState a;
        public static final DataRetrievingState b;
        public static final DataRetrievingState c;
        public static final DataRetrievingState d;
        private static final DataRetrievingState e[];

        public static DataRetrievingState valueOf(String s)
        {
            return (DataRetrievingState)Enum.valueOf(com/spotify/music/spotlets/common/AbstractContentFragment$DataRetrievingState, s);
        }

        public static DataRetrievingState[] values()
        {
            return (DataRetrievingState[])e.clone();
        }

        static 
        {
            a = new DataRetrievingState("Idle", 0);
            b = new DataRetrievingState("Retrieving", 1);
            c = new DataRetrievingState("Success", 2);
            d = new DataRetrievingState("Failure", 3);
            e = (new DataRetrievingState[] {
                a, b, c, d
            });
        }

        private DataRetrievingState(String s, int i)
        {
            super(s, i);
        }
    }

}
