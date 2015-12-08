// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import com.fitbit.data.bl.ChallengesUtils;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.i;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.e.a;
import com.fitbit.util.bf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengesFragment

protected static class c extends bf
{

    private Exception a;
    private com.fitbit.data.bl.ent.b.a b;
    private boolean c;

    public c a()
    {
        c c1;
        c1 = new <init>();
        com.fitbit.challenges.ui.a(c1, new ArrayList());
        b(c1, new ArrayList());
        com.fitbit.data.domain.Profile profile = an.a().b();
        if (profile != null)
        {
            com.fitbit.challenges.ui.a(c1, profile);
        }
        Object obj;
        boolean flag1;
        obj = i.a();
        flag1 = c;
        boolean flag;
        flag = flag1;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        Object obj1;
        if (((i) (obj)).c().size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dg.d().j(flag, null);
        com.fitbit.challenges.ui.a(c1, ((i) (obj)).d());
        obj1 = ((i) (obj)).c();
        obj = new ArrayList();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            ChallengeType challengetype = (ChallengeType)((Iterator) (obj1)).next();
            if (challengetype.h())
            {
                ((List) (obj)).add(challengetype);
            }
        } while (true);
          goto _L2
_L4:
        obj = com.fitbit.challenges.ui.a(c1).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Challenge challenge = (Challenge)((Iterator) (obj)).next();
            if (challenge.i() == com.fitbit.data.domain.challenges.atus.INVITED && ChallengesUtils.e(challenge))
            {
                ((Iterator) (obj)).remove();
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        try
        {
            b(c1, ((List) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (((ServerCommunicationException) (obj)).e() == 404)
            {
                com.fitbit.e.a.a("ChallengesFragment", "%s\nStatus code - %s", new Object[] {
                    String.valueOf(obj), Integer.valueOf(((ServerCommunicationException) (obj)).e())
                });
                com.fitbit.challenges.ui.a(c1, Collections.emptyList());
                b(c1, Collections.emptyList());
            } else
            {
                a(((Exception) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Exception) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
        Collections.sort(com.fitbit.challenges.ui.a(c1), b);
        return c1;
    }

    public void a(Exception exception)
    {
        com.fitbit.e.a.a("ChallengesFragment", exception.toString(), new Object[0]);
        a = exception;
    }

    public Exception b()
    {
        return a;
    }

    public Object f_()
    {
        return a();
    }

    public ionException(Context context, boolean flag)
    {
        super(context);
        b = new com.fitbit.data.bl.it>();
        c = flag;
    }
}
