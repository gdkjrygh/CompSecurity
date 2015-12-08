// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.presentation;


// Referenced classes of package org.xwalk.core.internal.extension.api.presentation:
//            PresentationExtension

class this._cls0
    implements org.xwalk.core.internal.extension.api.layListener
{

    final PresentationExtension this$0;

    public void onDisplayAdded(int i)
    {
        int _tmp = PresentationExtension.access$004(PresentationExtension.this);
        if (PresentationExtension.access$000(PresentationExtension.this) == 1)
        {
            PresentationExtension.access$100(PresentationExtension.this, true);
        }
    }

    public void onDisplayChanged(int i)
    {
    }

    public void onDisplayRemoved(int i)
    {
        int _tmp = PresentationExtension.access$006(PresentationExtension.this);
        if (PresentationExtension.access$000(PresentationExtension.this) == 0)
        {
            PresentationExtension.access$100(PresentationExtension.this, false);
            PresentationExtension.access$200(PresentationExtension.this);
        }
    }

    ()
    {
        this$0 = PresentationExtension.this;
        super();
    }
}
