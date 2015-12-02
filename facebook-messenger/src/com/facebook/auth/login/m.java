// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.auth.login:
//            c, AuthFragmentConfig

public class m extends f
{

    protected final c control;

    public m(Context context, c c1)
    {
        super(context);
        control = c1;
    }

    protected Bundle getArguments()
    {
        return control.d().b;
    }

    protected int getResource(String s, int i)
    {
        Bundle bundle = getArguments();
        int j = 0;
        if (bundle != null)
        {
            j = bundle.getInt(s, i);
        }
        if (j == 0)
        {
            return i;
        } else
        {
            return j;
        }
    }
}
