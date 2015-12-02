// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.view.View;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            a, f

class b
    implements android.view..OnClickListener
{

    static final boolean a;
    final a b;

    public void onClick(View view)
    {
        view = (String)view.getTag();
        if (!a && view == null)
        {
            throw new AssertionError();
        }
        if (com.qihoo.security.opti.trashclear.filemanager.a.a(b).d(view))
        {
            return;
        } else
        {
            com.qihoo.security.opti.trashclear.filemanager.a.a(b, view);
            b.c();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/qihoo/security/opti/trashclear/filemanager/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    (a a1)
    {
        b = a1;
        super();
    }
}
