// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.data.domain.MealType;
import com.fitbit.food.b;
import com.fitbit.util.ad;
import java.util.Date;

public class RelatedFoodsDialogFragment extends DialogFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private static final String d = "com.fitbit.food.ui.RelatedFoodsDialogFragment.FOOD_ITEM_ENTITY_ID_TAG";
    private static final String e = "com.fitbit.food.ui.RelatedFoodsDialogFragment.FOOD_ITEM_SERVER_ID_TAG";
    private static final String f = "com.fitbit.food.ui.RelatedFoodsDialogFragment.MEAL_SERVER_ID_TAG";
    private static final String g = "com.fitbit.food.ui.RelatedFoodsDialogFragment.MEAL_TYPE_TAG";
    private static final String h = "com.fitbit.food.ui.RelatedFoodsDialogFragment.LOG_DATE_TAG";
    protected TextView a;
    protected ListView b;
    protected TextView c;
    private LinearLayout i;
    private View j;
    private Date k;
    private b l;

    public RelatedFoodsDialogFragment()
    {
    }

    public static RelatedFoodsDialogFragment a(Activity activity, long l1, long l2, MealType mealtype, Date date)
    {
        activity = new RelatedFoodsDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("com.fitbit.food.ui.RelatedFoodsDialogFragment.FOOD_ITEM_ENTITY_ID_TAG", l1);
        bundle.putLong("com.fitbit.food.ui.RelatedFoodsDialogFragment.FOOD_ITEM_SERVER_ID_TAG", l2);
        bundle.putInt("com.fitbit.food.ui.RelatedFoodsDialogFragment.MEAL_TYPE_TAG", mealtype.getCode());
        bundle.putLong("com.fitbit.food.ui.RelatedFoodsDialogFragment.LOG_DATE_TAG", date.getTime());
        activity.setArguments(bundle);
        return activity;
    }

    public static RelatedFoodsDialogFragment a(Activity activity, long l1, MealType mealtype, Date date)
    {
        activity = new RelatedFoodsDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("com.fitbit.food.ui.RelatedFoodsDialogFragment.MEAL_SERVER_ID_TAG", l1);
        bundle.putInt("com.fitbit.food.ui.RelatedFoodsDialogFragment.MEAL_TYPE_TAG", mealtype.getCode());
        bundle.putLong("com.fitbit.food.ui.RelatedFoodsDialogFragment.LOG_DATE_TAG", date.getTime());
        activity.setArguments(bundle);
        return activity;
    }

    static Date a(RelatedFoodsDialogFragment relatedfoodsdialogfragment)
    {
        return relatedfoodsdialogfragment.k;
    }

    private void a()
    {
        i.setVisibility(4);
        j.setVisibility(0);
    }

    private void b()
    {
        i.setVisibility(0);
        j.setVisibility(4);
    }

    public void a(Loader loader, b b1)
    {
        if (b1 == null || b1.isEmpty())
        {
            ad.a(getFragmentManager(), this, 4099);
            return;
        } else
        {
            a.setText(b1.b());
            b.setAdapter(b1);
            b.setOnItemClickListener(new _cls2());
            b();
            return;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(0x7f04007a, null);
        bundle.setView(view);
        a = (TextView)view.findViewById(0x7f110223);
        b = (ListView)view.findViewById(0x7f110224);
        i = (LinearLayout)view.findViewById(0x7f11006c);
        c = (TextView)view.findViewById(0x7f110225);
        c.setOnClickListener(new _cls1());
        j = view.findViewById(0x7f11009b);
        a();
        k = new Date(getArguments().getLong("com.fitbit.food.ui.RelatedFoodsDialogFragment.LOG_DATE_TAG", (new Date()).getTime()));
        getActivity().getSupportLoaderManager().restartLoader(27, getArguments(), this);
        setCancelable(true);
        bundle = bundle.create();
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        long l1 = bundle.getLong("com.fitbit.food.ui.RelatedFoodsDialogFragment.FOOD_ITEM_ENTITY_ID_TAG", -1L);
        long l2 = bundle.getLong("com.fitbit.food.ui.RelatedFoodsDialogFragment.FOOD_ITEM_SERVER_ID_TAG", -1L);
        long l3 = bundle.getLong("com.fitbit.food.ui.RelatedFoodsDialogFragment.MEAL_SERVER_ID_TAG", -1L);
    /* block-local class not found */
    class a {}

        return new a(getActivity(), l1, l2, l3, MealType.getByCode(bundle.getInt("com.fitbit.food.ui.RelatedFoodsDialogFragment.MEAL_TYPE_TAG")));
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (b)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
