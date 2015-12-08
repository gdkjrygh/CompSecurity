// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class ofo
    implements ofq
{

    private static final Map a;

    ofo()
    {
    }

    public final boolean a(Intent intent)
    {
        intent = intent.getAction();
        return a.containsKey(intent);
    }

    public final msm b(Intent intent)
    {
        intent = intent.getAction();
        return new ogg(pwo.a, ((Integer)a.get(intent)).intValue());
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put("android.intent.action.VIEW", Integer.valueOf(1));
        hashmap.put("android.intent.action.SEND", Integer.valueOf(2));
        hashmap.put("android.intent.action.SEND_MULTIPLE", Integer.valueOf(3));
        hashmap.put("android.intent.action.GET_CONTENT", Integer.valueOf(4));
        hashmap.put("android.intent.action.PICK", Integer.valueOf(5));
        hashmap.put("android.intent.action.EDIT", Integer.valueOf(6));
        hashmap.put("com.android.camera.action.CROP", Integer.valueOf(7));
        hashmap.put("com.android.camera.action.TRIM", Integer.valueOf(8));
        hashmap.put("com.android.camera.action.REVIEW", Integer.valueOf(9));
        hashmap.put("android.intent.action.SET_WALLPAPER", Integer.valueOf(10));
        hashmap.put("android.intent.action.ATTACH_DATA", Integer.valueOf(11));
        a = Collections.unmodifiableMap(hashmap);
    }
}
