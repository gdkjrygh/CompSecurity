// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.snapchat.android.database.table.FindFriendRequestCacheTable;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Ia
{
    public static final class a
    {

        public String mDisplayName;
        public long mLastUpdatedTimestamp;
        public String mNumber;

        public final boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                return TextUtils.equals(mNumber, ((a)obj).mNumber);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            if (TextUtils.isEmpty(mNumber))
            {
                return 0;
            } else
            {
                return mNumber.hashCode();
            }
        }

        public a(String s, String s1, long l)
        {
            mNumber = s;
            mDisplayName = s1;
            mLastUpdatedTimestamp = l;
        }
    }


    private final FriendManager mFriendManager;
    protected final Bt mUserPrefs;

    public Ia()
    {
        this(Bt.a(), FriendManager.e());
    }

    private Ia(Bt bt, FriendManager friendmanager)
    {
        mUserPrefs = bt;
        mFriendManager = friendmanager;
    }

    private static String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isDigit(c))
            {
                stringbuilder.append(c);
            }
        }

        return stringbuilder.toString();
    }

    public static HashSet a(Context context)
    {
        HashSet hashset;
        long l;
        long l1;
        hashset = new HashSet();
        Object obj;
        String s;
        boolean flag;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = new String[3];
            obj[0] = "data1";
            obj[1] = "display_name";
            obj[2] = "contact_last_updated_timestamp";
        } else
        {
            obj = new String[2];
            obj[0] = "data1";
            obj[1] = "display_name";
        }
        context = context.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, ((String []) (obj)), null, null, null);
        l1 = System.currentTimeMillis();
        if (context == null) goto _L2; else goto _L1
_L1:
        if (!context.moveToFirst()) goto _L2; else goto _L3
_L3:
        flag1 = true;
_L9:
        if (!flag1) goto _L2; else goto _L4
_L4:
        obj = context.getString(0);
        s = context.getString(1);
        if (!flag) goto _L6; else goto _L5
_L5:
        l = context.getLong(2);
_L7:
        if (obj == null || s == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        hashset.add(new a(a(((String) (obj))), s, l));
        flag1 = context.moveToNext();
        continue; /* Loop/switch isn't completed */
_L6:
        l = l1;
        if (true) goto _L7; else goto _L2
_L2:
        if (context != null)
        {
            context.close();
        }
        return hashset;
        Exception exception;
        exception;
        if (context != null)
        {
            context.close();
        }
        throw exception;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void a(long l, Br br, Set set)
    {
        if (br != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        List list;
        Object obj;
        Map map;
        obj = FriendManager.e();
        list = ((FriendManager) (obj)).mContactsOnSnapchat;
        obj = ((FriendManager) (obj)).mContactsOnSnapchatSet;
        map = FindFriendRequestCacheTable.e(br);
        if (map.isEmpty()) goto _L1; else goto _L3
_L3:
        br = new HashSet();
        long l1 = System.currentTimeMillis();
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            a a1 = (a)set.next();
            String s = KN.a(a1.mNumber);
            if (map.containsKey(s) && l1 - IJ.a((Long)map.get(s)) >= l)
            {
                br.add(a1.mDisplayName);
            }
        } while (true);
        if (br.isEmpty()) goto _L1; else goto _L4
_L4:
        list;
        JVM INSTR monitorenter ;
        set = list.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            Friend friend = (Friend)set.next();
            if (br.contains(friend.mDisplayName))
            {
                set.remove();
                ((Set) (obj)).remove(friend);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_219;
        br;
        list;
        JVM INSTR monitorexit ;
        throw br;
        list;
        JVM INSTR monitorexit ;
    }

    public static void a(List list, Map map, Br br)
    {
        if (list == null || map == null || br == null)
        {
            return;
        }
        br = FriendManager.e();
        List list1 = br.s();
        HashSet hashset = new HashSet();
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); hashset.add(map.get((String)iterator.next()))) { }
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            map = (Uh)list.next();
            if (hashset.contains(((QS) (map)).display))
            {
                map = new Friend(map);
                if (!list1.contains(map))
                {
                    list1.add(0, map);
                }
            }
        } while (true);
        br.b(list1);
    }
}
