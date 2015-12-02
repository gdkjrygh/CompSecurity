.class public Lcom/qihoo/security/notify/d;
.super Lcom/qihoo/security/notify/b;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/qihoo/security/notify/b;-><init>(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method private e()Ljava/lang/CharSequence;
    .locals 10

    .prologue
    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v6, 0x1

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/notify/d;->c:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0177

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 59
    iget-object v1, p0, Lcom/qihoo/security/notify/d;->b:Landroid/content/Context;

    const-string/jumbo v2, "malware_protect_days"

    invoke-static {v1, v2, v8, v9}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    .line 61
    cmp-long v1, v2, v8

    if-eqz v1, :cond_0

    cmp-long v1, v4, v8

    if-lez v1, :cond_0

    .line 62
    long-to-float v0, v4

    const v1, 0x4ca4cb80    # 8.64E7f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 63
    if-gt v0, v6, :cond_1

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/notify/d;->c:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01db

    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 69
    :cond_0
    :goto_0
    return-object v0

    .line 66
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/notify/d;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c01dc

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v7

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .prologue
    .line 75
    return-void
.end method

.method protected a(Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 87
    return-void
.end method

.method public c()V
    .locals 4

    .prologue
    .line 35
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 36
    invoke-virtual {p0}, Lcom/qihoo/security/notify/d;->b()V

    .line 55
    :cond_0
    :goto_0
    return-void

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/notify/d;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 41
    invoke-virtual {p0}, Lcom/qihoo/security/notify/d;->b()V

    goto :goto_0

    .line 45
    :cond_2
    iget-boolean v0, p0, Lcom/qihoo/security/notify/d;->f:Z

    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/qihoo/security/notify/d;->a()V

    .line 51
    iget-object v0, p0, Lcom/qihoo/security/notify/d;->e:Landroid/app/Notification;

    new-instance v1, Landroid/widget/RemoteViews;

    iget-object v2, p0, Lcom/qihoo/security/notify/d;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f03007f

    invoke-direct {v1, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/notify/d;->e:Landroid/app/Notification;

    iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v1, 0x7f0b0197

    iget-object v2, p0, Lcom/qihoo/security/notify/d;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c01d2

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 53
    iget-object v0, p0, Lcom/qihoo/security/notify/d;->e:Landroid/app/Notification;

    iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v1, 0x7f0b0198

    invoke-direct {p0}, Lcom/qihoo/security/notify/d;->e()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 54
    const/16 v0, 0x115

    iget-object v1, p0, Lcom/qihoo/security/notify/d;->e:Landroid/app/Notification;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/notify/d;->a(ILandroid/app/Notification;)V

    goto :goto_0
.end method

.method protected d()V
    .locals 0

    .prologue
    .line 81
    return-void
.end method
