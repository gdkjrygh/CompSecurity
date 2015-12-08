// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import java.util.Map;

public final class nvu
    implements mfh
{

    private Uri a;
    private String b;
    private nvz c;
    private nvt d;

    public nvu(nvt nvt1, Uri uri, String s, nvz nvz1)
    {
        d = nvt1;
        a = uri;
        b = s;
        c = nvz1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        intent = d.b;
        String s = String.valueOf(a);
        String s1 = b;
        intent.put((new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length())).append(s).append(s1).toString(), Integer.valueOf(i));
        if (i != 2) goto _L2; else goto _L1
_L1:
        nvv.a(d.a, nvx.b).a(a.toString());
_L4:
        c.b(i);
        return;
_L2:
        if (i != 0)
        {
            nvv.a(d.a, nvx.a).a(a.toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void c()
    {
        c.o();
    }
}
