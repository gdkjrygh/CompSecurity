// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.json.JSONArray;

// Referenced classes of package b.a:
//            dl

public final class h extends dl
{

    public h()
    {
    }

    public h(String s)
    {
        s = new JSONArray(s);
        super.a = s.getString(0);
        super.b = s.getInt(1);
        c();
    }
}
