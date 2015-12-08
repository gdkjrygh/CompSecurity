// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.property.VCardProperty;
import ezvcard.util.StringUtils;
import java.util.List;

// Referenced classes of package ezvcard:
//            ValidationWarnings

public static class messages
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
        final String prefix;
        if (property == null)
        {
            prefix = "";
        } else
        {
            prefix = (new StringBuilder()).append("[").append(property.getClass().getSimpleName()).append("]: ").toString();
        }
        return StringUtils.join(messages, StringUtils.NEWLINE, new ezvcard.util.StringUtils.JoinCallback() {

            final ValidationWarnings.WarningsGroup this$0;
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
                this$0 = ValidationWarnings.WarningsGroup.this;
                prefix = s;
                super();
            }
        });
    }

    public _cls1.val.prefix(VCardProperty vcardproperty, List list)
    {
        property = vcardproperty;
        messages = list;
    }
}
