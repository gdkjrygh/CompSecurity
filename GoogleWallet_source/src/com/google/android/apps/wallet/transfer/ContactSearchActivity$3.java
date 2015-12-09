// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.p2p.people.ContactListAdapter;

// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ContactSearchActivity

final class val.substr
    implements android.support.v4.app.backs
{

    final ContactSearchActivity this$0;
    final String val$selectionArgs[];
    final String val$selectionSuffix;
    final String val$substr;

    private void onLoadFinished(Loader loader, Cursor cursor)
    {
        ContactSearchActivity.access$400(ContactSearchActivity.this).setVisibility(8);
        if (val$substr.length() == 0)
        {
            loader = new MatrixCursor(ContactSearchActivity.access$200());
            ContactSearchActivity.access$002(ContactSearchActivity.this, new ContactListAdapter(ContactSearchActivity.this, loader));
            ContactSearchActivity.access$500(ContactSearchActivity.this).setAdapter(ContactSearchActivity.access$000(ContactSearchActivity.this));
        } else
        {
            int i = cursor.getCount();
            WLog.i(ContactSearchActivity.TAG, String.format("Found %s contacts for query", new Object[] {
                Integer.valueOf(i)
            }));
            if (i == 0 && val$substr.toString().indexOf("@") != -1)
            {
                loader = new MatrixCursor(ContactSearchActivity.access$200());
                loader.addRow(new Object[] {
                    Integer.valueOf(0), "", val$substr.toString(), ""
                });
                ContactSearchActivity.access$002(ContactSearchActivity.this, new ContactListAdapter(ContactSearchActivity.this, loader));
                ContactSearchActivity.access$500(ContactSearchActivity.this).setAdapter(ContactSearchActivity.access$000(ContactSearchActivity.this));
                if (ContactSearchActivity.access$600(ContactSearchActivity.this) == ntactSearchMode.SEND_MONEY)
                {
                    ContactSearchActivity.access$400(ContactSearchActivity.this).setVisibility(0);
                    return;
                }
            } else
            {
                if (i < 6000)
                {
                    MatrixCursor matrixcursor = new MatrixCursor(ContactSearchActivity.access$200());
                    int k = cursor.getColumnIndex("display_name");
                    int l = cursor.getColumnIndex("data1");
                    int i1 = cursor.getColumnIndex("photo_id");
                    loader = null;
                    int j = 0;
                    while (cursor.moveToNext()) 
                    {
                        String s1 = cursor.getString(k);
                        String s = cursor.getString(l);
                        String s2 = cursor.getString(i1);
                        if (s.equals(loader))
                        {
                            j++;
                        } else
                        {
                            matrixcursor.addRow(new Object[] {
                                Integer.valueOf(0), s1, s, s2
                            });
                            loader = s;
                        }
                    }
                    WLog.ifmt(ContactSearchActivity.TAG, "Removed duplicates: %s", new Object[] {
                        Integer.valueOf(j)
                    });
                    ContactSearchActivity.access$002(ContactSearchActivity.this, new ContactListAdapter(ContactSearchActivity.this, matrixcursor));
                } else
                {
                    ContactSearchActivity.access$002(ContactSearchActivity.this, new ContactListAdapter(ContactSearchActivity.this, cursor));
                }
                ContactSearchActivity.access$500(ContactSearchActivity.this).setAdapter(ContactSearchActivity.access$000(ContactSearchActivity.this));
                return;
            }
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle)
    {
        ContactSearchActivity contactsearchactivity = ContactSearchActivity.this;
        android.net.Uri uri = android.provider.NTENT_URI;
        String as[] = ContactSearchActivity.access$200();
        bundle = String.valueOf(ContactSearchActivity.access$300());
        String s = String.valueOf(val$selectionSuffix);
        if (s.length() != 0)
        {
            bundle = bundle.concat(s);
        } else
        {
            bundle = new String(bundle);
        }
        return new CursorLoader(contactsearchactivity, uri, as, bundle, val$selectionArgs, "display_name");
    }

    public final volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public final void onLoaderReset(Loader loader)
    {
        if (ContactSearchActivity.access$000(ContactSearchActivity.this) != null)
        {
            ContactSearchActivity.access$000(ContactSearchActivity.this).swapCursor(null);
        }
    }

    ntactSearchMode()
    {
        this$0 = final_contactsearchactivity;
        val$selectionSuffix = s;
        val$selectionArgs = as;
        val$substr = String.this;
        super();
    }
}
