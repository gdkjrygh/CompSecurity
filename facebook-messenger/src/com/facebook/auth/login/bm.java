// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Objects;
import javax.inject.a;

public class bm
{

    private final ContentResolver a;
    private final a b;
    private final a c;
    private final ObjectMapper d;

    public bm(a a1, a a2, ObjectMapper objectmapper, ContentResolver contentresolver)
    {
        b = a1;
        c = a2;
        d = objectmapper;
        a = contentresolver;
    }

    private boolean a(Context context, Intent intent)
    {
        intent = context.getPackageManager().resolveActivity(intent, 0);
        if (intent == null)
        {
            return false;
        }
        intent = a(context, ((ResolveInfo) (intent)).activityInfo.packageName);
        if (intent == null)
        {
            com.facebook.debug.log.b.d("SSO", "No signatures found for fb4a, or error occurred while retrieving them");
            return false;
        }
        com.facebook.debug.log.b.c("SSO", String.format("%d signatures found for fb4a", new Object[] {
            Integer.valueOf(intent.length)
        }));
        context = a(context, context.getPackageName());
        if (context == null)
        {
            com.facebook.debug.log.b.d("SSO", "No signatures found for orca, or error occurred while retrieving them");
            return false;
        }
        com.facebook.debug.log.b.c("SSO", String.format("%d signatures found for orca", new Object[] {
            Integer.valueOf(context.length)
        }));
        int k = intent.length;
        for (int i = 0; i < k; i++)
        {
            Signature signature = intent[i];
            int l = context.length;
            for (int j = 0; j < l; j++)
            {
                Signature signature1 = context[j];
                if (Objects.equal(signature.toCharsString(), signature1.toCharsString()))
                {
                    com.facebook.debug.log.b.c("SSO", "fb4a and orca signatures match!");
                    return true;
                }
            }

        }

        com.facebook.debug.log.b.d("SSO", "No matching signatures found!");
        return false;
    }

    private Signature[] a(Context context, String s)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 64).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    private Intent b()
    {
        Intent intent = new Intent();
        if (c.b() != com.facebook.config.a.b.PUBLIC)
        {
            intent.setClassName("com.facebook.wakizashi", "com.facebook.katana.ProxyAuth");
            return intent;
        } else
        {
            intent.setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth");
            return intent;
        }
    }

    public com.facebook.auth.credentials.b a()
    {
        if (c.b() == com.facebook.config.a.b.PUBLIC) goto _L2; else goto _L1
_L1:
        Object obj;
        com.facebook.debug.log.b.c("SSO", "Using wakizashi content provider URI");
        obj = Uri.parse("content://com.facebook.wakizashi.provider.UserValuesProvider/user_values");
_L9:
        Object obj1 = a.query(((Uri) (obj)), new String[] {
            "name", "value"
        }, "name='active_session_info'", null, null);
        if (!((Cursor) (obj1)).moveToNext()) goto _L4; else goto _L3
_L3:
        obj = ((Cursor) (obj1)).getString(1);
        com.facebook.debug.log.b.c("SSO", "fb4a session data obtained");
_L7:
        ((Cursor) (obj1)).close();
        if (!n.a(((CharSequence) (obj)))) goto _L6; else goto _L5
_L5:
        com.facebook.debug.log.b.e("SSO", "fb4a session information is empty!");
        return null;
_L2:
        com.facebook.debug.log.b.c("SSO", "Using katana content provider URI");
        obj = Uri.parse("content://com.facebook.katana.provider.UserValuesProvider/user_values");
        continue; /* Loop/switch isn't completed */
_L4:
        com.facebook.debug.log.b.d("SSO", "fb4a content provider has no session entry.");
        obj = null;
          goto _L7
        obj;
        try
        {
            ((Cursor) (obj1)).close();
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.facebook.debug.log.b.d("SSO", "Exception occurred while resolving fb4a session.", ((Throwable) (obj)));
        }
        return null;
_L6:
        Object obj2;
        obj1 = d.readTree(((String) (obj)));
        obj2 = ((JsonNode) (obj1)).get("profile");
        obj = e.b(((JsonNode) (obj2)).get("uid"));
        obj2 = e.b(((JsonNode) (obj2)).get("name"));
        obj1 = e.b(((JsonNode) (obj1)).get("access_token"));
        if (obj != null && obj2 != null && obj1 != null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        com.facebook.debug.log.b.e("SSO", "fb4a session information is malformed");
        return null;
        obj = new com.facebook.auth.credentials.b(((String) (obj)), ((String) (obj2)), ((String) (obj1)));
        return ((com.facebook.auth.credentials.b) (obj));
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean a(Context context)
    {
        return ((Boolean)b.b()).booleanValue() && b(context);
    }

    public boolean b(Context context)
    {
        if (!a(context, b()))
        {
            com.facebook.debug.log.b.e("SSO", "fb4a application package has no matching signatures");
        } else
        {
            context = a();
            if (context == null)
            {
                com.facebook.debug.log.b.d("SSO", "User is not logged into FB4A, or there was an error retrieving the session.");
            }
            if (context != null)
            {
                return true;
            }
        }
        return false;
    }

    public boolean c(Context context)
    {
        return a(context, b());
    }
}
