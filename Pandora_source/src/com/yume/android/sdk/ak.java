// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import android.app.Activity;
import java.util.ArrayList;

// Referenced classes of package com.yume.android.sdk:
//            M, al, am, YuMeAdBlockType, 
//            YuMeAdEvent

final class ak extends Activity
{

    M a;
    ArrayList b;
    private Runnable c;

    public ak()
    {
        a = M.a();
        b = null;
        c = new al(this);
    }

    public final void a(YuMeAdBlockType yumeadblocktype, YuMeAdEvent yumeadevent, YuMeAdEvent yumeadevent1, String s)
    {
        try
        {
            if (b == null)
            {
                b = new ArrayList();
            }
            if (b != null)
            {
                am am1 = new am();
                am1.a = yumeadblocktype;
                am1.b = yumeadevent;
                am1.c = yumeadevent1;
                am1.d = s;
                b.add(am1);
                if (b.size() == 1)
                {
                    runOnUiThread(c);
                }
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (YuMeAdBlockType yumeadblocktype)
        {
            yumeadblocktype.printStackTrace();
        }
    }
}
