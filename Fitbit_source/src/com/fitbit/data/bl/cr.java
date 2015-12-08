// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.util.al;
import com.fitbit.util.bh;
import com.fitbit.util.m;
import com.fitbit.util.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ao, FacebookBusinessLogic, 
//            aq, EntityMerger

public class cr extends e
{

    private static final String a = "SyncFriendsFromContactsOperation";
    private com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning b;
    private int d;

    public cr(bs bs1, com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning whatsscanning, int i, boolean flag)
    {
        super(bs1, flag, false);
        b = whatsscanning;
        d = i;
    }

    private List a(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(Long.valueOf(((RankedUser)collection.next()).h()))) { }
        return arraylist;
    }

    private List a(Set set, com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning whatsscanning, int i)
        throws ServerCommunicationException, JSONException
    {
        ArrayList arraylist = new ArrayList();
        if (!com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.c.equals(whatsscanning) || !set.isEmpty()) goto _L2; else goto _L1
_L1:
        return arraylist;
_L2:
        set = e().a().a(set, i);
        whatsscanning = e().b().M(set);
        FacebookBusinessLogic.a().a(e().b().L(set));
        return whatsscanning;
        set;
        if (set.e() != 404)
        {
            throw set;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void a(Collection collection, Collection collection1)
    {
        collection = collection.iterator();
label0:
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            RankedUser rankeduser = (RankedUser)collection.next();
            Iterator iterator = collection1.iterator();
            RankedUser rankeduser1;
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                rankeduser1 = (RankedUser)iterator.next();
            } while (!bh.a(rankeduser1.f(), rankeduser.f()));
            rankeduser.b(rankeduser1.l());
            rankeduser.d(rankeduser1.i());
            rankeduser.a(com.fitbit.data.domain.RankedUser.Relation.REQUEST_SENT);
            rankeduser.b(com.fitbit.data.domain.RankedUser.Relation.REQUEST_SENT);
        } while (true);
    }

    private void a(Collection collection, Map map)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            RankedUser rankeduser = (RankedUser)collection.next();
            if (map.containsKey(Long.valueOf(rankeduser.h())))
            {
                Iterator iterator = ((Set)map.get(Long.valueOf(rankeduser.h()))).iterator();
                if (iterator.hasNext())
                {
                    rankeduser.c((String)iterator.next());
                }
            }
        } while (true);
    }

    private void a(List list)
    {
        com.fitbit.data.repo.an an = aq.a().z();
        list = new EntityMerger(list, an, new _cls1());
        list.a(new _cls2());
        list.a(new _cls3(an));
        list.a(new _cls4());
    }

    private List b()
    {
        Cursor cursor;
        Object obj;
        cursor = FitBitApplication.a().getContentResolver().query(android.provider.ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        obj = new ArrayList();
        RankedUser rankeduser;
        for (; cursor.moveToNext(); ((List) (obj)).add(rankeduser))
        {
            long l = cursor.getLong(cursor.getColumnIndex("_id"));
            rankeduser = new RankedUser();
            rankeduser.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
            rankeduser.a(com.fitbit.data.domain.RankedUser.Relation.STRANGER);
            rankeduser.b(com.fitbit.data.domain.RankedUser.Relation.STRANGER);
            String s1 = cursor.getString(cursor.getColumnIndex("display_name"));
            rankeduser.c(l);
            rankeduser.k(s1);
        }

        break MISSING_BLOCK_LABEL_132;
        obj;
        if (cursor != null)
        {
            cursor.close();
        }
        throw obj;
        if (cursor != null)
        {
            cursor.close();
        }
        return ((List) (obj));
    }

    private Map b(Collection collection, Map map)
    {
        HashMap hashmap = new HashMap();
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            RankedUser rankeduser = (RankedUser)iterator.next();
            collection = (Set)map.get(Long.valueOf(rankeduser.h()));
            if (collection == null || collection.size() == 0)
            {
                iterator.remove();
            } else
            {
                Iterator iterator1 = collection.iterator();
                while (iterator1.hasNext()) 
                {
                    collection = (String)iterator1.next();
                    if (collection == null)
                    {
                        collection = null;
                    } else
                    {
                        collection = collection.toLowerCase(al.a());
                    }
                    hashmap.put(collection, rankeduser);
                }
            }
        }

        return hashmap;
    }

    private void b(List list)
    {
        list = new EntityMerger(list, aq.a().z(), new _cls5());
        list.a(new _cls6());
        list.a(new _cls7());
    }

    private Map c(List list)
    {
        HashMap hashmap;
        Object obj1;
        Object obj = FitBitApplication.a();
        hashmap = new HashMap();
        obj = ((Context) (obj)).getContentResolver();
        obj1 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI;
        list = (new StringBuilder()).append("contact_id IN ").append(m.a(list)).append(" AND ").append("mimetype").append("=?").toString();
        obj1 = ((ContentResolver) (obj)).query(((android.net.Uri) (obj1)), new String[] {
            "_id", "contact_id", "data1"
        }, list, new String[] {
            "vnd.android.cursor.item/email_v2"
        }, null);
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        String s1;
        long l;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        l = ((Cursor) (obj1)).getLong(((Cursor) (obj1)).getColumnIndex("contact_id"));
        s1 = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex("data1"));
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (s1.trim().length() == 0 || !s.a(s1)) goto _L2; else goto _L3
_L3:
        Set set = (Set)hashmap.get(Long.valueOf(l));
        list = set;
        if (set != null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        list = new TreeSet();
        hashmap.put(Long.valueOf(l), list);
        list.add(s1);
          goto _L2
        list;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw list;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return hashmap;
    }

    private a d()
        throws ServerCommunicationException, JSONException
    {
        org.json.JSONObject jsonobject = e().a().z();
    /* block-local class not found */
    class a {}

        a a1 = new a(null);
        a1.a = e().b().O(jsonobject);
        a1.b = e().b().P(jsonobject);
        return a1;
    }

    private Map d(List list)
    {
        HashMap hashmap;
        Cursor cursor;
        Object obj = FitBitApplication.a();
        hashmap = new HashMap();
        obj = ((Context) (obj)).getContentResolver();
        android.net.Uri uri = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI;
        String s1 = (new StringBuilder()).append("contact_id IN ").append(m.a(list)).append(" AND ").append("mimetype").append("=?").toString();
        cursor = ((ContentResolver) (obj)).query(uri, new String[] {
            "_id", "contact_id", "data7", "data8"
        }, s1, new String[] {
            "vnd.android.cursor.item/postal-address_v2"
        }, null);
_L7:
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToNext()) goto _L2; else goto _L3
_L3:
        Object obj2;
        Object obj3;
        long l;
        l = cursor.getLong(cursor.getColumnIndex("contact_id"));
        obj2 = cursor.getString(cursor.getColumnIndex("data7"));
        obj3 = cursor.getString(cursor.getColumnIndex("data8"));
        if (!bh.a(((CharSequence) (obj2))) || bh.a(((CharSequence) (obj3)))) goto _L5; else goto _L4
_L4:
        Object obj1 = obj3;
_L11:
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        if (((String) (obj1)).trim().length() == 0) goto _L7; else goto _L8
_L8:
        obj3 = (Set)hashmap.get(list);
        obj2 = obj3;
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        obj2 = new TreeSet();
        hashmap.put(Long.valueOf(l), obj2);
        ((Set) (obj2)).add(obj1);
          goto _L7
        list;
        if (cursor != null)
        {
            cursor.close();
        }
        throw list;
_L5:
        if (bh.a(((CharSequence) (obj2)))) goto _L10; else goto _L9
_L9:
        obj1 = obj2;
        if (bh.a(((CharSequence) (obj3)))) goto _L11; else goto _L10
_L10:
        if (bh.a(((CharSequence) (obj2))) || bh.a(((CharSequence) (obj3))))
        {
            break MISSING_BLOCK_LABEL_356;
        }
        obj1 = (new StringBuilder()).append(((String) (obj2))).append("/").append(((String) (obj3))).toString();
          goto _L11
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return hashmap;
        obj1 = null;
          goto _L11
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        if (!EnumSet.of(com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.b, com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.c).contains(b)) goto _L2; else goto _L1
_L1:
        a1 = b();
_L3:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        obj = a(((Collection) (a1)));
        obj1 = c(((List) (obj)));
        obj = d(((List) (obj)));
        obj1 = b(a1, ((Map) (obj1)));
        obj2 = new HashMap(((Map) (obj1)));
        obj3 = a(((Map) (obj1)).keySet(), b, d);
        if (EnumSet.of(com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.b, com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.d).contains(b))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        int i = 0;
_L4:
        do
        {
            if (i >= ((List) (obj3)).size())
            {
                break MISSING_BLOCK_LABEL_179;
            }
            if (!((RankedUser)((List) (obj3)).get(i)).r())
            {
                break MISSING_BLOCK_LABEL_170;
            }
            ((List) (obj3)).remove(i);
        } while (true);
_L2:
        a1 = new ArrayList();
          goto _L3
        a1;
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.d, com.fitbit.savedstate.LoadSavedState.Status.c, com.fitbit.savedstate.LoadSavedState.Status.a);
        throw a1;
        i++;
          goto _L4
        a1 = new ArrayList();
        obj3 = ((List) (obj3)).iterator();
_L13:
        if (!((Iterator) (obj3)).hasNext()) goto _L6; else goto _L5
_L5:
        RankedUser rankeduser;
        Object obj4;
        rankeduser = (RankedUser)((Iterator) (obj3)).next();
        obj4 = a1.iterator();
        i = 0;
_L10:
        if (!((Iterator) (obj4)).hasNext()) goto _L8; else goto _L7
_L7:
        RankedUser rankeduser3 = (RankedUser)((Iterator) (obj4)).next();
        if (!bh.a(rankeduser3.F(), rankeduser.F())) goto _L10; else goto _L9
_L9:
        if (rankeduser.p())
        {
            rankeduser3.b(true);
        }
        if (rankeduser.r())
        {
            rankeduser3.d(true);
        }
          goto _L11
_L8:
        if (i != 0) goto _L13; else goto _L12
_L12:
        a1.add(rankeduser);
        obj4 = rankeduser.f().toLowerCase(al.a());
        if (obj4 == null) goto _L13; else goto _L14
_L14:
        if (!((Map) (obj1)).containsKey(obj4)) goto _L13; else goto _L15
_L15:
        rankeduser.c(((RankedUser)((Map) (obj1)).get(obj4)).h());
        ((Map) (obj2)).remove(obj4);
          goto _L13
_L6:
        obj1 = new ArrayList(((Map) (obj2)).size());
        for (obj2 = ((Map) (obj2)).entrySet().iterator(); ((Iterator) (obj2)).hasNext(); ((List) (obj1)).add(rankeduser))
        {
            obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
            rankeduser = (RankedUser)((java.util.Map.Entry) (obj3)).getValue();
            rankeduser.b((String)((java.util.Map.Entry) (obj3)).getKey());
        }

        obj2 = d();
        obj3 = ((a) (obj2)).a.iterator();
_L18:
        if (!((Iterator) (obj3)).hasNext()) goto _L17; else goto _L16
_L16:
        rankeduser = (RankedUser)((Iterator) (obj3)).next();
        i = 0;
_L19:
        while (i < a1.size()) 
        {
            RankedUser rankeduser2 = (RankedUser)a1.get(i);
            if (rankeduser.F() == null || !rankeduser.F().equals(rankeduser2.F()))
            {
                break MISSING_BLOCK_LABEL_702;
            }
            rankeduser.d(rankeduser2.r());
            rankeduser.b(rankeduser2.p());
            a1.remove(i);
        }
          goto _L18
_L17:
        a1.addAll(((a) (obj2)).a);
        RankedUser rankeduser1;
        for (Iterator iterator = ((a) (obj2)).b.iterator(); iterator.hasNext(); rankeduser1.b(rankeduser1.f().toLowerCase(al.a())))
        {
            rankeduser1 = (RankedUser)iterator.next();
        }

        a(((Collection) (obj1)), ((Collection) (((a) (obj2)).b)));
        a(((Collection) (obj1)), ((Map) (obj)));
        b(((List) (obj1)));
        a(((List) (a1)));
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.d, com.fitbit.savedstate.LoadSavedState.Status.b);
        return;
_L11:
        i = 1;
          goto _L10
        i++;
          goto _L19
    }

    public String c()
    {
        return "SyncFriendsFromContactsOperation";
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}

}
