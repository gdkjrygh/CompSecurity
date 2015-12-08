// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.i18n.phonenumbers:
//            Phonemetadata

public static class k
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    String a;
    String b;
    List c;
    String d;
    boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;

    public final int a()
    {
        return c.size();
    }

    public void readExternal(ObjectInput objectinput)
        throws IOException
    {
        String s = objectinput.readUTF();
        f = true;
        a = s;
        s = objectinput.readUTF();
        g = true;
        b = s;
        int i1 = objectinput.readInt();
        for (int l = 0; l < i1; l++)
        {
            c.add(objectinput.readUTF());
        }

        if (objectinput.readBoolean())
        {
            String s1 = objectinput.readUTF();
            h = true;
            d = s1;
        }
        if (objectinput.readBoolean())
        {
            String s2 = objectinput.readUTF();
            j = true;
            k = s2;
        }
        boolean flag = objectinput.readBoolean();
        i = true;
        e = flag;
    }

    public void writeExternal(ObjectOutput objectoutput)
        throws IOException
    {
        objectoutput.writeUTF(a);
        objectoutput.writeUTF(b);
        int i1 = a();
        objectoutput.writeInt(i1);
        for (int l = 0; l < i1; l++)
        {
            objectoutput.writeUTF((String)c.get(l));
        }

        objectoutput.writeBoolean(h);
        if (h)
        {
            objectoutput.writeUTF(d);
        }
        objectoutput.writeBoolean(j);
        if (j)
        {
            objectoutput.writeUTF(k);
        }
        objectoutput.writeBoolean(e);
    }

    public ()
    {
        a = "";
        b = "";
        c = new ArrayList();
        d = "";
        e = false;
        k = "";
    }
}
