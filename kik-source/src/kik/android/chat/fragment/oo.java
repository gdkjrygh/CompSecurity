// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.android.widget.KikAutoCompleteTextView;

// Referenced classes of package kik.android.chat.fragment:
//            on, KikRegistrationFragment

final class oo
    implements Runnable
{

    final on a;

    oo(on on1)
    {
        a = on1;
        super();
    }

    public final void run()
    {
        a.a._emailField.showDropDown();
    }
}
