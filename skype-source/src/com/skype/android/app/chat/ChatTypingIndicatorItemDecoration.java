// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.Participant;
import com.skype.android.animation.SkypeAbstractAnimatorSet;
import com.skype.android.animation.SkypePropertyAnimatorSet;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.PathType;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.skype.android.app.chat:
//            MessageAdapter

public class ChatTypingIndicatorItemDecoration extends android.support.v7.widget.RecyclerView.g
    implements android.view.View.OnLayoutChangeListener
{
    private final class a
    {

        private Contact contact;
        private Participant participant;
        final ChatTypingIndicatorItemDecoration this$0;

        public final boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                return obj.hashCode() == hashCode();
            } else
            {
                return super.equals(obj);
            }
        }

        public final Contact getContact()
        {
            if (contact == null)
            {
                contact = conversationUtil.a(participant.getIdentityProp());
            }
            return contact;
        }

        public final int hashCode()
        {
            if (participant != null)
            {
                return participant.hashCode();
            } else
            {
                return super.hashCode();
            }
        }

        public a(Participant participant1)
        {
            this$0 = ChatTypingIndicatorItemDecoration.this;
            super();
            participant = participant1;
        }
    }


    private static final long ANIMATION_IN_DURATION = 500L;
    private static final long ANIMATION_OUT_DURATION = 200L;
    private MessageAdapter adapter;
    private boolean animationRunning;
    private ContactUtil contactUtil;
    private ConversationUtil conversationUtil;
    private LinearLayoutManager layoutManager;
    private List participantsTyping;
    private RecyclerView recyclerView;
    private Resources resources;
    private PathClippedImageView typingIndicatorAvatar;
    private TextView typingIndicatorText;
    private View typingIndicatorView;
    private final int typingIndicatorViewHeight;

    public ChatTypingIndicatorItemDecoration(RecyclerView recyclerview, ConversationUtil conversationutil, ContactUtil contactutil)
    {
        conversationUtil = conversationutil;
        contactUtil = contactutil;
        recyclerView = recyclerview;
        adapter = (MessageAdapter)recyclerview.getAdapter();
        layoutManager = (LinearLayoutManager)recyclerview.getLayoutManager();
        resources = recyclerview.getResources();
        typingIndicatorViewHeight = recyclerview.getResources().getDimensionPixelSize(0x7f0c0083);
        inflateTypingIndicatorView(recyclerview);
        participantsTyping = new LinkedList();
        recyclerview.addOnLayoutChangeListener(this);
    }

    private int getDecoratedBottom(int i)
    {
        return layoutManager.getDecoratedBottom(layoutManager.findViewByPosition(i));
    }

    private boolean hasTypingIndicator(int i)
    {
        return i == adapter.getItemCount() - 1;
    }

    private void inflateTypingIndicatorView(RecyclerView recyclerview)
    {
        typingIndicatorView = LayoutInflater.from(recyclerview.getContext()).inflate(0x7f03004f, recyclerview, false);
        typingIndicatorView.setLayoutParams(new android.support.v7.widget.RecyclerView.j(-1));
        typingIndicatorText = (TextView)ViewUtil.a(typingIndicatorView, 0x7f1002d4);
        typingIndicatorAvatar = (PathClippedImageView)ViewUtil.a(typingIndicatorView, 0x7f1002d3);
    }

    private void invalidate()
    {
        recyclerView.invalidate();
    }

    private void onAnimationIn()
    {
        if (!animationRunning)
        {
            animationRunning = true;
            typingIndicatorAvatar.setTranslationY(typingIndicatorViewHeight);
            SkypePropertyAnimatorSet.a(typingIndicatorAvatar, View.TRANSLATION_Y.getName(), typingIndicatorViewHeight).a(500L);
            typingIndicatorText.setTranslationX(0.0F);
            typingIndicatorText.setTranslationY(0.0F);
            SkypePropertyAnimatorSet skypepropertyanimatorset = new SkypePropertyAnimatorSet(typingIndicatorText, View.TRANSLATION_X.getName());
            skypepropertyanimatorset.a(0.0F, 0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a());
            skypepropertyanimatorset.a(0.5F, typingIndicatorText.getResources().getDimensionPixelSize(0x7f0c0239), com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b());
            skypepropertyanimatorset.a(1.0F, 0.0F, null);
            skypepropertyanimatorset.a(new AnimatorListenerAdapter() {

                final ChatTypingIndicatorItemDecoration this$0;

                public final void onAnimationEnd(Animator animator)
                {
                    animationRunning = false;
                }

            
            {
                this$0 = ChatTypingIndicatorItemDecoration.this;
                super();
            }
            });
            skypepropertyanimatorset.a(500L);
            typingIndicatorText.setAlpha(0.0F);
            typingIndicatorText.animate().alpha(1.0F).setStartDelay(200L).setDuration(50L).setListener(null);
        }
    }

    private void onAnimationOut()
    {
        if (!animationRunning)
        {
            animationRunning = true;
            typingIndicatorAvatar.animate().translationY(typingIndicatorViewHeight).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setStartDelay(0L);
            typingIndicatorText.animate().translationY(typingIndicatorViewHeight).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setListener(new AnimatorListenerAdapter() {

                final ChatTypingIndicatorItemDecoration this$0;

                public final void onAnimationEnd(Animator animator)
                {
                    animationRunning = false;
                }

            
            {
                this$0 = ChatTypingIndicatorItemDecoration.this;
                super();
            }
            }).setStartDelay(0L);
        }
    }

    private void updateParticipantTypingIndicator()
    {
        Object obj;
        Contact contact;
        String s;
        if (participantsTyping.isEmpty())
        {
            return;
        }
        obj = participantsTyping.listIterator(participantsTyping.size());
        contact = ((a)((ListIterator) (obj)).previous()).getContact();
        s = contact.getDisplaynameProp();
        participantsTyping.size();
        JVM INSTR tableswitch 1 2: default 84
    //                   1 147
    //                   2 172;
           goto _L1 _L2 _L3
_L1:
        obj = String.format(resources.getString(0x7f08039d), new Object[] {
            s, Integer.valueOf(participantsTyping.size() - 1)
        });
_L5:
        typingIndicatorText.setText(((CharSequence) (obj)));
        contactUtil.a(contact, typingIndicatorAvatar, PathType.a);
        return;
_L2:
        obj = String.format(resources.getString(0x7f08039c), new Object[] {
            s
        });
        continue; /* Loop/switch isn't completed */
_L3:
        obj = String.format(resources.getString(0x7f08039e), new Object[] {
            s, ((a)((ListIterator) (obj)).previous()).getContact().getDisplaynameProp()
        });
        if (true) goto _L5; else goto _L4
_L4:
    }

    void addParticipantTypingIndicator(Participant participant)
    {
        participant = new a(participant);
        if (!participantsTyping.contains(participant))
        {
            participantsTyping.add(participant);
            updateParticipantTypingIndicator();
            if (participantsTyping.size() == 1)
            {
                onAnimationIn();
            }
            invalidate();
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
    {
        super.getItemOffsets(rect, view, recyclerview, s);
        if (hasTypingIndicator(recyclerview.getChildPosition(view)))
        {
            rect.bottom = rect.bottom + typingIndicatorViewHeight;
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
    {
        super.onDraw(canvas, recyclerview, s);
        if (recyclerview.getChildCount() > 0 && adapter.getItemCount() > 0)
        {
            int i = layoutManager.findLastVisibleItemPosition();
            if (hasTypingIndicator(i) && (!participantsTyping.isEmpty() || animationRunning))
            {
                canvas.save();
                canvas.translate(0.0F, getDecoratedBottom(i) - typingIndicatorViewHeight);
                typingIndicatorView.draw(canvas);
                canvas.restore();
                if (animationRunning)
                {
                    invalidate();
                }
            }
        }
    }

    public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        if (k - i > 0)
        {
            typingIndicatorView.measure(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(typingIndicatorViewHeight * 2, 0x40000000));
            typingIndicatorView.layout(0, 0, typingIndicatorView.getMeasuredWidth(), typingIndicatorView.getMeasuredHeight());
            recyclerView.removeOnLayoutChangeListener(this);
        }
    }

    public void onNewMessage()
    {
        animationRunning = false;
        invalidate();
    }

    void removeParticipantTypingIndicator(Participant participant)
    {
        participantsTyping.remove(new a(participant));
        if (participantsTyping.isEmpty())
        {
            onAnimationOut();
        } else
        {
            updateParticipantTypingIndicator();
        }
        invalidate();
    }


/*
    static boolean access$002(ChatTypingIndicatorItemDecoration chattypingindicatoritemdecoration, boolean flag)
    {
        chattypingindicatoritemdecoration.animationRunning = flag;
        return flag;
    }

*/

}
