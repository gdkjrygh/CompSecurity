// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationContext;
import org.w3c.dom.Document;

// Referenced classes of package com.fasterxml.jackson.databind.ext:
//            DOMDeserializer

public class  extends DOMDeserializer
{

    public volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
    {
        return _deserialize(s, deserializationcontext);
    }

    public Document _deserialize(String s, DeserializationContext deserializationcontext)
    {
        return parse(s);
    }

    public ()
    {
        super(org/w3c/dom/Document);
    }
}
