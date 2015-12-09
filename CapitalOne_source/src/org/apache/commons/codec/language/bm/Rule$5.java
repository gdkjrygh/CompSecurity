// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;


// Referenced classes of package org.apache.commons.codec.language.bm:
//            Rule

static final class val.content
    implements attern
{

    final String val$content;

    public boolean isMatch(CharSequence charsequence)
    {
        return Rule.access$100(charsequence, val$content);
    }

    attern(String s)
    {
        val$content = s;
        super();
    }
}
