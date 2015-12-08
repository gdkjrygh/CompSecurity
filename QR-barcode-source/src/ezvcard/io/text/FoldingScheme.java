// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.text;


public class FoldingScheme
{

    public static final FoldingScheme MAC_ADDRESS_BOOK = new FoldingScheme(76, "  ");
    public static final FoldingScheme MIME_DIR = new FoldingScheme(75, " ");
    public static final FoldingScheme MS_OUTLOOK = new FoldingScheme(72, " ");
    private final String indent;
    private final int lineLength;

    public FoldingScheme(int i, String s)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("The line length must be greater than 0.");
        }
        if (s.length() > i)
        {
            throw new IllegalArgumentException("The line length must be greater than the length of the indentation string.");
        } else
        {
            lineLength = i;
            indent = s;
            return;
        }
    }

    public String getIndent()
    {
        return indent;
    }

    public int getLineLength()
    {
        return lineLength;
    }

}
