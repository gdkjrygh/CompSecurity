.class public abstract Lcom/picksinit/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static mCacheTime:J

.field private static mInstance:Lcom/picksinit/b;


# instance fields
.field public final TAG:Ljava/lang/String;

.field private mAdResourceRp:I

.field private mBrowserConfig:Lcom/picksinit/a;

.field private mChannelId:Ljava/lang/String;

.field private mConfig:Lcom/picksinit/Config;

.field private mContext:Landroid/content/Context;

.field private mCver:I

.field private mIsCnVersion:Z

.field private mIsInit:Z

.field private mMid:Ljava/lang/String;

.field private mSSPId:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 42
    const-wide/32 v0, 0xdbba0

    sput-wide v0, Lcom/picksinit/b;->mCacheTime:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x1

    iput v0, p0, Lcom/picksinit/b;->mAdResourceRp:I

    .line 37
    const/4 v0, -0x1

    iput v0, p0, Lcom/picksinit/b;->mSSPId:I

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/picksinit/b;->mIsInit:Z

    .line 44
    const-string v0, "picks sdk"

    iput-object v0, p0, Lcom/picksinit/b;->TAG:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/picksinit/b;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/picksinit/b;->filter(Ljava/util/List;)V

    return-void
.end method

.method private filter(Ljava/util/List;)V
    .locals 1

    .prologue
    .line 264
    invoke-direct {p0, p1}, Lcom/picksinit/b;->filterMtType(Ljava/util/List;)V

    .line 265
    iget-object v0, p0, Lcom/picksinit/b;->mConfig:Lcom/picksinit/Config;

    if-eqz v0, :cond_1

    .line 267
    iget-object v0, p0, Lcom/picksinit/b;->mConfig:Lcom/picksinit/Config;

    invoke-virtual {v0}, Lcom/picksinit/Config;->getShowType()Ljava/util/Set;

    move-result-object v0

    .line 268
    invoke-direct {p0, p1, v0}, Lcom/picksinit/b;->filterShowType(Ljava/util/List;Ljava/util/Set;)V

    .line 270
    iget-object v0, p0, Lcom/picksinit/b;->mConfig:Lcom/picksinit/Config;

    invoke-virtual {v0}, Lcom/picksinit/Config;->isNeedWebView()Z

    move-result v0

    if-nez v0, :cond_0

    .line 271
    invoke-direct {p0, p1}, Lcom/picksinit/b;->filterWebView(Ljava/util/List;)V

    .line 277
    :cond_0
    :goto_0
    return-void

    .line 274
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/picksinit/b;->filterShowType(Ljava/util/List;Ljava/util/Set;)V

    .line 275
    invoke-direct {p0, p1}, Lcom/picksinit/b;->filterWebView(Ljava/util/List;)V

    goto :goto_0
.end method

.method private filterMtType(Ljava/util/List;)V
    .locals 3

    .prologue
    .line 245
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 246
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 248
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 249
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/Ad;

    .line 251
    if-eqz v0, :cond_1

    .line 252
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getMtType()I

    move-result v0

    const/16 v2, 0x40

    if-ne v0, v2, :cond_0

    .line 253
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 256
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 261
    :cond_2
    return-void
.end method

.method private filterShowType(Ljava/util/List;Ljava/util/Set;)V
    .locals 6

    .prologue
    const v5, 0xc351

    const v4, 0xc350

    const/16 v3, 0x3f8

    .line 214
    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 215
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 217
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 218
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/Ad;

    .line 219
    if-eqz v0, :cond_2

    .line 220
    if-eqz p2, :cond_1

    .line 221
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    if-eq v2, v4, :cond_0

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    if-eq v2, v5, :cond_0

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v0

    if-eq v0, v3, :cond_0

    .line 226
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 229
    :cond_1
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    if-eq v2, v4, :cond_0

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    if-eq v2, v5, :cond_0

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v0

    if-eq v0, v3, :cond_0

    .line 234
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 239
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 243
    :cond_3
    return-void
.end method

.method private filterWebView(Ljava/util/List;)V
    .locals 3

    .prologue
    .line 200
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 201
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 203
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 204
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/Ad;

    .line 205
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getHtml()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getPicUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 210
    :cond_2
    return-void
.end method

.method private freshConfig()V
    .locals 4

    .prologue
    .line 79
    const-string v0, "config_last_save_time"

    const-wide/32 v2, 0x5265c00

    invoke-static {v0, v2, v3}, Lcom/cleanmaster/ui/app/market/c;->a(Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/picksinit/c;

    invoke-direct {v1, p0}, Lcom/picksinit/c;-><init>(Lcom/picksinit/b;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 87
    :cond_0
    return-void
.end method

.method public static getInstance()Lcom/picksinit/b;
    .locals 2

    .prologue
    .line 47
    sget-object v0, Lcom/picksinit/b;->mInstance:Lcom/picksinit/b;

    if-nez v0, :cond_1

    .line 48
    const-class v1, Lcom/picksinit/b;

    monitor-enter v1

    .line 49
    :try_start_0
    sget-object v0, Lcom/picksinit/b;->mInstance:Lcom/picksinit/b;

    if-nez v0, :cond_0

    .line 50
    new-instance v0, Lcom/picksinit/PicksMob;

    invoke-direct {v0}, Lcom/picksinit/PicksMob;-><init>()V

    sput-object v0, Lcom/picksinit/b;->mInstance:Lcom/picksinit/b;

    .line 52
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :cond_1
    sget-object v0, Lcom/picksinit/b;->mInstance:Lcom/picksinit/b;

    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private loadAd(IILcom/picksinit/ICallBack;IIII)V
    .locals 9

    .prologue
    .line 113
    iget-boolean v0, p0, Lcom/picksinit/b;->mIsInit:Z

    const-string v1, "you not init picks sdk, please excete init sdk first"

    invoke-static {v0, v1}, Lcom/cleanmaster/util/i;->a(ZLjava/lang/String;)V

    .line 114
    if-lez p4, :cond_0

    const/16 v0, 0x1e

    if-gt p4, v0, :cond_0

    if-gez p1, :cond_2

    .line 115
    :cond_0
    if-eqz p3, :cond_1

    .line 116
    new-instance v0, Lcom/picksinit/ErrorInfo;

    const/16 v1, 0x1f4

    const-string v2, "params is error"

    invoke-direct {v0, v1, v2, p2}, Lcom/picksinit/ErrorInfo;-><init>(ILjava/lang/String;I)V

    invoke-interface {p3, v0}, Lcom/picksinit/ICallBack;->onLoadError(Lcom/picksinit/ErrorInfo;)V

    .line 197
    :cond_1
    :goto_0
    return-void

    .line 121
    :cond_2
    iget-object v0, p0, Lcom/picksinit/b;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/cleanmaster/common/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 122
    if-eqz p3, :cond_1

    .line 123
    new-instance v0, Lcom/picksinit/ErrorInfo;

    const/16 v1, 0x12c

    const-string v2, "netWork is unable"

    invoke-direct {v0, v1, v2, p2}, Lcom/picksinit/ErrorInfo;-><init>(ILjava/lang/String;I)V

    invoke-interface {p3, v0}, Lcom/picksinit/ICallBack;->onLoadError(Lcom/picksinit/ErrorInfo;)V

    goto :goto_0

    .line 128
    :cond_3
    new-instance v0, Lcom/picksinit/d;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    move-object v1, p0

    move v2, p1

    move v3, p4

    move-object v5, p3

    move v6, p2

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/picksinit/d;-><init>(Lcom/picksinit/b;IILjava/lang/String;Lcom/picksinit/ICallBack;III)V

    .line 193
    if-lez p5, :cond_4

    .line 194
    invoke-virtual {v0, p5}, Lcom/cleanmaster/ui/app/market/loader/a;->a(I)V

    .line 196
    :cond_4
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/loader/a;->c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    goto :goto_0
.end method


# virtual methods
.method public clearCacheTime(Ljava/lang/String;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    .line 90
    iget-object v0, p0, Lcom/picksinit/b;->mContext:Landroid/content/Context;

    const-string v1, "market_config"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 91
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x9

    if-lt v1, v2, :cond_0

    .line 92
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_cache_time"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 96
    :goto_0
    return-void

    .line 94
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_cache_time"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method public abstract clearParse302Url(I)V
.end method

.method public abstract doFaceBookClickReport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract doFaceBookViewReport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public doInstallSuccessReport(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 302
    invoke-static {p1, p2, p3}, Lcom/cleanmaster/ui/app/market/d;->d(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V

    .line 303
    return-void
.end method

.method public doRecommendAdClickReport(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 293
    invoke-static {p1, p2, p3}, Lcom/cleanmaster/ui/app/market/d;->b(Ljava/lang/String;Ljava/lang/String;I)V

    .line 294
    return-void
.end method

.method public doRecommendAdViewReport(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 297
    invoke-static {p1, p2, p3}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 298
    return-void
.end method

.method public abstract downloadSuccessReport(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V
.end method

.method public getBrowserConfig()Lcom/picksinit/a;
    .locals 1

    .prologue
    .line 386
    iget-object v0, p0, Lcom/picksinit/b;->mBrowserConfig:Lcom/picksinit/a;

    return-object v0
.end method

.method public getChannelId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 354
    iget-object v0, p0, Lcom/picksinit/b;->mChannelId:Ljava/lang/String;

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 2

    .prologue
    .line 332
    iget-boolean v0, p0, Lcom/picksinit/b;->mIsInit:Z

    const-string v1, "please init picks sdk first"

    invoke-static {v0, v1}, Lcom/cleanmaster/util/i;->a(ZLjava/lang/String;)V

    .line 333
    iget-object v0, p0, Lcom/picksinit/b;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public abstract getExtraDownLoader()Lcom/cleanmaster/down/a;
.end method

.method public getIntMid()I
    .locals 1

    .prologue
    .line 342
    :try_start_0
    invoke-virtual {p0}, Lcom/picksinit/b;->getMid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 346
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getMid()Ljava/lang/String;
    .locals 1

    .prologue
    .line 337
    iget-object v0, p0, Lcom/picksinit/b;->mMid:Ljava/lang/String;

    return-object v0
.end method

.method public getSSPId()I
    .locals 2

    .prologue
    .line 312
    iget-boolean v0, p0, Lcom/picksinit/b;->mIsInit:Z

    const-string v1, "please init picks sdk first"

    invoke-static {v0, v1}, Lcom/cleanmaster/util/i;->a(ZLjava/lang/String;)V

    .line 313
    iget v0, p0, Lcom/picksinit/b;->mSSPId:I

    return v0
.end method

.method public getTestReportIp()Ljava/lang/String;
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Lcom/picksinit/b;->mConfig:Lcom/picksinit/Config;

    if-eqz v0, :cond_0

    .line 369
    iget-object v0, p0, Lcom/picksinit/b;->mConfig:Lcom/picksinit/Config;

    invoke-virtual {v0}, Lcom/picksinit/Config;->getTestReportIp()Ljava/lang/String;

    move-result-object v0

    .line 371
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public getUserAgent()Ljava/lang/String;
    .locals 2

    .prologue
    .line 317
    iget-boolean v0, p0, Lcom/picksinit/b;->mIsInit:Z

    const-string v1, "please init picks sdk first"

    invoke-static {v0, v1}, Lcom/cleanmaster/util/i;->a(ZLjava/lang/String;)V

    .line 318
    invoke-static {}, Lcom/cleanmaster/ui/app/market/transport/b;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getmAdResourceRp()I
    .locals 1

    .prologue
    .line 397
    iget v0, p0, Lcom/picksinit/b;->mAdResourceRp:I

    return v0
.end method

.method public getmCver()I
    .locals 1

    .prologue
    .line 401
    iget v0, p0, Lcom/picksinit/b;->mCver:I

    return v0
.end method

.method public init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/picksinit/b;->mContext:Landroid/content/Context;

    .line 60
    iput-object p3, p0, Lcom/picksinit/b;->mChannelId:Ljava/lang/String;

    .line 61
    iput-object p2, p0, Lcom/picksinit/b;->mMid:Ljava/lang/String;

    .line 62
    iput-boolean p4, p0, Lcom/picksinit/b;->mIsCnVersion:Z

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/picksinit/b;->mIsInit:Z

    .line 65
    invoke-static {}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->getInstance()Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->asyncGetGAId()V

    .line 66
    invoke-direct {p0}, Lcom/picksinit/b;->freshConfig()V

    .line 67
    iget-object v0, p0, Lcom/picksinit/b;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/cleanmaster/util/ReceiverUtils;->a(Landroid/content/Context;)V

    .line 69
    return-void
.end method

.method public initUserAgent()V
    .locals 2

    .prologue
    .line 72
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    .line 73
    invoke-static {}, Lcom/cleanmaster/ui/app/market/transport/b;->a()V

    .line 75
    :cond_0
    return-void
.end method

.method public isCnVersion()Z
    .locals 1

    .prologue
    .line 409
    iget-boolean v0, p0, Lcom/picksinit/b;->mIsCnVersion:Z

    return v0
.end method

.method public isDebug()Z
    .locals 1

    .prologue
    .line 361
    iget-object v0, p0, Lcom/picksinit/b;->mConfig:Lcom/picksinit/Config;

    if-eqz v0, :cond_0

    .line 362
    iget-object v0, p0, Lcom/picksinit/b;->mConfig:Lcom/picksinit/Config;

    invoke-virtual {v0}, Lcom/picksinit/Config;->isDebug()Z

    move-result v0

    .line 364
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public abstract ishaveInternalDown()Z
.end method

.method public loadad(IILcom/picksinit/ICallBack;II)V
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 103
    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v7, v6

    invoke-direct/range {v0 .. v7}, Lcom/picksinit/b;->loadAd(IILcom/picksinit/ICallBack;IIII)V

    .line 105
    return-void
.end method

.method public loadad(ILcom/picksinit/ICallBack;II)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 108
    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, v1

    move v7, v1

    invoke-direct/range {v0 .. v7}, Lcom/picksinit/b;->loadAd(IILcom/picksinit/ICallBack;IIII)V

    .line 109
    return-void
.end method

.method public loadad(ILcom/picksinit/ICallBack;IIII)V
    .locals 8

    .prologue
    .line 99
    const/4 v1, 0x0

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p6

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/picksinit/b;->loadAd(IILcom/picksinit/ICallBack;IIII)V

    .line 100
    return-void
.end method

.method public onClickAdNoDialog(Landroid/content/Context;Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Lcom/picksinit/ClickAdFinishListener;)V
    .locals 6

    .prologue
    .line 282
    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/cleanmaster/ui/app/market/d;->a(Landroid/content/Context;Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;ZLcom/picksinit/ClickAdFinishListener;)V

    .line 283
    return-void
.end method

.method public abstract preLoad302Ad(Lcom/cleanmaster/ui/app/market/Ad;I)V
.end method

.method public abstract reportDowned(Ljava/lang/String;)V
.end method

.method public abstract reportInstall(Ljava/lang/String;)V
.end method

.method public setBrowserConfig(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 375
    iget-boolean v0, p0, Lcom/picksinit/b;->mIsInit:Z

    const-string v1, "please init picks sdk first"

    invoke-static {v0, v1}, Lcom/cleanmaster/util/i;->a(ZLjava/lang/String;)V

    .line 376
    new-instance v0, Lcom/picksinit/a;

    invoke-direct {v0, p1}, Lcom/picksinit/a;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/picksinit/b;->mBrowserConfig:Lcom/picksinit/a;

    .line 378
    return-void
.end method

.method public setBrowserConfig(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 381
    new-instance v0, Lcom/picksinit/a;

    invoke-direct {v0, p1, p2, p3}, Lcom/picksinit/a;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/picksinit/b;->mBrowserConfig:Lcom/picksinit/a;

    .line 383
    return-void
.end method

.method public setCacheTime(J)V
    .locals 3

    .prologue
    .line 327
    iget-boolean v0, p0, Lcom/picksinit/b;->mIsInit:Z

    const-string v1, "please init picks sdk first"

    invoke-static {v0, v1}, Lcom/cleanmaster/util/i;->a(ZLjava/lang/String;)V

    .line 328
    sput-wide p1, Lcom/picksinit/b;->mCacheTime:J

    .line 329
    return-void
.end method

.method public setChannelId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 350
    iput-object p1, p0, Lcom/picksinit/b;->mChannelId:Ljava/lang/String;

    .line 351
    return-void
.end method

.method public setConfig(Lcom/picksinit/Config;)V
    .locals 0

    .prologue
    .line 357
    iput-object p1, p0, Lcom/picksinit/b;->mConfig:Lcom/picksinit/Config;

    .line 358
    return-void
.end method

.method public abstract setDownLoader(Lcom/cleanmaster/down/a;)V
.end method

.method public setSSPId(I)V
    .locals 2

    .prologue
    .line 307
    iget-boolean v0, p0, Lcom/picksinit/b;->mIsInit:Z

    const-string v1, "please init picks sdk first"

    invoke-static {v0, v1}, Lcom/cleanmaster/util/i;->a(ZLjava/lang/String;)V

    .line 308
    iput p1, p0, Lcom/picksinit/b;->mSSPId:I

    .line 309
    return-void
.end method

.method public setUserAgent(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 322
    iget-boolean v0, p0, Lcom/picksinit/b;->mIsInit:Z

    const-string v1, "please init picks sdk first"

    invoke-static {v0, v1}, Lcom/cleanmaster/util/i;->a(ZLjava/lang/String;)V

    .line 323
    invoke-static {p1}, Lcom/cleanmaster/ui/app/market/transport/b;->a(Ljava/lang/String;)V

    .line 324
    return-void
.end method

.method public setmAdResourceRp(I)V
    .locals 0

    .prologue
    .line 394
    return-void
.end method

.method public setmCver(I)V
    .locals 0

    .prologue
    .line 405
    iput p1, p0, Lcom/picksinit/b;->mCver:I

    .line 406
    return-void
.end method

.method public showReport(Landroid/content/Context;Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;)V
    .locals 1

    .prologue
    .line 287
    const/4 v0, 0x0

    invoke-static {p3, p2, v0}, Lcom/cleanmaster/ui/app/market/d;->a(Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    invoke-static {p3}, Lcom/cleanmaster/ui/app/market/d;->b(Lcom/cleanmaster/ui/app/market/Ad;)V

    .line 289
    return-void
.end method
