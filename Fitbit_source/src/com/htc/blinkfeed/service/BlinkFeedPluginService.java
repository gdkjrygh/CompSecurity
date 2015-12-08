// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.service;

import android.accounts.Account;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.util.SparseArray;
import com.htc.blinkfeed.Util;
import com.htc.blinkfeed.annotation.BlinkFeedPlugin;
import com.htc.blinkfeed.annotation.Inject;
import com.htc.blinkfeed.data.FilterType;
import com.htc.blinkfeed.data.Timeline;
import com.htc.blinkfeed.exception.InvalidPluginException;
import com.htc.blinkfeed.exception.InvalidValueException;
import com.htc.blinkfeed.provider.AccountManagerIdentityProvider;
import com.htc.blinkfeed.provider.DummyIdentityProvider;
import com.htc.blinkfeed.provider.FilterProvider;
import com.htc.blinkfeed.provider.IdentityProvider;
import com.htc.blinkfeed.provider.TimelineProvider;
import com.htc.lib2.opensense.social.SyncType;
import com.htc.opensense.social.AbstractSocialPlugin;
import com.htc.opensense.social.SocialPluginResponse;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class BlinkFeedPluginService extends Service
{
    private class LegacyPluginStub extends AbstractSocialPlugin
    {

        private StubImpl mStubImpl;
        final BlinkFeedPluginService this$0;

        public Bundle getDataSources(SocialPluginResponse socialpluginresponse, String as[])
        {
            return mStubImpl.getDataSources(as);
        }

        public Bundle getSyncTypes(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
        {
            return mStubImpl.getSyncTypes(aaccount, bundle);
        }

        protected boolean isCallerValid(int i)
        {
            return BlinkFeedPluginService.this.isCallerValid(getBaseContext(), i);
        }

        public Bundle publishActivityStream(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
        {
            return mStubImpl.publishActivityStream(aaccount, bundle);
        }

        public Bundle syncActivityStreams(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
        {
            return mStubImpl.syncActivityStreams(aaccount, bundle);
        }

        public Bundle syncSyncTypes(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
        {
            return mStubImpl.syncSyncTypesLegacy(aaccount, bundle);
        }

        private LegacyPluginStub()
        {
            this$0 = BlinkFeedPluginService.this;
            super();
            mStubImpl = new StubImpl(null);
        }

        LegacyPluginStub(LegacyPluginStub legacypluginstub)
        {
            this();
        }
    }

    private class PluginStub extends com.htc.lib2.opensense.social.AbstractSocialPlugin
    {

        private StubImpl mStubImpl;
        final BlinkFeedPluginService this$0;

        public Bundle getDataSources(com.htc.lib2.opensense.social.SocialPluginResponse socialpluginresponse, String as[])
        {
            return mStubImpl.getDataSources(as);
        }

        public Bundle getSyncTypes(com.htc.lib2.opensense.social.SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
        {
            return mStubImpl.getSyncTypes(aaccount, bundle);
        }

        protected boolean isCallerValid(int i)
        {
            return BlinkFeedPluginService.this.isCallerValid(getBaseContext(), i);
        }

        public Bundle publishActivityStream(com.htc.lib2.opensense.social.SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
        {
            return mStubImpl.publishActivityStream(aaccount, bundle);
        }

        public Bundle syncActivityStreams(com.htc.lib2.opensense.social.SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
        {
            return mStubImpl.syncActivityStreams(aaccount, bundle);
        }

        public Bundle syncSyncTypes(com.htc.lib2.opensense.social.SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
        {
            return mStubImpl.syncSyncTypes(aaccount, bundle);
        }

        private PluginStub()
        {
            this$0 = BlinkFeedPluginService.this;
            super();
            mStubImpl = new StubImpl(null);
        }

        PluginStub(PluginStub pluginstub)
        {
            this();
        }
    }

    private class StubImpl
    {

        private int mFilterMode;
        private FilterProvider mFilterProvider;
        private boolean mFilterable;
        private int mIconId;
        private IdentityProvider mIdentityProvider;
        private String mIdentityType;
        private int mLabelId;
        private com.htc.blinkfeed.data.Timeline.LoadType mLoadType;
        private Class mPluginClass;
        private String mPluginName;
        private TimelineProvider mTimelineProvider;
        final BlinkFeedPluginService this$0;

        private void initPlugin()
        {
            Object obj = new ComponentName(BlinkFeedPluginService.this, com/htc/blinkfeed/service/BlinkFeedPluginService);
            TimelineProvider timelineprovider;
            BlinkFeedPlugin blinkfeedplugin;
            try
            {
                obj = Class.forName(getPackageManager().getServiceInfo(((ComponentName) (obj)), 128).metaData.getString("plugin"));
                blinkfeedplugin = (BlinkFeedPlugin)((Class) (obj)).getAnnotation(com/htc/blinkfeed/annotation/BlinkFeedPlugin);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("BlinkFeedPluginService", "Cannot find serivce component", ((Throwable) (obj)));
                throw new InvalidPluginException(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("BlinkFeedPluginService", "Cannot find plugin class", ((Throwable) (obj)));
                throw new InvalidPluginException(((Throwable) (obj)));
            }
            catch (InstantiationException instantiationexception)
            {
                Log.e("BlinkFeedPluginService", "Cannot instantize plugin", instantiationexception);
                throw new InvalidPluginException(instantiationexception);
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                Log.e("BlinkFeedPluginService", "IllegalAccess", illegalaccessexception);
                throw new InvalidPluginException(illegalaccessexception);
            }
            if (blinkfeedplugin != null)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            Log.e("BlinkFeedPluginService", (new StringBuilder("Class ")).append(obj).append(" is not a BlinkFeedPlugin").toString());
            return;
            mLabelId = blinkfeedplugin.label();
            mIconId = blinkfeedplugin.icon();
            mIdentityType = blinkfeedplugin.identityType();
            mPluginName = blinkfeedplugin.name();
            mPluginClass = ((Class) (obj));
            mFilterMode = blinkfeedplugin.filterMode();
            timelineprovider = null;
            if (blinkfeedplugin.identityProvider().equals(com/htc/blinkfeed/provider/IdentityProvider)) goto _L2; else goto _L1
_L1:
            obj = (IdentityProvider)blinkfeedplugin.identityProvider().newInstance();
_L3:
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "Inject identityProvider");
            injectMembers(obj);
            mIdentityProvider = ((IdentityProvider) (obj));
            obj = blinkfeedplugin.timelineProvider();
            timelineprovider = (TimelineProvider)((Class) (obj)).newInstance();
            mLoadType = Util.getProviderLoadType(((Class) (obj)));
            injectMembers(timelineprovider);
            mTimelineProvider = timelineprovider;
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "Initialize FilterTypeProvider");
            obj = blinkfeedplugin.filterProvider();
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", (new StringBuilder("filter class: ")).append(obj).toString());
            if (obj == com/htc/blinkfeed/provider/FilterProvider)
            {
                break MISSING_BLOCK_LABEL_432;
            }
            obj = (FilterProvider)((Class) (obj)).newInstance();
            injectMembers(obj);
            mFilterProvider = ((FilterProvider) (obj));
            mFilterable = true;
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "FilterProvider inited");
            return;
_L2:
label0:
            {
                if (blinkfeedplugin.identityType().equals(""))
                {
                    break label0;
                }
                obj = new AccountManagerIdentityProvider();
            }
              goto _L3
            obj = timelineprovider;
            if (!blinkfeedplugin.identityType().equals("")) goto _L3; else goto _L4
_L4:
            obj = timelineprovider;
            if (!blinkfeedplugin.identityProvider().equals(com/htc/blinkfeed/provider/IdentityProvider)) goto _L3; else goto _L5
_L5:
            obj = new DummyIdentityProvider();
              goto _L3
        }

        private void injectMembers(Object obj)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("context", mContext);
            hashmap.put("identityProvider", mIdentityProvider);
            hashmap.put("identityType", mIdentityType);
            hashmap.put("pluginName", mPluginName);
            hashmap.put("packageName", getPackageName());
            if (obj != null)
            {
                Field afield[] = obj.getClass().getDeclaredFields();
                int j = afield.length;
                int i = 0;
                while (i < j) 
                {
                    Field field = afield[i];
                    Inject inject = (Inject)field.getAnnotation(com/htc/blinkfeed/annotation/Inject);
                    if (inject != null)
                    {
                        Object obj1 = hashmap.get(inject.name());
                        com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", (new StringBuilder("Injecting ")).append(inject.name()).append("=").append(obj1).toString());
                        if (obj1 != null)
                        {
                            try
                            {
                                field.set(obj, obj1);
                            }
                            catch (IllegalArgumentException illegalargumentexception)
                            {
                                Log.e("BlinkFeedPluginService", (new StringBuilder("Error injecting ")).append(inject.name()).toString(), illegalargumentexception);
                                illegalargumentexception.printStackTrace();
                            }
                            catch (IllegalAccessException illegalaccessexception)
                            {
                                Log.e("BlinkFeedPluginService", (new StringBuilder("Error injecting ")).append(inject.name()).toString(), illegalaccessexception);
                                illegalaccessexception.printStackTrace();
                            }
                        }
                    }
                    i++;
                }
            }
        }

        public Bundle getDataSources(String as[])
        {
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "getDataSource");
            if (mIdentityProvider == null)
            {
                initPlugin();
            }
            if (mIdentityProvider == null)
            {
                return null;
            }
            Object obj = mIdentityProvider.getAccount();
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", (new StringBuilder("account:")).append(obj).toString());
            as = new Bundle();
            if (obj != null)
            {
                as.putParcelableArray("accounts", new Account[] {
                    obj
                });
            }
            obj = new Bundle();
            String s;
            if (mIdentityProvider instanceof DummyIdentityProvider)
            {
                ((Bundle) (obj)).putInt("key_prop_identity_provider_type", 1);
            } else
            if (mIdentityProvider instanceof AccountManagerIdentityProvider)
            {
                ((Bundle) (obj)).putInt("key_prop_identity_provider_type", 0);
            } else
            {
                ((Bundle) (obj)).putInt("key_prop_identity_provider_type", 2);
            }
            if (mLoadType == com.htc.blinkfeed.data.Timeline.LoadType.NO_LOADMORE)
            {
                ((Bundle) (obj)).putBoolean("key_prop_bool_support_load_more", false);
            }
            ((Bundle) (obj)).putInt("key_prop_filter_mode", mFilterMode);
            if (mLabelId != 0)
            {
                ((Bundle) (obj)).putInt("key_prop_account_label_id", mLabelId);
            }
            if (mIconId != 0)
            {
                Log.d("BlinkFeedPluginService", (new StringBuilder("Set icon to :")).append(mIconId).toString());
                ((Bundle) (obj)).putInt("key_prop_account_icon_id", mIconId);
            }
            s = mIdentityProvider.getAuthenticationIntentURI();
            if (s != null)
            {
                Log.d("BlinkFeedPluginService", (new StringBuilder("URI:")).append(s).toString());
                ((Bundle) (obj)).putString("custom_add_account_uri", s);
            } else
            {
                Log.d("BlinkFeedPluginService", mIdentityProvider.getClass().toString());
            }
            if (mFilterable)
            {
                ((Bundle) (obj)).putBoolean("key_prop_bool_sup_multi_sync_types", true);
            } else
            {
                Log.d("BlinkFeedPluginService", "Not filterable");
            }
            ((Bundle) (obj)).putString("key_prop_package_name", mContext.getPackageName());
            as.putBundle("key_properties", ((Bundle) (obj)));
            return as;
        }

        public Bundle getSyncTypes(Account aaccount[], Bundle bundle)
        {
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "getSyncTypes");
            return new Bundle();
        }

        public Bundle publishActivityStream(Account aaccount[], Bundle bundle)
        {
            return new Bundle();
        }

        public Bundle syncActivityStreams(Account aaccount[], Bundle bundle)
        {
            Object obj1 = null;
            if (mTimelineProvider == null)
            {
                initPlugin();
            }
            if (mTimelineProvider == null)
            {
                com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "Null provider");
                throw new InvalidPluginException("You should provide a TimelineProvider");
            }
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", (new StringBuilder("TimelineProvider:")).append(mTimelineProvider.getClass()).toString());
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", (new StringBuilder("before:")).append(bundle.getLong("offset")).toString());
            long l = bundle.getLong("offset", 0L);
            String as[] = bundle.getStringArray("synctype");
            Object obj;
            if (as != null && as.length > 0 && !"highlights".equals(as[0]))
            {
                obj = as[0];
            } else
            {
                obj = null;
            }
            if (mLoadType == com.htc.blinkfeed.data.Timeline.LoadType.TIME)
            {
                aaccount = mTimelineProvider.getTimeline(aaccount[0], ((String) (obj)), Long.valueOf(l));
            } else
            if (mLoadType == com.htc.blinkfeed.data.Timeline.LoadType.TOKEN)
            {
                String s = bundle.getString("page_token");
                aaccount = mTimelineProvider.getTimeline(aaccount[0], ((String) (obj)), s);
            } else
            if (mLoadType == com.htc.blinkfeed.data.Timeline.LoadType.NO_LOADMORE)
            {
                aaccount = mTimelineProvider.getTimeline(aaccount[0], ((String) (obj)), null);
            } else
            {
                throw new InvalidPluginException("TimelineProvider can be either TimelineProvider<String> or TimelineProvider<long>");
            }
            obj = obj1;
            if (aaccount != null)
            {
                com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeed", (new StringBuilder("building timeline: stories - ")).append(aaccount.numOfStories()).toString());
                obj = aaccount.build(BlinkFeedPluginService.this, mIdentityProvider.getAccount());
            }
            if (obj != null)
            {
                bundle.putBoolean("booleanResult", true);
                bundle.putParcelableArrayList("stream", ((ArrayList) (obj)));
                if (mLoadType == com.htc.blinkfeed.data.Timeline.LoadType.TOKEN && aaccount.getNextPageToken() != null)
                {
                    bundle.putString("page_token", aaccount.getNextPageToken());
                }
                return bundle;
            } else
            {
                bundle.putBoolean("booleanResult", false);
                return bundle;
            }
        }

        public Bundle syncSyncTypes(Account aaccount[], Bundle bundle)
        {
            initPlugin();
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", (new StringBuilder("syncSyncTypes:")).append(mFilterable).toString());
            if (!mFilterable || aaccount == null || aaccount.length <= 0) goto _L2; else goto _L1
_L1:
            Object obj;
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "set filter types");
            aaccount = aaccount[0];
            obj = mFilterProvider.listFilters(aaccount);
            aaccount = new ArrayList();
            if (obj == null) goto _L2; else goto _L3
_L3:
            obj = ((List) (obj)).iterator();
_L7:
            if (((Iterator) (obj)).hasNext()) goto _L5; else goto _L4
_L4:
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "return synctypes");
            obj = new ArrayList();
            SyncType synctype;
            Object obj1;
            for (aaccount = aaccount.iterator(); aaccount.hasNext(); ((ArrayList) (obj)).add(((SyncType)aaccount.next()).toBundle()))
            {
                break MISSING_BLOCK_LABEL_276;
            }

            bundle.putParcelableArrayList("synctype", ((ArrayList) (obj)));
_L2:
            bundle.putBoolean("booleanResult", true);
            return bundle;
_L5:
            obj1 = (FilterType)((Iterator) (obj)).next();
            if (((FilterType) (obj1)).getId() == null)
            {
                throw new InvalidValueException("FilterType ID should not be null");
            }
            synctype = new SyncType();
            synctype.setId(((FilterType) (obj1)).getId());
            synctype.setTitle(((FilterType) (obj1)).getLabel());
            if (((FilterType) (obj1)).getCategoryResId() == -1)
            {
                synctype.setCategory(((FilterType) (obj1)).getCategory());
            } else
            {
                if (BlinkFeedPluginService.mStringMap == null)
                {
                    initStringMap();
                }
                obj1 = (String)BlinkFeedPluginService.mStringMap.get(((FilterType) (obj1)).getCategoryResId());
                if (obj1 != null)
                {
                    synctype.setCategoryResName(((String) (obj1)));
                }
            }
            aaccount.add(synctype);
            if (true) goto _L7; else goto _L6
_L6:
        }

        public Bundle syncSyncTypesLegacy(Account aaccount[], Bundle bundle)
        {
            initPlugin();
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", (new StringBuilder("syncSyncTypes:")).append(mFilterable).toString());
            if (!mFilterable || aaccount == null || aaccount.length <= 0) goto _L2; else goto _L1
_L1:
            Object obj;
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "set filter types");
            aaccount = aaccount[0];
            obj = mFilterProvider.listFilters(aaccount);
            aaccount = new ArrayList();
            if (obj == null) goto _L2; else goto _L3
_L3:
            obj = ((List) (obj)).iterator();
_L7:
            if (((Iterator) (obj)).hasNext()) goto _L5; else goto _L4
_L4:
            com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "return synctypes");
            bundle.putParcelableArrayList("synctype", aaccount);
_L2:
            bundle.putBoolean("booleanResult", true);
            return bundle;
_L5:
            com.htc.opensense.social.SyncType synctype;
            Object obj1;
            obj1 = (FilterType)((Iterator) (obj)).next();
            if (((FilterType) (obj1)).getId() == null)
            {
                throw new InvalidValueException("FilterType ID should not be null");
            }
            synctype = new com.htc.opensense.social.SyncType();
            synctype.setId(((FilterType) (obj1)).getId());
            synctype.setTitle(((FilterType) (obj1)).getLabel());
            if (((FilterType) (obj1)).getCategoryResId() != -1)
            {
                break; /* Loop/switch isn't completed */
            }
            synctype.setCategory(((FilterType) (obj1)).getCategory());
_L8:
            aaccount.add(synctype);
            if (true) goto _L7; else goto _L6
_L6:
            if (BlinkFeedPluginService.mStringMap == null)
            {
                initStringMap();
            }
            obj1 = (String)BlinkFeedPluginService.mStringMap.get(((FilterType) (obj1)).getCategoryResId());
            if (obj1 != null)
            {
                synctype.setCategoryResName(((String) (obj1)));
            }
              goto _L8
            if (true) goto _L7; else goto _L9
_L9:
        }

        private StubImpl()
        {
            this$0 = BlinkFeedPluginService.this;
            super();
            mIdentityProvider = null;
            mTimelineProvider = null;
            mFilterProvider = null;
            mPluginClass = null;
            mIdentityType = null;
            mPluginName = null;
            mLabelId = 0;
            mIconId = 0;
            mFilterable = false;
            mFilterMode = 1;
            mLoadType = com.htc.blinkfeed.data.Timeline.LoadType.UNKNOWN;
        }

        StubImpl(StubImpl stubimpl)
        {
            this();
        }
    }


    private static final String DEBUG_PROP_NAME = "blinkfeed_plugin_debug";
    private static final String LOG_TAG = "BlinkFeedPluginService";
    private static SparseArray mStringMap = null;
    private String SIGNATURE_WHITELIST[] = {
        "A32C5ECC606840009399768B7170CECF020849AE41E879A355A3E4ECC818D751", "4B7C0949390D20673A752AAC0A69AD8DA8A6E18E55B271674430BF19794CB1FE", "A6CE16FBE0B5B1468B48F8FBA9F0A608728C424509E2CB9310EA696B5FC4B2BE"
    };
    private Context mContext;
    private LegacyPluginStub mLegacyStub;
    private PluginStub mStub;

    public BlinkFeedPluginService()
    {
        mLegacyStub = null;
        mStub = null;
    }

    private void initStringMap()
    {
        int i;
        int j;
        mStringMap = new SparseArray();
        String s = getPackageName();
        Field afield[];
        Field field;
        Object obj;
        int k;
        try
        {
            afield = Class.forName((new StringBuilder(String.valueOf(s))).append(".R$string").toString()).getDeclaredFields();
            j = afield.length;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            Log.e("BlinkFeedPluginService", "Error to find resource string class", classnotfoundexception);
            classnotfoundexception.printStackTrace();
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.e("BlinkFeedPluginService", "Error to find resource string class", illegalargumentexception);
            illegalargumentexception.printStackTrace();
            return;
        }
        i = 0;
          goto _L1
_L4:
        field = afield[i];
        k = field.getInt(null);
        mStringMap.put(k, field.getName());
_L2:
        i++;
        break; /* Loop/switch isn't completed */
        obj;
        Log.e("BlinkFeedPluginService", "Error to find resource string id", ((Throwable) (obj)));
        ((IllegalArgumentException) (obj)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e("BlinkFeedPluginService", "Error to find resource string id", ((Throwable) (obj)));
        ((IllegalAccessException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        if (i < j) goto _L4; else goto _L3
_L3:
    }

    private boolean isCallerValid(Context context, int i)
    {
        String as[] = context.getPackageManager().getPackagesForUid(i);
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((context = context.getPackageManager().getPackageInfo(as[0], 64)) == null) goto _L1; else goto _L3
_L3:
        Object obj;
        String as1[];
        int j;
        try
        {
            obj = MessageDigest.getInstance("SHA256");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        if (obj == null) goto _L1; else goto _L4
_L4:
        ((MessageDigest) (obj)).update(((PackageInfo) (context)).signatures[0].toByteArray());
        context = Util.bytesToHex(((MessageDigest) (obj)).digest());
        obj = new ArrayList();
        as1 = SIGNATURE_WHITELIST;
        j = as1.length;
        i = 0;
_L6:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        return ((ArrayList) (obj)).contains(context);
        ((ArrayList) (obj)).add(as1[i]);
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public IBinder onBind(Intent intent)
    {
        mContext = getBaseContext();
        boolean flag1 = com.htc.lib2.opensense.internal.SystemWrapper.SystemProperties.getBoolean("blinkfeed_plugin_debug", false);
        int i = getResources().getIdentifier("blinkfeed_plugin_debug", null, null);
        boolean flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (i != 0)
            {
                flag = getResources().getBoolean(i);
            }
        }
        com.htc.blinkfeed.Util.DebugLoger.setDebug(flag);
        com.htc.blinkfeed.Util.DebugLoger.d("BlinkFeedPluginService", "Service bound");
        if (intent.getBooleanExtra("hsp", false))
        {
            if (mStub == null)
            {
                mStub = new PluginStub(null);
            }
            return mStub.getIBinder();
        }
        if (mLegacyStub == null)
        {
            mLegacyStub = new LegacyPluginStub(null);
        }
        return mLegacyStub.getIBinder();
    }





}
