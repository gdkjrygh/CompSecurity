// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;

import com.google.android.apps.gsa.shared.util.f;
import com.google.android.apps.gsa.shared.util.g;
import com.google.android.apps.gsa.speech.audio.l;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class b extends FilterInputStream
{

    private final f a = new f();
    private final l b;

    protected b(InputStream inputstream, g g)
    {
        super(inputstream);
        a.a(g);
        b = new l(a);
    }

    public final int read(byte abyte0[], int i, int j)
    {
        j = super.read(abyte0, i, j);
        if (j > 0)
        {
            b.a(abyte0, i, j);
        }
        return j;
    }
}
