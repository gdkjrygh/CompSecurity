// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.text.TextUtils;
import com.google.a.ag;
import com.google.a.k;
import com.google.a.s;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            m, y, x, b, 
//            z

public final class w
{

    private final String a = "https://graph.facebook.com/v2.3/";
    private final String b = "/picture?type=album&access_token=";

    public w()
    {
    }

    private static List a(String s1, Type type)
    {
        s1 = (m)b(s1, type);
        if (s1 != null)
        {
            s1 = s1.a();
            if (s1 != null)
            {
                return s1;
            } else
            {
                throw new JSONException("FbApiresponse.list is empty");
            }
        } else
        {
            throw new JSONException("Empty response");
        }
    }

    private static Object b(String s1, Type type)
    {
        try
        {
            s1 = ((String) ((new s()).a().a(s1, type)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new JSONException(s1.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new JSONException(s1.getMessage());
        }
        return s1;
    }

    public final List a(String s1)
    {
        return a(s1, (new y(this)).b());
    }

    public final List a(String s1, String s2)
    {
        s2 = a(s2, (new x(this)).b());
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = s2.iterator();
        while (iterator.hasNext()) 
        {
            b b1 = (b)iterator.next();
            String s3 = b1.b();
            if (!TextUtils.isEmpty(s3))
            {
                stringbuilder.setLength(0);
                stringbuilder.append("https://graph.facebook.com/v2.3/").append(s3).append("/picture?type=album&access_token=").append(s1);
                b1.a(stringbuilder.toString());
            } else
            {
                iterator.remove();
            }
            (new StringBuilder("album[")).append(b1.d()).append("],count[").append(b1.a()).append("], coverUrl=").append(b1.b());
        }
        return s2;
    }

    public final List b(String s1)
    {
        return a(s1, (new z(this)).b());
    }
}
