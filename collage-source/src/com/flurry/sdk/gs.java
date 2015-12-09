// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            gx

public class gs
{
    public static class a
        implements gx
    {

        public gs a(InputStream inputstream)
            throws IOException
        {
            if (inputstream == null)
            {
                return null;
            } else
            {
                inputstream = new DataInputStream(this, inputstream) {

                    final a a;

                    public void close()
                    {
                    }

            
            {
                a = a1;
                super(inputstream);
            }
                };
                gs gs1 = new gs();
                gs.a(gs1, inputstream.readUTF());
                return gs1;
            }
        }

        public void a(OutputStream outputstream, gs gs1)
            throws IOException
        {
            if (outputstream == null || gs1 == null)
            {
                return;
            } else
            {
                outputstream = new DataOutputStream(this, outputstream) {

                    final a a;

                    public void close()
                    {
                    }

            
            {
                a = a1;
                super(outputstream);
            }
                };
                outputstream.writeUTF(gs.a(gs1));
                outputstream.flush();
                return;
            }
        }

        public volatile void a(OutputStream outputstream, Object obj)
            throws IOException
        {
            a(outputstream, (gs)obj);
        }

        public Object b(InputStream inputstream)
            throws IOException
        {
            return a(inputstream);
        }

        public a()
        {
        }
    }


    private String a;

    private gs()
    {
    }


    public gs(String s)
    {
        a = s;
    }

    static String a(gs gs1)
    {
        return gs1.a;
    }

    static String a(gs gs1, String s)
    {
        gs1.a = s;
        return s;
    }

    public String a()
    {
        return a;
    }
}
