.class public Lcom/flurry/sdk/iy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/lh$a;


# static fields
.field static a:I

.field static b:I

.field static c:I

.field static d:I

.field static e:I

.field private static final f:Ljava/lang/String;


# instance fields
.field private final A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ir;",
            ">;"
        }
    .end annotation
.end field

.field private B:I

.field private C:I

.field private D:Z

.field private final E:Lcom/flurry/sdk/hj;

.field private final F:Lcom/flurry/sdk/jx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jx",
            "<",
            "Lcom/flurry/sdk/jd;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final j:Lcom/flurry/sdk/jx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jx",
            "<",
            "Lcom/flurry/sdk/lc;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/flurry/sdk/lb;",
            ">;"
        }
    .end annotation
.end field

.field private l:Ljava/io/File;

.field private m:Lcom/flurry/sdk/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jv",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/iw;",
            ">;>;"
        }
    .end annotation
.end field

.field private n:Z

.field private o:J

.field private p:Z

.field private q:Ljava/lang/String;

.field private r:B

.field private s:Ljava/lang/Long;

.field private final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/iw;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/flurry/sdk/is;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/it;",
            ">;"
        }
    .end annotation
.end field

.field private y:Z

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 80
    const-class v0, Lcom/flurry/sdk/iy;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    .line 82
    const/16 v0, 0x64

    sput v0, Lcom/flurry/sdk/iy;->a:I

    .line 83
    const/16 v0, 0xa

    sput v0, Lcom/flurry/sdk/iy;->b:I

    .line 84
    const/16 v0, 0x3e8

    sput v0, Lcom/flurry/sdk/iy;->c:I

    .line 85
    const v0, 0x27100

    sput v0, Lcom/flurry/sdk/iy;->d:I

    .line 86
    const/16 v0, 0x32

    sput v0, Lcom/flurry/sdk/iy;->e:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 116
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 117
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 119
    new-instance v0, Lcom/flurry/sdk/iy$1;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/iy$1;-><init>(Lcom/flurry/sdk/iy;)V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->j:Lcom/flurry/sdk/jx;

    .line 163
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->t:Ljava/util/List;

    .line 164
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->u:Ljava/util/Map;

    .line 165
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    .line 166
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->w:Ljava/util/Map;

    .line 167
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->x:Ljava/util/List;

    .line 168
    iput-boolean v2, p0, Lcom/flurry/sdk/iy;->y:Z

    .line 169
    iput v1, p0, Lcom/flurry/sdk/iy;->z:I

    .line 170
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->A:Ljava/util/List;

    .line 171
    iput v1, p0, Lcom/flurry/sdk/iy;->B:I

    .line 172
    iput v1, p0, Lcom/flurry/sdk/iy;->C:I

    .line 174
    iput-boolean v2, p0, Lcom/flurry/sdk/iy;->D:Z

    .line 183
    new-instance v0, Lcom/flurry/sdk/hj;

    invoke-direct {v0}, Lcom/flurry/sdk/hj;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->E:Lcom/flurry/sdk/hj;

    .line 185
    new-instance v0, Lcom/flurry/sdk/iy$9;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/iy$9;-><init>(Lcom/flurry/sdk/iy;)V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->F:Lcom/flurry/sdk/jx;

    .line 200
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.FlurrySessionEvent"

    iget-object v2, p0, Lcom/flurry/sdk/iy;->j:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->a(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 201
    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/iy;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/flurry/sdk/iy;->k:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic a(Lcom/flurry/sdk/iy;ZJ)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0, p1, p2, p3}, Lcom/flurry/sdk/iy;->a(ZJ)V

    return-void
.end method

.method private a(Z)V
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 490
    if-eqz p1, :cond_0

    .line 492
    iget-object v0, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v3, "boot.time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 496
    new-instance v3, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 497
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x12

    if-lt v4, v5, :cond_3

    .line 498
    iget-object v4, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v5, "disk.size.total.internal"

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    iget-object v4, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v5, "disk.size.available.internal"

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    iget-object v0, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v4, "disk.size.total.external"

    invoke-virtual {v3}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    iget-object v0, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v4, "disk.size.available.external"

    invoke-virtual {v3}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    :goto_0
    iget-object v0, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v3, "carrier.name"

    invoke-static {}, Lcom/flurry/sdk/jj;->a()Lcom/flurry/sdk/jj;

    move-result-object v4

    invoke-virtual {v4}, Lcom/flurry/sdk/jj;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    iget-object v0, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v3, "carrier.details"

    invoke-static {}, Lcom/flurry/sdk/jj;->a()Lcom/flurry/sdk/jj;

    move-result-object v4

    invoke-virtual {v4}, Lcom/flurry/sdk/jj;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    :cond_0
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    const-string v3, "activity"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 518
    new-instance v3, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v3}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 519
    invoke-virtual {v0, v3}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 521
    iget-object v4, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v0, "memory.available"

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_4

    const-string v0, ".start"

    :goto_1
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-wide v6, v3, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x10

    if-lt v0, v4, :cond_1

    .line 523
    iget-object v4, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v0, "memory.total"

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_5

    const-string v0, ".start"

    :goto_2
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-wide v6, v3, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    :cond_1
    new-instance v0, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 528
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v4

    .line 533
    if-eqz v4, :cond_9

    .line 534
    const-string v0, "status"

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 535
    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x5

    if-ne v0, v3, :cond_6

    :cond_2
    const/4 v0, 0x1

    .line 537
    :goto_3
    const-string v1, "level"

    invoke-virtual {v4, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 538
    const-string v1, "scale"

    invoke-virtual {v4, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    move v2, v3

    .line 541
    :goto_4
    int-to-float v2, v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    .line 543
    iget-object v3, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v1, "battery.charging"

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_7

    const-string v1, ".start"

    :goto_5
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    iget-object v1, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v0, "battery.remaining"

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_8

    const-string v0, ".start"

    :goto_6
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 546
    return-void

    .line 504
    :cond_3
    iget-object v4, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v5, "disk.size.total.internal"

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v6

    int-to-long v6, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    iget-object v4, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v5, "disk.size.available.internal"

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v6, v0

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    iget-object v0, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v4, "disk.size.total.external"

    invoke-virtual {v3}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v5

    int-to-long v6, v5

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    iget-object v0, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    const-string v4, "disk.size.available.external"

    invoke-virtual {v3}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v3

    int-to-long v6, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 521
    :cond_4
    const-string v0, ".end"

    goto/16 :goto_1

    .line 523
    :cond_5
    const-string v0, ".end"

    goto/16 :goto_2

    :cond_6
    move v0, v1

    .line 535
    goto/16 :goto_3

    .line 543
    :cond_7
    const-string v1, ".end"

    goto :goto_5

    .line 544
    :cond_8
    const-string v0, ".end"

    goto :goto_6

    :cond_9
    move v0, v1

    move v1, v2

    goto/16 :goto_4
.end method

.method private declared-synchronized a(ZJ)V
    .locals 20

    .prologue
    .line 877
    monitor-enter p0

    :try_start_0
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/flurry/sdk/iy;->D:Z

    if-nez v2, :cond_1

    .line 878
    const/4 v2, 0x3

    sget-object v3, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v4, "Analytics disabled, not sending agent report."

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 913
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 882
    :cond_1
    if-nez p1, :cond_2

    :try_start_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flurry/sdk/iy;->t:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 886
    :cond_2
    const/4 v2, 0x3

    sget-object v3, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v4, "generating agent report"

    invoke-static {v2, v3, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 888
    const/16 v19, 0x0

    .line 890
    :try_start_2
    new-instance v3, Lcom/flurry/sdk/iu;

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jo;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/flurry/sdk/jl;->a()Lcom/flurry/sdk/jl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jl;->e()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    iget-boolean v6, v0, Lcom/flurry/sdk/iy;->n:Z

    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jc;->e()Z

    move-result v7

    move-object/from16 v0, p0

    iget-wide v8, v0, Lcom/flurry/sdk/iy;->o:J

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/flurry/sdk/iy;->t:Ljava/util/List;

    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jc;->h()Ljava/util/Map;

    move-result-object v13

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flurry/sdk/iy;->E:Lcom/flurry/sdk/hj;

    const/4 v10, 0x0

    invoke-virtual {v2, v10}, Lcom/flurry/sdk/hj;->a(Z)Ljava/util/Map;

    move-result-object v14

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/flurry/sdk/iy;->u:Ljava/util/Map;

    invoke-static {}, Lcom/flurry/sdk/jq;->a()Lcom/flurry/sdk/jq;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jq;->c()Ljava/util/HashMap;

    move-result-object v16

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v17

    move-wide/from16 v10, p2

    invoke-direct/range {v3 .. v18}, Lcom/flurry/sdk/iu;-><init>(Ljava/lang/String;Ljava/lang/String;ZZJJLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 895
    invoke-virtual {v3}, Lcom/flurry/sdk/iu;->a()[B
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    .line 900
    :goto_1
    if-nez v2, :cond_3

    .line 901
    :try_start_3
    sget-object v2, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v3, "Error generating report"

    invoke-static {v2, v3}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    :goto_2
    invoke-direct/range {p0 .. p0}, Lcom/flurry/sdk/iy;->j()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 877
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2

    .line 896
    :catch_0
    move-exception v2

    .line 897
    :try_start_4
    sget-object v3, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Exception while generating report: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v2, v19

    goto :goto_1

    .line 903
    :cond_3
    const/4 v3, 0x3

    sget-object v4, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "generated report of size "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v6, v2

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " with "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/flurry/sdk/iy;->t:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " reports."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 907
    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v3

    invoke-virtual {v3}, Lcom/flurry/sdk/hi;->d()Lcom/flurry/sdk/iv;

    move-result-object v3

    .line 908
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/flurry/sdk/jp;->a()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 909
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/flurry/sdk/jo;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v2, v5, v4}, Lcom/flurry/sdk/iv;->b([BLjava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2
.end method

.method static synthetic b(Lcom/flurry/sdk/iy;)Lcom/flurry/sdk/jx;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/flurry/sdk/iy;->j:Lcom/flurry/sdk/jx;

    return-object v0
.end method

.method private declared-synchronized b(J)V
    .locals 3

    .prologue
    .line 549
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/iy;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/it;

    .line 550
    invoke-virtual {v0}, Lcom/flurry/sdk/it;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/flurry/sdk/it;->b()Z

    move-result v2

    if-nez v2, :cond_0

    .line 551
    invoke-virtual {v0, p1, p2}, Lcom/flurry/sdk/it;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 549
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 554
    :cond_1
    monitor-exit p0

    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 9

    .prologue
    const/4 v8, 0x3

    .line 465
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 466
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 468
    if-eqz v2, :cond_2

    .line 469
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Launch Options Bundle is present "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 471
    invoke-virtual {v2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 472
    if-eqz v0, :cond_0

    .line 476
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 477
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 479
    :goto_1
    iget-object v4, p0, Lcom/flurry/sdk/iy;->u:Ljava/util/Map;

    new-instance v5, Ljava/util/ArrayList;

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    sget-object v4, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Launch options Key: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ". Its value: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v4, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 477
    :cond_1
    const-string v1, "null"

    goto :goto_1

    .line 485
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/flurry/sdk/iy;)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0}, Lcom/flurry/sdk/iy;->i()V

    return-void
.end method

.method static synthetic d(Lcom/flurry/sdk/iy;)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0}, Lcom/flurry/sdk/iy;->m()V

    return-void
.end method

.method static synthetic e(Lcom/flurry/sdk/iy;)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0}, Lcom/flurry/sdk/iy;->n()V

    return-void
.end method

.method static synthetic f(Lcom/flurry/sdk/iy;)Ljava/util/List;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/flurry/sdk/iy;->t:Ljava/util/List;

    return-object v0
.end method

.method static synthetic g(Lcom/flurry/sdk/iy;)Z
    .locals 1

    .prologue
    .line 79
    iget-boolean v0, p0, Lcom/flurry/sdk/iy;->D:Z

    return v0
.end method

.method private declared-synchronized i()V
    .locals 6

    .prologue
    .line 922
    monitor-enter p0

    const/4 v0, 0x4

    :try_start_0
    sget-object v1, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v2, "Loading persistent session report data."

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 924
    iget-object v0, p0, Lcom/flurry/sdk/iy;->m:Lcom/flurry/sdk/jv;

    invoke-virtual {v0}, Lcom/flurry/sdk/jv;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 925
    if-eqz v0, :cond_1

    .line 926
    iget-object v1, p0, Lcom/flurry/sdk/iy;->t:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 956
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 929
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/flurry/sdk/iy;->l:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 930
    const/4 v0, 0x4

    sget-object v1, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v2, "Legacy persistent agent data found, converting."

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 932
    iget-object v0, p0, Lcom/flurry/sdk/iy;->l:Ljava/io/File;

    invoke-static {v0}, Lcom/flurry/sdk/hl;->a(Ljava/io/File;)Lcom/flurry/sdk/iz;

    move-result-object v2

    .line 933
    if-eqz v2, :cond_3

    .line 934
    invoke-virtual {v2}, Lcom/flurry/sdk/iz;->a()Z

    move-result v3

    .line 937
    invoke-virtual {v2}, Lcom/flurry/sdk/iz;->b()J

    move-result-wide v0

    .line 938
    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-gtz v4, :cond_2

    .line 939
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v0

    .line 942
    :cond_2
    iput-boolean v3, p0, Lcom/flurry/sdk/iy;->n:Z

    .line 943
    iput-wide v0, p0, Lcom/flurry/sdk/iy;->o:J

    .line 944
    invoke-direct {p0}, Lcom/flurry/sdk/iy;->n()V

    .line 946
    invoke-virtual {v2}, Lcom/flurry/sdk/iz;->c()Ljava/util/List;

    move-result-object v0

    .line 947
    if-eqz v0, :cond_3

    .line 948
    iget-object v1, p0, Lcom/flurry/sdk/iy;->t:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 952
    :cond_3
    iget-object v0, p0, Lcom/flurry/sdk/iy;->l:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 953
    invoke-virtual {p0}, Lcom/flurry/sdk/iy;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 922
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private j()V
    .locals 1

    .prologue
    .line 959
    iget-object v0, p0, Lcom/flurry/sdk/iy;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 960
    iget-object v0, p0, Lcom/flurry/sdk/iy;->m:Lcom/flurry/sdk/jv;

    invoke-virtual {v0}, Lcom/flurry/sdk/jv;->b()Z

    .line 961
    return-void
.end method

.method private k()Ljava/lang/String;
    .locals 3

    .prologue
    .line 964
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".flurryagent."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private l()Ljava/lang/String;
    .locals 4

    .prologue
    .line 968
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".yflurryreport."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/flurry/sdk/lp;->i(Ljava/lang/String;)J

    move-result-wide v2

    const/16 v1, 0x10

    invoke-static {v2, v3, v1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private m()V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 972
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "FLURRY_SHARED_PREFERENCES"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 974
    const-string v1, "com.flurry.sdk.previous_successful_report"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/flurry/sdk/iy;->n:Z

    .line 975
    const-string v1, "com.flurry.sdk.initial_run_time"

    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/flurry/sdk/iy;->o:J

    .line 976
    return-void
.end method

.method private n()V
    .locals 4

    .prologue
    .line 979
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jo;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "FLURRY_SHARED_PREFERENCES"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 980
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 982
    const-string v1, "com.flurry.sdk.previous_successful_report"

    iget-boolean v2, p0, Lcom/flurry/sdk/iy;->n:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 983
    const-string v1, "com.flurry.sdk.initial_run_time"

    iget-wide v2, p0, Lcom/flurry/sdk/iy;->o:J

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 984
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 985
    return-void
.end method

.method private o()I
    .locals 1

    .prologue
    .line 988
    iget-object v0, p0, Lcom/flurry/sdk/iy;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    return v0
.end method

.method private p()I
    .locals 1

    .prologue
    .line 992
    iget-object v0, p0, Lcom/flurry/sdk/iy;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    return v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/flurry/android/FlurryEventRecordStatus;"
        }
    .end annotation

    .prologue
    .line 617
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventFailed:Lcom/flurry/android/FlurryEventRecordStatus;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 618
    if-nez p3, :cond_1

    .line 628
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    .line 621
    :cond_1
    :try_start_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 625
    const-string v0, "\ue8ffsid+Tumblr"

    invoke-interface {p3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p3, v0}, Lcom/flurry/sdk/iy;->a(Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;

    move-result-object v0

    .line 627
    const/4 v1, 0x5

    sget-object v2, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "logEvent status for syndication:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 617
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/util/Map;Z)Lcom/flurry/android/FlurryEventRecordStatus;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/flurry/android/FlurryEventRecordStatus;"
        }
    .end annotation

    .prologue
    .line 632
    monitor-enter p0

    :try_start_0
    sget-object v1, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventRecorded:Lcom/flurry/android/FlurryEventRecordStatus;

    .line 634
    iget-boolean v0, p0, Lcom/flurry/sdk/iy;->D:Z

    if-nez v0, :cond_1

    .line 635
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventAnalyticsDisabled:Lcom/flurry/android/FlurryEventRecordStatus;

    .line 636
    sget-object v1, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v2, "Analytics has been disabled, not logging event."

    invoke-static {v1, v2}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 711
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    .line 640
    :cond_1
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->e()J

    move-result-wide v4

    sub-long v4, v2, v4

    .line 642
    invoke-static {p1}, Lcom/flurry/sdk/lp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 643
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 644
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventFailed:Lcom/flurry/android/FlurryEventRecordStatus;

    goto :goto_0

    .line 647
    :cond_2
    iget-object v0, p0, Lcom/flurry/sdk/iy;->w:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/is;

    .line 648
    if-nez v0, :cond_4

    .line 649
    iget-object v0, p0, Lcom/flurry/sdk/iy;->w:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    sget v3, Lcom/flurry/sdk/iy;->a:I

    if-ge v0, v3, :cond_3

    .line 650
    new-instance v0, Lcom/flurry/sdk/is;

    invoke-direct {v0}, Lcom/flurry/sdk/is;-><init>()V

    .line 651
    const/4 v3, 0x1

    iput v3, v0, Lcom/flurry/sdk/is;->a:I

    .line 652
    iget-object v3, p0, Lcom/flurry/sdk/iy;->w:Ljava/util/Map;

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Event count started: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    .line 665
    :goto_1
    iget-boolean v1, p0, Lcom/flurry/sdk/iy;->p:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/flurry/sdk/iy;->x:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sget v3, Lcom/flurry/sdk/iy;->c:I

    if-ge v1, v3, :cond_7

    iget v1, p0, Lcom/flurry/sdk/iy;->z:I

    sget v3, Lcom/flurry/sdk/iy;->d:I

    if-ge v1, v3, :cond_7

    .line 666
    if-nez p2, :cond_8

    .line 667
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    .line 669
    :goto_2
    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v0

    sget v1, Lcom/flurry/sdk/iy;->b:I

    if-le v0, v1, :cond_5

    .line 670
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MaxEventParams exceeded: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 671
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventParamsCountExceeded:Lcom/flurry/android/FlurryEventRecordStatus;

    goto/16 :goto_0

    .line 655
    :cond_3
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Too many different events. Event not counted: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 657
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventUniqueCountExceeded:Lcom/flurry/android/FlurryEventRecordStatus;

    goto :goto_1

    .line 660
    :cond_4
    iget v1, v0, Lcom/flurry/sdk/is;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/flurry/sdk/is;->a:I

    .line 661
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Event count incremented: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventRecorded:Lcom/flurry/android/FlurryEventRecordStatus;

    goto :goto_1

    .line 674
    :cond_5
    new-instance v0, Lcom/flurry/sdk/it;

    invoke-direct {p0}, Lcom/flurry/sdk/iy;->o()I

    move-result v1

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/flurry/sdk/it;-><init>(ILjava/lang/String;Ljava/util/Map;JZ)V

    .line 677
    invoke-virtual {v0}, Lcom/flurry/sdk/it;->d()I

    move-result v1

    iget v4, p0, Lcom/flurry/sdk/iy;->z:I

    add-int/2addr v1, v4

    sget v4, Lcom/flurry/sdk/iy;->d:I

    if-gt v1, v4, :cond_6

    .line 678
    iget-object v1, p0, Lcom/flurry/sdk/iy;->x:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 679
    iget v1, p0, Lcom/flurry/sdk/iy;->z:I

    invoke-virtual {v0}, Lcom/flurry/sdk/it;->d()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/flurry/sdk/iy;->z:I

    .line 680
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventRecorded:Lcom/flurry/android/FlurryEventRecordStatus;

    .line 686
    iget-boolean v1, p0, Lcom/flurry/sdk/iy;->D:Z

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/hi;->c()Lcom/flurry/sdk/id;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 687
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    new-instance v4, Lcom/flurry/sdk/iy$7;

    invoke-direct {v4, p0, v2, v3}, Lcom/flurry/sdk/iy$7;-><init>(Lcom/flurry/sdk/iy;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v1, v4}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 632
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 696
    :cond_6
    :try_start_2
    sget v0, Lcom/flurry/sdk/iy;->d:I

    iput v0, p0, Lcom/flurry/sdk/iy;->z:I

    .line 697
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/flurry/sdk/iy;->y:Z

    .line 699
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v1, "Event Log size exceeded. No more event details logged."

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 702
    sget-object v0, Lcom/flurry/android/FlurryEventRecordStatus;->kFlurryEventLogCountExceeded:Lcom/flurry/android/FlurryEventRecordStatus;

    goto/16 :goto_0

    .line 706
    :cond_7
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/flurry/sdk/iy;->y:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    :cond_8
    move-object v3, p2

    goto/16 :goto_2
.end method

.method declared-synchronized a(JJJI)Lcom/flurry/sdk/iw;
    .locals 7

    .prologue
    .line 564
    monitor-enter p0

    :try_start_0
    new-instance v2, Lcom/flurry/sdk/ix;

    invoke-direct {v2}, Lcom/flurry/sdk/ix;-><init>()V

    .line 566
    invoke-static {}, Lcom/flurry/sdk/jl;->a()Lcom/flurry/sdk/jl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jl;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->a(Ljava/lang/String;)V

    .line 567
    invoke-virtual {v2, p1, p2}, Lcom/flurry/sdk/ix;->a(J)V

    .line 568
    invoke-virtual {v2, p3, p4}, Lcom/flurry/sdk/ix;->b(J)V

    .line 569
    invoke-virtual {v2, p5, p6}, Lcom/flurry/sdk/ix;->c(J)V

    .line 570
    iget-object v0, p0, Lcom/flurry/sdk/iy;->v:Ljava/util/Map;

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->a(Ljava/util/Map;)V

    .line 571
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->b(Ljava/lang/String;)V

    .line 572
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->c(Ljava/lang/String;)V

    .line 573
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->k()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->b(Ljava/util/Map;)V

    .line 575
    invoke-static {}, Lcom/flurry/sdk/jf;->a()Lcom/flurry/sdk/jf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jf;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->d(Ljava/lang/String;)V

    .line 576
    invoke-static {}, Lcom/flurry/sdk/jf;->a()Lcom/flurry/sdk/jf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jf;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->e(Ljava/lang/String;)V

    .line 577
    invoke-virtual {v2, p7}, Lcom/flurry/sdk/ix;->a(I)V

    .line 578
    invoke-static {}, Lcom/flurry/sdk/ln;->j()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->b(I)V

    .line 579
    invoke-virtual {p0}, Lcom/flurry/sdk/iy;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->f(Ljava/lang/String;)V

    .line 581
    invoke-static {}, Lcom/flurry/sdk/jg;->a()Lcom/flurry/sdk/jg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jg;->e()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->a(Landroid/location/Location;)V

    .line 583
    invoke-virtual {p0}, Lcom/flurry/sdk/iy;->h()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->c(I)V

    .line 584
    iget-byte v0, p0, Lcom/flurry/sdk/iy;->r:B

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->a(B)V

    .line 585
    iget-object v0, p0, Lcom/flurry/sdk/iy;->s:Ljava/lang/Long;

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->a(Ljava/lang/Long;)V

    .line 587
    invoke-virtual {p0}, Lcom/flurry/sdk/iy;->g()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->c(Ljava/util/Map;)V

    .line 588
    invoke-virtual {p0}, Lcom/flurry/sdk/iy;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->a(Ljava/util/List;)V

    .line 589
    iget-boolean v0, p0, Lcom/flurry/sdk/iy;->y:Z

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->a(Z)V

    .line 591
    invoke-virtual {p0}, Lcom/flurry/sdk/iy;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->b(Ljava/util/List;)V

    .line 592
    iget v0, p0, Lcom/flurry/sdk/iy;->B:I

    invoke-virtual {v2, v0}, Lcom/flurry/sdk/ix;->d(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 597
    const/4 v1, 0x0

    .line 599
    :try_start_1
    new-instance v0, Lcom/flurry/sdk/iw;

    invoke-direct {v0, v2}, Lcom/flurry/sdk/iw;-><init>(Lcom/flurry/sdk/ix;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 604
    :goto_0
    if-nez v0, :cond_0

    .line 605
    :try_start_2
    sget-object v1, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v2, "New session report wasn\'t created"

    invoke-static {v1, v2}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 608
    :cond_0
    monitor-exit p0

    return-object v0

    .line 600
    :catch_0
    move-exception v0

    .line 601
    const/4 v2, 0x5

    :try_start_3
    sget-object v3, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error creating analytics session report: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v0, v1

    goto :goto_0

    .line 564
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 447
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flurry/sdk/iy;->n:Z

    .line 448
    return-void
.end method

.method public declared-synchronized a(J)V
    .locals 3

    .prologue
    .line 364
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    iget-object v1, p0, Lcom/flurry/sdk/iy;->F:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jy;->a(Lcom/flurry/sdk/jx;)V

    .line 367
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/iy$5;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/iy$5;-><init>(Lcom/flurry/sdk/iy;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 395
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jc;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 396
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/iy$6;

    invoke-direct {v1, p0, p1, p2}, Lcom/flurry/sdk/iy$6;-><init>(Lcom/flurry/sdk/iy;J)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 404
    :cond_0
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    const-string v1, "Gender"

    invoke-virtual {v0, v1, p0}, Lcom/flurry/sdk/lg;->b(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)Z

    .line 406
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    const-string v1, "UserId"

    invoke-virtual {v0, v1, p0}, Lcom/flurry/sdk/lg;->b(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)Z

    .line 408
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    const-string v1, "Age"

    invoke-virtual {v0, v1, p0}, Lcom/flurry/sdk/lg;->b(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)Z

    .line 409
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    const-string v1, "LogEvents"

    invoke-virtual {v0, v1, p0}, Lcom/flurry/sdk/lg;->b(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 411
    monitor-exit p0

    return-void

    .line 364
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 289
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/hi;->e()Lcom/flurry/sdk/if;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 290
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/iy$15;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/iy$15;-><init>(Lcom/flurry/sdk/iy;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 299
    :cond_0
    iget-boolean v0, p0, Lcom/flurry/sdk/iy;->D:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/hi;->c()Lcom/flurry/sdk/id;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 300
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/iy$16;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/iy$16;-><init>(Lcom/flurry/sdk/iy;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 308
    :cond_1
    monitor-exit p0

    return-void

    .line 289
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Lcom/flurry/sdk/lb;Landroid/content/Context;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x4

    .line 204
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->k:Ljava/lang/ref/WeakReference;

    .line 206
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v1

    .line 208
    const-string v0, "LogEvents"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/iy;->p:Z

    .line 209
    const-string v0, "LogEvents"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 210
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, LogEvents = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lcom/flurry/sdk/iy;->p:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 212
    const-string v0, "UserId"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/flurry/sdk/iy;->q:Ljava/lang/String;

    .line 213
    const-string v0, "UserId"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 214
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, UserId = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/flurry/sdk/iy;->q:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 216
    const-string v0, "Gender"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    iput-byte v0, p0, Lcom/flurry/sdk/iy;->r:B

    .line 217
    const-string v0, "Gender"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 218
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, Gender = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-byte v3, p0, Lcom/flurry/sdk/iy;->r:B

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 220
    const-string v0, "Age"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/flurry/sdk/iy;->s:Ljava/lang/Long;

    .line 221
    const-string v0, "Age"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 222
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, BirthDate = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/flurry/sdk/iy;->s:Ljava/lang/Long;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 224
    const-string v0, "analyticsEnabled"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/iy;->D:Z

    .line 225
    const-string v0, "analyticsEnabled"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 226
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "initSettings, AnalyticsEnabled = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/flurry/sdk/iy;->D:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v0, v1}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 228
    invoke-direct {p0}, Lcom/flurry/sdk/iy;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/flurry/sdk/iy;->l:Ljava/io/File;

    .line 230
    new-instance v0, Lcom/flurry/sdk/jv;

    invoke-direct {p0}, Lcom/flurry/sdk/iy;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, ".yflurryreport."

    new-instance v3, Lcom/flurry/sdk/iy$10;

    invoke-direct {v3, p0}, Lcom/flurry/sdk/iy$10;-><init>(Lcom/flurry/sdk/iy;)V

    invoke-direct {v0, v1, v2, v5, v3}, Lcom/flurry/sdk/jv;-><init>(Ljava/io/File;Ljava/lang/String;ILcom/flurry/sdk/la;)V

    iput-object v0, p0, Lcom/flurry/sdk/iy;->m:Lcom/flurry/sdk/jv;

    .line 237
    invoke-direct {p0, p2}, Lcom/flurry/sdk/iy;->c(Landroid/content/Context;)V

    .line 238
    invoke-direct {p0, v5}, Lcom/flurry/sdk/iy;->a(Z)V

    .line 242
    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/hi;->c()Lcom/flurry/sdk/id;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 243
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/iy$11;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/iy$11;-><init>(Lcom/flurry/sdk/iy;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 252
    :cond_0
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/iy$12;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/iy$12;-><init>(Lcom/flurry/sdk/iy;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 258
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/iy$13;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/iy$13;-><init>(Lcom/flurry/sdk/iy;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 267
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jc;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 268
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/iy$14;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/iy$14;-><init>(Lcom/flurry/sdk/iy;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 277
    :goto_0
    return-void

    .line 275
    :cond_1
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.IdProviderFinishedEvent"

    iget-object v2, p0, Lcom/flurry/sdk/iy;->F:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->a(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v1, 0x4

    .line 415
    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    :cond_0
    :goto_0
    packed-switch v0, :pswitch_data_0

    .line 437
    const/4 v0, 0x6

    sget-object v1, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v2, "onSettingUpdate internal error!"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 440
    :goto_1
    return-void

    .line 415
    :sswitch_0
    const-string v2, "LogEvents"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :sswitch_1
    const-string v2, "UserId"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v2, "Gender"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :sswitch_3
    const-string v2, "Age"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :sswitch_4
    const-string v2, "analyticsEnabled"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 417
    :pswitch_0
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/iy;->p:Z

    .line 418
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onSettingUpdate, LogEvents = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lcom/flurry/sdk/iy;->p:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 421
    :pswitch_1
    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/flurry/sdk/iy;->q:Ljava/lang/String;

    .line 422
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onSettingUpdate, UserId = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/flurry/sdk/iy;->q:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 425
    :pswitch_2
    check-cast p2, Ljava/lang/Byte;

    invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    iput-byte v0, p0, Lcom/flurry/sdk/iy;->r:B

    .line 426
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onSettingUpdate, Gender = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-byte v3, p0, Lcom/flurry/sdk/iy;->r:B

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 429
    :pswitch_3
    check-cast p2, Ljava/lang/Long;

    iput-object p2, p0, Lcom/flurry/sdk/iy;->s:Ljava/lang/Long;

    .line 430
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onSettingUpdate, Birthdate = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/flurry/sdk/iy;->s:Ljava/lang/Long;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 433
    :pswitch_4
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/flurry/sdk/iy;->D:Z

    .line 434
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onSettingUpdate, AnalyticsEnabled = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lcom/flurry/sdk/iy;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 415
    nop

    :sswitch_data_0
    .sparse-switch
        -0x686fe59a -> :sswitch_1
        -0x66855b25 -> :sswitch_4
        -0x2bfdf2a3 -> :sswitch_0
        0x100df -> :sswitch_3
        0x7eeadee1 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 755
    monitor-enter p0

    if-eqz p1, :cond_1

    :try_start_0
    const-string v1, "uncaught"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 757
    :goto_0
    iget v2, p0, Lcom/flurry/sdk/iy;->B:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/flurry/sdk/iy;->B:I

    .line 758
    iget-object v2, p0, Lcom/flurry/sdk/iy;->A:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sget v3, Lcom/flurry/sdk/iy;->e:I

    if-ge v2, v3, :cond_2

    .line 759
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 760
    new-instance v0, Lcom/flurry/sdk/ir;

    invoke-direct {p0}, Lcom/flurry/sdk/iy;->p()I

    move-result v1

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/flurry/sdk/ir;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 762
    iget-object v1, p0, Lcom/flurry/sdk/iy;->A:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 764
    sget-object v1, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error logged: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/flurry/sdk/ir;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 782
    :cond_0
    :goto_1
    monitor-exit p0

    return-void

    :cond_1
    move v1, v0

    .line 755
    goto :goto_0

    .line 765
    :cond_2
    if-eqz v1, :cond_4

    move v8, v0

    .line 768
    :goto_2
    :try_start_1
    iget-object v0, p0, Lcom/flurry/sdk/iy;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 769
    iget-object v0, p0, Lcom/flurry/sdk/iy;->A:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/ir;

    .line 770
    invoke-virtual {v0}, Lcom/flurry/sdk/ir;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v1, "uncaught"

    invoke-virtual {v0}, Lcom/flurry/sdk/ir;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 772
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 773
    new-instance v0, Lcom/flurry/sdk/ir;

    invoke-direct {p0}, Lcom/flurry/sdk/iy;->p()I

    move-result v1

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/flurry/sdk/ir;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 775
    iget-object v1, p0, Lcom/flurry/sdk/iy;->A:Ljava/util/List;

    invoke-interface {v1, v8, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 755
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 768
    :cond_3
    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_2

    .line 780
    :cond_4
    :try_start_2
    sget-object v0, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v1, "Max errors logged. No more errors logged."

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 716
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/iy;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/it;

    .line 717
    invoke-virtual {v0, p1}, Lcom/flurry/sdk/it;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 718
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/flurry/sdk/jb;->e()J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 720
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v1

    if-lez v1, :cond_1

    iget v1, p0, Lcom/flurry/sdk/iy;->z:I

    sget v4, Lcom/flurry/sdk/iy;->d:I

    if-ge v1, v4, :cond_1

    .line 722
    iget v1, p0, Lcom/flurry/sdk/iy;->z:I

    invoke-virtual {v0}, Lcom/flurry/sdk/it;->d()I

    move-result v4

    sub-int/2addr v1, v4

    .line 724
    new-instance v4, Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/flurry/sdk/it;->c()Ljava/util/Map;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 726
    invoke-virtual {v0, p2}, Lcom/flurry/sdk/it;->a(Ljava/util/Map;)V

    .line 728
    invoke-virtual {v0}, Lcom/flurry/sdk/it;->d()I

    move-result v5

    add-int/2addr v5, v1

    sget v6, Lcom/flurry/sdk/iy;->d:I

    if-gt v5, v6, :cond_4

    .line 729
    invoke-virtual {v0}, Lcom/flurry/sdk/it;->c()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v5

    sget v6, Lcom/flurry/sdk/iy;->b:I

    if-le v5, v6, :cond_3

    .line 730
    sget-object v1, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "MaxEventParams exceeded on endEvent: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/flurry/sdk/it;->c()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 732
    invoke-virtual {v0, v4}, Lcom/flurry/sdk/it;->b(Ljava/util/Map;)V

    .line 748
    :cond_1
    :goto_0
    invoke-virtual {v0, v2, v3}, Lcom/flurry/sdk/it;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 752
    :cond_2
    monitor-exit p0

    return-void

    .line 735
    :cond_3
    :try_start_1
    invoke-virtual {v0}, Lcom/flurry/sdk/it;->d()I

    move-result v4

    add-int/2addr v1, v4

    iput v1, p0, Lcom/flurry/sdk/iy;->z:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 716
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 739
    :cond_4
    :try_start_2
    invoke-virtual {v0, v4}, Lcom/flurry/sdk/it;->b(Ljava/util/Map;)V

    .line 740
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/flurry/sdk/iy;->y:Z

    .line 741
    sget v1, Lcom/flurry/sdk/iy;->d:I

    iput v1, p0, Lcom/flurry/sdk/iy;->z:I

    .line 743
    sget-object v1, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v4, "Event Log size exceeded. No more event details logged."

    invoke-static {v1, v4}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public declared-synchronized b()V
    .locals 1

    .prologue
    .line 612
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/flurry/sdk/iy;->C:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/flurry/sdk/iy;->C:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 613
    monitor-exit p0

    return-void

    .line 612
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Landroid/content/Context;)V
    .locals 10

    .prologue
    .line 311
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0}, Lcom/flurry/sdk/iy;->a(Z)V

    .line 314
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v2

    .line 315
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->f()J

    move-result-wide v4

    .line 316
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->h()J

    move-result-wide v6

    .line 317
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->l()Lcom/flurry/sdk/ji$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ji$a;->a()I

    move-result v8

    .line 319
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->f()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/flurry/sdk/iy;->b(J)V

    .line 322
    iget-boolean v0, p0, Lcom/flurry/sdk/iy;->D:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/hi;->c()Lcom/flurry/sdk/id;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 323
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/iy$2;

    invoke-direct {v1, p0, v2, v3}, Lcom/flurry/sdk/iy$2;-><init>(Lcom/flurry/sdk/iy;J)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 332
    :cond_0
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/iy$3;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/iy$3;-><init>(Lcom/flurry/sdk/iy;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    .line 341
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jc;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 342
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v9

    new-instance v0, Lcom/flurry/sdk/iy$4;

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lcom/flurry/sdk/iy$4;-><init>(Lcom/flurry/sdk/iy;JJJI)V

    invoke-virtual {v9, v0}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 359
    :cond_1
    monitor-exit p0

    return-void

    .line 311
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 3

    .prologue
    .line 916
    monitor-enter p0

    const/4 v0, 0x4

    :try_start_0
    sget-object v1, Lcom/flurry/sdk/iy;->f:Ljava/lang/String;

    const-string v2, "Saving persistent agent data."

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 918
    iget-object v0, p0, Lcom/flurry/sdk/iy;->m:Lcom/flurry/sdk/jv;

    iget-object v1, p0, Lcom/flurry/sdk/iy;->t:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jv;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 919
    monitor-exit p0

    return-void

    .line 916
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1000
    iget-object v0, p0, Lcom/flurry/sdk/iy;->q:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/flurry/sdk/iy;->q:Ljava/lang/String;

    goto :goto_0
.end method

.method e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/it;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1016
    iget-object v0, p0, Lcom/flurry/sdk/iy;->x:Ljava/util/List;

    return-object v0
.end method

.method f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/ir;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1024
    iget-object v0, p0, Lcom/flurry/sdk/iy;->A:Ljava/util/List;

    return-object v0
.end method

.method g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/flurry/sdk/is;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1028
    iget-object v0, p0, Lcom/flurry/sdk/iy;->w:Ljava/util/Map;

    return-object v0
.end method

.method h()I
    .locals 1

    .prologue
    .line 1032
    iget v0, p0, Lcom/flurry/sdk/iy;->C:I

    return v0
.end method
