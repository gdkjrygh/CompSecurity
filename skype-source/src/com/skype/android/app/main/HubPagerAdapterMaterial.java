// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.support.v4.app.n;
import android.view.LayoutInflater;
import android.view.View;
import com.skype.android.app.contacts.ContactListFragment;
import com.skype.android.app.dialer.CallHistoryMaterialFragment;
import com.skype.android.app.recents.RecentListFragment;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.main:
//            HubSectionMaterial

public class HubPagerAdapterMaterial extends n
{

    EcsConfiguration configuration;
    private final Context context;

    public HubPagerAdapterMaterial(Context context1, l l)
    {
        super(l);
        context = context1;
    }

    public int getCount()
    {
        return 3;
    }

    public Fragment getItem(int i)
    {
        HubSectionMaterial hubsectionmaterial = HubSectionMaterial.forIndex(i);
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$main$HubSectionMaterial[];

            static 
            {
                $SwitchMap$com$skype$android$app$main$HubSectionMaterial = new int[HubSectionMaterial.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$main$HubSectionMaterial[HubSectionMaterial.RECENTS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$main$HubSectionMaterial[HubSectionMaterial.CONTACTS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$main$HubSectionMaterial[HubSectionMaterial.DIALER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.app.main.HubSectionMaterial[hubsectionmaterial.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new RecentListFragment();

        case 2: // '\002'
            return new ContactListFragment();

        case 3: // '\003'
            return new CallHistoryMaterialFragment();
        }
    }

    public CharSequence getPageTitle(int i)
    {
        return "";
    }

    public View getView(int i)
    {
        HubSectionMaterial hubsectionmaterial = HubSectionMaterial.forIndex(i);
        View view = LayoutInflater.from(context).inflate(0x7f030116, null);
        SymbolView symbolview = (SymbolView)view.findViewById(0x7f100542);
        switch (_cls1..SwitchMap.com.skype.android.app.main.HubSectionMaterial[hubsectionmaterial.ordinal()])
        {
        default:
            return view;

        case 1: // '\001'
            symbolview.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.O);
            symbolview.setContentDescription(context.getResources().getString(0x7f080312));
            return view;

        case 2: // '\002'
            symbolview.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.ap);
            symbolview.setContentDescription(context.getResources().getString(0x7f0802ff));
            return view;

        case 3: // '\003'
            symbolview.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.P);
            break;
        }
        symbolview.setContentDescription(context.getResources().getString(0x7f080310));
        return view;
    }
}
