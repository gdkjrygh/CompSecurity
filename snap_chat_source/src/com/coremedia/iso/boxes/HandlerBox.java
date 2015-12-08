// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cA;
import cu;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HandlerBox extends ft
{

    public static final String TYPE = "hdlr";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    public static final Map readableTypes;
    private long a;
    private long b;
    private long c;
    private String handlerType;
    private String name;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm;

    public HandlerBox()
    {
        super("hdlr");
        name = null;
        zeroTerm = true;
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("HandlerBox.java", com/coremedia/iso/boxes/HandlerBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "", "void"), 87);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", "void"), 91);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 95);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 99);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        shouldBeZeroButAppleWritesHereSomeValue = cv.a(bytebuffer);
        handlerType = cv.k(bytebuffer);
        a = cv.a(bytebuffer);
        b = cv.a(bytebuffer);
        c = cv.a(bytebuffer);
        if (bytebuffer.remaining() > 0)
        {
            name = cv.a(bytebuffer, bytebuffer.remaining());
            if (name.endsWith("\0"))
            {
                name = name.substring(0, name.length() - 1);
                zeroTerm = true;
                return;
            } else
            {
                zeroTerm = false;
                return;
            }
        } else
        {
            zeroTerm = false;
            return;
        }
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, shouldBeZeroButAppleWritesHereSomeValue);
        bytebuffer.put(cu.a(handlerType));
        cx.b(bytebuffer, a);
        cx.b(bytebuffer, b);
        cx.b(bytebuffer, c);
        if (name != null)
        {
            bytebuffer.put(cA.a(name));
        }
        if (zeroTerm)
        {
            bytebuffer.put((byte)0);
        }
    }

    protected long getContentSize()
    {
        if (zeroTerm)
        {
            return (long)(cA.b(name) + 25);
        } else
        {
            return (long)(cA.b(name) + 24);
        }
    }

    public String getHandlerType()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return handlerType;
    }

    public String getHumanReadableTrackType()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        if (readableTypes.get(handlerType) != null)
        {
            return (String)readableTypes.get(handlerType);
        } else
        {
            return "Unknown Handler Type";
        }
    }

    public String getName()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        return name;
    }

    public void setHandlerType(String s)
    {
        akp akp = akN.a(ajc$tjp_2, this, s);
        fx.a();
        fx.a(akp);
        handlerType = s;
    }

    public void setName(String s)
    {
        akp akp = akN.a(ajc$tjp_1, this, s);
        fx.a();
        fx.a(akp);
        name = s;
    }

    public String toString()
    {
        akp akp = akN.a(ajc$tjp_5, this);
        fx.a();
        fx.a(akp);
        return (new StringBuilder("HandlerBox[handlerType=")).append(getHandlerType()).append(";name=").append(getName()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
        HashMap hashmap = new HashMap();
        hashmap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("mdir", "Apple Meta Data iTunes Reader");
        hashmap.put("mp7b", "MPEG-7 binary XML");
        hashmap.put("mp7t", "MPEG-7 XML");
        hashmap.put("vide", "Video Track");
        hashmap.put("soun", "Sound Track");
        hashmap.put("hint", "Hint Track");
        hashmap.put("appl", "Apple specific");
        hashmap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        readableTypes = Collections.unmodifiableMap(hashmap);
    }
}
