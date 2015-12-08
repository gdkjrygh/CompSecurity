// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.app.Dialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            RemoteDialog

public class ShowMessageDialogFrag extends NetflixDialogFrag
    implements MdxMiniPlayerFrag.MdxMiniPlayerDialog
{
    public static interface MessageResponseProvider
    {

        public abstract void onResponse(String s);
    }


    private static final String BUTTON_CODE = "buttonCode";
    private static final String BUTTON_COUNT = "buttonCount";
    private static final String BUTTON_NAME = "buttonName";
    private static final String MESSAGE = "message";
    private static final String TAG = "mdxui";
    private static final String TITLE = "title";
    private final AtomicBoolean mClicked = new AtomicBoolean(false);

    public ShowMessageDialogFrag()
    {
    }

    public static ShowMessageDialogFrag newInstance(RemoteDialog remotedialog)
    {
        ShowMessageDialogFrag showmessagedialogfrag = new ShowMessageDialogFrag();
        Bundle bundle = new Bundle();
        if (remotedialog.getTitle() != null)
        {
            bundle.putString("title", remotedialog.getTitle());
        }
        if (remotedialog.getMessage() != null)
        {
            bundle.putString("message", remotedialog.getMessage());
        }
        bundle.putInt("buttonCount", remotedialog.getOptions().length);
        for (int i = 0; i < remotedialog.getOptions().length; i++)
        {
            bundle.putString((new StringBuilder()).append("buttonName").append(i).toString(), (String)remotedialog.getOptions()[i].first);
            bundle.putString((new StringBuilder()).append("buttonCode").append(i).toString(), (String)remotedialog.getOptions()[i].second);
        }

        showmessagedialogfrag.setArguments(bundle);
        return showmessagedialogfrag;
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getArguments().getString("title");
        String s = getArguments().getString("message");
        int j = getArguments().getInt("buttonCount", 0);
        String as[] = new String[j];
        final String codes[] = new String[j];
        for (int i = 0; i < j; i++)
        {
            as[i] = getArguments().getString((new StringBuilder()).append("buttonName").append(i).toString());
            codes[i] = getArguments().getString((new StringBuilder()).append("buttonCode").append(i).toString());
        }

        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        if (bundle != null)
        {
            builder.setTitle(bundle);
        } else
        {
            Log.w("mdxui", "No title...");
        }
        if (s != null)
        {
            builder.setMessage(s);
        } else
        {
            Log.w("mdxui", "No message...");
        }
        if (j < 1)
        {
            Log.e("mdxui", "We are expecting at least one button!");
        }
        if (j > 0)
        {
            builder.setPositiveButton(as[0], new android.content.DialogInterface.OnClickListener() {

                final ShowMessageDialogFrag this$0;
                final String val$codes[];

                public void onClick(DialogInterface dialoginterface, int k)
                {
label0:
                    {
                        synchronized (mClicked)
                        {
                            if (!mClicked.get())
                            {
                                break label0;
                            }
                            Log.w("mdxui", "Already clicked!");
                        }
                        return;
                    }
                    mClicked.set(true);
                    dialoginterface;
                    JVM INSTR monitorexit ;
                    dismissAllowingStateLoss();
                    getFragmentManager().beginTransaction().remove(ShowMessageDialogFrag.this).commit();
                    dialoginterface = getActivity();
                    if (dialoginterface instanceof MessageResponseProvider)
                    {
                        ((MessageResponseProvider)dialoginterface).onResponse(codes[0]);
                        return;
                    } else
                    {
                        return;
                    }
                    exception;
                    dialoginterface;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                this$0 = ShowMessageDialogFrag.this;
                codes = as;
                super();
            }
            });
        }
        if (j > 1)
        {
            builder.setNegativeButton(as[1], new android.content.DialogInterface.OnClickListener() {

                final ShowMessageDialogFrag this$0;
                final String val$codes[];

                public void onClick(DialogInterface dialoginterface, int k)
                {
label0:
                    {
                        synchronized (mClicked)
                        {
                            if (!mClicked.get())
                            {
                                break label0;
                            }
                            Log.w("mdxui", "Already clicked!");
                        }
                        return;
                    }
                    mClicked.set(true);
                    dialoginterface;
                    JVM INSTR monitorexit ;
                    dismissAllowingStateLoss();
                    getFragmentManager().beginTransaction().remove(ShowMessageDialogFrag.this).commit();
                    dialoginterface = getActivity();
                    if (dialoginterface instanceof MessageResponseProvider)
                    {
                        ((MessageResponseProvider)dialoginterface).onResponse(codes[1]);
                        return;
                    } else
                    {
                        return;
                    }
                    exception;
                    dialoginterface;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                this$0 = ShowMessageDialogFrag.this;
                codes = as;
                super();
            }
            });
        }
        if (j > 2)
        {
            builder.setNegativeButton(as[2], new android.content.DialogInterface.OnClickListener() {

                final ShowMessageDialogFrag this$0;
                final String val$codes[];

                public void onClick(DialogInterface dialoginterface, int k)
                {
label0:
                    {
                        synchronized (mClicked)
                        {
                            if (!mClicked.get())
                            {
                                break label0;
                            }
                            Log.w("mdxui", "Already clicked!");
                        }
                        return;
                    }
                    mClicked.set(true);
                    dialoginterface;
                    JVM INSTR monitorexit ;
                    dismissAllowingStateLoss();
                    getFragmentManager().beginTransaction().remove(ShowMessageDialogFrag.this).commit();
                    dialoginterface = getActivity();
                    if (dialoginterface instanceof MessageResponseProvider)
                    {
                        ((MessageResponseProvider)dialoginterface).onResponse(codes[2]);
                        return;
                    } else
                    {
                        return;
                    }
                    exception;
                    dialoginterface;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                this$0 = ShowMessageDialogFrag.this;
                codes = as;
                super();
            }
            });
        }
        if (j > 3)
        {
            Log.e("mdxui", "We can support up to 3 buttons!");
        }
        return builder.create();
    }

}
