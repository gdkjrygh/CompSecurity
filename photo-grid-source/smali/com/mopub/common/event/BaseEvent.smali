.class public abstract Lcom/mopub/common/event/BaseEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final A:Ljava/lang/Integer;

.field private final B:J

.field private C:Lcom/mopub/common/ClientMetadata;

.field private final D:D

.field private final a:Lcom/mopub/common/event/BaseEvent$ScribeCategory;

.field private final b:Lcom/mopub/common/event/BaseEvent$Name;

.field private final c:Lcom/mopub/common/event/BaseEvent$Category;

.field private final d:Lcom/mopub/common/event/BaseEvent$SdkProduct;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/Double;

.field private final j:Ljava/lang/Double;

.field private final k:Ljava/lang/Integer;

.field private final l:Ljava/lang/Integer;

.field private final m:Ljava/lang/Double;

.field private final n:Ljava/lang/Double;

.field private final o:Ljava/lang/Double;

.field private final p:Lcom/mopub/common/ClientMetadata$MoPubNetworkType;

.field private final q:Ljava/lang/String;

.field private final r:Ljava/lang/String;

.field private final s:Ljava/lang/String;

.field private final t:Ljava/lang/String;

.field private final u:Ljava/lang/String;

.field private final v:Ljava/lang/String;

.field private final w:Ljava/lang/Double;

.field private final x:Ljava/lang/String;

.field private final y:Ljava/lang/Integer;

.field private final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/mopub/common/event/BaseEvent$Builder;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 144
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->a(Lcom/mopub/common/event/BaseEvent$Builder;)Lcom/mopub/common/event/BaseEvent$ScribeCategory;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->a:Lcom/mopub/common/event/BaseEvent$ScribeCategory;

    .line 145
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->b(Lcom/mopub/common/event/BaseEvent$Builder;)Lcom/mopub/common/event/BaseEvent$Name;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->b:Lcom/mopub/common/event/BaseEvent$Name;

    .line 146
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->c(Lcom/mopub/common/event/BaseEvent$Builder;)Lcom/mopub/common/event/BaseEvent$Category;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->c:Lcom/mopub/common/event/BaseEvent$Category;

    .line 147
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->d(Lcom/mopub/common/event/BaseEvent$Builder;)Lcom/mopub/common/event/BaseEvent$SdkProduct;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->d:Lcom/mopub/common/event/BaseEvent$SdkProduct;

    .line 148
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->e(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->e:Ljava/lang/String;

    .line 149
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->f(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->f:Ljava/lang/String;

    .line 150
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->g(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->g:Ljava/lang/String;

    .line 151
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->h(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->h:Ljava/lang/String;

    .line 152
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->i(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->i:Ljava/lang/Double;

    .line 153
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->j(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->j:Ljava/lang/Double;

    .line 154
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->k(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->m:Ljava/lang/Double;

    .line 155
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->l(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->n:Ljava/lang/Double;

    .line 156
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->m(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->o:Ljava/lang/Double;

    .line 157
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->n(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->w:Ljava/lang/Double;

    .line 158
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->o(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->x:Ljava/lang/String;

    .line 159
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->p(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->y:Ljava/lang/Integer;

    .line 160
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->q(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->z:Ljava/lang/String;

    .line 161
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->r(Lcom/mopub/common/event/BaseEvent$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->A:Ljava/lang/Integer;

    .line 162
    invoke-static {p1}, Lcom/mopub/common/event/BaseEvent$Builder;->s(Lcom/mopub/common/event/BaseEvent$Builder;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/mopub/common/event/BaseEvent;->D:D

    .line 163
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mopub/common/event/BaseEvent;->B:J

    .line 165
    invoke-static {}, Lcom/mopub/common/ClientMetadata;->getInstance()Lcom/mopub/common/ClientMetadata;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    .line 166
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceScreenWidthDip()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->k:Ljava/lang/Integer;

    .line 168
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceScreenHeightDip()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->l:Ljava/lang/Integer;

    .line 169
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getActiveNetworkType()Lcom/mopub/common/ClientMetadata$MoPubNetworkType;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->p:Lcom/mopub/common/ClientMetadata$MoPubNetworkType;

    .line 170
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getNetworkOperator()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->q:Ljava/lang/String;

    .line 171
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->r:Ljava/lang/String;

    .line 172
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getIsoCountryCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->s:Ljava/lang/String;

    .line 173
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getSimOperator()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->t:Ljava/lang/String;

    .line 174
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getSimOperatorName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->u:Ljava/lang/String;

    .line 175
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getSimIsoCountryCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/BaseEvent;->v:Ljava/lang/String;

    .line 188
    :goto_0
    return-void

    .line 178
    :cond_0
    iput-object v2, p0, Lcom/mopub/common/event/BaseEvent;->k:Ljava/lang/Integer;

    .line 179
    iput-object v2, p0, Lcom/mopub/common/event/BaseEvent;->l:Ljava/lang/Integer;

    .line 180
    iput-object v2, p0, Lcom/mopub/common/event/BaseEvent;->p:Lcom/mopub/common/ClientMetadata$MoPubNetworkType;

    .line 181
    iput-object v2, p0, Lcom/mopub/common/event/BaseEvent;->q:Ljava/lang/String;

    .line 182
    iput-object v2, p0, Lcom/mopub/common/event/BaseEvent;->r:Ljava/lang/String;

    .line 183
    iput-object v2, p0, Lcom/mopub/common/event/BaseEvent;->s:Ljava/lang/String;

    .line 184
    iput-object v2, p0, Lcom/mopub/common/event/BaseEvent;->t:Ljava/lang/String;

    .line 185
    iput-object v2, p0, Lcom/mopub/common/event/BaseEvent;->u:Ljava/lang/String;

    .line 186
    iput-object v2, p0, Lcom/mopub/common/event/BaseEvent;->v:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public getAdCreativeId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getAdHeightPx()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->j:Ljava/lang/Double;

    return-object v0
.end method

.method public getAdNetworkType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getAdType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 227
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->g:Ljava/lang/String;

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getAdWidthPx()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->i:Ljava/lang/Double;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getAppName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getAppPackageName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getAppPlatform()Lcom/mopub/common/event/BaseEvent$AppPlatform;
    .locals 1

    .prologue
    .line 247
    sget-object v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;->ANDROID:Lcom/mopub/common/event/BaseEvent$AppPlatform;

    return-object v0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getCategory()Lcom/mopub/common/event/BaseEvent$Category;
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->c:Lcom/mopub/common/event/BaseEvent$Category;

    return-object v0
.end method

.method public getClientAdvertisingId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getClientDoNotTrack()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->isDoNotTrackSet()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getDeviceManufacturer()Ljava/lang/String;
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getDeviceOsVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceOsVersion()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getDeviceProduct()Ljava/lang/String;
    .locals 1

    .prologue
    .line 295
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getDeviceProduct()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getDeviceScreenHeightDip()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->l:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceScreenWidthDip()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->k:Ljava/lang/Integer;

    return-object v0
.end method

.method public getGeoAccuracy()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 325
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->o:Ljava/lang/Double;

    return-object v0
.end method

.method public getGeoLat()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->m:Ljava/lang/Double;

    return-object v0
.end method

.method public getGeoLon()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 320
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->n:Ljava/lang/Double;

    return-object v0
.end method

.method public getName()Lcom/mopub/common/event/BaseEvent$Name;
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->b:Lcom/mopub/common/event/BaseEvent$Name;

    return-object v0
.end method

.method public getNetworkIsoCountryCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 350
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->s:Ljava/lang/String;

    return-object v0
.end method

.method public getNetworkOperatorCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->q:Ljava/lang/String;

    return-object v0
.end method

.method public getNetworkOperatorName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 345
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->r:Ljava/lang/String;

    return-object v0
.end method

.method public getNetworkSimCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 355
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->t:Ljava/lang/String;

    return-object v0
.end method

.method public getNetworkSimIsoCountryCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 365
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->v:Ljava/lang/String;

    return-object v0
.end method

.method public getNetworkSimOperatorName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 360
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->u:Ljava/lang/String;

    return-object v0
.end method

.method public getNetworkType()Lcom/mopub/common/ClientMetadata$MoPubNetworkType;
    .locals 1

    .prologue
    .line 335
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->p:Lcom/mopub/common/ClientMetadata$MoPubNetworkType;

    return-object v0
.end method

.method public getObfuscatedClientAdvertisingId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 274
    const-string v0, "ifa:XXXX"

    return-object v0
.end method

.method public getPerformanceDurationMs()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 330
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->w:Ljava/lang/Double;

    return-object v0
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 370
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->x:Ljava/lang/String;

    return-object v0
.end method

.method public getRequestRetries()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 385
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->A:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRequestStatusCode()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 375
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->y:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRequestUri()Ljava/lang/String;
    .locals 1

    .prologue
    .line 380
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->z:Ljava/lang/String;

    return-object v0
.end method

.method public getSamplingRate()D
    .locals 2

    .prologue
    .line 389
    iget-wide v0, p0, Lcom/mopub/common/event/BaseEvent;->D:D

    return-wide v0
.end method

.method public getScribeCategory()Lcom/mopub/common/event/BaseEvent$ScribeCategory;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->a:Lcom/mopub/common/event/BaseEvent$ScribeCategory;

    return-object v0
.end method

.method public getSdkProduct()Lcom/mopub/common/event/BaseEvent$SdkProduct;
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->d:Lcom/mopub/common/event/BaseEvent$SdkProduct;

    return-object v0
.end method

.method public getSdkVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent;->C:Lcom/mopub/common/ClientMetadata;

    invoke-virtual {v0}, Lcom/mopub/common/ClientMetadata;->getSdkVersion()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getTimestampUtcMs()Ljava/lang/Long;
    .locals 2

    .prologue
    .line 394
    iget-wide v0, p0, Lcom/mopub/common/event/BaseEvent;->B:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    .line 399
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BaseEvent\nScribeCategory: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getScribeCategory()Lcom/mopub/common/event/BaseEvent$ScribeCategory;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getName()Lcom/mopub/common/event/BaseEvent$Name;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nCategory: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getCategory()Lcom/mopub/common/event/BaseEvent$Category;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nSdkProduct: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getSdkProduct()Lcom/mopub/common/event/BaseEvent$SdkProduct;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nSdkVersion: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getSdkVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nAdUnitId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getAdUnitId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nAdCreativeId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getAdCreativeId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nAdType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getAdType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nAdNetworkType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getAdNetworkType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nAdWidthPx: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getAdWidthPx()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nAdHeightPx: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getAdHeightPx()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nAppPlatform: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getAppPlatform()Lcom/mopub/common/event/BaseEvent$AppPlatform;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nAppName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getAppName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nAppPackageName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getAppPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nAppVersion: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getAppVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nDeviceManufacturer: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nDeviceModel: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nDeviceProduct: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getDeviceProduct()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nDeviceOsVersion: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getDeviceOsVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nDeviceScreenWidth: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getDeviceScreenWidthDip()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nDeviceScreenHeight: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getDeviceScreenHeightDip()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nGeoLat: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getGeoLat()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nGeoLon: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getGeoLon()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nGeoAccuracy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getGeoAccuracy()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nPerformanceDurationMs: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getPerformanceDurationMs()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nNetworkType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getNetworkType()Lcom/mopub/common/ClientMetadata$MoPubNetworkType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nNetworkOperatorCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getNetworkOperatorCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nNetworkOperatorName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nNetworkIsoCountryCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getNetworkIsoCountryCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nNetworkSimCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getNetworkSimCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nNetworkSimOperatorName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getNetworkSimOperatorName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nNetworkSimIsoCountryCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getNetworkSimIsoCountryCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nRequestId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getRequestId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nRequestStatusCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getRequestStatusCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nRequestUri: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getRequestUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nRequestRetries: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getRequestRetries()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nSamplingRate: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getSamplingRate()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nTimestampUtcMs: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1}, Ljava/text/SimpleDateFormat;-><init>()V

    new-instance v2, Ljava/util/Date;

    invoke-virtual {p0}, Lcom/mopub/common/event/BaseEvent;->getTimestampUtcMs()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
