// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Set;

public final class anG extends anS
{

    public final SparseArray a = new SparseArray();
    public final Set b = new HashSet();

    anG(Activity activity, anK ank, aoh aoh)
    {
        super(activity, ank, aoh);
    }

    public final aok a(aoq aoq)
    {
        if ((aok)a.get(51966) == null)
        {
            anK ank = d;
            Activity activity = (Activity)c;
            Object obj = aoq;
            if (ank.d.a())
            {
                obj = new anK._cls5(ank, aoq);
            }
            aoq = new aok(activity, ((aoq) (obj)), ank.f);
            a.append(51966, aoq);
            return aoq;
        } else
        {
            throw new IllegalArgumentException("Purchase flow associated with requestCode=51966 already exists");
        }
    }

    public final void a()
    {
        b.clear();
        a.clear();
        super.a();
    }
}
