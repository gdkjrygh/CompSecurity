// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            InAppPromptFlipper

final class a
    implements 
{

    private InAppPromptFlipper a;

    public final void a(int i, int j, int k)
    {
    }

    public final void b(int i, int j, int k)
    {
    }

    public final void b_(int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            InAppPromptFlipper.a(a);
            return;

        case 1: // '\001'
            break;
        }
        if (InAppPromptFlipper.b(a))
        {
            InAppPromptFlipper.c();
        }
        a.setVisibility(8);
    }

    (InAppPromptFlipper inapppromptflipper)
    {
        a = inapppromptflipper;
        super();
    }
}
