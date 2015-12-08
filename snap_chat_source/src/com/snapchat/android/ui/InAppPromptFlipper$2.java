// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            InAppPromptFlipper

final class a
    implements Runnable
{

    final InAppPromptFlipper a;

    public final void run()
    {
        a.setVisibility(0);
        a.post(new Runnable() {

            private InAppPromptFlipper._cls2 a;

            public final void run()
            {
                a.a.a(0, 1.5D);
            }

            
            {
                a = InAppPromptFlipper._cls2.this;
                super();
            }
        });
    }

    _cls1.a(InAppPromptFlipper inapppromptflipper)
    {
        a = inapppromptflipper;
        super();
    }
}
