// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.pinterest.api:
//            SimpleMultipartEntity

class a
{

    public File a;
    public byte b[];
    final SimpleMultipartEntity c;

    private byte[] a(String s, String s1, String s2)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            bytearrayoutputstream.write(SimpleMultipartEntity.a(c));
            bytearrayoutputstream.write(SimpleMultipartEntity.a(s, s1));
            bytearrayoutputstream.write(SimpleMultipartEntity.a(s2));
            bytearrayoutputstream.write(SimpleMultipartEntity.a());
            bytearrayoutputstream.write(SimpleMultipartEntity.b());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("SimpleMultipartEntity", "createHeader ByteArrayOutputStream exception", s);
        }
        return bytearrayoutputstream.toByteArray();
    }

    public (SimpleMultipartEntity simplemultipartentity, String s, File file, String s1)
    {
        c = simplemultipartentity;
        super();
        b = a(s, file.getName(), s1);
        a = file;
    }
}
