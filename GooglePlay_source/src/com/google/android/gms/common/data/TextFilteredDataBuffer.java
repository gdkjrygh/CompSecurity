// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.common.data:
//            FilteredDataBuffer, TextFilterable, DataBuffer, AbstractDataBuffer

public final class TextFilteredDataBuffer extends FilteredDataBuffer
    implements TextFilterable
{

    public AbstractDataBuffer mAbstractDataBuffer;
    public final String mColumnName;
    public final ArrayList mEntityOffsets = new ArrayList();
    public String mFilterTerm;
    public Locale mLocale;
    public TextFilterable.StringFilter mStringFilter;

    public TextFilteredDataBuffer(AbstractDataBuffer abstractdatabuffer, String s)
    {
        super(abstractdatabuffer);
        mAbstractDataBuffer = abstractdatabuffer;
        mColumnName = s;
    }

    public String cleanString(String s)
    {
        s = s.toLowerCase(mLocale);
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        for (int j = s.length(); i < j; i++)
        {
            if (!Character.isIdentifierIgnorable(s.charAt(i)))
            {
                stringbuilder.append(s.charAt(i));
            }
        }

        return stringbuilder.toString();
    }

    public final int computeRealPosition(int i)
    {
        if (TextUtils.isEmpty(mFilterTerm))
        {
            return i;
        }
        if (i < 0 || i >= mEntityOffsets.size())
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)mEntityOffsets.get(i)).intValue();
        }
    }

    public final int getCount()
    {
        if (TextUtils.isEmpty(mFilterTerm))
        {
            return mDataBuffer.getCount();
        } else
        {
            return mEntityOffsets.size();
        }
    }
}
