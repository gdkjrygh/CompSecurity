// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.google.i18n.phonenumbers:
//            Phonemetadata

public static class f
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private boolean a;
    private String b;
    private boolean c;
    private String d;
    private boolean e;
    private String f;

    public void readExternal(ObjectInput objectinput)
        throws IOException
    {
        if (objectinput.readBoolean())
        {
            String s = objectinput.readUTF();
            a = true;
            b = s;
        }
        if (objectinput.readBoolean())
        {
            String s1 = objectinput.readUTF();
            c = true;
            d = s1;
        }
        if (objectinput.readBoolean())
        {
            objectinput = objectinput.readUTF();
            e = true;
            f = objectinput;
        }
    }

    public void writeExternal(ObjectOutput objectoutput)
        throws IOException
    {
        objectoutput.writeBoolean(a);
        if (a)
        {
            objectoutput.writeUTF(b);
        }
        objectoutput.writeBoolean(c);
        if (c)
        {
            objectoutput.writeUTF(d);
        }
        objectoutput.writeBoolean(e);
        if (e)
        {
            objectoutput.writeUTF(f);
        }
    }

    public ()
    {
        b = "";
        d = "";
        f = "";
    }
}
