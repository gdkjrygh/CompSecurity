// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.cm;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crashlytics.android:
//            af

class ad
{

    private final File a;
    private final Map b;

    public ad(File file)
    {
        this(file, Collections.emptyMap());
    }

    public ad(File file, Map map)
    {
        a = file;
        b = new HashMap(map);
        if (a.length() == 0L)
        {
            b.putAll(af.a);
        }
    }

    public boolean a()
    {
        cm.a().b().a("Crashlytics", (new StringBuilder("Removing report at ")).append(a.getPath()).toString());
        return a.delete();
    }

    public String b()
    {
        return d().getName();
    }

    public String c()
    {
        String s = b();
        return s.substring(0, s.lastIndexOf('.'));
    }

    public File d()
    {
        return a;
    }

    public Map e()
    {
        return Collections.unmodifiableMap(b);
    }
}
