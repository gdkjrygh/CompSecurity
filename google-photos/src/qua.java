// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class qua extends qtx
{

    private static Logger k = Logger.getLogger(qua.getName());
    public int a;
    public int b;
    public int c;
    public int g;
    public long h;
    public long i;
    public qtw j;
    private qub l;
    private List m;
    private byte n[];

    public qua()
    {
        m = new ArrayList();
    }

    public final int a()
    {
        int i1;
        if (j == null)
        {
            i1 = 0;
        } else
        {
            i1 = j.a();
        }
        return i1 + 15;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        a = b.a(bytebuffer.get());
        int i1 = b.a(bytebuffer.get());
        b = i1 >>> 2;
        c = i1 >> 1 & 1;
        g = b.b(bytebuffer);
        h = b.a(bytebuffer);
        i = b.a(bytebuffer);
        Object obj;
        if (bytebuffer.remaining() > 2)
        {
            int j1 = bytebuffer.position();
            qtx qtx1 = quh.a(a, bytebuffer);
            j1 = bytebuffer.position() - j1;
            Logger logger = k;
            String s = String.valueOf(qtx1);
            long l1;
            long l2;
            if (qtx1 != null)
            {
                obj = Integer.valueOf(qtx1.b());
            } else
            {
                obj = null;
            }
            obj = String.valueOf(obj);
            logger.finer((new StringBuilder(String.valueOf(s).length() + 48 + String.valueOf(obj).length())).append(s).append(" - DecoderConfigDescr1 read: ").append(j1).append(", size: ").append(((String) (obj))).toString());
            if (qtx1 != null)
            {
                int k1 = qtx1.b();
                if (j1 < k1)
                {
                    n = new byte[k1 - j1];
                    bytebuffer.get(n);
                }
            }
            if (qtx1 instanceof qub)
            {
                l = (qub)qtx1;
            }
            if (qtx1 instanceof qtw)
            {
                j = (qtw)qtx1;
            }
        }
        do
        {
            if (bytebuffer.remaining() <= 2)
            {
                break;
            }
            l1 = bytebuffer.position();
            qtx1 = quh.a(a, bytebuffer);
            l2 = bytebuffer.position();
            logger = k;
            s = String.valueOf(qtx1);
            if (qtx1 != null)
            {
                obj = Integer.valueOf(qtx1.b());
            } else
            {
                obj = null;
            }
            obj = String.valueOf(obj);
            logger.finer((new StringBuilder(String.valueOf(s).length() + 57 + String.valueOf(obj).length())).append(s).append(" - DecoderConfigDescr2 read: ").append(l2 - l1).append(", size: ").append(((String) (obj))).toString());
            if (qtx1 instanceof qui)
            {
                m.add((qui)qtx1);
            }
        } while (true);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DecoderConfigDescriptor");
        stringbuilder.append("{objectTypeIndication=").append(a);
        stringbuilder.append(", streamType=").append(b);
        stringbuilder.append(", upStream=").append(c);
        stringbuilder.append(", bufferSizeDB=").append(g);
        stringbuilder.append(", maxBitRate=").append(h);
        stringbuilder.append(", avgBitRate=").append(i);
        stringbuilder.append(", decoderSpecificInfo=").append(l);
        stringbuilder.append(", audioSpecificInfo=").append(j);
        StringBuilder stringbuilder1 = stringbuilder.append(", configDescriptorDeadBytes=");
        Object obj;
        if (n != null)
        {
            obj = n;
        } else
        {
            obj = new byte[0];
        }
        stringbuilder1.append(bav.a(((byte []) (obj))));
        stringbuilder1 = stringbuilder.append(", profileLevelIndicationDescriptors=");
        if (m == null)
        {
            obj = "null";
        } else
        {
            obj = Arrays.asList(new List[] {
                m
            }).toString();
        }
        stringbuilder1.append(((String) (obj)));
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
