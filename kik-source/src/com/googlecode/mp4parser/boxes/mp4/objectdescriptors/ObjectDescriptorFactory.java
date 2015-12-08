// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            DecoderSpecificInfo, SLConfigDescriptor, BaseDescriptor, ExtensionDescriptor, 
//            ObjectDescriptorBase, ProfileLevelIndicationDescriptor, AudioSpecificConfig, ExtensionProfileLevelDescriptor, 
//            ESDescriptor, DecoderConfigDescriptor, Descriptor, UnknownDescriptor

public class ObjectDescriptorFactory
{

    protected static Map descriptorRegistry;
    protected static Logger log;

    public ObjectDescriptorFactory()
    {
    }

    public static BaseDescriptor createFrom(int i, ByteBuffer bytebuffer)
    {
        Object obj1;
        int j;
        j = IsoTypeReader.readUInt8(bytebuffer);
        obj1 = (Map)descriptorRegistry.get(Integer.valueOf(i));
        Map map = ((Map) (obj1));
        if (obj1 == null)
        {
            map = (Map)descriptorRegistry.get(Integer.valueOf(-1));
        }
        obj1 = (Class)map.get(Integer.valueOf(j));
        if (obj1 != null && !((Class) (obj1)).isInterface() && !Modifier.isAbstract(((Class) (obj1)).getModifiers())) goto _L2; else goto _L1
_L1:
        Object obj;
        log.warning((new StringBuilder("No ObjectDescriptor found for objectTypeIndication ")).append(Integer.toHexString(i)).append(" and tag ").append(Integer.toHexString(j)).append(" found: ").append(obj1).toString());
        obj = new UnknownDescriptor();
_L4:
        ((BaseDescriptor) (obj)).parse(j, bytebuffer);
        return ((BaseDescriptor) (obj));
_L2:
        try
        {
            obj = (BaseDescriptor)((Class) (obj1)).newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            log.log(Level.SEVERE, (new StringBuilder("Couldn't instantiate BaseDescriptor class ")).append(obj1).append(" for objectTypeIndication ").append(i).append(" and tag ").append(j).toString(), bytebuffer);
            throw new RuntimeException(bytebuffer);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        Iterator iterator;
        log = Logger.getLogger(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/ObjectDescriptorFactory.getName());
        descriptorRegistry = new HashMap();
        HashSet hashset = new HashSet();
        hashset.add(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderSpecificInfo);
        hashset.add(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor);
        hashset.add(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor);
        hashset.add(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/ExtensionDescriptor);
        hashset.add(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/ObjectDescriptorBase);
        hashset.add(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/ProfileLevelIndicationDescriptor);
        hashset.add(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig);
        hashset.add(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/ExtensionProfileLevelDescriptor);
        hashset.add(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor);
        hashset.add(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor);
        iterator = hashset.iterator();
_L2:
        if (!iterator.hasNext())
        {
            return;
        }
        Class class1 = (Class)iterator.next();
        Object obj = (Descriptor)class1.getAnnotation(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/Descriptor);
        int ai[] = ((Descriptor) (obj)).tags();
        int j = ((Descriptor) (obj)).objectTypeIndication();
        Map map = (Map)descriptorRegistry.get(Integer.valueOf(j));
        obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        int k = ai.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    break label0;
                }
                descriptorRegistry.put(Integer.valueOf(j), obj);
            }
            if (true)
            {
                continue;
            }
            ((Map) (obj)).put(Integer.valueOf(ai[i]), class1);
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
