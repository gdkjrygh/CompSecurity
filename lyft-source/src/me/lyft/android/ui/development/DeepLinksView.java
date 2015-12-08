// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.utils.Keyboard;

public class DeepLinksView extends LinearLayout
{

    private static final String DEEP_LINKS[] = {
        "help", "drive", "drivemode", "editprofile", "settings", "payment", "payment?credits=CATFISH", "concur", "referral", "workperks", 
        "note", "ridetype?id=courier&pickup[latitude]37.778434&pickup[longitude]-122.397103&destination[latitude]37.791474&destination[longitude]-122.417205", "app-walkthrough"
    };
    private static String DEEP_LINK_BASE = "lyft://";
    EditText deepLinkEditText;
    ListView deepLinkList;
    DeepLinkManager deepLinkManager;
    Toolbar toolbar;

    public DeepLinksView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        toolbar.setTitle(getContext().getString(0x7f070102));
        deepLinkEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final DeepLinksView this$0;

            public boolean onEditorAction(TextView textview, int k, KeyEvent keyevent)
            {
                if (k == 2)
                {
                    performRoute();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = DeepLinksView.this;
                super();
            }
        });
        final ArrayAdapter adapter = new ArrayList();
        String as[] = DEEP_LINKS;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            adapter.add((new StringBuilder()).append(DEEP_LINK_BASE).append(s).toString());
        }

        adapter = new ArrayAdapter(getContext(), 0x1090009, adapter);
        deepLinkList.setAdapter(adapter);
        deepLinkList.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final DeepLinksView this$0;
            final ArrayAdapter val$adapter;

            public void onItemClick(AdapterView adapterview, View view, int k, long l)
            {
                deepLinkEditText.setText("");
                deepLinkEditText.append((CharSequence)adapter.getItem(k));
            }

            
            {
                this$0 = DeepLinksView.this;
                adapter = arrayadapter;
                super();
            }
        });
        Keyboard.showKeyboard(deepLinkEditText);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    void performRoute()
    {
        deepLinkManager.route(deepLinkEditText.getText().toString());
    }

}
