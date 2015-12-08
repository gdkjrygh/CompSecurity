// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import ezvcard.VCardVersion;
import ezvcard.util.CaseClasses;
import java.lang.reflect.Constructor;

// Referenced classes of package ezvcard.parameter:
//            VCardParameter

public class VCardParameterCaseClasses extends CaseClasses
{

    public VCardParameterCaseClasses(Class class1)
    {
        super(class1);
    }

    protected VCardParameter create(String s)
    {
        Object obj;
        try
        {
            obj = clazz.getDeclaredConstructor(new Class[] {
                java/lang/String
            });
            ((Constructor) (obj)).setAccessible(true);
            obj = (VCardParameter)((Constructor) (obj)).newInstance(new Object[] {
                s
            });
        }
        catch (Exception exception)
        {
            try
            {
                Constructor constructor = clazz.getDeclaredConstructor(new Class[] {
                    java/lang/String, [Lezvcard/VCardVersion;
                });
                constructor.setAccessible(true);
                s = (VCardParameter)constructor.newInstance(new Object[] {
                    s, new VCardVersion[0]
                });
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
            return s;
        }
        return ((VCardParameter) (obj));
    }

    protected volatile Object create(Object obj)
    {
        return create((String)obj);
    }

    protected boolean matches(VCardParameter vcardparameter, String s)
    {
        return vcardparameter.getValue().equalsIgnoreCase(s);
    }

    protected volatile boolean matches(Object obj, Object obj1)
    {
        return matches((VCardParameter)obj, (String)obj1);
    }
}
