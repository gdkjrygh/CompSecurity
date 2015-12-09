// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.G;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.util.ExperimentUtils;
import com.google.android.play.dfe.api.PlayDfeApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity

public final class GamesSettingsDebugActivity extends GamesFragmentActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, ResultCallback
{
    private static final class ServerDescriptor
    {

        final String mDriveUrl;
        final String mFinskyUrl;
        final String mInternalVersion;
        final String mUrl;
        final String mVersion;

        public final boolean equals(Object obj)
        {
            if (obj instanceof ServerDescriptor)
            {
                if (Objects.equal(mUrl, ((ServerDescriptor) (obj = (ServerDescriptor)obj)).mUrl) && Objects.equal(mVersion, ((ServerDescriptor) (obj)).mVersion) && Objects.equal(mInternalVersion, ((ServerDescriptor) (obj)).mInternalVersion) && Objects.equal(mDriveUrl, ((ServerDescriptor) (obj)).mDriveUrl))
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                mUrl, mVersion, mInternalVersion, mDriveUrl
            });
        }

        public final String toString()
        {
            return String.format("url(%s), version(%s), internalVersion(%s), driveUrl(%s), finskyUrl(%s)", new Object[] {
                mUrl, mVersion, mInternalVersion, mDriveUrl, mFinskyUrl
            });
        }

        ServerDescriptor(String s, String s1, String s2, String s3)
        {
            this(s, s1, s2, s3, null);
        }

        ServerDescriptor(String s, String s1, String s2, String s3, String s4)
        {
            mUrl = s;
            mVersion = s1;
            mInternalVersion = s2;
            mDriveUrl = s3;
            mFinskyUrl = s4;
        }
    }


    private static final ArrayMap SERVER_MAP = new ArrayMap();
    private String mAccountName;
    private CheckBox mAlwaysShowAchievementsCheckBox;
    private View mAlwaysShowAchievementsView;
    private CheckBox mEnableVolleyLoggingCheckBox;
    private View mEnableVolleyLoggingView;
    private int mOldCheckedView;
    private ListView mServerListView;

    public GamesSettingsDebugActivity()
    {
        super(2, 0, 0, 0);
    }

    private static void createServerMap()
    {
        if (!SERVER_MAP.isEmpty())
        {
            return;
        } else
        {
            ServerDescriptor serverdescriptor = new ServerDescriptor("https://www-googleapis-staging.sandbox.google.com", "vdev", "vwhitelisteddev", "https://staging-www.sandbox.googleapis.com", "https://android.clients.google.com/internal/fdfe/");
            SERVER_MAP.put("Dev", serverdescriptor);
            GamesLog.d("DebugSettings", (new StringBuilder("SERVER_MAP[Dev] => ")).append(serverdescriptor).toString());
            serverdescriptor = new ServerDescriptor("https://www-googleapis-staging.sandbox.google.com", "v1", "v1whitelisted", "https://staging-www.sandbox.googleapis.com", "https://android.clients.google.com/staging/fdfe/");
            SERVER_MAP.put("Staging", serverdescriptor);
            GamesLog.d("DebugSettings", (new StringBuilder("SERVER_MAP[Staging] => ")).append(serverdescriptor).toString());
            serverdescriptor = new ServerDescriptor("https://www.googleapis.com", "v1", "v1whitelisted", "https://www.googleapis.com", "https://android.clients.google.com/fdfe/");
            SERVER_MAP.put("Prod", serverdescriptor);
            GamesLog.d("DebugSettings", (new StringBuilder("SERVER_MAP[Prod] => ")).append(serverdescriptor).toString());
            return;
        }
    }

    private void enableVolleyLogging(boolean flag)
    {
        Intent intent = new Intent("com.google.gservices.intent.action.GSERVICES_OVERRIDE");
        intent.putExtra(G.allowPIILogging.getKey(), String.valueOf(flag));
        sendBroadcast(intent);
    }

    public static String getSelectedServerFromG()
    {
        createServerMap();
        ServerDescriptor serverdescriptor = new ServerDescriptor((String)com.google.android.gms.games.config.G.baseServerUrl.get(), (String)com.google.android.gms.games.config.G.serverVersion.get(), (String)com.google.android.gms.games.config.G.internalServerVersion.get(), (String)com.google.android.gms.drive.G.serverUrl.get());
        for (Iterator iterator = SERVER_MAP.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            ServerDescriptor serverdescriptor1 = (ServerDescriptor)SERVER_MAP.get(s);
            if (serverdescriptor1 != null && serverdescriptor1.equals(serverdescriptor))
            {
                GamesLog.d("DebugSettings", (new StringBuilder("Found current selected server as ")).append(s).toString());
                return s;
            }
        }

        GamesLog.d("DebugSettings", (new StringBuilder("Current selected server descriptor could not be found: ")).append(serverdescriptor).toString());
        return null;
    }

    private static ArrayList getServerList()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = SERVER_MAP.keySet().iterator(); iterator.hasNext(); arraylist.add((String)iterator.next())) { }
        return arraylist;
    }

    public static boolean isProdServer()
    {
        return "Prod".equals(getSelectedServerFromG());
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f0400ce;
    }

    protected final GoogleApiClient instantiateGoogleApiClient()
    {
        if (isGoogleApiClientCreated())
        {
            getGoogleApiClient().disconnect();
        }
        Object obj = com.google.android.gms.games.Games.GamesOptions.builder();
        obj.allowHeadlessAccess = true;
        obj = ((com.google.android.gms.games.Games.GamesOptions.Builder) (obj)).build();
        obj = (new com.google.android.gms.common.api.GoogleApiClient.Builder(this, this, this)).addApi(Games.API_1P, ((com.google.android.gms.common.api.Api.ApiOptions.HasOptions) (obj))).addApi(PlayGames.API, com.google.android.gms.games.client.PlayGames.PlayGamesOptions.builder(((com.google.android.gms.games.Games.GamesOptions) (obj))).build()).setAccountName(mAccountName);
        obj.mRealClientPackageName = "com.google.android.gms";
        return ((com.google.android.gms.common.api.GoogleApiClient.Builder) (obj)).build();
    }

    public final void onClick(View view)
    {
        if (view == mAlwaysShowAchievementsView && mAlwaysShowAchievementsCheckBox != null)
        {
            mAlwaysShowAchievementsCheckBox.toggle();
            view = new Intent("com.google.gservices.intent.action.GSERVICES_OVERRIDE");
            view.putExtra(com.google.android.gms.games.config.G.alwaysShowAchievements.getKey(), String.valueOf(mAlwaysShowAchievementsCheckBox.isChecked()));
            sendBroadcast(view);
        } else
        {
            if (view == mEnableVolleyLoggingView && mEnableVolleyLoggingCheckBox != null)
            {
                mEnableVolleyLoggingCheckBox.toggle();
                enableVolleyLogging(mEnableVolleyLoggingCheckBox.isChecked());
                return;
            }
            if (view.getId() == 0x7f0d028c)
            {
                view = new Intent("android.intent.action.MAIN");
                view.setComponent(new ComponentName("com.google.android.gms", "com.google.android.location.copresence.debug.DebugUIActivity"));
                try
                {
                    startActivity(view);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    Toast.makeText(this, "Cannot launch copresence debug - do you have GmsCore-internal?", 1).show();
                }
                return;
            }
            if (view.getId() == 0x7f0d028d)
            {
                view = new Intent("com.google.android.gms.games.CLEAR_DATA");
                view.putExtra("com.google.android.gms.games.CLEAR_TRANSIENT_DATA", true);
                sendBroadcast(view);
                return;
            }
        }
    }

    public final void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        PlayGames.loadExperiments(getGoogleApiClient()).setResultCallback(this);
    }

    public final void onCreate(Bundle bundle)
    {
        mAccountName = getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
        if (mAccountName == null)
        {
            finish();
            return;
        }
        super.onCreate(bundle);
        bundle = getPackageManager();
        String s = AndroidUtils.getCallingPackage(this);
        boolean flag;
        if (s != null && GooglePlayServicesUtil.isPackageGoogleSigned(bundle, s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            finish();
            return;
        } else
        {
            setContentView(0x7f0400ce);
            createServerMap();
            mAlwaysShowAchievementsView = findViewById(0x7f0d0289);
            mAlwaysShowAchievementsView.setOnClickListener(this);
            ((TextView)mAlwaysShowAchievementsView.findViewById(0x7f0d0075)).setText(0x7f10027b);
            mAlwaysShowAchievementsView.findViewById(0x7f0d0292).setVisibility(0);
            mAlwaysShowAchievementsCheckBox = (CheckBox)mAlwaysShowAchievementsView.findViewById(0x7f0d00c3);
            mAlwaysShowAchievementsCheckBox.setVisibility(0);
            mAlwaysShowAchievementsCheckBox.setChecked(((Boolean)com.google.android.gms.games.config.G.alwaysShowAchievements.get()).booleanValue());
            ((TextView)findViewById(0x7f0d028e)).setText("Available Servers");
            mOldCheckedView = -1;
            mServerListView = (ListView)findViewById(0x7f0d028f);
            mServerListView.setChoiceMode(1);
            mServerListView.setOnItemClickListener(this);
            mServerListView.setAdapter(new ArrayAdapter(this, 0x109000f, getServerList()));
            setSelectedServer(getSelectedServerFromG());
            mEnableVolleyLoggingView = findViewById(0x7f0d028b);
            mEnableVolleyLoggingView.setVisibility(8);
            mEnableVolleyLoggingView.setOnClickListener(this);
            ((TextView)mEnableVolleyLoggingView.findViewById(0x7f0d0075)).setText(0x7f100280);
            mEnableVolleyLoggingView.findViewById(0x7f0d0292).setVisibility(0);
            boolean flag1 = ((Boolean)G.allowPIILogging.get()).booleanValue();
            mEnableVolleyLoggingCheckBox = (CheckBox)mEnableVolleyLoggingView.findViewById(0x7f0d00c3);
            mEnableVolleyLoggingCheckBox.setVisibility(0);
            mEnableVolleyLoggingCheckBox.setChecked(flag1);
            enableVolleyLogging(flag1);
            bundle = findViewById(0x7f0d028c);
            bundle.setOnClickListener(this);
            ((TextView)bundle.findViewById(0x7f0d0075)).setText(0x7f10027f);
            bundle.findViewById(0x7f0d0292).setVisibility(8);
            bundle = findViewById(0x7f0d028d);
            bundle.setOnClickListener(this);
            ((TextView)bundle.findViewById(0x7f0d0075)).setText(0x7f10027c);
            bundle.findViewById(0x7f0d0292).setVisibility(8);
            return;
        }
    }

    public final void onItemClick(final AdapterView serverName, View view, int i, long l)
    {
        if (serverName == mServerListView)
        {
            serverName = ((CheckedTextView)view).getText();
            PrebuiltDialogs.getGamesThemedBuilder(this).setTitle(0x7f10027e).setMessage(0x7f10027d).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final GamesSettingsDebugActivity this$0;
                final CharSequence val$serverName;

                public final void onClick(DialogInterface dialoginterface, int j)
                {
                    dialoginterface.dismiss();
                    dialoginterface = new Intent("com.google.android.gms.games.CLEAR_DATA");
                    sendBroadcast(dialoginterface);
                    setSelectedServer(serverName);
                }

            
            {
                this$0 = GamesSettingsDebugActivity.this;
                serverName = charsequence;
                super();
            }
            }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                final GamesSettingsDebugActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int j)
                {
                    dialoginterface.dismiss();
                    setSelectedServer(GamesSettingsDebugActivity.getSelectedServerFromG());
                }

            
            {
                this$0 = GamesSettingsDebugActivity.this;
                super();
            }
            }).setCancelable(false).show();
        }
    }

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.client.PlayGames.LoadExperimentsResult)result;
        if (result.getStatus().isSuccess())
        {
            result = new TreeSet(result.getExperimentIds());
            ((TextView)findViewById(0x7f0d0291)).setText(ExperimentUtils.getExperimentString(result));
        }
    }

    public final boolean setSelectedServer(CharSequence charsequence)
    {
        ServerDescriptor serverdescriptor = (ServerDescriptor)SERVER_MAP.get(charsequence);
        if (serverdescriptor == null)
        {
            GamesLog.e("DebugSettings", (new StringBuilder("Could not find server '")).append(charsequence).append("' in SERVER_MAP").toString());
        } else
        {
            ListAdapter listadapter = mServerListView.getAdapter();
            int i = 0;
            int j = listadapter.getCount();
            while (i < j) 
            {
                if (listadapter.getItem(i).toString().equals(charsequence))
                {
                    if (mOldCheckedView != -1)
                    {
                        mServerListView.setItemChecked(mOldCheckedView, false);
                    }
                    mServerListView.setItemChecked(i, true);
                    mServerListView.setSelection(i);
                    mOldCheckedView = i;
                    charsequence = new Intent("com.google.gservices.intent.action.GSERVICES_OVERRIDE");
                    if (!serverdescriptor.equals(SERVER_MAP.get("Prod")))
                    {
                        charsequence.putExtra(com.google.android.gms.games.config.G.baseServerUrl.getKey(), serverdescriptor.mUrl);
                        charsequence.putExtra(com.google.android.gms.games.config.G.serverVersion.getKey(), serverdescriptor.mVersion);
                        charsequence.putExtra(com.google.android.gms.games.config.G.internalServerVersion.getKey(), serverdescriptor.mInternalVersion);
                        charsequence.putExtra(com.google.android.gms.drive.G.serverUrl.getKey(), serverdescriptor.mDriveUrl);
                        charsequence.putExtra("url:games.finsky_url", (new StringBuilder()).append(PlayDfeApi.BASE_URI.toString()).append(" rewrite ").append(serverdescriptor.mFinskyUrl).toString());
                        charsequence.putExtra("appstate.base_service_url", serverdescriptor.mUrl);
                    } else
                    {
                        charsequence.putExtra(com.google.android.gms.games.config.G.baseServerUrl.getKey(), null);
                        charsequence.putExtra(com.google.android.gms.games.config.G.serverVersion.getKey(), null);
                        charsequence.putExtra(com.google.android.gms.games.config.G.internalServerVersion.getKey(), null);
                        charsequence.putExtra(com.google.android.gms.drive.G.serverUrl.getKey(), null);
                        charsequence.putExtra("url:games.finsky_url", null);
                        charsequence.putExtra("appstate.base_service_url", null);
                    }
                    sendBroadcast(charsequence);
                    GamesLog.d("DebugSettings", (new StringBuilder("Sent new server description: {baseServerUrl = ")).append(serverdescriptor.mUrl).append(", serverVersion = ").append(serverdescriptor.mVersion).append(", internalServerVersion = ").append(serverdescriptor.mInternalVersion).append("}").toString());
                    return true;
                }
                i++;
            }
        }
        return false;
    }

}
