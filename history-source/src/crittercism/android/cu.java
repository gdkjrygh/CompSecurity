// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            cw, au, br, bn, 
//            dx, cx

public final class cu
    implements cw
{
    public static final class a
        implements cx
    {

        public final cw a(au au1)
        {
            return new cu(au1);
        }

        public a()
        {
        }
    }


    public Map a;

    public cu(au au1)
    {
        a = new HashMap();
        a.put("app_id", au1.a());
        a.put("hashed_device_id", au1.c());
        a.put("library_version", "5.0.4");
    }

    public final cu a(String s, String s1)
    {
        a.put(s, s1);
        return this;
    }

    public final cu a(String s, JSONArray jsonarray)
    {
        a.put(s, jsonarray);
        return this;
    }

    public final cw a(br br1)
    {
        br1.d();
        a.put(br1.d(), (new bn(br1)).a);
        return this;
    }

    public final void a(OutputStream outputstream)
    {
        dx.b();
        outputstream.write((new JSONObject(a)).toString().getBytes("UTF8"));
    }
}
