// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.facebook.internal.LikeActionController;

public final class aqn
    implements Runnable
{

    private Context a;
    private String b;
    private aqo c;

    public aqn(Context context, String s, aqo aqo)
    {
        a = context;
        b = s;
        c = aqo;
    }

    public final void run()
    {
        LikeActionController.b(a, b, c);
    }
}
