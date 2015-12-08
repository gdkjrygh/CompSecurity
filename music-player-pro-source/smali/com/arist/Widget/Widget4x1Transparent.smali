.class public Lcom/arist/Widget/Widget4x1Transparent;
.super Landroid/appwidget/AppWidgetProvider;
.source "Widget4x1Transparent.java"


# instance fields
.field private intentSend:Landroid/content/Intent;

.field private pendingIntent:Landroid/app/PendingIntent;

.field private views:Landroid/widget/RemoteViews;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    const v7, 0x7f0d00b4

    const v6, 0x7f0d002c

    const/4 v8, 0x0

    .line 27
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    .line 28
    .local v0, "awm":Landroid/appwidget/AppWidgetManager;
    iget-object v3, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    if-nez v3, :cond_0

    .line 29
    new-instance v3, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 30
    const v5, 0x7f030028

    invoke-direct {v3, v4, v5}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 29
    iput-object v3, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    .line 33
    :cond_0
    const-string v3, "com.MediaPlayer.action.MEDIAPLAYER_INFO"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 34
    const-string v3, "musicProgress"

    invoke-virtual {p2, v3, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 36
    .local v2, "currentTime":I
    iget-object v3, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    const v4, 0x7f0d00b6

    const/16 v5, 0x3e8

    .line 37
    mul-int/lit16 v6, v2, 0x3e8

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicDuration()I

    move-result v7

    div-int/2addr v6, v7

    .line 36
    invoke-virtual {v3, v4, v5, v6, v8}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 39
    new-instance v3, Landroid/content/ComponentName;

    .line 40
    const-class v4, Lcom/arist/Widget/Widget4x1Transparent;

    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v4, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    .line 39
    invoke-virtual {v0, v3, v4}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V

    .line 74
    .end local v2    # "currentTime":I
    :goto_0
    return-void

    .line 43
    :cond_1
    const-string v3, "com.MediaPlayer.action.MUSIC_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 44
    iget-object v3, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    .line 45
    const v4, 0x7f0d00b5

    .line 46
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, " - "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 47
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicArtist()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 46
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 44
    invoke-virtual {v3, v4, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 48
    new-instance v3, Landroid/content/ComponentName;

    .line 49
    const-class v4, Lcom/arist/Widget/Widget4x1Transparent;

    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v4, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    .line 48
    invoke-virtual {v0, v3, v4}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V

    goto :goto_0

    .line 50
    :cond_2
    const-string v3, "com.MediaPlayer.action.STATUS_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 51
    sget v3, Lcom/arist/MusicPlayer/MyApplication;->status:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    .line 52
    iget-object v3, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    .line 53
    const v4, 0x7f02009a

    .line 52
    invoke-virtual {v3, v6, v4}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 56
    :goto_1
    new-instance v3, Landroid/content/ComponentName;

    .line 57
    const-class v4, Lcom/arist/Widget/Widget4x1Transparent;

    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v4, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    .line 56
    invoke-virtual {v0, v3, v4}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V

    goto :goto_0

    .line 55
    :cond_3
    iget-object v3, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    const v4, 0x7f02009b

    invoke-virtual {v3, v6, v4}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    goto :goto_1

    .line 58
    :cond_4
    const-string v3, "com.MediaPlayer.action.ALBUM_PIC_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 61
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v3

    .line 60
    invoke-static {v3}, Lcom/arist/util/AlbumPicUtil;->getAlbumBitmap(Lcom/arist/entity/Music;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 62
    .local v1, "bm":Landroid/graphics/Bitmap;
    if-eqz v1, :cond_5

    .line 63
    iget-object v3, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    invoke-virtual {v3, v7, v1}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    .line 68
    :goto_2
    new-instance v3, Landroid/content/ComponentName;

    .line 69
    const-class v4, Lcom/arist/Widget/Widget4x1Transparent;

    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v4, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    .line 68
    invoke-virtual {v0, v3, v4}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V

    goto/16 :goto_0

    .line 65
    :cond_5
    iget-object v3, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    .line 66
    const v4, 0x7f020056

    .line 65
    invoke-virtual {v3, v7, v4}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    goto :goto_2

    .line 72
    .end local v1    # "bm":Landroid/graphics/Bitmap;
    :cond_6
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_0
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "appWidgetManager"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "appWidgetIds"    # [I

    .prologue
    const/high16 v4, 0x8000000

    const/4 v3, 0x0

    .line 79
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    if-nez v0, :cond_0

    .line 80
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 81
    const v2, 0x7f030028

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 80
    iput-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    .line 83
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    .line 84
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    const-string v1, "com.MediaPlayer.action.PLAY"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 85
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    invoke-static {p1, v3, v0, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->pendingIntent:Landroid/app/PendingIntent;

    .line 87
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    const v1, 0x7f0d002c

    iget-object v2, p0, Lcom/arist/Widget/Widget4x1Transparent;->pendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 88
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    invoke-virtual {p2, p3, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget([ILandroid/widget/RemoteViews;)V

    .line 90
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    .line 91
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    const-string v1, "com.MediaPlayer.action.PREVIOUS"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 92
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    invoke-static {p1, v3, v0, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->pendingIntent:Landroid/app/PendingIntent;

    .line 94
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    const v1, 0x7f0d002b

    iget-object v2, p0, Lcom/arist/Widget/Widget4x1Transparent;->pendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 95
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    invoke-virtual {p2, p3, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget([ILandroid/widget/RemoteViews;)V

    .line 97
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    .line 98
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    const-string v1, "com.MediaPlayer.action.NEXT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    invoke-static {p1, v3, v0, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->pendingIntent:Landroid/app/PendingIntent;

    .line 101
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    const v1, 0x7f0d002d

    iget-object v2, p0, Lcom/arist/Widget/Widget4x1Transparent;->pendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 102
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    invoke-virtual {p2, p3, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget([ILandroid/widget/RemoteViews;)V

    .line 104
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/arist/MusicPlayer/WelcomeActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    .line 105
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->intentSend:Landroid/content/Intent;

    invoke-static {p1, v3, v0, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->pendingIntent:Landroid/app/PendingIntent;

    .line 107
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    const v1, 0x7f0d00b4

    iget-object v2, p0, Lcom/arist/Widget/Widget4x1Transparent;->pendingIntent:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 108
    iget-object v0, p0, Lcom/arist/Widget/Widget4x1Transparent;->views:Landroid/widget/RemoteViews;

    invoke-virtual {p2, p3, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget([ILandroid/widget/RemoteViews;)V

    .line 109
    return-void
.end method
