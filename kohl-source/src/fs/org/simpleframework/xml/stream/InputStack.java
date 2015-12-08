// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Stack, InputNode

class InputStack extends Stack
{

    public InputStack()
    {
        super(6);
    }

    public boolean isRelevant(InputNode inputnode)
    {
        return contains(inputnode) || isEmpty();
    }
}
