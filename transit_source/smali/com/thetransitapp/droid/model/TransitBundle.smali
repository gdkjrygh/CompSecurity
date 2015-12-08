.class public Lcom/thetransitapp/droid/model/TransitBundle;
.super Ljava/lang/Object;
.source "TransitBundle.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x43625c50b9ae936eL


# instance fields
.field private countryCode:Ljava/lang/String;

.field private feeds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Feed;",
            ">;"
        }
    .end annotation
.end field

.field private gtfsSize:I

.field private id:Ljava/lang/String;

.field private latitude:D

.field private longitude:D

.field private name:Ljava/lang/String;

.field private server:Lcom/thetransitapp/droid/model/TransitServer;

.field private shortName:Ljava/lang/String;

.field private transitModes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/TransitMode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->feeds:Ljava/util/List;

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->transitModes:Ljava/util/List;

    .line 31
    return-void
.end method

.method private getBannedFeed(Lcom/thetransitapp/droid/model/TransitMode;)Ljava/lang/String;
    .locals 4
    .param p1, "mode"    # Lcom/thetransitapp/droid/model/TransitMode;

    .prologue
    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .local v0, "builder":Ljava/lang/StringBuilder;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitMode;->getFeedIds()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 142
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 143
    .local v1, "feedId":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 144
    const-string v3, ","

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private getBannedFeedType(Lcom/thetransitapp/droid/model/TransitMode;)Ljava/lang/String;
    .locals 6
    .param p1, "mode"    # Lcom/thetransitapp/droid/model/TransitMode;

    .prologue
    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .local v0, "builder":Ljava/lang/StringBuilder;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitMode;->getFeedIds()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 124
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 125
    .local v1, "feedId":Ljava/lang/String;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/Route$RouteType;

    .line 126
    .local v2, "type":Lcom/thetransitapp/droid/model/Route$RouteType;
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lez v5, :cond_2

    .line 127
    const-string v5, ","

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    const-string v5, "_"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private getBannedType(Lcom/thetransitapp/droid/model/TransitMode;)Ljava/lang/String;
    .locals 4
    .param p1, "mode"    # Lcom/thetransitapp/droid/model/TransitMode;

    .prologue
    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .local v0, "builder":Ljava/lang/StringBuilder;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 164
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 156
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/Route$RouteType;

    .line 157
    .local v1, "type":Lcom/thetransitapp/droid/model/Route$RouteType;
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 158
    const-string v3, ","

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    :cond_1
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0
.end method


# virtual methods
.method public deserve(Landroid/location/Location;)Z
    .locals 3
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 112
    iget-object v1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->feeds:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 118
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 112
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Feed;

    .line 113
    .local v0, "feed":Lcom/thetransitapp/droid/model/Feed;
    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/model/Feed;->deserve(Landroid/location/Location;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 114
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 169
    if-eqz p1, :cond_0

    instance-of v2, p1, Lcom/thetransitapp/droid/model/TransitBundle;

    if-nez v2, :cond_1

    .line 174
    :cond_0
    :goto_0
    return v1

    :cond_1
    move-object v0, p1

    .line 173
    check-cast v0, Lcom/thetransitapp/droid/model/TransitBundle;

    .line 174
    .local v0, "other":Lcom/thetransitapp/droid/model/TransitBundle;
    iget-object v2, p0, Lcom/thetransitapp/droid/model/TransitBundle;->id:Ljava/lang/String;

    iget-object v3, v0, Lcom/thetransitapp/droid/model/TransitBundle;->id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/thetransitapp/droid/model/TransitBundle;->name:Ljava/lang/String;

    iget-object v3, v0, Lcom/thetransitapp/droid/model/TransitBundle;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0
.end method

.method public getBannedTransitParameters(Z)Ljava/lang/String;
    .locals 7
    .param p1, "forNearbyRequest"    # Z

    .prologue
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .local v0, "bannedFeed":Ljava/lang/StringBuilder;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .local v2, "bannedType":Ljava/lang/StringBuilder;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .local v1, "bannedFeedType":Ljava/lang/StringBuilder;
    iget-object v5, p0, Lcom/thetransitapp/droid/model/TransitBundle;->transitModes:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_6

    .line 62
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .local v4, "parameters":Ljava/lang/StringBuilder;
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lez v5, :cond_1

    .line 65
    if-eqz p1, :cond_c

    const-string v5, "hidden_feed_ids="

    :goto_1
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 69
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lez v5, :cond_3

    .line 70
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lez v5, :cond_2

    .line 71
    const-string v5, "&"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    :cond_2
    if-eqz p1, :cond_d

    const-string v5, "hidden_route_types="

    :goto_2
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 78
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lez v5, :cond_5

    .line 79
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lez v5, :cond_4

    .line 80
    const-string v5, "&"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    :cond_4
    if-eqz p1, :cond_e

    const-string v5, "hidden_feed_route_types="

    :goto_3
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 87
    :cond_5
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    return-object v5

    .line 38
    .end local v4    # "parameters":Ljava/lang/StringBuilder;
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/thetransitapp/droid/model/TransitMode;

    .line 39
    .local v3, "mode":Lcom/thetransitapp/droid/model/TransitMode;
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v6

    if-nez v6, :cond_0

    .line 40
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitMode;->getFeedIds()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_8

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_8

    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-lez v6, :cond_7

    .line 42
    const-string v6, ","

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    :cond_7
    invoke-direct {p0, v3}, Lcom/thetransitapp/droid/model/TransitBundle;->getBannedFeedType(Lcom/thetransitapp/droid/model/TransitMode;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 46
    :cond_8
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitMode;->getFeedIds()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_a

    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-lez v6, :cond_9

    .line 48
    const-string v6, ","

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    :cond_9
    invoke-direct {p0, v3}, Lcom/thetransitapp/droid/model/TransitBundle;->getBannedFeed(Lcom/thetransitapp/droid/model/TransitMode;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 52
    :cond_a
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_0

    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-lez v6, :cond_b

    .line 54
    const-string v6, ","

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    :cond_b
    invoke-direct {p0, v3}, Lcom/thetransitapp/droid/model/TransitBundle;->getBannedType(Lcom/thetransitapp/droid/model/TransitMode;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 65
    .end local v3    # "mode":Lcom/thetransitapp/droid/model/TransitMode;
    .restart local v4    # "parameters":Ljava/lang/StringBuilder;
    :cond_c
    const-string v5, "bannedAgencies="

    goto/16 :goto_1

    .line 74
    :cond_d
    const-string v5, "bannedRouteTypes="

    goto/16 :goto_2

    .line 83
    :cond_e
    const-string v5, "bannedAgencyRouteTypes="

    goto/16 :goto_3
.end method

.method public getCountryCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public getFeeds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Feed;",
            ">;"
        }
    .end annotation

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->feeds:Ljava/util/List;

    return-object v0
.end method

.method public getGtfsSize()I
    .locals 1

    .prologue
    .line 12
    iget v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->gtfsSize:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLatitude()D
    .locals 2

    .prologue
    .line 12
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .prologue
    .line 12
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->longitude:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getServer()Lcom/thetransitapp/droid/model/TransitServer;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->server:Lcom/thetransitapp/droid/model/TransitServer;

    return-object v0
.end method

.method public getShortName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->shortName:Ljava/lang/String;

    return-object v0
.end method

.method public getTransitModes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/TransitMode;",
            ">;"
        }
    .end annotation

    .prologue
    .line 12
    iget-object v0, p0, Lcom/thetransitapp/droid/model/TransitBundle;->transitModes:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 179
    const/16 v0, 0x1f

    .line 180
    .local v0, "prime":I
    const/4 v1, 0x1

    .line 182
    .local v1, "result":I
    iget-object v2, p0, Lcom/thetransitapp/droid/model/TransitBundle;->id:Ljava/lang/String;

    if-nez v2, :cond_0

    move v2, v3

    :goto_0
    add-int/lit8 v1, v2, 0x1f

    .line 183
    mul-int/lit8 v2, v1, 0x1f

    iget-object v4, p0, Lcom/thetransitapp/droid/model/TransitBundle;->name:Ljava/lang/String;

    if-nez v4, :cond_1

    :goto_1
    add-int v1, v2, v3

    .line 185
    return v1

    .line 182
    :cond_0
    iget-object v2, p0, Lcom/thetransitapp/droid/model/TransitBundle;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    .line 183
    :cond_1
    iget-object v3, p0, Lcom/thetransitapp/droid/model/TransitBundle;->name:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_1
.end method

.method public merge(Lcom/thetransitapp/droid/model/TransitBundle;)V
    .locals 4
    .param p1, "bundle"    # Lcom/thetransitapp/droid/model/TransitBundle;

    .prologue
    .line 91
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getFeeds()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    .line 101
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getServer()Lcom/thetransitapp/droid/model/TransitServer;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 102
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getServer()Lcom/thetransitapp/droid/model/TransitServer;

    move-result-object v2

    iput-object v2, p0, Lcom/thetransitapp/droid/model/TransitBundle;->server:Lcom/thetransitapp/droid/model/TransitServer;

    .line 105
    :cond_0
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getTransitModes()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getTransitModes()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 106
    iget-object v2, p0, Lcom/thetransitapp/droid/model/TransitBundle;->transitModes:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 107
    iget-object v2, p0, Lcom/thetransitapp/droid/model/TransitBundle;->transitModes:Ljava/util/List;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitBundle;->getTransitModes()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 109
    :cond_1
    return-void

    .line 91
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Feed;

    .line 92
    .local v0, "feed":Lcom/thetransitapp/droid/model/Feed;
    iget-object v2, p0, Lcom/thetransitapp/droid/model/TransitBundle;->feeds:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 94
    .local v1, "index":I
    const/4 v2, -0x1

    if-eq v1, v2, :cond_3

    .line 95
    iget-object v2, p0, Lcom/thetransitapp/droid/model/TransitBundle;->feeds:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/Feed;

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/Feed;->merge(Lcom/thetransitapp/droid/model/Feed;)V

    goto :goto_0

    .line 97
    :cond_3
    iget-object v2, p0, Lcom/thetransitapp/droid/model/TransitBundle;->feeds:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public setCountryCode(Ljava/lang/String;)V
    .locals 0
    .param p1, "countryCode"    # Ljava/lang/String;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->countryCode:Ljava/lang/String;

    return-void
.end method

.method public setFeeds(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Feed;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 12
    .local p1, "feeds":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Feed;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->feeds:Ljava/util/List;

    return-void
.end method

.method public setGtfsSize(I)V
    .locals 0
    .param p1, "gtfsSize"    # I

    .prologue
    .line 12
    iput p1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->gtfsSize:I

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->id:Ljava/lang/String;

    return-void
.end method

.method public setLatitude(D)V
    .locals 0
    .param p1, "latitude"    # D

    .prologue
    .line 12
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->latitude:D

    return-void
.end method

.method public setLongitude(D)V
    .locals 0
    .param p1, "longitude"    # D

    .prologue
    .line 12
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->longitude:D

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->name:Ljava/lang/String;

    return-void
.end method

.method public setServer(Lcom/thetransitapp/droid/model/TransitServer;)V
    .locals 0
    .param p1, "server"    # Lcom/thetransitapp/droid/model/TransitServer;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->server:Lcom/thetransitapp/droid/model/TransitServer;

    return-void
.end method

.method public setShortName(Ljava/lang/String;)V
    .locals 0
    .param p1, "shortName"    # Ljava/lang/String;

    .prologue
    .line 12
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->shortName:Ljava/lang/String;

    return-void
.end method

.method public setTransitModes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/TransitMode;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 12
    .local p1, "transitModes":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/TransitMode;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/TransitBundle;->transitModes:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TransitBundle(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitBundle;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitBundle;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gtfsSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitBundle;->getGtfsSize()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitBundle;->getLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitBundle;->getLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", countryCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitBundle;->getCountryCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shortName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitBundle;->getShortName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", server="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitBundle;->getServer()Lcom/thetransitapp/droid/model/TransitServer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", transitModes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitBundle;->getTransitModes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", feeds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/TransitBundle;->getFeeds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
