.class public Lcom/qihoo/security/lib/resl/ExtResources;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;,
        Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;
    }
.end annotation


# static fields
.field private static final CFG_KEY:Ljava/lang/String; = "cfg"

.field private static final DEBUG:Z = true

.field private static final NEW_ARCH_VERSION_CODE_START:I = 0x1e

.field private static final PACKAGE_PREFIX:Ljava/lang/String; = "com.qihoo.security.lang"

.field private static TAG:Ljava/lang/String; = null

.field public static final TYPE_ARRAY:I = 0x1

.field public static final TYPE_PLURALS:I = 0x2

.field public static final TYPE_STRING:I


# instance fields
.field private isNewArch:Z

.field private mCfgValue:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mDexClassLoader:Ldalvik/system/DexClassLoader;

.field private mExtPackageName:Ljava/lang/String;

.field private mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

.field private mPackageManager:Landroid/content/pm/PackageManager;

.field private mPackageName:Ljava/lang/String;

.field private mRStringArrayCls:Ljava/lang/Class;

.field private mRStringArrayObj:Ljava/lang/Object;

.field private mRStringCls:Ljava/lang/Class;

.field private mRStringObj:Ljava/lang/Object;

.field private mResPath:Ljava/lang/String;

.field private mResources:Landroid/content/res/Resources;

.field private mResourcesed:Lcom/qihoo/security/lib/iresl/IResourcesd;

.field private mVersionCode:I

.field private mVersionName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-string/jumbo v0, "ExtResources"

    sput-object v0, Lcom/qihoo/security/lib/resl/ExtResources;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    .line 55
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResourcesed:Lcom/qihoo/security/lib/iresl/IResourcesd;

    .line 56
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    .line 57
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringObj:Ljava/lang/Object;

    .line 58
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringArrayObj:Ljava/lang/Object;

    .line 59
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringCls:Ljava/lang/Class;

    .line 60
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringArrayCls:Ljava/lang/Class;

    .line 61
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mPackageName:Ljava/lang/String;

    .line 67
    iput v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mVersionCode:I

    .line 71
    iput-boolean v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    .line 108
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mContext:Landroid/content/Context;

    .line 109
    const-string/jumbo v0, "com.qihoo.security"

    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mPackageName:Ljava/lang/String;

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mPackageManager:Landroid/content/pm/PackageManager;

    .line 112
    return-void
.end method

.method private isIllegal()Z
    .locals 2

    .prologue
    .line 486
    iget v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mVersionCode:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mVersionName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mExtPackageName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mCfgValue:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 488
    const/4 v0, 0x1

    .line 490
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private loadR()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;
        }
    .end annotation

    .prologue
    .line 235
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringObj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringCls:Ljava/lang/Class;

    if-nez v0, :cond_2

    .line 236
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    if-nez v0, :cond_1

    .line 237
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " resources not init "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 241
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mPackageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ".lang.R$string"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 242
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringCls:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 248
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 252
    if-eqz v0, :cond_4

    .line 253
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringObj:Ljava/lang/Object;

    .line 258
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringArrayObj:Ljava/lang/Object;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringArrayCls:Ljava/lang/Class;

    if-nez v0, :cond_6

    .line 259
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    if-nez v0, :cond_5

    .line 260
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " resources not init "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 243
    :catch_0
    move-exception v0

    .line 244
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " load R$string err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 249
    :catch_1
    move-exception v0

    .line 250
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " init R$string err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 255
    :cond_4
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " init R$string err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 264
    :cond_5
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mPackageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ".lang.R$array"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 265
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringArrayCls:Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 271
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v0

    .line 275
    if-eqz v0, :cond_7

    .line 276
    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringArrayObj:Ljava/lang/Object;

    .line 281
    :cond_6
    return-void

    .line 266
    :catch_2
    move-exception v0

    .line 267
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " load R$array err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 272
    :catch_3
    move-exception v0

    .line 273
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " init R$array err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 278
    :cond_7
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " init R$array err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private loadResources()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;
        }
    .end annotation

    .prologue
    .line 284
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResourcesed:Lcom/qihoo/security/lib/iresl/IResourcesd;

    if-nez v0, :cond_3

    .line 285
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    if-nez v0, :cond_0

    .line 286
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " resources not init "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 290
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mPackageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ".lang.Resourcesd"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 296
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 300
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/qihoo/security/lib/iresl/IResourcesd;

    if-nez v1, :cond_2

    .line 301
    :cond_1
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " res protocol err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 291
    :catch_0
    move-exception v0

    .line 292
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " load resourcesd err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 297
    :catch_1
    move-exception v0

    .line 298
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " init resourcesd err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 303
    :cond_2
    check-cast v0, Lcom/qihoo/security/lib/iresl/IResourcesd;

    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResourcesed:Lcom/qihoo/security/lib/iresl/IResourcesd;

    .line 306
    :cond_3
    return-void
.end method


# virtual methods
.method public getIdent(Ljava/lang/String;I)I
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 431
    iget-boolean v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    if-eqz v1, :cond_3

    .line 432
    if-nez p2, :cond_1

    .line 433
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    const-string/jumbo v1, "string"

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mExtPackageName:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 464
    :cond_0
    :goto_0
    return v0

    .line 434
    :cond_1
    if-ne p2, v2, :cond_2

    .line 435
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    const-string/jumbo v1, "array"

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mExtPackageName:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 436
    :cond_2
    if-ne p2, v3, :cond_0

    .line 437
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    const-string/jumbo v1, "plurals"

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mExtPackageName:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 442
    :cond_3
    if-nez p1, :cond_4

    .line 443
    :try_start_0
    new-instance v1, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v2, " illegal resources name "

    invoke-direct {v1, v2}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException; {:try_start_0 .. :try_end_0} :catch_0

    .line 463
    :catch_0
    move-exception v1

    goto :goto_0

    .line 445
    :cond_4
    if-eqz p2, :cond_5

    if-ne v3, p2, :cond_6

    .line 447
    :cond_5
    :try_start_1
    iget-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringCls:Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 448
    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringObj:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    goto :goto_0

    .line 450
    :catch_1
    move-exception v1

    .line 451
    :try_start_2
    new-instance v1, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v2, " get stringid err "

    invoke-direct {v1, v2}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catch Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException; {:try_start_2 .. :try_end_2} :catch_0

    .line 453
    :cond_6
    if-ne p2, v2, :cond_7

    .line 455
    :try_start_3
    iget-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringArrayCls:Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 456
    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringArrayObj:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException; {:try_start_3 .. :try_end_3} :catch_0

    move-result v0

    goto :goto_0

    .line 458
    :catch_2
    move-exception v1

    .line 459
    :try_start_4
    new-instance v1, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v2, " get stringarrayid err "

    invoke-direct {v1, v2}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 462
    :cond_7
    new-instance v1, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v2, " get stringid err "

    invoke-direct {v1, v2}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catch Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException; {:try_start_4 .. :try_end_4} :catch_0
.end method

.method public getPkgInfo()Ljava/lang/String;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    invoke-interface {v0}, Lcom/qihoo/security/lib/iresl/IInfo;->getPkgInfo()Ljava/lang/String;

    move-result-object v0

    .line 190
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getPkgName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    invoke-interface {v0}, Lcom/qihoo/security/lib/iresl/IInfo;->getPkgName()Ljava/lang/String;

    move-result-object v0

    .line 197
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getQuantityString(II)Ljava/lang/String;
    .locals 1

    .prologue
    .line 478
    iget-boolean v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    if-eqz v0, :cond_0

    .line 479
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    .line 481
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/qihoo/security/lib/resl/ExtResources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public varargs getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 470
    iget-boolean v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    if-eqz v0, :cond_0

    .line 471
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1, p2, p3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 473
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/qihoo/security/lib/resl/ExtResources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 356
    iget-boolean v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    if-eqz v0, :cond_0

    .line 357
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 359
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResourcesed:Lcom/qihoo/security/lib/iresl/IResourcesd;

    invoke-interface {v0, p1}, Lcom/qihoo/security/lib/iresl/IResourcesd;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public varargs getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 372
    iget-boolean v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    if-eqz v0, :cond_0

    .line 373
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 379
    :goto_0
    return-object v0

    .line 376
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResourcesed:Lcom/qihoo/security/lib/iresl/IResourcesd;

    invoke-interface {v0, p1}, Lcom/qihoo/security/lib/iresl/IResourcesd;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 378
    :catch_0
    move-exception v0

    .line 379
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getStringArray(I)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 392
    iget-boolean v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    if-eqz v0, :cond_0

    .line 393
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    .line 395
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResourcesed:Lcom/qihoo/security/lib/iresl/IResourcesd;

    invoke-interface {v0, p1}, Lcom/qihoo/security/lib/iresl/IResourcesd;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getVersionCode()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    invoke-interface {v0}, Lcom/qihoo/security/lib/iresl/IInfo;->getVersionCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 171
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getVersionName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    invoke-interface {v0}, Lcom/qihoo/security/lib/iresl/IInfo;->getVersionName()Ljava/lang/String;

    move-result-object v0

    .line 183
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public initResources(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;
        }
    .end annotation

    .prologue
    .line 122
    if-nez p1, :cond_0

    .line 123
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " not supported package "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 125
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_2

    .line 127
    :cond_1
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " not supported package "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :cond_2
    iput-object p1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResPath:Ljava/lang/String;

    .line 131
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mPackageManager:Landroid/content/pm/PackageManager;

    const/16 v1, 0x80

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 132
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mExtPackageName:Ljava/lang/String;

    .line 133
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mVersionCode:I

    .line 134
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mVersionName:Ljava/lang/String;

    .line 135
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 136
    if-eqz v0, :cond_3

    .line 137
    const-string/jumbo v1, "cfg"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mCfgValue:Ljava/lang/String;

    .line 140
    :cond_3
    sget-object v0, Lcom/qihoo/security/lib/resl/ExtResources;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, " PackageInfo : [ packagename "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mExtPackageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " versioncode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mVersionCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " versionname "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mVersionName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " configInfo "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mCfgValue:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " ] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    invoke-direct {p0}, Lcom/qihoo/security/lib/resl/ExtResources;->isIllegal()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 146
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    :cond_4
    :goto_0
    iget-boolean v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    if-eqz v0, :cond_5

    .line 160
    :goto_1
    return-void

    .line 148
    :catch_0
    move-exception v0

    .line 150
    sget-object v0, Lcom/qihoo/security/lib/resl/ExtResources;->TAG:Ljava/lang/String;

    const-string/jumbo v1, " not supported package "

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 155
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    if-eqz v0, :cond_6

    .line 156
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " load resource illegal "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 158
    :cond_6
    new-instance v0, Ldalvik/system/DexClassLoader;

    iget-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    goto :goto_1
.end method

.method public loadAllRes()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;
        }
    .end annotation

    .prologue
    .line 314
    iget-boolean v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    if-eqz v0, :cond_0

    .line 315
    new-instance v0, Landroid/content/res/AssetManager;

    invoke-direct {v0}, Landroid/content/res/AssetManager;-><init>()V

    .line 316
    iget-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->addAssetPath(Ljava/lang/String;)I

    .line 317
    iget-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 318
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 319
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 320
    new-instance v3, Landroid/content/res/Resources;

    invoke-direct {v3, v0, v2, v1}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    iput-object v3, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    .line 321
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    if-nez v0, :cond_1

    .line 322
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " load resources fail "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 325
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/lib/resl/ExtResources;->loadR()V

    .line 326
    invoke-direct {p0}, Lcom/qihoo/security/lib/resl/ExtResources;->loadResources()V

    .line 328
    :cond_1
    return-void
.end method

.method public loadInfo()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;
        }
    .end annotation

    .prologue
    .line 206
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    if-nez v0, :cond_0

    .line 207
    iget-boolean v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    if-eqz v0, :cond_1

    .line 208
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;

    iget v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mVersionCode:I

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mVersionName:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mCfgValue:Ljava/lang/String;

    iget-object v4, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mExtPackageName:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/qihoo/security/lib/resl/ExtResources$InnerInfo;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    .line 232
    :cond_0
    :goto_0
    return-void

    .line 210
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    if-nez v0, :cond_2

    .line 211
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " resources not init "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 215
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mPackageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ".lang.Info"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 221
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 225
    if-eqz v0, :cond_3

    instance-of v1, v0, Lcom/qihoo/security/lib/iresl/IInfo;

    if-nez v1, :cond_4

    .line 226
    :cond_3
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " res protocol err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 216
    :catch_0
    move-exception v0

    .line 217
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " iload info err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 222
    :catch_1
    move-exception v0

    .line 223
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;

    const-string/jumbo v1, " init info err "

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources$ExtResourcesException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 228
    :cond_4
    check-cast v0, Lcom/qihoo/security/lib/iresl/IInfo;

    iput-object v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    goto :goto_0
.end method

.method public unloadAll()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 336
    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mInfo:Lcom/qihoo/security/lib/iresl/IInfo;

    .line 337
    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResourcesed:Lcom/qihoo/security/lib/iresl/IResourcesd;

    .line 338
    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringObj:Ljava/lang/Object;

    .line 339
    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mRStringArrayObj:Ljava/lang/Object;

    .line 340
    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mDexClassLoader:Ldalvik/system/DexClassLoader;

    .line 341
    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mResources:Landroid/content/res/Resources;

    .line 342
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/lib/resl/ExtResources;->isNewArch:Z

    .line 343
    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mVersionName:Ljava/lang/String;

    .line 344
    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mExtPackageName:Ljava/lang/String;

    .line 345
    iput-object v1, p0, Lcom/qihoo/security/lib/resl/ExtResources;->mCfgValue:Ljava/lang/String;

    .line 346
    return-void
.end method
