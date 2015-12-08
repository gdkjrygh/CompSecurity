// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.NamespaceContext;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            SMPTETTTrackImpl

private static class <init>
    implements NamespaceContext
{

    public String getNamespaceURI(String s)
    {
        if (s.equals("ttml"))
        {
            return "http://www.w3.org/ns/ttml";
        }
        if (s.equals("smpte"))
        {
            return "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";
        } else
        {
            return null;
        }
    }

    public String getPrefix(String s)
    {
        if (s.equals("http://www.w3.org/ns/ttml"))
        {
            return "ttml";
        }
        if (s.equals("http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt"))
        {
            return "smpte";
        } else
        {
            return null;
        }
    }

    public Iterator getPrefixes(String s)
    {
        return Arrays.asList(new String[] {
            "ttml", "smpte"
        }).iterator();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
