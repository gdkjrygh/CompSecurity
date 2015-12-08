.class public Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/mopub/mobileads/VastFractionalProgressTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/mopub/mobileads/VastAbsoluteProgressTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Lcom/mopub/mobileads/util/vast/VastCompanionAd;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    sget-object v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->FORCE_LANDSCAPE:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->p:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->a:Ljava/util/ArrayList;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->b:Ljava/util/ArrayList;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->c:Ljava/util/ArrayList;

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->d:Ljava/util/ArrayList;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->e:Ljava/util/ArrayList;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->f:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->g:Ljava/util/ArrayList;

    .line 44
    return-void
.end method


# virtual methods
.method public addAbsoluteTrackers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/VastAbsoluteProgressTracker;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 67
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 68
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 69
    return-void
.end method

.method public addClickTrackers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 84
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 85
    return-void
.end method

.method public addCloseTrackers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 76
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 77
    return-void
.end method

.method public addCompleteTrackers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 72
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 73
    return-void
.end method

.method public addFractionalTrackers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/VastFractionalProgressTracker;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 59
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 60
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->b:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 61
    return-void
.end method

.method public addImpressionTrackers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 51
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 52
    return-void
.end method

.method public addSkipTrackers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 80
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 81
    return-void
.end method

.method public getAbsoluteTrackers()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/mopub/mobileads/VastAbsoluteProgressTracker;",
            ">;"
        }
    .end annotation

    .prologue
    .line 142
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getClickThroughUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getClickTrackers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 162
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getCloseTrackers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 154
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getCompleteTrackers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 150
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getCustomCloseIconUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->o:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomCtaText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomForceOrientation()Lcom/mopub/common/util/DeviceUtils$ForceOrientation;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->p:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    return-object v0
.end method

.method public getCustomSkipText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->n:Ljava/lang/String;

    return-object v0
.end method

.method public getDiskMediaFileUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->j:Ljava/lang/String;

    return-object v0
.end method

.method public getFractionalTrackers()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/mopub/mobileads/VastFractionalProgressTracker;",
            ">;"
        }
    .end annotation

    .prologue
    .line 146
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getImpressionTrackers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 138
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getNetworkMediaFileUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getSkipOffset()Ljava/lang/String;
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->k:Ljava/lang/String;

    return-object v0
.end method

.method public getSkipTrackers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 158
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getVastCompanionAd()Lcom/mopub/mobileads/util/vast/VastCompanionAd;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->l:Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    return-object v0
.end method

.method public setClickThroughUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->h:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public setCustomCloseIconUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 116
    if-eqz p1, :cond_0

    .line 117
    iput-object p1, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->o:Ljava/lang/String;

    .line 119
    :cond_0
    return-void
.end method

.method public setCustomCtaText(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 104
    if-eqz p1, :cond_0

    .line 105
    iput-object p1, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->m:Ljava/lang/String;

    .line 107
    :cond_0
    return-void
.end method

.method public setCustomForceOrientation(Lcom/mopub/common/util/DeviceUtils$ForceOrientation;)V
    .locals 1

    .prologue
    .line 122
    if-eqz p1, :cond_0

    sget-object v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->UNDEFINED:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    if-eq p1, v0, :cond_0

    .line 123
    iput-object p1, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->p:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    .line 125
    :cond_0
    return-void
.end method

.method public setCustomSkipText(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 110
    if-eqz p1, :cond_0

    .line 111
    iput-object p1, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->n:Ljava/lang/String;

    .line 113
    :cond_0
    return-void
.end method

.method public setDiskMediaFileUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->j:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public setNetworkMediaFileUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->i:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public setSkipOffset(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 128
    if-eqz p1, :cond_0

    .line 129
    iput-object p1, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->k:Ljava/lang/String;

    .line 131
    :cond_0
    return-void
.end method

.method public setVastCompanionAd(Lcom/mopub/mobileads/util/vast/VastCompanionAd;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;->l:Lcom/mopub/mobileads/util/vast/VastCompanionAd;

    .line 101
    return-void
.end method
