// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.Toast;
import com.cocosw.undobar.UndoBarController;
import com.cocosw.undobar.UndoBarStyle;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.PublicApiComment;
import com.soundcloud.android.events.EntityMetadata;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.util.concurrent.TimeUnit;
import rx.Y;
import rx.a.b.a;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentsOperations

public class AddCommentDialogFragment extends DialogFragment
{
    static final class CommentAddedSubscriber extends DefaultSubscriber
        implements com.cocosw.undobar.UndoBarController.c
    {

        private final Activity activity;
        private final EventBus eventBus;
        private final PropertySet track;

        private UndoBarStyle createViewCommentBarStyle()
        {
            UndoBarStyle undobarstyle = new UndoBarStyle(0x7f020263, 0x7f0700b5);
            android.view.animation.Animation animation = AnimationUtils.loadAnimation(activity, 0x10a0000);
            android.view.animation.Animation animation1 = AnimationUtils.loadAnimation(activity, 0x10a0001);
            undobarstyle.e = animation;
            undobarstyle.f = animation1;
            return undobarstyle;
        }

        private DefaultSubscriber goToCommentsPage(final Context context)
        {
            class _cls1 extends DefaultSubscriber
            {

                final CommentAddedSubscriber this$0;
                final Context val$context;

                public void onNext(PlayerUIEvent playeruievent)
                {
                    context.startActivity((new Intent(context, com/soundcloud/android/comments/TrackCommentsActivity)).putExtra("extra", track));
                }

                public volatile void onNext(Object obj)
                {
                    onNext((PlayerUIEvent)obj);
                }

                _cls1()
                {
                    this$0 = CommentAddedSubscriber.this;
                    context = context1;
                    super();
                }
            }

            return new _cls1();
        }

        private void subscribeToCollapsedEvent(Context context)
        {
            eventBus.queue(EventQueue.PLAYER_UI).first(PlayerUIEvent.PLAYER_IS_COLLAPSED).subscribe(goToCommentsPage(context));
        }

        public final void onError(Throwable throwable)
        {
            super.onError(throwable);
            Toast.makeText(activity, activity.getString(0x7f0700f3), 0).show();
        }

        public final void onNext(PublicApiComment publicapicomment)
        {
            publicapicomment = new com.cocosw.undobar.UndoBarController.b(activity);
            publicapicomment.c = ((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).a.getText(0x7f0700f5);
            publicapicomment.b = createViewCommentBarStyle();
            publicapicomment.f = this;
            if (((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).f == null && ((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).b == null)
            {
                publicapicomment.b = UndoBarController.c;
            }
            if (((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).b == null)
            {
                publicapicomment.b = UndoBarController.a;
            }
            if (((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).c == null)
            {
                publicapicomment.c = "";
            }
            if (((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).d > 0L)
            {
                ((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).b.d = ((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).d;
            }
            UndoBarController.a(((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).a, ((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).c, ((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).f, ((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).e, ((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).b, ((com.cocosw.undobar.UndoBarController.b) (publicapicomment)).g);
        }

        public final volatile void onNext(Object obj)
        {
            onNext((PublicApiComment)obj);
        }

        public final void onUndo(Parcelable parcelable)
        {
            subscribeToCollapsedEvent(activity);
            eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.collapsePlayer());
            eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerClose("comments_open_from_add_comment"));
        }


        CommentAddedSubscriber(Activity activity1, PropertySet propertyset, EventBus eventbus)
        {
            activity = activity1;
            track = propertyset;
            eventBus = eventbus;
        }
    }


    private static final String EXTRA_ORIGIN_SCREEN = "origin";
    private static final String EXTRA_POSITION = "position";
    private static final String EXTRA_TRACK = "track";
    CommentsOperations commentsOperations;
    EventBus eventBus;
    private Y subscription;

    public AddCommentDialogFragment()
    {
        subscription = RxUtils.invalidSubscription();
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static AddCommentDialogFragment create(PropertySet propertyset, long l, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("track", propertyset);
        bundle.putLong("position", l);
        bundle.putString("origin", s);
        propertyset = new AddCommentDialogFragment();
        propertyset.setArguments(bundle);
        return propertyset;
    }

    private void onAddComment(String s)
    {
        PropertySet propertyset = (PropertySet)getArguments().getParcelable("track");
        Urn urn = (Urn)propertyset.get(TrackProperty.URN);
        long l = getArguments().getLong("position");
        FragmentActivity fragmentactivity = (FragmentActivity)getActivity();
        subscription = commentsOperations.addComment(urn, s, l).observeOn(a.a()).subscribe(new CommentAddedSubscriber(fragmentactivity, propertyset, eventBus));
        s = getArguments().getString("origin");
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromComment(s, urn.getNumericId(), EntityMetadata.from(propertyset)));
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = (PropertySet)getArguments().getParcelable("track");
        String s = ScTextUtils.formatTimestamp(getArguments().getLong("position"), TimeUnit.MILLISECONDS);
        View view = View.inflate(getActivity(), 0x7f03004c, null);
        final EditText input = (EditText)view.findViewById(0x7f0f013a);
        input.setHint(getString(0x7f0700f2, new Object[] {
            s
        }));
        return (new android.support.v7.app.AlertDialog.Builder(getActivity())).setTitle(getString(0x7f0700f4, new Object[] {
            bundle.get(TrackProperty.TITLE)
        })).setView(view).setPositiveButton(0x7f0700ae, new _cls1()).setNegativeButton(0x7f0700a6, null).create();
    }

    public void onDestroyView()
    {
        subscription.unsubscribe();
        super.onDestroyView();
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final AddCommentDialogFragment this$0;
        final EditText val$input;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = input.getText().toString();
            if (Strings.isNotBlank(dialoginterface))
            {
                onAddComment(dialoginterface);
                dismiss();
            }
        }

        _cls1()
        {
            this$0 = AddCommentDialogFragment.this;
            input = edittext;
            super();
        }
    }

}
