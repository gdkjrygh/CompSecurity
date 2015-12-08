// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.SkyLib;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util:
//            ContactUtil

final class b
    implements Provider
{

    com.skype.anguageInfo_Result a;
    final SkyLib b;
    final ContactUtil c;

    public final Object get()
    {
        if (a == null)
        {
            com.skype.anguageInfo_Result anguageinfo_result = b.getISOLanguageInfo();
            a = anguageinfo_result;
            return anguageinfo_result;
        } else
        {
            return a;
        }
    }

    esult(ContactUtil contactutil, SkyLib skylib)
    {
        c = contactutil;
        b = skylib;
        super();
    }
}
