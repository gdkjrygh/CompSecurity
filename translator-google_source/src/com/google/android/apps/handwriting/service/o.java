// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.Intent;
import android.os.IInterface;
import com.google.android.libraries.handwriting.base.StrokeList;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            l

public interface o
    extends IInterface
{

    public abstract int a(String s, StrokeList strokelist, l l);

    public abstract int a(String s, StrokeList strokelist, String s1, String s2, l l);

    public abstract void a(Intent intent, l l);

    public abstract void a(String s);
}
