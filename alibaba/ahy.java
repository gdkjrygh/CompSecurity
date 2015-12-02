// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ahy
{

    public static Map a(Context context, Map map)
    {
        ahy;
        JVM INSTR monitorenter ;
        String s;
        HashMap hashmap;
        String s1;
        String s2;
        String s3;
        hashmap = new HashMap();
        s1 = aid.a(map, "tid", "");
        s2 = aid.a(map, "utdid", "");
        s3 = aid.a(map, "umid", "");
        s = ajl.a(context, "random", "random", "");
        map = s;
        if (!s.equals(""))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        s = UUID.randomUUID().toString();
        map = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        context = context.getSharedPreferences("random", 0).edit();
        map = s;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        context.clear();
        context.putString("random", s);
        context.commit();
        map = s;
        hashmap.put("AC1", s1);
        hashmap.put("AC2", s2);
        hashmap.put("AC3", s3);
        hashmap.put("AC4", map);
        ahy;
        JVM INSTR monitorexit ;
        return hashmap;
        context;
        throw context;
    }
}
