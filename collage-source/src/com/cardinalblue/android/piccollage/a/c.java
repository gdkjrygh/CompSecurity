// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.facebook.login.LoginManager;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.a:
//            f

public class c
{

    public static final List a = Arrays.asList(new String[] {
        "email", "user_photos", "user_friends"
    });
    public static final List b = Arrays.asList(new String[] {
        "publish_actions"
    });

    public c()
    {
    }

    public static Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1;
        if (bitmap == null)
        {
            bitmap1 = null;
        } else
        {
            int i = Math.min(bitmap.getWidth(), bitmap.getHeight());
            bitmap1 = bitmap;
            if (i < 600)
            {
                float f1 = 600F / (float)i;
                return Bitmap.createScaledBitmap(bitmap, (int)((float)bitmap.getWidth() * f1), (int)(f1 * (float)bitmap.getHeight()), false);
            }
        }
        return bitmap1;
    }

    public static void a(Context context)
    {
        LoginManager.getInstance().logOut();
        context = context.getSharedPreferences("cardinalblue_3", 0).edit();
        context.remove("facebook_user_name");
        context.remove("facebook_uid");
        context.remove("facebook_email");
        context.apply();
    }

    public static void a(Context context, JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        }
        context = context.getSharedPreferences("cardinalblue_3", 0).edit();
        try
        {
            if (jsonobject.has("name"))
            {
                context.putString("facebook_user_name", jsonobject.getString("name"));
            }
            if (jsonobject.has("id"))
            {
                context.putString("facebook_uid", jsonobject.getString("id"));
            }
            if (jsonobject.has("email"))
            {
                context.putString("facebook_email", jsonobject.getString("email"));
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            f.a(jsonobject);
        }
        context.apply();
    }

}
