// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import com.kik.l.ab;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import kik.a.d.aa;
import kik.a.d.j;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.z;

public class KikDataProvider extends ContentProvider
{

    public static final Uri a = Uri.parse("content://kik.android.KikDataProvider/contacts/roster");
    public static final Uri b = Uri.parse("content://kik.android.KikDataProvider/contacts/canbegrouped");
    public static final Uri c = Uri.parse("content://kik.android.KikDataProvider/contacts/contactid");
    public static final Uri d = Uri.parse("content://kik.android.KikDataProvider/contacts/blockedcontacts");
    public static final Uri e = Uri.parse("content://kik.android.KikDataProvider/contacts/notblockedcontacts");
    private static v f;
    private static ab g;
    private static w h;
    private static final UriMatcher i;

    public KikDataProvider()
    {
    }

    private static Cursor a(String s)
    {
        String s2 = "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0";
        Object obj = null;
        String as[] = obj;
        String s1 = s2;
        if (s != null)
        {
            as = obj;
            s1 = s2;
            if (!"".equals(s))
            {
                s1 = (new StringBuilder()).append("pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0").append(" AND  ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?)) ").toString();
                as = b(s);
            }
        }
        return g.a(s1, as);
    }

    private static Cursor a(Vector vector)
    {
        String s = "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0";
        z z1 = z.b(f);
        Object obj = s;
        if (z1 != null)
        {
            obj = s;
            if (z1.a() != null)
            {
                obj = (new StringBuilder("pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0 AND suggest_intent_data_id <> '")).append(z1.a().a()).append("'").toString();
                if (vector.size() > 0)
                {
                    Iterator iterator = vector.iterator();
                    vector = ((Vector) (obj));
                    do
                    {
                        obj = vector;
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        obj = (String)iterator.next();
                        vector = (new StringBuilder()).append(vector).append(" AND suggest_intent_data_id <> '").append(((String) (obj))).append("'").toString();
                    } while (true);
                }
            }
        }
        return g.a(((String) (obj)));
    }

    private static Cursor a(Vector vector, String s)
    {
        String s1 = "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0";
        z z1 = z.b(f);
        Object obj = s1;
        if (z1 != null)
        {
            obj = s1;
            if (z1.a() != null)
            {
                String s2 = (new StringBuilder()).append("pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0").append(" AND suggest_intent_data_id <> '").append(z1.a().a()).append("'").toString();
                obj = s2;
                if (vector.size() > 0)
                {
                    obj = vector.iterator();
                    for (vector = s2; ((Iterator) (obj)).hasNext(); vector = (new StringBuilder()).append(vector).append(" AND suggest_intent_data_id <> '").append(s2).append("'").toString())
                    {
                        s2 = (String)((Iterator) (obj)).next();
                    }

                    obj = vector;
                }
            }
        }
        if (s != null && !"".equals(s))
        {
            vector = (new StringBuilder()).append(((String) (obj))).append(" AND  ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?)) ").toString();
            obj = b(s);
            s = vector;
            vector = ((Vector) (obj));
        } else
        {
            s = ((String) (obj));
            vector = null;
        }
        return g.a(s, vector);
    }

    private static Cursor a(Vector vector, String s, boolean flag)
    {
        Object obj = "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0";
        if (flag)
        {
            obj = (new StringBuilder()).append("pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0").append(" AND suggest_text_2 NOT LIKE ").append(DatabaseUtils.sqlEscapeString(h.d().c)).toString();
        }
        String as[];
        if (s != null && !"".equals(s) && !flag)
        {
            obj = (new StringBuilder()).append(((String) (obj))).append(" AND  ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?)) ").toString();
            as = b(s);
        } else
        {
            as = null;
        }
        if (vector.size() > 0)
        {
            Iterator iterator = vector.iterator();
            vector = ((Vector) (obj));
            do
            {
                obj = vector;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (String)iterator.next();
                vector = (new StringBuilder()).append(vector).append(" AND UPPER(suggest_text_2) != UPPER(").append(DatabaseUtils.sqlEscapeString(((String) (obj)))).append(")").toString();
            } while (true);
        }
        if (s == null)
        {
            if (flag)
            {
                return g.a(((String) (obj)));
            } else
            {
                return g.a(((String) (obj)), as);
            }
        }
        if (flag)
        {
            return g.a((new StringBuilder()).append(((String) (obj))).append(" AND 1 = 0").toString());
        } else
        {
            return g.a(((String) (obj)), as);
        }
    }

    public static void a(v v, ab ab1, w w1)
    {
        f = v;
        g = ab1;
        h = w1;
    }

    private static String[] b(String s)
    {
        return (new String[] {
            (new StringBuilder()).append(s).append("%").toString(), (new StringBuilder("% ")).append(s).append("%").toString(), (new StringBuilder()).append(s).append("%").toString()
        });
    }

    public int delete(Uri uri, String s, String as[])
    {
        return 0;
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        return uri;
    }

    public boolean onCreate()
    {
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        Object obj1 = null;
        Object obj = null;
        as1 = null;
        s1 = null;
        if (uri.getPathSegments().size() > 2)
        {
            as = uri.getLastPathSegment().toLowerCase();
        } else
        {
            as = null;
        }
        i.match(uri);
        switch (i.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown URI ")).append(uri).toString());

        case 1: // '\001'
        case 2: // '\002'
            uri = as;
            if (as == null)
            {
                uri = "";
            }
            return a(uri);

        case 9: // '\t'
            uri = as;
            if (as == null)
            {
                uri = "";
            }
            as1 = "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0";
            s = as1;
            as = s1;
            if (uri != null)
            {
                s = as1;
                as = s1;
                if (!"".equals(uri))
                {
                    s = "pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0 AND  ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?)) ";
                    as = b(uri);
                }
            }
            return g.a(s, as);

        case 3: // '\003'
            if (s != null && s.equals("recentcontacts"))
            {
                uri = (new StringBuilder("pending_in_roster = 1 AND pending_is_blocked = 0 AND is_group = 0 AND suggest_text_2 NOT LIKE ")).append(DatabaseUtils.sqlEscapeString(h.d().c)).toString();
                if (as == null)
                {
                    return g.a(uri);
                } else
                {
                    uri = (new StringBuilder()).append(uri).append(" AND 1 = 0").toString();
                    return g.a(uri);
                }
            }
            if (s != null && (s.equals("filteredContacts") || s.equals("filteredRecentContacts")) && as != null)
            {
                return a(new Vector(Arrays.asList(as.split(";"))), ((String) (null)), s.equals("filteredRecentContacts"));
            } else
            {
                return a(as);
            }

        case 4: // '\004'
            uri = "is_group = 0 AND pending_is_blocked = 0";
            s = obj1;
            if (as != null)
            {
                uri = "is_group = 0 AND pending_is_blocked = 0 AND (suggest_text_1= ?)";
                s = new String[1];
                s[0] = as;
            }
            return g.a(uri, s);

        case 5: // '\005'
            if (as == null)
            {
                uri = new Vector();
            } else
            {
                uri = new Vector(Arrays.asList(as.split(";")));
            }
            if (s != null && s.equals("recentcontacts"))
            {
                return a(uri);
            } else
            {
                return a(uri, null);
            }

        case 6: // '\006'
            uri = uri.getPathSegments();
            return a(new Vector(Arrays.asList(((String)uri.get(uri.size() - 2)).split(";"))), as);

        case 7: // '\007'
            as1 = "pending_is_blocked = 1";
            s = as1;
            uri = obj;
            if (as != null)
            {
                s = as1;
                uri = obj;
                if (!"".equals(as))
                {
                    s = " ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?))  AND pending_is_blocked = 1";
                    uri = b(as);
                }
            }
            return g.a(s, uri);

        case 8: // '\b'
            if (s != null && s.equals("recentcontacts"))
            {
                uri = (new StringBuilder("pending_is_blocked = 0 AND is_group = 0 AND suggest_text_2 NOT LIKE ")).append(DatabaseUtils.sqlEscapeString(h.d().c)).toString();
                if (as == null)
                {
                    return g.a(uri);
                } else
                {
                    uri = (new StringBuilder()).append(uri).append(" AND 1 = 0").toString();
                    return g.a(uri);
                }
            }
            s1 = z.b(f);
            s = "";
            uri = s;
            if (s1 != null)
            {
                uri = s;
                if (s1.a() != null)
                {
                    uri = (new StringBuilder(" AND suggest_intent_data_id <> '")).append(s1.a().a()).append("' ").toString();
                }
            }
            s = (new StringBuilder("pending_is_blocked = 0 AND is_group = 0")).append(uri).toString();
            if (as != null && !"".equals(as))
            {
                uri = (new StringBuilder(" ((suggest_text_1 LIKE ?) OR (suggest_text_1 LIKE ?) OR (suggest_text_2 LIKE ?) OR (suggest_text_2 LIKE ?))  AND pending_is_blocked = 0 AND is_group = 0")).append(uri).toString();
                as = b(as);
            } else
            {
                uri = s;
                as = as1;
            }
            return g.a(uri, as);

        case 10: // '\n'
            uri = uri.getPathSegments();
            return a(new Vector(Arrays.asList(((String)uri.get(uri.size() - 2)).split(";"))), as, s.equals("filteredRecentContacts"));
        }
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return 0;
    }

    static 
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        i = urimatcher;
        urimatcher.addURI("kik.android.KikDataProvider", "contacts/search_suggest_query", 1);
        i.addURI("kik.android.KikDataProvider", "contacts/search_suggest_query/*", 1);
        i.addURI("kik.android.KikDataProvider", "contactsIncludeUsername/search_suggest_query", 9);
        i.addURI("kik.android.KikDataProvider", "contactsIncludeUsername/search_suggest_query/*", 9);
        i.addURI("kik.android.KikDataProvider", "notblockedcontacts/search_suggest_query", 8);
        i.addURI("kik.android.KikDataProvider", "notblockedcontacts/search_suggest_query/*", 8);
        i.addURI("kik.android.KikDataProvider", "conversations/search_suggest_query", 2);
        i.addURI("kik.android.KikDataProvider", "conversations/search_suggest_query/*", 2);
        i.addURI("kik.android.KikDataProvider", "contacts/roster", 3);
        i.addURI("kik.android.KikDataProvider", "contacts/roster/*", 3);
        i.addURI("kik.android.KikDataProvider", "contacts/roster/*/*", 10);
        i.addURI("kik.android.KikDataProvider", "contacts/contactid", 4);
        i.addURI("kik.android.KikDataProvider", "contacts/contactid/*", 4);
        i.addURI("kik.android.KikDataProvider", "contacts/canbegrouped", 5);
        i.addURI("kik.android.KikDataProvider", "contacts/canbegrouped/*", 5);
        i.addURI("kik.android.KikDataProvider", "contacts/canbegrouped/*/*", 6);
        i.addURI("kik.android.KikDataProvider", "contacts/blockedcontacts", 7);
        i.addURI("kik.android.KikDataProvider", "contacts/blockedcontacts/*", 7);
        i.addURI("kik.android.KikDataProvider", "contacts/notblockedcontacts", 8);
        i.addURI("kik.android.KikDataProvider", "contacts/notblockedcontacts/*", 8);
    }
}
