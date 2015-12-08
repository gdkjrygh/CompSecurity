// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.NetUtils;

// Referenced classes of package org.xbmc.kore.host:
//            HostConnectionObserver, HostInfo

public class HostManager
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/host/HostManager);
    private static volatile HostManager instance = null;
    private Context context;
    private HostConnection currentHostConnection;
    private HostConnectionObserver currentHostConnectionObserver;
    private HostInfo currentHostInfo;
    private Picasso currentPicasso;
    private ArrayList hosts;

    protected HostManager(Context context1)
    {
        hosts = new ArrayList();
        currentHostInfo = null;
        currentHostConnection = null;
        currentPicasso = null;
        currentHostConnectionObserver = null;
        context = context1.getApplicationContext();
    }

    public static HostManager getInstance(Context context1)
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        org/xbmc/kore/host/HostManager;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new HostManager(context1);
        }
        org/xbmc/kore/host/HostManager;
        JVM INSTR monitorexit ;
_L2:
        return instance;
        context1;
        org/xbmc/kore/host/HostManager;
        JVM INSTR monitorexit ;
        throw context1;
    }

    private void releaseCurrentHost()
    {
        if (currentHostConnectionObserver != null)
        {
            currentHostConnectionObserver.stopObserving();
            currentHostConnectionObserver = null;
        }
        if (currentHostConnection != null)
        {
            currentHostConnection.disconnect();
            currentHostConnection = null;
        }
        if (currentPicasso != null)
        {
            currentPicasso = null;
        }
    }

    public HostInfo addHost(String s, String s1, int i, int j, int k, String s2, String s3, 
            String s4, int l, boolean flag, int i1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("name", s);
        contentvalues.put("address", s1);
        contentvalues.put("protocol", Integer.valueOf(i));
        contentvalues.put("http_port", Integer.valueOf(j));
        contentvalues.put("tcp_port", Integer.valueOf(k));
        contentvalues.put("username", s2);
        contentvalues.put("password", s3);
        contentvalues.put("mac_address", s4);
        contentvalues.put("wol_port", Integer.valueOf(l));
        contentvalues.put("use_event_server", Boolean.valueOf(flag));
        contentvalues.put("event_server_port", Integer.valueOf(i1));
        long l1 = Long.valueOf(org.xbmc.kore.provider.MediaContract.Hosts.getHostId(context.getContentResolver().insert(org.xbmc.kore.provider.MediaContract.Hosts.CONTENT_URI, contentvalues))).longValue();
        hosts = getHosts(true);
        s1 = null;
        s2 = hosts.iterator();
        do
        {
            s = s1;
            if (!s2.hasNext())
            {
                break;
            }
            s = (HostInfo)s2.next();
        } while ((long)s.getId() != l1);
        return s;
    }

    public HostInfo addHost(HostInfo hostinfo)
    {
        return addHost(hostinfo.getName(), hostinfo.getAddress(), hostinfo.getProtocol(), hostinfo.getHttpPort(), hostinfo.getTcpPort(), hostinfo.getUsername(), hostinfo.getPassword(), hostinfo.getMacAddress(), hostinfo.getWolPort(), hostinfo.getUseEventServer(), hostinfo.getEventServerPort());
    }

    public void deleteHost(final int hostId)
    {
        (new Thread(new Runnable() {

            final HostManager this$0;
            final int val$hostId;

            public void run()
            {
                context.getContentResolver().delete(org.xbmc.kore.provider.MediaContract.Hosts.buildHostUri(hostId), null, null);
            }

            
            {
                this$0 = HostManager.this;
                hostId = i;
                super();
            }
        })).start();
        byte byte0 = -1;
        int i = 0;
        do
        {
label0:
            {
                int j = byte0;
                if (i < hosts.size())
                {
                    if (((HostInfo)hosts.get(i)).getId() != hostId)
                    {
                        break label0;
                    }
                    j = i;
                }
                if (j != -1)
                {
                    hosts.remove(j);
                }
                if (currentHostInfo != null && currentHostInfo.getId() == hostId)
                {
                    releaseCurrentHost();
                    if (hosts.size() > 0)
                    {
                        switchHost((HostInfo)hosts.get(0));
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    public HostInfo editHost(int i, HostInfo hostinfo)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("name", hostinfo.getName());
        contentvalues.put("address", hostinfo.getAddress());
        contentvalues.put("protocol", Integer.valueOf(hostinfo.getProtocol()));
        contentvalues.put("http_port", Integer.valueOf(hostinfo.getHttpPort()));
        contentvalues.put("tcp_port", Integer.valueOf(hostinfo.getTcpPort()));
        contentvalues.put("username", hostinfo.getUsername());
        contentvalues.put("password", hostinfo.getPassword());
        contentvalues.put("mac_address", hostinfo.getMacAddress());
        contentvalues.put("wol_port", Integer.valueOf(hostinfo.getWolPort()));
        contentvalues.put("use_event_server", Boolean.valueOf(hostinfo.getUseEventServer()));
        contentvalues.put("event_server_port", Integer.valueOf(hostinfo.getEventServerPort()));
        context.getContentResolver().update(org.xbmc.kore.provider.MediaContract.Hosts.buildHostUri(i), contentvalues, null, null);
        hosts = getHosts(true);
        contentvalues = null;
        Iterator iterator = hosts.iterator();
        do
        {
            hostinfo = contentvalues;
            if (!iterator.hasNext())
            {
                break;
            }
            hostinfo = (HostInfo)iterator.next();
        } while (hostinfo.getId() != i);
        return hostinfo;
    }

    public HostConnection getConnection()
    {
        if (currentHostConnection == null)
        {
            currentHostInfo = getHostInfo();
            if (currentHostInfo != null)
            {
                currentHostConnection = new HostConnection(currentHostInfo);
            }
        }
        return currentHostConnection;
    }

    public HostConnectionObserver getHostConnectionObserver()
    {
        if (currentHostConnectionObserver == null)
        {
            currentHostConnection = getConnection();
            if (currentHostConnection != null)
            {
                currentHostConnectionObserver = new HostConnectionObserver(currentHostConnection);
            }
        }
        return currentHostConnectionObserver;
    }

    public HostInfo getHostInfo()
    {
        if (currentHostInfo != null) goto _L2; else goto _L1
_L1:
        SharedPreferences sharedpreferences;
        Object obj;
        int i;
        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        i = sharedpreferences.getInt("current_host_id", -1);
        obj = getHosts();
        if (i != -1) goto _L4; else goto _L3
_L3:
        if (((ArrayList) (obj)).size() > 0)
        {
            currentHostInfo = (HostInfo)((ArrayList) (obj)).get(0);
            i = currentHostInfo.getId();
            sharedpreferences.edit().putInt("current_host_id", i).apply();
        }
_L2:
        return currentHostInfo;
_L4:
        Iterator iterator = ((ArrayList) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (HostInfo)iterator.next();
        } while (((HostInfo) (obj)).getId() != i);
        currentHostInfo = ((HostInfo) (obj));
        if (true) goto _L2; else goto _L5
_L5:
    }

    public ArrayList getHosts()
    {
        return getHosts(false);
    }

    public ArrayList getHosts(boolean flag)
    {
        if (flag || hosts.size() == 0)
        {
            hosts.clear();
            Cursor cursor = context.getContentResolver().query(org.xbmc.kore.provider.MediaContract.Hosts.CONTENT_URI, org.xbmc.kore.provider.MediaContract.Hosts.ALL_COLUMNS, null, null, null);
            if (cursor == null)
            {
                return hosts;
            }
            if (cursor.getCount() > 0)
            {
                while (cursor.moveToNext()) 
                {
                    int k = 0 + 1;
                    int i = cursor.getInt(0);
                    int j = k + 1;
                    cursor.getLong(k);
                    k = j + 1;
                    String s = cursor.getString(j);
                    j = k + 1;
                    String s1 = cursor.getString(k);
                    k = j + 1;
                    j = cursor.getInt(j);
                    int l = k + 1;
                    k = cursor.getInt(k);
                    int i1 = l + 1;
                    l = cursor.getInt(l);
                    int j1 = i1 + 1;
                    String s2 = cursor.getString(i1);
                    i1 = j1 + 1;
                    String s3 = cursor.getString(j1);
                    j1 = i1 + 1;
                    String s4 = cursor.getString(i1);
                    i1 = j1 + 1;
                    j1 = cursor.getInt(j1);
                    int k1 = i1 + 1;
                    if (cursor.getInt(i1) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    i1 = cursor.getInt(k1);
                    hosts.add(new HostInfo(i, s, s1, j, k, l, s2, s3, s4, j1, flag, i1));
                }
            }
            cursor.close();
        }
        return hosts;
    }

    public Picasso getPicasso()
    {
        if (currentPicasso == null)
        {
            currentHostInfo = getHostInfo();
            if (currentHostInfo != null)
            {
                OkHttpClient okhttpclient = getConnection().getOkHttpClient().clone();
                java.io.File file = NetUtils.createDefaultCacheDir(context);
                okhttpclient.setCache(new Cache(file, NetUtils.calculateDiskCacheSize(file)));
                currentPicasso = (new com.squareup.picasso.Picasso.Builder(context)).downloader(new OkHttpDownloader(okhttpclient)).build();
            }
        }
        return currentPicasso;
    }

    public void switchHost(HostInfo hostinfo)
    {
        releaseCurrentHost();
        currentHostInfo = hostinfo;
        if (currentHostInfo != null)
        {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("current_host_id", currentHostInfo.getId()).apply();
        }
    }


}
