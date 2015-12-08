// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.SharedPreferences;
import com.appboy.a;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package a.a:
//            db, w

public final class ay
    implements Runnable
{

    final a a;

    public ay(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        try
        {
            w w1 = com.appboy.a.b(a);
            db db1 = a.b;
            String s = db1.b.getString("uid", "");
            w1.a(db1.a(new JSONArray(db1.b.getString("cards", "[]")), s, true, db1.b.getLong("cards_timestamp", -1L)), com/appboy/c/a);
            return;
        }
        catch (JSONException jsonexception)
        {
            com.appboy.f.a.b(com.appboy.a.i(), "Failed to retrieve and publish feed from offline cache.", jsonexception);
        }
    }
}
