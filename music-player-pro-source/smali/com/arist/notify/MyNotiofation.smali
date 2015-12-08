.class public Lcom/arist/notify/MyNotiofation;
.super Ljava/lang/Object;
.source "MyNotiofation.java"


# static fields
.field public static final NOTIFICATION_ID:I = 0x759bc70


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static api16BigContentView(Landroid/app/Notification;Landroid/widget/RemoteViews;)V
    .locals 2
    .param p0, "notification"    # Landroid/app/Notification;
    .param p1, "remoteViews"    # Landroid/widget/RemoteViews;
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 92
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 93
    iput-object p1, p0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 95
    :cond_0
    return-void
.end method

.method public static clearNotification()V
    .locals 3

    .prologue
    .line 113
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    .line 114
    const-string v2, "notification"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 113
    check-cast v0, Landroid/app/NotificationManager;

    .line 115
    .local v0, "notificationManager":Landroid/app/NotificationManager;
    const v1, 0x759bc70

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 116
    return-void
.end method

.method private static getinten(Landroid/content/Context;Landroid/widget/RemoteViews;Landroid/app/NotificationManager;Lcom/arist/entity/Music;)Landroid/app/PendingIntent;
    .locals 5
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "remoteViews"    # Landroid/widget/RemoteViews;
    .param p2, "manager"    # Landroid/app/NotificationManager;
    .param p3, "music"    # Lcom/arist/entity/Music;

    .prologue
    .line 99
    const/4 v0, 0x0

    .line 102
    .local v0, "intent":Landroid/app/PendingIntent;
    const/4 v2, 0x1

    new-instance v3, Landroid/content/Intent;

    .line 103
    const-string v4, "com.MediaPlayer.action.WIDGET_PLAY"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 104
    const/high16 v4, 0x8000000

    .line 102
    invoke-static {p0, v2, v3, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 106
    sget v2, Lcom/arist/MusicPlayer/MyApplication;->status:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const v1, 0x7f02009b

    .line 108
    .local v1, "playButton":I
    :goto_0
    const v2, 0x7f0d008e

    invoke-virtual {p1, v2, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 109
    return-object v0

    .line 107
    .end local v1    # "playButton":I
    :cond_0
    const v1, 0x7f02009a

    goto :goto_0
.end method

.method public static sendNotify(Landroid/content/Context;Landroid/app/NotificationManager;)V
    .locals 10
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "manager"    # Landroid/app/NotificationManager;

    .prologue
    const v5, 0x7f0d0041

    const/high16 v9, 0x40000000    # 2.0f

    const v8, 0x759bc70

    .line 24
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v3

    if-nez v3, :cond_0

    .line 87
    :goto_0
    return-void

    .line 27
    :cond_0
    new-instance v1, Landroid/app/Notification;

    .line 28
    const v3, 0x1080024

    .line 29
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v4

    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 27
    invoke-direct {v1, v3, v4, v6, v7}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 31
    .local v1, "notification":Landroid/app/Notification;
    new-instance v2, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 32
    const v4, 0x7f03001f

    .line 31
    invoke-direct {v2, v3, v4}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 35
    .local v2, "remoteViews":Landroid/widget/RemoteViews;
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v3

    .line 34
    invoke-static {v3}, Lcom/arist/util/AlbumPicUtil;->getAlbumBitmap(Lcom/arist/entity/Music;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 36
    .local v0, "bmp":Landroid/graphics/Bitmap;
    if-eqz v0, :cond_2

    .line 37
    invoke-virtual {v2, v5, v0}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    .line 43
    :goto_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xb

    if-lt v3, v4, :cond_1

    .line 46
    const v3, 0x7f0d0092

    .line 48
    new-instance v4, Landroid/content/Intent;

    const-string v5, "com.MediaPlayer.action.WIDGET_PREVIOUS"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 47
    invoke-static {p0, v8, v4, v9}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 46
    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 52
    const v3, 0x7f0d008e

    .line 54
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v4

    .line 53
    invoke-static {p0, v2, p1, v4}, Lcom/arist/notify/MyNotiofation;->getinten(Landroid/content/Context;Landroid/widget/RemoteViews;Landroid/app/NotificationManager;Lcom/arist/entity/Music;)Landroid/app/PendingIntent;

    move-result-object v4

    .line 51
    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 57
    const v3, 0x7f0d008f

    .line 59
    new-instance v4, Landroid/content/Intent;

    const-string v5, "com.MediaPlayer.action.WIDGET_NEXT"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 58
    invoke-static {p0, v8, v4, v9}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 57
    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 63
    const v3, 0x7f0d0090

    .line 65
    new-instance v4, Landroid/content/Intent;

    const-string v5, "com.MediaPlayer.action.WIDGET_EXIT"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 64
    invoke-static {p0, v8, v4, v9}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 63
    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 68
    :cond_1
    const v3, 0x7f0d008c

    .line 69
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v4

    .line 68
    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 70
    const v3, 0x7f0d008d

    .line 71
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/entity/Music;->getArtist()Ljava/lang/String;

    move-result-object v4

    .line 70
    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 74
    iput-object v2, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 75
    invoke-static {v1, v2}, Lcom/arist/notify/MyNotiofation;->api16BigContentView(Landroid/app/Notification;Landroid/widget/RemoteViews;)V

    .line 78
    const/4 v3, 0x0

    .line 79
    new-instance v4, Landroid/content/Intent;

    const-class v5, Lcom/arist/MusicPlayer/MusicPlayActivity;

    invoke-direct {v4, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 80
    const/high16 v5, 0x8000000

    .line 78
    invoke-static {p0, v3, v4, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    iput-object v3, v1, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 82
    iget v3, v1, Landroid/app/Notification;->flags:I

    or-int/lit8 v3, v3, 0x20

    iput v3, v1, Landroid/app/Notification;->flags:I

    .line 84
    iget v3, v1, Landroid/app/Notification;->flags:I

    or-int/lit8 v3, v3, 0x1

    iput v3, v1, Landroid/app/Notification;->flags:I

    .line 86
    invoke-virtual {p1, v8, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto/16 :goto_0

    .line 40
    :cond_2
    const v3, 0x7f020056

    .line 39
    invoke-virtual {v2, v5, v3}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    goto/16 :goto_1
.end method
