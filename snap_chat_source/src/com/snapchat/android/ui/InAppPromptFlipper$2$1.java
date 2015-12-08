// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            InAppPromptFlipper

final class a
    implements Runnable
{

    private a a;

    public final void run()
    {
        a.a.a(0, 1.5D);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/ui/InAppPromptFlipper$2

/* anonymous class */
    final class InAppPromptFlipper._cls2
        implements Runnable
    {

        final InAppPromptFlipper a;

        public final void run()
        {
            a.setVisibility(0);
            a.post(new InAppPromptFlipper._cls2._cls1(this));
        }

            
            {
                a = inapppromptflipper;
                super();
            }
    }

}
