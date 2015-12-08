// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;

public final class emo extends fud
    implements opl, ops, opv
{

    private final emr c;
    private Bundle d;

    public emo(am am, opd opd, int i, emr emr1)
    {
        super(am, opd, i);
        c = emr1;
    }

    public final ei a(int i, Bundle bundle)
    {
        ArrayList arraylist = bundle.getParcelableArrayList("com.google.android.apps.photos.core.media_list");
        return new emn(b, arraylist, (ekk)bundle.getParcelable("com.google.android.apps.photos.core.loader.feature_class_names"));
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            d = bundle.getBundle("args");
        }
    }

    public final void a(ei ei, Object obj)
    {
        ei = (elb)obj;
        c.b(ei);
    }

    public final void a(ekp ekp, ekk ekk1)
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(ekp);
        a(arraylist, ekk1);
    }

    public final void a(ArrayList arraylist, ekk ekk1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("com.google.android.apps.photos.core.media_list", arraylist);
        bundle.putParcelable("com.google.android.apps.photos.core.loader.feature_class_names", ekk1);
        if (b.a(bundle, d))
        {
            b(d);
            return;
        } else
        {
            d = bundle;
            c(d);
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBundle("args", d);
    }
}
