// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack;
import com.googlecode.mp4parser.util.Path;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            Mp4TrackImpl

public class CencMp4TrackImplImpl extends Mp4TrackImpl
    implements CencEncryptedTrack
{
    private class FindSaioSaizPair
    {

        static final boolean $assertionsDisabled;
        private Container container;
        private SampleAuxiliaryInformationOffsetsBox saio;
        private SampleAuxiliaryInformationSizesBox saiz;
        final CencMp4TrackImplImpl this$0;

        public SampleAuxiliaryInformationOffsetsBox getSaio()
        {
            return saio;
        }

        public SampleAuxiliaryInformationSizesBox getSaiz()
        {
            return saiz;
        }

        public FindSaioSaizPair invoke()
        {
            List list;
            List list1;
            int i;
            list = container.getBoxes(com/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox);
            list1 = container.getBoxes(com/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox);
            if (!$assertionsDisabled && list.size() != list1.size())
            {
                throw new AssertionError();
            }
            saiz = null;
            saio = null;
            i = 0;
_L6:
            if (i >= list.size())
            {
                return this;
            }
            if (saiz == null && ((SampleAuxiliaryInformationSizesBox)list.get(i)).getAuxInfoType() == null || "cenc".equals(((SampleAuxiliaryInformationSizesBox)list.get(i)).getAuxInfoType()))
            {
                saiz = (SampleAuxiliaryInformationSizesBox)list.get(i);
            } else
            if (saiz != null && saiz.getAuxInfoType() == null && "cenc".equals(((SampleAuxiliaryInformationSizesBox)list.get(i)).getAuxInfoType()))
            {
                saiz = (SampleAuxiliaryInformationSizesBox)list.get(i);
            } else
            {
                throw new RuntimeException("Are there two cenc labeled saiz?");
            }
            if ((saio != null || ((SampleAuxiliaryInformationOffsetsBox)list1.get(i)).getAuxInfoType() != null) && !"cenc".equals(((SampleAuxiliaryInformationOffsetsBox)list1.get(i)).getAuxInfoType())) goto _L2; else goto _L1
_L1:
            saio = (SampleAuxiliaryInformationOffsetsBox)list1.get(i);
_L4:
            i++;
            continue; /* Loop/switch isn't completed */
_L2:
            if (saio == null || saio.getAuxInfoType() != null || !"cenc".equals(((SampleAuxiliaryInformationOffsetsBox)list1.get(i)).getAuxInfoType()))
            {
                break; /* Loop/switch isn't completed */
            }
            saio = (SampleAuxiliaryInformationOffsetsBox)list1.get(i);
            if (true) goto _L4; else goto _L3
_L3:
            throw new RuntimeException("Are there two cenc labeled saio?");
            if (true) goto _L6; else goto _L5
_L5:
        }

        static 
        {
            boolean flag;
            if (!com/googlecode/mp4parser/authoring/CencMp4TrackImplImpl.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }



        public FindSaioSaizPair(Container container1)
        {
            this$0 = CencMp4TrackImplImpl.this;
            super();
            container = container1;
        }
    }


    static final boolean $assertionsDisabled;
    private UUID defaultKeyId;
    private List sampleEncryptionEntries;

    public transient CencMp4TrackImplImpl(String s, TrackBox trackbox, IsoFile aisofile[])
    {
        long l4;
        super(s, trackbox, aisofile);
        s = (SchemeTypeBox)Path.getPath(trackbox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
        if (!$assertionsDisabled && (s == null || !s.getSchemeType().equals("cenc") && !s.getSchemeType().equals("cbc1")))
        {
            throw new AssertionError("Track must be CENC (cenc or cbc1) encrypted");
        }
        sampleEncryptionEntries = new ArrayList();
        l4 = trackbox.getTrackHeaderBox().getTrackId();
        if (trackbox.getParent().getBoxes(com/coremedia/iso/boxes/fragment/MovieExtendsBox).size() <= 0) goto _L2; else goto _L1
_L1:
        Object obj = ((Box)trackbox.getParent()).getParent().getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox).iterator();
_L6:
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        Object obj1;
        aisofile = (MovieFragmentBox)((Iterator) (obj)).next();
        obj1 = aisofile.getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
_L8:
        if (!((Iterator) (obj1)).hasNext()) goto _L6; else goto _L5
_L5:
        Object obj3 = (TrackFragmentBox)((Iterator) (obj1)).next();
        if (((TrackFragmentBox) (obj3)).getTrackFragmentHeaderBox().getTrackId() != l4) goto _L8; else goto _L7
_L7:
        Object obj2;
        Object obj4;
        long al[];
        int i;
        int j;
        long l1;
        obj2 = (TrackEncryptionBox)Path.getPath(trackbox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
        defaultKeyId = ((TrackEncryptionBox) (obj2)).getDefault_KID();
        SampleAuxiliaryInformationOffsetsBox sampleauxiliaryinformationoffsetsbox;
        if (((TrackFragmentBox) (obj3)).getTrackFragmentHeaderBox().hasBaseDataOffset())
        {
            s = ((Box)trackbox.getParent()).getParent();
            l1 = ((TrackFragmentBox) (obj3)).getTrackFragmentHeaderBox().getBaseDataOffset();
        } else
        {
            l1 = 0L;
            s = aisofile;
        }
        obj4 = (new FindSaioSaizPair(((Container) (obj3)))).invoke();
        sampleauxiliaryinformationoffsetsbox = ((FindSaioSaizPair) (obj4)).getSaio();
        obj4 = ((FindSaioSaizPair) (obj4)).getSaiz();
        if (!$assertionsDisabled && sampleauxiliaryinformationoffsetsbox == null)
        {
            throw new AssertionError();
        }
        al = sampleauxiliaryinformationoffsetsbox.getOffsets();
        if (!$assertionsDisabled && al.length != ((TrackFragmentBox) (obj3)).getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox).size())
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && obj4 == null)
        {
            throw new AssertionError();
        }
        obj3 = ((TrackFragmentBox) (obj3)).getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox);
        i = 0;
        j = 0;
_L12:
        if (j >= al.length) goto _L8; else goto _L9
_L9:
        int k;
        int l;
        long l3;
        long l5;
        l = ((TrackRunBox)((List) (obj3)).get(j)).getEntries().size();
        l5 = al[j];
        l3 = 0L;
        k = i;
_L13:
        if (k < i + l) goto _L11; else goto _L10
_L10:
        ByteBuffer bytebuffer;
        bytebuffer = s.getByteBuffer(l5 + l1, l3);
        k = i;
_L14:
        if (k < i + l)
        {
            break MISSING_BLOCK_LABEL_501;
        }
        i += l;
        j++;
          goto _L12
_L11:
        l3 += ((SampleAuxiliaryInformationSizesBox) (obj4)).getSize(k);
        k++;
          goto _L13
        int i1 = ((SampleAuxiliaryInformationSizesBox) (obj4)).getSize(k);
        sampleEncryptionEntries.add(parseCencAuxDataFormat(((TrackEncryptionBox) (obj2)).getDefaultIvSize(), bytebuffer, i1));
        k++;
          goto _L14
_L2:
        obj = (TrackEncryptionBox)Path.getPath(trackbox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
        defaultKeyId = ((TrackEncryptionBox) (obj)).getDefault_KID();
        aisofile = (ChunkOffsetBox)Path.getPath(trackbox, "mdia[0]/minf[0]/stbl[0]/stco[0]");
        s = aisofile;
        if (aisofile == null)
        {
            s = (ChunkOffsetBox)Path.getPath(trackbox, "mdia[0]/minf[0]/stbl[0]/co64[0]");
        }
        s = trackbox.getSampleTableBox().getSampleToChunkBox().blowup(s.getChunkOffsets().length);
        obj1 = (new FindSaioSaizPair((Container)Path.getPath(trackbox, "mdia[0]/minf[0]/stbl[0]"))).invoke();
        aisofile = ((FindSaioSaizPair) (obj1)).saio;
        obj1 = ((FindSaioSaizPair) (obj1)).saiz;
        trackbox = ((MovieBox)trackbox.getParent()).getParent();
        if (aisofile.getOffsets().length != 1)
        {
            break MISSING_BLOCK_LABEL_795;
        }
        l1 = aisofile.getOffsets()[0];
        i = 0;
        if (((SampleAuxiliaryInformationSizesBox) (obj1)).getDefaultSampleInfoSize() <= 0) goto _L16; else goto _L15
_L15:
        k = ((SampleAuxiliaryInformationSizesBox) (obj1)).getSampleCount() * ((SampleAuxiliaryInformationSizesBox) (obj1)).getDefaultSampleInfoSize() + 0;
_L18:
        s = trackbox.getByteBuffer(l1, k);
        i = 0;
        while (i < ((SampleAuxiliaryInformationSizesBox) (obj1)).getSampleCount()) 
        {
            sampleEncryptionEntries.add(parseCencAuxDataFormat(((TrackEncryptionBox) (obj)).getDefaultIvSize(), s, ((SampleAuxiliaryInformationSizesBox) (obj1)).getSize(i)));
            i++;
        }
          goto _L3
_L16:
        j = 0;
_L19:
        k = i;
        if (j >= ((SampleAuxiliaryInformationSizesBox) (obj1)).getSampleCount()) goto _L18; else goto _L17
_L17:
        i += ((SampleAuxiliaryInformationSizesBox) (obj1)).getSampleInfoSizes()[j];
        j++;
          goto _L19
          goto _L18
        if (aisofile.getOffsets().length == s.length)
        {
            i = 0;
            j = 0;
        } else
        {
            throw new RuntimeException("Number of saio offsets must be either 1 or number of chunks");
        }
_L23:
        if (i >= s.length) goto _L3; else goto _L20
_L20:
        l4 = aisofile.getOffsets()[i];
        l1 = 0L;
        if (((SampleAuxiliaryInformationSizesBox) (obj1)).getDefaultSampleInfoSize() <= 0) goto _L22; else goto _L21
_L21:
        l3 = 0L + (long)((SampleAuxiliaryInformationSizesBox) (obj1)).getSampleCount() * s[i];
_L25:
        obj2 = trackbox.getByteBuffer(l4, l3);
        k = 0;
_L27:
        if ((long)k < s[i])
        {
            break MISSING_BLOCK_LABEL_942;
        }
        j = (int)((long)j + s[i]);
        i++;
          goto _L23
_L22:
        k = 0;
_L26:
        l3 = l1;
        if ((long)k >= s[i]) goto _L25; else goto _L24
_L24:
        l1 += ((SampleAuxiliaryInformationSizesBox) (obj1)).getSize(j + k);
        k++;
          goto _L26
          goto _L25
        long l2 = ((SampleAuxiliaryInformationSizesBox) (obj1)).getSize(j + k);
        sampleEncryptionEntries.add(parseCencAuxDataFormat(((TrackEncryptionBox) (obj)).getDefaultIvSize(), ((ByteBuffer) (obj2)), l2));
        k++;
          goto _L27
    }

    private CencSampleAuxiliaryDataFormat parseCencAuxDataFormat(int i, ByteBuffer bytebuffer, long l)
    {
        CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat = new CencSampleAuxiliaryDataFormat();
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        cencsampleauxiliarydataformat.iv = new byte[i];
        bytebuffer.get(cencsampleauxiliarydataformat.iv);
        if (l <= (long)i) goto _L2; else goto _L3
_L3:
        cencsampleauxiliarydataformat.pairs = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair[IsoTypeReader.readUInt16(bytebuffer)];
        i = 0;
_L6:
        if (i < cencsampleauxiliarydataformat.pairs.length) goto _L4; else goto _L2
_L2:
        return cencsampleauxiliarydataformat;
_L4:
        cencsampleauxiliarydataformat.pairs[i] = cencsampleauxiliarydataformat.createPair(IsoTypeReader.readUInt16(bytebuffer), IsoTypeReader.readUInt32(bytebuffer));
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public UUID getDefaultKeyId()
    {
        return defaultKeyId;
    }

    public String getName()
    {
        return (new StringBuilder("enc(")).append(super.getName()).append(")").toString();
    }

    public List getSampleEncryptionEntries()
    {
        return sampleEncryptionEntries;
    }

    public boolean hasSubSampleEncryption()
    {
        return false;
    }

    public String toString()
    {
        return (new StringBuilder("CencMp4TrackImpl{handler='")).append(getHandler()).append('\'').append('}').toString();
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/authoring/CencMp4TrackImplImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
