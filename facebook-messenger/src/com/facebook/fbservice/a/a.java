// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.a;

import android.content.Context;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.p;
import com.facebook.inject.t;
import com.google.common.d.a.s;

public class a
    implements e
{

    private final p a;
    private final k b;
    private final Context c;

    public a(p p1, k k1, Context context)
    {
        a = p1;
        b = k1;
        c = context;
    }

    public OperationResult a(ad ad1)
    {
        Object obj = ad1.a();
        if (a.d(((OperationType) (obj))) == a.d(((OperationType) (obj)).d()))
        {
            obj = a.a(((OperationType) (obj)).d());
            return ((e)t.a(c).a(com/facebook/fbservice/service/e, ((Class) (obj)))).a(ad1);
        } else
        {
            return (OperationResult)b.a(((OperationType) (obj)).d(), ad1.b()).b().get();
        }
    }
}
