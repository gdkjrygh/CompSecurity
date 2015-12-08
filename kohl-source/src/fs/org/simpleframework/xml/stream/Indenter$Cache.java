// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Indenter

private class list
{

    private int count;
    private String list[];
    final Indenter this$0;

    private void resize(int i)
    {
        String as[] = new String[i];
        for (i = 0; i < list.length; i++)
        {
            as[i] = list[i];
        }

        list = as;
    }

    public String get(int i)
    {
        if (i < list.length)
        {
            return list[i];
        } else
        {
            return null;
        }
    }

    public void set(int i, String s)
    {
        if (i >= list.length)
        {
            resize(i * 2);
        }
        if (i > count)
        {
            count = i;
        }
        list[i] = s;
    }

    public int size()
    {
        return count;
    }

    public (int i)
    {
        this$0 = Indenter.this;
        super();
        list = new String[i];
    }
}
