// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;

import android.content.Context;
import com.google.android.apps.gsa.a.a.a;
import com.google.android.apps.gsa.a.a.d;
import com.google.android.apps.gsa.shared.util.f;
import com.google.android.apps.gsa.speech.audio.AudioUtils;
import com.google.android.apps.gsa.speech.audio.b;

// Referenced classes of package com.google.android.libraries.translate.speech.s3:
//            c, g

final class e extends a
{

    final c f;
    private final Context g;

    public e(c c1, Context context, d d, com.google.android.apps.gsa.speech.b.a a1, f f1, int i)
    {
        f = c1;
        super(context, d, com.google.android.libraries.translate.speech.s3.c.a(c1), a1, f1, i);
        g = context;
    }

    protected final b a(int i)
    {
        return new g(f, AudioUtils.a(i));
    }
}
