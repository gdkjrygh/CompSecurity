.class public Lcom/cleanmaster/gaid/AdvertisingIdHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static instance:Lcom/cleanmaster/gaid/AdvertisingIdHelper;


# instance fields
.field private mGAId:Ljava/lang/String;

.field private mTrackFlag:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 172
    const/4 v0, 0x0

    sput-object v0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->instance:Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->mGAId:Ljava/lang/String;

    .line 117
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->mTrackFlag:Z

    .line 181
    return-void
.end method

.method static synthetic access$000(Lcom/cleanmaster/gaid/AdvertisingIdHelper;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->mGAId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/cleanmaster/gaid/AdvertisingIdHelper;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 17
    iput-object p1, p0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->mGAId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$102(Lcom/cleanmaster/gaid/AdvertisingIdHelper;Z)Z
    .locals 0

    .prologue
    .line 17
    iput-boolean p1, p0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->mTrackFlag:Z

    return p1
.end method

.method static connection(Landroid/content/Context;)Lcom/cleanmaster/gaid/GooglePlayServiceConnection;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 20
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 21
    const-string v2, "com.android.vending"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :try_start_1
    new-instance v0, Lcom/cleanmaster/gaid/GooglePlayServiceConnection;

    invoke-direct {v0}, Lcom/cleanmaster/gaid/GooglePlayServiceConnection;-><init>()V

    .line 27
    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.google.android.gms.ads.identifier.service.START"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 29
    const-string v3, "com.google.android.gms"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 30
    const/4 v3, 0x1

    invoke-virtual {p0, v2, v0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v2

    if-eqz v2, :cond_0

    .line 35
    :goto_0
    return-object v0

    .line 23
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 33
    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 35
    goto :goto_0
.end method

.method public static getIdInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    .prologue
    .line 88
    if-nez p0, :cond_1

    .line 89
    const/4 v0, 0x0

    .line 95
    :cond_0
    :goto_0
    return-object v0

    .line 90
    :cond_1
    const-string v0, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 92
    if-eqz v0, :cond_2

    instance-of v1, v0, Lcom/cleanmaster/gaid/AdvertisingIdInterface;

    if-nez v1, :cond_0

    .line 95
    :cond_2
    new-instance v0, Lcom/cleanmaster/gaid/b;

    invoke-direct {v0, p0}, Lcom/cleanmaster/gaid/b;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method

.method public static getInstance()Lcom/cleanmaster/gaid/AdvertisingIdHelper;
    .locals 1

    .prologue
    .line 174
    sget-object v0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->instance:Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    if-nez v0, :cond_0

    .line 175
    new-instance v0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    invoke-direct {v0}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;-><init>()V

    sput-object v0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->instance:Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    .line 177
    :cond_0
    sget-object v0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->instance:Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    return-object v0
.end method


# virtual methods
.method public asyncGetGAId()V
    .locals 2

    .prologue
    .line 130
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/cleanmaster/gaid/a;

    invoke-direct {v1, p0}, Lcom/cleanmaster/gaid/a;-><init>(Lcom/cleanmaster/gaid/AdvertisingIdHelper;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 171
    return-void
.end method

.method public getGAId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->mGAId:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackFlag()Z
    .locals 1

    .prologue
    .line 124
    iget-boolean v0, p0, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->mTrackFlag:Z

    return v0
.end method
