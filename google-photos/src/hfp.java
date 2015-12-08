// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class hfp
    implements Runnable
{

    private am a;
    private hfo b;

    hfp(hfo hfo1, am am1)
    {
        b = hfo1;
        a = am1;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = b;
        obj = a;
        obj2 = (new msn()).a(((hfo) (obj1)).a, ((am) (obj)));
        if (((msn) (obj2)).a.isEmpty()) goto _L2; else goto _L1
_L1:
        obj2 = new mry(-1, ((msn) (obj2)));
        obj1 = ((hfo) (obj1)).a;
_L11:
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof omp)) goto _L6; else goto _L5
_L5:
        obj = ((omp)obj).ad;
_L7:
        ((mry) (obj2)).b(((android.content.Context) (obj)));
_L9:
        return;
_L6:
        obj = ((am) (obj)).E;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = obj1;
          goto _L7
_L2:
        if (!((hfo) (obj1)).b.a()) goto _L9; else goto _L8
_L8:
        noy.a("fragment", obj);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
