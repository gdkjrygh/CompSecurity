// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.widget.ArrayAdapter;
import com.EnterpriseMobileBanking.Utils.MenuCallbackTask;
import java.util.List;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

static final class 
    implements Runnable
{

    public void run()
    {
        MenuCallbackTask.clearLastMenu();
        EnterpriseMobileBanking.access$800().clear();
        EnterpriseMobileBanking.access$1000().notifyDataSetChanged();
    }

    ()
    {
    }
}
