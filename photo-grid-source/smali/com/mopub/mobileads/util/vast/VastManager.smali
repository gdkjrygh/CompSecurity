.class public Lcom/mopub/mobileads/util/vast/VastManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mobileads/util/vast/e;


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private c:Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;

.field private d:Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;

.field private e:D

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 27
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "video/mp4"

    aput-object v1, v0, v2

    const-string v1, "video/3gpp"

    aput-object v1, v0, v3

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/mopub/mobileads/util/vast/VastManager;->a:Ljava/util/List;

    .line 29
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "image/jpeg"

    aput-object v1, v0, v2

    const-string v1, "image/png"

    aput-object v1, v0, v3

    const-string v1, "image/bmp"

    aput-object v1, v0, v4

    const/4 v1, 0x3

    const-string v2, "image/gif"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/mopub/mobileads/util/vast/VastManager;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1115
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 1116
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    .line 1117
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    .line 1120
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 1121
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 1122
    int-to-double v4, v2

    int-to-double v6, v0

    div-double/2addr v4, v6

    iput-wide v4, p0, Lcom/mopub/mobileads/util/vast/VastManager;->e:D

    .line 1123
    mul-int/2addr v0, v2

    iput v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->f:I

    .line 40
    return-void
.end method

.method private a(II)D
    .locals 6

    .prologue
    .line 245
    int-to-double v0, p1

    int-to-double v2, p2

    div-double/2addr v0, v2

    .line 246
    mul-int v2, p1, p2

    .line 247
    iget-wide v4, p0, Lcom/mopub/mobileads/util/vast/VastManager;->e:D

    div-double/2addr v0, v4

    .line 248
    int-to-double v2, v2

    iget v4, p0, Lcom/mopub/mobileads/util/vast/VastManager;->f:I

    int-to-double v4, v4

    div-double/2addr v2, v4

    .line 249
    const-wide/high16 v4, 0x4044000000000000L    # 40.0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    mul-double/2addr v0, v4

    const-wide/high16 v4, 0x404e000000000000L    # 60.0

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    return-wide v0
.end method

.method static synthetic a(Lcom/mopub/mobileads/util/vast/VastManager;)Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->c:Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;

    return-object v0
.end method

.method private a(Ljava/util/List;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/util/vast/d;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 163
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 164
    const-wide/high16 v2, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 165
    const/4 v5, 0x0

    .line 167
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 168
    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 169
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/util/vast/d;

    .line 171
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/d;->c()Ljava/lang/String;

    move-result-object v1

    .line 172
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/d;->d()Ljava/lang/String;

    move-result-object v4

    .line 173
    sget-object v8, Lcom/mopub/mobileads/util/vast/VastManager;->a:Ljava/util/List;

    invoke-interface {v8, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez v4, :cond_2

    .line 174
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 178
    :cond_2
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/d;->a()Ljava/lang/Integer;

    move-result-object v1

    .line 179
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/d;->b()Ljava/lang/Integer;

    move-result-object v0

    .line 180
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-lez v8, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-lez v8, :cond_0

    .line 184
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v1, v0}, Lcom/mopub/mobileads/util/vast/VastManager;->a(II)D

    move-result-wide v0

    .line 185
    cmpg-double v8, v0, v2

    if-gez v8, :cond_5

    move-object v2, v4

    :goto_1
    move-object v5, v2

    move-wide v2, v0

    .line 189
    goto :goto_0

    .line 191
    :cond_3
    if-nez v5, :cond_4

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 192
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/util/vast/d;

    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/d;->d()Ljava/lang/String;

    move-result-object v5

    .line 195
    :cond_4
    return-object v5

    :cond_5
    move-wide v0, v2

    move-object v2, v5

    goto :goto_1
.end method

.method static synthetic a(Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;)Z
    .locals 1

    .prologue
    .line 20
    invoke-static {p0}, Lcom/mopub/mobileads/util/vast/VastManager;->b(Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/util/List;)Lcom/mopub/mobileads/util/vast/VastCompanionAd;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/util/vast/c;",
            ">;)",
            "Lcom/mopub/mobileads/util/vast/VastCompanionAd;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 199
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 201
    const-wide/high16 v4, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 204
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v1, v6

    .line 205
    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 206
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/util/vast/c;

    .line 208
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/c;->c()Ljava/lang/String;

    move-result-object v2

    .line 209
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/c;->d()Ljava/lang/String;

    move-result-object v3

    .line 210
    sget-object v9, Lcom/mopub/mobileads/util/vast/VastManager;->b:Ljava/util/List;

    invoke-interface {v9, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-nez v3, :cond_2

    .line 211
    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 215
    :cond_2
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/c;->a()Ljava/lang/Integer;

    move-result-object v2

    .line 216
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/c;->b()Ljava/lang/Integer;

    move-result-object v3

    .line 217
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-lez v9, :cond_0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-lez v9, :cond_0

    .line 221
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {p0, v2, v3}, Lcom/mopub/mobileads/util/vast/VastManager;->a(II)D

    move-result-wide v2

    .line 222
    cmpg-double v9, v2, v4

    if-gez v9, :cond_6

    move-wide v10, v2

    move-object v2, v0

    move-wide v0, v10

    :goto_1
    move-wide v4, v0

    move-object v1, v2

    .line 226
    goto :goto_0

    .line 228
    :cond_3
    if-nez v1, :cond_5

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 229
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/util/vast/c;

    move-object v7, v0

    .line 232
    :goto_2
    if-eqz v7, :cond_4

    .line 233
    new-instance v0, Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    invoke-virtual {v7}, Lcom/mopub/mobileads/util/vast/c;->a()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7}, Lcom/mopub/mobileads/util/vast/c;->b()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v7}, Lcom/mopub/mobileads/util/vast/c;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7}, Lcom/mopub/mobileads/util/vast/c;->e()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v7}, Lcom/mopub/mobileads/util/vast/c;->f()Ljava/util/List;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct/range {v0 .. v5}, Lcom/mopub/mobileads/util/vast/VastCompanionAd;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 241
    :goto_3
    return-object v0

    :cond_4
    move-object v0, v6

    goto :goto_3

    :cond_5
    move-object v7, v1

    goto :goto_2

    :cond_6
    move-object v2, v1

    move-wide v0, v4

    goto :goto_1
.end method

.method private static b(Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;)Z
    .locals 2

    .prologue
    .line 104
    invoke-virtual {p0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getNetworkMediaFileUrl()Ljava/lang/String;

    move-result-object v0

    .line 105
    invoke-static {v0}, Lcom/mopub/common/CacheService;->containsKeyDiskCache(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 106
    invoke-static {v0}, Lcom/mopub/common/CacheService;->getFilePathDiskCache(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 107
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->setDiskMediaFileUrl(Ljava/lang/String;)V

    .line 108
    const/4 v0, 0x1

    .line 110
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->d:Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->d:Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;->cancel(Z)Z

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->d:Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;

    .line 61
    :cond_0
    return-void
.end method

.method public onAggregationComplete(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/util/vast/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 65
    iput-object v6, p0, Lcom/mopub/mobileads/util/vast/VastManager;->d:Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;

    .line 66
    if-nez p1, :cond_0

    .line 67
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->c:Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;

    invoke-interface {v0, v6}, Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;->onVastVideoConfigurationPrepared(Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;)V

    .line 101
    :goto_0
    return-void

    .line 1127
    :cond_0
    new-instance v1, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    invoke-direct {v1}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;-><init>()V

    .line 1129
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1130
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1131
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/util/vast/b;

    .line 1132
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->b()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->addImpressionTrackers(Ljava/util/List;)V

    .line 1133
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->d()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->addAbsoluteTrackers(Ljava/util/List;)V

    .line 1134
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->c()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->addFractionalTrackers(Ljava/util/List;)V

    .line 1135
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->e()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->addCompleteTrackers(Ljava/util/List;)V

    .line 1136
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->f()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->addCloseTrackers(Ljava/util/List;)V

    .line 1137
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->g()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->addSkipTrackers(Ljava/util/List;)V

    .line 1139
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->i()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->addClickTrackers(Ljava/util/List;)V

    .line 1141
    invoke-virtual {v1}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getClickThroughUrl()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    .line 1142
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->setClickThroughUrl(Ljava/lang/String;)V

    .line 1145
    :cond_1
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->o()Ljava/util/List;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1146
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->p()Ljava/util/List;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1149
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->j()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->setCustomCtaText(Ljava/lang/String;)V

    .line 1150
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->k()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->setCustomSkipText(Ljava/lang/String;)V

    .line 1151
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->l()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->setCustomCloseIconUrl(Ljava/lang/String;)V

    .line 1152
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->m()Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->setCustomForceOrientation(Lcom/mopub/common/util/DeviceUtils$ForceOrientation;)V

    .line 1153
    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/b;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->setSkipOffset(Ljava/lang/String;)V

    goto :goto_1

    .line 1156
    :cond_2
    invoke-direct {p0, v2}, Lcom/mopub/mobileads/util/vast/VastManager;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->setNetworkMediaFileUrl(Ljava/lang/String;)V

    .line 1157
    invoke-direct {p0, v3}, Lcom/mopub/mobileads/util/vast/VastManager;->b(Ljava/util/List;)Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->setVastCompanionAd(Lcom/mopub/mobileads/util/vast/VastCompanionAd;)V

    .line 74
    invoke-static {v1}, Lcom/mopub/mobileads/util/vast/VastManager;->b(Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 75
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->c:Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;->onVastVideoConfigurationPrepared(Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;)V

    goto/16 :goto_0

    .line 79
    :cond_3
    new-instance v0, Lcom/mopub/mobileads/VastVideoDownloadTask;

    new-instance v2, Lcom/mopub/mobileads/util/vast/a;

    invoke-direct {v2, p0, v1}, Lcom/mopub/mobileads/util/vast/a;-><init>(Lcom/mopub/mobileads/util/vast/VastManager;Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;)V

    invoke-direct {v0, v2}, Lcom/mopub/mobileads/VastVideoDownloadTask;-><init>(Lcom/mopub/mobileads/VastVideoDownloadTask$VastVideoDownloadTaskListener;)V

    .line 93
    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1}, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->getNetworkMediaFileUrl()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v3

    invoke-static {v0, v2}, Lcom/mopub/common/util/AsyncTasks;->safeExecuteOnExecutor(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 97
    :catch_0
    move-exception v0

    .line 98
    const-string v1, "Failed to download vast video"

    invoke-static {v1, v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->c:Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;

    invoke-interface {v0, v6}, Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;->onVastVideoConfigurationPrepared(Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;)V

    goto/16 :goto_0
.end method

.method public prepareVastVideoConfiguration(Ljava/lang/String;Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;)V
    .locals 3

    .prologue
    .line 43
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->d:Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;

    if-nez v0, :cond_0

    .line 44
    iput-object p2, p0, Lcom/mopub/mobileads/util/vast/VastManager;->c:Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;

    .line 45
    new-instance v0, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;-><init>(Lcom/mopub/mobileads/util/vast/e;)V

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->d:Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;

    .line 48
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->d:Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/mopub/common/util/AsyncTasks;->safeExecuteOnExecutor(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    :cond_0
    :goto_0
    return-void

    .line 49
    :catch_0
    move-exception v0

    .line 50
    const-string v1, "Failed to aggregate vast xml"

    invoke-static {v1, v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastManager;->c:Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;->onVastVideoConfigurationPrepared(Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;)V

    goto :goto_0
.end method
