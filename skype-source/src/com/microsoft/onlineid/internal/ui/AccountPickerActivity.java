// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.h;
import com.microsoft.onlineid.internal.ApiRequestResultReceiver;
import com.microsoft.onlineid.internal.c;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.n;
import com.microsoft.onlineid.ui.AddAccountActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            a, c, b

public class AccountPickerActivity extends Activity
{
    private class AddAccountFlowReceiver extends ApiRequestResultReceiver
    {

        final AccountPickerActivity a;

        protected final void a()
        {
            if (com.microsoft.onlineid.internal.ui.AccountPickerActivity.d(a).a(com.microsoft.onlineid.internal.ui.AccountPickerActivity.c(a)).isEmpty())
            {
                a.finish();
            }
        }

        protected final void a(PendingIntent pendingintent)
        {
            try
            {
                a.startIntentSenderForResult(pendingintent.getIntentSender(), 0, null, 0, 0, 0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (PendingIntent pendingintent)
            {
                com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a, pendingintent);
            }
        }

        protected final void a(c c1)
        {
            com.microsoft.onlineid.a.a.a().a("SDK", "Add account", "via account picker");
            c1 = com.microsoft.onlineid.internal.ui.AccountPickerActivity.d(a).b(c1.b());
            if (c1 == null)
            {
                com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a, new com.microsoft.onlineid.b.b("Picker could not find newly added account."));
                return;
            } else
            {
                com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a, c1);
                return;
            }
        }

        protected final void a(Exception exception)
        {
            boolean flag;
            if (exception != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.microsoft.onlineid.internal.e.a(flag);
            com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a, exception);
        }

        public AddAccountFlowReceiver(Handler handler)
        {
            a = AccountPickerActivity.this;
            super(handler);
        }
    }

    private static final class a extends Enum
    {

        public static final a a;
        private static final a b[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/internal/ui/AccountPickerActivity$a, s);
        }

        public static a[] values()
        {
            return (a[])b.clone();
        }

        public final String a()
        {
            return (new StringBuilder("com.microsoft.msa.authenticator.")).append(name()).toString();
        }

        static 
        {
            a = new a("CidsToExclude");
            b = (new a[] {
                a
            });
        }

        private a(String s)
        {
            super(s, 0);
        }
    }


    private Set a;
    private com.microsoft.onlineid.internal.ui.b b;
    private com.microsoft.onlineid.sts.a c;
    private n d;
    private com.microsoft.onlineid.internal.a e;

    public AccountPickerActivity()
    {
    }

    public static Intent a(Context context, ArrayList arraylist, String s, String s1, String s2, Bundle bundle)
    {
        return (new Intent()).setClass(context, com/microsoft/onlineid/internal/ui/AccountPickerActivity).setAction("com.microsoft.onlineid.internal.PICK_ACCOUNT").putStringArrayListExtra(com.microsoft.onlineid.internal.ui.a.a.a(), arraylist).putExtra("com.microsoft.onlineid.preferred_membername_type", s).putExtra("com.microsoft.onlineid.cobranding_id", s1).putExtra("com.microsoft.onlineid.client_package_name", s2).putExtra("com.microsoft.onlineid.client_state", bundle).setData((new com.microsoft.onlineid.internal.i.a()).a(arraylist).a(s).a(s1).a(s2).a());
    }

    private void a()
    {
        com.microsoft.onlineid.a.a.a().a("SDK", "Initiate account add", "via account picker");
        Intent intent = AddAccountActivity.a(getApplicationContext(), new h(getIntent().getExtras()), getIntent().getStringExtra("com.microsoft.onlineid.preferred_membername_type"), getIntent().getStringExtra("com.microsoft.onlineid.cobranding_id"), getIntent().getStringExtra("com.microsoft.onlineid.client_package_name"), getIntent().getBundleExtra("com.microsoft.onlineid.client_state"));
        startActivityForResult((new com.microsoft.onlineid.internal.b(getApplicationContext(), intent)).a(new AddAccountFlowReceiver(new Handler())).a(), 1);
    }

    static void a(AccountPickerActivity accountpickeractivity)
    {
        accountpickeractivity.a();
    }

    static void a(AccountPickerActivity accountpickeractivity, com.microsoft.onlineid.sts.b b1)
    {
        accountpickeractivity.e.a(b1).a();
        accountpickeractivity.finish();
    }

    static void a(AccountPickerActivity accountpickeractivity, Exception exception)
    {
        accountpickeractivity.e.a(exception).a();
        accountpickeractivity.finish();
    }

    static com.microsoft.onlineid.internal.ui.b b(AccountPickerActivity accountpickeractivity)
    {
        return accountpickeractivity.b;
    }

    static Set c(AccountPickerActivity accountpickeractivity)
    {
        return accountpickeractivity.a;
    }

    static com.microsoft.onlineid.sts.a d(AccountPickerActivity accountpickeractivity)
    {
        return accountpickeractivity.c;
    }

    protected void onCreate(Bundle bundle)
    {
        d = new n(getApplicationContext());
        requestWindowFeature(8);
        Object obj = getWindow();
        Object obj1 = ((Window) (obj)).getAttributes();
        Object obj2 = getResources().getDisplayMetrics();
        ((Window) (obj)).addFlags(2);
        int j = ((DisplayMetrics) (obj2)).heightPixels;
        int k = getResources().getIdentifier("status_bar_height", "dimen", "android");
        int i = 0;
        if (k != 0)
        {
            i = getResources().getDimensionPixelSize(k);
        }
        j -= i;
        i = d.b("accountPickerMargin");
        int l = ((DisplayMetrics) (obj2)).widthPixels - i;
        k = d.b("maxAccountPickerHeight");
        int i1 = d.b("maxAccountPickerWidth");
        if (j > k)
        {
            i = k;
        } else
        {
            i = j;
        }
        obj1.height = i;
        if (l > i1)
        {
            i = i1;
        } else
        {
            i = l;
        }
        obj1.width = i;
        if (j > k)
        {
            i = 17;
        } else
        {
            i = 80;
        }
        obj1.gravity = i;
        obj1.dimAmount = 0.5F;
        ((Window) (obj)).setAttributes(((android.view.WindowManager.LayoutParams) (obj1)));
        com.microsoft.onlineid.internal.ui.a.a(this, d.a("webflow_header"));
        super.onCreate(bundle);
        e = new com.microsoft.onlineid.internal.a(this, com.microsoft.onlineid.internal.a.a.a);
        setContentView(d.c("account_picker"));
        obj1 = getIntent().getBundleExtra("com.microsoft.onlineid.client_state");
        obj = null;
        obj2 = getIntent().getStringExtra("com.microsoft.onlineid.client_package_name");
        bundle = ((Bundle) (obj));
        if (obj2 != null)
        {
            bundle = ((Bundle) (obj));
            if (((String) (obj2)).equals("com.microsoft.msa.authenticator"))
            {
                bundle = ((Bundle) (obj1)).getString("com.microsoft.onlineid.account_picker_body");
            }
        }
        obj = bundle;
        if (bundle == null)
        {
            obj = d.a("account_picker_list_body");
        }
        bundle = com.microsoft.onlineid.internal.ui.c.a(d.a("account_picker_list_header"), ((String) (obj)), com/microsoft/onlineid/internal/ui/c);
        getFragmentManager().beginTransaction().add(d.d("accountPickerBase"), bundle).commit();
        b = new com.microsoft.onlineid.internal.ui.b(this);
        c = new com.microsoft.onlineid.sts.a(getApplicationContext());
        bundle = getIntent().getStringArrayListExtra(com.microsoft.onlineid.internal.ui.a.a.a());
        a = new HashSet();
        if (bundle != null)
        {
            a.addAll(bundle);
        }
        bundle = (ListView)findViewById(d.d("listAccounts"));
        obj = getLayoutInflater().inflate(d.c("add_account_tile"), bundle, false);
        ((View) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final AccountPickerActivity a;

            public final void onClick(View view)
            {
                com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a);
            }

            
            {
                a = AccountPickerActivity.this;
                super();
            }
        });
        bundle.addFooterView(((View) (obj)));
        bundle.setAdapter(b);
        bundle.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AccountPickerActivity a;

            public final void onItemClick(AdapterView adapterview, View view, int j1, long l1)
            {
                com.microsoft.onlineid.a.a.a().a("SDK", "Pick an account", "via account picker");
                adapterview = (com.microsoft.onlineid.sts.b)com.microsoft.onlineid.internal.ui.AccountPickerActivity.b(a).getItem(j1);
                com.microsoft.onlineid.internal.ui.AccountPickerActivity.a(a, adapterview);
                a.finish();
            }

            
            {
                a = AccountPickerActivity.this;
                super();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(d.e("action_dismiss_account_picker"), menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == d.d("action_dismiss"))
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onResume()
    {
        super.onResume();
        Set set = c.a(a);
        com.microsoft.onlineid.internal.c.d.a(String.format(Locale.US, "%d active account(s)", new Object[] {
            Integer.valueOf(set.size())
        }));
        if (set.isEmpty())
        {
            a();
            return;
        } else
        {
            b.a(set);
            return;
        }
    }

    protected void onStart()
    {
        super.onStart();
        com.microsoft.onlineid.a.a.a().a("Account picker");
    }
}
