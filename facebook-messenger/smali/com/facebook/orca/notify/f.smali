.class public Lcom/facebook/orca/notify/f;
.super Lcom/facebook/orca/notify/a;
.source "DefaultMessagingNotificationHandler.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/app/NotificationManager;

.field private final d:Lcom/facebook/orca/notify/an;

.field private final e:Lcom/facebook/orca/notify/ak;

.field private final f:Lcom/facebook/messages/ipc/k;

.field private final g:Lcom/facebook/prefs/shared/d;

.field private final h:Lcom/facebook/ui/images/b/h;

.field private final i:Lcom/facebook/user/tiles/c;

.field private final j:Lcom/facebook/fbservice/ops/k;

.field private final k:Landroid/app/KeyguardManager;

.field private final l:Landroid/os/PowerManager;

.field private final m:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 69
    const-class v0, Lcom/facebook/orca/notify/f;

    sput-object v0, Lcom/facebook/orca/notify/f;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/NotificationManager;Lcom/facebook/orca/notify/an;Lcom/facebook/orca/notify/ak;Lcom/facebook/messages/ipc/k;Lcom/facebook/prefs/shared/d;Lcom/facebook/ui/images/b/h;Lcom/facebook/user/tiles/c;Lcom/facebook/fbservice/ops/k;Landroid/app/KeyguardManager;Landroid/os/PowerManager;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/NotificationManager;",
            "Lcom/facebook/orca/notify/an;",
            "Lcom/facebook/orca/notify/ak;",
            "Lcom/facebook/messages/ipc/k;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/ui/images/b/h;",
            "Lcom/facebook/user/tiles/c;",
            "Lcom/facebook/fbservice/ops/k;",
            "Landroid/app/KeyguardManager;",
            "Landroid/os/PowerManager;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 108
    invoke-direct {p0}, Lcom/facebook/orca/notify/a;-><init>()V

    .line 109
    iput-object p1, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    .line 110
    iput-object p2, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    .line 111
    iput-object p4, p0, Lcom/facebook/orca/notify/f;->e:Lcom/facebook/orca/notify/ak;

    .line 112
    iput-object p3, p0, Lcom/facebook/orca/notify/f;->d:Lcom/facebook/orca/notify/an;

    .line 113
    iput-object p5, p0, Lcom/facebook/orca/notify/f;->f:Lcom/facebook/messages/ipc/k;

    .line 114
    iput-object p6, p0, Lcom/facebook/orca/notify/f;->g:Lcom/facebook/prefs/shared/d;

    .line 115
    iput-object p7, p0, Lcom/facebook/orca/notify/f;->h:Lcom/facebook/ui/images/b/h;

    .line 116
    iput-object p8, p0, Lcom/facebook/orca/notify/f;->i:Lcom/facebook/user/tiles/c;

    .line 117
    iput-object p9, p0, Lcom/facebook/orca/notify/f;->j:Lcom/facebook/fbservice/ops/k;

    .line 118
    iput-object p10, p0, Lcom/facebook/orca/notify/f;->k:Landroid/app/KeyguardManager;

    .line 119
    iput-object p11, p0, Lcom/facebook/orca/notify/f;->l:Landroid/os/PowerManager;

    .line 120
    iput-object p12, p0, Lcom/facebook/orca/notify/f;->m:Ljavax/inject/a;

    .line 121
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)Landroid/app/PendingIntent;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 316
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->f:Lcom/facebook/messages/ipc/k;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/messages/ipc/k;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 317
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 318
    const/high16 v0, 0x4000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 319
    const-string v0, "from_notification"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 320
    const-string v0, "trigger"

    const-string v2, "notification"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 324
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->m:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 325
    const-string v0, "prefer_chat_if_possible"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 326
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-static {v0, v3, v1, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 328
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-static {v0, v3, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 504
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/notify/f;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/messages/model/threads/ParticipantInfo;Z)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/high16 v4, 0x42400000    # 48.0f

    .line 512
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 513
    :cond_0
    const/4 v0, 0x0

    .line 537
    :goto_0
    return-object v0

    .line 516
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v2

    .line 517
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 521
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v1, v3, :cond_3

    .line 522
    const v1, 0x1050006

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 523
    const v3, 0x1050005

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 529
    :goto_1
    iget-object v3, p0, Lcom/facebook/orca/notify/f;->i:Lcom/facebook/user/tiles/c;

    invoke-static {v2}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;

    move-result-object v2

    invoke-virtual {v3, v2, v0, v1}, Lcom/facebook/user/tiles/c;->a(Lcom/facebook/user/tiles/e;II)Lcom/facebook/ui/images/b/m;

    move-result-object v0

    .line 531
    if-eqz p2, :cond_2

    .line 532
    invoke-static {v0}, Lcom/facebook/ui/images/b/m;->b(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/o;->a(Z)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    .line 537
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->h:Lcom/facebook/ui/images/b/h;

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/b/h;->a(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/r;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    .line 525
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-static {v0, v4}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 526
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-static {v0, v4}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Z)Lcom/facebook/orca/notify/h;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 392
    invoke-direct {p0, p2}, Lcom/facebook/orca/notify/f;->b(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    .line 395
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 396
    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v0

    .line 397
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object p1

    move-object v2, v0

    .line 403
    :goto_0
    if-eqz p3, :cond_1

    .line 404
    invoke-direct {p0, v3}, Lcom/facebook/orca/notify/f;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 406
    :goto_1
    new-instance v3, Lcom/facebook/orca/notify/h;

    invoke-direct {v3, v2, p1, v0, v1}, Lcom/facebook/orca/notify/h;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/facebook/orca/notify/g;)V

    return-object v3

    .line 399
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/facebook/o;->app_name:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 400
    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Landroid/app/Notification;Landroid/app/PendingIntent;)V
    .locals 5

    .prologue
    .line 337
    iput-object p4, p3, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 339
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/notify/f;->a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Z)Lcom/facebook/orca/notify/h;

    move-result-object v0

    .line 340
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/notify/f;->d(Ljava/lang/String;)I

    move-result v1

    .line 341
    new-instance v2, Landroid/widget/RemoteViews;

    iget-object v3, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/facebook/k;->notification_custom:I

    invoke-direct {v2, v3, v4}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 346
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xb

    if-lt v3, v4, :cond_1

    .line 349
    invoke-static {v0}, Lcom/facebook/orca/notify/h;->a(Lcom/facebook/orca/notify/h;)Landroid/graphics/Bitmap;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 350
    sget v3, Lcom/facebook/i;->image:I

    invoke-static {v0}, Lcom/facebook/orca/notify/h;->a(Lcom/facebook/orca/notify/h;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    .line 367
    :goto_0
    sget v3, Lcom/facebook/i;->title:I

    invoke-static {v0}, Lcom/facebook/orca/notify/h;->b(Lcom/facebook/orca/notify/h;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 368
    sget v3, Lcom/facebook/i;->text:I

    invoke-static {v0}, Lcom/facebook/orca/notify/h;->c(Lcom/facebook/orca/notify/h;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 370
    if-ltz v1, :cond_3

    .line 371
    sget v0, Lcom/facebook/i;->count:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 376
    :goto_1
    iput-object v2, p3, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 377
    return-void

    .line 352
    :cond_0
    iget-object v3, p0, Lcom/facebook/orca/notify/f;->d:Lcom/facebook/orca/notify/an;

    invoke-interface {v3}, Lcom/facebook/orca/notify/an;->e()I

    move-result v3

    .line 353
    sget v4, Lcom/facebook/i;->image:I

    invoke-virtual {v2, v4, v3}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    goto :goto_0

    .line 358
    :cond_1
    iget-object v3, p0, Lcom/facebook/orca/notify/f;->d:Lcom/facebook/orca/notify/an;

    invoke-interface {v3}, Lcom/facebook/orca/notify/an;->e()I

    move-result v3

    .line 359
    sget v4, Lcom/facebook/i;->icon:I

    invoke-virtual {v2, v4, v3}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 360
    invoke-static {v0}, Lcom/facebook/orca/notify/h;->a(Lcom/facebook/orca/notify/h;)Landroid/graphics/Bitmap;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 361
    sget v3, Lcom/facebook/i;->image:I

    invoke-static {v0}, Lcom/facebook/orca/notify/h;->a(Lcom/facebook/orca/notify/h;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    goto :goto_0

    .line 363
    :cond_2
    sget v3, Lcom/facebook/i;->image:I

    const/4 v4, 0x4

    invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_0

    .line 373
    :cond_3
    sget v0, Lcom/facebook/i;->count:I

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_1
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 5

    .prologue
    .line 410
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    .line 411
    if-nez v1, :cond_0

    .line 412
    const/4 v0, 0x0

    .line 427
    :goto_0
    return-object v0

    .line 417
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/f;->e(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 418
    if-nez v0, :cond_1

    move-object v0, v1

    .line 419
    goto :goto_0

    .line 421
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    .line 422
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 423
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 424
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, v1

    .line 427
    goto :goto_0
.end method

.method private b()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 460
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->B:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->d(Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedSet;

    move-result-object v0

    .line 462
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 463
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 470
    :goto_0
    return-object v0

    .line 465
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 466
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 467
    sget-object v3, Lcom/facebook/orca/prefs/n;->B:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, v3}, Lcom/facebook/prefs/shared/ae;->b(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v0

    .line 468
    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 470
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method private b(Lcom/facebook/messages/model/threads/ParticipantInfo;)V
    .locals 1

    .prologue
    .line 508
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/notify/f;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;Z)Landroid/graphics/Bitmap;

    .line 509
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 431
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/o;->retry_send_heading:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 432
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 433
    iget-object v3, p0, Lcom/facebook/orca/notify/f;->d:Lcom/facebook/orca/notify/an;

    invoke-interface {v3}, Lcom/facebook/orca/notify/an;->e()I

    move-result v3

    .line 434
    new-instance v4, Landroid/app/Notification;

    invoke-direct {v4, v3, v0, v1, v2}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 435
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->e:Lcom/facebook/orca/notify/ak;

    new-instance v2, Lcom/facebook/orca/notify/c;

    invoke-direct {v2}, Lcom/facebook/orca/notify/c;-><init>()V

    invoke-virtual {v1, v4, v2}, Lcom/facebook/orca/notify/ak;->a(Landroid/app/Notification;Lcom/facebook/orca/notify/c;)V

    .line 437
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->f:Lcom/facebook/messages/ipc/k;

    invoke-interface {v1, p1}, Lcom/facebook/messages/ipc/k;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 438
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 439
    const/high16 v1, 0x4000000

    invoke-virtual {v2, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 440
    const-string v1, "from_notification"

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 442
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lcom/facebook/o;->app_name:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 443
    iget-object v3, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-static {v3, v5, v2, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 444
    iget-object v3, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-virtual {v4, v3, v1, v0, v2}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 446
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/16 v1, 0x2711

    invoke-virtual {v0, v1, v4}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 448
    return-void
.end method

.method private b(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Landroid/app/Notification;Landroid/app/PendingIntent;)V
    .locals 3

    .prologue
    .line 384
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/notify/f;->a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Z)Lcom/facebook/orca/notify/h;

    move-result-object v0

    .line 385
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/orca/notify/h;->b(Lcom/facebook/orca/notify/h;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lcom/facebook/orca/notify/h;->c(Lcom/facebook/orca/notify/h;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v1, v2, v0, p4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 386
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 474
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->g:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 475
    sget-object v1, Lcom/facebook/orca/prefs/n;->B:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->b(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    .line 476
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 477
    return-void
.end method

.method private c(Lcom/facebook/orca/notify/ap;)V
    .locals 8

    .prologue
    .line 285
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->a()Ljava/lang/String;

    move-result-object v1

    .line 286
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    .line 287
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->e()Lcom/facebook/orca/notify/c;

    move-result-object v3

    .line 289
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 290
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->d:Lcom/facebook/orca/notify/an;

    invoke-interface {v0}, Lcom/facebook/orca/notify/an;->e()I

    move-result v6

    .line 295
    invoke-virtual {v3}, Lcom/facebook/orca/notify/c;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/notify/f;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 296
    new-instance v0, Landroid/app/Notification;

    const-string v7, ""

    invoke-direct {v0, v6, v7, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 300
    :goto_0
    iget-object v4, p0, Lcom/facebook/orca/notify/f;->e:Lcom/facebook/orca/notify/ak;

    invoke-virtual {v4, v0, v3}, Lcom/facebook/orca/notify/ak;->a(Landroid/app/Notification;Lcom/facebook/orca/notify/c;)V

    .line 302
    invoke-direct {p0, v2}, Lcom/facebook/orca/notify/f;->a(Lcom/facebook/messages/model/threads/Message;)Landroid/app/PendingIntent;

    move-result-object v3

    .line 304
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x9

    if-lt v4, v5, :cond_1

    .line 305
    invoke-direct {p0, v1, v2, v0, v3}, Lcom/facebook/orca/notify/f;->a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Landroid/app/Notification;Landroid/app/PendingIntent;)V

    .line 309
    :goto_1
    sget-object v1, Lcom/facebook/orca/notify/f;->a:Ljava/lang/Class;

    const-string v3, "Calling android NotificationManager notify"

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 310
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x2710

    invoke-virtual {v1, v2, v3, v0}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 313
    return-void

    .line 298
    :cond_0
    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0, v6, v1, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    goto :goto_0

    .line 307
    :cond_1
    invoke-direct {p0, v1, v2, v0, v3}, Lcom/facebook/orca/notify/f;->b(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Landroid/app/Notification;Landroid/app/PendingIntent;)V

    goto :goto_1
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 452
    invoke-static {p1}, Lcom/facebook/orca/prefs/n;->c(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 453
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->g:Lcom/facebook/prefs/shared/d;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    .line 454
    iget-object v2, p0, Lcom/facebook/orca/notify/f;->g:Lcom/facebook/prefs/shared/d;

    invoke-interface {v2}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v2

    .line 455
    add-int/lit8 v1, v1, 0x1

    invoke-interface {v2, v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    .line 456
    invoke-interface {v2}, Lcom/facebook/prefs/shared/e;->a()V

    .line 457
    return-void
.end method

.method private d(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 480
    invoke-static {p1}, Lcom/facebook/orca/prefs/n;->c(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 481
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->g:Lcom/facebook/prefs/shared/d;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    return v0
.end method

.method private d()Z
    .locals 1

    .prologue
    .line 541
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->k:Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/notify/f;->l:Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 3

    .prologue
    .line 485
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 486
    new-instance v1, Lcom/facebook/orca/server/ac;

    invoke-direct {v1}, Lcom/facebook/orca/server/ac;-><init>()V

    invoke-static {p1}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v1

    .line 491
    const-string v2, "fetchThreadParams"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 492
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->j:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->b()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 495
    invoke-static {v0}, Lcom/facebook/common/g/d;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/OperationResult;

    .line 496
    if-nez v0, :cond_0

    .line 497
    const/4 v0, 0x0

    .line 500
    :goto_0
    return-object v0

    .line 499
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 500
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 267
    sget-object v0, Lcom/facebook/orca/notify/f;->a:Ljava/lang/Class;

    const-string v1, "Clearing all notifications"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 268
    invoke-direct {p0}, Lcom/facebook/orca/notify/f;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 269
    iget-object v2, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/16 v3, 0x2710

    invoke-virtual {v2, v0, v3}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    goto :goto_0

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/16 v1, 0x2711

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 272
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/16 v1, 0x2712

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 273
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/16 v1, 0x2714

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 274
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/16 v1, 0x2717

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 275
    invoke-direct {p0}, Lcom/facebook/orca/notify/f;->c()V

    .line 276
    return-void
.end method

.method public a(Lcom/facebook/orca/notify/aj;)V
    .locals 2

    .prologue
    .line 190
    sget-object v0, Lcom/facebook/orca/notify/aj;->LOGGED_OUT:Lcom/facebook/orca/notify/aj;

    if-ne p1, v0, :cond_1

    .line 191
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/16 v1, 0x2714

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 195
    :cond_0
    :goto_0
    return-void

    .line 192
    :cond_1
    sget-object v0, Lcom/facebook/orca/notify/aj;->NEW_BUILD:Lcom/facebook/orca/notify/aj;

    if-ne p1, v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/16 v1, 0x2717

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    goto :goto_0
.end method

.method protected a(Lcom/facebook/orca/notify/ap;)V
    .locals 1

    .prologue
    .line 127
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/f;->b(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 128
    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/f;->b(Lcom/facebook/messages/model/threads/ParticipantInfo;)V

    .line 129
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 280
    sget-object v0, Lcom/facebook/orca/notify/f;->a:Ljava/lang/Class;

    const-string v1, "Clearing thread notification for %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/16 v1, 0x2710

    invoke-virtual {v0, p1, v1}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 282
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/ao;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 230
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->d:Lcom/facebook/orca/notify/an;

    invoke-interface {v0}, Lcom/facebook/orca/notify/an;->e()I

    move-result v0

    .line 231
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/facebook/orca/notify/ao;->d()Landroid/content/Intent;

    move-result-object v3

    const/high16 v4, 0x8000000

    invoke-static {v1, v2, v3, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 237
    new-instance v2, Landroid/support/v4/app/ap;

    iget-object v3, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/support/v4/app/ap;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/facebook/orca/notify/ao;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v4/app/ap;->a(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/notify/ao;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v4/app/ap;->b(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/notify/ao;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v4/app/ap;->c(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/support/v4/app/ap;->a(I)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ap;->a(Landroid/app/PendingIntent;)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v4/app/ap;->b(Z)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/ap;->a()Landroid/app/Notification;

    move-result-object v0

    .line 246
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/4 v2, 0x0

    const/16 v3, 0x2717

    invoke-virtual {v1, v2, v3, v0}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 247
    invoke-virtual {p1, v5}, Lcom/facebook/orca/notify/ao;->a(Z)V

    .line 248
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ao;->g()V

    .line 249
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/ap;)V
    .locals 3

    .prologue
    .line 133
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->c()Lcom/facebook/orca/notify/aq;

    move-result-object v0

    .line 134
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->e()Lcom/facebook/orca/notify/c;

    move-result-object v1

    .line 135
    sget-object v2, Lcom/facebook/orca/notify/aq;->IN_APP_ACTIVE_30S:Lcom/facebook/orca/notify/aq;

    if-eq v0, v2, :cond_0

    sget-object v2, Lcom/facebook/orca/notify/aq;->IN_APP_ACTIVE_10S:Lcom/facebook/orca/notify/aq;

    if-ne v0, v2, :cond_4

    .line 137
    :cond_0
    invoke-virtual {v1}, Lcom/facebook/orca/notify/c;->b()Z

    move-result v2

    if-nez v2, :cond_1

    .line 138
    sget-object v2, Lcom/facebook/orca/notify/aq;->IN_APP_ACTIVE_30S:Lcom/facebook/orca/notify/aq;

    if-ne v0, v2, :cond_1

    .line 139
    iget-object v2, p0, Lcom/facebook/orca/notify/f;->e:Lcom/facebook/orca/notify/ak;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/notify/ak;->a(Lcom/facebook/orca/notify/c;)V

    .line 143
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/orca/notify/c;->d()Z

    move-result v2

    if-nez v2, :cond_2

    .line 144
    sget-object v2, Lcom/facebook/orca/notify/aq;->IN_APP_ACTIVE_10S:Lcom/facebook/orca/notify/aq;

    if-ne v0, v2, :cond_3

    .line 145
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->e:Lcom/facebook/orca/notify/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/ak;->b(Lcom/facebook/orca/notify/c;)V

    .line 161
    :cond_2
    :goto_0
    return-void

    .line 147
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->e:Lcom/facebook/orca/notify/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/ak;->c(Lcom/facebook/orca/notify/c;)V

    goto :goto_0

    .line 151
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 154
    invoke-virtual {v1}, Lcom/facebook/orca/notify/c;->j()Z

    move-result v0

    if-nez v0, :cond_2

    .line 155
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ap;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/f;->c(Ljava/lang/String;)V

    .line 156
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/f;->c(Lcom/facebook/orca/notify/ap;)V

    .line 157
    invoke-virtual {v1}, Lcom/facebook/orca/notify/c;->k()V

    goto :goto_0
.end method

.method protected b(Lcom/facebook/orca/notify/bi;)V
    .locals 2

    .prologue
    .line 260
    invoke-virtual {p1}, Lcom/facebook/orca/notify/bi;->a()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 261
    invoke-virtual {p0, v0}, Lcom/facebook/orca/notify/f;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 263
    :cond_0
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/i;)V
    .locals 1

    .prologue
    .line 253
    invoke-virtual {p1}, Lcom/facebook/orca/notify/i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/f;->b(Ljava/lang/String;)V

    .line 254
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/facebook/orca/notify/i;->a(Z)V

    .line 255
    invoke-virtual {p1}, Lcom/facebook/orca/notify/i;->g()V

    .line 256
    return-void
.end method

.method protected b(Lcom/facebook/orca/notify/w;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->d:Lcom/facebook/orca/notify/an;

    invoke-interface {v0}, Lcom/facebook/orca/notify/an;->e()I

    move-result v0

    .line 167
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->f:Lcom/facebook/messages/ipc/k;

    invoke-interface {v1}, Lcom/facebook/messages/ipc/k;->a()Landroid/net/Uri;

    move-result-object v1

    .line 168
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 169
    const-string v1, "from_notification"

    invoke-virtual {v2, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 171
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    const/4 v3, 0x0

    const/high16 v4, 0x8000000

    invoke-static {v1, v3, v2, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 173
    new-instance v2, Landroid/support/v4/app/ap;

    iget-object v3, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/support/v4/app/ap;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/facebook/orca/notify/w;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v4/app/ap;->a(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/notify/w;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v4/app/ap;->b(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/notify/w;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v4/app/ap;->c(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/support/v4/app/ap;->a(I)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ap;->a(Landroid/app/PendingIntent;)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v4/app/ap;->b(Z)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/ap;->a()Landroid/app/Notification;

    move-result-object v0

    .line 181
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->e:Lcom/facebook/orca/notify/ak;

    new-instance v2, Lcom/facebook/orca/notify/c;

    invoke-direct {v2}, Lcom/facebook/orca/notify/c;-><init>()V

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/notify/ak;->a(Landroid/app/Notification;Lcom/facebook/orca/notify/c;)V

    .line 183
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    const/4 v2, 0x0

    const/16 v3, 0x2714

    invoke-virtual {v1, v2, v3, v0}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 184
    invoke-virtual {p1, v5}, Lcom/facebook/orca/notify/w;->a(Z)V

    .line 185
    invoke-virtual {p1}, Lcom/facebook/orca/notify/w;->g()V

    .line 186
    return-void
.end method

.method protected b(Lcom/facebook/orca/push/a;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 199
    iget-object v0, p0, Lcom/facebook/orca/notify/f;->d:Lcom/facebook/orca/notify/an;

    invoke-interface {v0}, Lcom/facebook/orca/notify/an;->e()I

    move-result v0

    .line 201
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->f:Lcom/facebook/messages/ipc/k;

    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/messages/ipc/k;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 202
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 203
    const-string v1, "from_notification"

    invoke-virtual {v2, v1, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 205
    new-instance v1, Lcom/facebook/messages/model/threads/ParticipantInfo;

    new-instance v3, Lcom/facebook/user/UserKey;

    sget-object v4, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;)V

    .line 207
    invoke-direct {p0, v1}, Lcom/facebook/orca/notify/f;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 209
    iget-object v3, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    const/4 v4, 0x0

    const/high16 v5, 0x8000000

    invoke-static {v3, v4, v2, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 211
    new-instance v3, Landroid/support/v4/app/ap;

    iget-object v4, p0, Lcom/facebook/orca/notify/f;->b:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/support/v4/app/ap;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/support/v4/app/ap;->a(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/support/v4/app/ap;->b(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/support/v4/app/ap;->c(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/support/v4/app/ap;->a(I)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ap;->a(Landroid/graphics/Bitmap;)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/ap;->a(Landroid/app/PendingIntent;)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v4/app/ap;->b(Z)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/ap;->a()Landroid/app/Notification;

    move-result-object v0

    .line 220
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->e:Lcom/facebook/orca/notify/ak;

    new-instance v2, Lcom/facebook/orca/notify/c;

    invoke-direct {v2}, Lcom/facebook/orca/notify/c;-><init>()V

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/notify/ak;->a(Landroid/app/Notification;Lcom/facebook/orca/notify/c;)V

    .line 221
    iget-object v1, p0, Lcom/facebook/orca/notify/f;->c:Landroid/app/NotificationManager;

    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->a()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x2713

    invoke-virtual {v1, v2, v3, v0}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 224
    invoke-virtual {p1, v6}, Lcom/facebook/orca/push/a;->a(Z)V

    .line 225
    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->g()V

    .line 226
    return-void
.end method
