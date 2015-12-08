// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.ButterKnife;
import org.xbmc.kore.eventclient.EventServerConnection;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.NetUtils;

public class HostFragmentManualConfiguration extends Fragment
{
    public static interface HostManualConfigurationListener
    {

        public abstract void onHostManualConfigurationCancel();

        public abstract void onHostManualConfigurationNext(HostInfo hostinfo);
    }


    public static String CANCEL_BUTTON_LABEL_ARG = "org.xbmc.kore.cancel_button_label";
    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/hosts/HostFragmentManualConfiguration);
    final Handler handler = new Handler();
    private HostManualConfigurationListener listener;
    private ProgressDialog progressDialog;
    EditText xbmcEventServerPortEditText;
    EditText xbmcHttpPortEditText;
    EditText xbmcIpAddressEditText;
    EditText xbmcMacAddressEditText;
    EditText xbmcNameEditText;
    EditText xbmcPasswordEditText;
    EditText xbmcTcpPortEditText;
    CheckBox xbmcUseEventServerCheckbox;
    CheckBox xbmcUseTcpCheckbox;
    EditText xbmcUsernameEditText;
    EditText xbmcWolPortEditText;

    public HostFragmentManualConfiguration()
    {
    }

    private void chainCallCheckEventServerConnection(final HostInfo hostInfo)
    {
        if (hostInfo.getUseEventServer())
        {
            EventServerConnection.testEventServerConnection(hostInfo, new org.xbmc.kore.eventclient.EventServerConnection.EventServerConnectionCallback() {

                final HostFragmentManualConfiguration this$0;
                final HostInfo val$hostInfo;

                public void OnConnectResult(boolean flag)
                {
                    LogUtils.LOGD(HostFragmentManualConfiguration.TAG, (new StringBuilder()).append("Check ES connection: ").append(flag).toString());
                    if (flag)
                    {
                        hostConnectionChecked(hostInfo);
                        return;
                    } else
                    {
                        hostInfo.setUseEventServer(false);
                        hostConnectionChecked(hostInfo);
                        return;
                    }
                }

            
            {
                this$0 = HostFragmentManualConfiguration.this;
                hostInfo = hostinfo;
                super();
            }
            }, handler);
        } else
        {
            hostConnectionChecked(hostInfo);
        }
        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("checked_event_server_connection", true).apply();
    }

    private void chainCallCheckHttpConnection(final HostInfo hostInfo)
    {
        final HostConnection hostConnection = new HostConnection(hostInfo);
        hostConnection.setProtocol(1);
        (new org.xbmc.kore.jsonrpc.method.JSONRPC.Ping()).execute(hostConnection, new ApiCallback() {

            final HostFragmentManualConfiguration this$0;
            final HostConnection val$hostConnection;
            final HostInfo val$hostInfo;

            public void onError(int i, String s)
            {
                hostConnection.disconnect();
                hostConnectionError(i, s);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                LogUtils.LOGD(HostFragmentManualConfiguration.TAG, "Successfully connected to new host through HTTP.");
                if (hostInfo.getProtocol() == 0)
                {
                    chainCallCheckTcpConnection(hostConnection, hostInfo);
                    return;
                } else
                {
                    hostConnection.disconnect();
                    chainCallCheckEventServerConnection(hostInfo);
                    return;
                }
            }

            
            {
                this$0 = HostFragmentManualConfiguration.this;
                hostInfo = hostinfo;
                hostConnection = hostconnection;
                super();
            }
        }, handler);
    }

    private void chainCallCheckTcpConnection(final HostConnection hostConnection, final HostInfo hostInfo)
    {
        org.xbmc.kore.jsonrpc.method.JSONRPC.Ping ping = new org.xbmc.kore.jsonrpc.method.JSONRPC.Ping();
        hostConnection.setProtocol(0);
        ping.execute(hostConnection, new ApiCallback() {

            final HostFragmentManualConfiguration this$0;
            final HostConnection val$hostConnection;
            final HostInfo val$hostInfo;

            public void onError(int i, String s)
            {
                LogUtils.LOGD(HostFragmentManualConfiguration.TAG, (new StringBuilder()).append("Couldn't connect to host through TCP. Message: ").append(s).toString());
                hostConnection.disconnect();
                hostInfo.setProtocol(1);
                chainCallCheckEventServerConnection(hostInfo);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                LogUtils.LOGD(HostFragmentManualConfiguration.TAG, "Successfully connected to new host through TCP.");
                hostConnection.disconnect();
                chainCallCheckEventServerConnection(hostInfo);
            }

            
            {
                this$0 = HostFragmentManualConfiguration.this;
                hostConnection = hostconnection;
                hostInfo = hostinfo;
                super();
            }
        }, handler);
    }

    private void hostConnectionChecked(final HostInfo hostInfo)
    {
        if (TextUtils.isEmpty(hostInfo.getMacAddress()))
        {
            (new Thread(new Runnable() {

                final HostFragmentManualConfiguration this$0;
                final HostInfo val$hostInfo;

                public void run()
                {
                    String s = NetUtils.getMacAddress(hostInfo.getAddress());
                    hostInfo.setMacAddress(s);
                    handler.post(new Runnable() {

                        final _cls9 this$1;

                        public void run()
                        {
                            if (isAdded())
                            {
                                progressDialog.dismiss();
                                listener.onHostManualConfigurationNext(hostInfo);
                            }
                        }

            
            {
                this$1 = _cls9.this;
                super();
            }
                    });
                }

            
            {
                this$0 = HostFragmentManualConfiguration.this;
                hostInfo = hostinfo;
                super();
            }
            })).start();
        } else
        if (isAdded())
        {
            progressDialog.dismiss();
            listener.onHostManualConfigurationNext(hostInfo);
            return;
        }
    }

    private void hostConnectionError(int i, String s)
    {
        if (!isAdded())
        {
            return;
        }
        progressDialog.dismiss();
        LogUtils.LOGD(TAG, (new StringBuilder()).append("An error occurred during connection testint. Message: ").append(s).toString());
        switch (i)
        {
        default:
            Toast.makeText(getActivity(), 0x7f0700b2, 0).show();
            return;

        case 5: // '\005'
            s = xbmcUsernameEditText.getText().toString();
            break;
        }
        String s1 = xbmcPasswordEditText.getText().toString();
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            i = 0x7f0700b1;
        } else
        {
            i = 0x7f0700b3;
        }
        Toast.makeText(getActivity(), i, 0).show();
        xbmcUsernameEditText.requestFocus();
    }

    private void testConnection()
    {
        final HostInfo checkedHostInfo;
        String s2;
        String s3;
        s2 = xbmcNameEditText.getText().toString();
        s3 = xbmcIpAddressEditText.getText().toString();
        checkedHostInfo = xbmcHttpPortEditText.getText().toString();
        boolean flag = TextUtils.isEmpty(checkedHostInfo);
        String s;
        String s1;
        String s4;
        int i;
        int j;
        int k;
        int i1;
        boolean flag1;
        if (flag)
        {
            i = 8080;
        } else
        {
            try
            {
                i = Integer.valueOf(checkedHostInfo).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (final HostInfo checkedHostInfo)
            {
                i = -1;
            }
        }
        s = xbmcUsernameEditText.getText().toString();
        s1 = xbmcPasswordEditText.getText().toString();
        checkedHostInfo = xbmcTcpPortEditText.getText().toString();
        flag = TextUtils.isEmpty(checkedHostInfo);
        if (flag)
        {
            j = 9090;
        } else
        {
            try
            {
                j = Integer.valueOf(checkedHostInfo).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (final HostInfo checkedHostInfo)
            {
                j = -1;
            }
        }
        if (xbmcUseTcpCheckbox.isChecked())
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        s4 = xbmcMacAddressEditText.getText().toString();
        checkedHostInfo = xbmcWolPortEditText.getText().toString();
        k = 9;
        flag = TextUtils.isEmpty(checkedHostInfo);
        if (!flag) goto _L2; else goto _L1
_L1:
        k = 9;
_L4:
        flag = xbmcUseEventServerCheckbox.isChecked();
        checkedHostInfo = xbmcEventServerPortEditText.getText().toString();
        flag1 = TextUtils.isEmpty(checkedHostInfo);
        break MISSING_BLOCK_LABEL_181;
_L2:
        l = Integer.valueOf(checkedHostInfo).intValue();
        k = l;
        continue; /* Loop/switch isn't completed */
        int l;
        if (flag1)
        {
            l = 9777;
        } else
        {
            try
            {
                l = Integer.valueOf(checkedHostInfo).intValue();
            }
            catch (NumberFormatException numberformatexception)
            {
                l = -1;
            }
        }
        if (TextUtils.isEmpty(s2))
        {
            Toast.makeText(getActivity(), 0x7f0700ba, 0).show();
            xbmcNameEditText.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(s3))
        {
            Toast.makeText(getActivity(), 0x7f0700b9, 0).show();
            xbmcIpAddressEditText.requestFocus();
            return;
        }
        if (i <= 0)
        {
            Toast.makeText(getActivity(), 0x7f0700b4, 0).show();
            xbmcHttpPortEditText.requestFocus();
            return;
        }
        if (j <= 0)
        {
            Toast.makeText(getActivity(), 0x7f0700b5, 0).show();
            xbmcTcpPortEditText.requestFocus();
            return;
        }
        if (l <= 0)
        {
            Toast.makeText(getActivity(), 0x7f0700b5, 0).show();
            xbmcEventServerPortEditText.requestFocus();
            return;
        }
        numberformatexception = s;
        if (TextUtils.isEmpty(s))
        {
            numberformatexception = null;
        }
        s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = null;
        }
        numberformatexception = new HostInfo(s2, s3, i1, i, j, numberformatexception, s, flag, l);
        numberformatexception.setMacAddress(s4);
        numberformatexception.setWolPort(k);
        progressDialog.setTitle(String.format(getResources().getString(0x7f0700ae), new Object[] {
            s2
        }));
        progressDialog.setMessage(getResources().getString(0x7f0700ad));
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(true);
        progressDialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

            final HostFragmentManualConfiguration this$0;
            final HostInfo val$checkedHostInfo;

            public void onShow(DialogInterface dialoginterface)
            {
                chainCallCheckHttpConnection(checkedHostInfo);
            }

            
            {
                this$0 = HostFragmentManualConfiguration.this;
                checkedHostInfo = hostinfo;
                super();
            }
        });
        progressDialog.show();
        return;
        NumberFormatException numberformatexception1;
        numberformatexception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (getView() != null)
        {
            progressDialog = new ProgressDialog(getActivity());
            bundle = (Button)getView().findViewById(0x7f0e009c);
            bundle.setText(0x7f070095);
            bundle.setCompoundDrawables(null, null, null, null);
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final HostFragmentManualConfiguration this$0;

                public void onClick(View view)
                {
                    testConnection();
                }

            
            {
                this$0 = HostFragmentManualConfiguration.this;
                super();
            }
            });
            bundle = (Button)getView().findViewById(0x7f0e0097);
            if (getArguments().getString(CANCEL_BUTTON_LABEL_ARG, null) != null)
            {
                bundle.setText(getArguments().getString(CANCEL_BUTTON_LABEL_ARG));
            } else
            {
                bundle.setText(0x1040000);
            }
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final HostFragmentManualConfiguration this$0;

                public void onClick(View view)
                {
                    listener.onHostManualConfigurationCancel();
                }

            
            {
                this$0 = HostFragmentManualConfiguration.this;
                super();
            }
            });
            if (getArguments().getBoolean("org.xbmc.kore.go_straight_to_test", false))
            {
                testConnection();
                return;
            }
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listener = (HostManualConfigurationListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement AddHostManualConfigurationListener interface.").toString());
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030023, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        xbmcUseTcpCheckbox.setChecked(true);
        xbmcUseTcpCheckbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final HostFragmentManualConfiguration this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag2)
            {
                xbmcTcpPortEditText.setEnabled(flag2);
            }

            
            {
                this$0 = HostFragmentManualConfiguration.this;
                super();
            }
        });
        xbmcUseEventServerCheckbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final HostFragmentManualConfiguration this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag2)
            {
                xbmcEventServerPortEditText.setEnabled(flag2);
            }

            
            {
                this$0 = HostFragmentManualConfiguration.this;
                super();
            }
        });
        bundle = getArguments().getString("org.xbmc.kore.host_name");
        String s = getArguments().getString("org.xbmc.kore.host_address");
        int i = getArguments().getInt("org.xbmc.kore.host_http_port", 8080);
        int j = getArguments().getInt("org.xbmc.kore.host_tcp_post", 9090);
        String s1 = getArguments().getString("org.xbmc.kore.host_username");
        String s2 = getArguments().getString("org.xbmc.kore.host_password");
        int k = getArguments().getInt("org.xbmc.kore.host_protocol", 0);
        viewgroup = getArguments().getString("org.xbmc.kore.host_mac_address");
        int l = getArguments().getInt("org.xbmc.kore.host_wol_port", 9);
        boolean flag1 = getArguments().getBoolean("org.xbmc.kore.host_use_event_server", true);
        int i1 = getArguments().getInt("org.xbmc.kore.host_event_server_port", 9777);
        if (s != null)
        {
            xbmcNameEditText.setText(bundle);
            xbmcIpAddressEditText.setText(s);
            xbmcHttpPortEditText.setText(String.valueOf(i));
            if (!TextUtils.isEmpty(s1))
            {
                xbmcUsernameEditText.setText(s1);
            }
            if (!TextUtils.isEmpty(s2))
            {
                xbmcPasswordEditText.setText(s2);
            }
            bundle = xbmcUseTcpCheckbox;
            boolean flag;
            if (k != 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bundle.setChecked(flag);
            xbmcTcpPortEditText.setEnabled(xbmcUseTcpCheckbox.isChecked());
            if (j != 9090)
            {
                xbmcTcpPortEditText.setText(String.valueOf(j));
            }
            if (!TextUtils.isEmpty(viewgroup))
            {
                xbmcMacAddressEditText.setText(viewgroup);
            }
            if (l != 9)
            {
                xbmcWolPortEditText.setText(String.valueOf(l));
            }
            xbmcUseEventServerCheckbox.setChecked(flag1);
            xbmcEventServerPortEditText.setEnabled(xbmcUseEventServerCheckbox.isChecked());
            if (i1 != 9777)
            {
                xbmcEventServerPortEditText.setText(String.valueOf(i1));
            }
        }
        return layoutinflater;
    }










}
