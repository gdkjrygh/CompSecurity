.class public final Landroid/support/v4/app/ad;
.super Ljava/lang/Object;


# instance fields
.field a:Landroid/content/Context;

.field b:Ljava/lang/CharSequence;

.field c:Ljava/lang/CharSequence;

.field d:Landroid/app/PendingIntent;

.field e:Landroid/app/PendingIntent;

.field f:Landroid/widget/RemoteViews;

.field g:Landroid/graphics/Bitmap;

.field h:Ljava/lang/CharSequence;

.field i:I

.field j:I

.field k:Z

.field l:Landroid/support/v4/app/al;

.field m:Ljava/lang/CharSequence;

.field n:I

.field o:I

.field p:Z

.field q:Ljava/util/ArrayList;

.field r:Landroid/app/Notification;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/ad;->q:Ljava/util/ArrayList;

    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/ad;->r:Landroid/app/Notification;

    iput-object p1, p0, Landroid/support/v4/app/ad;->a:Landroid/content/Context;

    iget-object v0, p0, Landroid/support/v4/app/ad;->r:Landroid/app/Notification;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Landroid/app/Notification;->when:J

    iget-object v0, p0, Landroid/support/v4/app/ad;->r:Landroid/app/Notification;

    const/4 v1, -0x1

    iput v1, v0, Landroid/app/Notification;->audioStreamType:I

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/app/ad;->j:I

    return-void
.end method


# virtual methods
.method public final a()Landroid/support/v4/app/ad;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/app/ad;->r:Landroid/app/Notification;

    const v1, 0x7f020006

    iput v1, v0, Landroid/app/Notification;->icon:I

    return-object p0
.end method

.method public final a(J)Landroid/support/v4/app/ad;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/app/ad;->r:Landroid/app/Notification;

    iput-wide p1, v0, Landroid/app/Notification;->when:J

    return-object p0
.end method

.method public final a(Landroid/app/PendingIntent;)Landroid/support/v4/app/ad;
    .locals 0

    iput-object p1, p0, Landroid/support/v4/app/ad;->d:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public final a(Landroid/widget/RemoteViews;)Landroid/support/v4/app/ad;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/app/ad;->r:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    return-object p0
.end method

.method public final a(Ljava/lang/CharSequence;)Landroid/support/v4/app/ad;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/app/ad;->r:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final b()Landroid/support/v4/app/ad;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/app/ad;->r:Landroid/app/Notification;

    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroid/app/Notification;->flags:I

    return-object p0
.end method

.method public final c()Landroid/support/v4/app/ad;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/app/ad;->j:I

    return-object p0
.end method

.method public final d()Landroid/app/Notification;
    .locals 1

    invoke-static {}, Landroid/support/v4/app/z;->a()Landroid/support/v4/app/af;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/support/v4/app/af;->a(Landroid/support/v4/app/ad;)Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method
