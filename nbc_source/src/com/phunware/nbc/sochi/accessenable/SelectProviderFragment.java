// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.Channel;
import com.nbcsports.liveextra.library.tve.Logo;
import com.nbcsports.liveextra.library.tve.MvpdLookups;
import com.nbcsports.liveextra.ui.core.BaseFragment;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            SelectProviderActivity

public class SelectProviderFragment extends BaseFragment
{
    private static class ProviderGridViewAdapter extends BaseAdapter
    {

        private final Context mContext;
        private final LayoutInflater mInflater;
        private final ArrayList mMvpds;

        public int getCount()
        {
            return mMvpds.size();
        }

        public Object getItem(int i)
        {
            return mMvpds.get(i);
        }

        public long getItemId(int i)
        {
            return 0L;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            Logo logo;
            if (view == null || view.getTag() == null)
            {
                ViewHolder viewholder = new ViewHolder();
                view = mInflater.inflate(0x7f04005c, viewgroup, false);
                viewholder.mImageViewLogo = (ImageView)view.findViewById(0x7f0f012b);
                view.setTag(viewholder);
                viewgroup = viewholder;
            } else
            {
                viewgroup = (ViewHolder)view.getTag();
            }
            logo = (Logo)getItem(i);
            viewgroup = ((ViewHolder) (viewgroup)).mImageViewLogo;
            if (logo.getPicker() != null && !TextUtils.isEmpty(logo.getPicker()))
            {
                Picasso.with(mContext).load(logo.getPicker()).placeholder(0x7f020132).into(viewgroup);
            }
            return view;
        }

        public ProviderGridViewAdapter(Context context, ArrayList arraylist)
        {
            mInflater = LayoutInflater.from(context);
            mMvpds = arraylist;
            mContext = context;
        }
    }

    static class ProviderGridViewAdapter.ViewHolder
    {

        private ImageView mImageViewLogo;



/*
        static ImageView access$102(ProviderGridViewAdapter.ViewHolder viewholder, ImageView imageview)
        {
            viewholder.mImageViewLogo = imageview;
            return imageview;
        }

*/

        ProviderGridViewAdapter.ViewHolder()
        {
        }
    }


    private static final String ARG_MVPDS = "ARG_MVPDS";
    private static final String TAG = "SelectProviderFragment";
    Configuration config;
    MvpdLookups lookups;
    private TableLayout mTableLayout;
    AuthService pass;

    public SelectProviderFragment()
    {
    }

    private android.widget.TableRow.LayoutParams buildProviderLayoutParams(int i, int j, int k)
    {
        return new android.widget.TableRow.LayoutParams(0, -2, 1.0F);
    }

    public static SelectProviderFragment getInstance(ArrayList arraylist)
    {
        SelectProviderFragment selectproviderfragment = new SelectProviderFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_MVPDS", arraylist);
        selectproviderfragment.setArguments(bundle);
        return selectproviderfragment;
    }

    private void selectMvpd(Mvpd mvpd)
    {
        ((SelectProviderActivity)getActivity()).setSelectedMvpd(mvpd);
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

    private void updateView()
    {
        final ArrayList finalListOfPremium = (ArrayList)getArguments().getSerializable("ARG_MVPDS");
        ArrayList arraylist = new ArrayList();
        finalListOfPremium = finalListOfPremium.iterator();
        do
        {
            if (!finalListOfPremium.hasNext())
            {
                break;
            }
            Mvpd mvpd = (Mvpd)finalListOfPremium.next();
            if (isPremiumMvpd(mvpd) && !pass.isBlacklisted(mvpd))
            {
                arraylist.add(mvpd);
            }
        } while (true);
        finalListOfPremium = new ArrayList(sortPremiumMvpds(arraylist));
        arraylist = new ArrayList();
label0:
        for (int i = 0; i < finalListOfPremium.size(); i++)
        {
            Iterator iterator = lookups.getLogos().values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                Logo logo = (Logo)iterator.next();
                if (logo.getId().equals(((Mvpd)finalListOfPremium.get(i)).getId()))
                {
                    arraylist.add(logo);
                }
            } while (true);
        }

        ProviderGridViewAdapter providergridviewadapter = new ProviderGridViewAdapter(getActivity(), arraylist);
        if (mTableLayout != null)
        {
            mTableLayout.removeAllViews();
            int l = getResources().getInteger(0x7f0c000c);
            TableRow tablerow = null;
            for (final int position = 0; position < providergridviewadapter.getCount(); position++)
            {
                int j = position % l;
                if (j == 0)
                {
                    tablerow = new TableRow(getActivity());
                }
                View view = providergridviewadapter.getView(position, null, tablerow);
                view.setOnClickListener(new android.view.View.OnClickListener() {

                    final SelectProviderFragment this$0;
                    final ArrayList val$finalListOfPremium;
                    final int val$position;

                    public void onClick(View view1)
                    {
                        selectMvpd((Mvpd)finalListOfPremium.get(position));
                    }

            
            {
                this$0 = SelectProviderFragment.this;
                finalListOfPremium = arraylist;
                position = i;
                super();
            }
                });
                tablerow.addView(view, buildProviderLayoutParams(position, l, j));
                if (j != l - 1 && position != providergridviewadapter.getCount() - 1)
                {
                    continue;
                }
                for (int k = 0; k < l - tablerow.getChildCount(); k++)
                {
                    tablerow.addView(new View(getActivity()), new android.widget.TableRow.LayoutParams(0, 5, 1.0F));
                }

                mTableLayout.addView(tablerow, new android.widget.TableLayout.LayoutParams(-1, -2, l));
            }

        }
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

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        ((SelectProviderActivity)getActivity()).component().inject(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04003e, viewgroup, false);
        mTableLayout = (TableLayout)layoutinflater.findViewById(0x7f0f00f3);
        layoutinflater.findViewById(0x7f0f00f0).setOnClickListener(new android.view.View.OnClickListener() {

            final SelectProviderFragment this$0;
            final View val$layout;
            final View val$progressBar;

            public void onClick(View view)
            {
                if (isActivityDead())
                {
                    return;
                } else
                {
                    ((SelectProviderActivity)getActivity()).showProviderList((ArrayList)getArguments().getSerializable("ARG_MVPDS"));
                    layout.setVisibility(4);
                    progressBar.setVisibility(0);
                    return;
                }
            }

            
            {
                this$0 = SelectProviderFragment.this;
                layout = view;
                progressBar = view1;
                super();
            }
        });
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        updateView();
    }

}
