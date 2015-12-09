// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Service;
import android.database.Cursor;
import android.net.Uri;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.internal.provider.SpotifyProvider;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class ggq
{

    static final String a[] = {
        "url", "token", "type"
    };
    private String b;
    private ggt c;

    private ggq()
    {
    }

    ggq(byte byte0)
    {
        this();
    }

    public static ggq a(Activity activity, am am)
    {
        return new ggr(activity, am, (byte)0);
    }

    public static ggq a(Service service)
    {
        return new ggs(service, (byte)0);
    }

    protected final void a(Cursor cursor)
    {
        Object obj4 = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag = cursor.moveToFirst();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!duc.a(cursor) || c == null) goto _L1; else goto _L3
_L3:
        android.net.Uri.Builder builder = Uri.parse(b).buildUpon();
        cursor = gcw.a(cursor, 1, "");
        Object obj = obj4;
        Cursor cursor1 = cursor;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj = obj4;
        cursor1 = cursor;
        String as[];
        if (cursor.equals(""))
        {
            break MISSING_BLOCK_LABEL_119;
        }
        as = cursor.split("=");
        Object obj1 = obj4;
        Cursor cursor2 = cursor;
        Object obj2;
        if (as.length < 2)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj2 = URLDecoder.decode(as[1], "UTF-8");
        builder.appendQueryParameter("oauth_token", ((String) (obj2)));
        Object obj3 = cursor;
_L4:
        cursor = builder.build();
        obj2 = b;
        cursor.toString();
        c.a_(cursor);
          goto _L1
        cursor;
        throw cursor;
        obj2;
        cursor = null;
        obj3 = null;
_L6:
        obj4 = obj2;
        obj2 = obj3;
_L5:
        Logger.a(((Throwable) (obj4)), "Error when getting token", new Object[0]);
        obj3 = cursor;
          goto _L4
        obj2;
        cursor = null;
        obj3 = null;
_L7:
        obj4 = obj2;
        obj2 = obj3;
          goto _L5
        obj2;
        obj3 = null;
          goto _L6
        Object obj5;
        obj5;
        obj3 = obj2;
        obj2 = obj5;
          goto _L6
        obj2;
        obj3 = null;
          goto _L7
        obj5;
        obj3 = obj2;
        obj2 = obj5;
          goto _L7
    }

    public void a(String s, ggt ggt1)
    {
        this;
        JVM INSTR monitorenter ;
        b = s;
        c = ggt1;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        c = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final Uri c()
    {
        String s = b;
        return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/web_token/").append(Uri.encode(s)).toString());
    }

    static 
    {
        ggq.getSimpleName();
    }
}
