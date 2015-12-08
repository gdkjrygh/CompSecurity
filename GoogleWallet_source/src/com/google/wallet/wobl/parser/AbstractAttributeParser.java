// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;

import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.parser.xml.XmlElement;

// Referenced classes of package com.google.wallet.wobl.parser:
//            WoblParser

abstract class AbstractAttributeParser
{

    private final WoblParser woblParser;

    public AbstractAttributeParser(WoblParser woblparser)
    {
        woblParser = woblparser;
    }

    public abstract void applyAttributesToIr(IntermediateRepresentation intermediaterepresentation, XmlElement xmlelement)
        throws WoblMalformedDocException;

    protected WoblParser getWoblParser()
    {
        return woblParser;
    }
}
