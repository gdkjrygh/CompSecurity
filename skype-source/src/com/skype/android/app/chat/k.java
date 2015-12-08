// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.LevelListDrawable;
import android.os.Environment;
import android.os.Handler;
import android.os.StatFs;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.Message;
import com.skype.Transfer;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.app.transfer.TransferQueue;
import com.skype.android.app.transfer.TransferThumbnails;
import com.skype.android.app.transfer.TransferType;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            e, MessageViewAdapterComponent, CancelTransferDialog, MessageHolder, 
//            j, f, ChatFragmentProvider

final class k extends e
{
    private final class a
        implements android.view.View.OnClickListener
    {

        final k this$0;
        private Transfer transfer;

        public final void onClick(View view)
        {
            acceptFile(transfer);
            refreshContent();
        }

        public a(Transfer transfer1)
        {
            this$0 = k.this;
            super();
            transfer = transfer1;
        }
    }

    private final class b
    {

        BubbleRelativeLayout bubbleLayout;
        RelativeLayout container;
        TextView failedFilename;
        RelativeLayout failedInfoLayout;
        TextView failedStatus;
        TextView fileSize;
        TextView filename;
        SymbolView icon;
        RelativeLayout infoLayout;
        final boolean isBubbleChained;
        final boolean isOutgoing;
        final int messagePosition;
        CircularProgressBar progressBar;
        ProgressCircleView progressCircleView;
        final k this$0;

        b(View view, int i, boolean flag, boolean flag1)
        {
            this$0 = k.this;
            super();
            container = (RelativeLayout)view;
            bubbleLayout = (BubbleRelativeLayout)ViewUtil.a(view, 0x7f100277);
            icon = (SymbolView)ViewUtil.a(bubbleLayout, 0x7f100278);
            progressBar = (CircularProgressBar)ViewUtil.a(bubbleLayout, 0x7f100279);
            progressCircleView = (ProgressCircleView)ViewUtil.a(bubbleLayout, 0x7f10027a);
            infoLayout = (RelativeLayout)ViewUtil.a(view, 0x7f10027b);
            filename = (TextView)ViewUtil.a(infoLayout, 0x7f10027c);
            fileSize = (TextView)ViewUtil.a(infoLayout, 0x7f10027d);
            failedInfoLayout = (RelativeLayout)ViewUtil.a(view, 0x7f10027e);
            failedFilename = (TextView)ViewUtil.a(failedInfoLayout, 0x7f10027f);
            failedStatus = (TextView)ViewUtil.a(failedInfoLayout, 0x7f100280);
            progressBar.setProgressBackgroundColor(getContext().getResources().getColor(0x7f0f0133));
            progressBar.setProgressColor(getContext().getResources().getColor(0x7f0f013a));
            progressBar.setProgressWidth(getContext().getResources().getDimensionPixelSize(0x7f0c0173));
            isBubbleChained = flag1;
            isOutgoing = flag;
            messagePosition = i;
        }
    }

    private final class c
        implements android.view.View.OnClickListener
    {

        final k this$0;
        private Transfer transfer;

        public final void onClick(View view)
        {
            transferUtil.openFile(transfer, getContext());
        }

        public c(Transfer transfer1)
        {
            this$0 = k.this;
            super();
            transfer = transfer1;
        }
    }

    private static final class d extends f
    {

        TextView downloadAll;
        TextView header;
        LinearLayout outerView;

        public d(View view)
        {
            super(view);
            header = (TextView)ViewUtil.a(getInlineContent(), 0x7f100281);
            downloadAll = (TextView)ViewUtil.a(getInlineContent(), 0x7f100283);
            outerView = (LinearLayout)ViewUtil.a(getInlineContent(), 0x7f100282);
        }
    }


    private static int supportedMessageTypes[];
    private Handler parentHandler;
    TransferThumbnails thumbnails;
    TransferQueue transferQueue;
    TransferUtil transferUtil;

    public k(Activity activity, Handler handler)
    {
        super(activity);
        getComponent().inject(this);
        parentHandler = handler;
        thumbnails.setOnScanCompletedListener(new com.skype.android.app.transfer.TransferThumbnails.OnScanCompletedListener() {

            final k this$0;

            public final void onScanCompleted()
            {
                refreshContent();
            }

            
            {
                this$0 = k.this;
                super();
            }
        });
    }

    private void acceptFile(Transfer transfer)
    {
        android.app.AlertDialog.Builder builder;
        int i;
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long l = statfs.getAvailableBlocks();
            long l1 = statfs.getBlockSize();
            if (Long.parseLong(transfer.getFilesizeProp()) > l * l1)
            {
                transfer = new android.app.AlertDialog.Builder(getContext());
                transfer.setTitle(0x7f080261);
                transfer.setMessage(0x7f080400);
                transfer.setNegativeButton(0x7f0802f6, null);
                transfer.create().show();
                return;
            } else
            {
                transferQueue.addTransfer(transfer);
                return;
            }
        }
        builder = new android.app.AlertDialog.Builder(getContext());
        builder.setTitle(0x7f08026e);
        i = 0x7f0803c8;
        static final class _cls6
        {

            static final int $SwitchMap$com$skype$Transfer$STATUS[];
            static final int $SwitchMap$com$skype$android$app$transfer$TransferType[];
            static final int $SwitchMap$com$skype$android$widget$SymbolElement$SymbolCode[];
            static final int $SwitchMap$com$skype$android$widget$bubbles$Bubblable$Direction[];

            static 
            {
                $SwitchMap$com$skype$android$app$transfer$TransferType = new int[TransferType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$transfer$TransferType[TransferType.IMAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$skype$android$app$transfer$TransferType[TransferType.VIDEO.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                $SwitchMap$com$skype$android$widget$bubbles$Bubblable$Direction = new int[com.skype.android.widget.bubbles.Bubblable.Direction.values().length];
                try
                {
                    $SwitchMap$com$skype$android$widget$bubbles$Bubblable$Direction[com.skype.android.widget.bubbles.Bubblable.Direction.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$skype$android$widget$bubbles$Bubblable$Direction[com.skype.android.widget.bubbles.Bubblable.Direction.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                $SwitchMap$com$skype$android$widget$SymbolElement$SymbolCode = new int[com.skype.android.widget.SymbolElement.SymbolCode.values().length];
                try
                {
                    $SwitchMap$com$skype$android$widget$SymbolElement$SymbolCode[com.skype.android.widget.SymbolElement.SymbolCode.ca.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$skype$android$widget$SymbolElement$SymbolCode[com.skype.android.widget.SymbolElement.SymbolCode.cd.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$android$widget$SymbolElement$SymbolCode[com.skype.android.widget.SymbolElement.SymbolCode.dr.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$android$widget$SymbolElement$SymbolCode[com.skype.android.widget.SymbolElement.SymbolCode.dw.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                $SwitchMap$com$skype$Transfer$STATUS = new int[com.skype.Transfer.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.PAUSED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.CONNECTING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.WAITING_FOR_ACCEPT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.TRANSFERRING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.TRANSFERRING_OVER_RELAY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.NEW.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.PLACEHOLDER.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.OFFER_FROM_OTHER_INSTANCE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.FAILED.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.CANCELLED.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.CANCELLED_BY_REMOTE.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Transfer$STATUS[com.skype.Transfer.STATUS.COMPLETED.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls6..SwitchMap.com.skype.android.app.transfer.TransferType[thumbnails.getType(transfer).ordinal()];
        JVM INSTR tableswitch 1 2: default 168
    //                   1 190
    //                   2 196;
           goto _L1 _L2 _L3
_L1:
        builder.setMessage(i);
        builder.setNegativeButton(0x7f0802f6, null);
        builder.create().show();
        return;
_L2:
        i = 0x7f080412;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 0x7f08044f;
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void alignTransferView(b b1)
    {
        boolean flag = b1.isOutgoing;
        Object obj = b1.container;
        android.widget.RelativeLayout.LayoutParams layoutparams;
        byte byte0;
        if (flag)
        {
            byte0 = 5;
        } else
        {
            byte0 = 3;
        }
        ((RelativeLayout) (obj)).setGravity(byte0);
        obj = (android.widget.RelativeLayout.LayoutParams)b1.bubbleLayout.getLayoutParams();
        layoutparams = (android.widget.RelativeLayout.LayoutParams)b1.infoLayout.getLayoutParams();
        if (flag)
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9, 0);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(((android.widget.RelativeLayout.LayoutParams) (obj)).leftMargin, ((android.widget.RelativeLayout.LayoutParams) (obj)).topMargin, 0, ((android.widget.RelativeLayout.LayoutParams) (obj)).bottomMargin);
            layoutparams.addRule(0, b1.bubbleLayout.getId());
            layoutparams.addRule(1, 0);
            layoutparams.setMargins(0, 0, getContext().getResources().getDimensionPixelSize(0x7f0c0238), 0);
        } else
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11, 0);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(((android.widget.RelativeLayout.LayoutParams) (obj)).leftMargin, ((android.widget.RelativeLayout.LayoutParams) (obj)).topMargin, getContext().getResources().getDimensionPixelSize(0x7f0c0238), ((android.widget.RelativeLayout.LayoutParams) (obj)).bottomMargin);
            layoutparams.addRule(1, b1.bubbleLayout.getId());
            layoutparams.addRule(0, 0);
            layoutparams.setMargins(0, 0, 0, 0);
        }
        b1.bubbleLayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        b1.infoLayout.setLayoutParams(layoutparams);
        b1.failedInfoLayout.setLayoutParams(layoutparams);
    }

    private void clearExtraViews(d d1, int i)
    {
        for (int j = d1.outerView.getChildCount(); j > i; j--)
        {
            d1.outerView.removeViewAt(j - 1);
        }

    }

    private void downloadAll(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Transfer transfer = (Transfer)list.next();
            if (transfer.getStatusProp() == com.skype.Transfer.STATUS.NEW)
            {
                acceptFile(transfer);
            }
        } while (true);
    }

    private void enableClickListenersOnInnerTransferView(b b1, Transfer transfer)
    {
        enableClickForTimestamp(b1.container, b1.messagePosition);
        enableLongClickListenerOnInnerTransferView(b1.container, transfer, b1.messagePosition);
        enableLongClickListenerOnInnerTransferView(b1.bubbleLayout, transfer, b1.messagePosition);
    }

    private void enableLongClickListenerOnInnerTransferView(View view, final Transfer transfer, final int messagePosition)
    {
        view.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final k this$0;
            final int val$messagePosition;
            final Transfer val$transfer;

            public final boolean onLongClick(View view1)
            {
                ((ChatFragmentProvider)getContext()).getChatFragment().onItemLongClick(transfer, messagePosition, true, null);
                return true;
            }

            
            {
                this$0 = k.this;
                transfer = transfer1;
                messagePosition = i;
                super();
            }
        });
    }

    private void getIncomingTransferView(d d1, Message message)
    {
        final List transfers;
        int i;
        boolean flag;
        int j;
        transfers = transferUtil.getTransfers(message);
        j = transfers.size();
        clearExtraViews(d1, transfers.size());
        flag = false;
        i = 0;
_L9:
        Transfer transfer;
        String s;
        b b1;
        long l1;
        boolean flag1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        transfer = (Transfer)transfers.get(i);
        l1 = Long.parseLong(transfer.getFilesizeProp());
        s = transferUtil.queryFileSizeString(l1);
        com.skype.Transfer.STATUS status;
        int l;
        boolean flag2;
        if (d1.outerView.getChildAt(i) != null)
        {
            message = d1.outerView.getChildAt(i);
        } else
        {
            message = inflateInnerTransferView(d1);
        }
        l = d1.getLayoutPosition();
        flag2 = d1.isOutgoing();
        if (i > 0 || d1.isChained())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b1 = new b(message, l, flag2, flag1);
        status = transfer.getStatusProp();
        message = status;
        if (transferQueue.isTransferQueued(transfer))
        {
            message = status;
            if (!transferQueue.isFirstInQueue(transfer))
            {
                message = com.skype.Transfer.STATUS.CONNECTING;
            }
        }
        _cls6..SwitchMap.com.skype.Transfer.STATUS[message.ordinal()];
        JVM INSTR tableswitch 2 12: default 252
    //                   2 333
    //                   3 333
    //                   4 333
    //                   5 333
    //                   6 317
    //                   7 384
    //                   8 348
    //                   9 360
    //                   10 372
    //                   11 372
    //                   12 399;
           goto _L1 _L2 _L2 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L7 _L8
_L1:
        alignTransferView(b1);
        enableClickListenersOnInnerTransferView(b1, transfer);
        if (b1.progressCircleView.getVisibility() != 0 || j > 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        setHolderRecyclability(d1, flag1);
        i++;
        if (true) goto _L9; else goto _L3
_L3:
        setNewStatus(b1, transfer, s);
        flag = true;
          goto _L1
_L2:
        setOngoingStatus(b1, transfer, message, (int)l1);
          goto _L1
_L5:
        setFailedStatus(b1, transfer, message);
          goto _L1
_L6:
        setFailedStatus(b1, transfer, message);
          goto _L1
_L7:
        setFailedStatus(b1, transfer, message);
          goto _L1
_L4:
        setOngoingStatus(b1, transfer, message, (int)l1);
          goto _L1
_L8:
        setCompletedStatus(b1, transfer, message, (int)l1);
          goto _L1
        d1.header.setVisibility(8);
        if (transfers.size() > 1 && flag)
        {
            d1.downloadAll.setVisibility(0);
            d1.downloadAll.setOnClickListener(new android.view.View.OnClickListener() {

                final k this$0;
                final List val$transfers;

                public final void onClick(View view)
                {
                    downloadAll(transfers);
                    refreshContent();
                }

            
            {
                this$0 = k.this;
                transfers = list;
                super();
            }
            });
            return;
        } else
        {
            d1.downloadAll.setVisibility(8);
            return;
        }
    }

    private void getOutgoingTransferView(d d1, Message message)
    {
        Object obj;
        com.skype.Transfer.STATUS status;
        long l;
        message = transferUtil.getTransfers(message);
        clearExtraViews(d1, 1);
        if (message.size() == 1)
        {
            message = (Transfer)message.get(0);
        } else
        {
            message = (Transfer)transferUtil.getRealTransfers(message).get(0);
        }
        if (d1.outerView.getChildAt(0) != null)
        {
            obj = d1.outerView.getChildAt(0);
        } else
        {
            obj = inflateInnerTransferView(d1);
        }
        obj = new b(((View) (obj)), d1.getLayoutPosition(), d1.isOutgoing(), d1.isChained());
        status = message.getStatusProp();
        l = Long.parseLong(message.getFilesizeProp());
        _cls6..SwitchMap.com.skype.Transfer.STATUS[status.ordinal()];
        JVM INSTR tableswitch 1 12: default 168
    //                   1 234
    //                   2 234
    //                   3 234
    //                   4 234
    //                   5 234
    //                   6 248
    //                   7 248
    //                   8 261
    //                   9 272
    //                   10 283
    //                   11 283
    //                   12 294;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L4 _L5 _L6 _L6 _L7
_L1:
        alignTransferView(((b) (obj)));
        enableClickListenersOnInnerTransferView(((b) (obj)), message);
        d1.downloadAll.setVisibility(8);
        d1.header.setVisibility(8);
        setHolderRecyclability(d1, true);
        return;
_L2:
        setOngoingStatus(((b) (obj)), message, status, (int)l);
        continue; /* Loop/switch isn't completed */
_L3:
        setCompletedStatus(((b) (obj)), message, status, l);
        continue; /* Loop/switch isn't completed */
_L4:
        setFailedStatus(((b) (obj)), message, status);
        continue; /* Loop/switch isn't completed */
_L5:
        setFailedStatus(((b) (obj)), message, status);
        continue; /* Loop/switch isn't completed */
_L6:
        setFailedStatus(((b) (obj)), message, status);
        continue; /* Loop/switch isn't completed */
_L7:
        setCompletedStatus(((b) (obj)), message, status, l);
        if (true) goto _L1; else goto _L8
_L8:
    }

    private View inflateInnerTransferView(d d1)
    {
        LayoutInflater.from(getContext()).inflate(0x7f030039, d1.outerView, true);
        int i = d1.outerView.getChildCount();
        return d1.outerView.getChildAt(i - 1);
    }

    private void setCompletedStatus(b b1, Transfer transfer, com.skype.Transfer.STATUS status, long l)
    {
        b1.progressBar.setVisibility(8);
        if (!(new File(transfer.getFilepathProp())).exists()) goto _L2; else goto _L1
_L1:
        TransferType transfertype = TransferType.getDocType(transfer.getFilenameProp());
        showBubble(transfertype, b1);
        setTransferIcon(b1, transfertype.getSymbolCode());
        _cls6..SwitchMap.com.skype.Transfer.STATUS[status.ordinal()];
        JVM INSTR tableswitch 6 7: default 88
    //                   6 128
    //                   7 128;
           goto _L3 _L4 _L4
_L3:
        status = transferUtil.queryFileSizeString(l);
_L5:
        showTransferInfo(b1, transfer.getFilenameProp(), status, false);
        b1.bubbleLayout.setOnClickListener(new c(transfer));
        return;
_L4:
        status = getContext().getString(0x7f0803d5);
        if (true) goto _L5; else goto _L2
_L2:
        showBubbleForFailedTransfer(b1);
        setTransferIcon(b1, com.skype.android.widget.SymbolElement.SymbolCode.dw);
        showTransferInfo(b1, transfer.getFilenameProp(), getContext().getString(0x7f0803c7), true);
        enableClickForTimestamp(b1.bubbleLayout, b1.messagePosition);
        return;
    }

    private void setFailedStatus(b b1, Transfer transfer, com.skype.Transfer.STATUS status)
    {
        b1.progressBar.setVisibility(8);
        showBubbleForFailedTransfer(b1);
        _cls6..SwitchMap.com.skype.Transfer.STATUS[status.ordinal()];
        JVM INSTR tableswitch 8 11: default 52
    //                   8 97
    //                   9 52
    //                   10 111
    //                   11 111;
           goto _L1 _L2 _L1 _L3 _L3
_L1:
        status = getContext().getString(0x7f0803be);
_L5:
        showTransferInfo(b1, transfer.getFilenameProp(), status, true);
        setTransferIcon(b1, com.skype.android.widget.SymbolElement.SymbolCode.dr);
        enableClickForTimestamp(b1.bubbleLayout, b1.messagePosition);
        return;
_L2:
        status = getContext().getString(0x7f0803c7);
        continue; /* Loop/switch isn't completed */
_L3:
        status = getContext().getString(0x7f080386);
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void setHolderRecyclability(d d1, boolean flag)
    {
        if (flag && !d1.isRecyclable())
        {
            d1.setIsRecyclable(true);
        } else
        if (!flag && d1.isRecyclable())
        {
            d1.setIsRecyclable(false);
            return;
        }
    }

    private void setNewStatus(b b1, Transfer transfer, String s)
    {
        showBubble(transfer, b1);
        showTransferInfo(b1, transfer.getFilenameProp(), s, false);
        b1.progressBar.setVisibility(8);
        setTransferIcon(b1, com.skype.android.widget.SymbolElement.SymbolCode.cd);
        transfer = new a(transfer);
        b1.bubbleLayout.setOnClickListener(transfer);
    }

    private void setOngoingStatus(b b1, Transfer transfer, com.skype.Transfer.STATUS status, int i)
    {
        String s;
        String s1;
        String s2;
        boolean flag;
        boolean flag1;
        int l;
        showBubble(transfer, b1);
        l = Integer.parseInt(transfer.getBytestransferredProp());
        int j = (int)((long)transfer.getFinishtimeProp() - System.currentTimeMillis() / 1000L);
        s2 = transferUtil.queryFileSizeString(i);
        s = transferUtil.queryFinishTimeString(j);
        flag1 = false;
        if (TextUtils.isEmpty(s))
        {
            s = s2;
        } else
        {
            s = getContext().getString(0x7f0803c6, new Object[] {
                s2, s
            });
        }
        flag = flag1;
        s1 = s;
        _cls6..SwitchMap.com.skype.Transfer.STATUS[status.ordinal()];
        JVM INSTR tableswitch 1 7: default 132
    //                   1 217
    //                   2 217
    //                   3 217
    //                   4 298
    //                   5 298
    //                   6 140
    //                   7 340;
           goto _L1 _L2 _L2 _L2 _L3 _L3 _L4 _L5
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        s1 = s;
        flag = flag1;
_L7:
        showTransferInfo(b1, transfer.getFilenameProp(), s1, false);
        if (!flag)
        {
            if (transfer.getTypeProp() != com.skype.Transfer.TYPE.OUTGOING)
            {
                break; /* Loop/switch isn't completed */
            }
            b1.bubbleLayout.setOnClickListener(new c(transfer));
        }
        return;
_L2:
        b1.progressBar.setVisibility(8);
        status = getContext().getString(0x7f0803cd);
        s1 = getContext().getString(0x7f0803c6, new Object[] {
            s2, status
        });
        if (transfer.getTypeProp() == com.skype.Transfer.TYPE.OUTGOING)
        {
            setupCancelState(transfer, b1);
            flag = true;
        } else
        {
            showIndeterminateProgressState(b1);
            flag = flag1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        b1.progressBar.setVisibility(0);
        b1.progressBar.setMax(i);
        b1.progressBar.setProgress(l);
        setupCancelState(transfer, b1);
        flag = true;
        s1 = s;
        continue; /* Loop/switch isn't completed */
_L5:
        b1.progressBar.setVisibility(8);
        showIndeterminateProgressState(b1);
        s1 = getContext().getString(0x7f0803d5);
        flag = flag1;
        if (true) goto _L7; else goto _L6
_L6:
        enableClickForTimestamp(b1.bubbleLayout, b1.messagePosition);
        return;
    }

    private void setTransferIcon(b b1, com.skype.android.widget.SymbolElement.SymbolCode symbolcode)
    {
        SymbolView symbolview;
        int i;
        symbolview = b1.icon;
        symbolview.setSymbolCode(symbolcode);
        symbolview.setVisibility(0);
        i = 0x7f0f0135;
        _cls6..SwitchMap.com.skype.android.widget.SymbolElement.SymbolCode[symbolcode.ordinal()];
        JVM INSTR tableswitch 1 4: default 60
    //                   1 137
    //                   2 137
    //                   3 150
    //                   4 150;
           goto _L1 _L2 _L2 _L3 _L3
_L1:
        int j;
        int l;
        l = 0x7f0e001d;
        j = 0x7f0c0171;
_L4:
        ((LevelListDrawable)symbolview.getBackground()).setLevel(getContext().getResources().getInteger(l));
        symbolview.setTextSize(0, getContext().getResources().getDimensionPixelSize(j));
        symbolview.setTextColor(getContext().getResources().getColor(i));
        b1.progressCircleView.setVisibility(8);
        return;
_L2:
        l = 0x7f0e001c;
        j = 0x7f0c016e;
        if (true) goto _L4; else goto _L3
_L3:
        i = 0x7f0f013a;
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void setupCancelState(final Transfer transfer, b b1)
    {
        setTransferIcon(b1, com.skype.android.widget.SymbolElement.SymbolCode.ca);
        b1.bubbleLayout.setOnClickListener(new android.view.View.OnClickListener() {

            final k this$0;
            final Transfer val$transfer;

            public final void onClick(View view)
            {
                showCancelTransferDialog(transfer);
            }

            
            {
                this$0 = k.this;
                transfer = transfer1;
                super();
            }
        });
    }

    private void showBubble(Transfer transfer, b b1)
    {
        showBubble(TransferType.getDocType(transfer.getFilenameProp()), b1);
    }

    private void showBubble(b b1, int i)
    {
        int j;
        int l;
        com.skype.android.widget.bubbles.Bubblable.Direction direction;
        if (b1.isOutgoing)
        {
            direction = com.skype.android.widget.bubbles.Bubblable.Direction.b;
        } else
        {
            direction = com.skype.android.widget.bubbles.Bubblable.Direction.a;
        }
        b1.bubbleLayout.setDirectionState(direction, b1.isBubbleChained);
        j = 0;
        l = 0;
        _cls6..SwitchMap.com.skype.android.widget.bubbles.Bubblable.Direction[direction.ordinal()];
        JVM INSTR tableswitch 1 2: default 60
    //                   1 118
    //                   2 136;
           goto _L1 _L2 _L3
_L1:
        b1.bubbleLayout.setPadding(j, b1.bubbleLayout.getPaddingTop(), l, b1.bubbleLayout.getPaddingBottom());
        ((LevelListDrawable)b1.bubbleLayout.getBackground()).setLevel(getContext().getResources().getInteger(i));
        return;
_L2:
        j = getContext().getResources().getDimensionPixelSize(0x7f0c015c);
        continue; /* Loop/switch isn't completed */
_L3:
        l = getContext().getResources().getDimensionPixelSize(0x7f0c015c);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void showBubble(TransferType transfertype, b b1)
    {
        showBubble(b1, transfertype.getBackgroundLevelResId());
    }

    private void showBubbleForFailedTransfer(b b1)
    {
        showBubble(b1, 0x7f0e0010);
    }

    private void showCancelTransferDialog(Transfer transfer)
    {
        transfer = (CancelTransferDialog)SkypeDialogFragment.create(transfer, com/skype/android/app/chat/CancelTransferDialog);
        transfer.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final k this$0;

            public final void onDismiss(DialogInterface dialoginterface)
            {
                refreshContent();
            }

            
            {
                this$0 = k.this;
                super();
            }
        });
        transfer.show(((FragmentActivity)getContext()).getSupportFragmentManager());
    }

    private void showIndeterminateProgressState(b b1)
    {
        if (b1.progressCircleView.getVisibility() != 0)
        {
            b1.progressCircleView.setVisibility(0);
        }
        b1.progressBar.setVisibility(8);
        b1.icon.setVisibility(8);
    }

    private void showTransferInfo(b b1, String s, String s1, boolean flag)
    {
        if (flag)
        {
            b1.infoLayout.setVisibility(8);
            b1.failedInfoLayout.setVisibility(0);
            b1.failedFilename.setText(s);
            b1.failedStatus.setText(s1);
            return;
        } else
        {
            b1.failedInfoLayout.setVisibility(8);
            b1.infoLayout.setVisibility(0);
            b1.filename.setText(s);
            b1.fileSize.setText(s1);
            return;
        }
    }

    protected final void bindContentView(j j, MessageHolder messageholder)
    {
        j = (d)j;
        messageholder = (Message)messageholder.getMessageObject();
        List list = transferUtil.getTransfers(messageholder);
        if (list.size() == 0)
        {
            ((d) (j)).header.setText(getContext().getString(0x7f080449));
            ((d) (j)).outerView.setVisibility(8);
            ((d) (j)).downloadAll.setVisibility(8);
            return;
        }
        if (((Transfer)list.get(0)).getTypeProp() == com.skype.Transfer.TYPE.OUTGOING)
        {
            getOutgoingTransferView(j, messageholder);
            return;
        } else
        {
            getIncomingTransferView(j, messageholder);
            return;
        }
    }

    protected final j createMessageViewHolder(View view)
    {
        return new d(view);
    }

    protected final int getLayoutId(int i)
    {
        return 0x7f03003a;
    }

    public final int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    protected final void refreshContent()
    {
        parentHandler.sendEmptyMessage(0);
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.POSTED_FILES.toInt()
        });
    }



}
