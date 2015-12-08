// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.SharedPreferences;
import com.appboy.a;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package bo.app:
//            ec, aw

public final class c
    implements Runnable
{

    final a a;

    public c(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        try
        {
            aw aw1 = com.appboy.a.b(a);
            ec ec1 = a.d;
            String s = ec1.b.getString("uid", "");
            aw1.a(ec1.a(new JSONArray(ec1.b.getString("cards", "[]")), s, true, ec1.b.getLong("cards_timestamp", -1L)), com/appboy/c/a);
            return;
        }
        catch (JSONException jsonexception)
        {
            com.appboy.a.h();
        }
    }
}
