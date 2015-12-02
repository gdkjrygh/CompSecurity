// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.google.common.b.a;
import com.google.common.b.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

// Referenced classes of package com.facebook.http.protocol:
//            ab

public class ad extends ab
{

    private final File a;

    public ad(File file, String s, String s1)
    {
        super(s, (int)file.length(), s1);
        a = file;
    }

    public void a(OutputStream outputstream)
    {
        FileInputStream fileinputstream = new FileInputStream(a);
        com.google.common.b.a.a(fileinputstream, outputstream);
        c.a(fileinputstream);
        return;
        outputstream;
        c.a(fileinputstream);
        throw outputstream;
    }
}
