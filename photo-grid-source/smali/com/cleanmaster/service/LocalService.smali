.class public Lcom/cleanmaster/service/LocalService;
.super Landroid/app/IntentService;
.source "SourceFile"


# static fields
.field public static a:Z

.field public static b:J

.field public static d:Z


# instance fields
.field c:Landroid/content/pm/PackageManager;

.field e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 22
    const/4 v0, 0x1

    sput-boolean v0, Lcom/cleanmaster/service/LocalService;->a:Z

    .line 24
    const-wide/16 v0, 0x3a98

    sput-wide v0, Lcom/cleanmaster/service/LocalService;->b:J

    .line 27
    const/4 v0, 0x0

    sput-boolean v0, Lcom/cleanmaster/service/LocalService;->d:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 32
    const-string v0, "LocalService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cleanmaster/service/LocalService;->c:Landroid/content/pm/PackageManager;

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lcom/cleanmaster/service/LocalService;->e:I

    .line 33
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 60
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 61
    const-class v1, Lcom/cleanmaster/service/LocalService;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 62
    const-string v1, "com.cleanmaster.service.ACTION_MARKET_SAVE_PENDDING_DOWNLOAD"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    const-string v1, ":package-name"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 65
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 82
    const-string v0, ":recent"

    const/4 v1, 0x1

    invoke-static {v1}, Lcom/cleanmaster/service/a;->a(I)J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 83
    invoke-static {}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a()Lcom/cleanmaster/ui/app/market/storage/MarketStorage;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(J)Z

    .line 84
    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 0

    .prologue
    .line 37
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 38
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 70
    if-nez p1, :cond_1

    .line 79
    :cond_0
    :goto_0
    return-void

    .line 74
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 76
    const-string v1, "com.cleanmaster.service.ACTION_MARKET_CLEAN_CACHE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    invoke-direct {p0, p1}, Lcom/cleanmaster/service/LocalService;->a(Landroid/content/Intent;)V

    goto :goto_0
.end method
