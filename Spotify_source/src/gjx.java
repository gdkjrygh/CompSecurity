// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.Map;

public final class gjx extends gjs
{

    private final Flags c;

    public gjx(Context context, Flags flags)
    {
        super(context);
        c = flags;
    }

    public final void a()
    {
        Object obj1 = super.b;
        Object obj = (String)((Map) (obj1)).get("shareText");
        String s = (String)((Map) (obj1)).get("title");
        String s1 = (String)((Map) (obj1)).get("subtitle");
        obj1 = (String)((Map) (obj1)).get("uri");
        if (TextUtils.isEmpty(((CharSequence) (obj))) || TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            return;
        } else
        {
            fpa fpa1 = (new fpa(a, c)).a(s);
            fpa1.a.putExtra("subtitle", s1);
            obj = fpa1.a(true).b(s).c(((String) (obj))).a();
            a.startActivity(((Intent) (obj)));
            return;
        }
    }
}
