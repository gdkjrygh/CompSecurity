// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.nux.adapter.NUXNextFragmentListener;
import com.pinterest.experience.NuxStep;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;

public class NUXHeaderView extends RelativeLayout
{

    private boolean _isSkippable;
    PButton _skipBt;
    private String _skipDesc;
    NUXNextFragmentListener _skipListener;
    private String _skipNegTx;
    private String _skipPosTx;
    private String _skipTitle;
    PTextView _titleDescTextView;
    PTextView _titleTextView;
    android.view.View.OnClickListener skipBtListener;

    public NUXHeaderView(Context context)
    {
        this(context, null);
    }

    public NUXHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NUXHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        skipBtListener = new _cls1();
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301ef, this);
        ButterKnife.a(this);
        _skipBt.setOnClickListener(skipBtListener);
        _isSkippable = true;
        _skipBt.setText(Resources.string(0x7f07055f));
        _titleTextView.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD);
        _titleDescTextView.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.REGULAR);
    }

    public void applyExperience(NuxStep nuxstep)
    {
        setTitle(nuxstep.b);
        setTitleDesc(nuxstep.c);
        setSkipTitle(nuxstep.h);
        setSkipDesc(nuxstep.g);
        setSkipPosTx(nuxstep.e);
        setSkipNegTx(nuxstep.f);
        boolean flag;
        if (!nuxstep.i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setSkippable(flag);
    }

    public void setSkipDesc(String s)
    {
        if (s != null)
        {
            _skipDesc = s;
        }
    }

    public void setSkipListener(NUXNextFragmentListener nuxnextfragmentlistener)
    {
        _skipListener = nuxnextfragmentlistener;
    }

    public void setSkipNegTx(String s)
    {
        if (s != null)
        {
            _skipNegTx = s;
        }
    }

    public void setSkipPosTx(String s)
    {
        if (s != null)
        {
            _skipPosTx = s;
        }
    }

    public void setSkipTitle(String s)
    {
        if (s != null)
        {
            _skipTitle = s;
        }
    }

    public void setSkippable(boolean flag)
    {
        _isSkippable = flag;
        ViewHelper.setVisibility(_skipBt, _isSkippable);
    }

    public void setTitle(String s)
    {
        if (s == null || _titleTextView == null)
        {
            return;
        } else
        {
            _titleTextView.setText(s);
            return;
        }
    }

    public void setTitleDesc(String s)
    {
        if (s == null || _titleDescTextView == null)
        {
            return;
        } else
        {
            _titleDescTextView.setText(s);
            return;
        }
    }





    private class _cls1
        implements android.view.View.OnClickListener
    {

        final NUXHeaderView this$0;

        public void onClick(final View dialog)
        {
            dialog = new BaseDialog();
            if (_skipPosTx == null || _skipListener == null)
            {
                return;
            } else
            {
                dialog.setTitle(_skipTitle);
                dialog.setMessage(_skipDesc);
                class _cls1
                    implements android.view.View.OnClickListener
                {

                    final _cls1 this$1;
                    final BaseDialog val$dialog;

                    public void onClick(View view)
                    {
                        if (_skipListener != null)
                        {
                            _skipListener.skipFragment();
                        }
                        dialog.dismiss();
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    dialog = basedialog;
                    super();
                }
                }

                dialog.setNegativeButton(_skipNegTx, new _cls1());
                class _cls2
                    implements android.view.View.OnClickListener
                {

                    final _cls1 this$1;
                    final BaseDialog val$dialog;

                    public void onClick(View view)
                    {
                        dialog.dismiss();
                    }

                _cls2()
                {
                    this$1 = _cls1.this;
                    dialog = basedialog;
                    super();
                }
                }

                dialog.setPositiveButton(_skipPosTx, new _cls2());
                Events.post(new DialogEvent(dialog));
                return;
            }
        }

        _cls1()
        {
            this$0 = NUXHeaderView.this;
            super();
        }
    }

}
