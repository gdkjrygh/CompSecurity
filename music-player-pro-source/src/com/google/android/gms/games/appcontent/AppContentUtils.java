// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.la;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentActionRef, AppContentAnnotationRef, AppContentConditionRef, AppContentTupleRef, 
//            AppContentTuple

public final class AppContentUtils
{
    private static interface AppContentRunner
    {

        public abstract void b(ArrayList arraylist, int i);
    }


    public AppContentUtils()
    {
    }

    public static ArrayList a(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        ArrayList arraylist1 = new ArrayList();
        a(dataholder, 1, s, "action_id", i, new AppContentRunner(arraylist1) {

            final ArrayList Yb;

            public void b(ArrayList arraylist2, int j)
            {
                Yb.add(new AppContentActionRef(arraylist2, j));
            }

            
            {
                Yb = arraylist;
                super();
            }
        }, arraylist);
        return arraylist1;
    }

    private static void a(DataHolder dataholder, int i, String s, String s1, int j, AppContentRunner appcontentrunner, ArrayList arraylist)
    {
        DataHolder dataholder1 = (DataHolder)arraylist.get(i);
        dataholder = dataholder.c(s, j, dataholder.au(j));
        if (!TextUtils.isEmpty(dataholder))
        {
            j = dataholder1.getCount();
            dataholder = dataholder.split(",");
            for (i = 0; i < j; i++)
            {
                s = dataholder1.c(s1, i, dataholder1.au(i));
                if (!TextUtils.isEmpty(s) && la.b(dataholder, s))
                {
                    appcontentrunner.b(arraylist, i);
                }
            }

        }
    }

    public static ArrayList b(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        ArrayList arraylist1 = new ArrayList();
        a(dataholder, 2, s, "annotation_id", i, new AppContentRunner(arraylist1) {

            final ArrayList Yb;

            public void b(ArrayList arraylist2, int j)
            {
                Yb.add(new AppContentAnnotationRef(arraylist2, j));
            }

            
            {
                Yb = arraylist;
                super();
            }
        }, arraylist);
        return arraylist1;
    }

    public static ArrayList c(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        ArrayList arraylist1 = new ArrayList();
        a(dataholder, 4, s, "condition_id", i, new AppContentRunner(arraylist1) {

            final ArrayList Yb;

            public void b(ArrayList arraylist2, int j)
            {
                Yb.add(new AppContentConditionRef(arraylist2, j));
            }

            
            {
                Yb = arraylist;
                super();
            }
        }, arraylist);
        return arraylist1;
    }

    public static Bundle d(DataHolder dataholder, ArrayList arraylist, String s, int i)
    {
        Bundle bundle = new Bundle();
        a(dataholder, 3, s, "tuple_id", i, new AppContentRunner((DataHolder)arraylist.get(3), bundle) {

            final DataHolder Yc;
            final Bundle Yd;

            public void b(ArrayList arraylist1, int j)
            {
                arraylist1 = new AppContentTupleRef(Yc, j);
                Yd.putString(arraylist1.getName(), arraylist1.getValue());
            }

            
            {
                Yc = dataholder;
                Yd = bundle;
                super();
            }
        }, arraylist);
        return bundle;
    }
}
