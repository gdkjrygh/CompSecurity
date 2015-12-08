// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.ui.BaseActivity;
import org.xbmc.kore.ui.RemoteActivity;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            AddHostFragmentZeroconf, HostFragmentManualConfiguration, AddHostFragmentWelcome, AddHostFragmentFinish

public class AddHostActivity extends BaseActivity
    implements AddHostFragmentFinish.AddHostFinishListener, AddHostFragmentWelcome.AddHostWelcomeListener, AddHostFragmentZeroconf.AddHostZeroconfListener, HostFragmentManualConfiguration.HostManualConfigurationListener
{

    private Fragment previousFragment;

    public AddHostActivity()
    {
        previousFragment = null;
    }

    private void switchToFragment(Fragment fragment)
    {
        getSupportFragmentManager().beginTransaction().replace(0x7f0e0053, fragment).commit();
    }

    public void onAddHostFinish()
    {
        startActivity((new Intent(this, org/xbmc/kore/ui/RemoteActivity)).addFlags(0x4000000));
    }

    public void onAddHostWelcomeCancel()
    {
        finish();
    }

    public void onAddHostWelcomeNext()
    {
        switchToFragment(new AddHostFragmentZeroconf());
    }

    public void onAddHostZeroconfFoundHost(HostInfo hostinfo)
    {
        HostFragmentManualConfiguration hostfragmentmanualconfiguration = new HostFragmentManualConfiguration();
        Bundle bundle = new Bundle();
        if (hostinfo != null)
        {
            bundle.putString("org.xbmc.kore.host_name", hostinfo.getName());
            bundle.putString("org.xbmc.kore.host_address", hostinfo.getAddress());
            bundle.putInt("org.xbmc.kore.host_http_port", hostinfo.getHttpPort());
            bundle.putInt("org.xbmc.kore.host_tcp_post", hostinfo.getTcpPort());
            bundle.putString("org.xbmc.kore.host_username", hostinfo.getUsername());
            bundle.putString("org.xbmc.kore.host_password", hostinfo.getPassword());
            bundle.putInt("org.xbmc.kore.host_protocol", hostinfo.getProtocol());
            bundle.putBoolean("org.xbmc.kore.host_use_event_server", hostinfo.getUseEventServer());
            bundle.putInt("org.xbmc.kore.host_event_server_port", hostinfo.getEventServerPort());
            bundle.putBoolean("org.xbmc.kore.go_straight_to_test", true);
            hostfragmentmanualconfiguration.setArguments(bundle);
        }
        bundle.putString(HostFragmentManualConfiguration.CANCEL_BUTTON_LABEL_ARG, getString(0x7f070077));
        hostfragmentmanualconfiguration.setArguments(bundle);
        switchToFragment(hostfragmentmanualconfiguration);
    }

    public void onAddHostZeroconfNoHost()
    {
        HostFragmentManualConfiguration hostfragmentmanualconfiguration = new HostFragmentManualConfiguration();
        Bundle bundle = new Bundle();
        bundle.putString(HostFragmentManualConfiguration.CANCEL_BUTTON_LABEL_ARG, getString(0x7f070077));
        hostfragmentmanualconfiguration.setArguments(bundle);
        switchToFragment(hostfragmentmanualconfiguration);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001c);
        if (bundle == null)
        {
            bundle = new AddHostFragmentWelcome();
            getSupportFragmentManager().beginTransaction().add(0x7f0e0053, bundle).commit();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }

    public void onHostManualConfigurationCancel()
    {
        switchToFragment(new AddHostFragmentZeroconf());
    }

    public void onHostManualConfigurationNext(HostInfo hostinfo)
    {
        HostManager hostmanager = HostManager.getInstance(this);
        hostmanager.switchHost(hostmanager.addHost(hostinfo));
        switchToFragment(new AddHostFragmentFinish());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            finish();
            break;
        }
        return true;
    }
}
