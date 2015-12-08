// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.util.Pair;
import com.tinder.e.as;
import com.tinder.events.EventRecsAdded;
import com.tinder.parse.UserParse;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ab

final class a
    implements com.android.volley.
{

    final as a;
    final ab b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("jsonObjectResponse=")).append(obj);
        int i;
        obj = (Pair)b.k.a(((JSONObject) (obj)), b.c);
        i = a[((com.tinder.parse.arse.RecsResponse)((Pair) (obj)).first).ordinal()];
        i;
        JVM INSTR tableswitch 1 2: default 80
    //                   1 89
    //                   2 171;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_171;
_L5:
        b.d = false;
        return;
_L2:
        try
        {
            b.a(false);
            b.a((ArrayList)((Pair) (obj)).second);
            b.i();
            b.l.c(new EventRecsAdded((List)((Pair) (obj)).second));
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            b.d = false;
            throw obj;
        }
        v.b(((Exception) (obj)).getMessage());
        a.c();
        b.d = false;
        return;
        a.d();
        if (true) goto _L5; else goto _L4
_L4:
    }

    csAdded(ab ab1, as as1)
    {
        b = ab1;
        a = as1;
        super();
    }
}
