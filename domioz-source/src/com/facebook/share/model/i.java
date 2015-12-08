// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Bundle;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphValueContainer

public abstract class i
{

    private Bundle a;

    public i()
    {
        a = new Bundle();
    }

    static Bundle a(i j)
    {
        return j.a;
    }

    public i a(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
    {
        if (shareopengraphvaluecontainer != null)
        {
            a.putAll(shareopengraphvaluecontainer.a());
        }
        return this;
    }

    public final i a(String s, String s1)
    {
        a.putString(s, s1);
        return this;
    }
}
