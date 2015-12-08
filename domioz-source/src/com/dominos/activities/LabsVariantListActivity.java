// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.widget.ListView;
import android.widget.TextView;
import com.dominos.adapters.LabsVariantListAdapter;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.store.MenuManager;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.dominos.activities:
//            LabsBaseListActivity

public class LabsVariantListActivity extends LabsBaseListActivity
{

    boolean isEditMode;
    boolean isRestoreProductLineInEdit;
    private List mVariantList;
    TextView menuListTitle;
    int productLineId;
    String productName;
    LabsVariantListAdapter variantListAdapter;

    public LabsVariantListActivity()
    {
        productName = "";
        isEditMode = false;
        isRestoreProductLineInEdit = false;
    }

    public void scrollToVariant(String s)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < mVariantList.size())
                {
                    if (!((LabsVariant)mVariantList.get(i)).getCode().equalsIgnoreCase(s))
                    {
                        break label0;
                    }
                    getListView().setSelection(i);
                }
                return;
            }
            i++;
        } while (true);
    }

    void setupVariantList()
    {
        if (mVariantList == null || !mMenuManager.isMenuLoaded())
        {
            return;
        } else
        {
            mCartManager.setPanWithMarinara(false);
            menuListTitle.setText(productName);
            Collections.sort(mVariantList, new _cls1());
            variantListAdapter.setVariantList(mVariantList);
            setListAdapter(variantListAdapter);
            getListView().setOnItemClickListener(new _cls2());
            return;
        }
    }

    private class _cls1
        implements Comparator
    {

        final LabsVariantListActivity this$0;

        public int compare(LabsVariant labsvariant, LabsVariant labsvariant1)
        {
            LabsSize labssize = mMenuManager.getSize(labsvariant);
            LabsSize labssize1 = mMenuManager.getSize(labsvariant1);
            int j = 0;
            int i = j;
            if (labssize != null)
            {
                i = j;
                if (labssize1 != null)
                {
                    i = Integer.parseInt(labssize.getSortSeq()) - Integer.parseInt(labssize1.getSortSeq());
                }
            }
            j = i;
            if (i == 0)
            {
                labsvariant = mMenuManager.getFlavor(labsvariant);
                labsvariant1 = mMenuManager.getFlavor(labsvariant1);
                j = i;
                if (labsvariant != null)
                {
                    j = i;
                    if (labsvariant1 != null)
                    {
                        j = Integer.parseInt(labsvariant.getSortSeq()) - Integer.parseInt(labsvariant1.getSortSeq());
                    }
                }
            }
            return j;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((LabsVariant)obj, (LabsVariant)obj1);
        }

        _cls1()
        {
            this$0 = LabsVariantListActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final LabsVariantListActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = variantListAdapter.getItem(i);
            view = new LabsProductLine(adapterview);
            mMenuManager.loadOptionsFromMenu(view);
            view.resetToDefaultOptions();
            if (isRestoreProductLineInEdit)
            {
                ((ProductWizardManager)mMobileSession.getManager("product_wizard_manager")).setNewVariantFromVariantListActivity(adapterview);
                finish();
            }
        }

        _cls2()
        {
            this$0 = LabsVariantListActivity.this;
            super();
        }
    }

}
