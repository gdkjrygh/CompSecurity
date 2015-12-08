// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.login;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns.login:
//            LoginTipsTextView

final class m
    implements android.view.View.OnLongClickListener
{

    final LoginTipsTextView a;

    m(LoginTipsTextView logintipstextview)
    {
        a = logintipstextview;
        super();
    }

    public final boolean onLongClick(View view)
    {
        return true;
    }
}
