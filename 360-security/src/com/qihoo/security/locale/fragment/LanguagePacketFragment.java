// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale.fragment;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import com.qihoo.security.dialog.i;
import com.qihoo.security.dialog.k;
import com.qihoo.security.locale.LanguageFragment;
import com.qihoo.security.locale.LocaleInfo;
import com.qihoo.security.locale.d;
import com.qihoo.security.ui.a;
import com.qihoo.security.v5.UpdateService;
import com.qihoo.security.v5.e;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.f;
import java.util.concurrent.atomic.AtomicBoolean;

public class LanguagePacketFragment extends LanguageFragment
{

    protected final AtomicBoolean c = new AtomicBoolean(false);
    private UpdateService j;
    private k k;
    private final e l = new e() {

        boolean a;
        final LanguagePacketFragment b;

        public void a()
        {
        }

        public void a(int i1)
        {
            a = false;
            switch (i1)
            {
            case -2: 
            default:
                return;

            case 0: // '\0'
                b.a();
                return;

            case -3: 
            case -1: 
                com.qihoo.security.locale.fragment.LanguagePacketFragment.a(b);
                return;
            }
        }

        public void a(String s)
        {
        }

        public void a(String s, boolean flag)
        {
            if (!flag)
            {
                a = true;
                b.b.sendMessageDelayed(b.b.obtainMessage(1003, LanguagePacketFragment.b(b)), 800L);
                return;
            } else
            {
                com.qihoo.security.locale.fragment.LanguagePacketFragment.a(b);
                return;
            }
        }

        public void b(String s)
        {
            if (!a)
            {
                b.b.sendMessageDelayed(b.b.obtainMessage(1003, LanguagePacketFragment.c(b)), 800L);
            }
            if (com.qihoo.security.locale.fragment.LanguagePacketFragment.d(b) != null)
            {
                com.qihoo.security.locale.fragment.LanguagePacketFragment.d(b).a(null);
            }
            a = false;
        }

        public void c(String s)
        {
            if (com.qihoo.security.locale.fragment.LanguagePacketFragment.d(b) != null)
            {
                com.qihoo.security.locale.fragment.LanguagePacketFragment.d(b).a(null);
            }
            com.qihoo.security.locale.fragment.LanguagePacketFragment.a(b);
        }

            
            {
                b = LanguagePacketFragment.this;
                super();
            }
    };
    private final ServiceConnection m = new ServiceConnection() {

        final LanguagePacketFragment a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.locale.fragment.LanguagePacketFragment.a(a, ((com.qihoo.security.v5.UpdateService.a)ibinder).a());
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            if (com.qihoo.security.locale.fragment.LanguagePacketFragment.d(a) != null)
            {
                com.qihoo.security.locale.fragment.LanguagePacketFragment.d(a).a(null);
                com.qihoo.security.locale.fragment.LanguagePacketFragment.a(a, null);
            }
        }

            
            {
                a = LanguagePacketFragment.this;
                super();
            }
    };

    public LanguagePacketFragment()
    {
        j = null;
        k = null;
    }

    static UpdateService a(LanguagePacketFragment languagepacketfragment, UpdateService updateservice)
    {
        languagepacketfragment.j = updateservice;
        return updateservice;
    }

    static void a(LanguagePacketFragment languagepacketfragment)
    {
        languagepacketfragment.c();
    }

    static String b(LanguagePacketFragment languagepacketfragment)
    {
        return languagepacketfragment.a;
    }

    static String c(LanguagePacketFragment languagepacketfragment)
    {
        return languagepacketfragment.a;
    }

    private void c()
    {
        Utils.dismissDialog(k);
        if (c.get())
        {
            b();
            return;
        }
        if (Utils.isNetworkAvailable(d))
        {
            g();
            return;
        } else
        {
            d();
            return;
        }
    }

    static UpdateService d(LanguagePacketFragment languagepacketfragment)
    {
        return languagepacketfragment.j;
    }

    private void d()
    {
        if (!f())
        {
            return;
        }
        i i1;
        int j1;
        int k1;
        int l1;
        if (c.get())
        {
            j1 = 0x7f0c01c7;
        } else
        {
            j1 = 0x7f0c0163;
        }
        if (c.get())
        {
            k1 = 0x7f0c01c6;
        } else
        {
            k1 = 0x7f0c00c5;
        }
        if (c.get())
        {
            l1 = 0x7f0c01d0;
        } else
        {
            l1 = 0x7f0c0156;
        }
        i1 = new i(getActivity(), j1, k1);
        i1.setCancelable(true);
        i1.setButtonText(new int[] {
            l1
        });
        i1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener(i1) {

                final i a;
                final LanguagePacketFragment b;

                public void onClick(View view)
                {
                    Utils.dismissDialog(a);
                }

            
            {
                b = LanguagePacketFragment.this;
                a = i1;
                super();
            }
            }
        });
        Utils.showDialog(i1);
    }

    static k e(LanguagePacketFragment languagepacketfragment)
    {
        return languagepacketfragment.k;
    }

    static d f(LanguagePacketFragment languagepacketfragment)
    {
        return languagepacketfragment.f;
    }

    static Context g(LanguagePacketFragment languagepacketfragment)
    {
        return languagepacketfragment.d;
    }

    private void g()
    {
        if (!f())
        {
            return;
        }
        i i1;
        int j1;
        int k1;
        int l1;
        if (c.get())
        {
            j1 = 0x7f0c01c7;
        } else
        {
            j1 = 0x7f0c0163;
        }
        if (c.get())
        {
            k1 = 0x7f0c01ca;
        } else
        {
            k1 = 0x7f0c0176;
        }
        if (c.get())
        {
            l1 = 0x7f0c01d0;
        } else
        {
            l1 = 0x7f0c0156;
        }
        i1 = new i(getActivity(), j1, k1);
        i1.setCancelable(true);
        i1.setButtonText(new int[] {
            l1
        });
        i1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener(i1) {

                final i a;
                final LanguagePacketFragment b;

                public void onClick(View view)
                {
                    Utils.dismissDialog(a);
                }

            
            {
                b = LanguagePacketFragment.this;
                a = i1;
                super();
            }
            }
        });
        Utils.showDialog(i1);
    }

    public void a()
    {
        if (k == null)
        {
            if (!f())
            {
                return;
            }
            int i1;
            int j1;
            int k1;
            if (c.get())
            {
                i1 = 0x7f0c01c7;
            } else
            {
                i1 = 0x7f0c0163;
            }
            if (c.get())
            {
                j1 = 0x7f0c01c9;
            } else
            {
                j1 = 0x7f0c0175;
            }
            if (c.get())
            {
                k1 = 0x7f0c01cf;
            } else
            {
                k1 = 0x7f0c014f;
            }
            k = new k(getActivity(), i1, j1);
            k.setCancelable(true);
            k.setButtonText(new int[] {
                k1
            });
            k.setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener() {

                    final LanguagePacketFragment a;

                    public void onClick(View view)
                    {
                        Utils.dismissDialog(com.qihoo.security.locale.fragment.LanguagePacketFragment.e(a));
                    }

            
            {
                a = LanguagePacketFragment.this;
                super();
            }
                }
            });
            k.a(j1);
            k.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

                final LanguagePacketFragment a;

                public boolean onKey(DialogInterface dialoginterface, int l1, KeyEvent keyevent)
                {
                    if (l1 == 4)
                    {
                        Utils.dismissDialog(com.qihoo.security.locale.fragment.LanguagePacketFragment.e(a));
                    } else
                    if (l1 != 84)
                    {
                        return false;
                    }
                    return true;
                }

            
            {
                a = LanguagePacketFragment.this;
                super();
            }
            });
        }
        Utils.showDialog(k);
    }

    public void a(LocaleInfo localeinfo)
    {
        if (!f())
        {
            return;
        } else
        {
            i i1 = new i(getActivity(), 0x7f0c0163, 0x7f0c016d);
            i1.setDialogMessage(0x7f0c016d);
            i1.setCancelable(true);
            i1.setButtonText(new int[] {
                0x7f0c0156, 0x7f0c014f
            });
            i1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener(localeinfo, i1) {

                    final LocaleInfo a;
                    final i b;
                    final LanguagePacketFragment c;

                    public void onClick(View view)
                    {
                        if (!com.qihoo360.mobilesafe.b.f.a())
                        {
                            if (a.support)
                            {
                                c.a(a.locale);
                            } else
                            {
                                c.a();
                            }
                            Utils.dismissDialog(b);
                        }
                    }

            
            {
                c = LanguagePacketFragment.this;
                a = localeinfo;
                b = i1;
                super();
            }
                }, new android.view.View.OnClickListener(i1) {

                    final i a;
                    final LanguagePacketFragment b;

                    public void onClick(View view)
                    {
                        Utils.dismissDialog(a);
                    }

            
            {
                b = LanguagePacketFragment.this;
                a = i1;
                super();
            }
                }
            });
            Utils.showDialog(i1);
            return;
        }
    }

    protected void a(String s)
    {
        if (j != null && isAdded())
        {
            j.a(l);
        }
        a = s;
        Intent intent = new Intent(d, com/qihoo/security/v5/UpdateService);
        intent.setAction("com.qihoo.security.action.ACTION_CHECK_UPDATE");
        intent.putExtra("type", 2001);
        intent.putExtra("locale", s);
        d.startService(intent);
    }

    protected void b()
    {
        if (!f())
        {
            return;
        }
        i i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (c.get())
        {
            j1 = 0x7f0c01cb;
        } else
        {
            j1 = 0x7f0c01a1;
        }
        if (c.get())
        {
            k1 = 0x7f0c01ce;
        } else
        {
            k1 = 0x7f0c01a3;
        }
        if (c.get())
        {
            l1 = 0x7f0c01d0;
        } else
        {
            l1 = 0x7f0c0156;
        }
        if (c.get())
        {
            i2 = 0x7f0c01cc;
        } else
        {
            i2 = 0x7f0c01a2;
        }
        i1 = new i(getActivity(), j1, k1);
        i1.setCancelable(true);
        i1.setButtonText(new int[] {
            l1, i2
        });
        i1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener(i1) {

                final i a;
                final LanguagePacketFragment b;

                public void onClick(View view)
                {
                    if (!com.qihoo360.mobilesafe.b.f.a())
                    {
                        Utils.dismissDialog(a);
                    }
                }

            
            {
                b = LanguagePacketFragment.this;
                a = i1;
                super();
            }
            }, new android.view.View.OnClickListener(i1) {

                final i a;
                final LanguagePacketFragment b;

                public void onClick(View view)
                {
                    com.qihoo.security.ui.a.f(LanguagePacketFragment.g(b));
                    Utils.dismissDialog(a);
                }

            
            {
                b = LanguagePacketFragment.this;
                a = i1;
                super();
            }
            }
        });
        Utils.showDialog(i1);
    }

    public void b(String s)
    {
        if (!f())
        {
            return;
        }
        i i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (c.get())
        {
            j1 = 0x7f0c01c7;
        } else
        {
            j1 = 0x7f0c0163;
        }
        if (c.get())
        {
            k1 = 0x7f0c01c8;
        } else
        {
            k1 = 0x7f0c016a;
        }
        if (c.get())
        {
            l1 = 0x7f0c01d0;
        } else
        {
            l1 = 0x7f0c0156;
        }
        if (c.get())
        {
            i2 = 0x7f0c01cf;
        } else
        {
            i2 = 0x7f0c014f;
        }
        i1 = new i(getActivity(), j1, k1);
        i1.setCancelable(true);
        i1.setButtonText(new int[] {
            l1, i2
        });
        i1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener(s, i1) {

                final String a;
                final i b;
                final LanguagePacketFragment c;

                public void onClick(View view)
                {
                    if (!com.qihoo360.mobilesafe.b.f.a())
                    {
                        com.qihoo.security.locale.fragment.LanguagePacketFragment.f(c).a(a);
                        c.b.sendMessageDelayed(c.b.obtainMessage(1002), 300L);
                        Utils.dismissDialog(b);
                    }
                }

            
            {
                c = LanguagePacketFragment.this;
                a = s;
                b = i1;
                super();
            }
            }, new android.view.View.OnClickListener(i1) {

                final i a;
                final LanguagePacketFragment b;

                public void onClick(View view)
                {
                    Utils.dismissDialog(a);
                }

            
            {
                b = LanguagePacketFragment.this;
                a = i1;
                super();
            }
            }
        });
        Utils.showDialog(i1);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        getActivity().getApplicationContext().bindService(new Intent(activity, com/qihoo/security/v5/UpdateService), m, 1);
    }

    public void onDestroy()
    {
        if (j != null)
        {
            j.a(null);
            j = null;
        }
        b.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public void onDetach()
    {
        getActivity().getApplicationContext().unbindService(m);
        super.onDetach();
    }
}
