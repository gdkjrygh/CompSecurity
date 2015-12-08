// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Handler;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.libraries.social.ingest.IngestActivity;
import com.google.android.libraries.social.ingest.ui.IngestGridView;

public final class ncq
    implements android.widget.AbsListView.MultiChoiceModeListener
{

    private boolean a;
    private IngestActivity b;

    public ncq(IngestActivity ingestactivity)
    {
        b = ingestactivity;
        super();
        a = false;
    }

    private void a(ActionMode actionmode)
    {
        int i = IngestActivity.a(b).getCheckedItemCount();
        actionmode.setTitle(b.getResources().getQuantityString(b.FP, i, new Object[] {
            Integer.valueOf(i)
        }));
    }

    public final boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        return b.onOptionsItemSelected(menuitem);
    }

    public final boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        actionmode.getMenuInflater().inflate(b.FN, menu);
        a(actionmode);
        IngestActivity.a(b, actionmode);
        IngestActivity.a(b, menu.findItem(b.FF));
        IngestActivity.a(b, IngestActivity.d(b), IngestActivity.e(b));
        return true;
    }

    public final void onDestroyActionMode(ActionMode actionmode)
    {
        IngestActivity.a(b, null);
        IngestActivity.a(b, null);
        IngestActivity.f(b).sendEmptyMessage(3);
    }

    public final void onItemCheckedStateChanged(ActionMode actionmode, int i, long l, boolean flag)
    {
        boolean flag1 = true;
        if (a)
        {
            return;
        }
        SparseBooleanArray sparsebooleanarray;
        int j;
        int k;
        if (IngestActivity.b(b).getItemViewType(i) == 1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j == 0) goto _L2; else goto _L1
_L1:
        sparsebooleanarray = IngestActivity.a(b).getCheckedItemPositions();
        a = true;
        IngestActivity.a(b).setItemChecked(i, false);
        k = IngestActivity.b(b).getPositionForSection(IngestActivity.b(b).getSectionForPosition(i) + 1);
        j = k;
        if (k == i)
        {
            j = IngestActivity.b(b).getCount();
        }
        for (int i1 = i + 1; i1 < j; i1++)
        {
            if (!sparsebooleanarray.get(i1))
            {
                flag = flag1;
                break MISSING_BLOCK_LABEL_136;
            }
        }

          goto _L3
_L6:
        for (i1 = i + 1; i1 < j; i1++)
        {
            if (sparsebooleanarray.get(i1) != flag)
            {
                IngestActivity.a(b).setItemChecked(i1, flag);
            }
        }

        IngestActivity.c(b).b();
        a = false;
_L4:
        IngestActivity.a(b, i);
        a(actionmode);
        return;
_L2:
        IngestActivity.c(b).b(i, flag);
        if (true) goto _L4; else goto _L3
_L3:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        a(actionmode);
        return false;
    }
}
