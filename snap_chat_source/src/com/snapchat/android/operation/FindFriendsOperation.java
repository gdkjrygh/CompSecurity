// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.operation;

import Br;
import Bt;
import CQ;
import Ia;
import It;
import Jc;
import Jh;
import KN;
import LB;
import Mf;
import Mt;
import PB;
import PG;
import Uh;
import Ui;
import Uj;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.snapchat.android.Timber;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.database.table.FindFriendRequestCacheTable;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.security.SCPluginWrapper;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import lQ;
import oO;
import pi;
import pn;

public class FindFriendsOperation extends CQ
    implements oS.a
{
    public final class a extends Ui
    {

        public a()
        {
        }
    }


    private static final String ALERT_MESSAGE_FOR_PRIVACY_VIOLATION_DETECTION = "Don't send the find friend request because the user has not given access to contacts. This is probably because the phone number is reset to an empty string.";
    private static final long DEFAULT_INTERVAL = 0x240c8400L;
    protected static final int MAX_NUM_RESEND_PHONENUMBERS = 200;
    public static final String ONLY_NEW_CONTACT_PARAM = "only_new_contact";
    private static final int SC_NOT_MODIFIED = 304;
    public static final String SHOULD_RECOMMEND_PARAM = "should_recommend";
    private static final String TAG = "FindFriendsOperation";
    public static final String USECACHE_PARAM = "use_cache";
    public static int b043E043E043E043E043E043E = 2;
    public static int b043E043E043E043E043E043E = 91;
    public static int b043E043E043E043E043E043E = 1;
    public static int b043E043E043E043E043E043E;
    private Bus mBus;
    protected final FindFriendRequestCacheTable mCacheTable;
    protected final PB mClock;
    protected Context mContext;
    private String mCountryCode;
    private final LB mExceptionReporter;
    private final FriendManager mFriendManager;
    protected Map mIncrementalPhoneNumbersToNames;
    protected Map mNewPhoneNumbersToNames;
    private boolean mOnlyNewContact;
    protected Set mPhoneNumbersToContacts;
    private boolean mShouldRecommend;
    private boolean mUseCache;
    protected Br mUser;
    private final Bt mUserPrefs;

    public FindFriendsOperation(Intent intent)
    {
        this(intent, Bt.a(), FindFriendRequestCacheTable.a(), new LB(), new PB(), FriendManager.e());
    }

    FindFriendsOperation(Intent intent, Bt bt, FindFriendRequestCacheTable findfriendrequestcachetable, LB lb, PB pb, FriendManager friendmanager)
    {
        super(intent);
        mBus = Mf.a();
        mUseCache = intent.getBooleanExtra("use_cache", true);
        mOnlyNewContact = intent.getBooleanExtra("only_new_contact", false);
        mShouldRecommend = intent.getBooleanExtra("should_recommend", false);
        mUserPrefs = bt;
        mCacheTable = findfriendrequestcachetable;
        mExceptionReporter = lb;
        registerCallback(Uj, this);
        mClock = pb;
        mFriendManager = friendmanager;
    }

    public static int b043E043E043E043E043E043E()
    {
        return 1;
    }

    public static int b043E043E043E043E043E043E()
    {
        return 0;
    }

    public static int b043E043E043E043E043E043E()
    {
        return 67;
    }

    private boolean isNewContact(Ia.a a1, Map map)
    {
        String s = KN.a(a1.mNumber);
        if (!map.keySet().contains(s))
        {
            return true;
        }
        long l = ((Long)map.get(s)).longValue();
        return a1.mLastUpdatedTimestamp >= l;
    }

    private boolean shouldResendContact(Ia.a a1, Set set)
    {
        return set != null && set.contains(KN.a(a1.mNumber));
    }

    private void updateCachedFindFriendsRequest(long l)
    {
        List list;
        for (list = FriendManager.u(); list.size() > 10; list.remove(list.size() - 1)) { }
        list.add(0, Long.valueOf(l));
        SharedPreferenceKey.FINDFRIENDS_TIMESTAMPS.putString(Jh.a(list, "~"));
        HashMap hashmap = new HashMap();
        Iterator iterator = mIncrementalPhoneNumbersToNames.keySet().iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            String s1 = KN.a(s);
            if (s1 != null)
            {
                s = s1;
            }
            hashmap.put(s, Long.valueOf(l));
        }
        FindFriendRequestCacheTable.a(mUser, hashmap);
    }

    protected void callSuperProcess(Context context)
    {
        super.process(context);
    }

    public Map getHeaders(pn pn)
    {
        Map map = super.getHeaders(pn);
_L3:
        int i;
        int k;
        int i1;
        i = b043E043E043E043E043E043E();
        k = b043E043E043E043E043E043E();
        i1 = b043E043E043E043E043E043E();
        try
        {
            if (((i + k) * i1) % b043E043E043E043E043E043E != b043E043E043E043E043E043E)
            {
                b043E043E043E043E043E043E = b043E043E043E043E043E043E();
                b043E043E043E043E043E043E = b043E043E043E043E043E043E();
            }
        }
        // Misplaced declaration of an exception variable
        catch (pn pn)
        {
            throw pn;
        }
        0;
        JVM INSTR tableswitch 0 1: default 72
    //                   0 99
    //                   1 6;
           goto _L1 _L2 _L3
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 96
    //                   0 6
    //                   1 99;
           goto _L1 _L3 _L2
_L2:
        int j;
        int l;
        int j1;
        int k1;
        int l1;
        int i2;
        try
        {
            pn = ((oO)pn).mPayload;
            j = b043E043E043E043E043E043E;
            l = b043E043E043E043E043E043E;
            j1 = b043E043E043E043E043E043E;
            k1 = b043E043E043E043E043E043E;
            l1 = b043E043E043E043E043E043E();
        }
        // Misplaced declaration of an exception variable
        catch (pn pn)
        {
            throw pn;
        }
        if (((b043E043E043E043E043E043E + b043E043E043E043E043E043E) * b043E043E043E043E043E043E) % b043E043E043E043E043E043E != b043E043E043E043E043E043E())
        {
            b043E043E043E043E043E043E = b043E043E043E043E043E043E();
            b043E043E043E043E043E043E = b043E043E043E043E043E043E();
        }
        switch (1)
        {
        default:
            while (true) 
            {
label0:
                switch (0)
                {
                case 1: // '\001'
                    break;

                default:
label1:
                    while (true) 
                    {
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label1;

                        case 1: // '\001'
                            break label0;
                        }
                    }
                    // fall through

                case 0: // '\0'
                    switch (0)
                    {
                    case 0: // '\0'
                        break MISSING_BLOCK_LABEL_267;

                    case 1: // '\001'
                        break MISSING_BLOCK_LABEL_164;
                    }
                    break;
                }
            }

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_164;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_267;
        }
        i2 = b043E043E043E043E043E043E;
        (k1 * (l1 + k1)) % i2;
        JVM INSTR tableswitch 0 0: default 300
    //                   0 310;
           goto _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_310;
_L4:
        b043E043E043E043E043E043E = 66;
        b043E043E043E043E043E043E = 43;
        k1 = b043E043E043E043E043E043E;
        l1 = b043E043E043E043E043E043E();
        if (((j + l) * j1) % k1 == l1) goto _L7; else goto _L6
_L6:
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
_L7:
        pn = SCPluginWrapper.generateHeader(pn, getPath());
        j = b043E043E043E043E043E043E;
        switch ((j * (b043E043E043E043E043E043E + j)) % b043E043E043E043E043E043E)
        {
        default:
            b043E043E043E043E043E043E = b043E043E043E043E043E043E();
            b043E043E043E043E043E043E = 74;
            break;

        case 0: // '\0'
            break;
        }
        if (pn == null)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        map.put("X-Snapchat-Client-Auth", pn);
        j = b043E043E043E043E043E043E;
        l = b043E043E043E043E043E043E;
        j1 = b043E043E043E043E043E043E;
        k1 = b043E043E043E043E043E043E;
        l1 = b043E043E043E043E043E043E;
        if (((j + l) * j1) % k1 == l1)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        b043E043E043E043E043E043E = b043E043E043E043E043E043E();
        b043E043E043E043E043E043E = 79;
        return map;
    }

    protected String getPath()
    {
        return "/ph/find_friends";
    }

    public pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new a()).a(It.a().toJson(mIncrementalPhoneNumbersToNames)).b(mCountryCode.toUpperCase(Locale.US)).a(Boolean.valueOf(mShouldRecommend))));
    }

    protected void initIncrementalNumbersDict(boolean flag, Set set)
    {
        mIncrementalPhoneNumbersToNames = new HashMap();
        mNewPhoneNumbersToNames = new HashMap();
        Map map = FindFriendRequestCacheTable.e(mUser);
        Iterator iterator = mPhoneNumbersToContacts.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Ia.a a1 = (Ia.a)iterator.next();
            if (!flag || map.isEmpty())
            {
                mIncrementalPhoneNumbersToNames.put(a1.mNumber, a1.mDisplayName);
            } else
            if (isNewContact(a1, map))
            {
                mNewPhoneNumbersToNames.put(a1.mNumber, a1.mDisplayName);
                mIncrementalPhoneNumbersToNames.put(a1.mNumber, a1.mDisplayName);
            } else
            if (shouldResendContact(a1, set))
            {
                mIncrementalPhoneNumbersToNames.put(a1.mNumber, a1.mDisplayName);
            }
        } while (true);
    }

    protected void onFailure(pi pi1)
    {
        if (pi1.mResponseCode != 304)
        {
            mBus.a(new Mt());
            Timber.d("FindFriendsOperation", "Request failed: %s", new Object[] {
                pi1.d()
            });
            mBus.a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, 0x7f0801fb));
        }
    }

    public void onJsonResult(Uj uj, pi pi1)
    {
        if (pi1.c() && uj != null)
        {
            onSuccess(uj);
            return;
        } else
        {
            onFailure(pi1);
            return;
        }
    }

    public volatile void onJsonResult(Object obj, pi pi1)
    {
        onJsonResult((Uj)obj, pi1);
    }

    protected void onSuccess(Uj uj)
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj3 = uj.a();
        obj1 = mPhoneNumbersToContacts;
        obj = FriendManager.e();
        if (!((FriendManager) (obj)).f()) goto _L2; else goto _L1
_L1:
        List list;
        List list1;
        ArrayList arraylist;
        Set set;
        list1 = ((FriendManager) (obj)).mContactsOnSnapchat;
        list = ((FriendManager) (obj)).mContactsNotOnSnapchat;
        arraylist = ((FriendManager) (obj)).mOutgoingFriendsListMap.b();
        set = ((FriendManager) (obj)).mContactsOnSnapchatSet;
        obj = new HashSet();
        list1;
        JVM INSTR monitorenter ;
        obj3 = ((List) (obj3)).iterator();
        do
        {
            if (!((Iterator) (obj3)).hasNext())
            {
                break;
            }
            Friend friend = new Friend((Uh)((Iterator) (obj3)).next());
            Iterator iterator2 = list1.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    break;
                }
                Friend friend1 = (Friend)iterator2.next();
                if (!TextUtils.equals(friend1.g(), friend.g()))
                {
                    continue;
                }
                iterator2.remove();
                set.remove(friend1);
                break;
            } while (true);
            list1.add(friend);
            set.add(friend);
        } while (true);
        break MISSING_BLOCK_LABEL_191;
        uj;
        list1;
        JVM INSTR monitorexit ;
        throw uj;
        Collections.sort(list1);
        for (Iterator iterator1 = list1.iterator(); iterator1.hasNext(); ((Set) (obj)).add(((Friend)iterator1.next()).mDisplayName)) { }
        list1;
        JVM INSTR monitorexit ;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); ((Set) (obj)).add(((Friend)iterator.next()).mDisplayName)) { }
        list;
        JVM INSTR monitorenter ;
        list.clear();
        obj1 = ((Set) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Object obj2 = (Ia.a)((Iterator) (obj1)).next();
            String s = ((Ia.a) (obj2)).mNumber;
            obj2 = ((Ia.a) (obj2)).mDisplayName;
            if (!((Set) (obj)).contains(obj2))
            {
                list.add(new Friend("", ((String) (obj2)), s));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_376;
        uj;
        list;
        JVM INSTR monitorexit ;
        throw uj;
        Collections.sort(list);
        list;
        JVM INSTR monitorexit ;
_L2:
        Ia.a(uj.a(), mNewPhoneNumbersToNames, mUser);
        Bt.c(uj.b().longValue());
        updateCachedFindFriendsRequest(System.currentTimeMillis());
        if (!mUseCache)
        {
            long l = System.currentTimeMillis();
            if (l > Bt.p())
            {
                SharedPreferenceKey.LAST_FIND_FRIENDS_WITHOUT_CACHE_TIMESTAMP.putLong(l);
            }
        }
        if (uj.c().booleanValue())
        {
            FriendManager.a(uj.c().booleanValue());
        }
        mBus.a(new Mt());
        return;
    }

    public void postProcess(Context context)
    {
        if (mUser != null)
        {
            mUser.a(new com.snapchat.android.database.table.DbTable.DatabaseTable[] {
                com.snapchat.android.database.table.DbTable.DatabaseTable.CONTACTS_ON_SNAPCHAT, com.snapchat.android.database.table.DbTable.DatabaseTable.CONTACTS_NOT_ON_SNAPCHAT
            });
        }
    }

    public void process(Context context)
    {
        if (FriendManager.w()) goto _L2; else goto _L1
_L1:
        if (ReleaseManager.f())
        {
            AlertDialogUtils.a("Don't send the find friend request because the user has not given access to contacts. This is probably because the phone number is reset to an empty string.", context, 1);
        }
        Timber.e("FindFriendsOperation", "Don't send the find friend request because the user has not given access to contacts. This is probably because the phone number is reset to an empty string.", new Object[0]);
        mExceptionReporter.a(new lQ());
_L4:
        return;
_L2:
        Object obj;
        if (!mUseCache || mOnlyNewContact)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = mFriendManager;
        Br br = (Br)((FriendManager) (obj)).mUserProvider.get();
        Object obj2;
        Ia.a a1;
        boolean flag;
        if (FriendManager.u() == null || FriendManager.u().size() == 0 || br == null)
        {
            flag = true;
        } else
        {
            obj1 = ((FriendManager) (obj)).mContactsOnSnapchat;
            obj = ((FriendManager) (obj)).mContactsNotOnSnapchat;
            if ((obj1 == null || ((List) (obj1)).size() == 0) && (obj == null || ((List) (obj)).size() == 0))
            {
                flag = true;
            } else
            {
                obj = (Long)FriendManager.u().get(0);
                if (Long.valueOf(System.currentTimeMillis()).longValue() - ((Long) (obj)).longValue() > 0x36ee80L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        mUser = Br.a(context);
        mContext = context;
        mPhoneNumbersToContacts = Ia.a(context);
        obj2 = mPhoneNumbersToContacts;
        obj = mUser;
        PG.b();
        Object obj1 = FindFriendRequestCacheTable.e(((Br) (obj))).keySet();
        if (!((Set) (obj1)).isEmpty())
        {
            HashSet hashset = new HashSet();
            obj2 = ((Set) (obj2)).iterator();
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                a1 = (Ia.a)((Iterator) (obj2)).next();
                if (((Set) (obj1)).contains(KN.a(a1.mNumber)))
                {
                    hashset.add(KN.a(a1.mNumber));
                }
            } while (true);
            ((Set) (obj1)).removeAll(hashset);
            if (!((Set) (obj1)).isEmpty())
            {
                FindFriendRequestCacheTable.a(((Br) (obj)), ((Set) (obj1)));
            }
        }
        obj = FriendManager.u();
        int i = ((List) (obj)).size();
        obj1 = new HashSet();
        if (i > 1)
        {
            long l = (((Long)((List) (obj)).get(0)).longValue() - ((Long)((List) (obj)).get(i - 1)).longValue()) / (long)(i - 1);
            Ia.a(l << 1, mUser, mPhoneNumbersToContacts);
            selectExpiredNumbersFromCache(((Set) (obj1)), l << 1);
        }
        initIncrementalNumbersDict(mUseCache, ((Set) (obj1)));
        if (mIncrementalPhoneNumbersToNames.isEmpty())
        {
            Timber.c("FindFriendsOperation", "no new local contacts and expired numbers since last find friend request", new Object[0]);
            return;
        }
        if (mUseCache && mOnlyNewContact && (mNewPhoneNumbersToNames == null || mNewPhoneNumbersToNames.size() == 0))
        {
            Timber.c("FindFriendsOperation", "no new local contacts since last find friend request", new Object[0]);
            return;
        }
        mCountryCode = ((TelephonyManager)context.getSystemService("phone")).getNetworkCountryIso();
        if (TextUtils.isEmpty(mCountryCode))
        {
            mCountryCode = "us";
        }
        callSuperProcess(context);
        return;
    }

    protected void selectExpiredNumbersFromCache(Set set, long l)
    {
        Object obj = FindFriendRequestCacheTable.e(mUser);
        ArrayList arraylist = new ArrayList();
        obj = ((Map) (obj)).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (System.currentTimeMillis() - ((Long)entry.getValue()).longValue() >= l)
            {
                arraylist.add(new Ia.a((String)entry.getKey(), "", ((Long)entry.getValue()).longValue()));
            }
        } while (true);
        if (arraylist.size() > 200)
        {
            Collections.sort(arraylist, new Comparator() {

                public final int compare(Object obj1, Object obj2)
                {
                    obj1 = (Ia.a)obj1;
                    obj2 = (Ia.a)obj2;
                    return (new Long(((Ia.a) (obj1)).mLastUpdatedTimestamp)).compareTo(new Long(((Ia.a) (obj2)).mLastUpdatedTimestamp));
                }

            });
        }
        for (int i = 0; i < Math.min(200, arraylist.size()); i++)
        {
            set.add(((Ia.a)arraylist.get(i)).mNumber);
        }

    }
}
