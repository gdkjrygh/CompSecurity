// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.Channel;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            SelectProviderActivity

public class ProviderDialogFragment extends DialogFragment
{
    private class ProviderAdapter extends BaseAdapter
    {

        private final List mItems;
        final ProviderDialogFragment this$0;

        public int getCount()
        {
            return mItems.size();
        }

        public Object getItem(int i)
        {
            return mItems.get(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            Mvpd mvpd;
            if (view == null)
            {
                view = inflater.inflate(0x7f04001f, viewgroup, false);
                viewgroup = new ViewHolder(view);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (ViewHolder)view.getTag();
            }
            mvpd = (Mvpd)getItem(i);
            if (isPremiumMvpd(mvpd))
            {
                ((ViewHolder) (viewgroup)).displayName.setVisibility(8);
                ((ViewHolder) (viewgroup)).logo.setVisibility(0);
                picasso.load(mvpd.getLogoUrl()).resizeDimen(0x7f09007d, 0x7f09007c).centerInside().placeholder(0x7f020132).into(((ViewHolder) (viewgroup)).logo);
            } else
            {
                ((ViewHolder) (viewgroup)).displayName.setVisibility(0);
                ((ViewHolder) (viewgroup)).logo.setVisibility(8);
            }
            ((ViewHolder) (viewgroup)).displayName.setText(mvpd.getDisplayName());
            return view;
        }

        public ProviderAdapter(List list)
        {
            this$0 = ProviderDialogFragment.this;
            super();
            mItems = list;
        }
    }

    private static class ViewHolder
    {

        public TextView displayName;
        public ImageView logo;

        public ViewHolder(View view)
        {
            displayName = (TextView)view.findViewById(0x7f0f0073);
            logo = (ImageView)view.findViewById(0x7f0f0072);
        }
    }


    private static final String ARG_MVPDS = "ARG_MVPDS";
    private static final String TAG = "ProviderDialogFragment";
    Configuration config;
    private LayoutInflater inflater;
    private ListView mListView;
    private List mvpds;
    AuthService pass;
    Picasso picasso;
    TrackingHelper trackingHelper;

    public ProviderDialogFragment()
    {
    }

    public static ProviderDialogFragment getInstance(ArrayList arraylist)
    {
        ProviderDialogFragment providerdialogfragment = new ProviderDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_MVPDS", arraylist);
        providerdialogfragment.setArguments(bundle);
        return providerdialogfragment;
    }

    private List sortPremiumMvpds(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = config.getMvpdPremium().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Iterator iterator1 = list.iterator();
            while (iterator1.hasNext()) 
            {
                Mvpd mvpd = (Mvpd)iterator1.next();
                if (s.equals(mvpd.getId()))
                {
                    arraylist.add(mvpd);
                }
            }
        }

        return arraylist;
    }

    private void trackPage()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("nbcs.section", "pass");
        hashmap.put("nbcs.passlogin", "true");
        trackingHelper.trackPageEvent(":Pass:Provider List", hashmap);
    }

    public boolean isPremiumMvpd(Mvpd mvpd)
    {
        Object obj = pass.getCurrentChannel();
        if (obj != null)
        {
            obj = ((Channel) (obj)).getMvpdPremium().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                if (((String)((Iterator) (obj)).next()).equals(mvpd.getId()))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isStandardMvpd(Mvpd mvpd)
    {
        Object obj = pass.getCurrentChannel();
        if (obj != null)
        {
            obj = ((Channel) (obj)).getMvpdStandard().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                if (((String)((Iterator) (obj)).next()).equals(mvpd.getId()))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        ((SelectProviderActivity)getActivity()).component().inject(this);
        trackPage();
        bundle = new ArrayList();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        int i = 0;
        while (i < mvpds.size()) 
        {
            Mvpd mvpd = (Mvpd)mvpds.get(i);
            if (isPremiumMvpd(mvpd) && !pass.isBlacklisted(mvpd))
            {
                bundle.add(mvpd);
            } else
            if (isStandardMvpd(mvpd) && !pass.isBlacklisted(mvpd))
            {
                arraylist.add(mvpd);
            }
            i++;
        }
        arraylist1.addAll(sortPremiumMvpds(bundle));
        arraylist1.addAll(arraylist);
        mListView.setAdapter(new ProviderAdapter(arraylist1));
        mListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ProviderDialogFragment this$0;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                ((SelectProviderActivity)getActivity()).setSelectedMvpd((Mvpd)adapterview.getItemAtPosition(j));
                dismiss();
            }

            
            {
                this$0 = ProviderDialogFragment.this;
                super();
            }
        });
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        pass.getInstance().setSelectedProvider(null);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(0, 0x7f0a0021);
        mvpds = (List)getArguments().getSerializable("ARG_MVPDS");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        inflater = layoutinflater;
        getDialog().setTitle("Select Provider");
        layoutinflater = layoutinflater.inflate(0x7f040040, viewgroup, false);
        mListView = (ListView)layoutinflater.findViewById(0x102000a);
        return layoutinflater;
    }

}
