// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.settings:
//            DeletePhoneDialogFragment, ManageAliasesActivity

public class ManageAliasesAdapter extends BaseAdapter
{
    public static interface DeletePhoneCallback
    {

        public abstract void onDeletePhoneNumber(com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo aliasinfo);
    }

    public static interface OnAliasSearchableStateUpdate
    {

        public abstract void onSearchableStateUpdate(com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo aliasinfo, boolean flag);
    }

    private static final class a
    {

        public TextView aliasName;
        public CheckBox aliasState;

        private a()
        {
        }

    }


    private AccessibilityUtil accessibility;
    private List aliases;
    private DeletePhoneCallback deletePhoneCallback;
    private OnAliasSearchableStateUpdate listener;
    ShortCircuitProfileWebClient scProfileWebClient;

    public ManageAliasesAdapter(AccessibilityUtil accessibilityutil)
    {
        aliases = new ArrayList();
        deletePhoneCallback = new DeletePhoneCallback() {

            final ManageAliasesAdapter this$0;

            public final void onDeletePhoneNumber(com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo aliasinfo)
            {
                scProfileWebClient.deletePhone(aliasinfo);
            }

            
            {
                this$0 = ManageAliasesAdapter.this;
                super();
            }
        };
        accessibility = accessibilityutil;
    }

    private String formatPhoneNumber(com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo aliasinfo)
    {
        String s1 = TextUtils.split(aliasinfo.getCountry(), "-")[1];
        String s = PhoneNumberUtils.stripSeparators(aliasinfo.getAlias());
        aliasinfo = s;
        if (!s.startsWith(s1))
        {
            aliasinfo = (new StringBuilder()).append(s1).append(s).toString();
        }
        return PhoneNumberUtils.formatNumber((new StringBuilder("+")).append(aliasinfo).toString());
    }

    private void updateContentDescription(View view, String s, boolean flag)
    {
        if (accessibility.a())
        {
            Context context = view.getContext();
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append((new StringBuilder()).append(AccessibilityUtil.a(s)).append(", ").toString());
            if (flag)
            {
                s = context.getString(0x7f080074);
            } else
            {
                s = context.getString(0x7f0800e8);
            }
            stringbuilder.append(s);
            view.setContentDescription(stringbuilder);
            AccessibilityUtil.a(view, 128);
        }
    }

    public int getCount()
    {
        return aliases.size();
    }

    public Object getItem(int i)
    {
        return aliases.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(final int position, View view, final ViewGroup holder)
    {
        com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo aliasinfo;
        if (view == null)
        {
            a a1 = new a();
            view = LayoutInflater.from(holder.getContext()).inflate(0x7f030020, holder, false);
            a1.aliasName = (TextView)ViewUtil.a(view, 0x7f10021e);
            a1.aliasState = (CheckBox)ViewUtil.a(view, 0x7f10021f);
            view.setTag(a1);
            holder = a1;
        } else
        {
            holder = (a)view.getTag();
        }
        ((a) (holder)).aliasState.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final ManageAliasesAdapter this$0;
            final a val$holder;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                Object obj = (Integer)holder.aliasName.getTag();
                obj = (com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo)aliases.get(((Integer) (obj)).intValue());
                if (flag != ((com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo) (obj)).isSearchable())
                {
                    updateAliasState(((com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo) (obj)), flag);
                    if (accessibility.a())
                    {
                        updateContentDescription((View)compoundbutton.getParent(), holder.aliasName.getText().toString(), flag);
                    }
                }
            }

            
            {
                this$0 = ManageAliasesAdapter.this;
                holder = a1;
                super();
            }
        });
        ((a) (holder)).aliasName.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final ManageAliasesAdapter this$0;
            final int val$position;

            public final boolean onLongClick(View view1)
            {
                DeletePhoneDialogFragment deletephonedialogfragment = DeletePhoneDialogFragment.create((com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo)aliases.get(position));
                ((DeletePhoneDialogFragment)deletephonedialogfragment).setDeletePhoneCallback(deletePhoneCallback);
                deletephonedialogfragment.show(((ManageAliasesActivity)view1.getContext()).getSupportFragmentManager());
                return true;
            }

            
            {
                this$0 = ManageAliasesAdapter.this;
                position = i;
                super();
            }
        });
        aliasinfo = (com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo)getItem(position);
        ((a) (holder)).aliasName.setText(formatPhoneNumber(aliasinfo));
        ((a) (holder)).aliasName.setTag(Integer.valueOf(position));
        ((a) (holder)).aliasState.setChecked(aliasinfo.isSearchable());
        updateContentDescription(view, ((a) (holder)).aliasName.getText().toString(), ((a) (holder)).aliasState.isChecked());
        return view;
    }

    public void setOnAliasSearchableStateUpdateListener(OnAliasSearchableStateUpdate onaliassearchablestateupdate)
    {
        listener = onaliassearchablestateupdate;
    }

    public void updateAliasState(com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo aliasinfo, boolean flag)
    {
        if (listener != null)
        {
            listener.onSearchableStateUpdate(aliasinfo, flag);
        }
    }

    public void updateAliases(List list)
    {
        aliases.clear();
        if (list != null)
        {
            aliases.addAll(list);
        }
        notifyDataSetChanged();
    }




}
