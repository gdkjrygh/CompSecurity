// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

final class hts extends mvc
{

    private static final String l[] = {
        "display_name"
    };
    private final String m;

    public hts(Context context, String s1)
    {
        super(context);
        m = s1;
    }

    private List s()
    {
        Object obj;
        Object obj1;
        obj = new ArrayList();
        obj1 = m;
        obj1 = (new StringBuilder(String.valueOf(obj1).length() + 2)).append("%").append(((String) (obj1))).append("%").toString();
        obj1 = ea.a(super.f.getContentResolver(), android.provider.ContactsContract.Contacts.CONTENT_URI, l, "display_name LIKE ? AND display_name_source != 10", new String[] {
            obj1
        }, null, null);
        if (obj1 == null)
        {
            return ((List) (obj));
        }
        break MISSING_BLOCK_LABEL_82;
        obj;
        ((Cursor) (obj1)).close();
        throw obj;
        do
        {
            if (!((Cursor) (obj1)).moveToNext() || ((List) (obj)).size() >= 30)
            {
                break;
            }
            String s1 = ((Cursor) (obj1)).getString(0);
            if (!s1.matches("[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]+"))
            {
                ((List) (obj)).add(s1);
            }
        } while (true);
        ((Cursor) (obj1)).close();
        return ((List) (obj));
    }

    public final Object d()
    {
        return s();
    }

}
