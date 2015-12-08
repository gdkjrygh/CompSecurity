// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.ui.core.CaptionStyle;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;
import com.phunware.nbc.sochi.caption.view.TextViewWithLabel;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            StyleTitleDialogFragment, CaptionFontListFragment, CaptionTextSizeListFragment, CaptionTextColorListFragment, 
//            CaptionBackgroundColorListFragment, CaptionBackgroundOpacityListFragment, CaptionTextOpacityListFragment, CaptionFontEdgeListFragment

public class CaptionNewStyleFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener
{

    private static final String ARG_CREATE_NEW = "create_new";
    private static final String ARG_DEFAULT_TITLE = "default_title";
    private static final String ARG_STYLE_ID = "style_id";
    private static final String STATE_STYLE_ID = "style_id";
    private static final String TAG_BACKGROUND_COLOR_LIST_FRAG = "background_color_list_frag";
    private static final String TAG_DESCRIPTION_FRAG = "description_frag";
    private static final String TAG_FONTEDGE_FRAG = "font_edge_frag";
    private static final String TAG_FONT_LIST_FRAG = "font_list_frag";
    private static final String TAG_FRAG_BACKGROUND_OPACITY = "frag_background_opacity";
    private static final String TAG_FRAG_TEXT_OPACITY = "frag_text_opacity";
    private static final String TAG_TEXT_COLOR_LIST_FRAG = "text_color_list_frag";
    private static final String TAG_TEXT_SIZE_LIST_FRAG = "text_size_list_frag";
    private static boolean mIsTelemundo = "nbclive".equals("telemundo");
    private CaptionPreviewHelper captionPreviewHelper;
    private CaptionStyle captionStyle;
    private String mBackgroundColor;
    private int mBackgroundOpacity;
    private View mIncludeCCPreview;
    private long mStyleId;
    private String mStyleTitle;
    private String mTextColor;
    private String mTextFont;
    private String mTextFontEdge;
    private int mTextOpacity;
    private int mTextSize;
    private TextView mTextViewCaptionPreview;
    private TextViewWithLabel mTextViewWithLabelAdvTextOpacity;
    private TextViewWithLabel mTextViewWithLabelBackgroundColor;
    private TextViewWithLabel mTextViewWithLabelBackgroundOpacity;
    private TextViewWithLabel mTextViewWithLabelDescription;
    private TextViewWithLabel mTextViewWithLabelTextColor;
    private TextViewWithLabel mTextViewWithLabelTextFont;
    private TextViewWithLabel mTextViewWithLabelTextFontEdge;
    private TextViewWithLabel mTextViewWithLabelTextSize;

    public CaptionNewStyleFragment()
    {
        mStyleId = -100L;
    }

    public static CaptionNewStyleFragment getInstance(int i)
    {
        CaptionNewStyleFragment captionnewstylefragment = new CaptionNewStyleFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("create_new", true);
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (mIsTelemundo)
        {
            s = "Estilo";
        } else
        {
            s = "Style ";
        }
        bundle.putString("default_title", stringbuilder.append(s).append(i + 1).toString());
        captionnewstylefragment.setArguments(bundle);
        return captionnewstylefragment;
    }

    public static CaptionNewStyleFragment getInstance(long l)
    {
        CaptionNewStyleFragment captionnewstylefragment = new CaptionNewStyleFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("create_new", false);
        bundle.putLong("style_id", l);
        captionnewstylefragment.setArguments(bundle);
        return captionnewstylefragment;
    }

    private String getSizeName(int i)
    {
        switch (i)
        {
        default:
            return getString(0x7f0700a4);

        case 1: // '\001'
            return getString(0x7f0700a3);

        case 2: // '\002'
            return getString(0x7f0700a2);
        }
    }

    public void onClick(View view)
    {
        int i = view.getId();
        if (i == 0x7f0f008e)
        {
            StyleTitleDialogFragment.getInstance(this, mStyleTitle).show(getFragmentManager(), "description_frag");
        } else
        {
            if (i == 0x7f0f008f)
            {
                getFragmentManager().beginTransaction().setCustomAnimations(0x7f05000c, 0x7f05000d, 0x7f05000c, 0x7f05000d).replace(0x7f0f006a, CaptionFontListFragment.getInstance(mStyleId, mTextFont), "font_list_frag").addToBackStack(null).commit();
                return;
            }
            if (i == 0x7f0f0090)
            {
                getFragmentManager().beginTransaction().setCustomAnimations(0x7f05000c, 0x7f05000d, 0x7f05000c, 0x7f05000d).replace(0x7f0f006a, CaptionTextSizeListFragment.getInstance(mStyleId, mTextSize), "text_size_list_frag").addToBackStack(null).commit();
                return;
            }
            if (i == 0x7f0f0091)
            {
                getFragmentManager().beginTransaction().setCustomAnimations(0x7f05000c, 0x7f05000d, 0x7f05000c, 0x7f05000d).replace(0x7f0f006a, CaptionTextColorListFragment.getInstance(mStyleId, mTextColor), "text_color_list_frag").addToBackStack(null).commit();
                return;
            }
            if (i == 0x7f0f0093)
            {
                getFragmentManager().beginTransaction().setCustomAnimations(0x7f05000c, 0x7f05000d, 0x7f05000c, 0x7f05000d).replace(0x7f0f006a, CaptionBackgroundColorListFragment.getInstance(mStyleId, mBackgroundColor), "background_color_list_frag").addToBackStack(null).commit();
                return;
            }
            if (i == 0x7f0f0094)
            {
                getFragmentManager().beginTransaction().setCustomAnimations(0x7f05000c, 0x7f05000d, 0x7f05000c, 0x7f05000d).replace(0x7f0f006a, CaptionBackgroundOpacityListFragment.getInstance(mStyleId, mBackgroundOpacity), "frag_background_opacity").addToBackStack(null).commit();
                return;
            }
            if (i == 0x7f0f0095)
            {
                getFragmentManager().beginTransaction().setCustomAnimations(0x7f05000c, 0x7f05000d, 0x7f05000c, 0x7f05000d).replace(0x7f0f006a, CaptionTextOpacityListFragment.getInstance(mStyleId, mTextOpacity), "frag_text_opacity").addToBackStack(null).commit();
                return;
            }
            if (i == 0x7f0f0092)
            {
                getFragmentManager().beginTransaction().setCustomAnimations(0x7f05000c, 0x7f05000d, 0x7f05000c, 0x7f05000d).replace(0x7f0f006a, CaptionFontEdgeListFragment.getInstance(mStyleId, mTextFontEdge), "font_edge_frag").addToBackStack(null).commit();
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        captionStyle = NBCSportsApplication.component().captionStyle();
        captionPreviewHelper = NBCSportsApplication.component().captionPreviewHelper();
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new CursorLoader(getActivity(), ContentUris.withAppendedId(com.phunware.nbc.sochi.caption.provider.ClosedCaptioningStylesContract.Styles.CONTENT_URI, mStyleId), null, null, null, null);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04002e, viewgroup, false);
        mTextViewWithLabelDescription = (TextViewWithLabel)layoutinflater.findViewById(0x7f0f008e);
        mTextViewWithLabelTextFont = (TextViewWithLabel)layoutinflater.findViewById(0x7f0f008f);
        mTextViewWithLabelTextSize = (TextViewWithLabel)layoutinflater.findViewById(0x7f0f0090);
        mTextViewWithLabelTextColor = (TextViewWithLabel)layoutinflater.findViewById(0x7f0f0091);
        mTextViewWithLabelBackgroundColor = (TextViewWithLabel)layoutinflater.findViewById(0x7f0f0093);
        mTextViewWithLabelBackgroundOpacity = (TextViewWithLabel)layoutinflater.findViewById(0x7f0f0094);
        mTextViewWithLabelAdvTextOpacity = (TextViewWithLabel)layoutinflater.findViewById(0x7f0f0095);
        mTextViewCaptionPreview = (TextView)layoutinflater.findViewById(0x7f0f0113);
        mTextViewWithLabelTextFontEdge = (TextViewWithLabel)layoutinflater.findViewById(0x7f0f0092);
        mIncludeCCPreview = layoutinflater.findViewById(0x7f0f008d);
        mTextViewWithLabelDescription.setValue(mStyleTitle);
        mTextViewWithLabelDescription.setOnClickListener(this);
        mTextViewWithLabelTextFont.setOnClickListener(this);
        mTextViewWithLabelTextSize.setOnClickListener(this);
        mTextViewWithLabelTextColor.setOnClickListener(this);
        mTextViewWithLabelBackgroundColor.setOnClickListener(this);
        mTextViewWithLabelBackgroundOpacity.setOnClickListener(this);
        mTextViewWithLabelAdvTextOpacity.setOnClickListener(this);
        mTextViewWithLabelTextFontEdge.setOnClickListener(this);
        if (bundle != null)
        {
            mStyleId = bundle.getLong("style_id");
            getLoaderManager().restartLoader(0, null, this);
        }
        if (mStyleId == -100L)
        {
            if (getArguments().getBoolean("create_new"))
            {
                mStyleTitle = getArguments().getString("default_title");
                viewgroup = new AsyncQueryHandler(getActivity().getContentResolver()) {

                    final CaptionNewStyleFragment this$0;

                    protected void onInsertComplete(int i, Object obj, Uri uri)
                    {
                        super.onInsertComplete(i, obj, uri);
                        mStyleId = ContentUris.parseId(uri);
                        getLoaderManager().restartLoader(0, null, CaptionNewStyleFragment.this);
                    }

            
            {
                this$0 = CaptionNewStyleFragment.this;
                super(contentresolver);
            }
                };
                bundle = new ContentValues();
                bundle.put("title", mStyleTitle);
                viewgroup.startInsert(0, null, com.phunware.nbc.sochi.caption.provider.ClosedCaptioningStylesContract.Styles.CONTENT_URI, bundle);
            } else
            {
                mStyleId = getArguments().getLong("style_id");
                getLoaderManager().restartLoader(0, null, this);
            }
        }
        captionPreviewHelper.bindFullScreenPreviewButton(getActivity(), mIncludeCCPreview, mStyleId);
        return layoutinflater;
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        if (cursor.moveToFirst())
        {
            mStyleTitle = cursor.getString(cursor.getColumnIndex("title"));
            mTextFont = cursor.getString(cursor.getColumnIndex("font"));
            mTextSize = cursor.getInt(cursor.getColumnIndex("text_size"));
            if (mIsTelemundo)
            {
                loader = "text_esp_color";
            } else
            {
                loader = "text_color";
            }
            mTextColor = cursor.getString(cursor.getColumnIndex(loader));
            if (mIsTelemundo)
            {
                loader = "background_esp_color";
            } else
            {
                loader = "background_color";
            }
            mBackgroundColor = cursor.getString(cursor.getColumnIndex(loader));
            mBackgroundOpacity = cursor.getInt(cursor.getColumnIndex("background_opacity"));
            mTextOpacity = cursor.getInt(cursor.getColumnIndex("text_opacity"));
            mTextFontEdge = cursor.getString(cursor.getColumnIndex("text_edge"));
            mTextViewWithLabelDescription.setValue(mStyleTitle);
            mTextViewWithLabelTextFont.setValue(mTextFont);
            mTextViewWithLabelTextSize.setValue(getSizeName(mTextSize));
            mTextViewWithLabelTextColor.setValue(mTextColor);
            mTextViewWithLabelBackgroundColor.setValue(mBackgroundColor);
            mTextViewWithLabelBackgroundOpacity.setValue(getString(0x7f07009a, new Object[] {
                Integer.valueOf(mBackgroundOpacity)
            }));
            mTextViewWithLabelAdvTextOpacity.setValue(getString(0x7f07009a, new Object[] {
                Integer.valueOf(mTextOpacity)
            }));
            mTextViewWithLabelTextFontEdge.setValue(mTextFontEdge);
            ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(mStyleTitle);
            captionPreviewHelper.preview(getActivity(), cursor, mTextViewCaptionPreview);
        }
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onResume()
    {
        super.onResume();
        if (mStyleId != -1L)
        {
            ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(mStyleTitle);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putLong("style_id", mStyleId);
        super.onSaveInstanceState(bundle);
    }

    public void setDescription(String s)
    {
        AsyncQueryHandler asyncqueryhandler = new AsyncQueryHandler(getActivity().getContentResolver()) {

            final CaptionNewStyleFragment this$0;

            
            {
                this$0 = CaptionNewStyleFragment.this;
                super(contentresolver);
            }
        };
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("title", s);
        asyncqueryhandler.startUpdate(0, null, ContentUris.withAppendedId(com.phunware.nbc.sochi.caption.provider.ClosedCaptioningStylesContract.Styles.CONTENT_URI, mStyleId), contentvalues, null, null);
    }



/*
    static long access$002(CaptionNewStyleFragment captionnewstylefragment, long l)
    {
        captionnewstylefragment.mStyleId = l;
        return l;
    }

*/
}
