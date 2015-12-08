// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.music.spotlets.tracking.adjust.AdjustDeepLinkAttributionFlag;

public final class gpv
    implements gpr
{

    public gpv()
    {
    }

    public final String a()
    {
        return "Adjust";
    }

    public final void a(Intent intent)
    {
        boolean flag1;
        flag1 = true;
        intent = intent.getData();
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String as[];
        int i;
        int j;
        as = intent.getQuery().split("&");
        j = as.length;
        i = 0;
_L5:
        boolean flag;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        String as1[] = as[i].split("=");
        if (as1.length != 2)
        {
            flag = false;
        } else
        {
            String s = as1[0];
            if (!s.startsWith("adjust_"))
            {
                flag = false;
            } else
            if (as1[1].length() == 0)
            {
                flag = false;
            } else
            if (s.substring(7).length() == 0)
            {
                flag = false;
            } else
            {
                flag = true;
            }
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        flag = flag1;
_L6:
        if (flag)
        {
            dmz.a(gpw);
            gpw.a(intent);
            return;
        }
          goto _L1
_L4:
        i++;
          goto _L5
        flag = false;
          goto _L6
    }

    public final boolean a(Flags flags)
    {
        boolean flag1 = "true".equals(flags.a(fys.ak));
        boolean flag;
        if (AdjustDeepLinkAttributionFlag.b == flags.a(fys.aJ))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag1 && flag;
    }
}
