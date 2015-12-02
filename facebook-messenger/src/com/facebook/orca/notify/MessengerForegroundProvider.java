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
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.facebook.orca.annotations.MessagesForegroundProviderAuthority;
import com.facebook.orca.threadview.do;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

// Referenced classes of package com.facebook.orca.notify:
//            j, at

public class MessengerForegroundProvider extends r
{

    public static final Integer a = Integer.valueOf(1);
    public static final Integer b = Integer.valueOf(0);
    private static final Class e = com/facebook/orca/notify/MessengerForegroundProvider;
    private ObjectMapper c;
    private String d;

    public MessengerForegroundProvider()
    {
    }

    private String b()
    {
        if (d == null)
        {
            d = (String)t.a(getContext()).a(java/lang/String, com/facebook/orca/annotations/MessagesForegroundProviderAuthority);
        }
        return d;
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
            "fg", "displays_inapp_notif"
        });
        uri = t.a(getContext());
        do do1 = (do)uri.a(com/facebook/orca/threadview/do);
        s1 = (j)uri.a(com/facebook/orca/notify/j);
        Object obj1 = (at)uri.a(com/facebook/orca/notify/at);
        String s2 = (String)uri.a(java/lang/String, com/facebook/auth/annotations/LoggedInUserId);
        uri = b;
        as = b;
        Object obj;
        try
        {
            obj = c.readTree(s);
            s = ((JsonNode) (obj)).get("userId").textValue();
            obj = ((JsonNode) (obj)).get("threadId").textValue();
            com.facebook.debug.log.b.b(e, (new StringBuilder()).append("Querying notification state for user: ").append(s).append(" thread: ").append(((String) (obj))).toString());
            obj1 = ((at) (obj1)).a();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj == null || s == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        if (s.equals(s2) && obj1 != null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        as1.addRow(new Object[] {
            b, b
        });
        return as1;
        if (!((String) (obj)).equals(do1.a(((android.app.Activity) (obj1)))))
        {
            break MISSING_BLOCK_LABEL_228;
        }
        s = a;
        uri = s;
        if (!s1.b(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_244;
        }
        s = a;
        as = s;
_L2:
        as1.addRow(new Object[] {
            uri, as
        });
        com.facebook.debug.log.b.b(e, (new StringBuilder()).append("replying with thread in Foreground = ").append(uri).append(", displays in app notification = ").append(as).toString());
        return as1;
        s;
        if (true) goto _L2; else goto _L1
_L1:
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
        g.a(getContext());
        c = (ObjectMapper)t.a(getContext()).a(com/fasterxml/jackson/databind/ObjectMapper);
    }

}
