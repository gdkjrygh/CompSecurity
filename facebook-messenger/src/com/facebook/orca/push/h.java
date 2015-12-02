// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.common.w.q;
import com.facebook.debug.log.b;
import com.facebook.orca.notify.MessengerLoggedInUserProvider;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.facebook.orca.push:
//            i

public class h
{

    private static final Class a = com/facebook/orca/push/h;
    private final ContentResolver b;

    public h(ContentResolver contentresolver)
    {
        b = contentresolver;
    }

    public i a(String s)
    {
        q q1;
        com.facebook.debug.log.b.b(a, "Checking Messenger to see if user %s is the push notification receiver", new Object[] {
            s
        });
        q1 = q.UNSET;
        Object obj;
        obj = new ObjectNode(JsonNodeFactory.instance);
        ((ObjectNode) (obj)).put("userId", s);
        obj = b.query(Uri.parse("content://com.facebook.orca.notify.MessengerLoggedInUserProvider/logged_in_user"), null, ((ObjectNode) (obj)).toString(), null, null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        boolean flag2;
        s = q1;
        flag = false;
        flag2 = false;
_L14:
        boolean flag1 = flag;
        if (!((Cursor) (obj)).moveToNext()) goto _L4; else goto _L3
_L3:
        int j;
        int k;
        j = ((Cursor) (obj)).getInt(0);
        k = MessengerLoggedInUserProvider.b.intValue();
        if (j > k)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1) goto _L6; else goto _L5
_L5:
        flag = true;
        flag2 = flag1;
        flag1 = flag;
_L4:
        ((Cursor) (obj)).close();
_L12:
        s = new i(flag2, flag1, s);
        return s;
_L6:
        if (((Cursor) (obj)).getColumnCount() >= 2)
        {
            if (((Cursor) (obj)).getInt(1) > MessengerLoggedInUserProvider.b.intValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (((Cursor) (obj)).getColumnCount() < 3) goto _L8; else goto _L7
_L7:
        if (((Cursor) (obj)).getInt(2) <= MessengerLoggedInUserProvider.b.intValue()) goto _L10; else goto _L9
_L9:
        s = q.YES;
          goto _L11
_L10:
        s = q.NO;
          goto _L11
        s;
        try
        {
            ((Cursor) (obj)).close();
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.facebook.debug.log.b.b(a, "Caught exception checking orca pref", s);
            return new i(false, false, q.UNSET);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.facebook.common.e.b.a("MESSENGER_LOGGED_IN_USER_PROVIDER", "Exception in MessengerLoggedInUserProvider", s);
        }
        return new i(false, false, q.UNSET);
_L8:
        flag2 = flag1;
        continue; /* Loop/switch isn't completed */
_L2:
        s = q1;
        flag1 = false;
        flag2 = false;
          goto _L12
_L11:
        flag2 = flag1;
        if (true) goto _L14; else goto _L13
_L13:
    }

}
