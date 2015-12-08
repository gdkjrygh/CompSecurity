// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.utils;


// Referenced classes of package com.adobe.adobepass.accessenabler.utils:
//            Entities

static class ap extends ap
{

    private static final int LOOKUP_TABLE_SIZE = 256;
    private String lookupTable[];

    private void createLookupTable()
    {
        lookupTable = new String[256];
        for (int i = 0; i < 256; i++)
        {
            lookupTable[i] = super.name(i);
        }

    }

    private String[] lookupTable()
    {
        if (lookupTable == null)
        {
            createLookupTable();
        }
        return lookupTable;
    }

    public String name(int i)
    {
        if (i < 256)
        {
            return lookupTable()[i];
        } else
        {
            return super.name(i);
        }
    }

    ap()
    {
    }
}
