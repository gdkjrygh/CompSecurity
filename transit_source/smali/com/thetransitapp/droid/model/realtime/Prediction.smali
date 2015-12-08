.class public Lcom/thetransitapp/droid/model/realtime/Prediction;
.super Ljava/lang/Object;
.source "Prediction.java"


# instance fields
.field branch:Ljava/lang/String;

.field cancelled:Z

.field delay:D

.field directionTag:Ljava/lang/String;

.field scheduleBased:Z

.field stopTime:Ljava/util/Date;

.field tripHeadsign:Ljava/lang/String;

.field tripID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 7
    instance-of v0, p1, Lcom/thetransitapp/droid/model/realtime/Prediction;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 17
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 7
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_0

    const/4 v13, 0x1

    :goto_0
    return v13

    :cond_0
    move-object/from16 v0, p1

    instance-of v13, v0, Lcom/thetransitapp/droid/model/realtime/Prediction;

    if-nez v13, :cond_1

    const/4 v13, 0x0

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/thetransitapp/droid/model/realtime/Prediction;

    .local v2, "other":Lcom/thetransitapp/droid/model/realtime/Prediction;
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->canEqual(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    const/4 v13, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getStopTime()Ljava/util/Date;

    move-result-object v10

    .local v10, "this$stopTime":Ljava/util/Date;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getStopTime()Ljava/util/Date;

    move-result-object v5

    .local v5, "other$stopTime":Ljava/util/Date;
    if-nez v10, :cond_4

    if-eqz v5, :cond_5

    :cond_3
    const/4 v13, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {v10, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getDelay()D

    move-result-wide v13

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getDelay()D

    move-result-wide v15

    invoke-static/range {v13 .. v16}, Ljava/lang/Double;->compare(DD)I

    move-result v13

    if-eqz v13, :cond_6

    const/4 v13, 0x0

    goto :goto_0

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->isScheduleBased()Z

    move-result v13

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->isScheduleBased()Z

    move-result v14

    if-eq v13, v14, :cond_7

    const/4 v13, 0x0

    goto :goto_0

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->isCancelled()Z

    move-result v13

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->isCancelled()Z

    move-result v14

    if-eq v13, v14, :cond_8

    const/4 v13, 0x0

    goto :goto_0

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripHeadsign()Ljava/lang/String;

    move-result-object v11

    .local v11, "this$tripHeadsign":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripHeadsign()Ljava/lang/String;

    move-result-object v6

    .local v6, "other$tripHeadsign":Ljava/lang/String;
    if-nez v11, :cond_a

    if-eqz v6, :cond_b

    :cond_9
    const/4 v13, 0x0

    goto :goto_0

    :cond_a
    invoke-virtual {v11, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getDirectionTag()Ljava/lang/String;

    move-result-object v9

    .local v9, "this$directionTag":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getDirectionTag()Ljava/lang/String;

    move-result-object v4

    .local v4, "other$directionTag":Ljava/lang/String;
    if-nez v9, :cond_d

    if-eqz v4, :cond_e

    :cond_c
    const/4 v13, 0x0

    goto :goto_0

    :cond_d
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getBranch()Ljava/lang/String;

    move-result-object v8

    .local v8, "this$branch":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getBranch()Ljava/lang/String;

    move-result-object v3

    .local v3, "other$branch":Ljava/lang/String;
    if-nez v8, :cond_10

    if-eqz v3, :cond_11

    :cond_f
    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_10
    invoke-virtual {v8, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripID()Ljava/lang/String;

    move-result-object v12

    .local v12, "this$tripID":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripID()Ljava/lang/String;

    move-result-object v7

    .local v7, "other$tripID":Ljava/lang/String;
    if-nez v12, :cond_13

    if-eqz v7, :cond_14

    :cond_12
    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_13
    invoke-virtual {v12, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_12

    :cond_14
    const/4 v13, 0x1

    goto/16 :goto_0
.end method

.method public getBranch()Ljava/lang/String;
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->branch:Ljava/lang/String;

    return-object v0
.end method

.method public getDelay()D
    .locals 2

    .prologue
    .line 7
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->delay:D

    return-wide v0
.end method

.method public getDirectionTag()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->directionTag:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 22
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->directionTag:Ljava/lang/String;

    .line 23
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->tripHeadsign:Ljava/lang/String;

    goto :goto_0
.end method

.method public getStopTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->stopTime:Ljava/util/Date;

    return-object v0
.end method

.method public getTripHeadsign()Ljava/lang/String;
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->tripHeadsign:Ljava/lang/String;

    return-object v0
.end method

.method public getTripID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 7
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->tripID:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 15

    .prologue
    const/16 v12, 0x4d5

    const/16 v11, 0x4cf

    const/4 v10, 0x0

    .line 7
    const/16 v7, 0x1f

    .local v7, "PRIME":I
    const/4 v8, 0x1

    .local v8, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getStopTime()Ljava/util/Date;

    move-result-object v4

    .local v4, "$stopTime":Ljava/util/Date;
    if-nez v4, :cond_0

    move v9, v10

    :goto_0
    add-int/lit8 v8, v9, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getDelay()D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    .local v1, "$delay":J
    mul-int/lit8 v9, v8, 0x1f

    const/16 v13, 0x20

    ushr-long v13, v1, v13

    xor-long/2addr v13, v1

    long-to-int v13, v13

    add-int v8, v9, v13

    mul-int/lit8 v13, v8, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->isScheduleBased()Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v11

    :goto_1
    add-int v8, v13, v9

    mul-int/lit8 v9, v8, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->isCancelled()Z

    move-result v13

    if-eqz v13, :cond_2

    :goto_2
    add-int v8, v9, v11

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripHeadsign()Ljava/lang/String;

    move-result-object v5

    .local v5, "$tripHeadsign":Ljava/lang/String;
    mul-int/lit8 v11, v8, 0x1f

    if-nez v5, :cond_3

    move v9, v10

    :goto_3
    add-int v8, v11, v9

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getDirectionTag()Ljava/lang/String;

    move-result-object v3

    .local v3, "$directionTag":Ljava/lang/String;
    mul-int/lit8 v11, v8, 0x1f

    if-nez v3, :cond_4

    move v9, v10

    :goto_4
    add-int v8, v11, v9

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getBranch()Ljava/lang/String;

    move-result-object v0

    .local v0, "$branch":Ljava/lang/String;
    mul-int/lit8 v11, v8, 0x1f

    if-nez v0, :cond_5

    move v9, v10

    :goto_5
    add-int v8, v11, v9

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripID()Ljava/lang/String;

    move-result-object v6

    .local v6, "$tripID":Ljava/lang/String;
    mul-int/lit8 v9, v8, 0x1f

    if-nez v6, :cond_6

    :goto_6
    add-int v8, v9, v10

    return v8

    .end local v0    # "$branch":Ljava/lang/String;
    .end local v1    # "$delay":J
    .end local v3    # "$directionTag":Ljava/lang/String;
    .end local v5    # "$tripHeadsign":Ljava/lang/String;
    .end local v6    # "$tripID":Ljava/lang/String;
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v9

    goto :goto_0

    .restart local v1    # "$delay":J
    :cond_1
    move v9, v12

    goto :goto_1

    :cond_2
    move v11, v12

    goto :goto_2

    .restart local v5    # "$tripHeadsign":Ljava/lang/String;
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v9

    goto :goto_3

    .restart local v3    # "$directionTag":Ljava/lang/String;
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v9

    goto :goto_4

    .restart local v0    # "$branch":Ljava/lang/String;
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v9

    goto :goto_5

    .restart local v6    # "$tripID":Ljava/lang/String;
    :cond_6
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_6
.end method

.method public isCancelled()Z
    .locals 1

    .prologue
    .line 7
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->cancelled:Z

    return v0
.end method

.method public isScheduleBased()Z
    .locals 1

    .prologue
    .line 7
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->scheduleBased:Z

    return v0
.end method

.method public setBranch(Ljava/lang/String;)V
    .locals 0
    .param p1, "branch"    # Ljava/lang/String;

    .prologue
    .line 7
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->branch:Ljava/lang/String;

    return-void
.end method

.method public setCancelled(Z)V
    .locals 0
    .param p1, "cancelled"    # Z

    .prologue
    .line 7
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->cancelled:Z

    return-void
.end method

.method public setDelay(D)V
    .locals 0
    .param p1, "delay"    # D

    .prologue
    .line 7
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->delay:D

    return-void
.end method

.method public setDirectionTag(Ljava/lang/String;)V
    .locals 0
    .param p1, "directionTag"    # Ljava/lang/String;

    .prologue
    .line 7
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->directionTag:Ljava/lang/String;

    return-void
.end method

.method public setScheduleBased(Z)V
    .locals 0
    .param p1, "scheduleBased"    # Z

    .prologue
    .line 7
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->scheduleBased:Z

    return-void
.end method

.method public setStopTime(Ljava/util/Date;)V
    .locals 0
    .param p1, "stopTime"    # Ljava/util/Date;

    .prologue
    .line 7
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->stopTime:Ljava/util/Date;

    return-void
.end method

.method public setTripHeadsign(Ljava/lang/String;)V
    .locals 0
    .param p1, "tripHeadsign"    # Ljava/lang/String;

    .prologue
    .line 7
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->tripHeadsign:Ljava/lang/String;

    return-void
.end method

.method public setTripID(Ljava/lang/String;)V
    .locals 0
    .param p1, "tripID"    # Ljava/lang/String;

    .prologue
    .line 7
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/Prediction;->tripID:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Prediction(stopTime="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getStopTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", delay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getDelay()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scheduleBased="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->isScheduleBased()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cancelled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->isCancelled()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tripHeadsign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripHeadsign()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", directionTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getDirectionTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", branch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getBranch()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tripID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getTripID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
