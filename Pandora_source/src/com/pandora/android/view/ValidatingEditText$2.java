// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.View;

// Referenced classes of package com.pandora.android.view:
//            ValidatingEditText

class a
    implements android.view.tener
{

    final ValidatingEditText a;

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            view = a;
            if (!a.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setError(flag);
        }
    }

    (ValidatingEditText validatingedittext)
    {
        a = validatingedittext;
        super();
    }
}
