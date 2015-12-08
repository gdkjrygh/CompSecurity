// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.content.SharedPreferences;
import java.util.Set;

// Referenced classes of package org.androidannotations.api.c:
//            b, m

public final class r extends b
{

    r(SharedPreferences sharedpreferences, String s, Set set)
    {
        super(sharedpreferences, s, set);
    }

    public final volatile Object a(Object obj)
    {
        obj = (Set)obj;
        return m.a(b, c, ((Set) (obj)));
    }

    protected final void c(Object obj)
    {
        obj = (Set)obj;
        android.content.SharedPreferences.Editor editor = b.edit();
        m.a(editor, c, ((Set) (obj)));
        m.a(editor);
    }
}
