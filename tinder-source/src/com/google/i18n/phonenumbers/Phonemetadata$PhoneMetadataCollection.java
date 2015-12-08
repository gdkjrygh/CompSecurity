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

public static class a
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    List a;

    public void readExternal(ObjectInput objectinput)
        throws IOException
    {
        int j = objectinput.readInt();
        for (int i = 0; i < j; i++)
        {
            a a1 = new a();
            a1.al(objectinput);
            a.add(a1);
        }

    }

    public void writeExternal(ObjectOutput objectoutput)
        throws IOException
    {
        int j = a.size();
        objectoutput.writeInt(j);
        for (int i = 0; i < j; i++)
        {
            ((a)a.get(i)).nal(objectoutput);
        }

    }

    public ()
    {
        a = new ArrayList();
    }
}
