.class public Lcom/mopub/network/AdResponse;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/Integer;

.field private final k:Ljava/lang/Integer;

.field private final l:Ljava/lang/Integer;

.field private final m:Ljava/lang/Integer;

.field private final n:Ljava/lang/String;

.field private final o:Z

.field private final p:Ljava/lang/String;

.field private final q:Lorg/json/JSONObject;

.field private final r:Ljava/lang/String;

.field private final s:Ljava/util/Map;
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

.field private final t:J


# direct methods
.method private constructor <init>(Lcom/mopub/network/AdResponse$Builder;)V
    .locals 2

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->a(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->a:Ljava/lang/String;

    .line 67
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->b(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->b:Ljava/lang/String;

    .line 68
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->c(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->c:Ljava/lang/String;

    .line 69
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->d(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->d:Ljava/lang/String;

    .line 70
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->e(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->e:Ljava/lang/String;

    .line 71
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->f(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->f:Ljava/lang/String;

    .line 72
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->g(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->g:Ljava/lang/String;

    .line 73
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->h(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->h:Ljava/lang/String;

    .line 74
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->i(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->i:Ljava/lang/String;

    .line 75
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->j(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->j:Ljava/lang/Integer;

    .line 76
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->k(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->k:Ljava/lang/Integer;

    .line 77
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->l(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->l:Ljava/lang/Integer;

    .line 78
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->m(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->m:Ljava/lang/Integer;

    .line 79
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->n(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->n:Ljava/lang/String;

    .line 80
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->o(Lcom/mopub/network/AdResponse$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/mopub/network/AdResponse;->o:Z

    .line 81
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->p(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->p:Ljava/lang/String;

    .line 82
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->q(Lcom/mopub/network/AdResponse$Builder;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->q:Lorg/json/JSONObject;

    .line 83
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->r(Lcom/mopub/network/AdResponse$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->r:Ljava/lang/String;

    .line 84
    invoke-static {p1}, Lcom/mopub/network/AdResponse$Builder;->s(Lcom/mopub/network/AdResponse$Builder;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/AdResponse;->s:Ljava/util/Map;

    .line 85
    invoke-static {}, Lcom/mopub/common/util/DateAndTime;->now()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mopub/network/AdResponse;->t:J

    .line 86
    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/network/AdResponse$Builder;B)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/mopub/network/AdResponse;-><init>(Lcom/mopub/network/AdResponse$Builder;)V

    return-void
.end method


# virtual methods
.method public getAdTimeoutMillis()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->l:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAdType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getClickTrackingUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomEventClassName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->r:Ljava/lang/String;

    return-object v0
.end method

.method public getDspCreativeId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->n:Ljava/lang/String;

    return-object v0
.end method

.method public getFailoverUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getFullAdType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getHeight()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->k:Ljava/lang/Integer;

    return-object v0
.end method

.method public getImpressionTrackingUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getJsonBody()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->q:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getNetworkType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getRedirectUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getRefreshTimeMillis()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->m:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getServerExtras()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 184
    new-instance v0, Ljava/util/TreeMap;

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->s:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public getStringBody()Ljava/lang/String;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->p:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    .prologue
    .line 188
    iget-wide v0, p0, Lcom/mopub/network/AdResponse;->t:J

    return-wide v0
.end method

.method public getWidth()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->j:Ljava/lang/Integer;

    return-object v0
.end method

.method public hasJson()Z
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/mopub/network/AdResponse;->q:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isScrollable()Z
    .locals 1

    .prologue
    .line 148
    iget-boolean v0, p0, Lcom/mopub/network/AdResponse;->o:Z

    return v0
.end method

.method public toBuilder()Lcom/mopub/network/AdResponse$Builder;
    .locals 3

    .prologue
    .line 192
    new-instance v0, Lcom/mopub/network/AdResponse$Builder;

    invoke-direct {v0}, Lcom/mopub/network/AdResponse$Builder;-><init>()V

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setAdType(Ljava/lang/String;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setNetworkType(Ljava/lang/String;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setRedirectUrl(Ljava/lang/String;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setClickTrackingUrl(Ljava/lang/String;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setImpressionTrackingUrl(Ljava/lang/String;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setFailoverUrl(Ljava/lang/String;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->j:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/mopub/network/AdResponse;->k:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Lcom/mopub/network/AdResponse$Builder;->setDimensions(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->l:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setAdTimeoutDelayMilliseconds(Ljava/lang/Integer;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->m:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setRefreshTimeMilliseconds(Ljava/lang/Integer;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setDspCreativeId(Ljava/lang/String;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/mopub/network/AdResponse;->o:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setScrollable(Ljava/lang/Boolean;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setResponseBody(Ljava/lang/String;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->q:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setJsonBody(Lorg/json/JSONObject;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setCustomEventClassName(Ljava/lang/String;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/network/AdResponse;->s:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/mopub/network/AdResponse$Builder;->setServerExtras(Ljava/util/Map;)Lcom/mopub/network/AdResponse$Builder;

    move-result-object v0

    return-object v0
.end method
