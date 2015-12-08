// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import java.io.IOException;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.NetUtils;

public class AddHostFragmentZeroconf extends Fragment
{
    public static interface AddHostZeroconfListener
    {

        public abstract void onAddHostZeroconfFoundHost(HostInfo hostinfo);

        public abstract void onAddHostZeroconfNoHost();
    }

    private class HostListAdapter extends ArrayAdapter
    {

        final AddHostFragmentZeroconf this$0;

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = LayoutInflater.from(getActivity()).inflate(0x7f03003c, viewgroup, false);
            }
            view = (ServiceInfo)getItem(i);
            ((TextView)view1.findViewById(0x7f0e00bf)).setText(view.getName());
            viewgroup = view.getHostAddresses();
            if (viewgroup.length > 0)
            {
                view = (new StringBuilder()).append(viewgroup[0]).append(":").append(view.getPort()).toString();
            } else
            {
                view = getString(0x7f0700e3);
            }
            ((TextView)view1.findViewById(0x7f0e00c0)).setText(view);
            ((ImageView)view1.findViewById(0x7f0e00be)).setColorFilter(getActivity().getResources().getColor(0x7f0d00a3));
            ((ImageView)view1.findViewById(0x7f0e00bd)).setVisibility(8);
            return view1;
        }

        public HostListAdapter(Context context, int i, ServiceInfo aserviceinfo[])
        {
            this$0 = AddHostFragmentZeroconf.this;
            super(context, i, aserviceinfo);
        }
    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/hosts/AddHostFragmentZeroconf);
    GridView hostListGridView;
    private AddHostZeroconfListener listener;
    private final Object lock = new Object();
    TextView messageTextView;
    Button nextButton;
    Button previousButton;
    ProgressBar progressBar;
    private boolean searchCancelled;
    TextView titleTextView;

    public AddHostFragmentZeroconf()
    {
        searchCancelled = false;
    }

    public void foundHosts(final ServiceInfo serviceInfos[])
    {
        LogUtils.LOGD(TAG, (new StringBuilder()).append("Found hosts: ").append(serviceInfos.length).toString());
        titleTextView.setText(0x7f0700cb);
        messageTextView.setText(Html.fromHtml(getString(0x7f0700bb)));
        messageTextView.setMovementMethod(LinkMovementMethod.getInstance());
        nextButton.setVisibility(0);
        nextButton.setText(0x7f07005b);
        nextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AddHostFragmentZeroconf this$0;

            public void onClick(View view)
            {
                listener.onAddHostZeroconfNoHost();
            }

            
            {
                this$0 = AddHostFragmentZeroconf.this;
                super();
            }
        });
        previousButton.setVisibility(0);
        previousButton.setText(0x7f07007f);
        previousButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AddHostFragmentZeroconf this$0;

            public void onClick(View view)
            {
                startSearching();
            }

            
            {
                this$0 = AddHostFragmentZeroconf.this;
                super();
            }
        });
        progressBar.setVisibility(8);
        hostListGridView.setVisibility(0);
        HostListAdapter hostlistadapter = new HostListAdapter(getActivity(), 0x7f03003c, serviceInfos);
        hostListGridView.setAdapter(hostlistadapter);
        hostListGridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AddHostFragmentZeroconf this$0;
            final ServiceInfo val$serviceInfos[];

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = serviceInfos[i];
                view = adapterview.getHostAddresses();
                if (view.length == 0)
                {
                    Toast.makeText(getActivity(), 0x7f0700e2, 1).show();
                    return;
                } else
                {
                    adapterview = new HostInfo(adapterview.getName(), view[0], 0, adapterview.getPort(), 9090, null, null, true, 9777);
                    listener.onAddHostZeroconfFoundHost(adapterview);
                    return;
                }
            }

            
            {
                this$0 = AddHostFragmentZeroconf.this;
                serviceInfos = aserviceinfo;
                super();
            }
        });
    }

    public void noHostFound()
    {
        titleTextView.setText(0x7f070068);
        messageTextView.setText(Html.fromHtml(getString(0x7f0700bd)));
        messageTextView.setMovementMethod(LinkMovementMethod.getInstance());
        progressBar.setVisibility(8);
        hostListGridView.setVisibility(8);
        nextButton.setVisibility(0);
        nextButton.setText(0x7f07005b);
        nextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AddHostFragmentZeroconf this$0;

            public void onClick(View view)
            {
                listener.onAddHostZeroconfNoHost();
            }

            
            {
                this$0 = AddHostFragmentZeroconf.this;
                super();
            }
        });
        previousButton.setVisibility(0);
        previousButton.setText(0x7f07007f);
        previousButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AddHostFragmentZeroconf this$0;

            public void onClick(View view)
            {
                startSearching();
            }

            
            {
                this$0 = AddHostFragmentZeroconf.this;
                super();
            }
        });
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (getView() == null)
        {
            return;
        } else
        {
            startSearching();
            return;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listener = (AddHostZeroconfListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement AddHostZeroconfListener interface.").toString());
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030025, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void startSearching()
    {
        LogUtils.LOGD(TAG, "Starting service discovery...");
        searchCancelled = false;
        Thread thread = new Thread(new Runnable() {

            final AddHostFragmentZeroconf this$0;
            final Handler val$handler;

            public void run()
            {
                android.net.wifi.WifiManager.MulticastLock multicastlock;
                android.net.wifi.WifiManager.MulticastLock multicastlock1;
                android.net.wifi.WifiManager.MulticastLock multicastlock2;
                Object obj;
                WifiManager wifimanager;
                wifimanager = (WifiManager)getActivity().getSystemService("wifi");
                obj = null;
                multicastlock2 = null;
                multicastlock1 = multicastlock2;
                multicastlock = ((android.net.wifi.WifiManager.MulticastLock) (obj));
                java.net.InetAddress inetaddress = NetUtils.intToInetAddress(wifimanager.getConnectionInfo().getIpAddress());
                multicastlock1 = multicastlock2;
                multicastlock = ((android.net.wifi.WifiManager.MulticastLock) (obj));
                multicastlock2 = wifimanager.createMulticastLock("kore2.multicastlock");
                multicastlock1 = multicastlock2;
                multicastlock = multicastlock2;
                multicastlock2.setReferenceCounted(false);
                multicastlock1 = multicastlock2;
                multicastlock = multicastlock2;
                multicastlock2.acquire();
                if (inetaddress == null) goto _L2; else goto _L1
_L1:
                multicastlock1 = multicastlock2;
                multicastlock = multicastlock2;
                obj = JmDNS.create(inetaddress);
_L6:
                multicastlock1 = multicastlock2;
                multicastlock = multicastlock2;
                ServiceInfo aserviceinfo[] = ((JmDNS) (obj)).list("_xbmc-jsonrpc-h._tcp.local.", 5000L);
                multicastlock1 = multicastlock2;
                multicastlock = multicastlock2;
                obj = lock;
                multicastlock1 = multicastlock2;
                multicastlock = multicastlock2;
                obj;
                JVM INSTR monitorenter ;
                if (!searchCancelled && isAdded())
                {
                    handler.post(aserviceinfo. new Runnable() {

                        final _cls1 this$1;
                        final ServiceInfo val$serviceInfos[];

                        public void run()
                        {
                            if (serviceInfos == null || serviceInfos.length == 0)
                            {
                                noHostFound();
                                return;
                            } else
                            {
                                foundHosts(serviceInfos);
                                return;
                            }
                        }

            
            {
                this$1 = final__pcls1;
                serviceInfos = _5B_Ljavax.jmdns.ServiceInfo_3B_.this;
                super();
            }
                    });
                }
                obj;
                JVM INSTR monitorexit ;
                if (multicastlock2 != null)
                {
                    multicastlock2.release();
                }
_L4:
                return;
_L2:
                multicastlock1 = multicastlock2;
                multicastlock = multicastlock2;
                obj = JmDNS.create();
                continue; /* Loop/switch isn't completed */
                Exception exception1;
                exception1;
                obj;
                JVM INSTR monitorexit ;
                multicastlock1 = multicastlock2;
                multicastlock = multicastlock2;
                throw exception1;
                IOException ioexception;
                ioexception;
                multicastlock = multicastlock1;
                LogUtils.LOGD(AddHostFragmentZeroconf.TAG, "Got an IO Exception", ioexception);
                if (multicastlock1 == null) goto _L4; else goto _L3
_L3:
                multicastlock1.release();
                return;
                Exception exception;
                exception;
                if (multicastlock != null)
                {
                    multicastlock.release();
                }
                throw exception;
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                this$0 = AddHostFragmentZeroconf.this;
                handler = handler1;
                super();
            }
        });
        titleTextView.setText(0x7f070080);
        messageTextView.setText(Html.fromHtml(getString(0x7f0700bc)));
        messageTextView.setMovementMethod(LinkMovementMethod.getInstance());
        progressBar.setVisibility(0);
        hostListGridView.setVisibility(8);
        nextButton.setVisibility(4);
        previousButton.setVisibility(0);
        previousButton.setText(0x1040000);
        previousButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AddHostFragmentZeroconf this$0;

            public void onClick(View view)
            {
                synchronized (lock)
                {
                    searchCancelled = true;
                    noHostFound();
                }
                return;
                exception;
                view;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = AddHostFragmentZeroconf.this;
                super();
            }
        });
        thread.start();
    }





/*
    static boolean access$102(AddHostFragmentZeroconf addhostfragmentzeroconf, boolean flag)
    {
        addhostfragmentzeroconf.searchCancelled = flag;
        return flag;
    }

*/


}
