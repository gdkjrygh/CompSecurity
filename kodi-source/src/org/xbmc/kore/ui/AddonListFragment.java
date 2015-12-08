// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

public class AddonListFragment extends Fragment
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
    private class AddonsAdapter extends ArrayAdapter
    {

        private int artHeight;
        private int artWidth;
        private HostManager hostManager;
        final AddonListFragment this$0;

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = LayoutInflater.from(getActivity()).inflate(0x7f030036, viewgroup, false);
                view = new ViewHolder();
                view.titleView = (TextView)view1.findViewById(0x7f0e002d);
                view.detailsView = (TextView)view1.findViewById(0x7f0e00a5);
                view.artView = (ImageView)view1.findViewById(0x7f0e0070);
                view1.setTag(view);
            }
            view = (ViewHolder)view1.getTag();
            viewgroup = (org.xbmc.kore.jsonrpc.type.AddonType.Details)getItem(i);
            view.addonId = ((org.xbmc.kore.jsonrpc.type.AddonType.Details) (viewgroup)).addonid;
            view.addonName = ((org.xbmc.kore.jsonrpc.type.AddonType.Details) (viewgroup)).name;
            ((ViewHolder) (view)).titleView.setText(((ViewHolder) (view)).addonName);
            ((ViewHolder) (view)).detailsView.setText(((org.xbmc.kore.jsonrpc.type.AddonType.Details) (viewgroup)).summary);
            UIUtils.loadImageWithCharacterAvatar(getContext(), hostManager, ((org.xbmc.kore.jsonrpc.type.AddonType.Details) (viewgroup)).thumbnail, ((ViewHolder) (view)).addonName, ((ViewHolder) (view)).artView, artWidth, artHeight);
            return view1;
        }

        public AddonsAdapter(Context context, int i)
        {
            this$0 = AddonListFragment.this;
            super(context, i);
            hostManager = HostManager.getInstance(context);
            addonlistfragment = context.getResources();
            artWidth = (int)(getDimension(0x7f080012) / 1.0F);
            artHeight = (int)(getDimension(0x7f080011) / 1.0F);
        }
    }

    public static interface OnAddonSelectedListener
    {

        public abstract void onAddonSelected(String s, String s1);
    }

    private static class ViewHolder
    {

        String addonId;
        String addonName;
        ImageView artView;
        TextView detailsView;
        TextView titleView;

        private ViewHolder()
        {
        }

    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/AddonListFragment);
    private AddonsAdapter adapter;
    GridView addonsGridView;
    private Handler callbackHandler;
    TextView emptyView;
    private HostManager hostManager;
    private OnAddonSelectedListener listenerActivity;
    SwipeRefreshLayout swipeRefreshLayout;

    public AddonListFragment()
    {
        callbackHandler = new Handler();
        adapter = null;
    }

    private void callGetAddonsAndSetup()
    {
        swipeRefreshLayout.setRefreshing(true);
        (new org.xbmc.kore.jsonrpc.method.Addons.GetAddons(new String[] {
            "name", "version", "summary", "description", "path", "author", "thumbnail", "disclaimer", "fanart", "rating", 
            "enabled"
        })).execute(hostManager.getConnection(), new ApiCallback() {

            final AddonListFragment this$0;

            public void onError(int i, String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    emptyView.setText(getString(0x7f07005c));
                    Toast.makeText(getActivity(), String.format(getString(0x7f07003e), new Object[] {
                        s
                    }), 0).show();
                    swipeRefreshLayout.setRefreshing(false);
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((List)obj);
            }

            public void onSuccess(List list)
            {
                if (!isAdded())
                {
                    return;
                }
                adapter.clear();
                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    org.xbmc.kore.jsonrpc.type.AddonType.Details details = (org.xbmc.kore.jsonrpc.type.AddonType.Details)list.next();
                    if (details.type.equals("unknown") || details.type.equals("xbmc.python.pluginsource") || details.type.equals("xbmc.python.script") || details.type.equals("xbmc.addon.audio") || details.type.equals("xbmc.addon.executable") || details.type.equals("xbmc.addon.video") || details.type.equals("xbmc.addon.image"))
                    {
                        adapter.add(details);
                    }
                } while (true);
                emptyView.setText(getString(0x7f07005c));
                adapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
            }

            
            {
                this$0 = AddonListFragment.this;
                super();
            }
        }, callbackHandler);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(false);
        if (adapter.getCount() == 0)
        {
            callGetAddonsAndSetup();
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listenerActivity = (OnAddonSelectedListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement OnAddonSelectedListener").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030029, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        hostManager = HostManager.getInstance(getActivity());
        swipeRefreshLayout.setOnRefreshListener(this);
        emptyView.setOnClickListener(new android.view.View.OnClickListener() {

            final AddonListFragment this$0;

            public void onClick(View view)
            {
                onRefresh();
            }

            
            {
                this$0 = AddonListFragment.this;
                super();
            }
        });
        addonsGridView.setEmptyView(emptyView);
        addonsGridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AddonListFragment this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (ViewHolder)view.getTag();
                listenerActivity.onAddonSelected(((ViewHolder) (adapterview)).addonId, ((ViewHolder) (adapterview)).addonName);
            }

            
            {
                this$0 = AddonListFragment.this;
                super();
            }
        });
        if (adapter == null)
        {
            adapter = new AddonsAdapter(getActivity(), 0x7f030036);
        }
        addonsGridView.setAdapter(adapter);
        return layoutinflater;
    }

    public void onDetach()
    {
        super.onDetach();
        listenerActivity = null;
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onRefresh()
    {
        if (hostManager.getHostInfo() != null)
        {
            callGetAddonsAndSetup();
            return;
        } else
        {
            swipeRefreshLayout.setRefreshing(false);
            Toast.makeText(getActivity(), 0x7f070067, 0).show();
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
    }



}
