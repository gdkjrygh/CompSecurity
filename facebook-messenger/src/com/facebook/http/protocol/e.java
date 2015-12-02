// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import android.os.Parcelable;
import com.facebook.fbservice.c.c;
import java.io.IOException;

// Referenced classes of package com.facebook.http.protocol:
//            ApiErrorResult

public class e extends IOException
    implements c
{

    private final ApiErrorResult a;

    public e(ApiErrorResult apierrorresult)
    {
        super(apierrorresult.b());
        a = apierrorresult;
    }

    public Parcelable a()
    {
        return b();
    }

    public ApiErrorResult b()
    {
        return a;
    }
}
