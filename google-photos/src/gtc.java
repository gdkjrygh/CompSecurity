// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class gtc
    implements mpj
{

    private gtb a;

    gtc(gtb gtb1)
    {
        a = gtb1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        int j;
        boolean flag;
        flag = false;
        if (i != -1 || gtb.a(a) == null)
        {
            return;
        }
        intent = intent.getIntArrayExtra("intent_extra_permissions_grant_result");
        j = intent.length;
        i = 0;
_L3:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (intent[i] != -1) goto _L2; else goto _L1
_L1:
        if (gtb.b(a).a())
        {
            (new StringBuilder(57)).append("onActivityResult. All requested permission granted? ").append(flag);
        }
        if (flag)
        {
            gtb.a(a).a();
            return;
        } else
        {
            gtb.a(a).b();
            return;
        }
_L2:
        i++;
          goto _L3
        flag = true;
          goto _L1
    }
}
