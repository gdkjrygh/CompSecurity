.class public final Lcom/arist/service/l;
.super Lcom/arist/service/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arist/service/o;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/arist/b/b;Z)Landroid/app/Notification;
    .locals 8

    const v7, 0x7f0600d9

    new-instance v1, Landroid/support/v4/app/ad;

    iget-object v0, p0, Lcom/arist/service/l;->b:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/support/v4/app/ad;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/arist/b/b;->j()Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/arist/c/a/a;->a(Landroid/content/Context;Lcom/arist/b/b;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v4, Landroid/widget/RemoteViews;

    iget-object v5, p0, Lcom/arist/service/l;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f030036

    invoke-direct {v4, v5, v6}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    sget-object v5, Lcom/arist/c/a;->f:Ljava/lang/String;

    invoke-virtual {p0, v5}, Lcom/arist/service/l;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v5

    const v6, 0x7f0600d8

    invoke-virtual {v4, v6, v5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    sget-object v5, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-virtual {p0, v5}, Lcom/arist/service/l;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual {v4, v7, v5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    sget-object v5, Lcom/arist/c/a;->g:Ljava/lang/String;

    invoke-virtual {p0, v5}, Lcom/arist/service/l;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v5

    const v6, 0x7f0600da

    invoke-virtual {v4, v6, v5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    sget-object v5, Lcom/arist/c/a;->q:Ljava/lang/String;

    invoke-virtual {p0, v5}, Lcom/arist/service/l;->a(Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v5

    const v6, 0x7f0600d5

    invoke-virtual {v4, v6, v5}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    const v5, 0x7f0600d3

    invoke-virtual {v4, v5, v0}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    if-eqz p2, :cond_0

    const v0, 0x7f0200c9

    :goto_0
    invoke-virtual {v4, v7, v0}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    const v0, 0x7f0600d4

    invoke-virtual {v4, v0, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    const v0, 0x7f0600d7

    invoke-virtual {v4, v0, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    invoke-virtual {v1, v4}, Landroid/support/v4/app/ad;->a(Landroid/widget/RemoteViews;)Landroid/support/v4/app/ad;

    move-result-object v0

    invoke-virtual {p0}, Lcom/arist/service/l;->a()Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/support/v4/app/ad;->a(Landroid/app/PendingIntent;)Landroid/support/v4/app/ad;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Landroid/support/v4/app/ad;->a(J)Landroid/support/v4/app/ad;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/ad;->a(Ljava/lang/CharSequence;)Landroid/support/v4/app/ad;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/ad;->c()Landroid/support/v4/app/ad;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/ad;->b()Landroid/support/v4/app/ad;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()Landroid/support/v4/app/ad;

    invoke-virtual {v1}, Landroid/support/v4/app/ad;->d()Landroid/app/Notification;

    move-result-object v0

    const/4 v1, 0x2

    iput v1, v0, Landroid/app/Notification;->flags:I

    return-object v0

    :cond_0
    const v0, 0x7f0200cc

    goto :goto_0
.end method
