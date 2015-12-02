// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import java.io.File;
import java.io.FileFilter;

// Referenced classes of package com.facebook.nobreak:
//            FrameworkSharedPreferencesExceptionRemedy

class a
    implements FileFilter
{

    final FrameworkSharedPreferencesExceptionRemedy a;

    public boolean accept(File file)
    {
        return file.getName().endsWith(".xml");
    }

    (FrameworkSharedPreferencesExceptionRemedy frameworksharedpreferencesexceptionremedy)
    {
        a = frameworksharedpreferencesexceptionremedy;
        super();
    }
}
