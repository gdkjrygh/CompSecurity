.class public Lcom/thetransitapp/droid/model/Route;
.super Ljava/lang/Object;
.source "Route.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/model/Route$RouteType;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x6978be904a54d015L


# instance fields
.field private color:I

.field private favorite:Z

.field private feedId:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private itineraries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;"
        }
    .end annotation
.end field

.field private longName:Ljava/lang/String;

.field private shortName:Ljava/lang/String;

.field private textColor:I

.field private type:Lcom/thetransitapp/droid/model/Route$RouteType;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/Route;->itineraries:Ljava/util/List;

    .line 31
    return-void
.end method


# virtual methods
.method public addItinerary(Lcom/thetransitapp/droid/model/Itinerary;)V
    .locals 3
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;

    .prologue
    .line 44
    invoke-virtual {p1, p0}, Lcom/thetransitapp/droid/model/Itinerary;->setRoute(Lcom/thetransitapp/droid/model/Route;)V

    .line 46
    iget-object v1, p0, Lcom/thetransitapp/droid/model/Route;->itineraries:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 53
    iget-object v1, p0, Lcom/thetransitapp/droid/model/Route;->itineraries:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    :goto_0
    return-void

    .line 46
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Itinerary;

    .line 47
    .local v0, "item":Lcom/thetransitapp/droid/model/Itinerary;
    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/model/Itinerary;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 48
    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/model/Itinerary;->merge(Lcom/thetransitapp/droid/model/Itinerary;)V

    goto :goto_0
.end method

.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 9
    instance-of v0, p1, Lcom/thetransitapp/droid/model/Route;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 17
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 9
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_0

    const/4 v15, 0x1

    :goto_0
    return v15

    :cond_0
    move-object/from16 v0, p1

    instance-of v15, v0, Lcom/thetransitapp/droid/model/Route;

    if-nez v15, :cond_1

    const/4 v15, 0x0

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/thetransitapp/droid/model/Route;

    .local v2, "other":Lcom/thetransitapp/droid/model/Route;
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/Route;->canEqual(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_2

    const/4 v15, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v10

    .local v10, "this$id":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v4

    .local v4, "other$id":Ljava/lang/String;
    if-nez v10, :cond_4

    if-eqz v4, :cond_5

    :cond_3
    const/4 v15, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/Route;->getFeedId()Ljava/lang/String;

    move-result-object v9

    .local v9, "this$feedId":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getFeedId()Ljava/lang/String;

    move-result-object v3

    .local v3, "other$feedId":Ljava/lang/String;
    if-nez v9, :cond_7

    if-eqz v3, :cond_8

    :cond_6
    const/4 v15, 0x0

    goto :goto_0

    :cond_7
    invoke-virtual {v9, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_6

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/Route;->getColor()I

    move-result v15

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getColor()I

    move-result v16

    move/from16 v0, v16

    if-eq v15, v0, :cond_9

    const/4 v15, 0x0

    goto :goto_0

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/Route;->getTextColor()I

    move-result v15

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getTextColor()I

    move-result v16

    move/from16 v0, v16

    if-eq v15, v0, :cond_a

    const/4 v15, 0x0

    goto :goto_0

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/Route;->getShortName()Ljava/lang/String;

    move-result-object v13

    .local v13, "this$shortName":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getShortName()Ljava/lang/String;

    move-result-object v7

    .local v7, "other$shortName":Ljava/lang/String;
    if-nez v13, :cond_c

    if-eqz v7, :cond_d

    :cond_b
    const/4 v15, 0x0

    goto :goto_0

    :cond_c
    invoke-virtual {v13, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_b

    :cond_d
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/Route;->getLongName()Ljava/lang/String;

    move-result-object v12

    .local v12, "this$longName":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getLongName()Ljava/lang/String;

    move-result-object v6

    .local v6, "other$longName":Ljava/lang/String;
    if-nez v12, :cond_f

    if-eqz v6, :cond_10

    :cond_e
    const/4 v15, 0x0

    goto :goto_0

    :cond_f
    invoke-virtual {v12, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/Route;->getType()Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v14

    .local v14, "this$type":Lcom/thetransitapp/droid/model/Route$RouteType;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getType()Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v8

    .local v8, "other$type":Lcom/thetransitapp/droid/model/Route$RouteType;
    if-nez v14, :cond_12

    if-eqz v8, :cond_13

    :cond_11
    const/4 v15, 0x0

    goto/16 :goto_0

    :cond_12
    invoke-virtual {v14, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    :cond_13
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/Route;->isFavorite()Z

    move-result v15

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->isFavorite()Z

    move-result v16

    move/from16 v0, v16

    if-eq v15, v0, :cond_14

    const/4 v15, 0x0

    goto/16 :goto_0

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/Route;->getItineraries()Ljava/util/List;

    move-result-object v11

    .local v11, "this$itineraries":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getItineraries()Ljava/util/List;

    move-result-object v5

    .local v5, "other$itineraries":Ljava/util/List;
    if-nez v11, :cond_16

    if-eqz v5, :cond_17

    :cond_15
    const/4 v15, 0x0

    goto/16 :goto_0

    :cond_16
    invoke-virtual {v11, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_15

    :cond_17
    const/4 v15, 0x1

    goto/16 :goto_0
.end method

.method public getColor()I
    .locals 1

    .prologue
    .line 9
    iget v0, p0, Lcom/thetransitapp/droid/model/Route;->color:I

    return v0
.end method

.method public getFeedId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Route;->feedId:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Route;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getItineraries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Route;->itineraries:Ljava/util/List;

    return-object v0
.end method

.method public getItinerary(Ljava/lang/String;)Lcom/thetransitapp/droid/model/Itinerary;
    .locals 3
    .param p1, "itineraryID"    # Ljava/lang/String;

    .prologue
    .line 34
    iget-object v1, p0, Lcom/thetransitapp/droid/model/Route;->itineraries:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 40
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 34
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Itinerary;

    .line 35
    .local v0, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Itinerary;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0
.end method

.method public getLongName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Route;->longName:Ljava/lang/String;

    return-object v0
.end method

.method public getShortName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Route;->shortName:Ljava/lang/String;

    return-object v0
.end method

.method public getTextColor()I
    .locals 1

    .prologue
    .line 9
    iget v0, p0, Lcom/thetransitapp/droid/model/Route;->textColor:I

    return v0
.end method

.method public getType()Lcom/thetransitapp/droid/model/Route$RouteType;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/Route;->type:Lcom/thetransitapp/droid/model/Route$RouteType;

    return-object v0
.end method

.method public hashCode()I
    .locals 11

    .prologue
    const/4 v9, 0x0

    .line 9
    const/16 v6, 0x1f

    .local v6, "PRIME":I
    const/4 v7, 0x1

    .local v7, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v1

    .local v1, "$id":Ljava/lang/String;
    if-nez v1, :cond_0

    move v8, v9

    :goto_0
    add-int/lit8 v7, v8, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getFeedId()Ljava/lang/String;

    move-result-object v0

    .local v0, "$feedId":Ljava/lang/String;
    mul-int/lit8 v10, v7, 0x1f

    if-nez v0, :cond_1

    move v8, v9

    :goto_1
    add-int v7, v10, v8

    mul-int/lit8 v8, v7, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getColor()I

    move-result v10

    add-int v7, v8, v10

    mul-int/lit8 v8, v7, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getTextColor()I

    move-result v10

    add-int v7, v8, v10

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getShortName()Ljava/lang/String;

    move-result-object v4

    .local v4, "$shortName":Ljava/lang/String;
    mul-int/lit8 v10, v7, 0x1f

    if-nez v4, :cond_2

    move v8, v9

    :goto_2
    add-int v7, v10, v8

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getLongName()Ljava/lang/String;

    move-result-object v3

    .local v3, "$longName":Ljava/lang/String;
    mul-int/lit8 v10, v7, 0x1f

    if-nez v3, :cond_3

    move v8, v9

    :goto_3
    add-int v7, v10, v8

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getType()Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v5

    .local v5, "$type":Lcom/thetransitapp/droid/model/Route$RouteType;
    mul-int/lit8 v10, v7, 0x1f

    if-nez v5, :cond_4

    move v8, v9

    :goto_4
    add-int v7, v10, v8

    mul-int/lit8 v10, v7, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->isFavorite()Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x4cf

    :goto_5
    add-int v7, v10, v8

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getItineraries()Ljava/util/List;

    move-result-object v2

    .local v2, "$itineraries":Ljava/util/List;
    mul-int/lit8 v8, v7, 0x1f

    if-nez v2, :cond_6

    :goto_6
    add-int v7, v8, v9

    return v7

    .end local v0    # "$feedId":Ljava/lang/String;
    .end local v2    # "$itineraries":Ljava/util/List;
    .end local v3    # "$longName":Ljava/lang/String;
    .end local v4    # "$shortName":Ljava/lang/String;
    .end local v5    # "$type":Lcom/thetransitapp/droid/model/Route$RouteType;
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_0

    .restart local v0    # "$feedId":Ljava/lang/String;
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_1

    .restart local v4    # "$shortName":Ljava/lang/String;
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_2

    .restart local v3    # "$longName":Ljava/lang/String;
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_3

    .restart local v5    # "$type":Lcom/thetransitapp/droid/model/Route$RouteType;
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_4

    :cond_5
    const/16 v8, 0x4d5

    goto :goto_5

    .restart local v2    # "$itineraries":Ljava/util/List;
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v9

    goto :goto_6
.end method

.method public isFavorite()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/Route;->favorite:Z

    return v0
.end method

.method public setColor(I)V
    .locals 0
    .param p1, "color"    # I

    .prologue
    .line 9
    iput p1, p0, Lcom/thetransitapp/droid/model/Route;->color:I

    return-void
.end method

.method public setFavorite(Z)V
    .locals 0
    .param p1, "favorite"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/Route;->favorite:Z

    return-void
.end method

.method public setFeedId(Ljava/lang/String;)V
    .locals 0
    .param p1, "feedId"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Route;->feedId:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Route;->id:Ljava/lang/String;

    return-void
.end method

.method public setItineraries(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 9
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Route;->itineraries:Ljava/util/List;

    return-void
.end method

.method public setLongName(Ljava/lang/String;)V
    .locals 0
    .param p1, "longName"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Route;->longName:Ljava/lang/String;

    return-void
.end method

.method public setShortName(Ljava/lang/String;)V
    .locals 0
    .param p1, "shortName"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Route;->shortName:Ljava/lang/String;

    return-void
.end method

.method public setTextColor(I)V
    .locals 0
    .param p1, "textColor"    # I

    .prologue
    .line 9
    iput p1, p0, Lcom/thetransitapp/droid/model/Route;->textColor:I

    return-void
.end method

.method public setType(Lcom/thetransitapp/droid/model/Route$RouteType;)V
    .locals 0
    .param p1, "type"    # Lcom/thetransitapp/droid/model/Route$RouteType;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/Route;->type:Lcom/thetransitapp/droid/model/Route$RouteType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Route(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", feedId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getFeedId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", textColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getTextColor()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shortName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getShortName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", longName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getLongName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getType()Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", favorite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->isFavorite()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", itineraries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Route;->getItineraries()Ljava/util/List;

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
