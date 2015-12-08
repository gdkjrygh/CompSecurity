// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.ui.BaseActivity;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostFragmentManualConfiguration, HostManagerActivity

public class EditHostActivity extends BaseActivity
    implements HostFragmentManualConfiguration.HostManualConfigurationListener
{

    private int hostId;

    public EditHostActivity()
    {
        hostId = -1;
    }

    private void setupActionBar()
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(0x7f07003a);
            TypedArray typedarray = getTheme().obtainStyledAttributes(new int[] {
                0x7f01001a
            });
            actionbar.setIcon(typedarray.getResourceId(0, 0x7f020072));
            typedarray.recycle();
            actionbar.setDisplayHomeAsUpEnabled(true);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001c);
        if (bundle == null)
        {
            HostFragmentManualConfiguration hostfragmentmanualconfiguration = new HostFragmentManualConfiguration();
            bundle = getIntent().getExtras();
            if (bundle != null)
            {
                hostId = bundle.getInt("org.xbmc.kore.host_id");
                bundle = HostManager.getInstance(this);
                Object obj = null;
                Iterator iterator = bundle.getHosts().iterator();
                do
                {
                    bundle = obj;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    bundle = (HostInfo)iterator.next();
                } while (bundle.getId() != hostId);
                if (bundle != null)
                {
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("org.xbmc.kore.host_name", bundle.getName());
                    bundle1.putString("org.xbmc.kore.host_address", bundle.getAddress());
                    bundle1.putInt("org.xbmc.kore.host_http_port", bundle.getHttpPort());
                    bundle1.putInt("org.xbmc.kore.host_tcp_post", bundle.getTcpPort());
                    bundle1.putString("org.xbmc.kore.host_username", bundle.getUsername());
                    bundle1.putString("org.xbmc.kore.host_password", bundle.getPassword());
                    bundle1.putInt("org.xbmc.kore.host_protocol", bundle.getProtocol());
                    bundle1.putString("org.xbmc.kore.host_mac_address", bundle.getMacAddress());
                    bundle1.putInt("org.xbmc.kore.host_wol_port", bundle.getWolPort());
                    bundle1.putBoolean("org.xbmc.kore.host_use_event_server", bundle.getUseEventServer());
                    bundle1.putInt("org.xbmc.kore.host_event_server_port", bundle.getEventServerPort());
                    hostfragmentmanualconfiguration.setArguments(bundle1);
                }
            }
            getSupportFragmentManager().beginTransaction().add(0x7f0e0053, hostfragmentmanualconfiguration).commit();
        }
        setupActionBar();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }

    public void onHostManualConfigurationCancel()
    {
        finish();
    }

    public void onHostManualConfigurationNext(HostInfo hostinfo)
    {
        if (hostId != -1)
        {
            HostManager hostmanager = HostManager.getInstance(this);
            hostmanager.switchHost(hostmanager.editHost(hostId, hostinfo));
        }
        startActivity((new Intent(this, org/xbmc/kore/ui/hosts/HostManagerActivity)).addFlags(0x4000000));
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
