// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.b;
import com.cardinalblue.android.piccollage.model.gson.ColorOption;
import com.cardinalblue.android.piccollage.view.CheckableCircleView;
import com.cardinalblue.android.piccollage.view.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EditBorderDialogFragment extends Fragment
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{
    public static class BorderState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public BorderState a(Parcel parcel)
            {
                return new BorderState(parcel);
            }

            public BorderState[] a(int i)
            {
                return new BorderState[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        public int a;
        public boolean b;
        public boolean c;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            boolean flag = true;
            parcel.writeInt(a);
            byte byte0;
            if (b)
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            parcel.writeByte(byte0);
            if (c)
            {
                byte0 = flag;
            } else
            {
                byte0 = 0;
            }
            parcel.writeByte(byte0);
        }


        public BorderState()
        {
        }

        private BorderState(Parcel parcel)
        {
            boolean flag1 = true;
            super();
            a = parcel.readInt();
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
            if (parcel.readByte() != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            c = flag;
        }

    }

    public static class a extends android.support.v7.widget.RecyclerView.Adapter
    {

        private final Context a;
        private final List b;
        private final android.widget.AdapterView.OnItemClickListener c;
        private int d;

        private Context a()
        {
            return a;
        }

        static android.widget.AdapterView.OnItemClickListener a(a a1)
        {
            return a1.c;
        }

        public int a(int i)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext();)
            {
                ColorOption coloroption = (ColorOption)iterator.next();
                if (coloroption.getColor() == i)
                {
                    return b.indexOf(coloroption);
                }
            }

            return -1;
        }

        public b a(ViewGroup viewgroup, int i)
        {
            viewgroup = (CheckableCircleView)LayoutInflater.from(a()).inflate(0x7f0300f2, viewgroup, false);
            i = a().getResources().getColor(0x7f0f0062);
            viewgroup.a(viewgroup.getBorderColor(), i);
            return new b(viewgroup);
        }

        public void a(b b1, int i)
        {
            ColorOption coloroption = (ColorOption)b.get(i);
            b1.a.setOnClickListener(new android.view.View.OnClickListener(this, i) {

                final int a;
                final a b;

                public void onClick(View view)
                {
                    if (a.a(b) != null)
                    {
                        a.a(b).onItemClick(null, view, a, 0L);
                    }
                }

            
            {
                b = a1;
                a = i;
                super();
            }
            });
            boolean flag;
            if (!TextUtils.isEmpty(coloroption.getThumbnail()))
            {
                b1.a.setImageResource(0x7f02012c);
            } else
            {
                Bitmap bitmap = Bitmap.createBitmap(2, 2, android.graphics.Bitmap.Config.ARGB_8888);
                bitmap.eraseColor(coloroption.getColor());
                b1.a.setImageBitmap(bitmap);
            }
            b1 = b1.a;
            if (d == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b1.setChecked(flag);
        }

        public void b(int i)
        {
            d = i;
        }

        public int c(int i)
        {
            return ((ColorOption)b.get(i)).getColor();
        }

        public int getItemCount()
        {
            return b.size();
        }

        public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
        {
            a((b)viewholder, i);
        }

        public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return a(viewgroup, i);
        }

        public a(Context context, com.cardinalblue.android.piccollage.model.b b1, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
        {
            d = -1;
            a = context;
            b = b1.a();
            c = onitemclicklistener;
        }
    }

    public static class b extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public final CheckableCircleView a;

        public b(CheckableCircleView checkablecircleview)
        {
            super(checkablecircleview);
            a = checkablecircleview;
        }
    }

    public static interface c
    {

        public abstract void a(int i, boolean flag);

        public abstract void a(boolean flag, boolean flag1);

        public abstract void a(boolean flag, boolean flag1, int i, List list);

        public abstract void c();
    }


    private BorderState a;
    private ArrayList b;
    private int c;
    private c d;
    private CheckBox e;
    private CheckBox f;
    private a g;

    public EditBorderDialogFragment()
    {
    }

    static int a(EditBorderDialogFragment editborderdialogfragment, int i)
    {
        editborderdialogfragment.c = i;
        return i;
    }

    static a a(EditBorderDialogFragment editborderdialogfragment)
    {
        return editborderdialogfragment.g;
    }

    public static EditBorderDialogFragment a(BorderState borderstate, ArrayList arraylist)
    {
        EditBorderDialogFragment editborderdialogfragment = new EditBorderDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("original_state", borderstate);
        bundle.putParcelableArrayList("original_states", arraylist);
        editborderdialogfragment.setArguments(bundle);
        return editborderdialogfragment;
    }

    static c b(EditBorderDialogFragment editborderdialogfragment)
    {
        return editborderdialogfragment.d;
    }

    static CheckBox c(EditBorderDialogFragment editborderdialogfragment)
    {
        return editborderdialogfragment.f;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        d = (c)activity;
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton.getId();
        JVM INSTR tableswitch 2131755459 2131755461: default 32
    //                   2131755459 33
    //                   2131755460 32
    //                   2131755461 58;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        if (d != null)
        {
            d.a(flag, f.isChecked());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (d != null)
        {
            d.a(flag, e.isChecked(), c, b);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 2: default 32
    //                   2131755457: 33
    //                   2131755462: 33;
           goto _L1 _L2 _L2
_L1:
        return;
_L2:
        if (d != null)
        {
            d.c();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        a = (BorderState)bundle.getParcelable("original_state");
        b = bundle.getParcelableArrayList("original_states");
        c = a.a;
        bundle = (com.cardinalblue.android.piccollage.model.b)k.a(getResources(), 0x7f060000, com/cardinalblue/android/piccollage/model/b);
        if (bundle == null)
        {
            com.cardinalblue.android.piccollage.a.f.a(new NullPointerException("can't parsing border colors from assets folder"));
            k.a(getActivity(), 0x7f0700f8, 1);
            getActivity().getFragmentManager().popBackStack();
            return;
        } else
        {
            g = new a(getActivity(), bundle, new android.widget.AdapterView.OnItemClickListener() {

                final EditBorderDialogFragment a;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    int i1 = EditBorderDialogFragment.a(a).c(i);
                    EditBorderDialogFragment.a(a, i1);
                    EditBorderDialogFragment.a(a).b(i);
                    if (com.cardinalblue.android.piccollage.view.fragments.EditBorderDialogFragment.b(a) != null)
                    {
                        com.cardinalblue.android.piccollage.view.fragments.EditBorderDialogFragment.b(a).a(i1, EditBorderDialogFragment.c(a).isChecked());
                    }
                    EditBorderDialogFragment.a(a).notifyDataSetChanged();
                }

            
            {
                a = EditBorderDialogFragment.this;
                super();
            }
            });
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = View.inflate(getActivity(), 0x7f0300b4, null);
        f = (CheckBox)layoutinflater.findViewById(0x7f1001c5);
        f.setChecked(a.c);
        f.setOnCheckedChangeListener(this);
        e = (CheckBox)layoutinflater.findViewById(0x7f1001c3);
        e.setChecked(a.b);
        e.setOnCheckedChangeListener(this);
        layoutinflater.findViewById(0x7f1001c6).setOnClickListener(this);
        layoutinflater.findViewById(0x7f1001c1).setOnClickListener(this);
        viewgroup = (RecyclerView)layoutinflater.findViewById(0x7f1001c7);
        viewgroup.addItemDecoration(new j(getResources().getDimensionPixelSize(0x7f0b0140)));
        bundle = new GridLayoutManager(getActivity(), 2);
        bundle.setOrientation(0);
        viewgroup.setLayoutManager(bundle);
        if (g != null)
        {
            int i = g.a(c);
            g.b(i);
            viewgroup.setAdapter(g);
        }
        return layoutinflater;
    }

    public void onDetach()
    {
        super.onDetach();
        d = null;
    }
}
