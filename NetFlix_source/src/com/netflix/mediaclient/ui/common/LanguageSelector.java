// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.Subtitle;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            LanguageSelectorTablet, LanguageSelectorPhone

public abstract class LanguageSelector
{
    public class AudioAdapter extends BaseAdapter
    {

        private final Language language;
        final LanguageSelector this$0;

        public int getCount()
        {
            return language.getAltAudios().length;
        }

        public AudioSource getItem(int i)
        {
            return language.getAltAudios()[i];
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                Log.d("nf_language_selector", (new StringBuilder()).append("Audio create row ").append(i).toString());
                view1 = mController.getLayoutInflater().inflate(0x7f030041, viewgroup, false);
                view1.setTag(new RowHolder(view1));
            }
            view = (RowHolder)view1.getTag();
            viewgroup = getItem(i);
            boolean flag = viewgroup.equals(language.getSelectedAudio());
            ((RowHolder) (view)).name.setText(viewgroup.getLanguageDescription());
            ((RowHolder) (view)).choice.setChecked(flag);
            if (flag)
            {
                Log.d("nf_language_selector", (new StringBuilder()).append("Audio is selected ").append(viewgroup).toString());
                view1.setBackgroundColor(mSelectedRowColor);
                return view1;
            } else
            {
                view1.setBackgroundColor(mRowColor);
                return view1;
            }
        }

        public AudioAdapter(Language language1)
        {
            this$0 = LanguageSelector.this;
            super();
            language = language1;
        }
    }

    private static class LanguageAlertDialog extends AlertDialog
        implements com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag.MdxMiniPlayerDialog
    {

        private LanguageAlertDialog(Context context)
        {
            super(context);
        }

        private LanguageAlertDialog(Context context, int i)
        {
            super(context, i);
        }


        private LanguageAlertDialog(Context context, boolean flag, android.content.DialogInterface.OnCancelListener oncancellistener)
        {
            super(context, flag, oncancellistener);
        }
    }

    public static interface LanguageSelectorCallback
    {

        public abstract void languageChanged(Language language1, boolean flag);

        public abstract void updateDialog(Dialog dialog);

        public abstract void userCanceled();

        public abstract boolean wasPlaying();
    }

    static class RowHolder
    {

        RadioButton choice;
        TextView name;

        RowHolder(View view)
        {
            name = (TextView)view.findViewById(0x7f0700e7);
            choice = (RadioButton)view.findViewById(0x7f0700e8);
        }
    }

    public class SubtitleAdapter extends BaseAdapter
    {

        private final Language language;
        final LanguageSelector this$0;

        public int getCount()
        {
            return language.getUsedSubtitles().size();
        }

        public Subtitle getItem(int i)
        {
            return (Subtitle)language.getUsedSubtitles().get(i);
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            boolean flag = false;
            View view1 = view;
            if (view == null)
            {
                Log.d("nf_language_selector", (new StringBuilder()).append("Subtitle create row ").append(i).toString());
                view1 = mController.getLayoutInflater().inflate(0x7f030041, viewgroup, false);
                view1.setTag(new RowHolder(view1));
            }
            RowHolder rowholder = (RowHolder)view1.getTag();
            Subtitle subtitle = getItem(i);
            view = language.getSelectedSubtitle();
            if (shouldForceFirst(language, i, subtitle))
            {
                Log.d("nf_language_selector", "Previously selected subtitle is not allowed anymore, reset to first on list, reload seleted subtitle");
                view = language.getSelectedSubtitle();
            }
            if (subtitle != null)
            {
                viewgroup = new StringBuilder(subtitle.getLanguageDescription());
                if (subtitle.isCC())
                {
                    Log.d("nf_language_selector", "Add CC");
                    viewgroup.append(' ');
                    viewgroup.append(mController.getText(0x7f0c010c));
                }
                viewgroup = viewgroup.toString();
                flag = subtitle.equals(view);
                view = viewgroup;
            } else
            {
                viewgroup = mController.getString(0x7f0c0105);
                if (view == null)
                {
                    flag = true;
                }
                view = viewgroup;
            }
            rowholder.name.setText(view);
            rowholder.choice.setChecked(flag);
            if (flag)
            {
                Log.d("nf_language_selector", (new StringBuilder()).append("Subtitle is selected ").append(subtitle).toString());
                view1.setBackgroundColor(mSelectedRowColor);
                return view1;
            } else
            {
                view1.setBackgroundColor(mRowColor);
                return view1;
            }
        }

        public SubtitleAdapter(Language language1)
        {
            this$0 = LanguageSelector.this;
            super();
            language = language1;
        }
    }


    protected static final String TAG = "nf_language_selector";
    private Language language;
    protected ListView mAudiosListView;
    protected final LanguageSelectorCallback mCallback;
    protected final NetflixActivity mController;
    protected final int mRowColor;
    protected final int mSelectedRowColor;
    protected ListView mSubtitlesListView;

    LanguageSelector(NetflixActivity netflixactivity, LanguageSelectorCallback languageselectorcallback)
    {
        mController = netflixactivity;
        mCallback = languageselectorcallback;
        mSelectedRowColor = mController.getResources().getColor(0x7f090061);
        mRowColor = mController.getResources().getColor(0x7f090060);
    }

    public static LanguageSelector createInstance(NetflixActivity netflixactivity, boolean flag, LanguageSelectorCallback languageselectorcallback)
    {
        if (flag)
        {
            return new LanguageSelectorTablet(netflixactivity, languageselectorcallback);
        } else
        {
            return new LanguageSelectorPhone(netflixactivity, languageselectorcallback);
        }
    }

    private boolean shouldForceFirst(Language language1, int i, Subtitle subtitle)
    {
        if (i != 0)
        {
            return false;
        }
        Subtitle subtitle1 = language1.getSelectedSubtitle();
        AudioSource audiosource = language1.getSelectedAudio();
        if (audiosource != null && audiosource.isAllowedSubtitle(subtitle1))
        {
            Log.d("nf_language_selector", "Selected subtitle is allowed");
            return false;
        }
        if (Log.isLoggable("nf_language_selector", 3))
        {
            Log.d("nf_language_selector", (new StringBuilder()).append("Selected subtitle is not allowed, set to firsyt subtitle ").append(subtitle).toString());
        }
        language1.setSelectedSubtitle(subtitle);
        return true;
    }

    protected abstract int calculateListViewHeight();

    protected void createAndShowDialog(View view)
    {
label0:
        {
            LanguageAlertDialog languagealertdialog = new LanguageAlertDialog(mController);
            languagealertdialog.setView(view);
            languagealertdialog.setCancelable(true);
            final boolean wasPlaying = mCallback.wasPlaying();
            languagealertdialog.setButton(-1, mController.getString(0x7f0c0071), new android.content.DialogInterface.OnClickListener() {

                final LanguageSelector this$0;
                final boolean val$wasPlaying;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    Log.d("nf_language_selector", "Languages::apply");
                    mCallback.languageChanged(language, wasPlaying);
                }

            
            {
                this$0 = LanguageSelector.this;
                wasPlaying = flag;
                super();
            }
            });
            languagealertdialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final LanguageSelector this$0;

                public void onCancel(DialogInterface dialoginterface)
                {
                    Log.d("nf_language_selector", "Languages::cancel");
                    mCallback.userCanceled();
                }

            
            {
                this$0 = LanguageSelector.this;
                super();
            }
            });
            int i = calculateListViewHeight();
            if (i >= 0)
            {
                Log.d("nf_language_selector", "Sets view height.");
                view = mAudiosListView.getLayoutParams();
                view.height = i;
                view.width = -2;
                mAudiosListView.setLayoutParams(view);
                view = mSubtitlesListView.getLayoutParams();
                view.height = i;
                view.width = -2;
                mSubtitlesListView.setLayoutParams(view);
            } else
            {
                Log.d("nf_language_selector", "Do NOT set view height.");
            }
            Log.d("nf_language_selector", "Languages::open dialog");
            mCallback.updateDialog(languagealertdialog);
            if (languagealertdialog != null)
            {
                mController.displayDialog(languagealertdialog);
                view = languagealertdialog.getButton(-1);
                if (view == null)
                {
                    break label0;
                }
                Log.d("nf_language_selector", "Button found!");
                view.setBackgroundColor(mController.getResources().getColor(0x7f090060));
                view.setTextColor(mController.getResources().getColor(0x7f090038));
                view.setTextAppearance(mController, 0x7f0d00c1);
            }
            return;
        }
        Log.e("nf_language_selector", "Button NOT found!");
    }

    public void display(Language language1)
    {
        this;
        JVM INSTR monitorenter ;
        if (language1 != null) goto _L2; else goto _L1
_L1:
        Log.d("nf_language_selector", "Language data is null!");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        language = Language.restoreLanguage(language1.toJsonString());
        language1 = LayoutInflater.from(mController).inflate(getDialogLayoutId(), null);
        language.setSelectedAudio(language.getCurrentAudioSource());
        language.setSelectedSubtitle(language.getCurrentSubtitle());
        init(language1, language);
        createAndShowDialog(language1);
          goto _L3
        language1;
        throw language1;
        language1;
        Log.handleException("nf_language_selector", language1);
          goto _L3
    }

    protected abstract int getDialogLayoutId();

    protected Language getLanguage()
    {
        return language;
    }

    protected void init(View view, Language language1)
    {
        initLists(view, language1);
    }

    protected void initLists(final View subtitleAdapter, final Language language)
    {
        mAudiosListView = (ListView)subtitleAdapter.findViewById(0x7f0700e5);
        mAudiosListView.setChoiceMode(1);
        final AudioAdapter audioAdapter = new AudioAdapter(language);
        mAudiosListView.setAdapter(audioAdapter);
        mSubtitlesListView = (ListView)subtitleAdapter.findViewById(0x7f0700e6);
        mSubtitlesListView.setChoiceMode(1);
        subtitleAdapter = new SubtitleAdapter(language);
        mSubtitlesListView.setAdapter(subtitleAdapter);
        mAudiosListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final LanguageSelector this$0;
            final AudioAdapter val$audioAdapter;
            final Language val$language;
            final SubtitleAdapter val$subtitleAdapter;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = audioAdapter.getItem(i);
                if (Log.isLoggable("nf_language_selector", 3))
                {
                    Log.d("nf_language_selector", (new StringBuilder()).append("Audio selected on position ").append(i).append(", audio choosen: ").append(adapterview).toString());
                }
                if (language.getSelectedAudio() != adapterview)
                {
                    Log.v("nf_language_selector", "Audio is changed, refresh both views");
                    language.setSelectedAudio(adapterview);
                    audioAdapter.notifyDataSetChanged();
                    subtitleAdapter.notifyDataSetChanged();
                    return;
                } else
                {
                    Log.v("nf_language_selector", "Audio is not changed, do not refresh");
                    return;
                }
            }

            
            {
                this$0 = LanguageSelector.this;
                audioAdapter = audioadapter;
                language = language1;
                subtitleAdapter = subtitleadapter;
                super();
            }
        });
        mSubtitlesListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final LanguageSelector this$0;
            final Language val$language;
            final SubtitleAdapter val$subtitleAdapter;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = subtitleAdapter.getItem(i);
                if (Log.isLoggable("nf_language_selector", 3))
                {
                    Log.d("nf_language_selector", (new StringBuilder()).append("Subtitle selected on position ").append(i).append(", data: ").append(adapterview).toString());
                }
                if (language.getSelectedSubtitle() != adapterview)
                {
                    Log.v("nf_language_selector", "Subtitle is changed, refresh subtitle list view");
                    language.setSelectedSubtitle(adapterview);
                    subtitleAdapter.notifyDataSetChanged();
                    return;
                } else
                {
                    Log.v("nf_language_selector", "Subtitle is not changed, do not refresh");
                    return;
                }
            }

            
            {
                this$0 = LanguageSelector.this;
                subtitleAdapter = subtitleadapter;
                language = language1;
                super();
            }
        });
    }


}
