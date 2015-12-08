// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.List;
import org.xbmc.kore.host.HostConnectionObserver;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.ApiMethod;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.RepeatListener;
import org.xbmc.kore.utils.UIUtils;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.ui:
//            AllCastActivity, GenericSelectDialog

public class NowPlayingFragment extends Fragment
    implements org.xbmc.kore.host.HostConnectionObserver.PlayerEventsObserver, GenericSelectDialog.GenericSelectDialogListener
{
    public static interface NowPlayingListener
    {

        public abstract void SwitchToRemotePanel();
    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/NowPlayingFragment);
    private List availableAudioStreams;
    private List availableSubtitles;
    private Handler callbackHandler;
    private int currentActivePlayerId;
    private int currentAudiostreamIndex;
    private int currentSubtitleIndex;
    private ApiCallback defaultBooleanActionCallback;
    private ApiCallback defaultIntActionCallback;
    private ApiCallback defaultPlaySpeedChangedCallback;
    private ApiCallback defaultStringActionCallback;
    ImageButton fastForwardButton;
    private HostConnectionObserver hostConnectionObserver;
    private HostManager hostManager;
    TextView infoMessage;
    RelativeLayout infoPanel;
    TextView infoTitle;
    ImageView mediaArt;
    private int mediaCurrentTime;
    TextView mediaDescription;
    RelativeLayout mediaDetailsPanel;
    TextView mediaDuration;
    TextView mediaGenreSeason;
    TextView mediaMaxRating;
    ScrollView mediaPanel;
    ImageView mediaPoster;
    TextView mediaProgress;
    TextView mediaRating;
    TextView mediaRatingVotes;
    SeekBar mediaSeekbar;
    TextView mediaTitle;
    private int mediaTotalTime;
    TextView mediaUndertitle;
    TextView mediaYear;
    ImageButton nextButton;
    private NowPlayingListener nowPlayingListener;
    ImageButton overflowButton;
    private android.widget.PopupMenu.OnMenuItemClickListener overflowMenuClickListener;
    ImageButton playButton;
    ImageButton previousButton;
    ImageButton repeatButton;
    ImageButton rewindButton;
    private Runnable seekBarUpdater;
    private android.widget.SeekBar.OnSeekBarChangeListener seekbarChangeListener;
    ImageButton shuffleButton;
    ImageButton stopButton;
    GridLayout videoCastList;
    ImageButton volumeDownButton;
    ImageButton volumeMuteButton;
    ImageButton volumeUpButton;

    public NowPlayingFragment()
    {
        callbackHandler = new Handler();
        currentActivePlayerId = -1;
        currentSubtitleIndex = -1;
        currentAudiostreamIndex = -1;
        defaultStringActionCallback = ApiMethod.getDefaultActionCallback();
        defaultIntActionCallback = ApiMethod.getDefaultActionCallback();
        defaultBooleanActionCallback = ApiMethod.getDefaultActionCallback();
        defaultPlaySpeedChangedCallback = new ApiCallback() {

            final NowPlayingFragment this$0;

            public void onError(int i, String s)
            {
            }

            public void onSuccess(Integer integer)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    UIUtils.setPlayPauseButtonIcon(getActivity(), playButton, integer.intValue());
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Integer)obj);
            }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
        };
        overflowMenuClickListener = new android.widget.PopupMenu.OnMenuItemClickListener() {

            final NowPlayingFragment this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                int i;
                boolean flag1;
                flag1 = true;
                i = -1;
                menuitem.getItemId();
                JVM INSTR tableswitch 2131624182 2131624183: default 36
            //                           2131624182 42
            //                           2131624183 265;
                   goto _L1 _L2 _L3
_L1:
                flag1 = false;
_L5:
                return flag1;
_L2:
                String as[];
                int j;
                boolean flag;
                if (availableAudioStreams != null)
                {
                    j = availableAudioStreams.size() + 1;
                } else
                {
                    j = 1;
                }
                as = new String[j];
                as[0] = getString(0x7f0700cf);
                if (availableAudioStreams == null) goto _L5; else goto _L4
_L4:
                flag = false;
                j = i;
                i = ((flag) ? 1 : 0);
                while (i < availableAudioStreams.size()) 
                {
                    org.xbmc.kore.jsonrpc.type.PlayerType.AudioStream audiostream = (org.xbmc.kore.jsonrpc.type.PlayerType.AudioStream)availableAudioStreams.get(i);
                    if (TextUtils.isEmpty(audiostream.language))
                    {
                        menuitem = audiostream.name;
                    } else
                    {
                        menuitem = (new StringBuilder()).append(audiostream.language).append(" | ").append(audiostream.name).toString();
                    }
                    as[i + 1] = menuitem;
                    if (audiostream.index == currentAudiostreamIndex)
                    {
                        j = i + 1;
                    }
                    i++;
                }
                GenericSelectDialog.newInstance(NowPlayingFragment.this, 0, getString(0x7f070020), as, j).show(getFragmentManager(), null);
                return true;
_L3:
                String as1[];
                int k;
                int l;
                if (availableSubtitles != null)
                {
                    k = availableSubtitles.size() + 3;
                } else
                {
                    k = 3;
                }
                as1 = new String[k];
                as1[0] = getString(0x7f070037);
                as1[1] = getString(0x7f0700df);
                as1[2] = getString(0x7f070069);
                l = i;
                if (availableSubtitles != null)
                {
                    k = 0;
                    do
                    {
                        l = i;
                        if (k >= availableSubtitles.size())
                        {
                            break;
                        }
                        org.xbmc.kore.jsonrpc.type.PlayerType.Subtitle subtitle = (org.xbmc.kore.jsonrpc.type.PlayerType.Subtitle)availableSubtitles.get(k);
                        if (TextUtils.isEmpty(subtitle.language))
                        {
                            menuitem = subtitle.name;
                        } else
                        {
                            menuitem = (new StringBuilder()).append(subtitle.language).append(" | ").append(subtitle.name).toString();
                        }
                        as1[k + 3] = menuitem;
                        if (subtitle.index == currentSubtitleIndex)
                        {
                            i = k + 3;
                        }
                        k++;
                    } while (true);
                }
                GenericSelectDialog.newInstance(NowPlayingFragment.this, 1, getString(0x7f070091), as1, l).show(getFragmentManager(), null);
                return true;
            }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
        };
        mediaTotalTime = 0;
        mediaCurrentTime = 0;
        seekBarUpdater = new Runnable() ;
        seekbarChangeListener = new android.widget.SeekBar.OnSeekBarChangeListener() {

            final NowPlayingFragment this$0;

            public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
            {
                if (flag)
                {
                    mediaCurrentTime = i;
                    i = mediaCurrentTime / 3600;
                    int j = (mediaCurrentTime % 3600) / 60;
                    int k = mediaCurrentTime;
                    mediaProgress.setText(UIUtils.formatTime(i, j, k % 3600 % 60));
                }
            }

            public void onStartTrackingTouch(SeekBar seekbar)
            {
                seekbar.removeCallbacks(seekBarUpdater);
            }

            public void onStopTrackingTouch(SeekBar seekbar)
            {
                org.xbmc.kore.jsonrpc.type.PlayerType.PositionTime positiontime = new PositionTime(mediaCurrentTime / 3600, (mediaCurrentTime % 3600) / 60, mediaCurrentTime % 3600 % 60, 0);
                (new Seek(currentActivePlayerId, positiontime)).execute(hostManager.getConnection(), new ApiCallback() {

                    final _cls14 this$1;

                    public void onError(int i, String s)
                    {
                        LogUtils.LOGD(NowPlayingFragment.TAG, (new StringBuilder()).append("Got an error calling Player.Seek. Error code: ").append(i).append(", description: ").append(s).toString());
                    }

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((org.xbmc.kore.jsonrpc.type.PlayerType.SeekReturnType)obj);
                    }

                    public void onSuccess(org.xbmc.kore.jsonrpc.type.PlayerType.SeekReturnType seekreturntype)
                    {
                    }

            
            {
                this$1 = _cls14.this;
                super();
            }
                }, callbackHandler);
                seekbar.postDelayed(seekBarUpdater, 1000L);
            }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
        };
    }

    private String removeYouTubeMarkup(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.replaceAll("\\[.*\\]", "");
        }
    }

    private void setDurationInfo(org.xbmc.kore.jsonrpc.type.GlobalType.Time time, org.xbmc.kore.jsonrpc.type.GlobalType.Time time1, int i)
    {
        mediaTotalTime = time1.hours * 3600 + time1.minutes * 60 + time1.seconds;
        mediaSeekbar.setMax(mediaTotalTime);
        mediaDuration.setText(UIUtils.formatTime(time1));
        mediaCurrentTime = time.hours * 3600 + time.minutes * 60 + time.seconds;
        mediaSeekbar.setProgress(mediaCurrentTime);
        mediaProgress.setText(UIUtils.formatTime(time));
        mediaSeekbar.removeCallbacks(seekBarUpdater);
        if (i == 1)
        {
            mediaSeekbar.postDelayed(seekBarUpdater, 1000L);
        }
    }

    private void setNowPlayingInfo(org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        String s;
        int i;
        s = itemsall.type;
        i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 56
    //                   -1544438277: 810
    //                   -759089802: 844
    //                   3536149: 827
    //                   104087344: 793;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i;
        JVM INSTR tableswitch 0 3: default 88
    //                   0 861
    //                   1 1002
    //                   2 1141
    //                   3 1308;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        double d;
        String s1;
        String s2;
        Object obj;
        Object obj1;
        Object obj2;
        String s3;
        Object obj3;
        String s4;
        switchToPanel(0x7f0e0071);
        s1 = itemsall.label;
        s3 = "";
        s2 = itemsall.fanart;
        s = itemsall.thumbnail;
        obj1 = null;
        s4 = itemsall.premiered;
        obj = removeYouTubeMarkup(itemsall.plot);
        d = 0.0D;
        obj2 = null;
        obj3 = null;
_L11:
        mediaTitle.setText(s1);
        mediaUndertitle.setText(s3);
        setDurationInfo(propertyvalue.time, propertyvalue.totaltime, propertyvalue.speed);
        mediaSeekbar.setOnSeekBarChangeListener(seekbarChangeListener);
        int j1;
        if (!TextUtils.isEmpty(s4) || !TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            mediaYear.setVisibility(0);
            mediaGenreSeason.setVisibility(0);
            mediaYear.setText(s4);
            mediaGenreSeason.setText(((CharSequence) (obj1)));
        } else
        {
            mediaYear.setVisibility(8);
            mediaGenreSeason.setVisibility(8);
        }
        if (d > 0.0D)
        {
            mediaRating.setVisibility(0);
            mediaMaxRating.setVisibility(0);
            mediaRatingVotes.setVisibility(0);
            mediaRating.setText(String.format("%01.01f", new Object[] {
                Double.valueOf(d)
            }));
            mediaMaxRating.setText(((CharSequence) (obj2)));
            mediaRatingVotes.setText(((CharSequence) (obj3)));
        } else
        {
            mediaRating.setVisibility(8);
            mediaMaxRating.setVisibility(8);
            mediaRatingVotes.setVisibility(8);
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            mediaDescription.setVisibility(0);
            mediaDescription.setText(((CharSequence) (obj)));
        } else
        {
            mediaDescription.setVisibility(8);
        }
        obj = getActivity().getTheme().obtainStyledAttributes(new int[] {
            0x7f010106, 0x7f01002f, 0x7f010030
        });
        if (propertyvalue.repeat.equals("off"))
        {
            repeatButton.setImageResource(((TypedArray) (obj)).getResourceId(1, 0x7f02007a));
            repeatButton.clearColorFilter();
        } else
        if (propertyvalue.repeat.equals("one"))
        {
            repeatButton.setImageResource(((TypedArray) (obj)).getResourceId(2, 0x7f020079));
            repeatButton.setColorFilter(((TypedArray) (obj)).getColor(0, 0x7f0d0004));
        } else
        {
            repeatButton.setImageResource(((TypedArray) (obj)).getResourceId(1, 0x7f02007a));
            repeatButton.setColorFilter(((TypedArray) (obj)).getColor(0, 0x7f0d0004));
        }
        if (!propertyvalue.shuffled)
        {
            shuffleButton.clearColorFilter();
        } else
        {
            shuffleButton.setColorFilter(((TypedArray) (obj)).getColor(0, 0x7f0d0004));
        }
        ((TypedArray) (obj)).recycle();
        obj = getActivity().getResources();
        obj1 = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj1)));
        j1 = ((Resources) (obj)).getDimensionPixelOffset(0x7f080025);
        i = ((DisplayMetrics) (obj1)).widthPixels;
        if (!TextUtils.isEmpty(s2))
        {
            mediaPoster.setVisibility(0);
            int l = ((Resources) (obj)).getDimensionPixelOffset(0x7f080028);
            int j = ((Resources) (obj)).getDimensionPixelOffset(0x7f080026);
            if (itemsall.type.equals("movie") || itemsall.type.equals("episode"))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0)
            {
                obj2 = mediaPoster.getLayoutParams();
                obj2.height = ((android.view.ViewGroup.LayoutParams) (obj2)).width;
                mediaPoster.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
                j = l;
            }
            UIUtils.loadImageWithCharacterAvatar(getActivity(), hostManager, s, s1, mediaPoster, l, j);
            UIUtils.loadImageIntoImageview(hostManager, s2, mediaArt, ((DisplayMetrics) (obj1)).widthPixels, j1);
            i = ((Resources) (obj)).getDimensionPixelOffset(0x7f08002b);
            j = mediaTitle.getPaddingRight();
            l = mediaTitle.getPaddingTop();
            j1 = mediaTitle.getPaddingBottom();
            mediaTitle.setPadding(i, l, j, j1);
            mediaUndertitle.setPadding(i, l, j, j1);
        } else
        {
            mediaPoster.setVisibility(8);
            UIUtils.loadImageIntoImageview(hostManager, s, mediaArt, i, j1);
            i = mediaTitle.getPaddingRight();
            int k = mediaTitle.getPaddingRight();
            int i1 = mediaTitle.getPaddingTop();
            j1 = mediaTitle.getPaddingBottom();
            mediaTitle.setPadding(i, i1, k, j1);
            mediaUndertitle.setPadding(i, i1, k, j1);
        }
        if (propertyvalue.audiostreams != null && propertyvalue.audiostreams.size() > 0)
        {
            overflowButton.setVisibility(0);
            videoCastList.setVisibility(0);
            availableAudioStreams = propertyvalue.audiostreams;
            availableSubtitles = propertyvalue.subtitles;
            currentAudiostreamIndex = propertyvalue.currentaudiostream.index;
            currentSubtitleIndex = propertyvalue.currentsubtitle.index;
            UIUtils.setupCastInfo(getActivity(), itemsall.cast, videoCastList, AllCastActivity.buildLaunchIntent(getActivity(), s1, (ArrayList)itemsall.cast));
            return;
        } else
        {
            overflowButton.setVisibility(8);
            videoCastList.setVisibility(8);
            return;
        }
_L5:
        if (s.equals("movie"))
        {
            i = 0;
        }
          goto _L1
_L2:
        if (s.equals("episode"))
        {
            i = 1;
        }
          goto _L1
_L4:
        if (s.equals("song"))
        {
            i = 2;
        }
          goto _L1
_L3:
        if (s.equals("musicvideo"))
        {
            i = 3;
        }
          goto _L1
_L7:
        switchToPanel(0x7f0e0071);
        s1 = itemsall.title;
        s3 = itemsall.tagline;
        s2 = itemsall.fanart;
        s = itemsall.thumbnail;
        obj1 = Utils.listStringConcat(itemsall.genre, ", ");
        if (itemsall.year > 0)
        {
            s4 = String.format("%d", new Object[] {
                Integer.valueOf(itemsall.year)
            });
        } else
        {
            s4 = null;
        }
        obj = itemsall.plot;
        d = itemsall.rating;
        obj2 = getString(0x7f070054);
        if (TextUtils.isEmpty(itemsall.votes))
        {
            obj3 = "";
        } else
        {
            obj3 = String.format(getString(0x7f0700ab), new Object[] {
                itemsall.votes
            });
        }
          goto _L11
_L8:
        switchToPanel(0x7f0e0071);
        s1 = itemsall.title;
        s3 = itemsall.showtitle;
        s2 = itemsall.thumbnail;
        s = itemsall.art.poster;
        obj1 = String.format(getString(0x7f070081), new Object[] {
            Integer.valueOf(itemsall.season), Integer.valueOf(itemsall.episode)
        });
        s4 = itemsall.premiered;
        obj = itemsall.plot;
        d = itemsall.rating;
        obj2 = getString(0x7f070054);
        if (TextUtils.isEmpty(itemsall.votes))
        {
            obj3 = "";
        } else
        {
            obj3 = String.format(getString(0x7f0700ab), new Object[] {
                itemsall.votes
            });
        }
          goto _L11
_L9:
        switchToPanel(0x7f0e0071);
        s1 = itemsall.title;
        s3 = (new StringBuilder()).append(itemsall.displayartist).append(" | ").append(itemsall.album).toString();
        s2 = itemsall.fanart;
        s = itemsall.thumbnail;
        obj1 = Utils.listStringConcat(itemsall.genre, ", ");
        if (itemsall.year > 0)
        {
            s4 = String.format("%d", new Object[] {
                Integer.valueOf(itemsall.year)
            });
        } else
        {
            s4 = null;
        }
        obj = itemsall.description;
        d = itemsall.rating;
        obj2 = getString(0x7f070053);
        if (TextUtils.isEmpty(itemsall.votes))
        {
            obj3 = "";
        } else
        {
            obj3 = String.format(getString(0x7f0700ab), new Object[] {
                itemsall.votes
            });
        }
          goto _L11
_L10:
        switchToPanel(0x7f0e0071);
        s1 = itemsall.title;
        s3 = (new StringBuilder()).append(Utils.listStringConcat(itemsall.artist, ", ")).append(" | ").append(itemsall.album).toString();
        s2 = itemsall.fanart;
        s = itemsall.thumbnail;
        obj1 = Utils.listStringConcat(itemsall.genre, ", ");
        if (itemsall.year > 0)
        {
            s4 = String.format("%d", new Object[] {
                Integer.valueOf(itemsall.year)
            });
        } else
        {
            s4 = null;
        }
        obj = itemsall.plot;
        d = 0.0D;
        obj2 = null;
        obj3 = null;
          goto _L11
    }

    private void setupVolumeRepeatButton(View view, final ApiMethod action)
    {
        view.setOnTouchListener(new RepeatListener(400, 80, new android.view.View.OnClickListener() {

            final NowPlayingFragment this$0;
            final ApiMethod val$action;

            public void onClick(View view1)
            {
                action.execute(hostManager.getConnection(), defaultIntActionCallback, callbackHandler);
            }

            
            {
                this$0 = NowPlayingFragment.this;
                action = apimethod;
                super();
            }
        }));
    }

    private void showDownloadSubtitlesPostGotham()
    {
        HostConnection hostconnection = new HostConnection(hostManager.getHostInfo());
        hostconnection.setProtocol(1);
        org.xbmc.kore.jsonrpc.method.GUI.ActivateWindow activatewindow = new ActivateWindow("subtitlesearch");
        LogUtils.LOGD(TAG, "Activating subtitles window.");
        activatewindow.execute(hostconnection, new ApiCallback() {

            final NowPlayingFragment this$0;

            public void onError(int i, String s)
            {
                LogUtils.LOGD(NowPlayingFragment.TAG, (new StringBuilder()).append("Got an error activating subtitles window. Error: ").append(s).toString());
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                LogUtils.LOGD(NowPlayingFragment.TAG, "Sucessfully activated subtitles window.");
            }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
        }, callbackHandler);
        nowPlayingListener.SwitchToRemotePanel();
    }

    private void showDownloadSubtitlesPreGotham()
    {
        (new ExecuteAddon("script.xbmc.subtitles")).execute(hostManager.getConnection(), new ApiCallback() {

            final NowPlayingFragment this$0;

            public void onError(int i, String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    Toast.makeText(getActivity(), String.format(getString(0x7f07003d), new Object[] {
                        s
                    }), 0).show();
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    nowPlayingListener.SwitchToRemotePanel();
                    return;
                }
            }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
        }, callbackHandler);
    }

    private void stopNowPlayingInfo()
    {
        mediaSeekbar.removeCallbacks(seekBarUpdater);
        availableSubtitles = null;
        availableAudioStreams = null;
        currentSubtitleIndex = -1;
        currentAudiostreamIndex = -1;
    }

    private void switchToPanel(int i)
    {
        switch (i)
        {
        default:
            return;

        case 2131624115: 
            mediaPanel.setVisibility(8);
            mediaArt.setVisibility(8);
            infoPanel.setVisibility(0);
            return;

        case 2131624049: 
            infoPanel.setVisibility(8);
            mediaPanel.setVisibility(0);
            mediaArt.setVisibility(0);
            return;
        }
    }

    public void inputOnInputRequested(String s, String s1, String s2)
    {
    }

    public void observerOnStopObserving()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        onActivityCreated(bundle);
        setHasOptionsMenu(false);
    }

    public void onAttach(Activity activity)
    {
        onAttach(activity);
        try
        {
            nowPlayingListener = (NowPlayingListener)activity;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            nowPlayingListener = null;
        }
    }

    public void onCreate(Bundle bundle)
    {
        onCreate(bundle);
        hostManager = HostManager.getInstance(getActivity());
        hostConnectionObserver = hostManager.getHostConnectionObserver();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030030, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        setupVolumeRepeatButton(volumeDownButton, new SetVolume("decrement"));
        setupVolumeRepeatButton(volumeUpButton, new SetVolume("increment"));
        int i = getActivity().getResources().getDimensionPixelSize(0x7f080074);
        mediaPanel.getViewTreeObserver().addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() {

            final NowPlayingFragment this$0;
            final int val$pixelsToTransparent;

            public void onScrollChanged()
            {
                float f = Math.min(1.0F, Math.max(0.0F, 1.0F - (float)mediaPanel.getScrollY() / (float)pixelsToTransparent));
                mediaArt.setAlpha(f);
            }

            
            {
                this$0 = NowPlayingFragment.this;
                pixelsToTransparent = i;
                super();
            }
        });
        return layoutinflater;
    }

    public void onDialogSelect(int i, int j)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            switch (j)
            {
            default:
                (new SetAudioStream(currentActivePlayerId, j - 1)).execute(hostManager.getConnection(), defaultStringActionCallback, callbackHandler);
                return;

            case 0: // '\0'
                (new ExecuteAction("audiodelay")).execute(hostManager.getConnection(), new ApiCallback() {

                    final NowPlayingFragment this$0;

                    public void onError(int k, String s)
                    {
                    }

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((String)obj);
                    }

                    public void onSuccess(String s)
                    {
                        if (!isAdded())
                        {
                            return;
                        } else
                        {
                            nowPlayingListener.SwitchToRemotePanel();
                            return;
                        }
                    }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
                }, callbackHandler);
                break;
            }
            return;

        case 1: // '\001'
            switch (j)
            {
            default:
                (new SetSubtitle(currentActivePlayerId, j - 3, true)).execute(hostManager.getConnection(), defaultStringActionCallback, callbackHandler);
                return;

            case 0: // '\0'
                (new GetProperties(new String[] {
                    "version"
                })).execute(hostManager.getConnection(), new ApiCallback() {

                    final NowPlayingFragment this$0;

                    public void onError(int k, String s)
                    {
                        if (!isAdded())
                        {
                            return;
                        } else
                        {
                            Toast.makeText(getActivity(), String.format(getString(0x7f070041), new Object[] {
                                s
                            }), 0).show();
                            return;
                        }
                    }

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue)obj);
                    }

                    public void onSuccess(org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue propertyvalue)
                    {
                        if (!isAdded())
                        {
                            return;
                        }
                        if (propertyvalue.version.major.intValue() < 13)
                        {
                            showDownloadSubtitlesPreGotham();
                            return;
                        } else
                        {
                            showDownloadSubtitlesPostGotham();
                            return;
                        }
                    }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
                }, callbackHandler);
                return;

            case 1: // '\001'
                (new org.xbmc.kore.jsonrpc.method.Input.ExecuteAction("subtitledelay")).execute(hostManager.getConnection(), new ApiCallback() {

                    final NowPlayingFragment this$0;

                    public void onError(int k, String s)
                    {
                    }

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((String)obj);
                    }

                    public void onSuccess(String s)
                    {
                        if (!isAdded())
                        {
                            return;
                        } else
                        {
                            nowPlayingListener.SwitchToRemotePanel();
                            return;
                        }
                    }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
                }, callbackHandler);
                return;

            case 2: // '\002'
                (new org.xbmc.kore.jsonrpc.method.Player.SetSubtitle(currentActivePlayerId, "off", true)).execute(hostManager.getConnection(), defaultStringActionCallback, callbackHandler);
                break;
            }
            break;
        }
    }

    public void onFastForwardClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.SetSpeed(currentActivePlayerId, "increment")).execute(hostManager.getConnection(), defaultPlaySpeedChangedCallback, callbackHandler);
    }

    public void onNextClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.GoTo(currentActivePlayerId, "next")).execute(hostManager.getConnection(), defaultStringActionCallback, callbackHandler);
    }

    public void onOverflowClicked(View view)
    {
        view = new PopupMenu(getActivity(), view);
        view.inflate(0x7f0f000c);
        view.setOnMenuItemClickListener(overflowMenuClickListener);
        view.show();
    }

    public void onPause()
    {
        super.onPause();
        stopNowPlayingInfo();
        hostConnectionObserver.unregisterPlayerObserver(this);
    }

    public void onPlayClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.PlayPause(currentActivePlayerId)).execute(hostManager.getConnection(), defaultPlaySpeedChangedCallback, callbackHandler);
    }

    public void onPreviousClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.GoTo(currentActivePlayerId, "previous")).execute(hostManager.getConnection(), defaultStringActionCallback, callbackHandler);
    }

    public void onRepeatClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.SetRepeat(currentActivePlayerId, "cycle")).execute(hostManager.getConnection(), new ApiCallback() {

            final NowPlayingFragment this$0;

            public void onError(int i, String s)
            {
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    hostConnectionObserver.forceRefreshResults();
                    return;
                }
            }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
        }, callbackHandler);
    }

    public void onResume()
    {
        super.onResume();
        hostConnectionObserver.registerPlayerObserver(this, true);
    }

    public void onRewindClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.SetSpeed(currentActivePlayerId, "decrement")).execute(hostManager.getConnection(), defaultPlaySpeedChangedCallback, callbackHandler);
    }

    public void onShuffleClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.SetShuffle(currentActivePlayerId)).execute(hostManager.getConnection(), new ApiCallback() {

            final NowPlayingFragment this$0;

            public void onError(int i, String s)
            {
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                if (!isAdded())
                {
                    return;
                } else
                {
                    hostConnectionObserver.forceRefreshResults();
                    return;
                }
            }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
        }, callbackHandler);
    }

    public void onStopClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Player.Stop(currentActivePlayerId)).execute(hostManager.getConnection(), defaultStringActionCallback, callbackHandler);
        UIUtils.setPlayPauseButtonIcon(getActivity(), playButton, 0);
    }

    public void onVolumeMuteClicked(View view)
    {
        (new org.xbmc.kore.jsonrpc.method.Application.SetMute()).execute(hostManager.getConnection(), new ApiCallback() {

            final NowPlayingFragment this$0;

            public void onError(int i, String s)
            {
            }

            public void onSuccess(Boolean boolean1)
            {
                if (!isAdded())
                {
                    return;
                }
                if (boolean1.booleanValue())
                {
                    boolean1 = getActivity().getTheme().obtainStyledAttributes(new int[] {
                        0x7f010106
                    });
                    volumeMuteButton.setColorFilter(boolean1.getColor(0, 0x7f0d0004));
                    boolean1.recycle();
                    return;
                } else
                {
                    volumeMuteButton.clearColorFilter();
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Boolean)obj);
            }

            
            {
                this$0 = NowPlayingFragment.this;
                super();
            }
        }, callbackHandler);
    }

    public void playerNoResultsYet()
    {
        switchToPanel(0x7f0e00b3);
        if (hostManager.getHostInfo() != null)
        {
            infoTitle.setText(0x7f07002b);
        } else
        {
            infoTitle.setText(0x7f070067);
        }
        infoMessage.setText(null);
    }

    public void playerOnConnectionError(int i, String s)
    {
        s = hostManager.getHostInfo();
        stopNowPlayingInfo();
        switchToPanel(0x7f0e00b3);
        if (s != null)
        {
            infoTitle.setText(0x7f07002b);
            infoMessage.setText(String.format(getString(0x7f07002c), new Object[] {
                s.getName(), s.getAddress()
            }));
            return;
        } else
        {
            infoTitle.setText(0x7f070067);
            infoMessage.setText(null);
            return;
        }
    }

    public void playerOnPause(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        setNowPlayingInfo(propertyvalue, itemsall);
        currentActivePlayerId = getactiveplayersreturntype.playerid;
        UIUtils.setPlayPauseButtonIcon(getActivity(), playButton, propertyvalue.speed);
    }

    public void playerOnPlay(org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType getactiveplayersreturntype, org.xbmc.kore.jsonrpc.type.PlayerType.PropertyValue propertyvalue, org.xbmc.kore.jsonrpc.type.ListType.ItemsAll itemsall)
    {
        setNowPlayingInfo(propertyvalue, itemsall);
        currentActivePlayerId = getactiveplayersreturntype.playerid;
        UIUtils.setPlayPauseButtonIcon(getActivity(), playButton, propertyvalue.speed);
    }

    public void playerOnStop()
    {
        HostInfo hostinfo = hostManager.getHostInfo();
        stopNowPlayingInfo();
        switchToPanel(0x7f0e00b3);
        infoTitle.setText(0x7f07006a);
        infoMessage.setText(String.format(getString(0x7f070029), new Object[] {
            hostinfo.getName()
        }));
    }

    public void systemOnQuit()
    {
        playerNoResultsYet();
    }









/*
    static int access$1302(NowPlayingFragment nowplayingfragment, int i)
    {
        nowplayingfragment.mediaCurrentTime = i;
        return i;
    }

*/


/*
    static int access$1312(NowPlayingFragment nowplayingfragment, int i)
    {
        i = nowplayingfragment.mediaCurrentTime + i;
        nowplayingfragment.mediaCurrentTime = i;
        return i;
    }

*/










}
