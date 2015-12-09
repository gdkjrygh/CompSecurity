// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.Length;
import com.fitbit.util.al;
import com.fitbit.util.service.a;
import com.fitbit.weight.Weight;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService

public class ax extends a
{

    static String a = "com.fitbit.data.bl.Signup.ACTION";
    private static final String b = "Signup";
    private static final String c = "com.fitbit.data.bl.Signup.EXTRA_USER_NAME";
    private static final String d = "com.fitbit.data.bl.Signup.EXTRA_PASSWORD";
    private static final String e = "com.fitbit.data.bl.Signup.EXTRA_FULL_NAME";
    private static final String f = "com.fitbit.data.bl.Signup.EXTRA_BIRTHDAY";
    private static final String g = "com.fitbit.data.bl.Signup.EXTRA_HEIGHT";
    private static final String h = "com.fitbit.data.bl.Signup.EXTRA_WEIGHT";
    private static final String i = "com.fitbit.data.bl.Signup.EXTRA_GENDER";
    private static final String j = "com.fitbit.data.bl.Signup.EXTRA_EMAIL_NEWSLETTER";

    public ax()
    {
    }

    public static Intent a(Context context, String s, String s1, String s2, Date date, Length length, Weight weight, Gender gender, 
            boolean flag)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction(a);
        context.putExtra("com.fitbit.data.bl.Signup.EXTRA_USER_NAME", s);
        context.putExtra("com.fitbit.data.bl.Signup.EXTRA_PASSWORD", s1);
        context.putExtra("com.fitbit.data.bl.Signup.EXTRA_FULL_NAME", s2);
        context.putExtra("com.fitbit.data.bl.Signup.EXTRA_BIRTHDAY", date);
        context.putExtra("com.fitbit.data.bl.Signup.EXTRA_HEIGHT", length);
        context.putExtra("com.fitbit.data.bl.Signup.EXTRA_WEIGHT", weight);
        context.putExtra("com.fitbit.data.bl.Signup.EXTRA_GENDER", gender);
        context.putExtra("com.fitbit.data.bl.Signup.EXTRA_EMAIL_NEWSLETTER", flag);
        return context;
    }

    static void a(ax ax1, JSONObject jsonobject)
    {
        ax1.a(jsonobject);
    }

    private void a(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            try
            {
                jsonobject = com.fitbit.d.a.a(jsonobject.getJSONObject("user"), "locale");
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                com.fitbit.e.a.f("Signup", "Unable to parse profile object from register.json response", jsonobject, new Object[0]);
                jsonobject = null;
            }
            if (jsonobject != null)
            {
                al.b(jsonobject);
                return;
            }
        }
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        syncservice = intent.getStringExtra("com.fitbit.data.bl.Signup.EXTRA_USER_NAME");
        a(((String) (syncservice)), ((com.fitbit.util.service.a.a) (new _cls1(intent, syncservice))));
    }


    /* member class not found */
    class _cls1 {}

}
