// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.presentation;


// Referenced classes of package org.xwalk.core.internal.extension.api.presentation:
//            PresentationExtension, XWalkPresentationContent, PresentationView

class this._cls0
    implements ationListener
{

    final PresentationExtension this$0;

    public void onDismiss(PresentationView presentationview)
    {
        if (presentationview == PresentationExtension.access$900(PresentationExtension.this))
        {
            if (PresentationExtension.access$500(PresentationExtension.this) != null)
            {
                PresentationExtension.access$500(PresentationExtension.this).onPause();
            }
            PresentationExtension.access$902(PresentationExtension.this, null);
        }
    }

    public void onShow(PresentationView presentationview)
    {
        if (presentationview == PresentationExtension.access$900(PresentationExtension.this) && PresentationExtension.access$500(PresentationExtension.this) != null)
        {
            PresentationExtension.access$500(PresentationExtension.this).onResume();
        }
    }

    ()
    {
        this$0 = PresentationExtension.this;
        super();
    }
}
