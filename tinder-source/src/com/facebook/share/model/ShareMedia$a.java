// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Bundle;

// Referenced classes of package com.facebook.share.model:
//            ShareMedia

public static abstract class a
{

    Bundle a;

    public a a(ShareMedia sharemedia)
    {
        if (sharemedia == null)
        {
            return this;
        } else
        {
            sharemedia = new Bundle(sharemedia.a);
            a.putAll(sharemedia);
            return this;
        }
    }

    public ()
    {
        a = new Bundle();
    }
}
