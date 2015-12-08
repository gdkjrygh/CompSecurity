// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Bundle;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphValueContainer

public static abstract class a
{

    Bundle a;

    static Bundle a(a a1)
    {
        return a1.a;
    }

    public a a(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
    {
        if (shareopengraphvaluecontainer != null)
        {
            a.putAll((Bundle)shareopengraphvaluecontainer.a.clone());
        }
        return this;
    }

    public ()
    {
        a = new Bundle();
    }
}
