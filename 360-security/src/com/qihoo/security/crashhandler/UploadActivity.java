// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.crashhandler;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.qihoo.security.app.BaseSimpleActivity;
import com.qihoo.security.dialog.i;
import com.qihoo.security.dialog.k;
import com.qihoo.security.lite.AppEnterActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.support.b;
import com.qihoo360.common.utils.Utils;

// Referenced classes of package com.qihoo.security.crashhandler:
//            b

public class UploadActivity extends BaseSimpleActivity
{
    private class a extends AsyncTask
    {

        final UploadActivity a;

        protected transient Integer a(Void avoid[])
        {
            return Integer.valueOf(com.qihoo.security.crashhandler.b.a(a).b());
        }

        protected void a(Integer integer)
        {
            super.onPostExecute(integer);
            Utils.dismissDialog(UploadActivity.a(a));
            UploadActivity uploadactivity = a;
            boolean flag;
            if (integer.intValue() >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            UploadActivity.a(uploadactivity, flag);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Integer)obj);
        }

        private a()
        {
            a = UploadActivity.this;
            super();
        }

    }


    public d a;
    private k b;
    private i c;

    public UploadActivity()
    {
        a = d.a();
    }

    static k a(UploadActivity uploadactivity)
    {
        return uploadactivity.b;
    }

    private void a()
    {
        if (com.qihoo.security.crashhandler.b.a(this).d())
        {
            b();
            return;
        } else
        {
            c();
            return;
        }
    }

    static void a(UploadActivity uploadactivity, boolean flag)
    {
        uploadactivity.a(flag);
    }

    private void a(boolean flag)
    {
        int j;
        if (flag)
        {
            j = 0x7f0c015c;
        } else
        {
            j = 0x7f0c015e;
        }
        c = new i(this, 0x7f0c015f, j);
        c.setButtonText(new int[] {
            0x7f0c015d, 0x7f0c014f
        });
        c.setCancelable(false);
        c.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final UploadActivity a;

                public void onClick(View view)
                {
                    Utils.dismissDialog(UploadActivity.c(a));
                    view = new Intent(a, com/qihoo/security/lite/AppEnterActivity);
                    view.setFlags(0x10000000);
                    a.startActivity(view);
                    com.qihoo.security.crashhandler.UploadActivity.b(a);
                }

            
            {
                a = UploadActivity.this;
                super();
            }
            }, new android.view.View.OnClickListener() {

                final UploadActivity a;

                public void onClick(View view)
                {
                    Utils.dismissDialog(UploadActivity.c(a));
                    com.qihoo.security.crashhandler.UploadActivity.b(a);
                }

            
            {
                a = UploadActivity.this;
                super();
            }
            }
        });
        try
        {
            if (c != null && !isFinishing())
            {
                c.show();
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void b()
    {
        com.qihoo.security.support.b.c(19011);
        if (b == null)
        {
            b = new k(this, 0x7f0c015f, 0x7f0c015a);
            b.setButtonText(new CharSequence[] {
                a.a(0x7f0c0154), a.a(0x7f0c0152)
            });
            b.setCancelable(false);
            b.setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener() {

                    final UploadActivity a;

                    public void onClick(View view)
                    {
                        UploadActivity.a(a).a(0x7f0c015b);
                        UploadActivity.a(a).setButtonText(new CharSequence[] {
                            a.a.a(0x7f0c0153)
                        });
                        UploadActivity.a(a).setButtonOnClickListener(new android.view.View.OnClickListener[] {
                            new android.view.View.OnClickListener(this) {

                                final _cls1 a;

                                public void onClick(View view)
                                {
                                    a.a.finish();
                                }

            
            {
                a = _pcls1;
                super();
            }
                            }
                        });
                        (a. new a()).execute(new Void[0]);
                    }

            
            {
                a = UploadActivity.this;
                super();
            }
                }, new android.view.View.OnClickListener() {

                    final UploadActivity a;

                    public void onClick(View view)
                    {
                        com.qihoo.security.crashhandler.b.a(a).c();
                        com.qihoo.security.crashhandler.UploadActivity.b(a);
                    }

            
            {
                a = UploadActivity.this;
                super();
            }
                }
            });
        }
        try
        {
            if (b != null && !isFinishing())
            {
                b.show();
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    static void b(UploadActivity uploadactivity)
    {
        uploadactivity.c();
    }

    static i c(UploadActivity uploadactivity)
    {
        return uploadactivity.c;
    }

    private void c()
    {
        finish();
        System.exit(0);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a.d();
        setContentView(0x7f030043);
        a();
    }

    protected void onDestroy()
    {
        Utils.dismissDialog(b);
        Utils.dismissDialog(c);
        super.onDestroy();
    }
}
