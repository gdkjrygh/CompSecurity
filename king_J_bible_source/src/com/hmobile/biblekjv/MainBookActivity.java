// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.speech.tts.TextToSpeech;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.UnderlineSpan;
import android.view.Display;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;
import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.common.NotificationCenter;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.BookMarkInfo;
import com.hmobile.model.FavoriteInfo;
import com.hmobile.model.NotesInfo;
import com.hmobile.model.VerseInfo;
import com.hmobile.quickaction.ActionItem;
import com.hmobile.quickaction.QuickActionNotes;
import com.hmobile.tab.TabHostProvider;
import com.hmobile.tab.TabView;
import com.hmobile.tooltip.ToolTip;
import com.hmobile.tooltip.ToolTipRelativeLayout;
import com.hmobile.tooltip.ToolTipView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, ClickPreventableTextView, PickColorActivity, SelectActivity, 
//            SearchResultActivity, TabProvider, HolyBibleApplication, EditNotesActivity

public class MainBookActivity extends BaseActivity
    implements android.view.View.OnClickListener, android.speech.tts.TextToSpeech.OnInitListener, com.hmobile.model.LikeShareInfo.LikeShareDelegate, android.speech.tts.TextToSpeech.OnUtteranceCompletedListener
{
    public class LoadBook extends AsyncTask
    {

        final MainBookActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            try
            {
                Thread.sleep(100L);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                avoid.printStackTrace();
            }
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            super.onPostExecute(void1);
            navigationfade_global = settings.getBoolean("navigation_fade", true);
            if (navigationfade_global)
            {
                llNavigationFade.setVisibility(0);
            }
            (new Thread(new Runnable() {

                final LoadBook this$1;

                public void run()
                {
                    try
                    {
                        Thread.sleep(5000L);
                        handler.sendEmptyMessage(0);
                        return;
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        interruptedexception.printStackTrace();
                    }
                }

            
            {
                this$1 = LoadBook.this;
                super();
            }
            })).start();
            loadData();
        }


        public LoadBook()
        {
            this$0 = MainBookActivity.this;
            super();
        }
    }

    class MyFlingListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final MainBookActivity this$0;

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            if (motionevent == null || motionevent1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            if (Math.abs(motionevent.getY() - motionevent1.getY()) > 250F)
            {
                return false;
            }
            if (motionevent.getX() - motionevent1.getX() <= 120F || Math.abs(f) <= 200F)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            clickNext();
            return false;
            try
            {
                if (motionevent1.getX() - motionevent.getX() > 120F && Math.abs(f) > 200F)
                {
                    clickPrev();
                }
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                return false;
            }
            return false;
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionevent)
        {
            return false;
        }

        MyFlingListener()
        {
            this$0 = MainBookActivity.this;
            super();
        }
    }

    public class ScrolltoPage extends AsyncTask
    {

        final MainBookActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            try
            {
                Thread.sleep(100L);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                avoid.printStackTrace();
            }
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            super.onPostExecute(void1);
            if (isFromBookMark || isFromSelectActivity || isFromSearchActivity || isFromToday || isFromFavorite || isFromWidget || isFromLikeShare || isFromNotes)
            {
                void1 = ll.getChildAt(verse_id - 1);
                view_height = void1.getBottom();
                scroll.smoothScrollTo(0, view_height);
                isFromBookMark = false;
                isFromSelectActivity = false;
                isFromSearchActivity = false;
                isFromFavorite = false;
                isFromToday = false;
                isFromWidget = false;
                isFromLikeShare = false;
            }
        }

        public ScrolltoPage()
        {
            this$0 = MainBookActivity.this;
            super();
        }
    }

    class saveLikeData extends AsyncTask
    {

        final MainBookActivity this$0;

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            avoid = "";
            if (m_verse_number_list.size() <= 0) goto _L2; else goto _L1
_L1:
            Iterator iterator = m_verse_number_list.iterator();
_L6:
            if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
            avoid.substring(0, avoid.length() - 1);
            BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(book_count))).replace(" ", "%20");
            (new StringBuilder(String.valueOf(getString(0x7f070097)))).append(getString(0x7f070099)).toString();
_L2:
            return null;
_L4:
            int i = ((Integer)iterator.next()).intValue();
            avoid = (new StringBuilder(String.valueOf(avoid))).append(String.valueOf(i)).append(",").toString();
            if (true) goto _L6; else goto _L5
_L5:
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            m_verse_number_list = new ArrayList();
            super.onPostExecute(void1);
        }

        saveLikeData()
        {
            this$0 = MainBookActivity.this;
            super();
        }
    }


    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    public static Handler mHandler = new Handler() {

        public void handleMessage(Message message)
        {
        }

    };
    static ArrayList m_selectedVerseList = new ArrayList();
    private String Eventname;
    String Firstbookmark[];
    final int MY_DATA_CHECK_CODE = 4;
    final int PICK_COLOR_ACTVITY = 3;
    final int SEARCH_ACTVITY = 2;
    final int SELECT_ACTVITY = 1;
    private ActionItem actionpopup;
    private int book_count;
    private BookMarkInfo bookmark_info;
    int bookmarkcolor;
    String bookname;
    private Button btnCancelNotes;
    private Button btnPause;
    private Button btnPlay;
    private Button btnSaveNotes;
    private Button btnStop;
    private int chap_count;
    android.content.SharedPreferences.Editor editor;
    private EditText edtLable;
    AutoCompleteTextView edtSearch;
    private EditText edtTitle;
    private GestureDetector flingDetector;
    private android.view.View.OnTouchListener gestureListener;
    private Handler handler;
    private ImageView imgAa;
    private ImageView imgAudio;
    private ImageView imgAudioSetting;
    private ImageView imgBookMark;
    private ImageView imgCancel;
    private ImageView imgCancelSearch;
    private ImageView imgCopy;
    private ImageView imgFacebook;
    private ImageView imgLike;
    private ImageView imgNext;
    private ImageView imgPrevious;
    private ImageView imgSearch;
    private ImageView imgSearchText;
    private ImageView imgShare;
    private ImageView imgTwitter;
    boolean isBookmarkmenuOpen;
    private boolean isFromBookMark;
    private boolean isFromFavorite;
    private boolean isFromLikeShare;
    private boolean isFromNotes;
    private boolean isFromSearchActivity;
    private boolean isFromSelectActivity;
    private boolean isFromToday;
    private boolean isFromWidget;
    boolean isSearchBarOpen;
    boolean isTTsContinue;
    boolean isttsOn;
    private LinearLayout ll;
    private LinearLayout llNavigationFade;
    private LinearLayout llNotes;
    private RelativeLayout llSearch;
    private LinearLayout llShowBookmark;
    private ToolTipView mBlueToolTipView;
    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    private ToolTipRelativeLayout mToolTipFrameLayout;
    ArrayList m_strings;
    ArrayList m_tempstrings;
    private ArrayList m_verse_number_list;
    ArrayList m_verselist;
    boolean navigationfade_global;
    private String note_label;
    HashMap params;
    PhoneStateListener phoneStateListener;
    QuickActionNotes qa;
    private LinearLayout rlBookmarkMenu;
    private RelativeLayout rlmain;
    private ScrollView scroll;
    SharedPreferences settings;
    private TabView tabView;
    Thread thread;
    TextToSpeech tts;
    private int tts_count;
    private TextView txtBookAndChapterName;
    private TextView txtContent;
    private int verse_id;
    private int view_height;

    public MainBookActivity()
    {
        navigationfade_global = false;
        isBookmarkmenuOpen = false;
        isttsOn = false;
        chap_count = 1;
        book_count = 1;
        view_height = 0;
        verse_id = 1;
        tts_count = 0;
        isFromBookMark = false;
        isFromSelectActivity = false;
        isFromSearchActivity = false;
        isFromToday = false;
        isFromFavorite = false;
        isFromWidget = false;
        isFromLikeShare = false;
        isFromNotes = false;
        Firstbookmark = null;
        Eventname = "";
        note_label = "";
        bookmarkcolor = 0xffeaea00;
        m_verse_number_list = new ArrayList();
        isSearchBarOpen = false;
        isTTsContinue = false;
        params = null;
        m_strings = new ArrayList();
        m_tempstrings = new ArrayList();
        handler = new Handler() {

            final MainBookActivity this$0;

            public void handleMessage(Message message)
            {
                if (navigationfade_global)
                {
                    message = AnimationUtils.loadAnimation(MainBookActivity.this, 0x7f040004);
                    message.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                        final _cls1 this$1;

                        public void onAnimationEnd(Animation animation)
                        {
                            llNavigationFade.setVisibility(8);
                            thread = null;
                        }

                        public void onAnimationRepeat(Animation animation)
                        {
                        }

                        public void onAnimationStart(Animation animation)
                        {
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    llNavigationFade.startAnimation(message);
                }
            }


            
            {
                this$0 = MainBookActivity.this;
                super();
            }
        };
        bookname = "";
        phoneStateListener = new PhoneStateListener() {

            final MainBookActivity this$0;

            public void onCallStateChanged(int i, String s)
            {
                if (i != 1) goto _L2; else goto _L1
_L1:
                if (isttsOn && tts != null)
                {
                    tts.stop();
                    tts.shutdown();
                }
_L4:
                super.onCallStateChanged(i, s);
                return;
_L2:
                if (i == 2 && isttsOn)
                {
                    tts.stop();
                    tts.shutdown();
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = MainBookActivity.this;
                super();
            }
        };
    }

    private void SetSpeech(ArrayList arraylist)
    {
        if (tts_count >= arraylist.size())
        {
            tts_count = 0;
        }
        arraylist = (VerseInfo)arraylist.get(tts_count);
        params = new HashMap();
        params.put("utteranceId", "END");
        if (arraylist != null && ((VerseInfo) (arraylist)).Verse.length() > 0)
        {
            float f = settings.getFloat("speech_speed", 1.0F);
            tts.setSpeechRate(f);
            int i = settings.getInt("speech_pitch", 10);
            tts.setPitch(i / 10);
            if (tts_count == 0)
            {
                tts.playSilence(1000L, 1, null);
                tts.speak((new StringBuilder(String.valueOf(bookname))).append(chap_count).toString(), 1, null);
                tts.playSilence(1000L, 1, null);
                tts.speak(((VerseInfo) (arraylist)).Verse, 1, params);
            } else
            {
                tts.speak(((VerseInfo) (arraylist)).Verse, 1, params);
            }
        }
        tts_count = tts_count + 1;
    }

    private void clickNext()
    {
        tts_count = 0;
        chap_count = chap_count + 1;
        Reset();
        navigationfade_global = settings.getBoolean("navigation_fade", true);
        scroll.smoothScrollTo(0, 0);
    }

    private void clickPrev()
    {
        tts_count = 0;
        if (chap_count <= 1) goto _L2; else goto _L1
_L1:
        chap_count = chap_count - 1;
        Reset();
_L4:
        navigationfade_global = settings.getBoolean("navigation_fade", true);
        scroll.smoothScrollTo(0, 0);
        return;
_L2:
        if (book_count > 1)
        {
            book_count = book_count - 1;
            chap_count = BookInfo.getTotalChapterCountBybookid(Utils.ConvertToLong(String.valueOf(book_count)));
            Reset();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void menuDialogDisplayPopup(String s, final long id)
    {
        actionpopup = new ActionItem();
        actionpopup.setTitle(s);
        actionpopup.setOnClickListener(new android.view.View.OnClickListener() {

            final MainBookActivity this$0;
            private final long val$id;

            public void onClick(View view)
            {
                view = new Intent(MainBookActivity.this, com/hmobile/biblekjv/EditNotesActivity);
                view.putExtra("notes_id", id);
                startActivity(view);
                qa.dismiss();
            }

            
            {
                this$0 = MainBookActivity.this;
                id = l;
                super();
            }
        });
    }

    private void stopSpeech()
    {
        if (tts != null)
        {
            Utils.LogInfo("STOP SPEECH");
            tts.stop();
            if (tts_count > 1)
            {
                tts_count = tts_count - 1;
            }
            if (params != null)
            {
                params.clear();
            }
        }
    }

    public void CopyText(String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            ((ClipboardManager)getSystemService("clipboard")).setText(s);
        } else
        {
            ((android.content.ClipboardManager)getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Text is Copied", s));
        }
        s = Toast.makeText(getApplicationContext(), getString(0x7f070061), 1);
        s.setGravity(81, 0, screenHeight / 2);
        s.show();
    }

    public void Failed()
    {
        Reset();
    }

    public void LoadAutoText()
    {
        Object obj = BookInfo.getBookList().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                obj = new ArrayAdapter(this, 0x1090011, m_strings);
                edtSearch.setThreshold(1);
                edtSearch.setAdapter(((android.widget.ListAdapter) (obj)));
                return;
            }
            BookInfo bookinfo = (BookInfo)((Iterator) (obj)).next();
            int j = BookInfo.getTotalChapterCountBybookid(bookinfo.getID());
            int i = 0;
            while (i < j) 
            {
                if (bookinfo.BookName.contains("\n"))
                {
                    String s = bookinfo.BookName.replaceAll("\n", "");
                    m_strings.add((new StringBuilder(String.valueOf(s))).append(" ").append(i + 1).toString());
                    m_tempstrings.add((new StringBuilder(String.valueOf(s))).append("###").append(i + 1).toString());
                } else
                {
                    m_strings.add((new StringBuilder(String.valueOf(bookinfo.BookName))).append(" ").append(i + 1).toString());
                    m_tempstrings.add((new StringBuilder(String.valueOf(bookinfo.BookName))).append("###").append(i + 1).toString());
                }
                i++;
            }
        } while (true);
    }

    public void Reset()
    {
        rlBookmarkMenu.setVisibility(8);
        llShowBookmark.setVisibility(8);
        txtBookAndChapterName.setVisibility(0);
        imgSearch.setVisibility(0);
        isBookmarkmenuOpen = false;
        m_selectedVerseList = new ArrayList();
        m_verse_number_list = new ArrayList();
        loadData();
    }

    public void ShowAlertForAudioSetting()
    {
        final float audio_speed[] = new float[5];
        float[] _tmp = audio_speed;
        audio_speed[0] = 0.5F;
        audio_speed[1] = 0.7F;
        audio_speed[2] = 1.0F;
        audio_speed[3] = 1.5F;
        audio_speed[4] = 2.0F;
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(this);
        final android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        final AlertDialog dialog = new android.app.AlertDialog.Builder(this);
        Object obj = getLayoutInflater().inflate(0x7f030003, null);
        dialog.setView(((View) (obj)));
        dialog.setTitle(getString(0x7f0700ba));
        dialog = dialog.create();
        Spinner spinner = (Spinner)((View) (obj)).findViewById(0x7f0e0025);
        SeekBar seekbar = (SeekBar)((View) (obj)).findViewById(0x7f0e0028);
        obj = (Button)((View) (obj)).findViewById(0x7f0e0029);
        float f = sharedpreferences.getFloat("speech_speed", 1.0F);
        int j = 0;
        int i = 0;
        do
        {
            if (i >= audio_speed.length)
            {
                return;
            }
            if (f == audio_speed[i])
            {
                j = i;
            }
            spinner.setSelection(j);
            seekbar.setProgress(sharedpreferences.getInt("speech_pitch", 10));
            seekbar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {

                final MainBookActivity this$0;
                private final android.content.SharedPreferences.Editor val$editor;

                public void onProgressChanged(SeekBar seekbar1, int k, boolean flag)
                {
                    editor.putInt("speech_pitch", k);
                    editor.commit();
                }

                public void onStartTrackingTouch(SeekBar seekbar1)
                {
                }

                public void onStopTrackingTouch(SeekBar seekbar1)
                {
                }

            
            {
                this$0 = MainBookActivity.this;
                editor = editor1;
                super();
            }
            });
            spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                final MainBookActivity this$0;
                private final float val$audio_speed[];
                private final android.content.SharedPreferences.Editor val$editor;

                public void onItemSelected(AdapterView adapterview, View view, int k, long l)
                {
                    editor.putFloat("speech_speed", audio_speed[k]);
                }

                public void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                this$0 = MainBookActivity.this;
                editor = editor1;
                audio_speed = af;
                super();
            }
            });
            ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final MainBookActivity this$0;
                private final AlertDialog val$dialog;
                private final android.content.SharedPreferences.Editor val$editor;

                public void onClick(View view)
                {
                    editor.commit();
                    dialog.dismiss();
                }

            
            {
                this$0 = MainBookActivity.this;
                editor = editor1;
                dialog = alertdialog;
                super();
            }
            });
            dialog.show();
            i++;
        } while (true);
    }

    public void ShowAlertForFacebook(String s)
    {
        final AlertDialog dialog = new android.app.AlertDialog.Builder(this);
        View view = getLayoutInflater().inflate(0x7f03001e, null);
        dialog.setView(view);
        dialog.setTitle(getString(0x7f07009b));
        dialog = dialog.create();
        final EditText edtText = getWindowManager().getDefaultDisplay();
        int i = edtText.getWidth();
        int j = edtText.getHeight();
        view.setMinimumWidth((int)((double)i / 0.5D));
        view.setMinimumHeight(j / 4);
        edtText = (EditText)view.findViewById(0x7f0e009d);
        edtText.setText(s);
        ((Button)view.findViewById(0x7f0e009e)).setOnClickListener(new android.view.View.OnClickListener() {

            final MainBookActivity this$0;
            private final AlertDialog val$dialog;
            private final EditText val$edtText;

            public void onClick(View view1)
            {
                view1 = edtText.getText().toString();
                if (view1.length() > 1)
                {
                    signInWithFb(bookname, view1, false);
                    Reset();
                    dialog.dismiss();
                }
            }

            
            {
                this$0 = MainBookActivity.this;
                edtText = edittext;
                dialog = alertdialog;
                super();
            }
        });
        dialog.show();
    }

    public void ShowAlertForSetting()
    {
        final String fontStyle[];
        final int f_size[];
        final android.content.SharedPreferences.Editor editor;
        final AlertDialog dialog;
        Spinner spinner;
        Spinner spinner1;
        Object obj;
        String s;
        int i;
        boolean flag;
        int j;
        fontStyle = getResources().getStringArray(0x7f0d0005);
        f_size = new int[4];
        f_size;
        f_size[0] = 12;
        f_size[1] = 14;
        f_size[2] = 18;
        f_size[3] = 22;
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedpreferences.edit();
        dialog = new android.app.AlertDialog.Builder(this);
        obj = getLayoutInflater().inflate(0x7f03002d, null);
        dialog.setView(((View) (obj)));
        dialog.setTitle(getString(0x7f070062));
        dialog = dialog.create();
        spinner = (Spinner)((View) (obj)).findViewById(0x7f0e00d5);
        spinner1 = (Spinner)((View) (obj)).findViewById(0x7f0e00d8);
        obj = (Button)((View) (obj)).findViewById(0x7f0e00d9);
        s = sharedpreferences.getString("font_style", "robotoregular.ttf");
        j = sharedpreferences.getInt("font_size", 18);
        flag = false;
        i = 0;
_L7:
        if (i < f_size.length) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
_L5:
        spinner.setSelection(i);
        flag = false;
        i = 0;
_L10:
        if (i < fontStyle.length) goto _L4; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
_L8:
        spinner1.setSelection(i);
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final MainBookActivity this$0;
            private final android.content.SharedPreferences.Editor val$editor;
            private final int val$f_size[];

            public void onItemSelected(AdapterView adapterview, View view, int k, long l)
            {
                editor.putInt("font_size", f_size[k]);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = MainBookActivity.this;
                editor = editor1;
                f_size = ai;
                super();
            }
        });
        spinner1.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final MainBookActivity this$0;
            private final android.content.SharedPreferences.Editor val$editor;
            private final String val$fontStyle[];

            public void onItemSelected(AdapterView adapterview, View view, int k, long l)
            {
                adapterview = (new StringBuilder(String.valueOf(fontStyle[k].toLowerCase().replace("-", "")))).append(".ttf").toString();
                editor.putString("font_style", adapterview);
                editor.commit();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = MainBookActivity.this;
                fontStyle = as;
                editor = editor1;
                super();
            }
        });
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final MainBookActivity this$0;
            private final AlertDialog val$dialog;
            private final android.content.SharedPreferences.Editor val$editor;

            public void onClick(View view)
            {
                editor.commit();
                dialog.dismiss();
                loadData();
            }

            
            {
                this$0 = MainBookActivity.this;
                editor = editor1;
                dialog = alertdialog;
                super();
            }
        });
        dialog.show();
        return;
_L2:
        if (j != f_size[i]) goto _L6; else goto _L5
_L6:
        i++;
          goto _L7
_L4:
        if (!s.equalsIgnoreCase((new StringBuilder(String.valueOf(fontStyle[i].toLowerCase().replace("-", "")))).append(".ttf").toString())) goto _L9; else goto _L8
_L9:
        i++;
          goto _L10
    }

    public void SuccessFully()
    {
        PostShare(m_verse_number_list, book_count, chap_count);
        Reset();
    }

    public void addBlueToolTipView(String s, View view)
    {
        mBlueToolTipView = mToolTipFrameLayout.showToolTipForView((new ToolTip()).withText(s).withColor(Color.parseColor("#383838")).withAnimationType(101), view);
        mBlueToolTipView.setOnToolTipViewClickedListener(new com.hmobile.tooltip.ToolTipView.OnToolTipViewClickedListener() {

            final MainBookActivity this$0;

            public void onToolTipViewClicked(ToolTipView tooltipview)
            {
            }

            
            {
                this$0 = MainBookActivity.this;
                super();
            }
        });
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        super.dispatchTouchEvent(motionevent);
        return flingDetector.onTouchEvent(motionevent);
    }

    public void hidekeyBoard()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)getSystemService("input_method");
        inputmethodmanager.hideSoftInputFromWindow(edtLable.getWindowToken(), 0);
        inputmethodmanager.hideSoftInputFromWindow(edtTitle.getWindowToken(), 0);
        inputmethodmanager.hideSoftInputFromWindow(edtSearch.getWindowToken(), 0);
    }

    public void loadData()
    {
        ArrayList arraylist;
        Object obj;
        Object obj1;
        int i;
        int k;
        boolean flag;
        ll.removeAllViews();
        arraylist = BookMarkInfo.getBookMarkInfoByPageNumber(book_count, chap_count);
        obj = settings.getString("font_style", "robotoregular.ttf");
        flag = settings.getBoolean("low_light", true);
        k = settings.getInt("font_size", 18);
        obj = Typeface.createFromAsset(getAssets(), ((String) (obj)));
        obj1 = BookInfo.getBookbyPage(book_count, chap_count);
        m_verselist = ((ArrayList) (obj1));
        bookname = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(book_count)));
        txtBookAndChapterName.setText((new StringBuilder(String.valueOf(bookname))).append(" / ").append(chap_count).toString());
        txtContent.setText(bookname);
        txtContent.setTypeface(((Typeface) (obj)));
        txtContent.setTextSize(k);
        if (flag)
        {
            txtContent.setTextColor(0xff000000);
            rlmain.setBackgroundColor(-1);
        } else
        {
            txtContent.setTextColor(-1);
            rlmain.setBackgroundColor(0xff000000);
        }
        ll.addView(txtContent);
        txtContent.setOnClickListener(new android.view.View.OnClickListener() {

            final MainBookActivity this$0;

            public void onClick(View view)
            {
                llNavigationFade.setVisibility(0);
                if (thread == null)
                {
                    startNewThread();
                }
            }

            
            {
                this$0 = MainBookActivity.this;
                super();
            }
        });
        i = 1;
        if (obj1 == null || ((ArrayList) (obj1)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_971;
        }
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        if (isttsOn && isTTsContinue)
        {
            Utils.LogInfo("is tts on after chapter change");
            stopSpeech();
            SetSpeech(m_verselist);
        }
        (new ScrolltoPage()).execute(new Void[0]);
_L7:
        editor.putInt("last_read_chapter", chap_count);
        editor.putInt("last_read_book", book_count);
        editor.commit();
        return;
_L2:
        final VerseInfo s;
        SpannableString spannablestring;
        Object obj2;
        s = (VerseInfo)((Iterator) (obj1)).next();
        final ClickPreventableTextView txtVerse = new ClickPreventableTextView(this);
        txtVerse.setTag(Integer.valueOf(0));
        txtVerse.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        txtVerse.setPadding(0, 5, 0, 5);
        obj2 = (new StringBuilder(String.valueOf(chap_count))).append(":").append(i).append(" ").toString();
        txtVerse.setText((new StringBuilder(String.valueOf(obj2))).append(s.Verse).toString());
        txtVerse.setTypeface(((Typeface) (obj)));
        txtVerse.setTextSize(k);
        txtVerse.setLineSpacing(1.0F, 1.0F);
        final NotesInfo ninfo;
        if (flag)
        {
            txtVerse.setTextColor(0xff000000);
        } else
        {
            txtVerse.setTextColor(-1);
        }
        spannablestring = new SpannableString((new StringBuilder(String.valueOf(obj2))).append(s.Verse).toString());
        ninfo = NotesInfo.isVerseNoted(s.BookId, s.ChapterNumber, s.VerseNumber);
        if (ninfo != null)
        {
            Object obj3 = BitmapFactory.decodeResource(getResources(), 0x7f02007f);
            obj3 = new ImageSpan(getApplicationContext(), ((android.graphics.Bitmap) (obj3)));
            ninfo = new ClickableSpan() {

                final MainBookActivity this$0;
                private final NotesInfo val$ninfo;

                public void onClick(View view)
                {
                    if (view instanceof ClickPreventableTextView)
                    {
                        if (((ClickPreventableTextView)view).ignoreSpannableClick())
                        {
                            return;
                        }
                        ((ClickPreventableTextView)view).preventNextClick();
                    }
                    menuDialogDisplayPopup((new StringBuilder(String.valueOf(ninfo.Title))).append(" : ").append(ninfo.Lable).toString(), ninfo.getID());
                    qa = new QuickActionNotes(view);
                    qa.addActionItem(actionpopup);
                    qa.show();
                }

            
            {
                this$0 = MainBookActivity.this;
                ninfo = notesinfo;
                super();
            }
            };
            spannablestring.setSpan(obj3, (new StringBuilder(String.valueOf(obj2))).append(s.Verse).toString().length() - 1, (new StringBuilder(String.valueOf(obj2))).append(s.Verse).toString().length(), 0);
            spannablestring.setSpan(ninfo, (new StringBuilder(String.valueOf(obj2))).append(s.Verse).toString().length() - 1, (new StringBuilder(String.valueOf(obj2))).append(s.Verse).toString().length(), 0);
        }
        if (arraylist == null || arraylist.size() <= 0) goto _L4; else goto _L3
_L3:
        obj2 = arraylist.iterator();
_L6:
        if (((Iterator) (obj2)).hasNext())
        {
            break MISSING_BLOCK_LABEL_828;
        }
_L4:
        txtVerse.setText(spannablestring);
        txtVerse.setMovementMethod(LinkMovementMethod.getInstance());
        txtVerse.setOnClickListener(new android.view.View.OnClickListener() {

            final MainBookActivity this$0;
            private final VerseInfo val$s;
            private final ClickPreventableTextView val$txtVerse;

            public void onClick(View view)
            {
                int i1 = ((Integer)view.getTag()).intValue();
                verse_id = s.VerseNumber;
                if (i1 == 0)
                {
                    underlineText(txtVerse);
                    m_verse_number_list.add(Integer.valueOf(s.VerseNumber));
                    view.setTag(Integer.valueOf(1));
                } else
                {
                    removeunderline(txtVerse);
                    m_verse_number_list.remove(Integer.valueOf(s.VerseNumber));
                    view.setTag(Integer.valueOf(0));
                }
                if (m_verse_number_list.size() > 0)
                {
                    navigationfade_global = false;
                } else
                {
                    navigationfade_global = settings.getBoolean("navigation_fade", true);
                }
                setoncontentClick();
            }

            
            {
                this$0 = MainBookActivity.this;
                s = verseinfo;
                txtVerse = clickpreventabletextview;
                super();
            }
        });
        ll.addView(txtVerse);
        i++;
          goto _L5
        BookMarkInfo bookmarkinfo = (BookMarkInfo)((Iterator) (obj2)).next();
        if (bookmarkinfo.isBackColor)
        {
            String as[] = bookmarkinfo.Verse.split("###");
            int l = as.length;
            int j = 0;
            while (j < l) 
            {
                String s1 = as[j];
                if ((new StringBuilder(String.valueOf(chap_count))).append(":").append(i).append(" ").append(s.Verse).toString().equalsIgnoreCase(s1))
                {
                    spannablestring.setSpan(new BackgroundColorSpan(bookmarkinfo.backColor), 0, spannablestring.length(), 18);
                }
                j++;
            }
        }
          goto _L6
        book_count = book_count + 1;
        chap_count = 1;
        loadData();
          goto _L7
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        i;
        JVM INSTR tableswitch 1 4: default 32
    //                   1 40
    //                   2 91
    //                   3 169
    //                   4 142;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        super.onActivityResult(i, j, intent);
_L7:
        return;
_L2:
        if (j == -1)
        {
            book_count = intent.getIntExtra("book_id", 1);
            chap_count = intent.getIntExtra("chap_id", 1);
            verse_id = intent.getIntExtra("verse_id", 1);
            isFromSelectActivity = true;
            loadData();
            return;
        }
_L3:
        if (j == -1)
        {
            book_count = intent.getIntExtra("book_id", 1);
            chap_count = intent.getIntExtra("chap_id", 1);
            verse_id = intent.getIntExtra("verse_id", 1);
            isFromSearchActivity = true;
            loadData();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (j != 1)
        {
            intent = new Intent();
            intent.setAction("android.speech.tts.engine.INSTALL_TTS_DATA");
            startActivity(intent);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (j == -1 && Eventname.equalsIgnoreCase("BOOKMARKCOLOR"))
        {
            bookmarkcolor = intent.getIntExtra("color", Color.parseColor("#00000000"));
            BookMarkInfo.SaveBookMark(book_count, chap_count, "", "", BookMarkInfo.getStringFromArray(m_selectedVerseList), verse_id, true, bookmarkcolor);
            sendAnalyticsevent("Click", "Button", (new StringBuilder("Bookmaked ")).append(book_count).append(" ").append(chap_count).append(" : ").append(verse_id).toString());
            Reset();
            hidekeyBoard();
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onBackPressed()
    {
        if (isttsOn)
        {
            isttsOn = false;
            imgAudio.setBackgroundResource(0x7f020074);
            stopSpeech();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onClick(View view)
    {
        if (view != imgNext) goto _L2; else goto _L1
_L1:
        isTTsContinue = true;
        clickNext();
_L4:
        return;
_L2:
        if (view == imgPrevious)
        {
            isTTsContinue = true;
            clickPrev();
            return;
        }
        if (view == imgCancel)
        {
            Reset();
            hidekeyBoard();
            return;
        }
        if (view == imgBookMark)
        {
            startActivityForResult(new Intent(this, com/hmobile/biblekjv/PickColorActivity), 3);
            Eventname = "BOOKMARKCOLOR";
            return;
        }
        if (view == btnSaveNotes)
        {
            view = edtLable.getText().toString();
            String s = edtTitle.getText().toString();
            hidekeyBoard();
            if (view.length() < 1)
            {
                showToast(getString(0x7f0700c1));
                return;
            }
            if (s.length() < 1)
            {
                showToast(getString(0x7f0700c2));
                return;
            } else
            {
                hidekeyBoard();
                NotesInfo.SaveNotes(book_count, chap_count, view, s, NotesInfo.getStringFromArray(m_selectedVerseList), verse_id);
                llShowBookmark.setVisibility(8);
                sendAnalyticsevent("Click", "Button", (new StringBuilder("Save Notes ")).append(book_count).append(" ").append(chap_count).append(" : ").append(verse_id).toString());
                edtTitle.setText("");
                edtLable.setText("");
                Reset();
                return;
            }
        }
        if (view == llNotes)
        {
            if (m_selectedVerseList.size() > 1)
            {
                showToast(getString(0x7f0700c3));
                return;
            } else
            {
                llShowBookmark.setVisibility(0);
                return;
            }
        }
        if (view == btnCancelNotes)
        {
            edtTitle.setText("");
            edtLable.setText("");
            Reset();
            hidekeyBoard();
            return;
        }
        if (view == imgCopy)
        {
            view = new StringBuilder();
            if (m_selectedVerseList.size() > 0)
            {
                Iterator iterator = m_selectedVerseList.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        view.append(" ");
                        view.append(BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(book_count))));
                        CopyText(view.toString());
                        Reset();
                        return;
                    }
                    view.append((String)iterator.next());
                } while (true);
            } else
            {
                showToast(getString(0x7f0700c4));
                return;
            }
        }
        if (view == imgFacebook)
        {
            view = new StringBuilder();
            if (m_selectedVerseList.size() > 0)
            {
                Object obj = m_selectedVerseList.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        obj = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(book_count)));
                        getResources().getString(0x7f070084);
                        ShowAlertForFacebook((new StringBuilder(String.valueOf(obj))).append(" ").append(view.toString()).append("\n").toString());
                        return;
                    }
                    view.append((String)((Iterator) (obj)).next());
                } while (true);
            } else
            {
                showToast(getString(0x7f0700c5));
                return;
            }
        }
        if (view == imgTwitter)
        {
            view = new StringBuilder();
            if (m_selectedVerseList.size() > 0)
            {
                Object obj1 = m_selectedVerseList.iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        obj1 = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(book_count)));
                        if ((new StringBuilder(String.valueOf(view.toString()))).append(" ").append(((String) (obj1))).toString().length() > 140)
                        {
                            showAlertForTwitterShare(view.toString(), this);
                            return;
                        } else
                        {
                            signInwithTwitter(view.toString(), this);
                            return;
                        }
                    }
                    view.append((String)((Iterator) (obj1)).next());
                } while (true);
            } else
            {
                showToast(getString(0x7f0700c5));
                return;
            }
        }
        if (view == imgShare)
        {
            view = new StringBuilder();
            if (m_selectedVerseList.size() > 0)
            {
                Object obj2 = m_selectedVerseList.iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        obj2 = BookInfo.getBookNameByBookid(Utils.ConvertToLong(String.valueOf(book_count)));
                        String s1 = getResources().getString(0x7f070084);
                        Intent intent1 = new Intent("android.intent.action.SEND");
                        intent1.putExtra("android.intent.extra.SUBJECT", getString(0x7f070086));
                        intent1.setType("text/plain");
                        intent1.putExtra("android.intent.extra.TEXT", (new StringBuilder(String.valueOf(obj2))).append(" ").append(view.toString()).append("\n").append(s1).toString());
                        startActivity(intent1);
                        PostShare(m_verse_number_list, book_count, chap_count);
                        Reset();
                        sendAnalyticsevent("Click", "Button", (new StringBuilder("Shared ")).append(book_count).append(" ").append(chap_count).append(" : ").append(verse_id).toString());
                        return;
                    }
                    view.append((String)((Iterator) (obj2)).next());
                } while (true);
            } else
            {
                showToast(getString(0x7f0700c5));
                return;
            }
        }
        if (view == txtBookAndChapterName)
        {
            view = new Intent(this, com/hmobile/biblekjv/SelectActivity);
            view.putExtra("book_id", book_count);
            view.putExtra("chap_id", chap_count);
            view.putExtra("verse_id", verse_id);
            view.setFlags(0x4000000);
            startActivity(view);
            finish();
            return;
        }
        if (view == imgSearch)
        {
            llSearch.setVisibility(0);
            isSearchBarOpen = true;
            txtBookAndChapterName.setVisibility(8);
            imgSearch.setVisibility(8);
            hideActionMenuIcon();
            return;
        }
        if (view == imgCancelSearch)
        {
            llSearch.setVisibility(8);
            isSearchBarOpen = false;
            txtBookAndChapterName.setVisibility(0);
            imgSearch.setVisibility(0);
            showActionMenuIcon();
            view = (InputMethodManager)getSystemService("input_method");
            view.hideSoftInputFromWindow(edtLable.getWindowToken(), 0);
            view.hideSoftInputFromWindow(edtTitle.getWindowToken(), 0);
            view.hideSoftInputFromWindow(edtSearch.getWindowToken(), 0);
            return;
        }
        if (view != imgSearchText)
        {
            break; /* Loop/switch isn't completed */
        }
        hidekeyBoard();
        view = edtSearch.getText().toString();
        if (view.length() > 1)
        {
            Intent intent = new Intent(this, com/hmobile/biblekjv/SearchResultActivity);
            intent.putExtra("search_word", view);
            startActivityForResult(intent, 2);
            llSearch.setVisibility(8);
            isSearchBarOpen = false;
            txtBookAndChapterName.setVisibility(0);
            imgSearch.setVisibility(0);
            showActionMenuIcon();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view != imgAudio)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (isttsOn)
        {
            Utils.LogInfo("TSS STOP CALL");
            isttsOn = false;
            imgAudio.setImageResource(0x7f020074);
            stopSpeech();
            return;
        }
        boolean flag1 = true;
        Utils.LogInfo((new StringBuilder("VERSE NUMBERS ")).append(m_verse_number_list.toString()).toString());
        boolean flag = flag1;
        if (m_verse_number_list.size() > 0)
        {
            if (m_verse_number_list.size() == 1)
            {
                tts_count = ((Integer)m_verse_number_list.get(0)).intValue() - 1;
                Reset();
                flag = flag1;
            } else
            {
                flag = false;
                view = Toast.makeText(this, getString(0x7f0700bb), 1);
                view.setGravity(81, 0, screenHeight / 2);
                view.show();
            }
        }
        if (flag)
        {
            try
            {
                view = new Intent();
                view.setAction("android.speech.tts.engine.CHECK_TTS_DATA");
                startActivityForResult(view, 4);
                imgAudio.setImageResource(0x7f020075);
                NotificationCenter.Instance().addObserver(this, "stoptts", "stopSpeech", null);
                SetSpeech(m_verselist);
                isttsOn = true;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (view == btnPlay) goto _L4; else goto _L5
_L5:
        if (view == btnPause)
        {
            tts.stop();
            return;
        }
        if (view != btnStop)
        {
            if (view == imgLike)
            {
                saveFavorite();
                return;
            }
            if (view == imgAa)
            {
                ShowAlertForSetting();
                return;
            }
            if (view == imgAudioSetting)
            {
                ShowAlertForAudioSetting();
                return;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        tabView = (new TabProvider(this)).getTabHost("main");
        tabView.setCurrentView(0x7f030004);
        setContentView(tabView.render(2));
        mGaInstance = GoogleAnalytics.getInstance(this);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        bundle = (TelephonyManager)getSystemService("phone");
        if (bundle != null)
        {
            bundle.listen(phoneStateListener, 32);
        }
        mGaTracker.sendView("/MainBookReadingActivity");
        addQuickActionMenu();
        menuDialogDisplay();
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("isFromBookMark"))
            {
                isFromBookMark = bundle.getBoolean("isFromBookMark");
                bookmark_info = BookMarkInfo.getBookMarkInfoById(bundle.getLong("BookMarkId"));
                verse_id = bookmark_info.verse_id;
                Firstbookmark = bookmark_info.Verse.split("###");
            }
            if (bundle.containsKey("Book_id"))
            {
                BookInfo bookinfo = BookInfo.getBookInfoByBookid(bundle.getLong("Book_id"));
                if (bookinfo != null)
                {
                    book_count = (int)bookinfo.getID();
                    chap_count = 1;
                }
            }
            if (bundle.containsKey("isFromToday"))
            {
                isFromToday = bundle.getBoolean("isFromToday");
            }
            if (bundle.containsKey("isFromFavorite"))
            {
                isFromFavorite = bundle.getBoolean("isFromFavorite");
                book_count = bundle.getInt("book_id");
                chap_count = bundle.getInt("chap_id");
                verse_id = bundle.getInt("verse_id");
            }
            if (bundle.containsKey("isFromNotes"))
            {
                isFromNotes = bundle.getBoolean("isFromNotes");
                if (bundle.containsKey("note_label"))
                {
                    note_label = bundle.getString("note_label", "");
                }
            }
            if (bundle.containsKey("book_id"))
            {
                book_count = bundle.getInt("book_id", 1);
            }
            if (bundle.containsKey("chap_id"))
            {
                chap_count = bundle.getInt("chap_id", 1);
            }
            if (bundle.containsKey("verse_id"))
            {
                verse_id = bundle.getInt("verse_id", 1);
            }
            if (bundle.containsKey("select_flag"))
            {
                isFromSelectActivity = bundle.getBoolean("select_flag", false);
            }
            if (bundle.containsKey("search_flag"))
            {
                isFromSearchActivity = bundle.getBoolean("search_flag");
            }
            if (bundle.containsKey("isFromWidget"))
            {
                isFromWidget = bundle.getBoolean("isFromWidget");
            }
            if (bundle.containsKey("isFromLikeShare"))
            {
                isFromLikeShare = bundle.getBoolean("isFromLikeShare");
            }
        }
        Utils.LogInfo((new StringBuilder("Main book activity book chapter verse **** ")).append(book_count).append(" ").append(chap_count).append(" ").append(verse_id).toString());
        flingDetector = new GestureDetector(new MyFlingListener());
        gestureListener = new android.view.View.OnTouchListener() {

            final MainBookActivity this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                return flingDetector.onTouchEvent(motionevent);
            }

            
            {
                this$0 = MainBookActivity.this;
                super();
            }
        };
        if (isFromBookMark)
        {
            book_count = bookmark_info.book_id;
            chap_count = bookmark_info.chap_number;
        }
        if (!HolyBibleApplication.isPurchased)
        {
            addAdView();
        } else
        {
            hideAdView();
        }
        settings = PreferenceManager.getDefaultSharedPreferences(this);
        editor = settings.edit();
        txtContent = (TextView)findViewById(0x7f0e0050);
        txtBookAndChapterName = (TextView)findViewById(0x7f0e002c);
        rlmain = (RelativeLayout)findViewById(0x7f0e004d);
        llNavigationFade = (LinearLayout)findViewById(0x7f0e0052);
        rlBookmarkMenu = (LinearLayout)findViewById(0x7f0e002f);
        llShowBookmark = (LinearLayout)findViewById(0x7f0e0047);
        scroll = (ScrollView)findViewById(0x7f0e004e);
        ll = (LinearLayout)findViewById(0x7f0e004f);
        llNotes = (LinearLayout)findViewById(0x7f0e0034);
        llSearch = (RelativeLayout)findViewById(0x7f0e0040);
        imgNext = (ImageView)findViewById(0x7f0e005a);
        btnSaveNotes = (Button)findViewById(0x7f0e004b);
        btnCancelNotes = (Button)findViewById(0x7f0e004c);
        imgPrevious = (ImageView)findViewById(0x7f0e0056);
        imgCancel = (ImageView)findViewById(0x7f0e0030);
        imgAudio = (ImageView)findViewById(0x7f0e0058);
        imgAa = (ImageView)findViewById(0x7f0e0057);
        imgLike = (ImageView)findViewById(0x7f0e0037);
        imgBookMark = (ImageView)findViewById(0x7f0e0033);
        imgCopy = (ImageView)findViewById(0x7f0e0039);
        imgFacebook = (ImageView)findViewById(0x7f0e003b);
        imgTwitter = (ImageView)findViewById(0x7f0e003d);
        imgShare = (ImageView)findViewById(0x7f0e003f);
        imgSearch = (ImageView)findViewById(0x7f0e002d);
        imgSearchText = (ImageView)findViewById(0x7f0e0044);
        imgCancelSearch = (ImageView)findViewById(0x7f0e0041);
        imgAudioSetting = (ImageView)findViewById(0x7f0e0059);
        mToolTipFrameLayout = (ToolTipRelativeLayout)findViewById(0x7f0e005c);
        edtLable = (EditText)findViewById(0x7f0e0049);
        edtTitle = (EditText)findViewById(0x7f0e0048);
        edtSearch = (AutoCompleteTextView)findViewById(0x7f0e0045);
        btnPlay = (Button)findViewById(0x7f0e0053);
        btnPause = (Button)findViewById(0x7f0e0055);
        btnStop = (Button)findViewById(0x7f0e0054);
        btnPlay.setOnClickListener(this);
        btnPause.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        imgLike.setOnClickListener(this);
        imgNext.setOnClickListener(this);
        imgAudio.setOnClickListener(this);
        imgAa.setOnClickListener(this);
        imgPrevious.setOnClickListener(this);
        imgCancel.setOnClickListener(this);
        imgCopy.setOnClickListener(this);
        imgBookMark.setOnClickListener(this);
        imgFacebook.setOnClickListener(this);
        imgTwitter.setOnClickListener(this);
        imgShare.setOnClickListener(this);
        imgSearch.setOnClickListener(this);
        imgSearchText.setOnClickListener(this);
        imgCancelSearch.setOnClickListener(this);
        btnSaveNotes.setOnClickListener(this);
        btnCancelNotes.setOnClickListener(this);
        txtBookAndChapterName.setOnClickListener(this);
        imgAudioSetting.setOnClickListener(this);
        llNotes.setOnClickListener(this);
        edtSearch.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final MainBookActivity this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 3)
                {
                    hidekeyBoard();
                    textview = edtSearch.getText().toString();
                    if (textview.length() > 1)
                    {
                        keyevent = new Intent(MainBookActivity.this, com/hmobile/biblekjv/SearchResultActivity);
                        keyevent.putExtra("search_word", textview);
                        startActivityForResult(keyevent, 2);
                        llSearch.setVisibility(8);
                        isSearchBarOpen = false;
                        txtBookAndChapterName.setVisibility(0);
                        imgSearch.setVisibility(0);
                    }
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = MainBookActivity.this;
                super();
            }
        });
        edtSearch.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final MainBookActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = ((AdapterView) (adapterview.getItemAtPosition(i)));
                i = m_strings.indexOf(adapterview);
                adapterview = ((String)m_tempstrings.get(i)).split("###");
                view = new Intent(MainBookActivity.this, com/hmobile/biblekjv/SearchResultActivity);
                view.putExtra("BookName", adapterview[0]);
                view.putExtra("ChapCount", adapterview[1]);
                view.putExtra("isFromAuto", true);
                startActivityForResult(view, 2);
                llSearch.setVisibility(8);
                isSearchBarOpen = false;
                txtBookAndChapterName.setVisibility(0);
                imgSearch.setVisibility(0);
            }

            
            {
                this$0 = MainBookActivity.this;
                super();
            }
        });
        LoadAutoText();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (tts != null)
        {
            tts.stop();
            tts.shutdown();
        }
    }

    public void onInit(int i)
    {
        if (i == 0)
        {
            if (tts.isLanguageAvailable(Locale.US) == 0)
            {
                tts.setLanguage(Locale.US);
            }
        } else
        if (i == -1)
        {
            Toast.makeText(this, "Sorry! Text To Speech failed...", 1).show();
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        Reset();
        hidekeyBoard();
        (new LoadBook()).execute(new Void[0]);
        tts = new TextToSpeech(this, this);
        tts.setOnUtteranceCompletedListener(this);
    }

    public void onUtteranceCompleted(String s)
    {
        Utils.LogInfo((new StringBuilder("TTS NUMBER : onUtteranceCompleted ............")).append(tts_count).toString());
        if (tts_count >= m_verselist.size())
        {
            runOnUiThread(new Runnable() {

                final MainBookActivity this$0;

                public void run()
                {
                    isTTsContinue = true;
                    clickNext();
                }

            
            {
                this$0 = MainBookActivity.this;
                super();
            }
            });
        } else
        if (isttsOn)
        {
            SetSpeech(m_verselist);
            return;
        }
    }

    public void openbookmarkmenu()
    {
        isBookmarkmenuOpen = true;
        txtBookAndChapterName.setVisibility(8);
        imgSearch.setVisibility(8);
        rlBookmarkMenu.setVisibility(0);
        if (isSearchBarOpen)
        {
            llSearch.setVisibility(8);
            isSearchBarOpen = false;
        }
    }

    public void removeunderline(TextView textview)
    {
        try
        {
            SpannableString spannablestring = new SpannableString(textview.getText().toString());
            spannablestring.setSpan(new SpannableString(spannablestring), 0, spannablestring.length(), 0);
            m_selectedVerseList.remove(spannablestring.toString());
            textview.setText(spannablestring);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            return;
        }
    }

    public void saveFavorite()
    {
        if (m_verse_number_list != null && m_verse_number_list.size() > 0)
        {
            Object obj = m_verse_number_list.iterator();
            do
            {
                VerseInfo verseinfo;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        obj = Toast.makeText(getApplicationContext(), getString(0x7f070060), 1);
                        ((Toast) (obj)).setGravity(81, 0, screenHeight / 2);
                        ((Toast) (obj)).show();
                        return;
                    }
                    verseinfo = VerseInfo.getVerseInfoByVerseNumber(((Integer)((Iterator) (obj)).next()).intValue(), m_verselist);
                } while (verseinfo == null || FavoriteInfo.isExist(verseinfo));
                try
                {
                    FavoriteInfo favoriteinfo = (FavoriteInfo)HolyBibleApplication.LocalConnection().newEntity(com/hmobile/model/FavoriteInfo);
                    favoriteinfo.BookId = verseinfo.BookId;
                    favoriteinfo.ChapterNumber = verseinfo.ChapterNumber;
                    favoriteinfo.Verse = verseinfo.Verse;
                    favoriteinfo.VerseNumber = verseinfo.VerseNumber;
                    favoriteinfo.save();
                }
                catch (ActiveRecordException activerecordexception)
                {
                    activerecordexception.printStackTrace();
                }
            } while (true);
        } else
        {
            Toast.makeText(getApplicationContext(), "Verse is not selected.", 1).show();
            return;
        }
    }

    public void setoncontentClick()
    {
        llNavigationFade.setVisibility(0);
        if (!isBookmarkmenuOpen)
        {
            openbookmarkmenu();
        }
        startNewThread();
    }

    public void startNewThread()
    {
        thread = new Thread(new Runnable() {

            final MainBookActivity this$0;

            public void run()
            {
                try
                {
                    Thread.sleep(5000L);
                    handler.sendEmptyMessage(0);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    interruptedexception.printStackTrace();
                }
            }

            
            {
                this$0 = MainBookActivity.this;
                super();
            }
        });
        thread.start();
    }

    public void underlineText(TextView textview)
    {
        try
        {
            SpannableString spannablestring = new SpannableString(textview.getText().toString());
            spannablestring.setSpan(new UnderlineSpan(), 0, spannablestring.length(), 0);
            m_selectedVerseList.add(spannablestring.toString());
            textview.setText(spannablestring);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            return;
        }
    }



































}
