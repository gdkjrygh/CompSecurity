// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

public final class iec
{

    public Collection a;
    public ekq b;
    public dhx c;
    public boolean d;

    public iec()
    {
    }

    public final am a()
    {
        Object obj;
        Bundle bundle;
        boolean flag;
        if (a != null || b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must provide a media or a collection to be shared");
        bundle = new Bundle();
        if (a != null)
        {
            bundle.putParcelableArrayList("com.google.android.apps.photos.core.media_list", new ArrayList(a));
        } else
        {
            bundle.putParcelable("com.google.android.apps.photos.core.media_collection", b);
        }
        bundle.putBoolean("is_time_machine_share", d);
        if (c == null)
        {
            c = new dhx();
        }
        bundle.putParcelable("share_method_constraints", c);
        if (a == null)
        {
            obj = new idq();
        } else
        {
            obj = new idu();
        }
        ((am) (obj)).f(bundle);
        return ((am) (obj));
    }
}
