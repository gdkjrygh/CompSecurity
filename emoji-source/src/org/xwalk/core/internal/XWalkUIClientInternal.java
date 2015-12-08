// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.ValueCallback;
import android.widget.EditText;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal, XWalkJavascriptResultInternal

public class XWalkUIClientInternal
{
    public static final class InitiateByInternal extends Enum
    {

        private static final InitiateByInternal $VALUES[];
        public static final InitiateByInternal BY_JAVASCRIPT;
        public static final InitiateByInternal BY_USER_GESTURE;

        public static InitiateByInternal valueOf(String s)
        {
            return (InitiateByInternal)Enum.valueOf(org/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal, s);
        }

        public static InitiateByInternal[] values()
        {
            return (InitiateByInternal[])$VALUES.clone();
        }

        static 
        {
            BY_USER_GESTURE = new InitiateByInternal("BY_USER_GESTURE", 0);
            BY_JAVASCRIPT = new InitiateByInternal("BY_JAVASCRIPT", 1);
            $VALUES = (new InitiateByInternal[] {
                BY_USER_GESTURE, BY_JAVASCRIPT
            });
        }

        private InitiateByInternal(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class JavascriptMessageTypeInternal extends Enum
    {

        private static final JavascriptMessageTypeInternal $VALUES[];
        public static final JavascriptMessageTypeInternal JAVASCRIPT_ALERT;
        public static final JavascriptMessageTypeInternal JAVASCRIPT_BEFOREUNLOAD;
        public static final JavascriptMessageTypeInternal JAVASCRIPT_CONFIRM;
        public static final JavascriptMessageTypeInternal JAVASCRIPT_PROMPT;

        public static JavascriptMessageTypeInternal valueOf(String s)
        {
            return (JavascriptMessageTypeInternal)Enum.valueOf(org/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal, s);
        }

        public static JavascriptMessageTypeInternal[] values()
        {
            return (JavascriptMessageTypeInternal[])$VALUES.clone();
        }

        static 
        {
            JAVASCRIPT_ALERT = new JavascriptMessageTypeInternal("JAVASCRIPT_ALERT", 0);
            JAVASCRIPT_CONFIRM = new JavascriptMessageTypeInternal("JAVASCRIPT_CONFIRM", 1);
            JAVASCRIPT_PROMPT = new JavascriptMessageTypeInternal("JAVASCRIPT_PROMPT", 2);
            JAVASCRIPT_BEFOREUNLOAD = new JavascriptMessageTypeInternal("JAVASCRIPT_BEFOREUNLOAD", 3);
            $VALUES = (new JavascriptMessageTypeInternal[] {
                JAVASCRIPT_ALERT, JAVASCRIPT_CONFIRM, JAVASCRIPT_PROMPT, JAVASCRIPT_BEFOREUNLOAD
            });
        }

        private JavascriptMessageTypeInternal(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LoadStatusInternal extends Enum
    {

        private static final LoadStatusInternal $VALUES[];
        public static final LoadStatusInternal CANCELLED;
        public static final LoadStatusInternal FAILED;
        public static final LoadStatusInternal FINISHED;

        public static LoadStatusInternal valueOf(String s)
        {
            return (LoadStatusInternal)Enum.valueOf(org/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal, s);
        }

        public static LoadStatusInternal[] values()
        {
            return (LoadStatusInternal[])$VALUES.clone();
        }

        static 
        {
            FINISHED = new LoadStatusInternal("FINISHED", 0);
            FAILED = new LoadStatusInternal("FAILED", 1);
            CANCELLED = new LoadStatusInternal("CANCELLED", 2);
            $VALUES = (new LoadStatusInternal[] {
                FINISHED, FAILED, CANCELLED
            });
        }

        private LoadStatusInternal(String s, int i)
        {
            super(s, i);
        }
    }


    static final boolean $assertionsDisabled;
    private static String mCancelButton;
    private static String mJSAlertTitle;
    private static String mJSConfirmTitle;
    private static String mJSPromptTitle;
    private static String mOKButton;
    private Context mContext;
    private View mDecorView;
    private AlertDialog mDialog;
    private boolean mIsFullscreen;
    private boolean mOriginalForceNotFullscreen;
    private boolean mOriginalFullscreen;
    private EditText mPromptText;
    private int mSystemUiFlag;
    private XWalkViewInternal mXWalkView;

    public XWalkUIClientInternal(XWalkViewInternal xwalkviewinternal)
    {
        mIsFullscreen = false;
        mContext = xwalkviewinternal.getContext();
        mDecorView = xwalkviewinternal.getActivity().getWindow().getDecorView();
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            mSystemUiFlag = 1792;
        }
        mXWalkView = xwalkviewinternal;
        initResources();
    }

    private void initResources()
    {
        if (mJSAlertTitle != null)
        {
            return;
        } else
        {
            mJSAlertTitle = mContext.getString(R.string.js_alert_title);
            mJSConfirmTitle = mContext.getString(R.string.js_confirm_title);
            mJSPromptTitle = mContext.getString(R.string.js_prompt_title);
            mOKButton = mContext.getString(0x104000a);
            mCancelButton = mContext.getString(0x1040000);
            return;
        }
    }

    private boolean onJsAlert(XWalkViewInternal xwalkviewinternal, String s, String s1, final XWalkJavascriptResultInternal fResult)
    {
        xwalkviewinternal = new android.app.AlertDialog.Builder(mContext);
        xwalkviewinternal.setTitle(mJSAlertTitle).setMessage(s1).setCancelable(true).setPositiveButton(mOKButton, new android.content.DialogInterface.OnClickListener() {

            final XWalkUIClientInternal this$0;
            final XWalkJavascriptResultInternal val$fResult;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                fResult.confirm();
                dialoginterface.dismiss();
            }

            
            {
                this$0 = XWalkUIClientInternal.this;
                fResult = xwalkjavascriptresultinternal;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final XWalkUIClientInternal this$0;
            final XWalkJavascriptResultInternal val$fResult;

            public void onCancel(DialogInterface dialoginterface)
            {
                fResult.cancel();
            }

            
            {
                this$0 = XWalkUIClientInternal.this;
                fResult = xwalkjavascriptresultinternal;
                super();
            }
        });
        mDialog = xwalkviewinternal.create();
        mDialog.show();
        return false;
    }

    private boolean onJsConfirm(XWalkViewInternal xwalkviewinternal, String s, String s1, final XWalkJavascriptResultInternal fResult)
    {
        xwalkviewinternal = new android.app.AlertDialog.Builder(mContext);
        xwalkviewinternal.setTitle(mJSConfirmTitle).setMessage(s1).setCancelable(true).setPositiveButton(mOKButton, new android.content.DialogInterface.OnClickListener() {

            final XWalkUIClientInternal this$0;
            final XWalkJavascriptResultInternal val$fResult;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                fResult.confirm();
                dialoginterface.dismiss();
            }

            
            {
                this$0 = XWalkUIClientInternal.this;
                fResult = xwalkjavascriptresultinternal;
                super();
            }
        }).setNegativeButton(mCancelButton, new android.content.DialogInterface.OnClickListener() {

            final XWalkUIClientInternal this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = XWalkUIClientInternal.this;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final XWalkUIClientInternal this$0;
            final XWalkJavascriptResultInternal val$fResult;

            public void onCancel(DialogInterface dialoginterface)
            {
                fResult.cancel();
            }

            
            {
                this$0 = XWalkUIClientInternal.this;
                fResult = xwalkjavascriptresultinternal;
                super();
            }
        });
        mDialog = xwalkviewinternal.create();
        mDialog.show();
        return false;
    }

    private boolean onJsPrompt(XWalkViewInternal xwalkviewinternal, String s, String s1, String s2, final XWalkJavascriptResultInternal fResult)
    {
        xwalkviewinternal = new android.app.AlertDialog.Builder(mContext);
        xwalkviewinternal.setTitle(mJSPromptTitle).setMessage(s1).setPositiveButton(mOKButton, new android.content.DialogInterface.OnClickListener() {

            final XWalkUIClientInternal this$0;
            final XWalkJavascriptResultInternal val$fResult;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                fResult.confirmWithResult(mPromptText.getText().toString());
                dialoginterface.dismiss();
            }

            
            {
                this$0 = XWalkUIClientInternal.this;
                fResult = xwalkjavascriptresultinternal;
                super();
            }
        }).setNegativeButton(mCancelButton, new android.content.DialogInterface.OnClickListener() {

            final XWalkUIClientInternal this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = XWalkUIClientInternal.this;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final XWalkUIClientInternal this$0;
            final XWalkJavascriptResultInternal val$fResult;

            public void onCancel(DialogInterface dialoginterface)
            {
                fResult.cancel();
            }

            
            {
                this$0 = XWalkUIClientInternal.this;
                fResult = xwalkjavascriptresultinternal;
                super();
            }
        });
        mPromptText = new EditText(mContext);
        mPromptText.setVisibility(0);
        mPromptText.setText(s2);
        mPromptText.selectAll();
        xwalkviewinternal.setView(mPromptText);
        mDialog = xwalkviewinternal.create();
        mDialog.show();
        return false;
    }

    public boolean onCreateWindowRequested(XWalkViewInternal xwalkviewinternal, InitiateByInternal initiatebyinternal, ValueCallback valuecallback)
    {
        return false;
    }

    public void onFullscreenToggled(XWalkViewInternal xwalkviewinternal, boolean flag)
    {
        xwalkviewinternal = xwalkviewinternal.getActivity();
        if (flag)
        {
            if ((xwalkviewinternal.getWindow().getAttributes().flags & 0x800) != 0)
            {
                mOriginalForceNotFullscreen = true;
                xwalkviewinternal.getWindow().clearFlags(2048);
            } else
            {
                mOriginalForceNotFullscreen = false;
            }
            if (!mIsFullscreen)
            {
                if (android.os.Build.VERSION.SDK_INT >= 19)
                {
                    mSystemUiFlag = mDecorView.getSystemUiVisibility();
                    mDecorView.setSystemUiVisibility(5894);
                } else
                if ((xwalkviewinternal.getWindow().getAttributes().flags & 0x400) != 0)
                {
                    mOriginalFullscreen = true;
                } else
                {
                    mOriginalFullscreen = false;
                    xwalkviewinternal.getWindow().addFlags(1024);
                }
                mIsFullscreen = true;
            }
            return;
        }
        if (mOriginalForceNotFullscreen)
        {
            xwalkviewinternal.getWindow().addFlags(2048);
        }
        if (android.os.Build.VERSION.SDK_INT < 19) goto _L2; else goto _L1
_L1:
        mDecorView.setSystemUiVisibility(mSystemUiFlag);
_L4:
        mIsFullscreen = false;
        return;
_L2:
        if (!mOriginalFullscreen)
        {
            xwalkviewinternal.getWindow().clearFlags(1024);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onIconAvailable(XWalkViewInternal xwalkviewinternal, String s, Message message)
    {
    }

    public void onJavascriptCloseWindow(XWalkViewInternal xwalkviewinternal)
    {
        if (xwalkviewinternal != null && xwalkviewinternal.getActivity() != null)
        {
            xwalkviewinternal.getActivity().finish();
        }
    }

    public boolean onJavascriptModalDialog(XWalkViewInternal xwalkviewinternal, JavascriptMessageTypeInternal javascriptmessagetypeinternal, String s, String s1, String s2, XWalkJavascriptResultInternal xwalkjavascriptresultinternal)
    {
        static class _cls9
        {

            static final int $SwitchMap$org$xwalk$core$internal$XWalkUIClientInternal$JavascriptMessageTypeInternal[];

            static 
            {
                $SwitchMap$org$xwalk$core$internal$XWalkUIClientInternal$JavascriptMessageTypeInternal = new int[JavascriptMessageTypeInternal.values().length];
                try
                {
                    $SwitchMap$org$xwalk$core$internal$XWalkUIClientInternal$JavascriptMessageTypeInternal[JavascriptMessageTypeInternal.JAVASCRIPT_ALERT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$org$xwalk$core$internal$XWalkUIClientInternal$JavascriptMessageTypeInternal[JavascriptMessageTypeInternal.JAVASCRIPT_CONFIRM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$xwalk$core$internal$XWalkUIClientInternal$JavascriptMessageTypeInternal[JavascriptMessageTypeInternal.JAVASCRIPT_PROMPT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$xwalk$core$internal$XWalkUIClientInternal$JavascriptMessageTypeInternal[JavascriptMessageTypeInternal.JAVASCRIPT_BEFOREUNLOAD.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls9..SwitchMap.org.xwalk.core.internal.XWalkUIClientInternal.JavascriptMessageTypeInternal[javascriptmessagetypeinternal.ordinal()])
        {
        default:
            if (!$assertionsDisabled)
            {
                throw new AssertionError();
            } else
            {
                return false;
            }

        case 1: // '\001'
            return onJsAlert(xwalkviewinternal, s, s1, xwalkjavascriptresultinternal);

        case 2: // '\002'
            return onJsConfirm(xwalkviewinternal, s, s1, xwalkjavascriptresultinternal);

        case 3: // '\003'
            return onJsPrompt(xwalkviewinternal, s, s1, s2, xwalkjavascriptresultinternal);

        case 4: // '\004'
            return onJsConfirm(xwalkviewinternal, s, s1, xwalkjavascriptresultinternal);
        }
    }

    public void onPageLoadStarted(XWalkViewInternal xwalkviewinternal, String s)
    {
    }

    public void onPageLoadStopped(XWalkViewInternal xwalkviewinternal, String s, LoadStatusInternal loadstatusinternal)
    {
    }

    public void onReceivedIcon(XWalkViewInternal xwalkviewinternal, String s, Bitmap bitmap)
    {
    }

    public void onReceivedTitle(XWalkViewInternal xwalkviewinternal, String s)
    {
    }

    public void onRequestFocus(XWalkViewInternal xwalkviewinternal)
    {
    }

    public void onScaleChanged(XWalkViewInternal xwalkviewinternal, float f, float f1)
    {
    }

    public void onUnhandledKeyEvent(XWalkViewInternal xwalkviewinternal, KeyEvent keyevent)
    {
    }

    public void openFileChooser(XWalkViewInternal xwalkviewinternal, ValueCallback valuecallback, String s, String s1)
    {
        valuecallback.onReceiveValue(null);
    }

    public boolean shouldOverrideKeyEvent(XWalkViewInternal xwalkviewinternal, KeyEvent keyevent)
    {
        return false;
    }

    static 
    {
        boolean flag;
        if (!org/xwalk/core/internal/XWalkUIClientInternal.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

}
