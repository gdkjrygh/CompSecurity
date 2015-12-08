// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern.collect;

import java.util.ArrayList;
import java.util.Collections;

public class Lists
{

    public Lists()
    {
    }

    public static ArrayList newArrayList()
    {
        return new ArrayList();
    }

    public static transient ArrayList newArrayList(Object aobj[])
    {
        ArrayList arraylist = new ArrayList((aobj.length * 110) / 100 + 5);
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }
}
