.class public Lkik/android/KikNotificationHandler;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field protected a:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field protected b:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private final f:Landroid/support/v4/app/NotificationManagerCompat;

.field private final g:Ljava/lang/Object;

.field private h:Landroid/content/Context;

.field private i:Lkik/a/e/w;

.field private j:Lkik/a/e/i;

.field private k:J

.field private l:I

.field private m:I

.field private n:Lcom/kik/g/f;

.field private o:Lcom/kik/g/p;

.field private final p:Landroid/graphics/Paint;

.field private q:Lkik/android/g/b;

.field private r:Lcom/kik/g/i;

.field private s:Lcom/kik/g/i;

.field private t:Landroid/os/Handler;

.field private u:Lcom/kik/g/i;

.field private v:Lcom/kik/g/i;

.field private w:Lcom/kik/g/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 159
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 104
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->g:Ljava/lang/Object;

    .line 108
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/KikNotificationHandler;->k:J

    .line 109
    iput v2, p0, Lkik/android/KikNotificationHandler;->l:I

    .line 110
    iput v2, p0, Lkik/android/KikNotificationHandler;->m:I

    .line 111
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->n:Lcom/kik/g/f;

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->o:Lcom/kik/g/p;

    .line 113
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->p:Landroid/graphics/Paint;

    .line 121
    new-instance v0, Lkik/android/x;

    invoke-direct {v0, p0}, Lkik/android/x;-><init>(Lkik/android/KikNotificationHandler;)V

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->r:Lcom/kik/g/i;

    .line 134
    new-instance v0, Lkik/android/y;

    invoke-direct {v0, p0}, Lkik/android/y;-><init>(Lkik/android/KikNotificationHandler;)V

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->s:Lcom/kik/g/i;

    .line 143
    new-instance v0, Lkik/android/z;

    invoke-direct {v0, p0}, Lkik/android/z;-><init>(Lkik/android/KikNotificationHandler;)V

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->t:Landroid/os/Handler;

    .line 239
    new-instance v0, Lkik/android/aa;

    invoke-direct {v0, p0}, Lkik/android/aa;-><init>(Lkik/android/KikNotificationHandler;)V

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->u:Lcom/kik/g/i;

    .line 982
    new-instance v0, Lkik/android/ad;

    invoke-direct {v0, p0}, Lkik/android/ad;-><init>(Lkik/android/KikNotificationHandler;)V

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->v:Lcom/kik/g/i;

    .line 992
    new-instance v0, Lkik/android/ae;

    invoke-direct {v0, p0}, Lkik/android/ae;-><init>(Lkik/android/KikNotificationHandler;)V

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->w:Lcom/kik/g/i;

    .line 160
    iput-object p1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    .line 162
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "kik.android.notificationHandler.ACTION_MESSAGE_READ"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 163
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "kik.android.notificationHandler.ACTION_MESSAGE_REPLY"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 164
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "kik.android.notificationHandler.ACTION_MESSAGE_DISMISS"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 166
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->p:Landroid/graphics/Paint;

    const-string v1, "#87BF2B"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 168
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;

    move-result-object v0

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->f:Landroid/support/v4/app/NotificationManagerCompat;

    .line 169
    return-void
.end method

.method private static a(Lkik/a/d/f;)J
    .locals 2

    .prologue
    .line 766
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkik/a/d/f;->d()Lkik/a/d/s;

    move-result-object v0

    if-nez v0, :cond_1

    .line 768
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 770
    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lkik/a/d/f;->d()Lkik/a/d/s;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkik/a/h/j;->b(J)J

    move-result-wide v0

    goto :goto_0
.end method

.method private a(Lkik/a/d/f;Z)Landroid/app/PendingIntent;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 808
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->c:Lkik/a/e/l;

    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lkik/a/e/l;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    .line 809
    if-nez v0, :cond_0

    .line 810
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 812
    :cond_0
    new-instance v1, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v0}, Lkik/a/d/k;->hashCode()I

    move-result v0

    if-eqz p2, :cond_1

    mul-int/lit8 v0, v0, 0x11

    :cond_1
    iget-object v2, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    iget-object v3, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-static {v1, v3}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/chat/activity/k$b;->e()Landroid/content/Intent;

    move-result-object v1

    const/high16 v3, 0x10000000

    invoke-static {v2, v0, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 706
    const/16 v0, 0x15

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 707
    invoke-static {p0}, Lcom/kik/m/k;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 709
    :cond_0
    return-object p0
.end method

.method private a(Lkik/a/d/f;Lkik/a/d/k;Z)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, -0x1

    const/4 v6, 0x0

    .line 340
    new-instance v1, Landroid/support/v4/app/NotificationCompat$Builder;

    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    .line 341
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    move-object v0, v1

    .line 362
    :goto_0
    return-object v0

    .line 344
    :cond_1
    invoke-direct {p0, p2, v6, v7}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/k;ZI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c004b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setColor(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    const v2, 0x7f02019c

    invoke-virtual {v0, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    const-string v2, "group_key_kik_messages"

    invoke-virtual {v0, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setGroup(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    new-array v2, v8, [J

    const-wide/16 v4, 0x0

    aput-wide v4, v2, v6

    invoke-virtual {v0, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setVibrate([J)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->d()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 352
    if-eqz p3, :cond_3

    .line 354
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    const v2, 0x7f09018b

    new-array v3, v8, [Ljava/lang/Object;

    invoke-direct {p0, p2, v6, v7}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/k;ZI)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v2

    if-nez p2, :cond_2

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    :goto_2
    move-object v0, v1

    .line 362
    goto :goto_0

    .line 354
    :cond_2
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    iget-object v3, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-static {v0, v3}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->c()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->e()Landroid/content/Intent;

    move-result-object v0

    iget-object v3, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {p2}, Lkik/a/d/k;->hashCode()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2b

    const/high16 v5, 0x10000000

    invoke-static {v3, v4, v0, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    goto :goto_1

    .line 359
    :cond_3
    invoke-virtual {p1}, Lkik/a/d/f;->d()Lkik/a/d/s;

    move-result-object v0

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-static {v0, v2}, Lkik/android/g/c;->a(Lkik/a/d/s;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-direct {p0, p1, v6}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/f;Z)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    goto :goto_2
.end method

.method static synthetic a(Lkik/android/KikNotificationHandler;Lcom/kik/g/p;)Lcom/kik/g/p;
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lkik/android/KikNotificationHandler;->o:Lcom/kik/g/p;

    return-object p1
.end method

.method private a(Lkik/a/d/k;ZI)Ljava/lang/String;
    .locals 2

    .prologue
    .line 979
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-static {v0, v1, p1, p2, p3}, Lkik/android/g/c;->a(Landroid/content/Context;Lkik/a/e/r;Lkik/a/d/k;ZI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/android/KikNotificationHandler;)Lkik/a/e/i;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    return-object v0
.end method

.method private a(ILandroid/app/Notification;)V
    .locals 1

    .prologue
    .line 408
    :try_start_0
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->f:Landroid/support/v4/app/NotificationManagerCompat;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 414
    :goto_0
    return-void

    .line 410
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private a(Landroid/support/v4/app/NotificationCompat$InboxStyle;Ljava/util/List;)V
    .locals 9

    .prologue
    const/16 v8, 0x14

    const/4 v7, 0x1

    const/4 v2, 0x0

    .line 269
    if-nez p2, :cond_1

    .line 299
    :cond_0
    return-void

    :cond_1
    move v1, v2

    .line 273
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    const/4 v0, 0x4

    if-ge v1, v0, :cond_0

    .line 274
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 275
    iget-object v3, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v7}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v3

    .line 276
    const/4 v4, -0x1

    invoke-direct {p0, v3, v2, v4}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/k;ZI)Ljava/lang/String;

    move-result-object v3

    .line 277
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v8, :cond_2

    .line 278
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "..."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 280
    :cond_2
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 282
    new-array v3, v7, [I

    const v5, 0x1010098

    aput v5, v3, v2

    .line 285
    const/16 v5, 0x15

    invoke-static {v5}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 287
    iget-object v5, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    const v6, 0x1030065

    invoke-virtual {v5, v6, v3}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 293
    :goto_1
    const v5, -0x777778

    invoke-virtual {v3, v2, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    .line 294
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v5, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    const/16 v6, 0x21

    invoke-virtual {v4, v5, v2, v3, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 295
    const-string v3, "  "

    invoke-virtual {v4, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 296
    invoke-virtual {v0}, Lkik/a/d/f;->d()Lkik/a/d/s;

    move-result-object v0

    iget-object v3, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-static {v0, v3}, Lkik/android/g/c;->a(Lkik/a/d/s;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 297
    invoke-virtual {p1, v4}, Landroid/support/v4/app/NotificationCompat$InboxStyle;->addLine(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;

    .line 273
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_0

    .line 290
    :cond_3
    iget-object v5, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    const v6, 0x1030203

    invoke-virtual {v5, v6, v3}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v3

    goto :goto_1
.end method

.method private a(Ljava/util/List;)V
    .locals 3

    .prologue
    .line 397
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 398
    if-eqz v0, :cond_0

    .line 399
    iget-object v2, p0, Lkik/android/KikNotificationHandler;->f:Landroid/support/v4/app/NotificationManagerCompat;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/support/v4/app/NotificationManagerCompat;->cancel(I)V

    goto :goto_0

    .line 403
    :cond_1
    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v2, 0x0

    .line 1031
    if-nez p1, :cond_1

    .line 1055
    :cond_0
    return-void

    .line 1035
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1037
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    move v1, v2

    .line 1038
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 1039
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1040
    iget-object v4, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v7}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v4

    .line 1041
    iget-object v5, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v5, v0}, Lkik/android/g/b;->a(Lkik/a/d/f;)I

    move-result v5

    .line 1043
    iget-object v6, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v6, v5}, Lkik/android/g/b;->a(I)Z

    move-result v6

    if-nez v6, :cond_2

    const/16 v6, 0x10

    invoke-static {v6}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 1044
    invoke-direct {p0, v0, v4, v2}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/f;Lkik/a/d/k;Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    .line 1045
    invoke-direct {p0, v5, v0}, Lkik/android/KikNotificationHandler;->a(ILandroid/app/Notification;)V

    .line 1047
    :cond_2
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v0, v4, v5, v2}, Lkik/android/g/b;->a(Lkik/a/d/k;IZ)V

    .line 1038
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_3
    move v1, v2

    .line 1049
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 1050
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 1051
    iget-object v3, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v7}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v3

    .line 1052
    iget-object v4, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v4, v0}, Lkik/android/g/b;->a(Lkik/a/d/f;)I

    move-result v0

    .line 1053
    iget-object v4, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v4, v3, v0, v2}, Lkik/android/g/b;->a(Lkik/a/d/k;IZ)V

    .line 1049
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method

.method private a(Lkik/a/d/k;)V
    .locals 3

    .prologue
    .line 719
    if-nez p1, :cond_0

    .line 734
    :goto_0
    return-void

    .line 723
    :cond_0
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->a:Lcom/kik/cache/ad;

    invoke-direct {p0, p1}, Lkik/android/KikNotificationHandler;->b(Lkik/a/d/k;)Lcom/kik/cache/z;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkik/android/util/e;->a(Lcom/kik/cache/ad;Lcom/kik/cache/z;Z)Lcom/kik/g/p;

    move-result-object v0

    .line 724
    new-instance v1, Lkik/android/ac;

    invoke-direct {v1, p0}, Lkik/android/ac;-><init>(Lkik/android/KikNotificationHandler;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method private a(ZZLkik/a/d/s;Z)V
    .locals 9

    .prologue
    .line 545
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->i()I

    move-result v2

    .line 547
    if-gtz v2, :cond_0

    .line 702
    :goto_0
    return-void

    .line 552
    :cond_0
    new-instance v3, Landroid/support/v4/app/NotificationCompat$Builder;

    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    .line 554
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 556
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->K()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 557
    new-instance v1, Ljava/util/ArrayList;

    iget-object v4, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v4}, Lkik/a/e/i;->J()Ljava/util/List;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 559
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v5, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v5, v4}, Lkik/android/g/b;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    const/16 v5, 0x10

    invoke-static {v5}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-direct {p0, v4}, Lkik/android/KikNotificationHandler;->a(Ljava/util/List;)V

    .line 563
    :cond_1
    iget-object v4, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v4, v0}, Lkik/android/g/b;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v5, v1}, Lkik/android/g/b;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    invoke-direct {p0, v4, v5}, Lkik/android/KikNotificationHandler;->a(Ljava/util/List;Ljava/util/List;)V

    .line 566
    invoke-direct {p0, p3, p4}, Lkik/android/KikNotificationHandler;->b(Lkik/a/d/s;Z)V

    .line 570
    iget-object v4, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v4, v0}, Lkik/android/g/b;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 571
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v0, v1}, Lkik/android/g/b;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 573
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->j()I

    move-result v0

    .line 576
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->e()Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 579
    const/4 v5, 0x1

    if-le v0, v5, :cond_a

    .line 581
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, " "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v5, 0x7f090219

    invoke-static {v5}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 583
    new-instance v5, Landroid/support/v4/app/NotificationCompat$InboxStyle;

    invoke-direct {v5}, Landroid/support/v4/app/NotificationCompat$InboxStyle;-><init>()V

    .line 584
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 585
    invoke-direct {p0, v5, v4}, Lkik/android/KikNotificationHandler;->a(Landroid/support/v4/app/NotificationCompat$InboxStyle;Ljava/util/List;)V

    .line 587
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 588
    invoke-direct {p0, v5, v1}, Lkik/android/KikNotificationHandler;->b(Landroid/support/v4/app/NotificationCompat$InboxStyle;Ljava/util/List;)V

    .line 590
    :cond_2
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    iget-object v6, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-static {v0, v6, v4}, Lkik/android/g/c;->a(Landroid/content/Context;Lkik/a/e/r;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 591
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->k()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_16

    .line 592
    const v6, 0x7f09018d

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v7, v0

    invoke-static {v6, v7}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 594
    :goto_1
    const v0, 0x7f090185

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v7

    invoke-static {v0, v6}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/support/v4/app/NotificationCompat$InboxStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;

    .line 596
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    invoke-static {v0}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/f;)J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setStyle(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 652
    :cond_3
    :goto_2
    const v0, 0x7f02019c

    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    iget-object v0, p0, Lkik/android/KikNotificationHandler;->d:Lkik/a/e/v;

    const-string v2, "kik.vibrate"

    invoke-interface {v0, v2}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v0, 0x1

    new-array v0, v0, [J

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    aput-wide v6, v0, v4

    if-eqz v2, :cond_4

    const/4 v0, 0x4

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    if-nez p2, :cond_4

    const/4 v0, 0x6

    new-array v0, v0, [J

    fill-array-data v0, :array_1

    :cond_4
    invoke-virtual {v1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setVibrate([J)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c004b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setColor(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    const-string v1, "group_key_kik_messages"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setGroup(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setGroupSummary(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->d()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 662
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v0}, Lkik/android/g/b;->c()I

    move-result v0

    if-gtz v0, :cond_f

    const/4 v0, 0x1

    :goto_3
    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setLocalOnly(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 663
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v0}, Lkik/android/g/b;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_14

    .line 664
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v0}, Lkik/android/g/b;->b()Ljava/util/List;

    move-result-object v0

    .line 665
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 666
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/g/a;

    invoke-virtual {v0}, Lkik/android/g/a;->a()Lkik/a/d/k;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10

    .line 673
    :cond_5
    :goto_4
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->d:Lkik/a/e/v;

    const-string v1, "kik.sound"

    invoke-interface {v0, v1}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 674
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 677
    :cond_6
    if-eqz p1, :cond_7

    .line 679
    const/4 v0, 0x1

    new-array v0, v0, [J

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    aput-wide v4, v0, v1

    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setVibrate([J)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 680
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 683
    :cond_7
    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v0

    iget-wide v4, p0, Lkik/android/KikNotificationHandler;->k:J

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x7d0

    cmp-long v0, v0, v4

    if-gez v0, :cond_15

    .line 685
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 691
    :goto_5
    const/16 v0, 0x13

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 694
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->d:Lkik/a/e/v;

    const-string v1, "kik.led.color"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/g/c;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x3e8

    const/16 v2, 0x3e8

    invoke-virtual {v3, v0, v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setLights(III)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 697
    :cond_8
    invoke-virtual {v3}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    .line 698
    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 699
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->d:Lkik/a/e/v;

    const-string v2, "kik.led.color"

    invoke-interface {v1, v2}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/android/g/c;->a(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Landroid/app/Notification;->ledARGB:I

    .line 701
    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lkik/android/KikNotificationHandler;->a(ILandroid/app/Notification;)V

    goto/16 :goto_0

    .line 601
    :cond_9
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 603
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    invoke-static {v0}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/f;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-direct {p0, v1}, Lkik/android/KikNotificationHandler;->b(Ljava/util/List;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    goto/16 :goto_2

    .line 608
    :cond_a
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_d

    .line 613
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/f;Z)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 615
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 616
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    invoke-interface {v1, v2, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v2

    .line 617
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->a:Lcom/kik/cache/ad;

    invoke-direct {p0, v2}, Lkik/android/KikNotificationHandler;->b(Lkik/a/d/k;)Lcom/kik/cache/z;

    move-result-object v4

    invoke-static {v1, v4}, Lkik/android/util/e;->a(Lcom/kik/cache/ad;Lcom/kik/cache/z;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 618
    if-nez v1, :cond_b

    .line 619
    invoke-direct {p0, v2}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/k;)V

    .line 620
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->f()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 622
    :cond_b
    invoke-direct {p0, v1}, Lkik/android/KikNotificationHandler;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 623
    invoke-virtual {v2}, Lkik/a/d/k;->t()Z

    move-result v4

    if-nez v4, :cond_c

    .line 624
    invoke-static {v1}, Lkik/android/KikNotificationHandler;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 627
    :cond_c
    invoke-static {v0}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/f;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 628
    invoke-virtual {v3, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, -0x1

    invoke-direct {p0, v2, v4, v5}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/k;ZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-virtual {v0}, Lkik/a/d/f;->d()Lkik/a/d/s;

    move-result-object v0

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-static {v0, v2}, Lkik/android/g/c;->a(Lkik/a/d/s;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    goto/16 :goto_2

    .line 630
    :cond_d
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 635
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->e()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 637
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 638
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    invoke-interface {v1, v2, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v2

    .line 639
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->f()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 640
    invoke-direct {p0, v1}, Lkik/android/KikNotificationHandler;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 641
    invoke-virtual {v2}, Lkik/a/d/k;->t()Z

    move-result v4

    if-nez v4, :cond_e

    .line 642
    invoke-static {v1}, Lkik/android/KikNotificationHandler;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 644
    :cond_e
    const/4 v4, 0x0

    const/4 v5, -0x1

    invoke-direct {p0, v2, v4, v5}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/k;ZI)Ljava/lang/String;

    move-result-object v2

    .line 646
    invoke-static {v0}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/f;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 647
    invoke-virtual {v3, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    const v4, 0x7f09018b

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    invoke-virtual {v1, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    goto/16 :goto_2

    .line 662
    :cond_f
    const/4 v0, 0x0

    goto/16 :goto_3

    .line 666
    :cond_10
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v2

    invoke-interface {v0, v2}, Lkik/a/e/i;->a(Lkik/a/d/f;)I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_12

    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->f()Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_11
    :goto_6
    new-instance v1, Landroid/support/v4/app/NotificationCompat$WearableExtender;

    invoke-direct {v1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;-><init>()V

    invoke-virtual {v1, v0}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setBackground(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$WearableExtender;

    invoke-virtual {v3, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->extend(Landroid/support/v4/app/NotificationCompat$Extender;)Landroid/support/v4/app/NotificationCompat$Builder;

    goto/16 :goto_4

    :cond_12
    invoke-virtual {v1}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {v1}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->g()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_6

    :cond_13
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->a:Lcom/kik/cache/ad;

    invoke-direct {p0, v1}, Lkik/android/KikNotificationHandler;->b(Lkik/a/d/k;)Lcom/kik/cache/z;

    move-result-object v2

    invoke-static {v0, v2}, Lkik/android/util/e;->a(Lcom/kik/cache/ad;Lcom/kik/cache/z;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_11

    invoke-direct {p0, v1}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/k;)V

    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->f()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_6

    .line 670
    :cond_14
    :try_start_0
    new-instance v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;

    invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$WearableExtender;-><init>()V

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020006

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setBackground(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$WearableExtender;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->extend(Landroid/support/v4/app/NotificationCompat$Extender;)Landroid/support/v4/app/NotificationCompat$Builder;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_4

    .line 688
    :cond_15
    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/KikNotificationHandler;->k:J

    goto/16 :goto_5

    :cond_16
    move-object v1, v0

    goto/16 :goto_1

    .line 652
    :array_0
    .array-data 8
        0x5
        0x1e
        0x41
        0x122
    .end array-data

    :array_1
    .array-data 8
        0x5
        0x32
        0x2d
        0x122
        0x12c
        0x96
    .end array-data
.end method

.method private b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    .line 875
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 877
    const v1, 0x1050006

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 878
    const v2, 0x1050005

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 879
    if-eqz p1, :cond_0

    .line 883
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 884
    invoke-static {p1, v2, v2}, Landroid/media/ThumbnailUtils;->extractThumbnail(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 886
    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result v1

    if-nez v1, :cond_2

    .line 888
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v1

    .line 889
    if-nez v1, :cond_1

    :goto_0
    move-object p1, v0

    .line 893
    :goto_1
    :try_start_2
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 894
    div-int/lit8 v1, v2, 0x2

    .line 895
    new-instance v3, Landroid/graphics/RectF;

    int-to-float v4, v1

    add-int/lit8 v5, v2, -0x2

    int-to-float v5, v5

    add-int/lit8 v1, v1, 0x1

    int-to-float v1, v1

    add-int/lit8 v2, v2, -0x1

    int-to-float v2, v2

    invoke-direct {v3, v4, v5, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, v3, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 906
    :cond_0
    :goto_2
    return-object p1

    :cond_1
    move-object v0, v1

    .line 889
    goto :goto_0

    .line 897
    :catch_0
    move-exception v0

    :goto_3
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 900
    :catch_1
    move-exception v0

    :goto_4
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_2
    move-exception v1

    move-object p1, v0

    move-object v0, v1

    goto :goto_4

    .line 897
    :catch_3
    move-exception v1

    move-object p1, v0

    move-object v0, v1

    goto :goto_3

    :cond_2
    move-object p1, v0

    goto :goto_1
.end method

.method static synthetic b(Lkik/android/KikNotificationHandler;)Landroid/support/v4/app/NotificationManagerCompat;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->f:Landroid/support/v4/app/NotificationManagerCompat;

    return-object v0
.end method

.method private b(Lkik/a/d/k;)Lcom/kik/cache/z;
    .locals 9

    .prologue
    const/4 v5, 0x0

    .line 928
    if-nez p1, :cond_0

    .line 929
    const/4 v0, 0x0

    .line 937
    :goto_0
    return-object v0

    .line 932
    :cond_0
    invoke-virtual {p1}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p1

    .line 933
    check-cast v0, Lkik/a/d/n;

    .line 934
    sget-object v1, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sget-object v3, Lcom/kik/cache/z;->d:Lcom/android/volley/r$a;

    iget-object v4, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    iget-object v6, p0, Lkik/android/KikNotificationHandler;->a:Lcom/kik/cache/ad;

    iget-object v7, p0, Lkik/android/KikNotificationHandler;->e:Lcom/kik/android/a;

    invoke-static/range {v0 .. v7}, Lcom/kik/cache/v;->a(Lkik/a/d/n;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;Lkik/a/e/r;ZLcom/kik/cache/ad;Lcom/kik/android/a;)Lcom/kik/cache/v;

    move-result-object v0

    goto :goto_0

    .line 937
    :cond_1
    sget-object v3, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    sget-object v4, Lcom/kik/cache/z;->d:Lcom/android/volley/r$a;

    const/4 v6, 0x1

    move-object v2, p1

    move v7, v5

    move v8, v5

    invoke-static/range {v2 .. v8}, Lcom/kik/cache/k;->a(Lkik/a/d/k;Lcom/android/volley/r$b;Lcom/android/volley/r$a;ZIZZ)Lcom/kik/cache/k;

    move-result-object v0

    goto :goto_0
.end method

.method private b(Ljava/util/List;)Ljava/lang/CharSequence;
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v2, 0x0

    const/4 v5, 0x1

    .line 432
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 433
    :cond_0
    const/4 v0, 0x0

    .line 449
    :goto_0
    return-object v0

    .line 436
    :cond_1
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    move v1, v2

    .line 437
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    if-ge v1, v6, :cond_2

    .line 438
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 439
    iget-object v4, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 440
    const/4 v4, -0x1

    invoke-direct {p0, v0, v5, v4}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/k;ZI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    const-string v4, ", "

    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 437
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 443
    :cond_2
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    if-le v0, v5, :cond_3

    .line 444
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const-string v4, ""

    invoke-virtual {v3, v0, v1, v4}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 446
    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v6, :cond_4

    .line 447
    const-string v0, "..."

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 449
    :cond_4
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    const v1, 0x7f090192

    new-array v4, v5, [Ljava/lang/Object;

    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v4, v2

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private b(Landroid/support/v4/app/NotificationCompat$InboxStyle;Ljava/util/List;)V
    .locals 1

    .prologue
    .line 424
    if-nez p2, :cond_0

    .line 428
    :goto_0
    return-void

    .line 427
    :cond_0
    invoke-direct {p0, p2}, Lkik/android/KikNotificationHandler;->b(Ljava/util/List;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v4/app/NotificationCompat$InboxStyle;->addLine(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;

    goto :goto_0
.end method

.method private b(Lkik/a/d/s;Z)V
    .locals 16

    .prologue
    .line 367
    if-nez p1, :cond_1

    .line 393
    :cond_0
    :goto_0
    return-void

    .line 370
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-virtual/range {p1 .. p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v6

    .line 371
    if-eqz v6, :cond_0

    .line 374
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-virtual {v6}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v7

    .line 375
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v2, v6}, Lkik/android/g/b;->a(Lkik/a/d/f;)I

    move-result v8

    .line 378
    const/16 v2, 0x10

    invoke-static {v2}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 379
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-direct {v0, v6, v7, v1}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/f;Lkik/a/d/k;Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v9

    .line 381
    if-nez p2, :cond_2

    .line 384
    if-nez v6, :cond_4

    const/4 v2, 0x0

    .line 385
    :goto_1
    if-eqz v2, :cond_2

    .line 386
    invoke-virtual {v9, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->extend(Landroid/support/v4/app/NotificationCompat$Extender;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 389
    :cond_2
    invoke-virtual {v9}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    .line 390
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v2}, Lkik/android/KikNotificationHandler;->a(ILandroid/app/Notification;)V

    .line 392
    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v2, v7, v8}, Lkik/android/g/b;->a(Lkik/a/d/k;I)V

    goto :goto_0

    .line 384
    :cond_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-virtual {v6}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v10

    new-instance v2, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;

    const/4 v3, 0x0

    const/4 v4, 0x4

    move-object/from16 v0, p0

    invoke-direct {v0, v10, v3, v4}, Lkik/android/KikNotificationHandler;->a(Lkik/a/d/k;ZI)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->setLatestTimestamp(J)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;

    move-result-object v11

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lkik/a/d/f;->b(Z)Ljava/util/Vector;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    move v5, v2

    :goto_2
    if-ltz v5, :cond_9

    invoke-interface {v12, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/s;

    move-object/from16 v0, p0

    iget-object v13, v0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    const-class v3, Lkik/a/d/a/a;

    invoke-static {v2, v3}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v3

    check-cast v3, Lkik/a/d/a/a;

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    const-string v14, "com.kik.ext.camera"

    invoke-virtual {v3}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    const-string v14, "com.kik.ext.gallery"

    invoke-virtual {v3}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    :cond_5
    const/4 v4, 0x1

    :cond_6
    invoke-virtual {v2}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v4, :cond_8

    const v2, 0x7f090188

    invoke-virtual {v13, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_7
    :goto_3
    invoke-virtual {v11, v2}, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->addMessage(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;

    add-int/lit8 v2, v5, -0x1

    move v5, v2

    goto :goto_2

    :cond_8
    if-eqz v3, :cond_7

    const v2, 0x7f090186

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v14, 0x0

    invoke-static {v3}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v4, v14

    invoke-virtual {v13, v2, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_9
    invoke-virtual {v10}, Lkik/a/d/k;->t()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {v10}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-direct/range {p0 .. p0}, Lkik/android/KikNotificationHandler;->h()Landroid/graphics/Bitmap;

    move-result-object v2

    :cond_a
    :goto_4
    invoke-static {v2}, Lkik/android/KikNotificationHandler;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v6}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    invoke-virtual {v6}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v5

    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    const/16 v12, 0x20

    invoke-virtual {v10, v12}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v10

    const-string v12, "kik.android.notificationHandler.ACTION_MESSAGE_READ"

    invoke-virtual {v10, v12}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v10

    const-string v12, "conversation_jid"

    invoke-virtual {v10, v12, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5

    const/high16 v10, 0x8000000

    invoke-static {v3, v4, v5, v10}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    new-instance v4, Landroid/support/v4/app/RemoteInput$Builder;

    const-string v5, "extra_voice_reply"

    invoke-direct {v4, v5}, Landroid/support/v4/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    const-string v5, "reply"

    invoke-virtual {v4, v5}, Landroid/support/v4/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroid/support/v4/app/RemoteInput$Builder;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v4/app/RemoteInput$Builder;->build()Landroid/support/v4/app/RemoteInput;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v6}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v10

    invoke-virtual {v6}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v6

    new-instance v12, Landroid/content/Intent;

    invoke-direct {v12}, Landroid/content/Intent;-><init>()V

    const/16 v13, 0x20

    invoke-virtual {v12, v13}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v12

    const-string v13, "kik.android.notificationHandler.ACTION_MESSAGE_REPLY"

    invoke-virtual {v12, v13}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v12

    const-string v13, "conversation_jid"

    invoke-virtual {v12, v13, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    const/high16 v12, 0x8000000

    invoke-static {v5, v10, v6, v12}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v11, v12, v13}, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->setLatestTimestamp(J)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->setReadPendingIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;

    move-result-object v3

    invoke-virtual {v3, v5, v4}, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->setReplyAction(Landroid/app/PendingIntent;Landroid/support/v4/app/RemoteInput;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;

    new-instance v3, Landroid/support/v4/app/NotificationCompat$CarExtender;

    invoke-direct {v3}, Landroid/support/v4/app/NotificationCompat$CarExtender;-><init>()V

    invoke-virtual {v11}, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->build()Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/support/v4/app/NotificationCompat$CarExtender;->setUnreadConversation(Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;)Landroid/support/v4/app/NotificationCompat$CarExtender;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c004b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/support/v4/app/NotificationCompat$CarExtender;->setColor(I)Landroid/support/v4/app/NotificationCompat$CarExtender;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/support/v4/app/NotificationCompat$CarExtender;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$CarExtender;

    move-result-object v2

    goto/16 :goto_1

    :cond_b
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lkik/android/KikNotificationHandler;->b(Lkik/a/d/k;)Lcom/kik/cache/z;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/KikNotificationHandler;->a:Lcom/kik/cache/ad;

    invoke-static {v3, v2}, Lkik/android/util/e;->a(Lcom/kik/cache/ad;Lcom/kik/cache/z;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_a

    invoke-direct/range {p0 .. p0}, Lkik/android/KikNotificationHandler;->f()Landroid/graphics/Bitmap;

    move-result-object v2

    goto/16 :goto_4
.end method

.method private static c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 912
    const/16 v0, 0x38

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    .line 913
    if-eqz p0, :cond_0

    .line 917
    :try_start_0
    invoke-static {p0, v0, v0}, Landroid/media/ThumbnailUtils;->extractThumbnail(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    .line 923
    :cond_0
    :goto_0
    return-object p0

    .line 919
    :catch_0
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static synthetic c(Lkik/android/KikNotificationHandler;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->g:Ljava/lang/Object;

    return-object v0
.end method

.method private d()Landroid/app/PendingIntent;
    .locals 4

    .prologue
    .line 463
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "kik.android.notificationHandler.ACTION_MESSAGE_DISMISS"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 465
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    const/16 v2, 0x3900

    const/high16 v3, 0x8000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 469
    return-object v0
.end method

.method static synthetic d(Lkik/android/KikNotificationHandler;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->o:Lcom/kik/g/p;

    return-object v0
.end method

.method private e()Landroid/app/PendingIntent;
    .locals 4

    .prologue
    .line 801
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    .line 802
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->c()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->e()Landroid/content/Intent;

    move-result-object v0

    .line 803
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    const/4 v2, 0x0

    const/high16 v3, 0x10000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private f()Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 837
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 838
    const/4 v0, 0x0

    .line 840
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020305

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method private g()Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 845
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    if-nez v1, :cond_0

    .line 855
    :goto_0
    return-object v0

    .line 850
    :cond_0
    :try_start_0
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020135

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 852
    :catch_0
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private h()Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 860
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    if-nez v1, :cond_0

    .line 870
    :goto_0
    return-object v0

    .line 865
    :cond_0
    :try_start_0
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020136

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 867
    :catch_0
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private i()I
    .locals 2

    .prologue
    .line 943
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->k()Z

    move-result v0

    .line 944
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->H()I

    move-result v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->I()I

    move-result v0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private j()I
    .locals 2

    .prologue
    .line 959
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->k()Z

    move-result v0

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->K()Ljava/util/List;

    move-result-object v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->J()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v0, v1}, Lkik/android/g/b;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method private k()Z
    .locals 3

    .prologue
    .line 964
    const/4 v0, 0x0

    .line 965
    iget-object v1, p0, Lkik/android/KikNotificationHandler;->i:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    .line 966
    iget-object v2, v1, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    .line 967
    iget-object v0, v1, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 969
    :cond_0
    return v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->f:Landroid/support/v4/app/NotificationManagerCompat;

    invoke-virtual {v0}, Landroid/support/v4/app/NotificationManagerCompat;->cancelAll()V

    .line 189
    return-void
.end method

.method public final a(Lkik/a/d/s;Z)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 221
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkik/a/d/s;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 237
    :cond_0
    :goto_0
    return-void

    .line 225
    :cond_1
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v2

    .line 227
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v0, v2}, Lkik/a/e/i;->a(Lkik/a/d/f;)I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    .line 228
    const/4 v0, 0x1

    .line 230
    :goto_1
    if-eqz v0, :cond_2

    iget-object v3, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v3, v2, p1}, Lkik/a/e/i;->a(Lkik/a/d/f;Lkik/a/d/s;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 234
    :cond_2
    invoke-direct {p0, v1, p2, p1, v0}, Lkik/android/KikNotificationHandler;->a(ZZLkik/a/d/s;Z)V

    .line 235
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->j()I

    move-result v0

    iput v0, p0, Lkik/android/KikNotificationHandler;->m:I

    .line 236
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->i()I

    move-result v0

    iput v0, p0, Lkik/android/KikNotificationHandler;->l:I

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method public final a(Lkik/a/e/w;Lkik/a/e/i;Lkik/a/e/v;Lcom/kik/e/a;)V
    .locals 3

    .prologue
    .line 173
    invoke-interface {p4, p0}, Lcom/kik/e/a;->a(Lkik/android/KikNotificationHandler;)V

    .line 174
    iput-object p2, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    .line 175
    iput-object p1, p0, Lkik/android/KikNotificationHandler;->i:Lkik/a/e/w;

    .line 176
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->m()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->u:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 177
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->l()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->v:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 178
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->n()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->w:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 179
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->r:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 180
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->n:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->k()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->s:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 181
    new-instance v0, Lkik/android/g/b;

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->b:Lkik/a/e/r;

    invoke-direct {v0, v1, p3}, Lkik/android/g/b;-><init>(Lkik/a/e/r;Lkik/a/e/v;)V

    iput-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    .line 183
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->K()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v2}, Lkik/a/e/i;->J()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v0, v2}, Lkik/android/g/b;->a(Ljava/util/List;)V

    .line 184
    return-void
.end method

.method public final a(Z)V
    .locals 12

    .prologue
    const-wide/16 v10, 0x7d0

    const/4 v5, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 199
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->j()I

    move-result v2

    .line 200
    invoke-direct {p0}, Lkik/android/KikNotificationHandler;->i()I

    move-result v3

    .line 201
    if-nez v2, :cond_1

    .line 204
    const-wide/16 v4, 0x0

    iget-wide v6, p0, Lkik/android/KikNotificationHandler;->k:J

    add-long/2addr v6, v10

    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v8

    sub-long/2addr v6, v8

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    .line 205
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->t:Landroid/os/Handler;

    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 215
    :cond_0
    :goto_0
    iput v2, p0, Lkik/android/KikNotificationHandler;->m:I

    .line 216
    iput v3, p0, Lkik/android/KikNotificationHandler;->l:I

    .line 217
    return-void

    .line 207
    :cond_1
    iget v4, p0, Lkik/android/KikNotificationHandler;->m:I

    if-ne v2, v4, :cond_2

    iget v4, p0, Lkik/android/KikNotificationHandler;->l:I

    if-eq v3, v4, :cond_3

    .line 209
    :cond_2
    invoke-direct {p0, p1, v1, v5, v1}, Lkik/android/KikNotificationHandler;->a(ZZLkik/a/d/s;Z)V

    goto :goto_0

    .line 211
    :cond_3
    if-ne v2, v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v4, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v4}, Lkik/android/g/b;->c()I

    move-result v4

    if-lez v4, :cond_4

    :goto_1
    if-eqz v0, :cond_0

    .line 213
    invoke-direct {p0, p1, v1, v5, v1}, Lkik/android/KikNotificationHandler;->a(ZZLkik/a/d/s;Z)V

    goto :goto_0

    :cond_4
    move v0, v1

    .line 211
    goto :goto_1
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->n:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 194
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->h:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 195
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 1023
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    if-eqz v0, :cond_0

    .line 1024
    iget-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v0}, Lkik/android/g/b;->a()V

    .line 1025
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/KikNotificationHandler;->a(Z)V

    .line 1027
    :cond_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 1005
    if-nez p2, :cond_1

    .line 1018
    :cond_0
    :goto_0
    return-void

    .line 1009
    :cond_1
    const-string v0, "kik.android.notificationHandler.ACTION_MESSAGE_READ"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1010
    if-eqz p2, :cond_0

    const-string v0, "conversation_jid"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1, v0}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1, v0}, Lkik/a/e/i;->b(Lkik/a/d/f;)Z

    goto :goto_0

    .line 1012
    :cond_2
    const-string v0, "kik.android.notificationHandler.ACTION_MESSAGE_REPLY"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1013
    if-eqz p2, :cond_0

    const-string v0, "conversation_jid"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v1, v0}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p2}, Landroid/support/v4/app/RemoteInput;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v2, "extra_voice_reply"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_0

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v2, v1}, Lkik/a/e/i;->b(Lkik/a/d/f;)Z

    iget-object v2, p0, Lkik/android/KikNotificationHandler;->j:Lkik/a/e/i;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    sget v3, Lkik/a/d/s$a;->a:I

    invoke-static {v0, v1, v3}, Lkik/a/d/s;->a(Ljava/lang/String;Ljava/lang/String;I)Lkik/a/d/s;

    move-result-object v0

    invoke-interface {v2, v0}, Lkik/a/e/i;->d(Lkik/a/d/s;)Lcom/kik/g/p;

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    .line 1015
    :cond_4
    const-string v0, "kik.android.notificationHandler.ACTION_MESSAGE_DISMISS"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1016
    if-eqz p2, :cond_0

    iget-object v0, p0, Lkik/android/KikNotificationHandler;->q:Lkik/android/g/b;

    invoke-virtual {v0}, Lkik/android/g/b;->d()V

    goto :goto_0
.end method
