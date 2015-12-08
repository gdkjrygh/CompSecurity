// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentActionRef, AppContentAnnotationRef, AppContentConditionRef, AppContentTupleRef, 
//            AppContentTuple

public final class AppContentUtils
{
    private static interface AppContentRunner
    {

        public abstract void append(ArrayList arraylist, int i);
    }


    private static void convertSubDataHolderIds(DataHolder dataholder, int i, String s, String s1, int j, AppContentRunner appcontentrunner, ArrayList arraylist)
    {
        DataHolder dataholder1 = (DataHolder)arraylist.get(i);
        dataholder = dataholder.getString(s, j, dataholder.getWindowIndex(j));
        if (!TextUtils.isEmpty(dataholder))
        {
            j = dataholder1.mRowCount;
            dataholder = dataholder.split(",");
            for (i = 0; i < j; i++)
            {
                s = dataholder1.getString(s1, i, dataholder1.getWindowIndex(i));
                if (!TextUtils.isEmpty(s) && ArrayUtils.contains(dataholder, s))
                {
                    appcontentrunner.append(arraylist, i);
                }
            }

        }
    }

    public static ArrayList getActions(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        ArrayList arraylist1 = new ArrayList();
        convertSubDataHolderIds(dataholder, 1, s, "action_id", i, new AppContentRunner(arraylist1) {

            final ArrayList val$children;

            public final void append(ArrayList arraylist2, int j)
            {
                children.add(new AppContentActionRef(arraylist2, j));
            }

            
            {
                children = arraylist;
                super();
            }
        }, arraylist);
        return arraylist1;
    }

    public static ArrayList getAnnotations(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        ArrayList arraylist1 = new ArrayList();
        convertSubDataHolderIds(dataholder, 2, s, "annotation_id", i, new AppContentRunner(arraylist1) {

            final ArrayList val$children;

            public final void append(ArrayList arraylist2, int j)
            {
                children.add(new AppContentAnnotationRef(arraylist2, j));
            }

            
            {
                children = arraylist;
                super();
            }
        }, arraylist);
        return arraylist1;
    }

    public static ArrayList getConditions(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        ArrayList arraylist1 = new ArrayList();
        convertSubDataHolderIds(dataholder, 4, s, "condition_id", i, new AppContentRunner(arraylist1) {

            final ArrayList val$children;

            public final void append(ArrayList arraylist2, int j)
            {
                children.add(new AppContentConditionRef(arraylist2, j));
            }

            
            {
                children = arraylist;
                super();
            }
        }, arraylist);
        return arraylist1;
    }

    public static Bundle getDataTuples(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        Bundle bundle = new Bundle();
        convertSubDataHolderIds(dataholder, 3, s, "tuple_id", i, new AppContentRunner((DataHolder)arraylist.get(3), bundle) {

            final Bundle val$bundle;
            final DataHolder val$childHolder;

            public final void append(ArrayList arraylist1, int j)
            {
                arraylist1 = new AppContentTupleRef(childHolder, j);
                bundle.putString(arraylist1.getName(), arraylist1.getValue());
            }

            
            {
                childHolder = dataholder;
                bundle = bundle1;
                super();
            }
        }, arraylist);
        return bundle;
    }
}
