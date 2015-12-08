// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class CencDecryptingSampleList extends AbstractList
{

    String encryptionAlgo;
    RangeStartMap keys;
    List parent;
    List sencInfo;

    public CencDecryptingSampleList(RangeStartMap rangestartmap, List list, List list1, String s)
    {
        keys = new RangeStartMap();
        sencInfo = list1;
        keys = rangestartmap;
        parent = list;
        encryptionAlgo = s;
    }

    public CencDecryptingSampleList(SecretKey secretkey, List list, List list1)
    {
        this(new RangeStartMap(Integer.valueOf(0), secretkey), list, list1, "cenc");
    }

    public Sample get(int i)
    {
        if (keys.get(Integer.valueOf(i)) == null) goto _L2; else goto _L1
_L1:
        ByteBuffer bytebuffer;
        ByteBuffer bytebuffer1;
        Cipher cipher;
        Sample sample;
        CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat;
        sample = (Sample)parent.get(i);
        bytebuffer = sample.asByteBuffer();
        bytebuffer.rewind();
        bytebuffer1 = ByteBuffer.allocate(bytebuffer.limit());
        cencsampleauxiliarydataformat = (CencSampleAuxiliaryDataFormat)sencInfo.get(i);
        cipher = getCipher((SecretKey)keys.get(Integer.valueOf(i)), cencsampleauxiliarydataformat.iv);
        if (cencsampleauxiliarydataformat.pairs == null || cencsampleauxiliarydataformat.pairs.length <= 0) goto _L4; else goto _L3
_L3:
        com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair apair[];
        int j;
        apair = cencsampleauxiliarydataformat.pairs;
        j = apair.length;
        i = 0;
_L14:
        if (i < j) goto _L6; else goto _L5
_L5:
        if (bytebuffer.remaining() > 0)
        {
            System.err.println((new StringBuilder("Decrypted sample but still data remaining: ")).append(sample.getSize()).toString());
        }
        bytebuffer1.put(cipher.doFinal());
_L11:
        bytebuffer.rewind();
        bytebuffer1.rewind();
        return new SampleImpl(bytebuffer1);
_L6:
        com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair pair = apair[i];
        byte abyte0[];
        byte abyte2[];
        int l;
        try
        {
            int k = pair.clear();
            l = CastUtils.l2i(pair.encrypted());
            byte abyte1[] = new byte[k];
            bytebuffer.get(abyte1);
            bytebuffer1.put(abyte1);
        }
        catch (IllegalBlockSizeException illegalblocksizeexception)
        {
            throw new RuntimeException(illegalblocksizeexception);
        }
        catch (BadPaddingException badpaddingexception)
        {
            throw new RuntimeException(badpaddingexception);
        }
        if (l <= 0) goto _L8; else goto _L7
_L7:
        abyte2 = new byte[l];
        bytebuffer.get(abyte2);
        bytebuffer1.put(cipher.update(abyte2));
          goto _L8
_L4:
        abyte0 = new byte[bytebuffer.limit()];
        bytebuffer.get(abyte0);
        if (!"cbc1".equals(encryptionAlgo)) goto _L10; else goto _L9
_L9:
        i = (abyte0.length / 16) * 16;
        bytebuffer1.put(cipher.doFinal(abyte0, 0, i));
        bytebuffer1.put(abyte0, i, abyte0.length - i);
          goto _L11
_L10:
        if (!"cenc".equals(encryptionAlgo)) goto _L11; else goto _L12
_L12:
        bytebuffer1.put(cipher.doFinal(abyte0));
          goto _L11
_L2:
        return (Sample)parent.get(i);
_L8:
        i++;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    Cipher getCipher(SecretKey secretkey, byte abyte0[])
    {
        byte abyte1[];
        abyte1 = new byte[16];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        if (!"cenc".equals(encryptionAlgo))
        {
            break MISSING_BLOCK_LABEL_48;
        }
        abyte0 = Cipher.getInstance("AES/CTR/NoPadding");
        abyte0.init(2, secretkey, new IvParameterSpec(abyte1));
        return abyte0;
        if (!"cbc1".equals(encryptionAlgo))
        {
            break MISSING_BLOCK_LABEL_92;
        }
        abyte0 = Cipher.getInstance("AES/CBC/NoPadding");
        abyte0.init(2, secretkey, new IvParameterSpec(abyte1));
        return abyte0;
        try
        {
            throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
        }
        // Misplaced declaration of an exception variable
        catch (SecretKey secretkey)
        {
            throw new RuntimeException(secretkey);
        }
        // Misplaced declaration of an exception variable
        catch (SecretKey secretkey)
        {
            throw new RuntimeException(secretkey);
        }
        // Misplaced declaration of an exception variable
        catch (SecretKey secretkey)
        {
            throw new RuntimeException(secretkey);
        }
        // Misplaced declaration of an exception variable
        catch (SecretKey secretkey)
        {
            throw new RuntimeException(secretkey);
        }
    }

    public int size()
    {
        return parent.size();
    }
}
