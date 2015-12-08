// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import II;
import IO;
import Jo;
import LF;
import PG;
import S;
import V;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.snapchat.android.Timber;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.fragment.SnapchatFragment;
import java.io.File;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.snapchat.android.util.debug:
//            ScApplicationInfo, BugReportRemoteLogListFragment

public class BugReportFragment extends SnapchatFragment
    implements BugReportRemoteLogListFragment.a
{

    public static final String LOG_FILES_KEY = "logs";
    private static final CharSequence PROJECT_NAMES[] = {
        "Ads", "Camera", "Gallery", "Looksery Lens", "Cash", "Chat", "Hamburger", "Design/UI", "Discover", "Discover Sharing", 
        "Feed", "Friends", "Here", "Send To Page", "Snap preview", "Snap receiving/opening", "Stories", "Story Explorer", "Live Story", "Login", 
        "Registration", "Settings", "Profile", "Performance", "Localization"
    };
    public static final String SCREENSHOT_FILE_KEY = "screenshots";
    private static final String SHAKE_TO_REPORT_SEND_TO_SELF_EMAIL = "SHAKE_TO_REPORT_SEND_TO_SELF_EMAIL";
    private static final String TAG = "BugReportFragment";
    private final int REQ_CODE_SPEECH_INPUT = 100;
    private Activity mActivity;
    private Button mAddRemoteLogButton;
    private EditText mBugDescription;
    private TextView mClickToSendToSelfTextView;
    private boolean mDidUserTapEnter;
    private String mImageFile;
    private boolean mIsReportSubmittable;
    private String mLogFiles[];
    private android.app.AlertDialog.Builder mPickProjectDialog;
    private String mProjectName;
    private Button mProjectNameButton;
    private String mRemoteLogRecipient;
    private ImageView mScreenshotThumbnailCover;
    private boolean mShouldIncludeScreenshot;
    private boolean mShouldSendReportToSelfOnly;
    private EditText mStepsToRepro;
    private Button mSubmitButton;

    public BugReportFragment()
    {
        mDidUserTapEnter = false;
        mShouldIncludeScreenshot = true;
        mIsReportSubmittable = false;
        mShouldSendReportToSelfOnly = false;
    }

    static String a(Context context)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(ScApplicationInfo.a(context));
        return stringbuilder.toString();
    }

    static String a(BugReportFragment bugreportfragment, String s1)
    {
        bugreportfragment.mProjectName = s1;
        return s1;
    }

    static void a(BugReportFragment bugreportfragment)
    {
        Intent intent = (new Intent("android.speech.action.RECOGNIZE_SPEECH")).putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form").putExtra("android.speech.extra.LANGUAGE", Locale.ENGLISH).putExtra("android.speech.extra.PROMPT", "Describe the bug");
        try
        {
            bugreportfragment.startActivityForResult(intent, 100);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Toast.makeText(bugreportfragment.getActivity(), "Speech input is not supported. :(", 0).show();
        }
    }

    static boolean a(BugReportFragment bugreportfragment, boolean flag)
    {
        bugreportfragment.mShouldSendReportToSelfOnly = flag;
        return flag;
    }

    static boolean b(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mShouldSendReportToSelfOnly;
    }

    static boolean b(BugReportFragment bugreportfragment, boolean flag)
    {
        bugreportfragment.mShouldIncludeScreenshot = flag;
        return flag;
    }

    static TextView c(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mClickToSendToSelfTextView;
    }

    static boolean c(BugReportFragment bugreportfragment, boolean flag)
    {
        bugreportfragment.mDidUserTapEnter = flag;
        return flag;
    }

    static Activity d(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mActivity;
    }

    static boolean d(BugReportFragment bugreportfragment, boolean flag)
    {
        bugreportfragment.mIsReportSubmittable = flag;
        return flag;
    }

    static Bitmap e(BugReportFragment bugreportfragment)
    {
        bugreportfragment = (BitmapDrawable)((ImageView)bugreportfragment.d(0x7f0d00a1)).getDrawable();
        if (bugreportfragment == null)
        {
            return null;
        } else
        {
            return bugreportfragment.getBitmap();
        }
    }

    static void f(BugReportFragment bugreportfragment)
    {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        bugreportfragment = bugreportfragment.getActivity();
        if (intent.resolveActivity(bugreportfragment.getPackageManager()) != null)
        {
            bugreportfragment.startActivityForResult(intent, 1001);
        }
    }

    static boolean g(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mShouldIncludeScreenshot;
    }

    static ImageView h(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mScreenshotThumbnailCover;
    }

    static CharSequence[] h()
    {
        return PROJECT_NAMES;
    }

    static EditText i(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mStepsToRepro;
    }

    static boolean j(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mDidUserTapEnter;
    }

    static boolean k(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mIsReportSubmittable;
    }

    static Button l(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mSubmitButton;
    }

    static String m(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mRemoteLogRecipient;
    }

    static String n(BugReportFragment bugreportfragment)
    {
        bugreportfragment.mRemoteLogRecipient = null;
        return null;
    }

    static Button o(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mAddRemoteLogButton;
    }

    static android.app.AlertDialog.Builder p(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mPickProjectDialog;
    }

    static String q(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mProjectName;
    }

    static String r(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mImageFile;
    }

    static String[] s(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mLogFiles;
    }

    static EditText t(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mBugDescription;
    }

    static Button u(BugReportFragment bugreportfragment)
    {
        return bugreportfragment.mProjectNameButton;
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    public final void b(String s1)
    {
        if (s1 != null && mAddRemoteLogButton != null)
        {
            mRemoteLogRecipient = s1;
            mAddRemoteLogButton.setText(s1);
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        i1;
        JVM INSTR tableswitch 100 100: default 28
    //                   100 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j1 == -1 && intent != null && ((intent = intent.getStringArrayListExtra("android.speech.extra.RESULTS")) != null && intent.get(0) != null))
        {
            mBugDescription.append((CharSequence)intent.get(0));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mActivity = activity;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040011, viewgroup, false);
        super.mFragmentLayout = layoutinflater;
        mImageFile = getActivity().getIntent().getStringExtra("screenshots");
        mLogFiles = getActivity().getIntent().getStringArrayExtra("logs");
        d(0x7f0d00a5).setOnClickListener(new android.view.View.OnClickListener() {

            final BugReportFragment this$0;

            public final void onClick(View view)
            {
                BugReportFragment.a(BugReportFragment.this);
            }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
        });
        viewgroup = (TextView)d(0x7f0d009f);
        bundle = mActivity;
        viewgroup.setText((new StringBuilder()).append(ScApplicationInfo.b()).append("\n").append(ScApplicationInfo.b(bundle)).toString());
        mClickToSendToSelfTextView = (TextView)d(0x7f0d00a0);
        mClickToSendToSelfTextView.setText("Send this report only to yourself?");
        mClickToSendToSelfTextView.setPaintFlags(mClickToSendToSelfTextView.getPaintFlags() | 8);
        mClickToSendToSelfTextView.setOnClickListener(new android.view.View.OnClickListener() {

            final BugReportFragment this$0;

            public final void onClick(View view)
            {
                if (BugReportFragment.b(BugReportFragment.this))
                {
                    BugReportFragment.a(BugReportFragment.this, false);
                    BugReportFragment.c(BugReportFragment.this).setText("Send this report only to yourself?");
                    return;
                }
                view = new android.app.AlertDialog.Builder(BugReportFragment.d(BugReportFragment.this));
                final EditText input = new EditText(BugReportFragment.d(BugReportFragment.this));
                String s1 = II.a("SHAKE_TO_REPORT_SEND_TO_SELF_EMAIL");
                if (s1 != null)
                {
                    input.setText(s1);
                    input.setSelection(s1.length() - 13);
                } else
                {
                    input.setText("@snapchat.com");
                    input.setSelection(0);
                }
                view.setTitle("Please enter your email").setView(input).setPositiveButton("Okay", s1. new android.content.DialogInterface.OnClickListener() {

                    final _cls4 this$1;
                    final String val$existingSendToSelfEmail;
                    final EditText val$input;

                    public final void onClick(DialogInterface dialoginterface, int i1)
                    {
                        dialoginterface = input.getText().toString();
                        if (dialoginterface.endsWith("@snapchat.com"))
                        {
                            if (!dialoginterface.equals(existingSendToSelfEmail))
                            {
                                II.a("SHAKE_TO_REPORT_SEND_TO_SELF_EMAIL", dialoginterface);
                            }
                            BugReportFragment.c(_fld0).setText(dialoginterface);
                            BugReportFragment.a(_fld0, true);
                            return;
                        } else
                        {
                            AlertDialogUtils.a(BugReportFragment.d(_fld0), "Please enter a valid @snapchat email!!");
                            return;
                        }
                    }

            
            {
                this$1 = final__pcls4;
                input = edittext;
                existingSendToSelfEmail = String.this;
                super();
            }
                }).show();
            }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
        });
        mScreenshotThumbnailCover = (ImageView)d(0x7f0d00a2);
        viewgroup = (ImageView)d(0x7f0d00a1);
        if (!TextUtils.isEmpty(mImageFile))
        {
            bundle = BitmapFactory.decodeFile(mActivity.getFileStreamPath(mImageFile).getAbsolutePath());
            if (bundle != null)
            {
                viewgroup.setImageBitmap(bundle);
            }
        }
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            final BugReportFragment this$0;

            public final void onClick(View view)
            {
                view = new ImageView(BugReportFragment.d(BugReportFragment.this));
                view.setImageBitmap(BugReportFragment.e(BugReportFragment.this));
                (new android.app.AlertDialog.Builder(BugReportFragment.d(BugReportFragment.this))).setTitle("Included Screenshot").setView(view).setPositiveButton("Include", new android.content.DialogInterface.OnClickListener() {

                    final _cls5 this$1;

                    public final void onClick(DialogInterface dialoginterface, int i1)
                    {
                        if (!BugReportFragment.g(_fld0))
                        {
                            BugReportFragment.b(_fld0, true);
                            BugReportFragment.h(_fld0).setVisibility(8);
                        }
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                }).setNegativeButton("Remove", new android.content.DialogInterface.OnClickListener() {

                    final _cls5 this$1;

                    public final void onClick(DialogInterface dialoginterface, int i1)
                    {
                        if (BugReportFragment.g(_fld0))
                        {
                            BugReportFragment.b(_fld0, false);
                            BugReportFragment.h(_fld0).setVisibility(0);
                        }
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                }).setNeutralButton("Choose from Gallery", new android.content.DialogInterface.OnClickListener() {

                    final _cls5 this$1;

                    public final void onClick(DialogInterface dialoginterface, int i1)
                    {
                        BugReportFragment.f(_fld0);
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                }).show();
            }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
        });
        mStepsToRepro = (EditText)d(0x7f0d00a7);
        mStepsToRepro.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final BugReportFragment this$0;

            public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                textview = BugReportFragment.i(BugReportFragment.this).getText();
                int j1 = textview.toString().split("\n").length;
                if (i1 == 5 || keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
                {
                    keyevent = (new StringBuilder("\n")).append(j1 + 1).append(". ").toString();
                    BugReportFragment.i(BugReportFragment.this).setText((new StringBuilder()).append(textview).append(keyevent).toString());
                    BugReportFragment.i(BugReportFragment.this).setSelection(textview.length() + keyevent.length());
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
        });
        mStepsToRepro.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final BugReportFragment this$0;

            public final void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    BugReportFragment.i(BugReportFragment.this).setSelection(BugReportFragment.i(BugReportFragment.this).getText().length());
                }
            }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
        });
        mBugDescription = (EditText)d(0x7f0d00a4);
        mBugDescription.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final BugReportFragment this$0;

            public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                if (i1 == 5 || keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
                {
                    if (BugReportFragment.j(BugReportFragment.this))
                    {
                        BugReportFragment.i(BugReportFragment.this).requestFocus();
                        return true;
                    }
                    BugReportFragment.c(BugReportFragment.this, true);
                    (new Thread(new Runnable() {

                        final _cls8 this$1;

                        public final void run()
                        {
                            PG.a(300L);
                            BugReportFragment.c(_fld0, false);
                        }

            
            {
                this$1 = _cls8.this;
                super();
            }
                    })).start();
                }
                return false;
            }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
        });
        mBugDescription.addTextChangedListener(new TextWatcher() {

            final BugReportFragment this$0;

            public final void afterTextChanged(Editable editable)
            {
                if (editable.length() > 2 && !BugReportFragment.k(BugReportFragment.this))
                {
                    BugReportFragment.d(BugReportFragment.this, true);
                    BugReportFragment.l(BugReportFragment.this).setEnabled(true);
                } else
                if (editable.length() <= 2 && BugReportFragment.k(BugReportFragment.this))
                {
                    BugReportFragment.d(BugReportFragment.this, false);
                    BugReportFragment.l(BugReportFragment.this).setEnabled(false);
                    return;
                }
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
        });
        mAddRemoteLogButton = (Button)d(0x7f0d00a9);
        mAddRemoteLogButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BugReportFragment this$0;
            final int val$containerId = 0x7f0d009d;

            public final void onClick(View view)
            {
                if (BugReportFragment.m(BugReportFragment.this) == null)
                {
                    try
                    {
                        Jo.a(BugReportFragment.d(BugReportFragment.this), view);
                        getActivity().mFragments.a().a(containerId, new BugReportRemoteLogListFragment()).a("BugReportRemoteLogListFragment").a();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        Timber.a("BugReportFragment", view);
                    }
                    return;
                } else
                {
                    BugReportFragment.n(BugReportFragment.this);
                    BugReportFragment.o(BugReportFragment.this).setText("Remote Log");
                    return;
                }
            }


// JavaClassFileOutputException: Invalid index accessing method local variables table of <init>
        });
        mProjectNameButton = (Button)d(0x7f0d00aa);
        mProjectNameButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BugReportFragment this$0;

            public final void onClick(View view)
            {
                BugReportFragment.p(BugReportFragment.this).show();
            }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
        });
        mSubmitButton = (Button)d(0x7f0d00ab);
        mSubmitButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BugReportFragment this$0;

            public final void onClick(View view)
            {
                if (BugReportFragment.q(BugReportFragment.this) == null)
                {
                    BugReportFragment.p(BugReportFragment.this).show();
                    return;
                }
                File file;
                File afile[];
                Object obj;
                if (BugReportFragment.b(BugReportFragment.this))
                {
                    view = BugReportFragment.c(BugReportFragment.this).getText().toString();
                } else
                {
                    view = "null";
                }
                obj = new StringBuilder(BugReportFragment.i(BugReportFragment.this).getText().toString());
                if (BugReportFragment.g(BugReportFragment.this) && !TextUtils.isEmpty(BugReportFragment.r(BugReportFragment.this)))
                {
                    file = BugReportFragment.d(BugReportFragment.this).getFileStreamPath(BugReportFragment.r(BugReportFragment.this));
                } else
                {
                    file = null;
                }
                afile = new File[BugReportFragment.s(BugReportFragment.this).length];
                for (int i1 = 0; i1 < afile.length; i1++)
                {
                    afile[i1] = BugReportFragment.d(BugReportFragment.this).getFileStreamPath(BugReportFragment.s(BugReportFragment.this)[i1]);
                }

                LF lf = new LF();
                String s1 = BugReportFragment.a(BugReportFragment.d(BugReportFragment.this));
                String s2 = BugReportFragment.t(BugReportFragment.this).getText().toString();
                obj = ((StringBuilder) (obj)).toString();
                String s3 = BugReportFragment.m(BugReportFragment.this);
                String s4 = BugReportFragment.q(BugReportFragment.this);
                PG.a(IO.SERIAL_EXECUTOR_FOR_DEBUGGING, new LF._cls1(lf, view, s4, s1, s2, ((String) (obj)), file, afile, s3));
                BugReportFragment.d(BugReportFragment.this).finish();
            }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
        });
        mPickProjectDialog = (new android.app.AlertDialog.Builder(mActivity)).setTitle("Which project?").setItems(PROJECT_NAMES, new android.content.DialogInterface.OnClickListener() {

            final BugReportFragment this$0;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                BugReportFragment.a(BugReportFragment.this, BugReportFragment.h()[i1].toString());
                BugReportFragment.u(BugReportFragment.this).setText(BugReportFragment.h()[i1]);
            }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onDetach()
    {
        super.onDetach();
        mActivity = null;
    }

}
