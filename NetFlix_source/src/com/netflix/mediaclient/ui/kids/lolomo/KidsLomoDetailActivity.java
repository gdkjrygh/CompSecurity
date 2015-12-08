// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.FragmentHostActivity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsLomoDetailFrag

public class KidsLomoDetailActivity extends FragmentHostActivity
    implements com.netflix.mediaclient.android.widget.ViewRecycler.ViewRecyclerProvider
{

    private static final String EXTRA_LOMO_PARCELABLE = "lomo_parcelable";
    private static final String TAG = "KidsLomoDetailActivity";
    private LoMo lomo;

    public KidsLomoDetailActivity()
    {
    }

    public static void show(NetflixActivity netflixactivity, LoMo lomo1)
    {
        netflixactivity.startActivity((new Intent(netflixactivity, com/netflix/mediaclient/ui/kids/lolomo/KidsLomoDetailActivity)).putExtra("lomo_parcelable", lomo1));
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final KidsLomoDetailActivity this$0;

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                getPrimaryFrag().onManagerReady(servicemanager, i);
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
                getPrimaryFrag().onManagerUnavailable(servicemanager, i);
            }

            
            {
                this$0 = KidsLomoDetailActivity.this;
                super();
            }
        };
    }

    protected Fragment createPrimaryFrag()
    {
        Log.v("KidsLomoDetailActivity", (new StringBuilder()).append("createPrimaryFrag, lomo id: ").append(lomo.getId()).toString());
        return KidsLomoDetailFrag.create(lomo);
    }

    public volatile Fragment getPrimaryFrag()
    {
        return getPrimaryFrag();
    }

    public KidsLomoDetailFrag getPrimaryFrag()
    {
        return (KidsLomoDetailFrag)super.getPrimaryFrag();
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.browseTitles;
    }

    public ViewRecycler getViewRecycler()
    {
        return null;
    }

    public boolean isForKids()
    {
        return true;
    }

    protected void onCreate(Bundle bundle)
    {
        lomo = (LoMo)getIntent().getParcelableExtra("lomo_parcelable");
        if (Log.isLoggable("KidsLomoDetailActivity", 2))
        {
            Log.v("KidsLomoDetailActivity", lomo.toString());
        }
        super.onCreate(bundle);
        bundle = getNetflixActionBar();
        bundle.setTitle(lomo.getTitle());
        bundle.setLogoType(com.netflix.mediaclient.android.widget.NetflixActionBar.LogoType.GONE);
    }
}
