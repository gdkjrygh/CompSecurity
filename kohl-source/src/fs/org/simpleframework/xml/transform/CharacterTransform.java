// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;


// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform, InvalidFormatException

class CharacterTransform
    implements Transform
{

    CharacterTransform()
    {
    }

    public Character read(String s)
        throws Exception
    {
        if (s.length() != 1)
        {
            throw new InvalidFormatException("Cannot convert '%s' to a character", new Object[] {
                s
            });
        } else
        {
            return Character.valueOf(s.charAt(0));
        }
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public String write(Character character)
        throws Exception
    {
        return character.toString();
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((Character)obj);
    }
}
