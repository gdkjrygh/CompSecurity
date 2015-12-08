.class public Lorg/chromium/base/ResourceExtractor;
.super Ljava/lang/Object;
.source "ResourceExtractor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/base/ResourceExtractor$ExtractTask;,
        Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final ICU_DATA_FILENAME:Ljava/lang/String; = "icudtl.dat"

.field private static final LAST_LANGUAGE:Ljava/lang/String; = "Last language"

.field private static final LOGTAG:Ljava/lang/String; = "ResourceExtractor"

.field private static final PAK_FILENAMES:Ljava/lang/String; = "Pak filenames"

.field private static sExtractImplicitLocalePak:Z

.field private static sInstance:Lorg/chromium/base/ResourceExtractor;

.field private static sIntercepter:Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;

.field private static sMandatoryPaks:[Ljava/lang/String;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mExtractTask:Lorg/chromium/base/ResourceExtractor$ExtractTask;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 34
    const-class v0, Lorg/chromium/base/ResourceExtractor;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lorg/chromium/base/ResourceExtractor;->$assertionsDisabled:Z

    .line 41
    sput-object v2, Lorg/chromium/base/ResourceExtractor;->sMandatoryPaks:[Ljava/lang/String;

    .line 42
    sput-object v2, Lorg/chromium/base/ResourceExtractor;->sIntercepter:Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;

    .line 47
    sput-boolean v1, Lorg/chromium/base/ResourceExtractor;->sExtractImplicitLocalePak:Z

    return-void

    .line 34
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 327
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 328
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/base/ResourceExtractor;->mContext:Landroid/content/Context;

    .line 329
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/base/ResourceExtractor;)Ljava/io/File;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/base/ResourceExtractor;

    .prologue
    .line 34
    invoke-direct {p0}, Lorg/chromium/base/ResourceExtractor;->getOutputDir()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Lorg/chromium/base/ResourceExtractor;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/base/ResourceExtractor;

    .prologue
    .line 34
    invoke-direct {p0}, Lorg/chromium/base/ResourceExtractor;->deleteFiles()V

    return-void
.end method

.method static synthetic access$200(Lorg/chromium/base/ResourceExtractor;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/base/ResourceExtractor;

    .prologue
    .line 34
    iget-object v0, p0, Lorg/chromium/base/ResourceExtractor;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$300()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lorg/chromium/base/ResourceExtractor;->sMandatoryPaks:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400()Z
    .locals 1

    .prologue
    .line 34
    sget-boolean v0, Lorg/chromium/base/ResourceExtractor;->sExtractImplicitLocalePak:Z

    return v0
.end method

.method static synthetic access$500()Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lorg/chromium/base/ResourceExtractor;->sIntercepter:Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;

    return-object v0
.end method

.method static synthetic access$600(Lorg/chromium/base/ResourceExtractor;)Ljava/io/File;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/base/ResourceExtractor;

    .prologue
    .line 34
    invoke-direct {p0}, Lorg/chromium/base/ResourceExtractor;->getAppDataDir()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private deleteFiles()V
    .locals 10

    .prologue
    .line 388
    new-instance v5, Ljava/io/File;

    invoke-direct {p0}, Lorg/chromium/base/ResourceExtractor;->getAppDataDir()Ljava/io/File;

    move-result-object v7

    const-string v8, "icudtl.dat"

    invoke-direct {v5, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 389
    .local v5, "icudata":Ljava/io/File;
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v7

    if-nez v7, :cond_0

    .line 390
    const-string v7, "ResourceExtractor"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Unable to remove the icudata "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 392
    :cond_0
    invoke-direct {p0}, Lorg/chromium/base/ResourceExtractor;->getOutputDir()Ljava/io/File;

    move-result-object v1

    .line 393
    .local v1, "dir":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 394
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 395
    .local v3, "files":[Ljava/io/File;
    move-object v0, v3

    .local v0, "arr$":[Ljava/io/File;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_0
    if-ge v4, v6, :cond_2

    aget-object v2, v0, v4

    .line 396
    .local v2, "file":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v7

    if-nez v7, :cond_1

    .line 397
    const-string v7, "ResourceExtractor"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Unable to remove existing resource "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 395
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 401
    .end local v0    # "arr$":[Ljava/io/File;
    .end local v2    # "file":Ljava/io/File;
    .end local v3    # "files":[Ljava/io/File;
    .end local v4    # "i$":I
    .end local v6    # "len$":I
    :cond_2
    return-void
.end method

.method public static get(Landroid/content/Context;)Lorg/chromium/base/ResourceExtractor;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 261
    sget-object v0, Lorg/chromium/base/ResourceExtractor;->sInstance:Lorg/chromium/base/ResourceExtractor;

    if-nez v0, :cond_0

    .line 262
    new-instance v0, Lorg/chromium/base/ResourceExtractor;

    invoke-direct {v0, p0}, Lorg/chromium/base/ResourceExtractor;-><init>(Landroid/content/Context;)V

    sput-object v0, Lorg/chromium/base/ResourceExtractor;->sInstance:Lorg/chromium/base/ResourceExtractor;

    .line 264
    :cond_0
    sget-object v0, Lorg/chromium/base/ResourceExtractor;->sInstance:Lorg/chromium/base/ResourceExtractor;

    return-object v0
.end method

.method private getAppDataDir()Ljava/io/File;
    .locals 2

    .prologue
    .line 373
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lorg/chromium/base/ResourceExtractor;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lorg/chromium/base/PathUtils;->getDataDirectory(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private getOutputDir()Ljava/io/File;
    .locals 3

    .prologue
    .line 377
    new-instance v0, Ljava/io/File;

    invoke-direct {p0}, Lorg/chromium/base/ResourceExtractor;->getAppDataDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "paks"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static setExtractImplicitLocaleForTesting(Z)V
    .locals 2
    .param p0, "extract"    # Z
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 304
    sget-boolean v0, Lorg/chromium/base/ResourceExtractor;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    sget-object v0, Lorg/chromium/base/ResourceExtractor;->sInstance:Lorg/chromium/base/ResourceExtractor;

    if-eqz v0, :cond_0

    sget-object v0, Lorg/chromium/base/ResourceExtractor;->sInstance:Lorg/chromium/base/ResourceExtractor;

    iget-object v0, v0, Lorg/chromium/base/ResourceExtractor;->mExtractTask:Lorg/chromium/base/ResourceExtractor$ExtractTask;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Must be called before startExtractingResources is called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 305
    :cond_0
    sput-boolean p0, Lorg/chromium/base/ResourceExtractor;->sExtractImplicitLocalePak:Z

    .line 306
    return-void
.end method

.method public static varargs setMandatoryPaksToExtract([Ljava/lang/String;)V
    .locals 2
    .param p0, "mandatoryPaks"    # [Ljava/lang/String;

    .prologue
    .line 275
    sget-boolean v0, Lorg/chromium/base/ResourceExtractor;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    sget-object v0, Lorg/chromium/base/ResourceExtractor;->sInstance:Lorg/chromium/base/ResourceExtractor;

    if-eqz v0, :cond_0

    sget-object v0, Lorg/chromium/base/ResourceExtractor;->sInstance:Lorg/chromium/base/ResourceExtractor;

    iget-object v0, v0, Lorg/chromium/base/ResourceExtractor;->mExtractTask:Lorg/chromium/base/ResourceExtractor$ExtractTask;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Must be called before startExtractingResources is called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 276
    :cond_0
    sput-object p0, Lorg/chromium/base/ResourceExtractor;->sMandatoryPaks:[Ljava/lang/String;

    .line 278
    return-void
.end method

.method public static setResourceIntercepter(Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;)V
    .locals 2
    .param p0, "intercepter"    # Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;

    .prologue
    .line 289
    sget-boolean v0, Lorg/chromium/base/ResourceExtractor;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    sget-object v0, Lorg/chromium/base/ResourceExtractor;->sInstance:Lorg/chromium/base/ResourceExtractor;

    if-eqz v0, :cond_0

    sget-object v0, Lorg/chromium/base/ResourceExtractor;->sInstance:Lorg/chromium/base/ResourceExtractor;

    iget-object v0, v0, Lorg/chromium/base/ResourceExtractor;->mExtractTask:Lorg/chromium/base/ResourceExtractor$ExtractTask;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Must be called before startExtractingResources is called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 290
    :cond_0
    sput-object p0, Lorg/chromium/base/ResourceExtractor;->sIntercepter:Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;

    .line 291
    return-void
.end method

.method private static shouldSkipPakExtraction()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 409
    sget-boolean v2, Lorg/chromium/base/ResourceExtractor;->$assertionsDisabled:Z

    if-nez v2, :cond_0

    sget-object v2, Lorg/chromium/base/ResourceExtractor;->sMandatoryPaks:[Ljava/lang/String;

    if-nez v2, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 410
    :cond_0
    sget-object v2, Lorg/chromium/base/ResourceExtractor;->sMandatoryPaks:[Ljava/lang/String;

    array-length v2, v2

    if-ne v2, v0, :cond_1

    const-string v2, ""

    sget-object v3, Lorg/chromium/base/ResourceExtractor;->sMandatoryPaks:[Ljava/lang/String;

    aget-object v3, v3, v1

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public setExtractAllPaksForTesting()V
    .locals 11
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 314
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 315
    .local v7, "pakFileAssets":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v8, p0, Lorg/chromium/base/ResourceExtractor;->mContext:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    .line 317
    .local v6, "manager":Landroid/content/res/AssetManager;
    :try_start_0
    const-string v8, ""

    invoke-virtual {v6, v8}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 318
    .local v3, "files":[Ljava/lang/String;
    move-object v0, v3

    .local v0, "arr$":[Ljava/lang/String;
    array-length v5, v0

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_0
    if-ge v4, v5, :cond_1

    aget-object v2, v0, v4

    .line 319
    .local v2, "file":Ljava/lang/String;
    const-string v8, ".pak"

    invoke-virtual {v2, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 318
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 321
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v2    # "file":Ljava/lang/String;
    .end local v3    # "files":[Ljava/lang/String;
    .end local v4    # "i$":I
    .end local v5    # "len$":I
    :catch_0
    move-exception v1

    .line 322
    .local v1, "e":Ljava/io/IOException;
    const-string v8, "ResourceExtractor"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Exception while accessing assets: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 324
    .end local v1    # "e":Ljava/io/IOException;
    :cond_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    new-array v8, v8, [Ljava/lang/String;

    invoke-interface {v7, v8}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/String;

    invoke-static {v8}, Lorg/chromium/base/ResourceExtractor;->setMandatoryPaksToExtract([Ljava/lang/String;)V

    .line 325
    return-void
.end method

.method public startExtractingResources()V
    .locals 3

    .prologue
    .line 360
    iget-object v0, p0, Lorg/chromium/base/ResourceExtractor;->mExtractTask:Lorg/chromium/base/ResourceExtractor$ExtractTask;

    if-eqz v0, :cond_1

    .line 370
    :cond_0
    :goto_0
    return-void

    .line 364
    :cond_1
    invoke-static {}, Lorg/chromium/base/ResourceExtractor;->shouldSkipPakExtraction()Z

    move-result v0

    if-nez v0, :cond_0

    .line 368
    new-instance v0, Lorg/chromium/base/ResourceExtractor$ExtractTask;

    invoke-direct {v0, p0}, Lorg/chromium/base/ResourceExtractor$ExtractTask;-><init>(Lorg/chromium/base/ResourceExtractor;)V

    iput-object v0, p0, Lorg/chromium/base/ResourceExtractor;->mExtractTask:Lorg/chromium/base/ResourceExtractor$ExtractTask;

    .line 369
    iget-object v0, p0, Lorg/chromium/base/ResourceExtractor;->mExtractTask:Lorg/chromium/base/ResourceExtractor$ExtractTask;

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Lorg/chromium/base/ResourceExtractor$ExtractTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method public waitForCompletion()V
    .locals 4

    .prologue
    .line 332
    invoke-static {}, Lorg/chromium/base/ResourceExtractor;->shouldSkipPakExtraction()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 352
    :goto_0
    return-void

    .line 336
    :cond_0
    sget-boolean v3, Lorg/chromium/base/ResourceExtractor;->$assertionsDisabled:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Lorg/chromium/base/ResourceExtractor;->mExtractTask:Lorg/chromium/base/ResourceExtractor$ExtractTask;

    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V

    throw v3

    .line 339
    :cond_1
    :try_start_0
    iget-object v3, p0, Lorg/chromium/base/ResourceExtractor;->mExtractTask:Lorg/chromium/base/ResourceExtractor$ExtractTask;

    invoke-virtual {v3}, Lorg/chromium/base/ResourceExtractor$ExtractTask;->get()Ljava/lang/Object;

    .line 342
    const/4 v3, 0x0

    sput-object v3, Lorg/chromium/base/ResourceExtractor;->sIntercepter:Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;

    .line 343
    const/4 v3, 0x0

    sput-object v3, Lorg/chromium/base/ResourceExtractor;->sInstance:Lorg/chromium/base/ResourceExtractor;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 344
    :catch_0
    move-exception v0

    .line 346
    .local v0, "e":Ljava/util/concurrent/CancellationException;
    invoke-direct {p0}, Lorg/chromium/base/ResourceExtractor;->deleteFiles()V

    goto :goto_0

    .line 347
    .end local v0    # "e":Ljava/util/concurrent/CancellationException;
    :catch_1
    move-exception v1

    .line 348
    .local v1, "e2":Ljava/util/concurrent/ExecutionException;
    invoke-direct {p0}, Lorg/chromium/base/ResourceExtractor;->deleteFiles()V

    goto :goto_0

    .line 349
    .end local v1    # "e2":Ljava/util/concurrent/ExecutionException;
    :catch_2
    move-exception v2

    .line 350
    .local v2, "e3":Ljava/lang/InterruptedException;
    invoke-direct {p0}, Lorg/chromium/base/ResourceExtractor;->deleteFiles()V

    goto :goto_0
.end method
