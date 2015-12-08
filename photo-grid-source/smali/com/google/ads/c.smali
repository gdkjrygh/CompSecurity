.class public abstract Lcom/google/ads/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/ads/formats/NativeAd;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:J

.field private c:Z

.field private d:Lcom/google/android/gms/ads/AdListener;

.field private e:Lcom/google/ads/h;

.field private f:Lcom/google/ads/a;

.field private g:Lorg/json/JSONObject;

.field private h:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/ads/c;->a:Ljava/lang/Object;

    .line 36
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/ads/c;->b:J

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/ads/c;->c:Z

    .line 38
    return-void
.end method


# virtual methods
.method protected abstract a()Ljava/lang/String;
.end method

.method public a(Lcom/google/android/gms/ads/AdListener;Lcom/google/ads/h;Lcom/google/ads/a;Lorg/json/JSONObject;[Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/google/ads/c;->d:Lcom/google/android/gms/ads/AdListener;

    .line 51
    iput-object p2, p0, Lcom/google/ads/c;->e:Lcom/google/ads/h;

    .line 52
    iput-object p3, p0, Lcom/google/ads/c;->f:Lcom/google/ads/a;

    .line 53
    iput-object p4, p0, Lcom/google/ads/c;->g:Lorg/json/JSONObject;

    .line 54
    iput-object p5, p0, Lcom/google/ads/c;->h:[Ljava/lang/String;

    .line 55
    return-void
.end method

.method public performClick(I)V
    .locals 8

    .prologue
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 66
    iget-wide v2, p0, Lcom/google/ads/c;->b:J

    const-wide/16 v4, 0x3e8

    add-long/2addr v2, v4

    cmp-long v2, v2, v0

    if-ltz v2, :cond_0

    .line 87
    :goto_0
    return-void

    .line 69
    :cond_0
    iput-wide v0, p0, Lcom/google/ads/c;->b:J

    .line 71
    new-instance v0, Lcom/google/ads/c$1;

    invoke-direct {v0, p0}, Lcom/google/ads/c$1;-><init>(Lcom/google/ads/c;)V

    .line 79
    iget-object v1, p0, Lcom/google/ads/c;->f:Lcom/google/ads/a;

    const-string v2, "google.afma.nativeAds.handleClick({\'ad\': "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/ads/c;->g:Lorg/json/JSONObject;

    .line 81
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 83
    invoke-virtual {p0}, Lcom/google/ads/c;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x35

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", \'click\': {\'template\': \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\', \'asset\': \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\'}})"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 79
    invoke-virtual {v1, v2, v0}, Lcom/google/ads/a;->a(Ljava/lang/String;Lcom/google/android/gms/ads/AdListener;)V

    goto :goto_0
.end method

.method public recordImpression()V
    .locals 6

    .prologue
    .line 92
    iget-object v1, p0, Lcom/google/ads/c;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 93
    :try_start_0
    iget-boolean v0, p0, Lcom/google/ads/c;->c:Z

    if-eqz v0, :cond_1

    .line 94
    monitor-exit v1

    .line 107
    :cond_0
    return-void

    .line 96
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ads/c;->c:Z

    .line 97
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    iget-object v0, p0, Lcom/google/ads/c;->h:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 102
    iget-object v1, p0, Lcom/google/ads/c;->h:[Ljava/lang/String;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 103
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 104
    iget-object v4, p0, Lcom/google/ads/c;->e:Lcom/google/ads/h;

    sget-object v5, Lcom/google/ads/h;->a:Lcom/google/ads/h$a;

    invoke-virtual {v4, v3, v5}, Lcom/google/ads/h;->a(Ljava/lang/String;Lcom/google/ads/h$a;)Ljava/util/concurrent/Future;

    .line 102
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 97
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
