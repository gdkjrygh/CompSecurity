// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.ProtectionSchemeInformationBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SchemeInformationBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.crypto.SecretKey;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            CencEncryptedTrack

public class CencEncryptingTrackImpl
    implements CencEncryptedTrack
{

    List cencSampleAuxiliaryData;
    UUID defaultKeyId;
    boolean dummyIvs;
    private final String encryptionAlgo;
    RangeStartMap indexToKey;
    Map keys;
    Map sampleGroups;
    List samples;
    Track source;
    SampleDescriptionBox stsd;
    boolean subSampleEncryption;

    public CencEncryptingTrackImpl(Track track, UUID uuid, Map map, Map map1, String s, boolean flag)
    {
        keys = new HashMap();
        dummyIvs = false;
        subSampleEncryption = false;
        stsd = null;
        source = track;
        keys = map;
        defaultKeyId = uuid;
        dummyIvs = flag;
        encryptionAlgo = s;
        sampleGroups = new HashMap();
        s = track.getSampleGroups().entrySet().iterator();
_L11:
        if (s.hasNext()) goto _L2; else goto _L1
_L1:
        if (map1 == null) goto _L4; else goto _L3
_L3:
        s = map1.entrySet().iterator();
_L12:
        if (s.hasNext()) goto _L5; else goto _L4
_L4:
        Object obj;
        ArrayList arraylist;
        int j;
        int i1;
        sampleGroups = new _cls1(sampleGroups);
        samples = track.getSamples();
        cencSampleAuxiliaryData = new ArrayList();
        obj = new BigInteger("1");
        s = new byte[8];
        if (!flag)
        {
            (new SecureRandom()).nextBytes(s);
        }
        s = new BigInteger(1, s);
        arraylist = new ArrayList();
        if (map1 != null)
        {
            arraylist.addAll(map1.keySet());
        }
        indexToKey = new RangeStartMap();
        i1 = -1;
        j = 0;
_L13:
        if (j < track.getSamples().size()) goto _L7; else goto _L6
_L6:
        track = track.getSampleDescriptionBox().getSampleEntry().getBoxes().iterator();
        uuid = null;
_L15:
        if (track.hasNext()) goto _L9; else goto _L8
_L8:
        int i;
        track = s;
        i = 0;
_L20:
        int l1;
        if (i >= samples.size())
        {
            System.err.println("");
            return;
        }
        map1 = (Sample)samples.get(i);
        map = new CencSampleAuxiliaryDataFormat();
        cencSampleAuxiliaryData.add(map);
          goto _L10
_L2:
        obj = (java.util.Map.Entry)s.next();
        if (!(((java.util.Map.Entry) (obj)).getKey() instanceof CencSampleEncryptionInformationGroupEntry))
        {
            sampleGroups.put((GroupEntry)((java.util.Map.Entry) (obj)).getKey(), (long[])((java.util.Map.Entry) (obj)).getValue());
        }
          goto _L11
_L5:
        obj = (java.util.Map.Entry)s.next();
        sampleGroups.put((GroupEntry)((java.util.Map.Entry) (obj)).getKey(), (long[])((java.util.Map.Entry) (obj)).getValue());
          goto _L12
_L7:
        i = 0;
        l1 = 0;
_L14:
label0:
        {
            if (l1 < arraylist.size())
            {
                break label0;
            }
            l1 = i1;
            if (i1 != i)
            {
                if (i == 0)
                {
                    indexToKey.put(Integer.valueOf(j), (SecretKey)map.get(uuid));
                } else
                if (((CencSampleEncryptionInformationGroupEntry)arraylist.get(i - 1)).getKid() != null)
                {
                    map1 = (SecretKey)map.get(((CencSampleEncryptionInformationGroupEntry)arraylist.get(i - 1)).getKid());
                    if (map1 == null)
                    {
                        throw new RuntimeException((new StringBuilder("Key ")).append(((CencSampleEncryptionInformationGroupEntry)arraylist.get(i - 1)).getKid()).append(" was not supplied for decryption").toString());
                    }
                    indexToKey.put(Integer.valueOf(j), map1);
                } else
                {
                    indexToKey.put(Integer.valueOf(j), null);
                }
                l1 = i;
            }
            j++;
            i1 = l1;
        }
          goto _L13
        map1 = (GroupEntry)arraylist.get(l1);
        if (Arrays.binarySearch((long[])getSampleGroups().get(map1), j) >= 0)
        {
            i = l1 + 1;
        }
        l1++;
          goto _L14
_L9:
        map = (Box)track.next();
        if (map instanceof AvcConfigurationBox)
        {
            uuid = (AvcConfigurationBox)map;
            subSampleEncryption = true;
        }
          goto _L15
_L10:
        if (indexToKey.get(Integer.valueOf(i)) == null) goto _L17; else goto _L16
_L16:
        int i2;
        s = track.toByteArray();
        byte abyte0[] = new byte[8];
        int k;
        int j1;
        if (s.length - 8 > 0)
        {
            k = s.length - 8;
        } else
        {
            k = 0;
        }
        if (8 - s.length < 0)
        {
            j1 = 0;
        } else
        {
            j1 = 8 - s.length;
        }
        if (s.length > 8)
        {
            i2 = 8;
        } else
        {
            i2 = s.length;
        }
        System.arraycopy(s, k, abyte0, j1, i2);
        map.iv = abyte0;
        map1 = (ByteBuffer)map1.asByteBuffer().rewind();
        if (uuid == null) goto _L19; else goto _L18
_L18:
        i2 = uuid.getLengthSizeMinusOne() + 1;
        s = new ArrayList(5);
_L21:
        if (map1.remaining() > 0)
        {
            break MISSING_BLOCK_LABEL_952;
        }
        map.pairs = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair[])s.toArray(new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair[s.size()]);
_L19:
        track = track.add(((BigInteger) (obj)));
_L17:
        i++;
          goto _L20
        int j2 = CastUtils.l2i(IsoTypeReaderVariable.read(map1, i2));
        int k1 = j2 + i2;
        int l;
        if (k1 >= 112)
        {
            l = k1 % 16 + 96;
        } else
        {
            l = k1;
        }
        s.add(map.createPair(l, k1 - l));
        map1.position(map1.position() + j2);
          goto _L21
    }

    public CencEncryptingTrackImpl(Track track, UUID uuid, SecretKey secretkey, boolean flag)
    {
        this(track, uuid, Collections.singletonMap(uuid, secretkey), null, "cenc", flag);
    }

    public void close()
    {
        source.close();
    }

    public List getCompositionTimeEntries()
    {
        return source.getCompositionTimeEntries();
    }

    public UUID getDefaultKeyId()
    {
        return defaultKeyId;
    }

    public long getDuration()
    {
        return source.getDuration();
    }

    public List getEdits()
    {
        return source.getEdits();
    }

    public String getHandler()
    {
        return source.getHandler();
    }

    public String getName()
    {
        return (new StringBuilder("enc(")).append(source.getName()).append(")").toString();
    }

    public List getSampleDependencies()
    {
        return source.getSampleDependencies();
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        this;
        JVM INSTR monitorenter ;
        if (stsd != null) goto _L2; else goto _L1
_L1:
        Object obj = new ByteArrayOutputStream();
        source.getSampleDescriptionBox().getBox(Channels.newChannel(((java.io.OutputStream) (obj))));
        stsd = (SampleDescriptionBox)(new IsoFile(new MemoryDataSourceImpl(((ByteArrayOutputStream) (obj)).toByteArray()))).getBoxes().get(0);
        obj = new OriginalFormatBox();
        ((OriginalFormatBox) (obj)).setDataFormat(stsd.getSampleEntry().getType());
        if (!(stsd.getSampleEntry() instanceof AudioSampleEntry)) goto _L4; else goto _L3
_L3:
        ((AudioSampleEntry)stsd.getSampleEntry()).setType("enca");
_L5:
        ProtectionSchemeInformationBox protectionschemeinformationbox;
        SchemeInformationBox schemeinformationbox;
        TrackEncryptionBox trackencryptionbox;
        protectionschemeinformationbox = new ProtectionSchemeInformationBox();
        protectionschemeinformationbox.addBox(((Box) (obj)));
        obj = new SchemeTypeBox();
        ((SchemeTypeBox) (obj)).setSchemeType(encryptionAlgo);
        ((SchemeTypeBox) (obj)).setSchemeVersion(0x10000);
        protectionschemeinformationbox.addBox(((Box) (obj)));
        schemeinformationbox = new SchemeInformationBox();
        trackencryptionbox = new TrackEncryptionBox();
        int i;
        if (defaultKeyId == null)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        trackencryptionbox.setDefaultIvSize(i);
        if (defaultKeyId == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        trackencryptionbox.setDefaultAlgorithmId(i);
        if (defaultKeyId != null)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        obj = new UUID(0L, 0L);
_L6:
        trackencryptionbox.setDefault_KID(((UUID) (obj)));
        schemeinformationbox.addBox(trackencryptionbox);
        protectionschemeinformationbox.addBox(schemeinformationbox);
        stsd.getSampleEntry().addBox(protectionschemeinformationbox);
_L2:
        obj = stsd;
        this;
        JVM INSTR monitorexit ;
        return ((SampleDescriptionBox) (obj));
        obj;
        throw new RuntimeException("Dumping stsd to memory failed");
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
label0:
        {
            if (!(stsd.getSampleEntry() instanceof VisualSampleEntry))
            {
                break label0;
            }
            ((VisualSampleEntry)stsd.getSampleEntry()).setType("encv");
        }
          goto _L5
        throw new RuntimeException((new StringBuilder("I don't know how to cenc ")).append(stsd.getSampleEntry().getType()).toString());
        obj = defaultKeyId;
          goto _L6
    }

    public long[] getSampleDurations()
    {
        return source.getSampleDurations();
    }

    public List getSampleEncryptionEntries()
    {
        return cencSampleAuxiliaryData;
    }

    public Map getSampleGroups()
    {
        return sampleGroups;
    }

    public List getSamples()
    {
        return new CencEncryptingSampleList(indexToKey, source.getSamples(), cencSampleAuxiliaryData, encryptionAlgo);
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return source.getSubsampleInformationBox();
    }

    public long[] getSyncSamples()
    {
        return source.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData()
    {
        return source.getTrackMetaData();
    }

    public boolean hasSubSampleEncryption()
    {
        return subSampleEncryption;
    }

    private class _cls1 extends HashMap
    {

        final CencEncryptingTrackImpl this$0;

        public volatile Object put(Object obj, Object obj1)
        {
            return put((GroupEntry)obj, (long[])obj1);
        }

        public long[] put(GroupEntry groupentry, long al[])
        {
            if (groupentry instanceof CencSampleEncryptionInformationGroupEntry)
            {
                throw new RuntimeException("Please supply CencSampleEncryptionInformationGroupEntries in the constructor");
            } else
            {
                return (long[])super.put(groupentry, al);
            }
        }

        _cls1(Map map)
        {
            this$0 = CencEncryptingTrackImpl.this;
            super(map);
        }
    }

}
