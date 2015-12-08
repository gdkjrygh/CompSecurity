// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f;

import com.kik.m.e;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kik.a.f.d.a.a;
import kik.a.h.h;
import org.d.a.b;

// Referenced classes of package kik.a.f:
//            g

public final class n extends a
{

    private byte b[];

    public n()
    {
    }

    public final int a()
    {
        next();
        return getDepth();
    }

    public final int a(boolean flag)
    {
        if (getEventType() == 1)
        {
            throw new b("At end of document");
        }
        int l = getLineNumber();
        int i1 = getColumnNumber();
        int j = super.next();
        int i = j;
        if (!flag)
        {
            i = j;
            if (j == 2)
            {
                i = j;
                if ("enc".equals(getName()))
                {
                    String s1 = getAttributeValue(null, "iv");
                    String s = getAttributeValue(null, "mac");
                    if (s1 == null)
                    {
                        throw new g("Missing initialization vector");
                    }
                    if (s == null)
                    {
                        throw new g("Missing block mac");
                    }
                    if (super.next() != 4)
                    {
                        throw new g("Missing text for encrypted block");
                    }
                    byte abyte0[] = e.a(s1, 16);
                    byte abyte1[] = e.a(getText(), 16);
                    if (b == null)
                    {
                        throw new g("No key specified");
                    }
                    abyte1 = h.b(abyte1, b, abyte0);
                    if (abyte1 == null)
                    {
                        throw new g("Failed to decrypt");
                    }
                    abyte0 = new String(abyte1);
                    char ac[] = e.a(s, 16);
                    try
                    {
                        abyte1 = h.b(abyte1, b);
                    }
                    catch (NoSuchAlgorithmException nosuchalgorithmexception)
                    {
                        throw new g(nosuchalgorithmexception);
                    }
                    catch (InvalidKeyException invalidkeyexception)
                    {
                        throw new g(invalidkeyexception);
                    }
                    if (abyte1 == null || !Arrays.equals(abyte1, ac))
                    {
                        throw new g("MAC mismatch");
                    }
                    if (super.next() != 3 || !"enc".equals(getName()))
                    {
                        throw new g("Missing end tag for encrypted block");
                    }
                    invalidkeyexception = new char[Math.max(srcBuf.length, abyte0.length() + srcCount + peekCount)];
                    System.arraycopy(abyte0.toCharArray(), 0, invalidkeyexception, 0, abyte0.length());
                    int k = 0;
                    for (i = 0; k < peekCount; i++)
                    {
                        invalidkeyexception[i] = (char)peek[k];
                        k++;
                    }

                    i = abyte0.length() + i;
                    System.arraycopy(srcBuf, srcPos, invalidkeyexception, i, srcCount - srcPos);
                    srcCount = i + (srcCount - srcPos);
                    srcPos = 0;
                    srcBuf = invalidkeyexception;
                    peekCount = 0;
                    wasCR = false;
                    line = l;
                    column = i1;
                    i = super.next();
                }
            }
        }
        return i;
    }

    public final void a(int i, String s)
    {
        for (; getEventType() != i || !s.equals(getName()); next()) { }
    }

    public final void a(String s, String s1)
    {
        if (getEventType() != 2)
        {
            throw new b((new StringBuilder("Required start of ")).append(s1).append(" but was not at the start of a tag.").toString());
        }
        if (s1 != null && !s1.equals(getName()))
        {
            throw new b((new StringBuilder("Required start of '")).append(s1).append("' tag but got start of '").append(getName()).append(";").toString());
        }
        if (s != null && !s.equals(getAttributeValue(null, "xmlns")))
        {
            throw new b((new StringBuilder("Required namespace: ")).append(s).append(" got: ").append(getAttributeValue(null, "xmlns")).toString());
        } else
        {
            return;
        }
    }

    public final void a(byte abyte0[])
    {
        b = abyte0;
    }

    public final boolean a(String s)
    {
        return getEventType() == 2 && (s == null || s.equals(getName()));
    }

    public final void b(String s, String s1)
    {
        if (getEventType() != 2)
        {
            throw new b("Required attribute but was not at the start of a tag.");
        }
        s = getAttributeValue(null, s);
        if (s == null || !s1.equals(s))
        {
            throw new b((new StringBuilder("Expected value '")).append(s1).append("'  but got '").append(s).append("'").toString());
        } else
        {
            return;
        }
    }

    public final boolean b(String s)
    {
        return getEventType() == 3 && s.equals(getName());
    }

    public final int next()
    {
        return a(false);
    }

    public final void skipSubTree()
    {
        require(2, null, null);
        int i = 1;
        do
        {
            if (i <= 0)
            {
                break;
            }
            int j = a(true);
            if (j == 3)
            {
                i--;
            } else
            if (j == 2)
            {
                i++;
            }
        } while (true);
    }
}
