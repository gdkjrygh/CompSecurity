// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            ViewDataBinding

protected static class layoutIds
{

    public final int indexes[][];
    public final int layoutIds[][];
    public final String layouts[][];

    public void setIncludes(int i, String as[], int ai[], int ai1[])
    {
        layouts[i] = as;
        indexes[i] = ai;
        layoutIds[i] = ai1;
    }

    public _cls9(int i)
    {
        layouts = new String[i][];
        indexes = new int[i][];
        layoutIds = new int[i][];
    }
}
