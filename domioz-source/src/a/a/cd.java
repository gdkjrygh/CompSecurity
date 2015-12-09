// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.c;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            bk

public final class cd
    implements bk, c
{

    public final JSONObject a;

    public cd(JSONObject jsonobject)
    {
        a = jsonobject;
    }

    public final volatile Object a()
    {
        return a;
    }

    public final boolean d()
    {
        return a == null || a.length() == 0;
    }
}
