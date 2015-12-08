// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.history;

import android.app.ListActivity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.google.zxing.client.android.CaptureActivity;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.zxing.client.android.history:
//            HistoryManager, HistoryItemAdapter, HistoryItem

public final class HistoryActivity extends ListActivity
{

    private static final String TAG = com/google/zxing/client/android/history/HistoryActivity.getSimpleName();
    private HistoryItemAdapter adapter;
    private HistoryManager historyManager;

    public HistoryActivity()
    {
    }

    private void reloadHistoryItems()
    {
        Object obj = historyManager.buildHistoryItems();
        adapter.clear();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                if (adapter.isEmpty())
                {
                    adapter.add(new HistoryItem(null, null, null));
                }
                return;
            }
            HistoryItem historyitem = (HistoryItem)((Iterator) (obj)).next();
            adapter.add(historyitem);
        } while (true);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        historyManager.deleteHistoryItem(i);
        reloadHistoryItems();
        return true;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        historyManager = new HistoryManager(this);
        adapter = new HistoryItemAdapter(this);
        setListAdapter(adapter);
        registerForContextMenu(getListView());
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        int i = ((android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo).position;
        if (i >= adapter.getCount() || ((HistoryItem)adapter.getItem(i)).getResult() != null)
        {
            contextmenu.add(0, i, i, com.google.zxing.client.android.R.string.history_clear_one_history_text);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (historyManager.hasHistoryItems())
        {
            getMenuInflater().inflate(com.google.zxing.client.android.R.menu.history, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onListItemClick(ListView listview, View view, int i, long l)
    {
        if (((HistoryItem)adapter.getItem(i)).getResult() != null)
        {
            listview = new Intent(this, com/google/zxing/client/android/CaptureActivity);
            listview.putExtra("ITEM_NUMBER", i);
            setResult(-1, listview);
            finish();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() != com.google.zxing.client.android.R.id.menu_history_send) goto _L2; else goto _L1
_L1:
        menuitem = HistoryManager.saveHistory(historyManager.buildHistory().toString());
        if (menuitem != null) goto _L4; else goto _L3
_L3:
        menuitem = new android.app.AlertDialog.Builder(this);
        menuitem.setMessage(com.google.zxing.client.android.R.string.msg_unmount_usb);
        menuitem.setPositiveButton(com.google.zxing.client.android.R.string.button_ok, null);
        menuitem.show();
_L6:
        return true;
_L4:
        Intent intent = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
        intent.addFlags(0x80000);
        String s = getResources().getString(com.google.zxing.client.android.R.string.history_email_title);
        intent.putExtra("android.intent.extra.SUBJECT", s);
        intent.putExtra("android.intent.extra.TEXT", s);
        intent.putExtra("android.intent.extra.STREAM", menuitem);
        intent.setType("text/csv");
        try
        {
            startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            Log.w(TAG, menuitem.toString());
            return true;
        }
        return true;
_L2:
        if (menuitem.getItemId() == com.google.zxing.client.android.R.id.menu_history_clear_text)
        {
            menuitem = new android.app.AlertDialog.Builder(this);
            menuitem.setMessage(com.google.zxing.client.android.R.string.msg_sure);
            menuitem.setCancelable(true);
            menuitem.setPositiveButton(com.google.zxing.client.android.R.string.button_ok, new android.content.DialogInterface.OnClickListener() {

                final HistoryActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    historyManager.clearHistory();
                    dialoginterface.dismiss();
                    finish();
                }

            
            {
                this$0 = HistoryActivity.this;
                super();
            }
            });
            menuitem.setNegativeButton(com.google.zxing.client.android.R.string.button_cancel, null);
            menuitem.show();
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onResume()
    {
        super.onResume();
        reloadHistoryItems();
    }


}
