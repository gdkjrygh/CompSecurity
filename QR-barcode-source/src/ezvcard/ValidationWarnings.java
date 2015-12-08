// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.property.VCardProperty;
import ezvcard.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ezvcard:
//            VCardVersion

public class ValidationWarnings
    implements Iterable
{
    public static class WarningsGroup
    {

        private final List messages;
        private final VCardProperty property;

        public List getMessages()
        {
            return messages;
        }

        public VCardProperty getProperty()
        {
            return property;
        }

        public String toString()
        {
            String s;
            if (property == null)
            {
                s = "";
            } else
            {
                s = (new StringBuilder()).append("[").append(property.getClass().getSimpleName()).append("]: ").toString();
            }
            return StringUtils.join(messages, StringUtils.NEWLINE, s. new ezvcard.util.StringUtils.JoinCallback() {

                final WarningsGroup this$0;
                final String val$prefix;

                public volatile void handle(StringBuilder stringbuilder, Object obj)
                {
                    handle(stringbuilder, (String)obj);
                }

                public void handle(StringBuilder stringbuilder, String s)
                {
                    stringbuilder.append(prefix).append(s);
                }

            
            {
                this$0 = final_warningsgroup;
                prefix = String.this;
                super();
            }
            });
        }

        public WarningsGroup(VCardProperty vcardproperty, List list)
        {
            property = vcardproperty;
            messages = list;
        }
    }


    private final VCardVersion version;
    private final List warnings;

    public ValidationWarnings(List list, VCardVersion vcardversion)
    {
        warnings = list;
        version = vcardversion;
    }

    public List getByProperty(Class class1)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator1 = warnings.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            WarningsGroup warningsgroup = (WarningsGroup)iterator1.next();
            VCardProperty vcardproperty = warningsgroup.getProperty();
            if (vcardproperty == null)
            {
                if (class1 == null)
                {
                    arraylist.add(warningsgroup);
                }
            } else
            if (class1 == vcardproperty.getClass())
            {
                arraylist.add(warningsgroup);
            }
        } while (true);
        return arraylist;
    }

    public VCardVersion getVersion()
    {
        return version;
    }

    public List getWarnings()
    {
        return warnings;
    }

    public boolean isEmpty()
    {
        return warnings.isEmpty();
    }

    public Iterator iterator()
    {
        return warnings.iterator();
    }

    public String toString()
    {
        return StringUtils.join(warnings, StringUtils.NEWLINE);
    }
}
