// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;

public class jgq
{

    public final gbg a;

    jgq(Context context)
    {
        a = (gbg)olm.a(context, gbg);
    }

    public final jgn a(String s)
    {
        p.a(s);
        s = a.a("media_store_extra_slomo_transition", s);
        Object obj;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        byte abyte0[] = s.getBlob(s.getColumnIndexOrThrow("transition_data"));
        obj = (jgn)mve.a(new jgn(), abyte0);
        s.close();
        return ((jgn) (obj));
        s.close();
        return null;
        s;
        String s1;
        s1 = null;
        obj = s;
_L2:
        s1.close();
        throw obj;
        obj;
        s1 = s;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
