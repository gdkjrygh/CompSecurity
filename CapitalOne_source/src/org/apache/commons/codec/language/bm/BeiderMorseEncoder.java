// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            PhoneticEngine, NameType, RuleType

public class BeiderMorseEncoder
    implements StringEncoder
{

    private PhoneticEngine engine;

    public BeiderMorseEncoder()
    {
        engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof String))
        {
            throw new EncoderException("BeiderMorseEncoder encode parameter is not of type String");
        } else
        {
            return encode((String)obj);
        }
    }

    public String encode(String s)
        throws EncoderException
    {
        if (s == null)
        {
            return null;
        } else
        {
            return engine.encode(s);
        }
    }

    public NameType getNameType()
    {
        return engine.getNameType();
    }

    public RuleType getRuleType()
    {
        return engine.getRuleType();
    }

    public boolean isConcat()
    {
        return engine.isConcat();
    }

    public void setConcat(boolean flag)
    {
        engine = new PhoneticEngine(engine.getNameType(), engine.getRuleType(), flag, engine.getMaxPhonemes());
    }

    public void setMaxPhonemes(int i)
    {
        engine = new PhoneticEngine(engine.getNameType(), engine.getRuleType(), engine.isConcat(), i);
    }

    public void setNameType(NameType nametype)
    {
        engine = new PhoneticEngine(nametype, engine.getRuleType(), engine.isConcat(), engine.getMaxPhonemes());
    }

    public void setRuleType(RuleType ruletype)
    {
        engine = new PhoneticEngine(engine.getNameType(), ruletype, engine.isConcat(), engine.getMaxPhonemes());
    }
}
