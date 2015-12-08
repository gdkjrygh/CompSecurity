.class Lcom/arist/service/MusicDownloadService$1;
.super Landroid/os/Handler;
.source "MusicDownloadService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/service/MusicDownloadService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/service/MusicDownloadService;


# direct methods
.method constructor <init>(Lcom/arist/service/MusicDownloadService;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    .line 59
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 14
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    const/16 v13, 0x3e8

    const/4 v12, 0x1

    const-wide/16 v10, 0x0

    const v8, 0x7f0d0038

    const/4 v9, 0x0

    .line 63
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 139
    :goto_0
    :pswitch_0
    return-void

    .line 66
    :pswitch_1
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    const v5, 0x7f08007f

    invoke-virtual {v4, v5}, Lcom/arist/service/MusicDownloadService;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    iget-object v4, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 65
    invoke-static {v2, v3, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 69
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 72
    :pswitch_2
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v3, 0x7f0d0037

    .line 73
    new-instance v4, Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->musicName:Ljava/lang/String;
    invoke-static {v5}, Lcom/arist/service/MusicDownloadService;->access$1(Lcom/arist/service/MusicDownloadService;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, ".mp3"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 72
    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 74
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v3, 0x7f0d003a

    .line 75
    iget-object v4, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # invokes: Lcom/arist/service/MusicDownloadService;->formatFileLength(J)Ljava/lang/String;
    invoke-static {v4, v10, v11}, Lcom/arist/service/MusicDownloadService;->access$2(Lcom/arist/service/MusicDownloadService;J)Ljava/lang/String;

    move-result-object v4

    .line 74
    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 76
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->fileLength:J
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$3(Lcom/arist/service/MusicDownloadService;)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->fileLength:J
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$3(Lcom/arist/service/MusicDownloadService;)J

    move-result-wide v2

    cmp-long v2, v2, v10

    if-nez v2, :cond_1

    .line 77
    :cond_0
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 78
    iget-object v3, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # invokes: Lcom/arist/service/MusicDownloadService;->formatFileLength(J)Ljava/lang/String;
    invoke-static {v3, v10, v11}, Lcom/arist/service/MusicDownloadService;->access$2(Lcom/arist/service/MusicDownloadService;J)Ljava/lang/String;

    move-result-object v3

    .line 77
    invoke-virtual {v2, v8, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 79
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v3, 0x7f0d003b

    invoke-virtual {v2, v3, v9, v9, v12}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 89
    :goto_1
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->manager:Landroid/app/NotificationManager;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$4(Lcom/arist/service/MusicDownloadService;)Landroid/app/NotificationManager;

    move-result-object v2

    iget-object v3, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v3}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v3

    invoke-virtual {v2, v13, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto/16 :goto_0

    .line 83
    :cond_1
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 84
    iget-object v3, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    iget-object v4, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->fileLength:J
    invoke-static {v4}, Lcom/arist/service/MusicDownloadService;->access$3(Lcom/arist/service/MusicDownloadService;)J

    move-result-wide v4

    # invokes: Lcom/arist/service/MusicDownloadService;->formatFileLength(J)Ljava/lang/String;
    invoke-static {v3, v4, v5}, Lcom/arist/service/MusicDownloadService;->access$2(Lcom/arist/service/MusicDownloadService;J)Ljava/lang/String;

    move-result-object v3

    .line 83
    invoke-virtual {v2, v8, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 85
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v3, 0x7f0d003b

    .line 86
    iget-object v4, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->fileLength:J
    invoke-static {v4}, Lcom/arist/service/MusicDownloadService;->access$3(Lcom/arist/service/MusicDownloadService;)J

    move-result-wide v4

    long-to-int v4, v4

    .line 85
    invoke-virtual {v2, v3, v4, v9, v9}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    goto :goto_1

    .line 93
    :pswitch_3
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v3, 0x7f0d0037

    .line 94
    new-instance v4, Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->musicName:Ljava/lang/String;
    invoke-static {v5}, Lcom/arist/service/MusicDownloadService;->access$1(Lcom/arist/service/MusicDownloadService;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, ".mp3"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 93
    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 96
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v3, 0x7f0d003a

    .line 97
    iget-object v4, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    iget v5, p1, Landroid/os/Message;->arg1:I

    mul-int/lit16 v5, v5, 0x400

    int-to-long v6, v5

    # invokes: Lcom/arist/service/MusicDownloadService;->formatFileLength(J)Ljava/lang/String;
    invoke-static {v4, v6, v7}, Lcom/arist/service/MusicDownloadService;->access$2(Lcom/arist/service/MusicDownloadService;J)Ljava/lang/String;

    move-result-object v4

    .line 96
    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 100
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->fileLength:J
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$3(Lcom/arist/service/MusicDownloadService;)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->fileLength:J
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$3(Lcom/arist/service/MusicDownloadService;)J

    move-result-wide v2

    cmp-long v2, v2, v10

    if-nez v2, :cond_3

    .line 101
    :cond_2
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 102
    iget-object v3, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    iget v4, p1, Landroid/os/Message;->arg1:I

    mul-int/lit16 v4, v4, 0x400

    int-to-long v4, v4

    # invokes: Lcom/arist/service/MusicDownloadService;->formatFileLength(J)Ljava/lang/String;
    invoke-static {v3, v4, v5}, Lcom/arist/service/MusicDownloadService;->access$2(Lcom/arist/service/MusicDownloadService;J)Ljava/lang/String;

    move-result-object v3

    .line 101
    invoke-virtual {v2, v8, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 110
    :goto_2
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->manager:Landroid/app/NotificationManager;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$4(Lcom/arist/service/MusicDownloadService;)Landroid/app/NotificationManager;

    move-result-object v2

    iget-object v3, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v3}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v3

    invoke-virtual {v2, v13, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto/16 :goto_0

    .line 104
    :cond_3
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 105
    iget-object v3, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    iget-object v4, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->fileLength:J
    invoke-static {v4}, Lcom/arist/service/MusicDownloadService;->access$3(Lcom/arist/service/MusicDownloadService;)J

    move-result-wide v4

    # invokes: Lcom/arist/service/MusicDownloadService;->formatFileLength(J)Ljava/lang/String;
    invoke-static {v3, v4, v5}, Lcom/arist/service/MusicDownloadService;->access$2(Lcom/arist/service/MusicDownloadService;J)Ljava/lang/String;

    move-result-object v3

    .line 104
    invoke-virtual {v2, v8, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 106
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;

    move-result-object v2

    iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v3, 0x7f0d003b

    .line 107
    iget-object v4, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->fileLength:J
    invoke-static {v4}, Lcom/arist/service/MusicDownloadService;->access$3(Lcom/arist/service/MusicDownloadService;)J

    move-result-wide v4

    long-to-int v4, v4

    iget v5, p1, Landroid/os/Message;->arg1:I

    mul-int/lit16 v5, v5, 0x400

    .line 106
    invoke-virtual {v2, v3, v4, v5, v9}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    goto :goto_2

    .line 113
    :pswitch_4
    new-instance v1, Landroid/app/Notification;

    .line 114
    const v2, 0x7f020064

    .line 115
    iget-object v3, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    const v4, 0x7f080080

    invoke-virtual {v3, v4}, Lcom/arist/service/MusicDownloadService;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 116
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 113
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 117
    .local v1, "noti1":Landroid/app/Notification;
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    .line 118
    iget-object v3, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    const v4, 0x7f080080

    invoke-virtual {v3, v4}, Lcom/arist/service/MusicDownloadService;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 119
    new-instance v4, Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    const v6, 0x7f080081

    invoke-virtual {v5, v6}, Lcom/arist/service/MusicDownloadService;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    iget-object v5, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->musicName:Ljava/lang/String;
    invoke-static {v5}, Lcom/arist/service/MusicDownloadService;->access$1(Lcom/arist/service/MusicDownloadService;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 119
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 121
    iget-object v5, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    new-instance v6, Landroid/content/Intent;

    .line 122
    iget-object v7, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    .line 123
    const-class v8, Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {v6, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 124
    const/high16 v7, 0x8000000

    .line 120
    invoke-static {v5, v9, v6, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    .line 117
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 125
    const/16 v2, 0x10

    iput v2, v1, Landroid/app/Notification;->flags:I

    .line 126
    const/4 v2, 0x4

    iput v2, v1, Landroid/app/Notification;->defaults:I

    .line 127
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->manager:Landroid/app/NotificationManager;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$4(Lcom/arist/service/MusicDownloadService;)Landroid/app/NotificationManager;

    move-result-object v2

    invoke-virtual {v2, v12, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 129
    .end local v1    # "noti1":Landroid/app/Notification;
    :pswitch_5
    new-instance v0, Landroid/content/Intent;

    .line 130
    const-string v2, "com.MediaPlayer.action.UPDATE_NETMUEIC_VIEW"

    .line 129
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 132
    .local v0, "intent":Landroid/content/Intent;
    const-string v2, "name"

    iget-object v3, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->musicName:Ljava/lang/String;
    invoke-static {v3}, Lcom/arist/service/MusicDownloadService;->access$1(Lcom/arist/service/MusicDownloadService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 133
    const-string v2, "albumName"

    iget-object v3, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->albumName:Ljava/lang/String;
    invoke-static {v3}, Lcom/arist/service/MusicDownloadService;->access$5(Lcom/arist/service/MusicDownloadService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 135
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    invoke-virtual {v2, v0}, Lcom/arist/service/MusicDownloadService;->sendBroadcast(Landroid/content/Intent;)V

    .line 136
    iget-object v2, p0, Lcom/arist/service/MusicDownloadService$1;->this$0:Lcom/arist/service/MusicDownloadService;

    # getter for: Lcom/arist/service/MusicDownloadService;->manager:Landroid/app/NotificationManager;
    invoke-static {v2}, Lcom/arist/service/MusicDownloadService;->access$4(Lcom/arist/service/MusicDownloadService;)Landroid/app/NotificationManager;

    move-result-object v2

    invoke-virtual {v2, v13}, Landroid/app/NotificationManager;->cancel(I)V

    goto/16 :goto_0

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
