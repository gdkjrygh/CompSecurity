// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a;

import com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException;
import com.google.f.e.m;

// Referenced classes of package com.google.android.apps.gsa.a:
//            k

public final class d
    implements k
{

    public d()
    {
    }

    public final NetworkRecognizeException a(m m1)
    {
        if (m1.a == 2)
        {
            return new com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException.ServerRecognizeException(m1.b);
        } else
        {
            return null;
        }
    }
}
