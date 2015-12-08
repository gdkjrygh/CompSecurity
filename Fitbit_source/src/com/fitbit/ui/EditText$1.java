// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;


// Referenced classes of package com.fitbit.ui:
//            EditText

class a
    implements Runnable
{

    final EditText a;

    public void run()
    {
        a.setError(null);
        a.c(EditText.a(a));
    }

    (EditText edittext)
    {
        a = edittext;
        super();
    }
}
