.class public Lcom/thetransitapp/droid/model/RoutingRequest;
.super Ljava/lang/Object;
.source "RoutingRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x143126109a8588ebL


# instance fields
.field private arriveBy:Z

.field private date:Ljava/util/Date;

.field private end:Lcom/thetransitapp/droid/model/SimplePlacemark;

.field private error:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

.field private errorMessage:Ljava/lang/String;

.field private errorTitle:Ljava/lang/String;

.field private feedId:Ljava/lang/String;

.field private itineraries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingItinerary;",
            ">;"
        }
    .end annotation
.end field

.field private start:Lcom/thetransitapp/droid/model/SimplePlacemark;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->itineraries:Ljava/util/List;

    .line 33
    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 10
    instance-of v0, p1, Lcom/thetransitapp/droid/model/RoutingRequest;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 21
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 10
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_0

    const/16 v19, 0x1

    :goto_0
    return v19

    :cond_0
    move-object/from16 v0, p1

    instance-of v0, v0, Lcom/thetransitapp/droid/model/RoutingRequest;

    move/from16 v19, v0

    if-nez v19, :cond_1

    const/16 v19, 0x0

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/thetransitapp/droid/model/RoutingRequest;

    .local v2, "other":Lcom/thetransitapp/droid/model/RoutingRequest;
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/RoutingRequest;->canEqual(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_2

    const/16 v19, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v18

    .local v18, "this$start":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v10

    .local v10, "other$start":Lcom/thetransitapp/droid/model/SimplePlacemark;
    if-nez v18, :cond_4

    if-eqz v10, :cond_5

    :cond_3
    const/16 v19, 0x0

    goto :goto_0

    :cond_4
    move-object/from16 v0, v18

    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getEnd()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v12

    .local v12, "this$end":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->getEnd()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v4

    .local v4, "other$end":Lcom/thetransitapp/droid/model/SimplePlacemark;
    if-nez v12, :cond_7

    if-eqz v4, :cond_8

    :cond_6
    const/16 v19, 0x0

    goto :goto_0

    :cond_7
    invoke-virtual {v12, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_6

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getFeedId()Ljava/lang/String;

    move-result-object v16

    .local v16, "this$feedId":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->getFeedId()Ljava/lang/String;

    move-result-object v8

    .local v8, "other$feedId":Ljava/lang/String;
    if-nez v16, :cond_a

    if-eqz v8, :cond_b

    :cond_9
    const/16 v19, 0x0

    goto :goto_0

    :cond_a
    move-object/from16 v0, v16

    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_9

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v17

    .local v17, "this$itineraries":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v9

    .local v9, "other$itineraries":Ljava/util/List;
    if-nez v17, :cond_d

    if-eqz v9, :cond_e

    :cond_c
    const/16 v19, 0x0

    goto :goto_0

    :cond_d
    move-object/from16 v0, v17

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_c

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getDate()Ljava/util/Date;

    move-result-object v11

    .local v11, "this$date":Ljava/util/Date;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->getDate()Ljava/util/Date;

    move-result-object v3

    .local v3, "other$date":Ljava/util/Date;
    if-nez v11, :cond_10

    if-eqz v3, :cond_11

    :cond_f
    const/16 v19, 0x0

    goto/16 :goto_0

    :cond_10
    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_f

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getError()Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    move-result-object v13

    .local v13, "this$error":Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->getError()Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    move-result-object v5

    .local v5, "other$error":Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;
    if-nez v13, :cond_13

    if-eqz v5, :cond_14

    :cond_12
    const/16 v19, 0x0

    goto/16 :goto_0

    :cond_13
    invoke-virtual {v13, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_12

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getErrorTitle()Ljava/lang/String;

    move-result-object v15

    .local v15, "this$errorTitle":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->getErrorTitle()Ljava/lang/String;

    move-result-object v7

    .local v7, "other$errorTitle":Ljava/lang/String;
    if-nez v15, :cond_16

    if-eqz v7, :cond_17

    :cond_15
    const/16 v19, 0x0

    goto/16 :goto_0

    :cond_16
    invoke-virtual {v15, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_15

    :cond_17
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getErrorMessage()Ljava/lang/String;

    move-result-object v14

    .local v14, "this$errorMessage":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->getErrorMessage()Ljava/lang/String;

    move-result-object v6

    .local v6, "other$errorMessage":Ljava/lang/String;
    if-nez v14, :cond_19

    if-eqz v6, :cond_1a

    :cond_18
    const/16 v19, 0x0

    goto/16 :goto_0

    :cond_19
    invoke-virtual {v14, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_18

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->isArriveBy()Z

    move-result v19

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingRequest;->isArriveBy()Z

    move-result v20

    move/from16 v0, v19

    move/from16 v1, v20

    if-eq v0, v1, :cond_1b

    const/16 v19, 0x0

    goto/16 :goto_0

    :cond_1b
    const/16 v19, 0x1

    goto/16 :goto_0
.end method

.method public getDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->date:Ljava/util/Date;

    return-object v0
.end method

.method public getEnd()Lcom/thetransitapp/droid/model/SimplePlacemark;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->end:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-object v0
.end method

.method public getError()Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->error:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    return-object v0
.end method

.method public getErrorMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->errorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getFeedId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->feedId:Ljava/lang/String;

    return-object v0
.end method

.method public getItineraries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingItinerary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->itineraries:Ljava/util/List;

    return-object v0
.end method

.method public getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->start:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-object v0
.end method

.method public hashCode()I
    .locals 13

    .prologue
    const/4 v11, 0x0

    .line 10
    const/16 v8, 0x1f

    .local v8, "PRIME":I
    const/4 v9, 0x1

    .local v9, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v7

    .local v7, "$start":Lcom/thetransitapp/droid/model/SimplePlacemark;
    if-nez v7, :cond_0

    move v10, v11

    :goto_0
    add-int/lit8 v9, v10, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getEnd()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v1

    .local v1, "$end":Lcom/thetransitapp/droid/model/SimplePlacemark;
    mul-int/lit8 v12, v9, 0x1f

    if-nez v1, :cond_1

    move v10, v11

    :goto_1
    add-int v9, v12, v10

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getFeedId()Ljava/lang/String;

    move-result-object v5

    .local v5, "$feedId":Ljava/lang/String;
    mul-int/lit8 v12, v9, 0x1f

    if-nez v5, :cond_2

    move v10, v11

    :goto_2
    add-int v9, v12, v10

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v6

    .local v6, "$itineraries":Ljava/util/List;
    mul-int/lit8 v12, v9, 0x1f

    if-nez v6, :cond_3

    move v10, v11

    :goto_3
    add-int v9, v12, v10

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getDate()Ljava/util/Date;

    move-result-object v0

    .local v0, "$date":Ljava/util/Date;
    mul-int/lit8 v12, v9, 0x1f

    if-nez v0, :cond_4

    move v10, v11

    :goto_4
    add-int v9, v12, v10

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getError()Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    move-result-object v2

    .local v2, "$error":Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;
    mul-int/lit8 v12, v9, 0x1f

    if-nez v2, :cond_5

    move v10, v11

    :goto_5
    add-int v9, v12, v10

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getErrorTitle()Ljava/lang/String;

    move-result-object v4

    .local v4, "$errorTitle":Ljava/lang/String;
    mul-int/lit8 v12, v9, 0x1f

    if-nez v4, :cond_6

    move v10, v11

    :goto_6
    add-int v9, v12, v10

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getErrorMessage()Ljava/lang/String;

    move-result-object v3

    .local v3, "$errorMessage":Ljava/lang/String;
    mul-int/lit8 v10, v9, 0x1f

    if-nez v3, :cond_7

    :goto_7
    add-int v9, v10, v11

    mul-int/lit8 v11, v9, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->isArriveBy()Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4cf

    :goto_8
    add-int v9, v11, v10

    return v9

    .end local v0    # "$date":Ljava/util/Date;
    .end local v1    # "$end":Lcom/thetransitapp/droid/model/SimplePlacemark;
    .end local v2    # "$error":Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;
    .end local v3    # "$errorMessage":Ljava/lang/String;
    .end local v4    # "$errorTitle":Ljava/lang/String;
    .end local v5    # "$feedId":Ljava/lang/String;
    .end local v6    # "$itineraries":Ljava/util/List;
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_0

    .restart local v1    # "$end":Lcom/thetransitapp/droid/model/SimplePlacemark;
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_1

    .restart local v5    # "$feedId":Ljava/lang/String;
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_2

    .restart local v6    # "$itineraries":Ljava/util/List;
    :cond_3
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_3

    .restart local v0    # "$date":Ljava/util/Date;
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_4

    .restart local v2    # "$error":Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_5

    .restart local v4    # "$errorTitle":Ljava/lang/String;
    :cond_6
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_6

    .restart local v3    # "$errorMessage":Ljava/lang/String;
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v11

    goto :goto_7

    :cond_8
    const/16 v10, 0x4d5

    goto :goto_8
.end method

.method public isArriveBy()Z
    .locals 1

    .prologue
    .line 10
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->arriveBy:Z

    return v0
.end method

.method public setArriveBy(Z)V
    .locals 0
    .param p1, "arriveBy"    # Z

    .prologue
    .line 10
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->arriveBy:Z

    return-void
.end method

.method public setDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "date"    # Ljava/util/Date;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->date:Ljava/util/Date;

    return-void
.end method

.method public setEnd(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    .locals 0
    .param p1, "end"    # Lcom/thetransitapp/droid/model/SimplePlacemark;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->end:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-void
.end method

.method public setError(Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;)V
    .locals 0
    .param p1, "error"    # Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->error:Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    return-void
.end method

.method public setErrorMessage(Ljava/lang/String;)V
    .locals 0
    .param p1, "errorMessage"    # Ljava/lang/String;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->errorMessage:Ljava/lang/String;

    return-void
.end method

.method public setErrorTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "errorTitle"    # Ljava/lang/String;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->errorTitle:Ljava/lang/String;

    return-void
.end method

.method public setFeedId(Ljava/lang/String;)V
    .locals 0
    .param p1, "feedId"    # Ljava/lang/String;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->feedId:Ljava/lang/String;

    return-void
.end method

.method public setItineraries(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingItinerary;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 10
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/RoutingItinerary;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->itineraries:Ljava/util/List;

    return-void
.end method

.method public setStart(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    .locals 0
    .param p1, "start"    # Lcom/thetransitapp/droid/model/SimplePlacemark;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingRequest;->start:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RoutingRequest(start="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getStart()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getEnd()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", feedId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getFeedId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", itineraries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getItineraries()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", date="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getError()Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getErrorTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", arriveBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingRequest;->isArriveBy()Z

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
