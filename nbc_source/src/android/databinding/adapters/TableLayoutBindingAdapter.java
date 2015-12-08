// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import java.util.regex.Pattern;

public class TableLayoutBindingAdapter
{

    private static final int MAX_COLUMNS = 20;
    private static Pattern sColumnPattern = Pattern.compile("\\s*,\\s*");

    public TableLayoutBindingAdapter()
    {
    }

    private static SparseBooleanArray parseColumns(CharSequence charsequence)
    {
        SparseBooleanArray sparsebooleanarray = new SparseBooleanArray();
        if (charsequence != null) goto _L2; else goto _L1
_L1:
        return sparsebooleanarray;
_L2:
        int i;
        int j;
        charsequence = sColumnPattern.split(charsequence);
        j = charsequence.length;
        i = 0;
_L4:
        String s;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = charsequence[i];
        int k = Integer.parseInt(s);
        if (k >= 0)
        {
            try
            {
                sparsebooleanarray.put(k, true);
            }
            catch (NumberFormatException numberformatexception) { }
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static void setCollapseColumns(TableLayout tablelayout, CharSequence charsequence)
    {
        charsequence = parseColumns(charsequence);
        for (int i = 0; i < 20; i++)
        {
            boolean flag = charsequence.get(i, false);
            if (flag != tablelayout.isColumnCollapsed(i))
            {
                tablelayout.setColumnCollapsed(i, flag);
            }
        }

    }

    public static void setShrinkColumns(TableLayout tablelayout, CharSequence charsequence)
    {
        if (charsequence != null && charsequence.length() > 0 && charsequence.charAt(0) == '*')
        {
            tablelayout.setShrinkAllColumns(true);
        } else
        {
            tablelayout.setShrinkAllColumns(false);
            charsequence = parseColumns(charsequence);
            int j = charsequence.size();
            int i = 0;
            while (i < j) 
            {
                int k = charsequence.keyAt(i);
                boolean flag = charsequence.valueAt(i);
                if (flag)
                {
                    tablelayout.setColumnShrinkable(k, flag);
                }
                i++;
            }
        }
    }

    public static void setStretchColumns(TableLayout tablelayout, CharSequence charsequence)
    {
        if (charsequence != null && charsequence.length() > 0 && charsequence.charAt(0) == '*')
        {
            tablelayout.setStretchAllColumns(true);
        } else
        {
            tablelayout.setStretchAllColumns(false);
            charsequence = parseColumns(charsequence);
            int j = charsequence.size();
            int i = 0;
            while (i < j) 
            {
                int k = charsequence.keyAt(i);
                boolean flag = charsequence.valueAt(i);
                if (flag)
                {
                    tablelayout.setColumnStretchable(k, flag);
                }
                i++;
            }
        }
    }

}
