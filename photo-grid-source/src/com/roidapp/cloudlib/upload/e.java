// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import java.util.Locale;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            f

public final class e
{

    public int a;
    public String b;
    public int c;
    public String d;
    public String e;
    public f f;
    public String g;
    public String h;
    public String i;

    public e()
    {
    }

    public final String toString()
    {
        return String.format(Locale.ENGLISH, "[UploadResult:%s:%s:%d:%s:%s]", new Object[] {
            d, b, Integer.valueOf(c), e, f
        });
    }
}
