// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import java.util.Collection;

// Referenced classes of package ezvcard.parameter:
//            MediaTypeParameter, MediaTypeCaseClasses

public class KeyType extends MediaTypeParameter
{

    public static final KeyType GPG = new KeyType("GPG", "application/gpg", "gpg");
    public static final KeyType PGP = new KeyType("PGP", "application/pgp-keys", "pgp");
    public static final KeyType X509 = new KeyType("X509", "application/x509", null);
    private static final MediaTypeCaseClasses enums = new MediaTypeCaseClasses(ezvcard/parameter/KeyType);

    private KeyType(String s, String s1, String s2)
    {
        super(s, s1, s2);
    }

    public static Collection all()
    {
        return enums.all();
    }

    public static KeyType find(String s, String s1, String s2)
    {
        return (KeyType)enums.find(new String[] {
            s, s1, s2
        });
    }

    public static KeyType get(String s, String s1, String s2)
    {
        return (KeyType)enums.get(new String[] {
            s, s1, s2
        });
    }

}
