// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog;

import com.nuance.b.b.em;

// Referenced classes of package com.dominos.nina.dialog:
//            DialogModelBuilder

class this._cls0
    implements em
{

    final DialogModelBuilder this$0;

    public String filter(String s)
    {
        s = DialogModelBuilder.globalTextFilter(s);
        if (s != null)
        {
            return s.toLowerCase();
        } else
        {
            return null;
        }
    }

    ()
    {
        this$0 = DialogModelBuilder.this;
        super();
    }
}
