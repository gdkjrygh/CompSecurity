.class public Lcom/thetransitapp/droid/model/Feed;
.super Ljava/lang/Object;
.source "Feed.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x861dbbbf321d6bL


# instance fields
.field private code:Ljava/lang/String;

.field private currentServiceObjectIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private dataDownloadDate:Ljava/util/Date;

.field private expiredDataAlertShown:Z

.field private feedId:Ljava/lang/String;

.field private hasUnsavedChanges:Z

.field private imagesDate:Ljava/util/Date;

.field private installing:Z

.field private level:I

.field private licence:Ljava/lang/String;

.field private licenceUrl:Ljava/lang/String;

.field private maxLatitude:D

.field private maxLongitude:D

.field private minLatitude:D

.field private minLongitude:D

.field private name:Ljava/lang/String;

.field private needsDownload:Z

.field private needsToReplaceOfflineStore:Z

.field private needsUpdate:Z

.field private notice:Ljava/lang/String;

.field private noticeHeight:F

.field private realTimeDataSource:Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;

.field private realTimeRecipesDidChange:Z

.field private routeImages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RouteImage;",
            ">;"
        }
    .end annotation
.end field

.field private storeFileExists:Z

.field private storeIsValid:Z

.field private timeZone:Ljava/util/TimeZone;

.field private updatedDate:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->routeImages:Ljava/util/List;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->currentServiceObjectIds:Ljava/util/List;

    .line 58
    return-void
.end method


# virtual methods
.method public deserve(Landroid/location/Location;)Z
    .locals 4
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 75
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iget-wide v2, p0, Lcom/thetransitapp/droid/model/Feed;->minLatitude:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iget-wide v2, p0, Lcom/thetransitapp/droid/model/Feed;->maxLatitude:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 76
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    iget-wide v2, p0, Lcom/thetransitapp/droid/model/Feed;->minLongitude:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    iget-wide v2, p0, Lcom/thetransitapp/droid/model/Feed;->maxLongitude:D

    .line 75
    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 81
    if-eqz p1, :cond_0

    instance-of v2, p1, Lcom/thetransitapp/droid/model/Feed;

    if-nez v2, :cond_1

    .line 86
    :cond_0
    :goto_0
    return v1

    :cond_1
    move-object v0, p1

    .line 85
    check-cast v0, Lcom/thetransitapp/droid/model/Feed;

    .line 86
    .local v0, "other":Lcom/thetransitapp/droid/model/Feed;
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Feed;->code:Ljava/lang/String;

    iget-object v3, v0, Lcom/thetransitapp/droid/model/Feed;->code:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/thetransitapp/droid/model/Feed;->feedId:Ljava/lang/String;

    iget-object v3, v0, Lcom/thetransitapp/droid/model/Feed;->feedId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/thetransitapp/droid/model/Feed;->level:I

    iget v3, v0, Lcom/thetransitapp/droid/model/Feed;->level:I

    if-ne v2, v3, :cond_0

    .line 87
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Feed;->name:Ljava/lang/String;

    iget-object v3, v0, Lcom/thetransitapp/droid/model/Feed;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 86
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public getCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->code:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrentServiceObjectIds()Ljava/util/List;
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
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->currentServiceObjectIds:Ljava/util/List;

    return-object v0
.end method

.method public getDataDownloadDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->dataDownloadDate:Ljava/util/Date;

    return-object v0
.end method

.method public getFeedId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->feedId:Ljava/lang/String;

    return-object v0
.end method

.method public getImagesDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->imagesDate:Ljava/util/Date;

    return-object v0
.end method

.method public getLevel()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/Feed;->level:I

    return v0
.end method

.method public getLicence()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->licence:Ljava/lang/String;

    return-object v0
.end method

.method public getLicenceUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->licenceUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMaxLatitude()D
    .locals 2

    .prologue
    .line 14
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/Feed;->maxLatitude:D

    return-wide v0
.end method

.method public getMaxLongitude()D
    .locals 2

    .prologue
    .line 14
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/Feed;->maxLongitude:D

    return-wide v0
.end method

.method public getMinLatitude()D
    .locals 2

    .prologue
    .line 14
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/Feed;->minLatitude:D

    return-wide v0
.end method

.method public getMinLongitude()D
    .locals 2

    .prologue
    .line 14
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/Feed;->minLongitude:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNotice()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->notice:Ljava/lang/String;

    return-object v0
.end method

.method public getNoticeHeight()F
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/Feed;->noticeHeight:F

    return v0
.end method

.method public getRealTimeDataSource()Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->realTimeDataSource:Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;

    return-object v0
.end method

.method public getRouteImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RouteImage;",
            ">;"
        }
    .end annotation

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->routeImages:Ljava/util/List;

    return-object v0
.end method

.method public getTimeZone()Ljava/util/TimeZone;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->timeZone:Ljava/util/TimeZone;

    return-object v0
.end method

.method public getUpdatedDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->updatedDate:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 92
    const/16 v0, 0x1f

    .line 93
    .local v0, "prime":I
    const/4 v1, 0x1

    .line 94
    .local v1, "result":I
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Feed;->code:Ljava/lang/String;

    if-nez v2, :cond_0

    move v2, v3

    :goto_0
    add-int/lit8 v1, v2, 0x1f

    .line 95
    mul-int/lit8 v4, v1, 0x1f

    iget-object v2, p0, Lcom/thetransitapp/droid/model/Feed;->feedId:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    :goto_1
    add-int v1, v4, v2

    .line 96
    mul-int/lit8 v2, v1, 0x1f

    iget v4, p0, Lcom/thetransitapp/droid/model/Feed;->level:I

    add-int v1, v2, v4

    .line 97
    mul-int/lit8 v2, v1, 0x1f

    iget-object v4, p0, Lcom/thetransitapp/droid/model/Feed;->name:Ljava/lang/String;

    if-nez v4, :cond_2

    :goto_2
    add-int v1, v2, v3

    .line 98
    return v1

    .line 94
    :cond_0
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Feed;->code:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    .line 95
    :cond_1
    iget-object v2, p0, Lcom/thetransitapp/droid/model/Feed;->feedId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    .line 97
    :cond_2
    iget-object v3, p0, Lcom/thetransitapp/droid/model/Feed;->name:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_2
.end method

.method public isExpiredDataAlertShown()Z
    .locals 1

    .prologue
    .line 14
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Feed;->expiredDataAlertShown:Z

    return v0
.end method

.method public isHasUnsavedChanges()Z
    .locals 1

    .prologue
    .line 14
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Feed;->hasUnsavedChanges:Z

    return v0
.end method

.method public isInstalling()Z
    .locals 1

    .prologue
    .line 14
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Feed;->installing:Z

    return v0
.end method

.method public isNeedsDownload()Z
    .locals 1

    .prologue
    .line 14
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Feed;->needsDownload:Z

    return v0
.end method

.method public isNeedsToReplaceOfflineStore()Z
    .locals 1

    .prologue
    .line 14
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Feed;->needsToReplaceOfflineStore:Z

    return v0
.end method

.method public isNeedsUpdate()Z
    .locals 1

    .prologue
    .line 14
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Feed;->needsUpdate:Z

    return v0
.end method

.method public isRealTimeRecipesDidChange()Z
    .locals 1

    .prologue
    .line 14
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Feed;->realTimeRecipesDidChange:Z

    return v0
.end method

.method public isStoreFileExists()Z
    .locals 1

    .prologue
    .line 14
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Feed;->storeFileExists:Z

    return v0
.end method

.method public isStoreIsValid()Z
    .locals 1

    .prologue
    .line 14
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Feed;->storeIsValid:Z

    return v0
.end method

.method public merge(Lcom/thetransitapp/droid/model/Feed;)V
    .locals 1
    .param p1, "feed"    # Lcom/thetransitapp/droid/model/Feed;

    .prologue
    .line 61
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Feed;->getUpdatedDate()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Feed;->getUpdatedDate()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->updatedDate:Ljava/util/Date;

    .line 65
    :cond_0
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Feed;->getRealTimeDataSource()Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 66
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Feed;->getRealTimeDataSource()Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->realTimeDataSource:Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;

    .line 69
    :cond_1
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Feed;->getRouteImages()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Feed;->getRouteImages()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 70
    :cond_2
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Feed;->getRouteImages()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/model/Feed;->routeImages:Ljava/util/List;

    .line 72
    :cond_3
    return-void
.end method

.method public setCode(Ljava/lang/String;)V
    .locals 0
    .param p1, "code"    # Ljava/lang/String;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->code:Ljava/lang/String;

    return-void
.end method

.method public setCurrentServiceObjectIds(Ljava/util/List;)V
    .locals 0
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
    .line 14
    .local p1, "currentServiceObjectIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->currentServiceObjectIds:Ljava/util/List;

    return-void
.end method

.method public setDataDownloadDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "dataDownloadDate"    # Ljava/util/Date;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->dataDownloadDate:Ljava/util/Date;

    return-void
.end method

.method public setExpiredDataAlertShown(Z)V
    .locals 0
    .param p1, "expiredDataAlertShown"    # Z

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Feed;->expiredDataAlertShown:Z

    return-void
.end method

.method public setFeedId(Ljava/lang/String;)V
    .locals 0
    .param p1, "feedId"    # Ljava/lang/String;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->feedId:Ljava/lang/String;

    return-void
.end method

.method public setHasUnsavedChanges(Z)V
    .locals 0
    .param p1, "hasUnsavedChanges"    # Z

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Feed;->hasUnsavedChanges:Z

    return-void
.end method

.method public setImagesDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "imagesDate"    # Ljava/util/Date;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->imagesDate:Ljava/util/Date;

    return-void
.end method

.method public setInstalling(Z)V
    .locals 0
    .param p1, "installing"    # Z

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Feed;->installing:Z

    return-void
.end method

.method public setLevel(I)V
    .locals 0
    .param p1, "level"    # I

    .prologue
    .line 14
    iput p1, p0, Lcom/thetransitapp/droid/model/Feed;->level:I

    return-void
.end method

.method public setLicence(Ljava/lang/String;)V
    .locals 0
    .param p1, "licence"    # Ljava/lang/String;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->licence:Ljava/lang/String;

    return-void
.end method

.method public setLicenceUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "licenceUrl"    # Ljava/lang/String;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->licenceUrl:Ljava/lang/String;

    return-void
.end method

.method public setMaxLatitude(D)V
    .locals 0
    .param p1, "maxLatitude"    # D

    .prologue
    .line 14
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/Feed;->maxLatitude:D

    return-void
.end method

.method public setMaxLongitude(D)V
    .locals 0
    .param p1, "maxLongitude"    # D

    .prologue
    .line 14
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/Feed;->maxLongitude:D

    return-void
.end method

.method public setMinLatitude(D)V
    .locals 0
    .param p1, "minLatitude"    # D

    .prologue
    .line 14
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/Feed;->minLatitude:D

    return-void
.end method

.method public setMinLongitude(D)V
    .locals 0
    .param p1, "minLongitude"    # D

    .prologue
    .line 14
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/Feed;->minLongitude:D

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->name:Ljava/lang/String;

    return-void
.end method

.method public setNeedsDownload(Z)V
    .locals 0
    .param p1, "needsDownload"    # Z

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Feed;->needsDownload:Z

    return-void
.end method

.method public setNeedsToReplaceOfflineStore(Z)V
    .locals 0
    .param p1, "needsToReplaceOfflineStore"    # Z

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Feed;->needsToReplaceOfflineStore:Z

    return-void
.end method

.method public setNeedsUpdate(Z)V
    .locals 0
    .param p1, "needsUpdate"    # Z

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Feed;->needsUpdate:Z

    return-void
.end method

.method public setNotice(Ljava/lang/String;)V
    .locals 0
    .param p1, "notice"    # Ljava/lang/String;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->notice:Ljava/lang/String;

    return-void
.end method

.method public setNoticeHeight(F)V
    .locals 0
    .param p1, "noticeHeight"    # F

    .prologue
    .line 14
    iput p1, p0, Lcom/thetransitapp/droid/model/Feed;->noticeHeight:F

    return-void
.end method

.method public setRealTimeDataSource(Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;)V
    .locals 0
    .param p1, "realTimeDataSource"    # Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->realTimeDataSource:Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;

    return-void
.end method

.method public setRealTimeRecipesDidChange(Z)V
    .locals 0
    .param p1, "realTimeRecipesDidChange"    # Z

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Feed;->realTimeRecipesDidChange:Z

    return-void
.end method

.method public setRouteImages(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RouteImage;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 14
    .local p1, "routeImages":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/RouteImage;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->routeImages:Ljava/util/List;

    return-void
.end method

.method public setStoreFileExists(Z)V
    .locals 0
    .param p1, "storeFileExists"    # Z

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Feed;->storeFileExists:Z

    return-void
.end method

.method public setStoreIsValid(Z)V
    .locals 0
    .param p1, "storeIsValid"    # Z

    .prologue
    .line 14
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Feed;->storeIsValid:Z

    return-void
.end method

.method public setTimeZone(Ljava/util/TimeZone;)V
    .locals 0
    .param p1, "timeZone"    # Ljava/util/TimeZone;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->timeZone:Ljava/util/TimeZone;

    return-void
.end method

.method public setUpdatedDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "updatedDate"    # Ljava/util/Date;

    .prologue
    .line 14
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Feed;->updatedDate:Ljava/util/Date;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Feed(code="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", feedId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getFeedId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeZone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", level="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getLevel()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataDownloadDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getDataDownloadDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", updatedDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getUpdatedDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imagesDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getImagesDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", routeImages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getRouteImages()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getMinLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getMaxLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getMinLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getMaxLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hasUnsavedChanges="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->isHasUnsavedChanges()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", needsToReplaceOfflineStore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->isNeedsToReplaceOfflineStore()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", realTimeRecipesDidChange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->isRealTimeRecipesDidChange()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", needsUpdate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->isNeedsUpdate()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expiredDataAlertShown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->isExpiredDataAlertShown()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", realTimeDataSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getRealTimeDataSource()Lcom/thetransitapp/droid/model/realtime/FeedRealTimeDataSource;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", notice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getNotice()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", noticeHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getNoticeHeight()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", licence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getLicence()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", licenceUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getLicenceUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currentServiceObjectIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->getCurrentServiceObjectIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", installing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->isInstalling()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", needsDownload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->isNeedsDownload()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", storeIsValid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->isStoreIsValid()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", storeFileExists="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Feed;->isStoreFileExists()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
