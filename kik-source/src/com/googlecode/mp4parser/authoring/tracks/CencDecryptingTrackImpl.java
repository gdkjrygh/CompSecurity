// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.cenc.CencDecryptingSampleList;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.util.Path;
import com.googlecode.mp4parser.util.RangeStartMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            CencEncryptedTrack

public class CencDecryptingTrackImpl extends AbstractTrack
{

    RangeStartMap indexToKey;
    Track original;
    CencDecryptingSampleList samples;

    public CencDecryptingTrackImpl(CencEncryptedTrack cencencryptedtrack, Map map)
    {
        ArrayList arraylist;
        int j;
        int k;
        super((new StringBuilder("dec(")).append(cencencryptedtrack.getName()).append(")").toString());
        indexToKey = new RangeStartMap();
        original = cencencryptedtrack;
        SchemeTypeBox schemetypebox = (SchemeTypeBox)Path.getPath(cencencryptedtrack.getSampleDescriptionBox(), "enc./sinf/schm");
        if (!"cenc".equals(schemetypebox.getSchemeType()) && !"cbc1".equals(schemetypebox.getSchemeType()))
        {
            throw new RuntimeException("You can only use the CencDecryptingTrackImpl with CENC (cenc or cbc1) encrypted tracks");
        }
        arraylist = new ArrayList();
        Iterator iterator = cencencryptedtrack.getSampleGroups().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                j = 0;
                k = -1;
                break MISSING_BLOCK_LABEL_138;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getKey() instanceof CencSampleEncryptionInformationGroupEntry)
            {
                arraylist.add((CencSampleEncryptionInformationGroupEntry)entry.getKey());
            } else
            {
                getSampleGroups().put((GroupEntry)entry.getKey(), (long[])entry.getValue());
            }
        } while (true);
_L2:
        int i;
        int l;
        if (j >= cencencryptedtrack.getSamples().size())
        {
            samples = new CencDecryptingSampleList(indexToKey, cencencryptedtrack.getSamples(), cencencryptedtrack.getSampleEncryptionEntries(), schemetypebox.getSchemeType());
            return;
        }
        l = 0;
        i = 0;
_L3:
label0:
        {
            if (l < arraylist.size())
            {
                break label0;
            }
            l = k;
            if (k != i)
            {
                GroupEntry groupentry;
                if (i == 0)
                {
                    indexToKey.put(Integer.valueOf(j), (SecretKey)map.get(cencencryptedtrack.getDefaultKeyId()));
                } else
                if (((CencSampleEncryptionInformationGroupEntry)arraylist.get(i - 1)).isEncrypted())
                {
                    SecretKey secretkey = (SecretKey)map.get(((CencSampleEncryptionInformationGroupEntry)arraylist.get(i - 1)).getKid());
                    if (secretkey == null)
                    {
                        throw new RuntimeException((new StringBuilder("Key ")).append(((CencSampleEncryptionInformationGroupEntry)arraylist.get(i - 1)).getKid()).append(" was not supplied for decryption").toString());
                    }
                    indexToKey.put(Integer.valueOf(j), secretkey);
                } else
                {
                    indexToKey.put(Integer.valueOf(j), null);
                }
                l = i;
            }
            j++;
            k = l;
        }
        if (true) goto _L2; else goto _L1
_L1:
        groupentry = (GroupEntry)arraylist.get(l);
        if (Arrays.binarySearch((long[])cencencryptedtrack.getSampleGroups().get(groupentry), j) >= 0)
        {
            i = l + 1;
        }
        l++;
          goto _L3
    }

    public CencDecryptingTrackImpl(CencEncryptedTrack cencencryptedtrack, SecretKey secretkey)
    {
        this(cencencryptedtrack, Collections.singletonMap(cencencryptedtrack.getDefaultKeyId(), secretkey));
    }

    public void close()
    {
        original.close();
    }

    public String getHandler()
    {
        return original.getHandler();
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        Object obj1 = (OriginalFormatBox)Path.getPath(original.getSampleDescriptionBox(), "enc./sinf/frma");
        Object obj = new ByteArrayOutputStream();
        Iterator iterator;
        try
        {
            original.getSampleDescriptionBox().getBox(Channels.newChannel(((java.io.OutputStream) (obj))));
            obj = (SampleDescriptionBox)(new IsoFile(new MemoryDataSourceImpl(((ByteArrayOutputStream) (obj)).toByteArray()))).getBoxes().get(0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("Dumping stsd to memory failed");
        }
        if (((SampleDescriptionBox) (obj)).getSampleEntry() instanceof AudioSampleEntry)
        {
            ((AudioSampleEntry)((SampleDescriptionBox) (obj)).getSampleEntry()).setType(((OriginalFormatBox) (obj1)).getDataFormat());
        } else
        if (((SampleDescriptionBox) (obj)).getSampleEntry() instanceof VisualSampleEntry)
        {
            ((VisualSampleEntry)((SampleDescriptionBox) (obj)).getSampleEntry()).setType(((OriginalFormatBox) (obj1)).getDataFormat());
        } else
        {
            throw new RuntimeException((new StringBuilder("I don't know ")).append(((SampleDescriptionBox) (obj)).getSampleEntry().getType()).toString());
        }
        obj1 = new LinkedList();
        iterator = ((SampleDescriptionBox) (obj)).getSampleEntry().getBoxes().iterator();
        do
        {
            Box box;
            do
            {
                if (!iterator.hasNext())
                {
                    ((SampleDescriptionBox) (obj)).getSampleEntry().setBoxes(((List) (obj1)));
                    return ((SampleDescriptionBox) (obj));
                }
                box = (Box)iterator.next();
            } while (box.getType().equals("sinf"));
            ((List) (obj1)).add(box);
        } while (true);
    }

    public long[] getSampleDurations()
    {
        return original.getSampleDurations();
    }

    public List getSamples()
    {
        return samples;
    }

    public long[] getSyncSamples()
    {
        return original.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData()
    {
        return original.getTrackMetaData();
    }
}
