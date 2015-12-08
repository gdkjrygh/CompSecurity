// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            di, dx, cq, ax, 
//            h

public final class dk extends di
{

    private ax a;
    private final boolean b;
    private Context c;

    public dk(Context context, ax ax1, boolean flag)
    {
        a = ax1;
        b = flag;
        c = context;
    }

    public final void a()
    {
        (new StringBuilder("Setting opt out status to ")).append(b).append(".  This will take effect in the next user session.");
        dx.b();
        boolean flag = b;
        ax ax1 = a;
        String s = cq.i.a();
        String s1 = cq.i.b();
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("optOutStatus", flag).put("optOutStatusSet", true);
        }
        catch (JSONException jsonexception) { }
        ax1.a(s, s1, jsonobject.toString());
        if (b)
        {
            android.content.SharedPreferences.Editor editor = c.getSharedPreferences("com.crittercism.optmz.config", 0).edit();
            editor.clear();
            editor.commit();
            h.b(c);
        }
    }
}
