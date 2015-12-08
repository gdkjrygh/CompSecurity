// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import ezvcard.util.CaseClasses;
import java.lang.reflect.Constructor;

// Referenced classes of package ezvcard.parameter:
//            MediaTypeParameter

public class MediaTypeCaseClasses extends CaseClasses
{

    public MediaTypeCaseClasses(Class class1)
    {
        super(class1);
    }

    protected MediaTypeParameter create(String as[])
    {
        try
        {
            Constructor constructor = clazz.getDeclaredConstructor(new Class[] {
                java/lang/String, java/lang/String, java/lang/String
            });
            constructor.setAccessible(true);
            as = (MediaTypeParameter)constructor.newInstance(new Object[] {
                as[0], as[1], as[2]
            });
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw new RuntimeException(as);
        }
        return as;
    }

    protected volatile Object create(Object obj)
    {
        return create((String[])obj);
    }

    protected boolean matches(MediaTypeParameter mediatypeparameter, String as[])
    {
        String s = mediatypeparameter.getValue();
        String s1 = mediatypeparameter.getMediaType();
        mediatypeparameter = mediatypeparameter.getExtension();
        for (int i = 0; i < as.length; i++)
        {
            String s2 = as[i];
            if (s2 != null && !s2.equalsIgnoreCase((new String[] {
    s, s1, mediatypeparameter
})[i]))
            {
                return false;
            }
        }

        return true;
    }

    protected volatile boolean matches(Object obj, Object obj1)
    {
        return matches((MediaTypeParameter)obj, (String[])obj1);
    }
}
