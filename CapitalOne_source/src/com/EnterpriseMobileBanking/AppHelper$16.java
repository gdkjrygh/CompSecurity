// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;


// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper, EnterpriseMobileBanking

static final class ileBanking
    implements Runnable
{

    public void run()
    {
        boolean flag;
        if (AppHelper.access$000().getLastLob() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        AppHelper.access$000().switchProducts(flag);
    }

    ileBanking()
    {
    }
}
