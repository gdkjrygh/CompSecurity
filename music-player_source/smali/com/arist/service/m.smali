.class public final Lcom/arist/service/m;
.super Lcom/arist/service/o;


# instance fields
.field private c:Landroid/media/session/MediaSession;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/arist/service/o;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/media/session/MediaSession;

    const-string v1, "NotifyManager2"

    invoke-direct {v0, p1, v1}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/arist/service/m;->c:Landroid/media/session/MediaSession;

    iget-object v0, p0, Lcom/arist/service/m;->c:Landroid/media/session/MediaSession;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/session/MediaSession;->setActive(Z)V

    iget-object v0, p0, Lcom/arist/service/m;->c:Landroid/media/session/MediaSession;

    new-instance v1, Lcom/arist/service/n;

    invoke-direct {v1, p0}, Lcom/arist/service/n;-><init>(Lcom/arist/service/m;)V

    invoke-virtual {v0, v1}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;)V

    iget-object v0, p0, Lcom/arist/service/m;->c:Landroid/media/session/MediaSession;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/session/MediaSession;->setFlags(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/arist/b/b;Z)Landroid/app/Notification;
    .locals 5

    sget-object v0, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/arist/c/a/a;->a(Landroid/content/Context;Lcom/arist/b/b;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/service/m;->c:Landroid/media/session/MediaSession;

    new-instance v2, Landroid/media/MediaMetadata$Builder;

    invoke-direct {v2}, Landroid/media/MediaMetadata$Builder;-><init>()V

    const-string v3, "android.media.metadata.ALBUM_ART"

    invoke-virtual {v2, v3, v0}, Landroid/media/MediaMetadata$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/media/MediaMetadata$Builder;

    move-result-object v2

    const-string v3, "android.media.metadata.ARTIST"

    invoke-virtual {p1}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/media/MediaMetadata$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/media/MediaMetadata$Builder;

    move-result-object v2

    const-string v3, "android.media.metadata.ALBUM"

    invoke-virtual {p1}, Lcom/arist/b/b;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/media/MediaMetadata$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/media/MediaMetadata$Builder;

    move-result-object v2

    const-string v3, "android.media.metadata.TITLE"

    invoke-virtual {p1}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/media/MediaMetadata$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/media/MediaMetadata$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/MediaMetadata$Builder;->build()Landroid/media/MediaMetadata;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/media/session/MediaSession;->setMetadata(Landroid/media/MediaMetadata;)V

    new-instance v1, Landroid/app/Notification$Builder;

    iget-object v2, p0, Lcom/arist/service/m;->b:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    move-result-object v1

    new-instance v2, Landroid/app/Notification$MediaStyle;

    invoke-direct {v2}, Landroid/app/Notification$MediaStyle;-><init>()V

    iget-object v3, p0, Lcom/arist/service/m;->c:Landroid/media/session/MediaSession;

    invoke-virtual {v3}, Landroid/media/session/MediaSession;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/Notification$MediaStyle;->setMediaSession(Landroid/media/session/MediaSession$Token;)Landroid/app/Notification$MediaStyle;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    invoke-virtual {v2, v3}, Landroid/app/Notification$MediaStyle;->setShowActionsInCompactView([I)Landroid/app/Notification$MediaStyle;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v0

    const v1, 0x7f020006

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/arist/b/b;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    if-eqz p2, :cond_0

    const v0, 0x7f0200c9

    move v1, v0

    :goto_0
    if-eqz p2, :cond_1

    const-string v0, "pause"

    :goto_1
    sget-object v3, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-virtual {p0, v3}, Lcom/arist/service/m;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v2, v1, v0, v3}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    const v1, 0x7f0200c6

    const-string v2, "next"

    sget-object v3, Lcom/arist/c/a;->g:Ljava/lang/String;

    invoke-virtual {p0, v3}, Lcom/arist/service/m;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    const v1, 0x7f0200d0

    const-string v2, "stop"

    sget-object v3, Lcom/arist/c/a;->q:Ljava/lang/String;

    invoke-virtual {p0, v3}, Lcom/arist/service/m;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/arist/service/m;->a()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0

    :cond_0
    const v0, 0x7f0200cc

    move v1, v0

    goto :goto_0

    :cond_1
    const-string v0, "play"

    goto :goto_1

    nop

    :array_0
    .array-data 4
        0x0
        0x1
        0x2
    .end array-data
.end method
