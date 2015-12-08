// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.d.e;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            cj

public final class db
    implements cj, e
{

    public final JSONObject a;

    public db(JSONObject jsonobject)
    {
        a = jsonobject;
    }

    public final boolean c()
    {
        return a == null || a.length() == 0;
    }

    public final volatile Object forJsonPut()
    {
        return a;
    }
}
