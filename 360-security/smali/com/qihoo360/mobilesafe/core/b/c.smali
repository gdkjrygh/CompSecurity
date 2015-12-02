.class public Lcom/qihoo360/mobilesafe/core/b/c;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:Landroid/content/Context;

.field private n:Landroid/content/pm/PackageManager;

.field private o:Landroid/media/AudioManager;

.field private p:Landroid/accounts/AccountManager;

.field private q:Landroid/bluetooth/BluetoothAdapter;

.field private r:J

.field private s:J

.field private t:Z

.field private u:Lcom/qihoo360/mobilesafe/core/d/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    const-class v0, Lcom/qihoo360/mobilesafe/core/b/c;

    .line 46
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 45
    sput-object v0, Lcom/qihoo360/mobilesafe/core/b/c;->a:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->b:Ljava/lang/String;

    .line 70
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->c:Ljava/lang/String;

    .line 76
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->d:Ljava/lang/String;

    .line 113
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->t:Z

    .line 117
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->m:Landroid/content/Context;

    .line 118
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->n:Landroid/content/pm/PackageManager;

    .line 119
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->m:Landroid/content/Context;

    const-string/jumbo v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->o:Landroid/media/AudioManager;

    .line 120
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->m:Landroid/content/Context;

    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->p:Landroid/accounts/AccountManager;

    .line 122
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->q:Landroid/bluetooth/BluetoothAdapter;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    :goto_0
    return-void

    .line 129
    :catch_0
    move-exception v0

    goto :goto_0

    .line 123
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 495
    const/4 v0, 0x0

    .line 496
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 498
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 499
    const/4 v0, 0x1

    .line 503
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 144
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->t:Z

    if-nez v0, :cond_0

    .line 145
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->i()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->l:Ljava/util/List;

    .line 146
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->t:Z

    .line 148
    :cond_0
    return-void
.end method

.method private a(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 312
    const/4 v0, 0x0

    .line 313
    if-nez p1, :cond_1

    .line 385
    :cond_0
    :goto_0
    return v0

    .line 316
    :cond_1
    iget-object v2, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    .line 317
    iget v3, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    .line 318
    iget-boolean v4, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->isSystem:Z

    .line 320
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 322
    iget-object v4, p0, Lcom/qihoo360/mobilesafe/core/b/c;->d:Ljava/lang/String;

    invoke-direct {p0, v2, v4}, Lcom/qihoo360/mobilesafe/core/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v0, v1

    .line 326
    goto :goto_0

    .line 333
    :cond_2
    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/core/b/c;->b(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v0, v1

    .line 337
    goto :goto_0

    .line 338
    :cond_3
    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/core/b/c;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v0, v1

    .line 342
    goto :goto_0

    .line 343
    :cond_4
    invoke-direct {p0, v2, v3}, Lcom/qihoo360/mobilesafe/core/b/c;->b(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_5

    move v0, v1

    .line 347
    goto :goto_0

    .line 348
    :cond_5
    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/core/b/c;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    move v0, v1

    .line 355
    goto :goto_0

    .line 356
    :cond_6
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/c;->g:Ljava/lang/String;

    invoke-direct {p0, v2, v3}, Lcom/qihoo360/mobilesafe/core/b/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_7

    move v0, v1

    .line 360
    goto :goto_0

    .line 361
    :cond_7
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/c;->l:Ljava/util/List;

    invoke-direct {p0, v2, v3}, Lcom/qihoo360/mobilesafe/core/b/c;->a(Ljava/lang/String;Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_8

    move v0, v1

    .line 365
    goto :goto_0

    .line 366
    :cond_8
    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/core/b/c;->e(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    move v0, v1

    .line 370
    goto :goto_0

    .line 371
    :cond_9
    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/core/b/c;->f(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 375
    goto :goto_0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 557
    .line 558
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->f:Ljava/util/HashSet;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->f:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 592
    :cond_0
    :goto_0
    return v0

    .line 561
    :cond_1
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->b:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 563
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->f:Ljava/util/HashSet;

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v0, v1

    .line 567
    goto :goto_0

    .line 572
    :cond_2
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->b:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v0, v1

    .line 576
    goto :goto_0

    .line 582
    :cond_3
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->n:Landroid/content/pm/PackageManager;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 583
    if-eqz v1, :cond_0

    .line 584
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    invoke-direct {p0, p1, v1}, Lcom/qihoo360/mobilesafe/core/b/c;->c(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 586
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private a(Ljava/lang/String;I)Z
    .locals 2

    .prologue
    .line 539
    const/4 v0, 0x0

    .line 540
    const/16 v1, 0x12c

    if-ge p2, v1, :cond_0

    .line 541
    const/4 v0, 0x1

    .line 543
    :cond_0
    return v0
.end method

.method private a(Ljava/lang/String;Ljava/util/HashSet;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 507
    const/4 v0, 0x0

    .line 508
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 509
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 512
    :cond_0
    return v0
.end method

.method private a(Ljava/lang/String;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 763
    const/4 v0, 0x0

    .line 764
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 765
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 768
    const/4 v0, 0x1

    .line 771
    :cond_0
    return v0
.end method

.method private b()V
    .locals 6

    .prologue
    .line 154
    .line 159
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->a()V

    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 162
    iget-wide v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->r:J

    sub-long v2, v0, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    .line 164
    const-wide/32 v4, 0xea60

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 169
    iput-wide v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->r:J

    .line 171
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->h()V

    .line 173
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->f()V

    .line 174
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->k()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->e:Ljava/util/HashSet;

    .line 175
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->e()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->f:Ljava/util/HashSet;

    .line 177
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->d:Ljava/lang/String;

    .line 179
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->g:Ljava/lang/String;

    .line 181
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->c()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->i:Ljava/util/HashSet;

    .line 183
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 184
    iget-wide v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->s:J

    sub-long v2, v0, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    .line 185
    const-wide/16 v4, 0x1388

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    .line 189
    iput-wide v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->s:J

    .line 190
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->d()V

    .line 196
    :cond_1
    return-void
.end method

.method private b(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Z
    .locals 2

    .prologue
    .line 397
    const/4 v0, 0x0

    .line 398
    if-eqz p1, :cond_0

    iget-boolean v1, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->isSystem:Z

    if-eqz v1, :cond_0

    .line 399
    const/4 v0, 0x1

    .line 401
    :cond_0
    return v0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 620
    const/4 v0, 0x0

    .line 621
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 633
    :cond_0
    :goto_0
    return v0

    .line 624
    :cond_1
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 626
    const-string/jumbo v2, ".*((alarm)|(clock)).*"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 627
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 628
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 631
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private b(Ljava/lang/String;I)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 700
    const/4 v1, 0x0

    .line 701
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->o:Landroid/media/AudioManager;

    if-nez v2, :cond_2

    :cond_0
    move v0, v1

    .line 726
    :cond_1
    :goto_0
    return v0

    .line 705
    :cond_2
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->e:Ljava/util/HashSet;

    .line 706
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/c;->o:Landroid/media/AudioManager;

    invoke-virtual {v3}, Landroid/media/AudioManager;->isMusicActive()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 707
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    .line 708
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 710
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_4

    .line 711
    const/16 v2, 0xc8

    if-le p2, v2, :cond_1

    :cond_3
    move v0, v1

    .line 726
    goto :goto_0

    .line 717
    :cond_4
    const/16 v2, 0x82

    if-gt p2, v2, :cond_3

    goto :goto_0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 523
    const/4 v0, 0x0

    .line 524
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 525
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 528
    :cond_0
    return v0
.end method

.method private c()Ljava/util/HashSet;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 814
    const/4 v0, 0x0

    .line 815
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->p:Landroid/accounts/AccountManager;

    if-nez v1, :cond_1

    .line 842
    :cond_0
    return-object v0

    .line 818
    :cond_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->p:Landroid/accounts/AccountManager;

    if-eqz v1, :cond_0

    .line 820
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->p:Landroid/accounts/AccountManager;

    invoke-virtual {v1}, Landroid/accounts/AccountManager;->getAuthenticatorTypes()[Landroid/accounts/AuthenticatorDescription;

    move-result-object v2

    .line 821
    if-eqz v2, :cond_0

    array-length v1, v2

    if-lez v1, :cond_0

    .line 822
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 823
    array-length v3, v2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 824
    if-eqz v4, :cond_2

    iget-object v5, v4, Landroid/accounts/AuthenticatorDescription;->packageName:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    iget-object v5, v4, Landroid/accounts/AuthenticatorDescription;->type:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 826
    :try_start_0
    iget-object v5, p0, Lcom/qihoo360/mobilesafe/core/b/c;->p:Landroid/accounts/AccountManager;

    iget-object v6, v4, Landroid/accounts/AuthenticatorDescription;->type:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v5

    .line 828
    if-eqz v5, :cond_2

    array-length v5, v5

    if-lez v5, :cond_2

    .line 829
    iget-object v4, v4, Landroid/accounts/AuthenticatorDescription;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 823
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 831
    :catch_0
    move-exception v4

    goto :goto_1
.end method

.method private c(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 405
    const/4 v0, 0x0

    .line 406
    if-nez p1, :cond_1

    .line 482
    :cond_0
    :goto_0
    :sswitch_0
    return v0

    .line 409
    :cond_1
    iget-object v2, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    .line 410
    iget v3, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    .line 411
    iget v4, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->category:I

    .line 413
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_1
    move v0, v1

    .line 465
    goto :goto_0

    .line 422
    :sswitch_2
    invoke-direct {p0, v2, v3}, Lcom/qihoo360/mobilesafe/core/b/c;->a(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 434
    goto :goto_0

    .line 437
    :sswitch_3
    invoke-direct {p0, v2}, Lcom/qihoo360/mobilesafe/core/b/c;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 444
    goto :goto_0

    .line 447
    :sswitch_4
    invoke-direct {p0, v2, v3}, Lcom/qihoo360/mobilesafe/core/b/c;->c(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 458
    goto :goto_0

    .line 468
    :sswitch_5
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/c;->i:Ljava/util/HashSet;

    invoke-direct {p0, v2, v3}, Lcom/qihoo360/mobilesafe/core/b/c;->a(Ljava/lang/String;Ljava/util/HashSet;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 469
    goto :goto_0

    .line 413
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x64 -> :sswitch_1
        0x65 -> :sswitch_4
        0x66 -> :sswitch_5
        0x67 -> :sswitch_2
        0x68 -> :sswitch_3
    .end sparse-switch
.end method

.method private c(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 644
    const/4 v0, 0x0

    .line 646
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 665
    :cond_0
    :goto_0
    return v0

    .line 649
    :cond_1
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/core/b/c;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 650
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 652
    const-string/jumbo v2, ".*(bluetooth).*"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 653
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 654
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    .line 657
    const/4 v0, 0x1

    goto :goto_0

    .line 660
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private c(Ljava/lang/String;I)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 737
    const/4 v1, 0x0

    .line 738
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->o:Landroid/media/AudioManager;

    if-nez v2, :cond_2

    :cond_0
    move v0, v1

    .line 759
    :cond_1
    :goto_0
    return v0

    .line 741
    :cond_2
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->o:Landroid/media/AudioManager;

    invoke-virtual {v2}, Landroid/media/AudioManager;->isMusicActive()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 743
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_4

    .line 744
    const/16 v2, 0xc8

    if-le p2, v2, :cond_1

    :cond_3
    move v0, v1

    .line 759
    goto :goto_0

    .line 750
    :cond_4
    const/16 v2, 0x82

    if-gt p2, v2, :cond_3

    goto :goto_0
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 601
    const/4 v0, 0x0

    .line 602
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 610
    :cond_0
    :goto_0
    return v0

    .line 605
    :cond_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->c:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 608
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 849
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->u:Lcom/qihoo360/mobilesafe/core/d/b;

    if-nez v0, :cond_0

    .line 850
    new-instance v0, Lcom/qihoo360/mobilesafe/core/d/b;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->m:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/core/d/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->u:Lcom/qihoo360/mobilesafe/core/d/b;

    .line 852
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->u:Lcom/qihoo360/mobilesafe/core/d/b;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/d/b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->h:Ljava/lang/String;

    .line 856
    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 675
    const/4 v0, 0x0

    .line 677
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 688
    :cond_0
    :goto_0
    return v0

    .line 681
    :cond_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->q:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->q:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    .line 682
    const/4 v0, 0x1

    goto :goto_0

    .line 684
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private final e()Ljava/util/HashSet;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 860
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->m:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->getHomeLauncherPackages(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 861
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 862
    const-string/jumbo v1, "android.intent.category.HOME"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 865
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->n:Landroid/content/pm/PackageManager;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 870
    :goto_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 871
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 872
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 885
    :cond_1
    return-object v1

    .line 866
    :catch_0
    move-exception v0

    .line 868
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_0

    .line 872
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 874
    :try_start_1
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 877
    const-string/jumbo v3, "com.lbe.security"

    iget-object v4, p0, Lcom/qihoo360/mobilesafe/core/b/c;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 880
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 881
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method private e(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 781
    const/4 v1, 0x0

    .line 782
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 783
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->j:Ljava/lang/String;

    invoke-direct {p0, p1, v2}, Lcom/qihoo360/mobilesafe/core/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 793
    :cond_0
    :goto_0
    return v0

    .line 787
    :cond_1
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->k:Ljava/lang/String;

    invoke-direct {p0, p1, v2}, Lcom/qihoo360/mobilesafe/core/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    .line 793
    goto :goto_0
.end method

.method private f()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 894
    .line 896
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 897
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 899
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->n:Landroid/content/pm/PackageManager;

    const/4 v4, 0x0

    invoke-virtual {v1, v0, v3, v4}, Landroid/content/pm/PackageManager;->getPreferredActivities(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)I

    .line 900
    if-eqz v3, :cond_e

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    .line 901
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    .line 902
    :try_start_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-nez v0, :cond_8

    .line 914
    :goto_1
    :try_start_2
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v3, "android.intent.action.VIEW"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 915
    const-string/jumbo v3, "sms:"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 917
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b/c;->n:Landroid/content/pm/PackageManager;

    .line 918
    const/high16 v4, 0x10000

    .line 917
    invoke-virtual {v3, v0, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 919
    if-eqz v0, :cond_d

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    .line 920
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 921
    :try_start_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-result v0

    if-nez v0, :cond_9

    .line 935
    :goto_3
    :try_start_4
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v4, "android.intent.action.VIEW"

    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 936
    const-string/jumbo v4, "tel:"

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 938
    iget-object v4, p0, Lcom/qihoo360/mobilesafe/core/b/c;->n:Landroid/content/pm/PackageManager;

    .line 939
    const/high16 v5, 0x10000

    invoke-virtual {v4, v0, v5}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 940
    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    .line 941
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 942
    :try_start_5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    move-result v0

    if-nez v0, :cond_a

    move-object v2, v4

    .line 952
    :cond_3
    :goto_5
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 957
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 961
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_b

    .line 973
    :cond_5
    :goto_6
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 977
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_c

    .line 988
    :cond_7
    :goto_7
    return-void

    .line 902
    :cond_8
    :try_start_6
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    .line 903
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 904
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 905
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto/16 :goto_0

    .line 909
    :catch_0
    move-exception v0

    move-object v0, v1

    :goto_8
    move-object v1, v0

    goto/16 :goto_1

    .line 921
    :cond_9
    :try_start_7
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 923
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 924
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 925
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto/16 :goto_2

    .line 929
    :catch_1
    move-exception v0

    move-object v0, v3

    :goto_9
    move-object v3, v0

    goto/16 :goto_3

    .line 942
    :cond_a
    :try_start_8
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 944
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 945
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 946
    invoke-virtual {v4, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    goto :goto_4

    .line 950
    :catch_2
    move-exception v0

    move-object v2, v4

    goto :goto_5

    .line 961
    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 962
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 963
    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->j:Ljava/lang/String;

    goto :goto_6

    .line 977
    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 978
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 979
    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->k:Ljava/lang/String;

    goto :goto_7

    .line 950
    :catch_3
    move-exception v0

    goto/16 :goto_5

    .line 929
    :catch_4
    move-exception v0

    move-object v0, v2

    goto :goto_9

    .line 909
    :catch_5
    move-exception v0

    move-object v0, v2

    goto :goto_8

    :cond_d
    move-object v3, v2

    goto/16 :goto_3

    :cond_e
    move-object v1, v2

    goto/16 :goto_1
.end method

.method private f(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 797
    const/4 v0, 0x0

    .line 798
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 799
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->h:Ljava/lang/String;

    invoke-direct {p0, p1, v1}, Lcom/qihoo360/mobilesafe/core/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 800
    const/4 v0, 0x1

    .line 803
    :cond_0
    return v0
.end method

.method private g()Ljava/lang/String;
    .locals 2

    .prologue
    .line 999
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->m:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 1000
    const/4 v0, 0x0

    .line 1008
    :goto_0
    return-object v0

    .line 1002
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 1003
    const-string/jumbo v1, "default_input_method"

    .line 1002
    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private h()V
    .locals 3

    .prologue
    .line 1015
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1016
    const-string/jumbo v1, "android.intent.category.HOME"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1018
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->n:Landroid/content/pm/PackageManager;

    const/high16 v2, 0x10000

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 1020
    iget-object v1, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz v1, :cond_0

    iget-object v1, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1021
    const-string/jumbo v1, "android"

    iget-object v2, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1022
    const-string/jumbo v1, "com.lbe.security"

    iget-object v2, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1023
    :cond_0
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->b:Ljava/lang/String;

    .line 1024
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->c:Ljava/lang/String;

    .line 1042
    :goto_0
    return-void

    .line 1027
    :cond_1
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->b:Ljava/lang/String;

    .line 1028
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->n:Landroid/content/pm/PackageManager;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/a/a;->b(Ljava/lang/String;Landroid/content/pm/PackageManager;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1031
    :catch_0
    move-exception v0

    .line 1034
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->b:Ljava/lang/String;

    .line 1035
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->c:Ljava/lang/String;

    goto :goto_0
.end method

.method private i()Ljava/util/List;
    .locals 3
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
    .line 1048
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->m:Landroid/content/Context;

    const-string/jumbo v1, "lock_screen.dat"

    const-string/jumbo v2, "com.qihoo.security.lite"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/Utils;->openConfigFileDescrypt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 1049
    return-object v0
.end method

.method private j()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1056
    const-string/jumbo v0, ""

    .line 1058
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b/c;->m:Landroid/content/Context;

    invoke-static {v1}, Landroid/app/WallpaperManager;->getInstance(Landroid/content/Context;)Landroid/app/WallpaperManager;

    move-result-object v1

    .line 1059
    if-eqz v1, :cond_0

    .line 1060
    invoke-virtual {v1}, Landroid/app/WallpaperManager;->getWallpaperInfo()Landroid/app/WallpaperInfo;

    move-result-object v1

    .line 1061
    if-eqz v1, :cond_0

    .line 1062
    invoke-virtual {v1}, Landroid/app/WallpaperInfo;->getPackageName()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1073
    :cond_0
    :goto_0
    return-object v0

    .line 1065
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private k()Ljava/util/HashSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1109
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b/c;->n:Landroid/content/pm/PackageManager;

    if-nez v0, :cond_0

    .line 1110
    const/4 v0, 0x0

    .line 1124
    :goto_0
    return-object v0

    .line 1112
    :cond_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1113
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v2, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1114
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b/c;->n:Landroid/content/pm/PackageManager;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 1115
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 1116
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    move-object v0, v1

    .line 1124
    goto :goto_0

    .line 1116
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 1117
    if-eqz v0, :cond_1

    iget-object v3, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 1118
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 207
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->b()V

    .line 212
    const/4 v0, 0x0

    .line 213
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 214
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 216
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 218
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 220
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 221
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 239
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 240
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    .line 248
    :cond_0
    return-object v0

    .line 221
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 223
    invoke-direct {p0, v0}, Lcom/qihoo360/mobilesafe/core/b/c;->a(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Z

    move-result v6

    .line 224
    if-eqz v6, :cond_3

    .line 226
    invoke-direct {p0, v0}, Lcom/qihoo360/mobilesafe/core/b/c;->b(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 228
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 232
    :cond_2
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 236
    :cond_3
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public b(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 263
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/b/c;->b()V

    .line 270
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 271
    :cond_0
    const/4 v0, 0x0

    .line 308
    :goto_0
    return-object v0

    .line 274
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 276
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 278
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 280
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 281
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 300
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 301
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 302
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    .line 308
    goto :goto_0

    .line 281
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 282
    invoke-direct {p0, v0}, Lcom/qihoo360/mobilesafe/core/b/c;->c(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Z

    move-result v6

    .line 284
    if-eqz v6, :cond_4

    .line 286
    invoke-direct {p0, v0}, Lcom/qihoo360/mobilesafe/core/b/c;->b(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 288
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 292
    :cond_3
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 297
    :cond_4
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method
