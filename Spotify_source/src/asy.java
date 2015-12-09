// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.protocol.enums.MessageType;
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;

public final class asy
{

    private ByteArrayOutputStream a;
    private int b;
    private asx c;

    protected asy(asx asx1)
    {
        c = asx1;
        super();
        a = null;
        b = 0;
    }

    private void b(asv asv1, byte abyte0[])
    {
        a.write(abyte0, 0, asv1.g);
        if (asv1.c == ata.d && asv1.e == 0)
        {
            abyte0 = new asw();
            abyte0.b = asv1.d;
            abyte0.c = asv1.f;
            if (c.b > 1)
            {
                ast ast1 = ast.a(a.toByteArray());
                abyte0.a = c.b;
                abyte0.d = ast1.a;
                abyte0.e = ast1.b;
                abyte0.f = ast1.c;
                if (ast1.d > 0)
                {
                    abyte0.a(ast1.e);
                }
                if (ast1.f != null)
                {
                    abyte0.b(ast1.f);
                }
            } else
            {
                abyte0.a(a.toByteArray());
            }
            c.d.remove(Integer.valueOf(asv1.h));
            try
            {
                c.b(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (asv asv1)
            {
                axt.a((new StringBuilder("Failure propagating onProtocolMessageReceived: ")).append(asv1.toString()).toString(), asv1);
            }
            a = null;
        }
    }

    private void c(asv asv1, byte abyte0[])
    {
        if (asv1.c == ata.c)
        {
            b = axr.a(abyte0, 0) - asx.a();
            a = new ByteArrayOutputStream(b);
            return;
        } else
        {
            b(asv1, abyte0);
            return;
        }
    }

    protected final void a(asv asv1, byte abyte0[])
    {
        if (asv1.c.a(ata.a))
        {
            if (asv1.e == ((axs) (asz.g)).h)
            {
                abyte0 = c;
                byte byte0 = asv1.f;
                ((ass) (abyte0)).a.a(byte0);
            } else
            {
                if (asv1.e == ((axs) (asz.b)).h)
                {
                    asx.a(c, asv1.d, asv1.f);
                    return;
                }
                if (asv1.e == ((axs) (asz.c)).h)
                {
                    if (c.e.get(Byte.valueOf(asv1.f)) == null)
                    {
                        abyte0 = ((byte []) (new Object()));
                        c.e.put(Byte.valueOf(asv1.f), abyte0);
                    }
                    if (c.b > 1)
                    {
                        c.c = asv1.h;
                    }
                    abyte0 = c;
                    atc atc1 = asv1.d;
                    byte byte1 = asv1.f;
                    byte byte2 = c.b;
                    ((ass) (abyte0)).a.a(atc1, byte1, byte2, "");
                    return;
                }
                if (asv1.e == ((axs) (asz.d)).h)
                {
                    c.a((new StringBuilder("Got StartSessionNACK for protocol sessionID=")).append(asv1.f).toString(), null);
                    return;
                }
                if (asv1.e != ((axs) (asz.e)).h)
                {
                    continue;
                }
                if (c.b > 1)
                {
                    if (c.c == asv1.h)
                    {
                        c.a(asv1.d, asv1.f, "");
                        return;
                    }
                } else
                {
                    c.a(asv1.d, asv1.f, "");
                    return;
                }
            }
            do
            {
                return;
            } while (asv1.e != ((axs) (asz.f)).h);
            c.a(asv1.d, asv1.f, "");
            return;
        }
        if (asv1.c == ata.c || asv1.c == ata.d)
        {
            c(asv1, abyte0);
            return;
        }
        asw asw1 = new asw();
        MessageType messagetype;
        if (asv1.d == atc.b)
        {
            messagetype = MessageType.c;
        } else
        if (asv1.d == atc.c)
        {
            messagetype = MessageType.b;
        }
        asw1.b = asv1.d;
        asw1.c = asv1.f;
        if (c.b > 1)
        {
            abyte0 = ast.a(abyte0);
            asw1.a = c.b;
            asw1.d = ((ast) (abyte0)).a;
            asw1.e = ((ast) (abyte0)).b;
            asw1.f = ((ast) (abyte0)).c;
            if (((ast) (abyte0)).d > 0)
            {
                asw1.a(((ast) (abyte0)).e);
            }
            if (((ast) (abyte0)).f != null)
            {
                asw1.b(((ast) (abyte0)).f);
            }
        } else
        {
            asw1.a(abyte0);
        }
        c.d.remove(Integer.valueOf(asv1.h));
        try
        {
            c.b(asw1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (asv asv1)
        {
            axt.a((new StringBuilder("Failure propagating onProtocolMessageReceived: ")).append(asv1.toString()).toString(), asv1);
        }
        c.a("Failure propagating onProtocolMessageReceived: ", asv1);
    }
}
