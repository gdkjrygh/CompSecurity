.class public Lcom/qihoo/security/adv/AdvDataManager;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/adv/AdvDataManager$6;,
        Lcom/qihoo/security/adv/AdvDataManager$c;,
        Lcom/qihoo/security/adv/AdvDataManager$a;,
        Lcom/qihoo/security/adv/AdvDataManager$b;,
        Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;,
        Lcom/qihoo/security/adv/AdvDataManager$AdvType;
    }
.end annotation


# static fields
.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static d:Lcom/qihoo/security/adv/AdvDataManager;


# instance fields
.field protected a:Ljava/lang/String;

.field private final e:Landroid/content/Context;

.field private final f:Landroid/os/HandlerThread;

.field private final g:Landroid/os/Handler;

.field private final h:Landroid/os/Handler;

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Lcom/qihoo/security/adv/a;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/Map;
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

.field private m:F

.field private n:I

.field private o:I

.field private final p:Ljava/lang/String;

.field private final q:I

.field private r:J

.field private final s:Lcom/android/volley/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const v3, 0x6ddd00

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager;->b:Ljava/util/Map;

    .line 68
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->b:Ljava/util/Map;

    const/16 v1, 0x1f4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->b:Ljava/util/Map;

    const/16 v1, 0x1f8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager;->c:Ljava/util/Map;

    .line 75
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->c:Ljava/util/Map;

    const/16 v1, 0xfa0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "params error"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->c:Ljava/util/Map;

    const/16 v1, 0xfa1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "no mid"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->c:Ljava/util/Map;

    const/16 v1, 0xfa2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "no seesion id"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->c:Ljava/util/Map;

    const/16 v1, 0xfa3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "no adv in the area"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->c:Ljava/util/Map;

    const/16 v1, 0xfa4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "server error"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->c:Ljava/util/Map;

    const/16 v1, 0xfa5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "no adv in server"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->c:Ljava/util/Map;

    const/16 v1, 0xfa6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "can not read config"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->c:Ljava/util/Map;

    const/16 v1, 0xfa7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "area config error"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    return-void
.end method

.method private constructor <init>()V
    .locals 6

    .prologue
    .line 348
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->r:J

    .line 120
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/adv/AdvDataManager$1;-><init>(Lcom/qihoo/security/adv/AdvDataManager;)V

    iput-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->s:Lcom/android/volley/c;

    .line 349
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->h:Landroid/os/Handler;

    .line 350
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->i:Ljava/util/Map;

    .line 351
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->j:Ljava/util/Map;

    .line 352
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->l:Ljava/util/Map;

    .line 353
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    .line 354
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 355
    if-nez v0, :cond_0

    .line 356
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Landroid/content/Context;)V

    .line 358
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->m:F

    .line 359
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->n:I

    .line 360
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->o:I

    .line 361
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    const-string/jumbo v1, "com.qihoo.security.lite"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/i;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->q:I

    .line 362
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/o;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->p:Ljava/lang/String;

    .line 363
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 364
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 365
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 366
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 367
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iput-object v4, p0, Lcom/qihoo/security/adv/AdvDataManager;->k:Ljava/util/Map;

    .line 368
    iget-object v4, p0, Lcom/qihoo/security/adv/AdvDataManager;->k:Ljava/util/Map;

    sget-object v5, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->AppLockAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v5}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->k:Ljava/util/Map;

    sget-object v4, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->BoosterResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v4}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->k:Ljava/util/Map;

    sget-object v4, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->BatteryLifeAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v4}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->k:Ljava/util/Map;

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->CleanResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->k:Ljava/util/Map;

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->CleanDeepResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->k:Ljava/util/Map;

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->VirusResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->k:Ljava/util/Map;

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->VirusFullScanResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "adv-data"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->f:Landroid/os/HandlerThread;

    .line 377
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->f:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 378
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$7;

    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->f:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/adv/AdvDataManager$7;-><init>(Lcom/qihoo/security/adv/AdvDataManager;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->g:Landroid/os/Handler;

    .line 431
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/adv/AdvDataManager;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    return-object v0
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/adv/AdvDataManager;
    .locals 2

    .prologue
    .line 308
    const-class v1, Lcom/qihoo/security/adv/AdvDataManager;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->d:Lcom/qihoo/security/adv/AdvDataManager;

    if-nez v0, :cond_0

    .line 309
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager;

    invoke-direct {v0}, Lcom/qihoo/security/adv/AdvDataManager;-><init>()V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager;->d:Lcom/qihoo/security/adv/AdvDataManager;

    .line 311
    :cond_0
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->d:Lcom/qihoo/security/adv/AdvDataManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 308
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Lcom/qihoo/security/adv/a;
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager;->e(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Lcom/qihoo/security/adv/a;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 464
    return-void
.end method

.method private a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;ILjava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1262
    const-string/jumbo v3, "http://l.a.mobimagic.com/statistics/"

    .line 1263
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/adv/AdvDataManager;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;ILjava/util/List;)Lorg/json/JSONArray;

    move-result-object v0

    .line 1264
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "statdata="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1265
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Click:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne p1, v0, :cond_0

    .line 1266
    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1267
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 1268
    if-eqz v0, :cond_0

    .line 1269
    invoke-virtual {p0, v0}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/ui/result/AdvData;)V

    .line 1273
    :cond_0
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$4;

    const/4 v2, 0x1

    new-instance v5, Lcom/qihoo/security/adv/AdvDataManager$2;

    invoke-direct {v5, p0, p1, p2}, Lcom/qihoo/security/adv/AdvDataManager$2;-><init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;I)V

    new-instance v6, Lcom/qihoo/security/adv/AdvDataManager$3;

    invoke-direct {v6, p0, p1, p2}, Lcom/qihoo/security/adv/AdvDataManager$3;-><init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;I)V

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/adv/AdvDataManager$4;-><init>(Lcom/qihoo/security/adv/AdvDataManager;ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;)V

    .line 1305
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->s:Lcom/android/volley/c;

    invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/l;->a(Lcom/android/volley/m;)Lcom/android/volley/Request;

    .line 1306
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "mid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/appbox/c/b/a;->a(Lcom/android/volley/Request;Ljava/lang/Object;)V

    .line 1307
    return-void
.end method

.method private a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Lorg/json/JSONObject;)V
    .locals 3

    .prologue
    .line 737
    invoke-static {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 760
    :cond_0
    :goto_0
    return-void

    .line 740
    :cond_1
    if-eqz p2, :cond_0

    .line 746
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager;->c(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/io/File;

    move-result-object v0

    .line 748
    :try_start_0
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "UTF-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    .line 749
    invoke-static {v1, v0}, Lcom/qihoo360/common/utils/FileUtil;->writeByteFile([BLjava/io/File;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 750
    if-eqz v0, :cond_0

    goto :goto_0

    .line 755
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/adv/AdvDataManager;JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo/security/adv/AdvDataManager;->b(JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$AdvType;Lorg/json/JSONObject;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/a;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager;->b(Lcom/qihoo/security/adv/a;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/adv/AdvDataManager;Ljava/lang/String;J)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/adv/AdvDataManager;->a(Ljava/lang/String;J)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/adv/AdvDataManager;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Ljava/util/List;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/qihoo/security/adv/a;)V
    .locals 4

    .prologue
    .line 475
    monitor-enter p0

    if-nez p1, :cond_1

    .line 507
    :cond_0
    monitor-exit p0

    return-void

    .line 478
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lcom/qihoo/security/adv/a;->c()Ljava/util/List;

    move-result-object v0

    .line 479
    if-eqz v0, :cond_0

    .line 482
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 483
    if-eqz v0, :cond_2

    .line 486
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->i()Lcom/qihoo/security/adv/e;

    move-result-object v0

    .line 487
    if-eqz v0, :cond_2

    .line 490
    iget-object v2, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/o;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 491
    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/qihoo/security/adv/AdvDataManager;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 475
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 494
    :cond_3
    :try_start_1
    invoke-virtual {p1}, Lcom/qihoo/security/adv/a;->d()Ljava/util/List;

    move-result-object v0

    .line 495
    if-eqz v0, :cond_0

    .line 498
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/e;

    .line 499
    if-eqz v0, :cond_4

    .line 502
    iget-object v2, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/o;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 503
    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/qihoo/security/adv/AdvDataManager;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method private a(Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 637
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->j:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 577
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 578
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 585
    invoke-static {}, Lcom/qihoo/security/appbox/c/a/b;->a()Lcom/qihoo/security/appbox/c/a/b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/qihoo/security/appbox/c/a/b;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 588
    :cond_1
    return-void
.end method

.method private a(Lcom/qihoo/security/adv/d;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 591
    if-nez p1, :cond_1

    .line 595
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/security/adv/d;->i()Lcom/qihoo/security/adv/e;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static final b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 673
    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1166
    const-string/jumbo v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 1167
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 1176
    :goto_0
    return-object p1

    .line 1170
    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 1174
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 1175
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/adv/AdvDataManager;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->i:Ljava/util/Map;

    return-object v0
.end method

.method private b(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;ILjava/util/List;)Lorg/json/JSONArray;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 1348
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 1350
    :try_start_0
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$6;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1393
    :cond_0
    :goto_0
    return-object v4

    .line 1352
    :pswitch_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1353
    const-string/jumbo v1, "type"

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->getType()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1354
    const-string/jumbo v1, "mid"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1355
    const-string/jumbo v1, "p1"

    const-string/jumbo v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1356
    const-string/jumbo v1, "p2"

    const-string/jumbo v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1357
    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 1391
    :catch_0
    move-exception v0

    goto :goto_0

    .line 1361
    :pswitch_1
    if-eqz p3, :cond_0

    .line 1365
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move v3, v2

    .line 1366
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 1367
    const/4 v0, 0x0

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 1368
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 1369
    if-nez v0, :cond_1

    .line 1366
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 1372
    :cond_1
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 1373
    const-string/jumbo v1, "type"

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->getType()I

    move-result v7

    invoke-virtual {v6, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1374
    const-string/jumbo v1, "mid"

    iget v7, v0, Lcom/qihoo/security/ui/result/AdvData;->mid:I

    invoke-virtual {v6, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1375
    iget-object v1, v0, Lcom/qihoo/security/ui/result/AdvData;->adid:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string/jumbo v1, "1"

    .line 1376
    :goto_3
    const-string/jumbo v7, "adid"

    invoke-virtual {v6, v7, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1377
    const-string/jumbo v1, "pid"

    iget v7, v0, Lcom/qihoo/security/ui/result/AdvData;->pid:I

    invoke-virtual {v6, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1378
    const-string/jumbo v1, "p1"

    iget-object v7, v0, Lcom/qihoo/security/ui/result/AdvData;->p1:Ljava/lang/String;

    invoke-virtual {v6, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1379
    const-string/jumbo v1, "p2"

    iget-object v7, v0, Lcom/qihoo/security/ui/result/AdvData;->p2:Ljava/lang/String;

    invoke-virtual {v6, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1380
    iget-object v1, v0, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    .line 1381
    :goto_4
    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/qihoo/security/ui/result/AdvData;->c1:Ljava/lang/String;

    if-nez v1, :cond_4

    const-string/jumbo v1, "1"

    .line 1382
    :goto_5
    const-string/jumbo v7, "c1"

    invoke-virtual {v6, v7, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1383
    const-string/jumbo v1, "c2"

    iget-object v7, v0, Lcom/qihoo/security/ui/result/AdvData;->c2:Ljava/lang/String;

    invoke-virtual {v6, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1384
    const-string/jumbo v1, "c3"

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->c3:Ljava/lang/String;

    invoke-virtual {v6, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1385
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    .line 1375
    :cond_2
    iget-object v1, v0, Lcom/qihoo/security/ui/result/AdvData;->adid:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move v1, v2

    .line 1380
    goto :goto_4

    .line 1381
    :cond_4
    iget-object v1, v0, Lcom/qihoo/security/ui/result/AdvData;->c1:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 1350
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private b(JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Lcom/qihoo/security/adv/AdvDataManager$c",
            "<",
            "Lcom/qihoo/security/adv/AdvDataManager$a;",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 609
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/common/e/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 613
    if-eqz p4, :cond_0

    .line 614
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x2714

    invoke-interface {p4, p3, v0, v1}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 619
    :cond_0
    :goto_0
    return-void

    .line 618
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/qihoo/security/adv/AdvDataManager;->a(JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V

    goto :goto_0
.end method

.method private b(Lcom/qihoo/security/adv/a;)V
    .locals 4

    .prologue
    .line 522
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/common/e/b;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 574
    :cond_0
    :goto_0
    return-void

    .line 525
    :cond_1
    if-eqz p1, :cond_0

    .line 528
    invoke-virtual {p1}, Lcom/qihoo/security/adv/a;->c()Ljava/util/List;

    move-result-object v0

    .line 529
    if-eqz v0, :cond_0

    .line 532
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 533
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 534
    if-eqz v0, :cond_2

    .line 537
    invoke-direct {p0, v0}, Lcom/qihoo/security/adv/AdvDataManager;->b(Lcom/qihoo/security/adv/d;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 540
    invoke-direct {p0, v0}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/d;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 541
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->i()Lcom/qihoo/security/adv/e;

    move-result-object v0

    .line 542
    if-eqz v0, :cond_2

    .line 545
    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->j()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 546
    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 550
    :cond_3
    invoke-virtual {p1}, Lcom/qihoo/security/adv/a;->d()Ljava/util/List;

    move-result-object v0

    .line 551
    if-eqz v0, :cond_0

    .line 554
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/e;

    .line 555
    if-eqz v0, :cond_4

    .line 558
    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->j()Ljava/lang/String;

    move-result-object v3

    .line 559
    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->i()Ljava/lang/String;

    move-result-object v0

    .line 563
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 564
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 566
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->h:Landroid/os/Handler;

    new-instance v2, Lcom/qihoo/security/adv/AdvDataManager$8;

    invoke-direct {v2, p0, v1}, Lcom/qihoo/security/adv/AdvDataManager$8;-><init>(Lcom/qihoo/security/adv/AdvDataManager;Ljava/util/List;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method private b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 644
    if-nez p1, :cond_0

    move v0, v1

    .line 669
    :goto_0
    return v0

    .line 653
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->j:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 654
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->j:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 655
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 659
    cmp-long v0, v4, v2

    if-lez v0, :cond_1

    .line 660
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->j:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v1

    .line 661
    goto :goto_0

    .line 663
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 669
    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/a;)Z
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager;->c(Lcom/qihoo/security/adv/a;)Z

    move-result v0

    return v0
.end method

.method private b(Lcom/qihoo/security/adv/d;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 599
    if-nez p1, :cond_1

    .line 602
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/security/adv/d;->e()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/qihoo/security/adv/AdvDataManager;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->g:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/io/File;
    .locals 3

    .prologue
    .line 677
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    const-string/jumbo v1, "adv"

    invoke-static {v0, v1}, Lcom/qihoo/security/appbox/c/b/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 678
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 679
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 681
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-static {p1}, Lcom/qihoo/security/adv/AdvDataManager;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 682
    return-object v1
.end method

.method static synthetic c(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/a;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/a;)V

    return-void
.end method

.method private c(Lcom/qihoo/security/adv/a;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 622
    invoke-virtual {p1}, Lcom/qihoo/security/adv/a;->b()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {p1}, Lcom/qihoo/security/adv/a;->a()J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 623
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gez v2, :cond_1

    move v2, v0

    .line 624
    :goto_0
    if-nez v2, :cond_0

    .line 626
    invoke-virtual {p1}, Lcom/qihoo/security/adv/a;->a()J

    move-result-wide v2

    const-wide/32 v4, 0x240c8400

    add-long/2addr v2, v4

    .line 627
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gez v2, :cond_2

    .line 630
    :cond_0
    :goto_1
    return v0

    :cond_1
    move v2, v1

    .line 623
    goto :goto_0

    :cond_2
    move v0, v1

    .line 627
    goto :goto_1
.end method

.method static synthetic d(Lcom/qihoo/security/adv/AdvDataManager;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/qihoo/security/adv/AdvDataManager;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d()Ljava/util/Map;
    .locals 1

    .prologue
    .line 61
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->c:Ljava/util/Map;

    return-object v0
.end method

.method private d(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 686
    invoke-static {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 693
    :cond_0
    :goto_0
    return v0

    .line 689
    :cond_1
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager;->c(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/io/File;

    move-result-object v1

    .line 690
    if-eqz v1, :cond_0

    .line 691
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    goto :goto_0
.end method

.method private e(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Lcom/qihoo/security/adv/a;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 697
    invoke-static {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 733
    :cond_0
    :goto_0
    return-object v1

    .line 704
    :cond_1
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/AdvDataManager;->c(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/io/File;

    move-result-object v0

    .line 705
    invoke-static {v0}, Lcom/qihoo360/common/utils/FileUtil;->readFileByte(Ljava/io/File;)[B

    move-result-object v2

    .line 706
    if-eqz v2, :cond_2

    .line 708
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string/jumbo v3, "UTF-8"

    invoke-direct {v0, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 715
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 720
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v2

    .line 726
    :goto_2
    if-eqz v0, :cond_0

    .line 729
    invoke-static {v0}, Lcom/qihoo/security/adv/b;->a(Lorg/json/JSONObject;)Lcom/qihoo/security/adv/a;

    move-result-object v1

    goto :goto_0

    .line 709
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_1

    .line 721
    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_2

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method static synthetic e()Ljava/util/Map;
    .locals 1

    .prologue
    .line 61
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager;->b:Ljava/util/Map;

    return-object v0
.end method

.method private f()Ljava/lang/String;
    .locals 4

    .prologue
    .line 320
    const-string/jumbo v2, "|"

    .line 321
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    const-string/jumbo v0, "9"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    const-string/jumbo v0, "ILOVE360SECohmgd"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    iget v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->q:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 327
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 329
    if-nez v0, :cond_1

    .line 330
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    move-object v1, v0

    .line 332
    :goto_0
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 335
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->p:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    const-string/jumbo v2, "phone"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 339
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v2

    .line 340
    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    .line 341
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 342
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v2, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 344
    :cond_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    move-object v1, v0

    goto :goto_0
.end method

.method private declared-synchronized f(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 787
    monitor-enter p0

    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 788
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->k:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 789
    const/4 v1, 0x1

    .line 790
    if-eqz v0, :cond_7

    .line 791
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 792
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 795
    if-nez v2, :cond_1

    .line 796
    const-string/jumbo v2, ","

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    :cond_1
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v2, v3

    .line 801
    goto :goto_0

    .line 802
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->clear()V

    move v0, v2

    .line 804
    :goto_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 805
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v0

    .line 806
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 807
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 808
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 809
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 810
    if-nez v2, :cond_3

    .line 811
    const-string/jumbo v7, ","

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    :cond_3
    iget-object v7, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    invoke-static {v7, v1}, Lcom/qihoo360/mobilesafe/b/o;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 814
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 787
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 817
    :cond_4
    :try_start_1
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v2, v3

    .line 819
    goto :goto_2

    .line 820
    :cond_5
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 821
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 822
    iget-object v2, p0, Lcom/qihoo/security/adv/AdvDataManager;->l:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 825
    :cond_6
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :cond_7
    move v0, v1

    goto :goto_1
.end method

.method private g(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 829
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 830
    invoke-direct {p0}, Lcom/qihoo/security/adv/AdvDataManager;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string/jumbo v0, "yes"

    .line 831
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/o;->g(Landroid/content/Context;)Z

    move-result v1

    .line 832
    if-eqz v1, :cond_2

    const-string/jumbo v1, "yes"

    .line 833
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "gp="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 834
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "&mid="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 835
    const-string/jumbo v0, "&pids="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "&fb="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 837
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 838
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "&gaid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 840
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 830
    :cond_1
    const-string/jumbo v0, "no"

    goto/16 :goto_0

    .line 832
    :cond_2
    const-string/jumbo v1, "no"

    goto :goto_1
.end method

.method private g()Z
    .locals 2

    .prologue
    .line 986
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->e:Landroid/content/Context;

    const-string/jumbo v1, "com.android.vending"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/o;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 987
    return v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Lcom/qihoo/security/adv/a;
    .locals 1

    .prologue
    .line 1005
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/a;

    return-object v0
.end method

.method public a(ILjava/lang/String;)Ljava/lang/String;
    .locals 10

    .prologue
    const/high16 v9, 0x40400000    # 3.0f

    const/high16 v8, 0x40000000    # 2.0f

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    .line 1140
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1141
    const-string/jumbo v0, ""

    .line 1162
    :goto_0
    return-object v0

    .line 1144
    :cond_0
    const-string/jumbo v1, "re-"

    .line 1145
    const-string/jumbo v2, "-"

    .line 1146
    const-string/jumbo v0, ""

    .line 1147
    const-string/jumbo v3, ""

    .line 1148
    iget v3, p0, Lcom/qihoo/security/adv/AdvDataManager;->m:F

    float-to-double v4, v3

    cmpg-double v3, v4, v6

    if-gtz v3, :cond_3

    .line 1149
    if-nez p1, :cond_2

    const-string/jumbo v0, "108_108"

    .line 1157
    :cond_1
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1158
    invoke-direct {p0, p2, v0}, Lcom/qihoo/security/adv/AdvDataManager;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1149
    :cond_2
    const-string/jumbo v0, "516_264"

    goto :goto_1

    .line 1150
    :cond_3
    iget v3, p0, Lcom/qihoo/security/adv/AdvDataManager;->m:F

    float-to-double v4, v3

    cmpl-double v3, v4, v6

    if-lez v3, :cond_5

    iget v3, p0, Lcom/qihoo/security/adv/AdvDataManager;->m:F

    cmpg-float v3, v3, v8

    if-gtz v3, :cond_5

    .line 1151
    if-nez p1, :cond_4

    const-string/jumbo v0, "144_144"

    goto :goto_1

    :cond_4
    const-string/jumbo v0, "688_352"

    goto :goto_1

    .line 1152
    :cond_5
    iget v3, p0, Lcom/qihoo/security/adv/AdvDataManager;->m:F

    cmpl-float v3, v3, v8

    if-lez v3, :cond_7

    iget v3, p0, Lcom/qihoo/security/adv/AdvDataManager;->m:F

    cmpg-float v3, v3, v9

    if-gtz v3, :cond_7

    .line 1153
    if-nez p1, :cond_6

    const-string/jumbo v0, "216_216"

    goto :goto_1

    :cond_6
    const-string/jumbo v0, "1032_528"

    goto :goto_1

    .line 1154
    :cond_7
    iget v3, p0, Lcom/qihoo/security/adv/AdvDataManager;->m:F

    cmpl-float v3, v3, v9

    if-lez v3, :cond_1

    .line 1155
    if-nez p1, :cond_8

    const-string/jumbo v0, "288_288"

    goto :goto_1

    :cond_8
    const-string/jumbo v0, "1376_704"

    goto :goto_1
.end method

.method public a(JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Lcom/qihoo/security/adv/AdvDataManager$c",
            "<",
            "Lcom/qihoo/security/adv/AdvDataManager$a;",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 845
    new-instance v6, Ljava/lang/ref/WeakReference;

    move-object/from16 v0, p4

    invoke-direct {v6, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 847
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lcom/qihoo/security/adv/AdvDataManager;->g(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/lang/String;

    move-result-object v2

    .line 848
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "http://a.mobimagic.com/ads/?"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 849
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1, v7}, Lcom/qihoo/security/adv/AdvDataManager;->b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 853
    if-eqz p4, :cond_0

    .line 854
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x2715

    move-object/from16 v0, p4

    move-object/from16 v1, p3

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 973
    :cond_0
    :goto_0
    return-void

    .line 858
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "&ex="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lcom/qihoo/security/adv/AdvDataManager;->f(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 862
    new-instance v2, Lcom/qihoo/security/adv/AdvDataManager$11;

    const/4 v13, 0x0

    const-string/jumbo v12, ""

    new-instance v3, Lcom/qihoo/security/adv/AdvDataManager$9;

    move-object/from16 v4, p0

    move-object/from16 v5, p3

    move-wide/from16 v8, p1

    invoke-direct/range {v3 .. v9}, Lcom/qihoo/security/adv/AdvDataManager$9;-><init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/ref/WeakReference;Ljava/lang/String;J)V

    new-instance v4, Lcom/qihoo/security/adv/AdvDataManager$10;

    move-object/from16 v5, p0

    move-object/from16 v8, p3

    move-wide/from16 v9, p1

    invoke-direct/range {v4 .. v10}, Lcom/qihoo/security/adv/AdvDataManager$10;-><init>(Lcom/qihoo/security/adv/AdvDataManager;Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V

    move-object v8, v2

    move-object/from16 v9, p0

    move v10, v13

    move-object v13, v3

    move-object v14, v4

    move-object v15, v7

    invoke-direct/range {v8 .. v15}, Lcom/qihoo/security/adv/AdvDataManager$11;-><init>(Lcom/qihoo/security/adv/AdvDataManager;ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;Ljava/lang/String;)V

    .line 966
    if-eqz p4, :cond_2

    .line 967
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v0, p4

    move-object/from16 v1, p3

    invoke-interface {v0, v1, v3}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 969
    :cond_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/security/adv/AdvDataManager;->s:Lcom/android/volley/c;

    invoke-virtual {v2, v3}, Lcom/android/volley/toolbox/i;->a(Lcom/android/volley/m;)Lcom/android/volley/Request;

    .line 970
    invoke-virtual/range {p3 .. p3}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/qihoo/security/appbox/c/b/a;->a(Lcom/android/volley/Request;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1244
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1252
    :cond_0
    :goto_0
    return-void

    .line 1247
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 1248
    if-eqz v0, :cond_0

    .line 1251
    iget v0, v0, Lcom/qihoo/security/ui/result/AdvData;->mid:I

    invoke-direct {p0, p1, v0, p2}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;ILjava/util/List;)V

    goto :goto_0
.end method

.method public declared-synchronized a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 771
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->k:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 772
    if-nez v0, :cond_1

    .line 784
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 778
    :cond_1
    :try_start_1
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 779
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 771
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Lcom/qihoo/security/adv/AdvDataManager$c;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$c",
            "<",
            "Lcom/qihoo/security/adv/AdvDataManager$a;",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "J)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x2

    .line 1057
    invoke-virtual {p0}, Lcom/qihoo/security/adv/AdvDataManager;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1112
    :cond_0
    :goto_0
    return-void

    .line 1064
    :cond_1
    if-eqz p2, :cond_0

    .line 1070
    invoke-static {p2}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1074
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->i:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/a;

    .line 1075
    if-eqz v0, :cond_3

    .line 1079
    invoke-direct {p0, v0}, Lcom/qihoo/security/adv/AdvDataManager;->c(Lcom/qihoo/security/adv/a;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1083
    invoke-direct {p0, p3, p4, p2, p1}, Lcom/qihoo/security/adv/AdvDataManager;->b(JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V

    goto :goto_0

    .line 1088
    :cond_2
    new-instance v2, Lcom/qihoo/security/adv/AdvDataManager$a;

    invoke-direct {v2, v0, v3}, Lcom/qihoo/security/adv/AdvDataManager$a;-><init>(Lcom/qihoo/security/adv/a;I)V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$c;Lcom/qihoo/security/adv/AdvDataManager$a;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V

    goto :goto_0

    .line 1090
    :cond_3
    invoke-direct {p0, p2}, Lcom/qihoo/security/adv/AdvDataManager;->d(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1094
    invoke-direct {p0, p3, p4, p2, p1}, Lcom/qihoo/security/adv/AdvDataManager;->b(JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V

    goto :goto_0

    .line 1099
    :cond_4
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/adv/AdvDataManager$b;-><init>(Lcom/qihoo/security/adv/AdvDataManager$1;)V

    .line 1100
    iput-object p2, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 1101
    iput-object p1, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->a:Lcom/qihoo/security/adv/AdvDataManager$c;

    .line 1102
    iput-wide p3, v0, Lcom/qihoo/security/adv/AdvDataManager$b;->b:J

    .line 1103
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->g:Landroid/os/Handler;

    iget-object v2, p0, Lcom/qihoo/security/adv/AdvDataManager;->g:Landroid/os/Handler;

    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 1110
    :cond_5
    invoke-direct {p0, p3, p4, p2, p1}, Lcom/qihoo/security/adv/AdvDataManager;->b(JLcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/AdvDataManager$c;)V

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/adv/AdvDataManager$c;Lcom/qihoo/security/adv/AdvDataManager$a;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$c",
            "<",
            "Lcom/qihoo/security/adv/AdvDataManager$a;",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/qihoo/security/adv/AdvDataManager$a;",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "J)V"
        }
    .end annotation

    .prologue
    .line 1425
    if-nez p1, :cond_0

    .line 1437
    :goto_0
    return-void

    .line 1428
    :cond_0
    new-instance v1, Lcom/qihoo/security/adv/AdvDataManager$5;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/qihoo/security/adv/AdvDataManager$5;-><init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$c;Lcom/qihoo/security/adv/AdvDataManager$a;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V

    .line 1435
    invoke-virtual {p0, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/ui/result/AdvData;)V
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 1409
    if-eqz p1, :cond_0

    .line 1410
    iget-object v0, p1, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    .line 1411
    iget v3, p1, Lcom/qihoo/security/ui/result/AdvData;->pid:I

    .line 1412
    iget-object v4, p1, Lcom/qihoo/security/ui/result/AdvData;->adid:Ljava/lang/String;

    .line 1413
    iget-object v5, p1, Lcom/qihoo/security/ui/result/AdvData;->p1:Ljava/lang/String;

    .line 1414
    iget-object v6, p1, Lcom/qihoo/security/ui/result/AdvData;->p2:Ljava/lang/String;

    .line 1415
    iget-object v2, p1, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    .line 1416
    :goto_0
    if-eqz v2, :cond_2

    iget-object v2, p1, Lcom/qihoo/security/ui/result/AdvData;->c1:Ljava/lang/String;

    if-nez v2, :cond_2

    const-string/jumbo v7, "1"

    .line 1417
    :goto_1
    iget-object v8, p1, Lcom/qihoo/security/ui/result/AdvData;->c2:Ljava/lang/String;

    .line 1418
    iget-object v9, p1, Lcom/qihoo/security/ui/result/AdvData;->c3:Ljava/lang/String;

    .line 1419
    iget v2, p1, Lcom/qihoo/security/ui/result/AdvData;->mid:I

    invoke-static/range {v0 .. v9}, Lcom/qihoo/security/installreport/a;->a(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1421
    :cond_0
    return-void

    :cond_1
    move v2, v1

    .line 1415
    goto :goto_0

    .line 1416
    :cond_2
    iget-object v7, p1, Lcom/qihoo/security/ui/result/AdvData;->c1:Ljava/lang/String;

    goto :goto_1
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 1440
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    .line 1441
    :goto_0
    if-eqz v0, :cond_1

    .line 1442
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 1447
    :goto_1
    return-void

    .line 1440
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 1444
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->h:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 518
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->l:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 519
    monitor-exit p0

    return-void

    .line 518
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Lorg/json/JSONArray;Lcom/qihoo/security/adv/AdvDataManager$c;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Lcom/qihoo/security/adv/AdvDataManager$c",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .prologue
    const-wide/16 v2, 0x0

    .line 1180
    if-nez p1, :cond_1

    .line 1181
    if-eqz p2, :cond_0

    .line 1182
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p2, v0, v1, v2}, Lcom/qihoo/security/adv/AdvDataManager$c;->a(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1241
    :cond_0
    :goto_0
    return-void

    .line 1186
    :cond_1
    const-string/jumbo v3, "http://l.a.mobimagic.com/statistics/"

    .line 1187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "statdata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1188
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$14;

    const/4 v2, 0x1

    new-instance v5, Lcom/qihoo/security/adv/AdvDataManager$12;

    invoke-direct {v5, p0, p2}, Lcom/qihoo/security/adv/AdvDataManager$12;-><init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$c;)V

    new-instance v6, Lcom/qihoo/security/adv/AdvDataManager$13;

    invoke-direct {v6, p0, p2}, Lcom/qihoo/security/adv/AdvDataManager$13;-><init>(Lcom/qihoo/security/adv/AdvDataManager;Lcom/qihoo/security/adv/AdvDataManager$c;)V

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/adv/AdvDataManager$14;-><init>(Lcom/qihoo/security/adv/AdvDataManager;ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;)V

    .line 1239
    iget-object v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->s:Lcom/android/volley/c;

    invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/l;->a(Lcom/android/volley/m;)Lcom/android/volley/Request;

    .line 1240
    const-string/jumbo v1, "adv-install"

    invoke-static {v0, v1}, Lcom/qihoo/security/appbox/c/b/a;->a(Lcom/android/volley/Request;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public b()V
    .locals 6

    .prologue
    .line 467
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 468
    iget-wide v2, p0, Lcom/qihoo/security/adv/AdvDataManager;->r:J

    sub-long v2, v0, v2

    const-wide/32 v4, 0x1b77400

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 469
    iput-wide v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->r:J

    .line 470
    iget-object v0, p0, Lcom/qihoo/security/adv/AdvDataManager;->g:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 472
    :cond_0
    return-void
.end method

.method public c()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 992
    iget v1, p0, Lcom/qihoo/security/adv/AdvDataManager;->m:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_1

    .line 998
    :cond_0
    :goto_0
    return v0

    .line 995
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xa

    if-le v1, v2, :cond_0

    .line 998
    const/4 v0, 0x0

    goto :goto_0
.end method
