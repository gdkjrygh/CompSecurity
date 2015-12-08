.class Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;
.super Lcom/google/analytics/tracking/android/Tracker;
.source "EasyTracker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/analytics/tracking/android/EasyTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "NoopTracker"
.end annotation


# instance fields
.field private mAppId:Ljava/lang/String;

.field private mAppInstallerId:Ljava/lang/String;

.field private mExceptionParser:Lcom/google/analytics/tracking/android/ExceptionParser;

.field private mIsAnonymizeIp:Z

.field private mIsUseSecure:Z

.field private mSampleRate:D

.field final synthetic this$0:Lcom/google/analytics/tracking/android/EasyTracker;


# direct methods
.method constructor <init>(Lcom/google/analytics/tracking/android/EasyTracker;)V
    .locals 2

    .prologue
    .line 455
    iput-object p1, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->this$0:Lcom/google/analytics/tracking/android/EasyTracker;

    invoke-direct {p0}, Lcom/google/analytics/tracking/android/Tracker;-><init>()V

    .line 458
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    iput-wide v0, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mSampleRate:D

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .prologue
    .line 515
    return-void
.end method

.method public constructEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/util/Map;
    .locals 1
    .param p1, "category"    # Ljava/lang/String;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "label"    # Ljava/lang/String;
    .param p4, "value"    # Ljava/lang/Long;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 606
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method public constructException(Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1
    .param p1, "exceptionDescription"    # Ljava/lang/String;
    .param p2, "fatal"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 617
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method public constructRawException(Ljava/lang/String;Ljava/lang/Throwable;Z)Ljava/util/Map;
    .locals 1
    .param p1, "threadName"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Throwable;
    .param p3, "fatal"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Z)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 623
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method public constructSocial(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .param p1, "network"    # Ljava/lang/String;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "target"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 634
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method public constructTiming(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .param p1, "category"    # Ljava/lang/String;
    .param p2, "intervalInMilliseconds"    # J
    .param p4, "name"    # Ljava/lang/String;
    .param p5, "label"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 629
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method public constructTransaction(Lcom/google/analytics/tracking/android/Transaction;)Ljava/util/Map;
    .locals 1
    .param p1, "trans"    # Lcom/google/analytics/tracking/android/Transaction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/analytics/tracking/android/Transaction;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 611
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method public get(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 523
    const-string v0, ""

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 580
    iget-object v0, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mAppId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppInstallerId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 590
    iget-object v0, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mAppInstallerId:Ljava/lang/String;

    return-object v0
.end method

.method public getExceptionParser()Lcom/google/analytics/tracking/android/ExceptionParser;
    .locals 1

    .prologue
    .line 600
    iget-object v0, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mExceptionParser:Lcom/google/analytics/tracking/android/ExceptionParser;

    return-object v0
.end method

.method public getSampleRate()D
    .locals 2

    .prologue
    .line 552
    iget-wide v0, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mSampleRate:D

    return-wide v0
.end method

.method public getTrackingId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 532
    const-string v0, ""

    return-object v0
.end method

.method public isAnonymizeIpEnabled()Z
    .locals 1

    .prologue
    .line 542
    iget-boolean v0, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mIsAnonymizeIp:Z

    return v0
.end method

.method public isUseSecure()Z
    .locals 1

    .prologue
    .line 562
    iget-boolean v0, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mIsUseSecure:Z

    return v0
.end method

.method public send(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .param p1, "hitType"    # Ljava/lang/String;
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
    .line 519
    .local p2, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    return-void
.end method

.method public sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 0
    .param p1, "category"    # Ljava/lang/String;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "label"    # Ljava/lang/String;
    .param p4, "value"    # Ljava/lang/Long;

    .prologue
    .line 490
    return-void
.end method

.method public sendException(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 0
    .param p1, "threadName"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Throwable;
    .param p3, "fatal"    # Z

    .prologue
    .line 502
    return-void
.end method

.method public sendException(Ljava/lang/String;Z)V
    .locals 0
    .param p1, "description"    # Ljava/lang/String;
    .param p2, "fatal"    # Z

    .prologue
    .line 498
    return-void
.end method

.method public sendSocial(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "network"    # Ljava/lang/String;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "target"    # Ljava/lang/String;

    .prologue
    .line 511
    return-void
.end method

.method public sendTiming(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "category"    # Ljava/lang/String;
    .param p2, "intervalInMilliseconds"    # J
    .param p4, "name"    # Ljava/lang/String;
    .param p5, "label"    # Ljava/lang/String;

    .prologue
    .line 507
    return-void
.end method

.method public sendTransaction(Lcom/google/analytics/tracking/android/Transaction;)V
    .locals 0
    .param p1, "transaction"    # Lcom/google/analytics/tracking/android/Transaction;

    .prologue
    .line 494
    return-void
.end method

.method public sendView()V
    .locals 0

    .prologue
    .line 482
    return-void
.end method

.method public sendView(Ljava/lang/String;)V
    .locals 0
    .param p1, "appScreen"    # Ljava/lang/String;

    .prologue
    .line 486
    return-void
.end method

.method public set(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 528
    return-void
.end method

.method public setAnonymizeIp(Z)V
    .locals 0
    .param p1, "anonymizeIp"    # Z

    .prologue
    .line 537
    iput-boolean p1, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mIsAnonymizeIp:Z

    .line 538
    return-void
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0
    .param p1, "appId"    # Ljava/lang/String;

    .prologue
    .line 575
    iput-object p1, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mAppId:Ljava/lang/String;

    .line 576
    return-void
.end method

.method public setAppInstallerId(Ljava/lang/String;)V
    .locals 0
    .param p1, "appInstallerId"    # Ljava/lang/String;

    .prologue
    .line 585
    iput-object p1, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mAppInstallerId:Ljava/lang/String;

    .line 586
    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0
    .param p1, "appName"    # Ljava/lang/String;

    .prologue
    .line 470
    return-void
.end method

.method public setAppScreen(Ljava/lang/String;)V
    .locals 0
    .param p1, "appScreen"    # Ljava/lang/String;

    .prologue
    .line 478
    return-void
.end method

.method public setAppVersion(Ljava/lang/String;)V
    .locals 0
    .param p1, "appVersion"    # Ljava/lang/String;

    .prologue
    .line 474
    return-void
.end method

.method public setCampaign(Ljava/lang/String;)V
    .locals 0
    .param p1, "campaign"    # Ljava/lang/String;

    .prologue
    .line 571
    return-void
.end method

.method public setCustomDimension(ILjava/lang/String;)V
    .locals 0
    .param p1, "slot"    # I
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 639
    return-void
.end method

.method public setCustomDimensionsAndMetrics(Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 648
    .local p1, "dimensions":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
    .local p2, "metrics":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;"
    return-void
.end method

.method public setCustomMetric(ILjava/lang/Long;)V
    .locals 0
    .param p1, "slot"    # I
    .param p2, "value"    # Ljava/lang/Long;

    .prologue
    .line 643
    return-void
.end method

.method public setExceptionParser(Lcom/google/analytics/tracking/android/ExceptionParser;)V
    .locals 0
    .param p1, "exceptionParser"    # Lcom/google/analytics/tracking/android/ExceptionParser;

    .prologue
    .line 595
    iput-object p1, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mExceptionParser:Lcom/google/analytics/tracking/android/ExceptionParser;

    .line 596
    return-void
.end method

.method public setReferrer(Ljava/lang/String;)V
    .locals 0
    .param p1, "referrer"    # Ljava/lang/String;

    .prologue
    .line 567
    return-void
.end method

.method public setSampleRate(D)V
    .locals 0
    .param p1, "sampleRate"    # D

    .prologue
    .line 547
    iput-wide p1, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mSampleRate:D

    .line 548
    return-void
.end method

.method public setStartSession(Z)V
    .locals 0
    .param p1, "startSession"    # Z

    .prologue
    .line 466
    return-void
.end method

.method public setUseSecure(Z)V
    .locals 0
    .param p1, "useSecure"    # Z

    .prologue
    .line 557
    iput-boolean p1, p0, Lcom/google/analytics/tracking/android/EasyTracker$NoopTracker;->mIsUseSecure:Z

    .line 558
    return-void
.end method
