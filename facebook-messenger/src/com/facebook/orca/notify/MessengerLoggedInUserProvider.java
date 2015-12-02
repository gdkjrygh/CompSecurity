// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.base.a.g;
import com.facebook.c.r;
import com.facebook.inject.t;
import com.facebook.push.c2dm.y;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.inject.a;

public class MessengerLoggedInUserProvider extends r
{

    public static final Integer a = new Integer(1);
    public static final Integer b = new Integer(0);
    private ObjectMapper c;

    public MessengerLoggedInUserProvider()
    {
    }

    protected int a(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new RuntimeException("update should not be called on this content provider");
    }

    protected int a(Uri uri, String s, String as[])
    {
        throw new RuntimeException("delete should not be called on this content provider");
    }

    protected Cursor a(Uri uri, String as[], String s, String as1[], String s1)
    {
        as1 = new MatrixCursor(new String[] {
            "li", "push_receiver", "oli"
        });
        g.a(getContext());
        uri = t.a(getContext());
        as = uri.b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId);
        uri = (y)uri.a(com/facebook/push/c2dm/y);
        as = (String)as.b();
        s = c.readTree(s).get("userId").textValue();
        if (s == null) goto _L2; else goto _L1
_L1:
        boolean flag4 = s.equals(as);
        if (!flag4) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L15:
        if (s == null) goto _L5; else goto _L4
_L4:
        flag4 = s.equals(uri.j());
        if (!flag4) goto _L5; else goto _L6
_L6:
        boolean flag1 = true;
_L13:
        if (as == null) goto _L8; else goto _L7
_L7:
        flag4 = as.equals(s);
        if (flag4) goto _L8; else goto _L9
_L9:
        boolean flag2 = true;
_L12:
        boolean flag3;
        flag3 = flag;
        flag = flag1;
_L10:
        if (flag3)
        {
            uri = a;
        } else
        {
            uri = b;
        }
        if (flag)
        {
            as = a;
        } else
        {
            as = b;
        }
        if (flag2)
        {
            s = a;
        } else
        {
            s = b;
        }
        as1.addRow(new Object[] {
            uri, as, s
        });
        return as1;
        uri;
        flag = false;
        flag1 = false;
_L11:
        flag2 = false;
        flag3 = flag1;
          goto _L10
        uri;
        flag2 = false;
        flag1 = flag;
        flag = flag2;
          goto _L11
        uri;
        flag2 = flag;
        flag = flag1;
        flag1 = flag2;
          goto _L11
_L8:
        flag2 = false;
        if (true) goto _L12; else goto _L5
_L5:
        flag1 = false;
        if (true) goto _L13; else goto _L2
_L2:
        flag = false;
        if (true) goto _L15; else goto _L14
_L14:
    }

    protected Uri a(Uri uri, ContentValues contentvalues)
    {
        throw new RuntimeException("insert should not be called on this content provider");
    }

    protected String a(Uri uri)
    {
        return (new StringBuilder()).append("vnd.android.cursor.dir/").append(b()).toString();
    }

    protected void a()
    {
        c = (ObjectMapper)t.a(getContext()).a(com/fasterxml/jackson/databind/ObjectMapper);
    }

    String b()
    {
        return "content://com.facebook.orca.notify.MessengerLoggedInUserProvider/logged_in_user";
    }

}
