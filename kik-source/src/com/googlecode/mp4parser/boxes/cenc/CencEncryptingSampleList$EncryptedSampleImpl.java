// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;

// Referenced classes of package com.googlecode.mp4parser.boxes.cenc:
//            CencEncryptingSampleList

private class <init>
    implements Sample
{

    static final boolean $assertionsDisabled;
    private final SecretKey cek;
    private final CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat;
    private final Cipher cipher;
    private final Sample clearSample;
    final CencEncryptingSampleList this$0;

    public ByteBuffer asByteBuffer()
    {
        Object obj;
        ByteBuffer bytebuffer;
        CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat;
        int i;
        i = 0;
        obj = (ByteBuffer)clearSample.asByteBuffer().rewind();
        bytebuffer = ByteBuffer.allocate(((ByteBuffer) (obj)).limit());
        cencsampleauxiliarydataformat = cencSampleAuxiliaryDataFormat;
        initCipher(cencSampleAuxiliaryDataFormat.iv, cek);
        if (cencsampleauxiliarydataformat.pairs == null) goto _L2; else goto _L1
_L1:
        Object aobj[];
        int j;
        aobj = cencsampleauxiliarydataformat.pairs;
        j = aobj.length;
          goto _L3
_L6:
        byte abyte1[];
        com.mp4parser.iso23001.part7.leImpl leimpl;
        byte abyte0[];
        try
        {
            ((ByteBuffer) (obj)).rewind();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        bytebuffer.rewind();
        return bytebuffer;
_L7:
        leimpl = aobj[i];
        abyte1 = new byte[leimpl.cek()];
        ((ByteBuffer) (obj)).get(abyte1);
        bytebuffer.put(abyte1);
        if (leimpl.cek() <= 0L) goto _L5; else goto _L4
_L4:
        abyte0 = new byte[CastUtils.l2i(leimpl.cek())];
        ((ByteBuffer) (obj)).get(abyte0);
        if (!$assertionsDisabled && abyte0.length % 16 != 0)
        {
            throw new AssertionError();
        }
        abyte1 = cipher.update(abyte0);
        if (!$assertionsDisabled && abyte1.length != abyte0.length)
        {
            throw new AssertionError();
        }
        bytebuffer.put(abyte1);
          goto _L5
_L2:
        aobj = new byte[((ByteBuffer) (obj)).limit()];
        ((ByteBuffer) (obj)).get(((byte []) (aobj)));
        if ("cbc1".equals(CencEncryptingSampleList.access$1(CencEncryptingSampleList.this)))
        {
            i = (aobj.length / 16) * 16;
            bytebuffer.put(cipher.doFinal(((byte []) (aobj)), 0, i));
            bytebuffer.put(((byte []) (aobj)), i, aobj.length - i);
            break; /* Loop/switch isn't completed */
        }
        if (!"cenc".equals(CencEncryptingSampleList.access$1(CencEncryptingSampleList.this)))
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.put(cipher.doFinal(((byte []) (aobj))));
        break; /* Loop/switch isn't completed */
_L3:
        if (i < j) goto _L7; else goto _L6
_L5:
        i++;
          goto _L3
    }

    public long getSize()
    {
        return clearSample.getSize();
    }

    public void writeTo(WritableByteChannel writablebytechannel)
    {
        ByteBuffer bytebuffer;
        int i;
        i = 0;
        bytebuffer = (ByteBuffer)clearSample.asByteBuffer().rewind();
        initCipher(cencSampleAuxiliaryDataFormat.iv, cek);
        if (cencSampleAuxiliaryDataFormat.pairs == null || cencSampleAuxiliaryDataFormat.pairs.length <= 0) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        com.mp4parser.iso23001.part7.leImpl aleimpl[];
        int l;
        abyte0 = new byte[bytebuffer.limit()];
        bytebuffer.get(abyte0);
        aleimpl = cencSampleAuxiliaryDataFormat.pairs;
        l = aleimpl.length;
        int j = 0;
_L11:
        if (j < l) goto _L4; else goto _L3
_L3:
        writablebytechannel.write(ByteBuffer.wrap(abyte0));
_L8:
        bytebuffer.rewind();
        return;
_L4:
        com.mp4parser.iso23001.part7.leImpl leimpl = aleimpl[j];
        int k;
        try
        {
            k = i + leimpl.cencSampleAuxiliaryDataFormat();
        }
        // Misplaced declaration of an exception variable
        catch (WritableByteChannel writablebytechannel)
        {
            throw new RuntimeException(writablebytechannel);
        }
        // Misplaced declaration of an exception variable
        catch (WritableByteChannel writablebytechannel)
        {
            throw new RuntimeException(writablebytechannel);
        }
        // Misplaced declaration of an exception variable
        catch (WritableByteChannel writablebytechannel)
        {
            throw new RuntimeException(writablebytechannel);
        }
        i = k;
        if (leimpl.cencSampleAuxiliaryDataFormat() > 0L)
        {
            cipher.update(abyte0, k, CastUtils.l2i(leimpl.cipher()), abyte0, k);
            i = (int)((long)k + leimpl.cipher());
        }
          goto _L5
_L2:
        abyte0 = new byte[bytebuffer.limit()];
        bytebuffer.get(abyte0);
        if (!"cbc1".equals(CencEncryptingSampleList.access$1(CencEncryptingSampleList.this))) goto _L7; else goto _L6
_L6:
        i = (abyte0.length / 16) * 16;
        writablebytechannel.write(ByteBuffer.wrap(cipher.doFinal(abyte0, 0, i)));
        writablebytechannel.write(ByteBuffer.wrap(abyte0, i, abyte0.length - i));
          goto _L8
_L7:
        if (!"cenc".equals(CencEncryptingSampleList.access$1(CencEncryptingSampleList.this))) goto _L8; else goto _L9
_L9:
        writablebytechannel.write(ByteBuffer.wrap(cipher.doFinal(abyte0)));
          goto _L8
_L5:
        j++;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    private (Sample sample, CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat, Cipher cipher1, SecretKey secretkey)
    {
        this$0 = CencEncryptingSampleList.this;
        super();
        clearSample = sample;
        cencSampleAuxiliaryDataFormat = cencsampleauxiliarydataformat;
        cipher = cipher1;
        cek = secretkey;
    }

    cek(Sample sample, CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat, Cipher cipher1, SecretKey secretkey, cek cek1)
    {
        this(sample, cencsampleauxiliarydataformat, cipher1, secretkey);
    }
}
