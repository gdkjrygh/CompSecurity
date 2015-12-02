// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.e;

import android.content.ContentResolver;
import android.database.Cursor;
import com.facebook.common.w.k;
import com.facebook.contacts.data.aa;
import com.facebook.contacts.data.ac;
import com.facebook.contacts.data.x;
import com.facebook.contacts.data.z;
import com.facebook.contacts.database.g;
import com.facebook.debug.log.b;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.user.e;
import com.facebook.user.n;
import com.google.common.a.em;
import com.google.common.a.hq;
import java.util.Collection;
import java.util.List;

public class a
    implements e
{

    private static final Class a = com/facebook/contacts/e/a;
    private final g b;
    private final ContentResolver c;
    private final x d;
    private Cursor e;

    public a(g g1, ContentResolver contentresolver, x x1)
    {
        b = g1;
        c = contentresolver;
        d = x1;
    }

    public void a()
    {
        String s = (new StringBuilder()).append("type IN ").append(k.b(com.facebook.contacts.models.a.a.MESSAGABLE_TYPES)).append(" ").append("AND fbid IS NOT NULL").toString();
        e = c.query(d.c.a, new String[] {
            "data"
        }, s, null, null);
    }

    public void a(int i)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("initTopFriends: ").append(i).toString());
        String s = (new StringBuilder()).append("type IN ").append(k.b(com.facebook.contacts.models.a.a.MESSAGABLE_TYPES)).append(" ").append("AND fbid IS NOT NULL ").append("AND communication_rank > 0").toString();
        ContentResolver contentresolver = c;
        android.net.Uri uri = d.c.a;
        String s1 = (new StringBuilder()).append("communication_rank DESC LIMIT ").append(i).toString();
        e = contentresolver.query(uri, new String[] {
            "data"
        }, s, null, s1);
    }

    public void a(em em)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("initWithUserKeyExclusion: ").append(em).toString());
        em = (new StringBuilder()).append("type IN ").append(k.b(com.facebook.contacts.models.a.a.MESSAGABLE_TYPES)).append(" ").append("AND fbid NOT IN ").append(k.b(UserKey.b(em))).append(" ").append("AND fbid IS NOT NULL").toString();
        e = c.query(d.c.a, new String[] {
            "data"
        }, em, null, null);
    }

    public void a(String s, int i)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("initWithSearchRestrict: ").append(s).append(" max: ").append(i).toString());
        String s1 = (new StringBuilder()).append("type IN ").append(k.b(com.facebook.contacts.models.a.a.MESSAGABLE_TYPES)).toString();
        ContentResolver contentresolver = c;
        s = d.e.a(s);
        String s2 = (new StringBuilder()).append("_id LIMIT ").append(Integer.toString(i)).toString();
        e = contentresolver.query(s, new String[] {
            "data"
        }, s1, null, s2);
    }

    public void a(Collection collection)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("initWithUserKeyRestrict: ").append(collection.size()).append(" keys").toString());
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("User keys: ").append(collection).toString());
        collection = UserKey.b(collection);
        String s = (new StringBuilder()).append("type IN ").append(k.b(com.facebook.contacts.models.a.a.MESSAGABLE_TYPES)).append(" ").append("AND fbid IN ").append(k.b(collection)).toString();
        if (collection.isEmpty())
        {
            collection = null;
        } else
        {
            collection = k.a("fbid", collection);
        }
        e = c.query(d.c.a, new String[] {
            "data"
        }, s, null, collection);
    }

    public void b()
    {
        Cursor cursor;
        Object obj;
        com.facebook.debug.log.b.b(a, "initFavoriteFriends");
        obj = hq.a();
        cursor = c.query(d.d.a, new String[] {
            "fbid"
        }, null, null, "display_order ASC");
        while (cursor.moveToNext()) 
        {
            String s = cursor.getString(0);
            ((List) (obj)).add(new UserKey(n.FACEBOOK, s));
        }
        break MISSING_BLOCK_LABEL_90;
        obj;
        cursor.close();
        throw obj;
        cursor.close();
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Looking up favorites by user ID: ").append(obj).toString());
        a(((Collection) (obj)));
        return;
    }

    public User c()
    {
        if (e == null)
        {
            com.facebook.debug.log.b.b(a, "next: not initialized, skipping");
            return null;
        }
        if (!e.moveToNext())
        {
            com.facebook.debug.log.b.a(a, "next: cursor empty");
            return null;
        } else
        {
            User user = b.a(e.getString(0));
            com.facebook.debug.log.b.a(a, "next: %s", new Object[] {
                user
            });
            return user;
        }
    }

    public void d()
    {
        com.facebook.debug.log.b.b(a, "closing");
        if (e != null)
        {
            e.close();
            e = null;
        }
    }

}
