.class public Lcom/thetransitapp/droid/model/RoutingItinerary;
.super Ljava/lang/Object;
.source "RoutingItinerary.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x2330bdc9f1e0de2aL


# instance fields
.field private duration:J

.field private durationFactor:F

.field private endTime:Ljava/util/Date;

.field private feedIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private fetchDate:Ljava/util/Date;

.field private itineraryIndex:I

.field private legs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingLeg;",
            ">;"
        }
    .end annotation
.end field

.field private startTime:Ljava/util/Date;

.field private transitDuration:J

.field private waitingDuration:D

.field private walkingDistance:D

.field private walkingDuration:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->legs:Ljava/util/List;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->feedIds:Ljava/util/List;

    .line 33
    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 10
    instance-of v0, p1, Lcom/thetransitapp/droid/model/RoutingItinerary;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 17
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 10
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_0

    const/4 v13, 0x1

    :goto_0
    return v13

    :cond_0
    move-object/from16 v0, p1

    instance-of v13, v0, Lcom/thetransitapp/droid/model/RoutingItinerary;

    if-nez v13, :cond_1

    const/4 v13, 0x0

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/thetransitapp/droid/model/RoutingItinerary;

    .local v2, "other":Lcom/thetransitapp/droid/model/RoutingItinerary;
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->canEqual(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    const/4 v13, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getDuration()J

    move-result-wide v13

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getDuration()J

    move-result-wide v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_3

    const/4 v13, 0x0

    goto :goto_0

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getStartTime()Ljava/util/Date;

    move-result-object v12

    .local v12, "this$startTime":Ljava/util/Date;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getStartTime()Ljava/util/Date;

    move-result-object v7

    .local v7, "other$startTime":Ljava/util/Date;
    if-nez v12, :cond_5

    if-eqz v7, :cond_6

    :cond_4
    const/4 v13, 0x0

    goto :goto_0

    :cond_5
    invoke-virtual {v12, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getEndTime()Ljava/util/Date;

    move-result-object v8

    .local v8, "this$endTime":Ljava/util/Date;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getEndTime()Ljava/util/Date;

    move-result-object v3

    .local v3, "other$endTime":Ljava/util/Date;
    if-nez v8, :cond_8

    if-eqz v3, :cond_9

    :cond_7
    const/4 v13, 0x0

    goto :goto_0

    :cond_8
    invoke-virtual {v8, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getFetchDate()Ljava/util/Date;

    move-result-object v10

    .local v10, "this$fetchDate":Ljava/util/Date;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getFetchDate()Ljava/util/Date;

    move-result-object v5

    .local v5, "other$fetchDate":Ljava/util/Date;
    if-nez v10, :cond_b

    if-eqz v5, :cond_c

    :cond_a
    const/4 v13, 0x0

    goto :goto_0

    :cond_b
    invoke-virtual {v10, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getDurationFactor()F

    move-result v13

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getDurationFactor()F

    move-result v14

    invoke-static {v13, v14}, Ljava/lang/Float;->compare(FF)I

    move-result v13

    if-eqz v13, :cond_d

    const/4 v13, 0x0

    goto :goto_0

    :cond_d
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getItineraryIndex()I

    move-result v13

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getItineraryIndex()I

    move-result v14

    if-eq v13, v14, :cond_e

    const/4 v13, 0x0

    goto :goto_0

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getTransitDuration()J

    move-result-wide v13

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getTransitDuration()J

    move-result-wide v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_f

    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_f
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWalkingDuration()J

    move-result-wide v13

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWalkingDuration()J

    move-result-wide v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_10

    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWaitingDuration()D

    move-result-wide v13

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWaitingDuration()D

    move-result-wide v15

    invoke-static/range {v13 .. v16}, Ljava/lang/Double;->compare(DD)I

    move-result v13

    if-eqz v13, :cond_11

    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWalkingDistance()D

    move-result-wide v13

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWalkingDistance()D

    move-result-wide v15

    invoke-static/range {v13 .. v16}, Ljava/lang/Double;->compare(DD)I

    move-result v13

    if-eqz v13, :cond_12

    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v11

    .local v11, "this$legs":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v6

    .local v6, "other$legs":Ljava/util/List;
    if-nez v11, :cond_14

    if-eqz v6, :cond_15

    :cond_13
    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_14
    invoke-virtual {v11, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    :cond_15
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getFeedIds()Ljava/util/List;

    move-result-object v9

    .local v9, "this$feedIds":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getFeedIds()Ljava/util/List;

    move-result-object v4

    .local v4, "other$feedIds":Ljava/util/List;
    if-nez v9, :cond_17

    if-eqz v4, :cond_18

    :cond_16
    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_17
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_16

    :cond_18
    const/4 v13, 0x1

    goto/16 :goto_0
.end method

.method public getDuration()J
    .locals 2

    .prologue
    .line 10
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->duration:J

    return-wide v0
.end method

.method public getDurationFactor()F
    .locals 1

    .prologue
    .line 10
    iget v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->durationFactor:F

    return v0
.end method

.method public getEndTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->endTime:Ljava/util/Date;

    return-object v0
.end method

.method public getFeedIds()Ljava/util/List;
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
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->feedIds:Ljava/util/List;

    return-object v0
.end method

.method public getFetchDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->fetchDate:Ljava/util/Date;

    return-object v0
.end method

.method public getItineraryIndex()I
    .locals 1

    .prologue
    .line 10
    iget v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->itineraryIndex:I

    return v0
.end method

.method public getLegs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingLeg;",
            ">;"
        }
    .end annotation

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->legs:Ljava/util/List;

    return-object v0
.end method

.method public getStartTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->startTime:Ljava/util/Date;

    return-object v0
.end method

.method public getTransitDuration()J
    .locals 2

    .prologue
    .line 10
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->transitDuration:J

    return-wide v0
.end method

.method public getWaitingDuration()D
    .locals 2

    .prologue
    .line 10
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->waitingDuration:D

    return-wide v0
.end method

.method public getWalkingDistance()D
    .locals 2

    .prologue
    .line 10
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->walkingDistance:D

    return-wide v0
.end method

.method public getWalkingDuration()J
    .locals 2

    .prologue
    .line 10
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->walkingDuration:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 22

    .prologue
    .line 10
    const/16 v17, 0x1f

    .local v17, "PRIME":I
    const/16 v18, 0x1

    .local v18, "result":I
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getDuration()J

    move-result-wide v2

    .local v2, "$duration":J
    const/16 v19, 0x20

    ushr-long v19, v2, v19

    xor-long v19, v19, v2

    move-wide/from16 v0, v19

    long-to-int v0, v0

    move/from16 v19, v0

    add-int/lit8 v18, v19, 0x1f

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getStartTime()Ljava/util/Date;

    move-result-object v8

    .local v8, "$startTime":Ljava/util/Date;
    mul-int/lit8 v20, v18, 0x1f

    if-nez v8, :cond_0

    const/16 v19, 0x0

    :goto_0
    add-int v18, v20, v19

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getEndTime()Ljava/util/Date;

    move-result-object v4

    .local v4, "$endTime":Ljava/util/Date;
    mul-int/lit8 v20, v18, 0x1f

    if-nez v4, :cond_1

    const/16 v19, 0x0

    :goto_1
    add-int v18, v20, v19

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getFetchDate()Ljava/util/Date;

    move-result-object v6

    .local v6, "$fetchDate":Ljava/util/Date;
    mul-int/lit8 v20, v18, 0x1f

    if-nez v6, :cond_2

    const/16 v19, 0x0

    :goto_2
    add-int v18, v20, v19

    mul-int/lit8 v19, v18, 0x1f

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getDurationFactor()F

    move-result v20

    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v20

    add-int v18, v19, v20

    mul-int/lit8 v19, v18, 0x1f

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getItineraryIndex()I

    move-result v20

    add-int v18, v19, v20

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getTransitDuration()J

    move-result-wide v9

    .local v9, "$transitDuration":J
    mul-int/lit8 v19, v18, 0x1f

    const/16 v20, 0x20

    ushr-long v20, v9, v20

    xor-long v20, v20, v9

    move-wide/from16 v0, v20

    long-to-int v0, v0

    move/from16 v20, v0

    add-int v18, v19, v20

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWalkingDuration()J

    move-result-wide v15

    .local v15, "$walkingDuration":J
    mul-int/lit8 v19, v18, 0x1f

    const/16 v20, 0x20

    ushr-long v20, v15, v20

    xor-long v20, v20, v15

    move-wide/from16 v0, v20

    long-to-int v0, v0

    move/from16 v20, v0

    add-int v18, v19, v20

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWaitingDuration()D

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v11

    .local v11, "$waitingDuration":J
    mul-int/lit8 v19, v18, 0x1f

    const/16 v20, 0x20

    ushr-long v20, v11, v20

    xor-long v20, v20, v11

    move-wide/from16 v0, v20

    long-to-int v0, v0

    move/from16 v20, v0

    add-int v18, v19, v20

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWalkingDistance()D

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v13

    .local v13, "$walkingDistance":J
    mul-int/lit8 v19, v18, 0x1f

    const/16 v20, 0x20

    ushr-long v20, v13, v20

    xor-long v20, v20, v13

    move-wide/from16 v0, v20

    long-to-int v0, v0

    move/from16 v20, v0

    add-int v18, v19, v20

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v7

    .local v7, "$legs":Ljava/util/List;
    mul-int/lit8 v20, v18, 0x1f

    if-nez v7, :cond_3

    const/16 v19, 0x0

    :goto_3
    add-int v18, v20, v19

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getFeedIds()Ljava/util/List;

    move-result-object v5

    .local v5, "$feedIds":Ljava/util/List;
    mul-int/lit8 v20, v18, 0x1f

    if-nez v5, :cond_4

    const/16 v19, 0x0

    :goto_4
    add-int v18, v20, v19

    return v18

    .end local v4    # "$endTime":Ljava/util/Date;
    .end local v5    # "$feedIds":Ljava/util/List;
    .end local v6    # "$fetchDate":Ljava/util/Date;
    .end local v7    # "$legs":Ljava/util/List;
    .end local v9    # "$transitDuration":J
    .end local v11    # "$waitingDuration":J
    .end local v13    # "$walkingDistance":J
    .end local v15    # "$walkingDuration":J
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    move-result v19

    goto/16 :goto_0

    .restart local v4    # "$endTime":Ljava/util/Date;
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v19

    goto/16 :goto_1

    .restart local v6    # "$fetchDate":Ljava/util/Date;
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v19

    goto/16 :goto_2

    .restart local v7    # "$legs":Ljava/util/List;
    .restart local v9    # "$transitDuration":J
    .restart local v11    # "$waitingDuration":J
    .restart local v13    # "$walkingDistance":J
    .restart local v15    # "$walkingDuration":J
    :cond_3
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v19

    goto :goto_3

    .restart local v5    # "$feedIds":Ljava/util/List;
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v19

    goto :goto_4
.end method

.method public setDuration(J)V
    .locals 0
    .param p1, "duration"    # J

    .prologue
    .line 10
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->duration:J

    return-void
.end method

.method public setDurationFactor(F)V
    .locals 0
    .param p1, "durationFactor"    # F

    .prologue
    .line 10
    iput p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->durationFactor:F

    return-void
.end method

.method public setEndTime(Ljava/util/Date;)V
    .locals 0
    .param p1, "endTime"    # Ljava/util/Date;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->endTime:Ljava/util/Date;

    return-void
.end method

.method public setFeedIds(Ljava/util/List;)V
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
    .line 10
    .local p1, "feedIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->feedIds:Ljava/util/List;

    return-void
.end method

.method public setFetchDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "fetchDate"    # Ljava/util/Date;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->fetchDate:Ljava/util/Date;

    return-void
.end method

.method public setItineraryIndex(I)V
    .locals 0
    .param p1, "itineraryIndex"    # I

    .prologue
    .line 10
    iput p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->itineraryIndex:I

    return-void
.end method

.method public setLegs(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingLeg;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 10
    .local p1, "legs":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/RoutingLeg;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->legs:Ljava/util/List;

    return-void
.end method

.method public setStartTime(Ljava/util/Date;)V
    .locals 0
    .param p1, "startTime"    # Ljava/util/Date;

    .prologue
    .line 10
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->startTime:Ljava/util/Date;

    return-void
.end method

.method public setTransitDuration(J)V
    .locals 0
    .param p1, "transitDuration"    # J

    .prologue
    .line 10
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->transitDuration:J

    return-void
.end method

.method public setWaitingDuration(D)V
    .locals 0
    .param p1, "waitingDuration"    # D

    .prologue
    .line 10
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->waitingDuration:D

    return-void
.end method

.method public setWalkingDistance(D)V
    .locals 0
    .param p1, "walkingDistance"    # D

    .prologue
    .line 10
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->walkingDistance:D

    return-void
.end method

.method public setWalkingDuration(J)V
    .locals 0
    .param p1, "walkingDuration"    # J

    .prologue
    .line 10
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingItinerary;->walkingDuration:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RoutingItinerary(duration="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getDuration()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getStartTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getEndTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fetchDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getFetchDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", durationFactor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getDurationFactor()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", itineraryIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getItineraryIndex()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", transitDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getTransitDuration()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", walkingDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWalkingDuration()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", waitingDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWaitingDuration()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", walkingDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getWalkingDistance()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", legs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", feedIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getFeedIds()Ljava/util/List;

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
