.class public Lcom/arist/service/MusicDownloadService;
.super Landroid/app/IntentService;
.source "MusicDownloadService.java"


# static fields
.field private static final MSG_TAG_EXISTS:I = 0x1

.field private static final MSG_TAG_FAILED:I = 0x4

.field private static final MSG_TAG_FINISHED:I = 0x3

.field private static final MSG_TAG_STARTED:I = 0x2

.field private static final NOTI_ID:I = 0x3e8


# instance fields
.field private albumName:Ljava/lang/String;

.field private fileLength:J

.field private handler:Landroid/os/Handler;

.field private manager:Landroid/app/NotificationManager;

.field private musicName:Ljava/lang/String;

.field private noti:Landroid/app/Notification;

.field private streamService:Lcom/arist/util/StreamService;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 148
    const-string v0, "workThread"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 149
    return-void
.end method

.method static synthetic access$0(Lcom/arist/service/MusicDownloadService;)Landroid/app/Notification;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;

    return-object v0
.end method

.method static synthetic access$1(Lcom/arist/service/MusicDownloadService;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/arist/service/MusicDownloadService;->musicName:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2(Lcom/arist/service/MusicDownloadService;J)Ljava/lang/String;
    .locals 1

    .prologue
    .line 143
    invoke-direct {p0, p1, p2}, Lcom/arist/service/MusicDownloadService;->formatFileLength(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$3(Lcom/arist/service/MusicDownloadService;)J
    .locals 2

    .prologue
    .line 35
    iget-wide v0, p0, Lcom/arist/service/MusicDownloadService;->fileLength:J

    return-wide v0
.end method

.method static synthetic access$4(Lcom/arist/service/MusicDownloadService;)Landroid/app/NotificationManager;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/arist/service/MusicDownloadService;->manager:Landroid/app/NotificationManager;

    return-object v0
.end method

.method static synthetic access$5(Lcom/arist/service/MusicDownloadService;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/arist/service/MusicDownloadService;->albumName:Ljava/lang/String;

    return-object v0
.end method

.method private formatFileLength(J)Ljava/lang/String;
    .locals 1
    .param p1, "length"    # J

    .prologue
    .line 144
    invoke-static {p0, p1, p2}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public onCreate()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    .prologue
    .line 45
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 47
    new-instance v1, Lcom/arist/util/StreamService;

    invoke-direct {v1}, Lcom/arist/util/StreamService;-><init>()V

    iput-object v1, p0, Lcom/arist/service/MusicDownloadService;->streamService:Lcom/arist/util/StreamService;

    .line 48
    const-string v1, "notification"

    invoke-virtual {p0, v1}, Lcom/arist/service/MusicDownloadService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    iput-object v1, p0, Lcom/arist/service/MusicDownloadService;->manager:Landroid/app/NotificationManager;

    .line 49
    new-instance v1, Landroid/app/Notification;

    const v2, 0x7f020064

    .line 50
    const v3, 0x7f08007e

    invoke-virtual {p0, v3}, Lcom/arist/service/MusicDownloadService;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 49
    iput-object v1, p0, Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;

    .line 51
    iget-object v1, p0, Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;

    const/4 v2, 0x4

    iput v2, v1, Landroid/app/Notification;->defaults:I

    .line 52
    iget-object v1, p0, Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;

    const/16 v2, 0x20

    iput v2, v1, Landroid/app/Notification;->flags:I

    .line 53
    const/4 v1, 0x0

    new-instance v2, Landroid/content/Intent;

    .line 54
    const-class v3, Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v3, 0x8000000

    .line 53
    invoke-static {p0, v1, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 55
    .local v0, "pi":Landroid/app/PendingIntent;
    iget-object v1, p0, Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;

    iput-object v0, v1, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 56
    iget-object v1, p0, Lcom/arist/service/MusicDownloadService;->noti:Landroid/app/Notification;

    new-instance v2, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Lcom/arist/service/MusicDownloadService;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 57
    const v4, 0x7f030009

    invoke-direct {v2, v3, v4}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 56
    iput-object v2, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 59
    new-instance v1, Lcom/arist/service/MusicDownloadService$1;

    invoke-direct {v1, p0}, Lcom/arist/service/MusicDownloadService$1;-><init>(Lcom/arist/service/MusicDownloadService;)V

    iput-object v1, p0, Lcom/arist/service/MusicDownloadService;->handler:Landroid/os/Handler;

    .line 141
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 10
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v9, 0x1

    .line 155
    const-string v7, "uri"

    invoke-virtual {p1, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 156
    .local v6, "uri":Ljava/lang/String;
    const-string v7, "musicName"

    invoke-virtual {p1, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/arist/service/MusicDownloadService;->musicName:Ljava/lang/String;

    .line 157
    const-string v7, "AlbumName"

    invoke-virtual {p1, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/arist/service/MusicDownloadService;->albumName:Ljava/lang/String;

    .line 160
    new-instance v7, Ljava/lang/StringBuilder;

    sget-object v8, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, p0, Lcom/arist/service/MusicDownloadService;->musicName:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 161
    const-string v8, ".mp3"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 160
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 162
    .local v5, "savePath":Ljava/lang/String;
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 163
    .local v2, "file":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_0

    .line 164
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    .line 166
    :cond_0
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 167
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 168
    .local v4, "msg":Landroid/os/Message;
    iput v9, v4, Landroid/os/Message;->what:I

    .line 169
    iput-object v5, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 170
    iget-object v7, p0, Lcom/arist/service/MusicDownloadService;->handler:Landroid/os/Handler;

    invoke-virtual {v7, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 200
    :goto_0
    return-void

    .line 175
    .end local v4    # "msg":Landroid/os/Message;
    :cond_1
    const/4 v7, 0x0

    .line 176
    const/4 v8, 0x1

    .line 175
    :try_start_0
    invoke-static {v6, v7, v8}, Lcom/arist/util/HttpService;->getEntity(Ljava/lang/String;Ljava/util/ArrayList;I)Lorg/apache/http/HttpEntity;

    move-result-object v1

    .line 178
    .local v1, "entity":Lorg/apache/http/HttpEntity;
    invoke-static {v1}, Lcom/arist/util/HttpService;->getLength(Lorg/apache/http/HttpEntity;)J

    move-result-wide v8

    iput-wide v8, p0, Lcom/arist/service/MusicDownloadService;->fileLength:J

    .line 180
    iget-object v7, p0, Lcom/arist/service/MusicDownloadService;->handler:Landroid/os/Handler;

    const/4 v8, 0x2

    invoke-virtual {v7, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 183
    invoke-static {v1}, Lcom/arist/util/HttpService;->getStream(Lorg/apache/http/HttpEntity;)Ljava/io/InputStream;

    move-result-object v3

    .line 185
    .local v3, "in":Ljava/io/InputStream;
    iget-object v7, p0, Lcom/arist/service/MusicDownloadService;->streamService:Lcom/arist/util/StreamService;

    iget-object v8, p0, Lcom/arist/service/MusicDownloadService;->handler:Landroid/os/Handler;

    invoke-virtual {v7, v3, v5, v8}, Lcom/arist/util/StreamService;->save(Ljava/io/InputStream;Ljava/lang/String;Landroid/os/Handler;)V

    .line 188
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 189
    .restart local v4    # "msg":Landroid/os/Message;
    const/4 v7, 0x3

    iput v7, v4, Landroid/os/Message;->what:I

    .line 190
    iget-object v7, p0, Lcom/arist/service/MusicDownloadService;->handler:Landroid/os/Handler;

    invoke-virtual {v7, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 192
    .end local v1    # "entity":Lorg/apache/http/HttpEntity;
    .end local v3    # "in":Ljava/io/InputStream;
    .end local v4    # "msg":Landroid/os/Message;
    :catch_0
    move-exception v0

    .line 193
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 195
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 196
    .restart local v4    # "msg":Landroid/os/Message;
    const/4 v7, 0x4

    iput v7, v4, Landroid/os/Message;->what:I

    .line 197
    iget-object v7, p0, Lcom/arist/service/MusicDownloadService;->handler:Landroid/os/Handler;

    invoke-virtual {v7, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method
