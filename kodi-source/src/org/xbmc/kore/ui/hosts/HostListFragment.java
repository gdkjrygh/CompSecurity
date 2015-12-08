// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.ui.RemoteActivity;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            AddHostActivity, EditHostActivity

public class HostListFragment extends Fragment
{
    public static class ConfirmDeleteDialogFragment extends DialogFragment
    {

        private ConfirmDeleteDialogListener mListener;

        public static ConfirmDeleteDialogFragment getInstance(ConfirmDeleteDialogListener confirmdeletedialoglistener)
        {
            ConfirmDeleteDialogFragment confirmdeletedialogfragment = new ConfirmDeleteDialogFragment();
            confirmdeletedialogfragment.mListener = confirmdeletedialoglistener;
            return confirmdeletedialogfragment;
        }

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = new android.app.AlertDialog.Builder(getActivity());
            bundle.setTitle(0x7f07002f).setMessage(0x7f070030).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final ConfirmDeleteDialogFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    mListener.onDialogPositiveClick();
                }

            
            {
                this$0 = ConfirmDeleteDialogFragment.this;
                super();
            }
            }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                final ConfirmDeleteDialogFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    mListener.onDialogNegativeClick();
                }

            
            {
                this$0 = ConfirmDeleteDialogFragment.this;
                super();
            }
            });
            return bundle.create();
        }


        public ConfirmDeleteDialogFragment()
        {
        }
    }

    public static interface ConfirmDeleteDialogFragment.ConfirmDeleteDialogListener
    {

        public abstract void onDialogNegativeClick();

        public abstract void onDialogPositiveClick();
    }

    private class HostInfoRow
    {

        public HostInfo hostInfo;
        public int status;
        final HostListFragment this$0;

        public HostInfoRow(HostInfo hostinfo, int i)
        {
            this$0 = HostListFragment.this;
            super();
            hostInfo = hostinfo;
            status = i;
        }
    }

    private class HostListAdapter extends ArrayAdapter
    {

        final HostListFragment this$0;

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1;
            view1 = view;
            if (view == null)
            {
                view1 = LayoutInflater.from(getActivity()).inflate(0x7f03003c, viewgroup, false);
            }
            view = (HostInfoRow)getItem(i);
            ((TextView)view1.findViewById(0x7f0e00bf)).setText(((HostInfoRow) (view)).hostInfo.getName());
            viewgroup = (new StringBuilder()).append(((HostInfoRow) (view)).hostInfo.getAddress()).append(":").append(((HostInfoRow) (view)).hostInfo.getHttpPort()).toString();
            ((TextView)view1.findViewById(0x7f0e00c0)).setText(viewgroup);
            viewgroup = (ImageView)view1.findViewById(0x7f0e00be);
            ((HostInfoRow) (view)).status;
            JVM INSTR tableswitch 0 2: default 148
        //                       0 158
        //                       1 231
        //                       2 212;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new RuntimeException("Invalid host status");
_L2:
            i = getActivity().getResources().getColor(0x7f0d00a4);
_L6:
            viewgroup.setColorFilter(i);
            viewgroup = (ImageView)view1.findViewById(0x7f0e00bd);
            viewgroup.setTag(((HostInfoRow) (view)).hostInfo);
            viewgroup.setOnClickListener(hostlistItemMenuClickListener);
            return view1;
_L4:
            i = getActivity().getResources().getColor(0x7f0d00a5);
            continue; /* Loop/switch isn't completed */
_L3:
            i = getActivity().getResources().getColor(0x7f0d00a3);
            if (true) goto _L6; else goto _L5
_L5:
        }

        public HostListAdapter(Context context1, int i, List list)
        {
            this$0 = HostListFragment.this;
            super(context1, i, list);
        }
    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/hosts/HostListFragment);
    private HostListAdapter adapter;
    Button addHostButton;
    private Handler callbackHandler;
    private Context context;
    GridView hostGridView;
    private ArrayList hostInfoRows;
    private android.view.View.OnClickListener hostlistItemMenuClickListener;

    public HostListFragment()
    {
        hostInfoRows = new ArrayList();
        adapter = null;
        callbackHandler = new Handler();
        hostlistItemMenuClickListener = new android.view.View.OnClickListener() {

            final HostListFragment this$0;

            public void onClick(View view)
            {
                HostInfo hostinfo = (HostInfo)view.getTag();
                view = new PopupMenu(getActivity(), view);
                view.getMenuInflater().inflate(0x7f0f0002, view.getMenu());
                view.setOnMenuItemClickListener(hostinfo. new android.widget.PopupMenu.OnMenuItemClickListener() {

                    final _cls3 this$1;
                    final HostInfo val$hostInfo;

                    public boolean onMenuItemClick(MenuItem menuitem)
                    {
                        switch (menuitem.getItemId())
                        {
                        default:
                            return false;

                        case 2131624157: 
                            ConfirmDeleteDialogFragment.getInstance(getDeleteDialogListener(hostInfo.getId())).show(getFragmentManager(), "confirmdelete");
                            return true;

                        case 2131624158: 
                            menuitem = (new Intent(getActivity(), org/xbmc/kore/ui/hosts/EditHostActivity)).addFlags(0x20000000).putExtra("org.xbmc.kore.host_id", hostInfo.getId());
                            startActivity(menuitem);
                            getActivity().overridePendingTransition(0x7f04000a, 0x7f04000b);
                            return true;

                        case 2131624159: 
                            UIUtils.sendWolAsync(getActivity(), hostInfo);
                            break;
                        }
                        return true;
                    }

            
            {
                this$1 = final__pcls3;
                hostInfo = HostInfo.this;
                super();
            }
                });
                view.show();
            }

            
            {
                this$0 = HostListFragment.this;
                super();
            }
        };
    }

    private ConfirmDeleteDialogFragment.ConfirmDeleteDialogListener getDeleteDialogListener(final int hostId)
    {
        return new ConfirmDeleteDialogFragment.ConfirmDeleteDialogListener() {

            final HostListFragment this$0;
            final int val$hostId;

            public void onDialogNegativeClick()
            {
            }

            public void onDialogPositiveClick()
            {
                HostManager.getInstance(getActivity()).deleteHost(hostId);
                int i = 0;
                do
                {
label0:
                    {
                        if (i < hostInfoRows.size())
                        {
                            if (((HostInfoRow)hostInfoRows.get(i)).hostInfo.getId() != hostId)
                            {
                                break label0;
                            }
                            hostInfoRows.remove(i);
                        }
                        adapter.notifyDataSetChanged();
                        return;
                    }
                    i++;
                } while (true);
            }

            
            {
                this$0 = HostListFragment.this;
                hostId = i;
                super();
            }
        };
    }

    private void updateHostStatus(final HostInfoRow hostInfoRow)
    {
        final HostConnection hostConnection = new HostConnection(hostInfoRow.hostInfo);
        (new org.xbmc.kore.jsonrpc.method.JSONRPC.Ping()).execute(hostConnection, new ApiCallback() {

            final HostListFragment this$0;
            final HostConnection val$hostConnection;
            final HostInfoRow val$hostInfoRow;

            public void onError(int i, String s)
            {
                hostInfoRow.status = 2;
                hostConnection.disconnect();
                if (adapter != null)
                {
                    adapter.notifyDataSetChanged();
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                hostInfoRow.status = 1;
                hostConnection.disconnect();
                if (adapter != null)
                {
                    adapter.notifyDataSetChanged();
                }
            }

            
            {
                this$0 = HostListFragment.this;
                hostInfoRow = hostinforow;
                hostConnection = hostconnection;
                super();
            }
        }, callbackHandler);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(true);
    }

    public void onAddHostClicked(View view)
    {
        startAddHostWizard();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f0f0001, menu);
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, final ViewGroup hostManager, Bundle bundle)
    {
        context = layoutinflater.getContext();
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f03002a, hostManager, false);
        ButterKnife.inject(this, layoutinflater);
        hostManager = HostManager.getInstance(context);
        bundle = hostManager.getHosts();
        HostInfo hostinfo = hostManager.getHostInfo();
        int j = 0;
        for (int i = 0; i < bundle.size();)
        {
            int k = j;
            if (hostinfo != null)
            {
                k = j;
                if (((HostInfo)bundle.get(i)).getId() == hostinfo.getId())
                {
                    k = i;
                }
            }
            hostInfoRows.add(new HostInfoRow((HostInfo)bundle.get(i), 0));
            i++;
            j = k;
        }

        hostGridView.setEmptyView(layoutinflater.findViewById(0x1020004));
        adapter = new HostListAdapter(context, 0x7f03003c, hostInfoRows);
        hostGridView.setAdapter(adapter);
        hostGridView.setItemChecked(j, true);
        hostGridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final HostListFragment this$0;
            final HostManager val$hostManager;

            public void onItemClick(AdapterView adapterview, View view, int l, long l1)
            {
                adapterview = (HostInfoRow)hostInfoRows.get(l);
                hostManager.switchHost(((HostInfoRow) (adapterview)).hostInfo);
                adapterview = new Intent(context, org/xbmc/kore/ui/RemoteActivity);
                context.startActivity(adapterview);
            }

            
            {
                this$0 = HostListFragment.this;
                hostManager = hostmanager;
                super();
            }
        });
        return layoutinflater;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131624076 2131624076: default 24
    //                   2131624076 30;
           goto _L1 _L2
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        startAddHostWizard();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        for (Iterator iterator = hostInfoRows.iterator(); iterator.hasNext(); updateHostStatus((HostInfoRow)iterator.next())) { }
    }

    public void startAddHostWizard()
    {
        startActivity((new Intent(getActivity(), org/xbmc/kore/ui/hosts/AddHostActivity)).addFlags(0x20000000));
        getActivity().overridePendingTransition(0x7f04000a, 0x7f04000b);
    }






}
