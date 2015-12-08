.class public Lcom/thetransitapp/droid/model/NearbyRoutesRequest;
.super Ljava/lang/Object;
.source "NearbyRoutesRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x153e5f82217bc7cL


# instance fields
.field private bannedModesParameter:Ljava/lang/String;

.field private cancelled:Z

.field private error:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field private errorMessage:Ljava/lang/String;

.field private errorTitle:Ljava/lang/String;

.field private fetchDate:Ljava/util/Date;

.field private fetchIsFromServer:Z

.field private finished:Z

.field private hudStatus:Ljava/lang/String;

.field private inactiveRoutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route;",
            ">;"
        }
    .end annotation
.end field

.field private loadInactives:Z

.field private locked:Z

.field private placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

.field private routes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route;",
            ">;"
        }
    .end annotation
.end field

.field private running:Z

.field private shouldExitTripPlanner:Z

.field private shouldLoadInBackground:Z

.field private shouldPopToEmptyMapViewFirst:Z

.field private shouldPushRoutesViewOnCompletion:Z

.field private shouldRefreshLocalFeedsFirst:Z

.field private shouldResetContentOffset:Z

.field private shouldRestoreIfPossible:Z

.field private shouldScrollToResults:Z

.field private warning:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 9
    instance-of v0, p1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 25
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 9
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_0

    const/16 v23, 0x1

    :goto_0
    return v23

    :cond_0
    move-object/from16 v0, p1

    instance-of v0, v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    move/from16 v23, v0

    if-nez v23, :cond_1

    const/16 v23, 0x0

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;

    .local v2, "other":Lcom/thetransitapp/droid/model/NearbyRoutesRequest;
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->canEqual(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_2

    const/16 v23, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v20

    .local v20, "this$placemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v10

    .local v10, "other$placemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    if-nez v20, :cond_4

    if-eqz v10, :cond_5

    :cond_3
    const/16 v23, 0x0

    goto :goto_0

    :cond_4
    move-object/from16 v0, v20

    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLoadInactives()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLoadInactives()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_6

    const/16 v23, 0x0

    goto :goto_0

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getHudStatus()Ljava/lang/String;

    move-result-object v18

    .local v18, "this$hudStatus":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getHudStatus()Ljava/lang/String;

    move-result-object v8

    .local v8, "other$hudStatus":Ljava/lang/String;
    if-nez v18, :cond_8

    if-eqz v8, :cond_9

    :cond_7
    const/16 v23, 0x0

    goto :goto_0

    :cond_8
    move-object/from16 v0, v18

    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_7

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getBannedModesParameter()Ljava/lang/String;

    move-result-object v13

    .local v13, "this$bannedModesParameter":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getBannedModesParameter()Ljava/lang/String;

    move-result-object v3

    .local v3, "other$bannedModesParameter":Ljava/lang/String;
    if-nez v13, :cond_b

    if-eqz v3, :cond_c

    :cond_a
    const/16 v23, 0x0

    goto :goto_0

    :cond_b
    invoke-virtual {v13, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_a

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getFetchDate()Ljava/util/Date;

    move-result-object v17

    .local v17, "this$fetchDate":Ljava/util/Date;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getFetchDate()Ljava/util/Date;

    move-result-object v7

    .local v7, "other$fetchDate":Ljava/util/Date;
    if-nez v17, :cond_e

    if-eqz v7, :cond_f

    :cond_d
    const/16 v23, 0x0

    goto :goto_0

    :cond_e
    move-object/from16 v0, v17

    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_d

    :cond_f
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getRoutes()Ljava/util/List;

    move-result-object v21

    .local v21, "this$routes":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getRoutes()Ljava/util/List;

    move-result-object v11

    .local v11, "other$routes":Ljava/util/List;
    if-nez v21, :cond_11

    if-eqz v11, :cond_12

    :cond_10
    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_11
    move-object/from16 v0, v21

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_10

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getInactiveRoutes()Ljava/util/List;

    move-result-object v19

    .local v19, "this$inactiveRoutes":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getInactiveRoutes()Ljava/util/List;

    move-result-object v9

    .local v9, "other$inactiveRoutes":Ljava/util/List;
    if-nez v19, :cond_14

    if-eqz v9, :cond_15

    :cond_13
    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_14
    move-object/from16 v0, v19

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_13

    :cond_15
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getError()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v14

    .local v14, "this$error":Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getError()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v4

    .local v4, "other$error":Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    if-nez v14, :cond_17

    if-eqz v4, :cond_18

    :cond_16
    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_17
    invoke-virtual {v14, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_16

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getErrorTitle()Ljava/lang/String;

    move-result-object v16

    .local v16, "this$errorTitle":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getErrorTitle()Ljava/lang/String;

    move-result-object v6

    .local v6, "other$errorTitle":Ljava/lang/String;
    if-nez v16, :cond_1a

    if-eqz v6, :cond_1b

    :cond_19
    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_1a
    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_19

    :cond_1b
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getErrorMessage()Ljava/lang/String;

    move-result-object v15

    .local v15, "this$errorMessage":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getErrorMessage()Ljava/lang/String;

    move-result-object v5

    .local v5, "other$errorMessage":Ljava/lang/String;
    if-nez v15, :cond_1d

    if-eqz v5, :cond_1e

    :cond_1c
    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_1d
    invoke-virtual {v15, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1c

    :cond_1e
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getWarning()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v22

    .local v22, "this$warning":Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getWarning()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v12

    .local v12, "other$warning":Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    if-nez v22, :cond_20

    if-eqz v12, :cond_21

    :cond_1f
    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_20
    move-object/from16 v0, v22

    invoke-virtual {v0, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1f

    :cond_21
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldRestoreIfPossible()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldRestoreIfPossible()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_22

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_22
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldPopToEmptyMapViewFirst()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldPopToEmptyMapViewFirst()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_23

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_23
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldRefreshLocalFeedsFirst()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldRefreshLocalFeedsFirst()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_24

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_24
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldLoadInBackground()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldLoadInBackground()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_25

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_25
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldExitTripPlanner()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldExitTripPlanner()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_26

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_26
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldPushRoutesViewOnCompletion()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldPushRoutesViewOnCompletion()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_27

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_27
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldResetContentOffset()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldResetContentOffset()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_28

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_28
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldScrollToResults()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldScrollToResults()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_29

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_29
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLocked()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLocked()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_2a

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_2a
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isRunning()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isRunning()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_2b

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_2b
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isFinished()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isFinished()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_2c

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_2c
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isCancelled()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isCancelled()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_2d

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_2d
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isFetchIsFromServer()Z

    move-result v23

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isFetchIsFromServer()Z

    move-result v24

    move/from16 v0, v23

    move/from16 v1, v24

    if-eq v0, v1, :cond_2e

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_2e
    const/16 v23, 0x1

    goto/16 :goto_0
.end method

.method public getBannedModesParameter()Ljava/lang/String;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->bannedModesParameter:Ljava/lang/String;

    return-object v0
.end method

.method public getError()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->error:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    return-object v0
.end method

.method public getErrorMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->errorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getFetchDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->fetchDate:Ljava/util/Date;

    return-object v0
.end method

.method public getHudStatus()Ljava/lang/String;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->hudStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getInactiveRoutes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route;",
            ">;"
        }
    .end annotation

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->inactiveRoutes:Ljava/util/List;

    return-object v0
.end method

.method public getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-object v0
.end method

.method public getRoutes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route;",
            ">;"
        }
    .end annotation

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->routes:Ljava/util/List;

    return-object v0
.end method

.method public getWarning()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->warning:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    return-object v0
.end method

.method public hashCode()I
    .locals 14

    .prologue
    .line 9
    const/16 v10, 0x1f

    .local v10, "PRIME":I
    const/4 v11, 0x1

    .local v11, "result":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v7

    .local v7, "$placemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    if-nez v7, :cond_0

    const/4 v12, 0x0

    :goto_0
    add-int/lit8 v11, v12, 0x1f

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLoadInactives()Z

    move-result v12

    if-eqz v12, :cond_1

    const/16 v12, 0x4cf

    :goto_1
    add-int v11, v13, v12

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getHudStatus()Ljava/lang/String;

    move-result-object v5

    .local v5, "$hudStatus":Ljava/lang/String;
    mul-int/lit8 v13, v11, 0x1f

    if-nez v5, :cond_2

    const/4 v12, 0x0

    :goto_2
    add-int v11, v13, v12

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getBannedModesParameter()Ljava/lang/String;

    move-result-object v0

    .local v0, "$bannedModesParameter":Ljava/lang/String;
    mul-int/lit8 v13, v11, 0x1f

    if-nez v0, :cond_3

    const/4 v12, 0x0

    :goto_3
    add-int v11, v13, v12

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getFetchDate()Ljava/util/Date;

    move-result-object v4

    .local v4, "$fetchDate":Ljava/util/Date;
    mul-int/lit8 v13, v11, 0x1f

    if-nez v4, :cond_4

    const/4 v12, 0x0

    :goto_4
    add-int v11, v13, v12

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getRoutes()Ljava/util/List;

    move-result-object v8

    .local v8, "$routes":Ljava/util/List;
    mul-int/lit8 v13, v11, 0x1f

    if-nez v8, :cond_5

    const/4 v12, 0x0

    :goto_5
    add-int v11, v13, v12

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getInactiveRoutes()Ljava/util/List;

    move-result-object v6

    .local v6, "$inactiveRoutes":Ljava/util/List;
    mul-int/lit8 v13, v11, 0x1f

    if-nez v6, :cond_6

    const/4 v12, 0x0

    :goto_6
    add-int v11, v13, v12

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getError()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v1

    .local v1, "$error":Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    mul-int/lit8 v13, v11, 0x1f

    if-nez v1, :cond_7

    const/4 v12, 0x0

    :goto_7
    add-int v11, v13, v12

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getErrorTitle()Ljava/lang/String;

    move-result-object v3

    .local v3, "$errorTitle":Ljava/lang/String;
    mul-int/lit8 v13, v11, 0x1f

    if-nez v3, :cond_8

    const/4 v12, 0x0

    :goto_8
    add-int v11, v13, v12

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    .local v2, "$errorMessage":Ljava/lang/String;
    mul-int/lit8 v13, v11, 0x1f

    if-nez v2, :cond_9

    const/4 v12, 0x0

    :goto_9
    add-int v11, v13, v12

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getWarning()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v9

    .local v9, "$warning":Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    mul-int/lit8 v13, v11, 0x1f

    if-nez v9, :cond_a

    const/4 v12, 0x0

    :goto_a
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldRestoreIfPossible()Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x4cf

    :goto_b
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldPopToEmptyMapViewFirst()Z

    move-result v12

    if-eqz v12, :cond_c

    const/16 v12, 0x4cf

    :goto_c
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldRefreshLocalFeedsFirst()Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4cf

    :goto_d
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldLoadInBackground()Z

    move-result v12

    if-eqz v12, :cond_e

    const/16 v12, 0x4cf

    :goto_e
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldExitTripPlanner()Z

    move-result v12

    if-eqz v12, :cond_f

    const/16 v12, 0x4cf

    :goto_f
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldPushRoutesViewOnCompletion()Z

    move-result v12

    if-eqz v12, :cond_10

    const/16 v12, 0x4cf

    :goto_10
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldResetContentOffset()Z

    move-result v12

    if-eqz v12, :cond_11

    const/16 v12, 0x4cf

    :goto_11
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldScrollToResults()Z

    move-result v12

    if-eqz v12, :cond_12

    const/16 v12, 0x4cf

    :goto_12
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLocked()Z

    move-result v12

    if-eqz v12, :cond_13

    const/16 v12, 0x4cf

    :goto_13
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isRunning()Z

    move-result v12

    if-eqz v12, :cond_14

    const/16 v12, 0x4cf

    :goto_14
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isFinished()Z

    move-result v12

    if-eqz v12, :cond_15

    const/16 v12, 0x4cf

    :goto_15
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isCancelled()Z

    move-result v12

    if-eqz v12, :cond_16

    const/16 v12, 0x4cf

    :goto_16
    add-int v11, v13, v12

    mul-int/lit8 v13, v11, 0x1f

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isFetchIsFromServer()Z

    move-result v12

    if-eqz v12, :cond_17

    const/16 v12, 0x4cf

    :goto_17
    add-int v11, v13, v12

    return v11

    .end local v0    # "$bannedModesParameter":Ljava/lang/String;
    .end local v1    # "$error":Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    .end local v2    # "$errorMessage":Ljava/lang/String;
    .end local v3    # "$errorTitle":Ljava/lang/String;
    .end local v4    # "$fetchDate":Ljava/util/Date;
    .end local v5    # "$hudStatus":Ljava/lang/String;
    .end local v6    # "$inactiveRoutes":Ljava/util/List;
    .end local v8    # "$routes":Ljava/util/List;
    .end local v9    # "$warning":Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto/16 :goto_0

    :cond_1
    const/16 v12, 0x4d5

    goto/16 :goto_1

    .restart local v5    # "$hudStatus":Ljava/lang/String;
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto/16 :goto_2

    .restart local v0    # "$bannedModesParameter":Ljava/lang/String;
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto/16 :goto_3

    .restart local v4    # "$fetchDate":Ljava/util/Date;
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto/16 :goto_4

    .restart local v8    # "$routes":Ljava/util/List;
    :cond_5
    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto/16 :goto_5

    .restart local v6    # "$inactiveRoutes":Ljava/util/List;
    :cond_6
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto/16 :goto_6

    .restart local v1    # "$error":Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto/16 :goto_7

    .restart local v3    # "$errorTitle":Ljava/lang/String;
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto/16 :goto_8

    .restart local v2    # "$errorMessage":Ljava/lang/String;
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto/16 :goto_9

    .restart local v9    # "$warning":Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    :cond_a
    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    move-result v12

    goto/16 :goto_a

    :cond_b
    const/16 v12, 0x4d5

    goto/16 :goto_b

    :cond_c
    const/16 v12, 0x4d5

    goto/16 :goto_c

    :cond_d
    const/16 v12, 0x4d5

    goto/16 :goto_d

    :cond_e
    const/16 v12, 0x4d5

    goto/16 :goto_e

    :cond_f
    const/16 v12, 0x4d5

    goto/16 :goto_f

    :cond_10
    const/16 v12, 0x4d5

    goto/16 :goto_10

    :cond_11
    const/16 v12, 0x4d5

    goto/16 :goto_11

    :cond_12
    const/16 v12, 0x4d5

    goto/16 :goto_12

    :cond_13
    const/16 v12, 0x4d5

    goto/16 :goto_13

    :cond_14
    const/16 v12, 0x4d5

    goto/16 :goto_14

    :cond_15
    const/16 v12, 0x4d5

    goto/16 :goto_15

    :cond_16
    const/16 v12, 0x4d5

    goto :goto_16

    :cond_17
    const/16 v12, 0x4d5

    goto :goto_17
.end method

.method public isCancelled()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->cancelled:Z

    return v0
.end method

.method public isFetchIsFromServer()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->fetchIsFromServer:Z

    return v0
.end method

.method public isFinished()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->finished:Z

    return v0
.end method

.method public isLoadInactives()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->loadInactives:Z

    return v0
.end method

.method public isLocked()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->locked:Z

    return v0
.end method

.method public isRunning()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->running:Z

    return v0
.end method

.method public isShouldExitTripPlanner()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldExitTripPlanner:Z

    return v0
.end method

.method public isShouldLoadInBackground()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldLoadInBackground:Z

    return v0
.end method

.method public isShouldPopToEmptyMapViewFirst()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldPopToEmptyMapViewFirst:Z

    return v0
.end method

.method public isShouldPushRoutesViewOnCompletion()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldPushRoutesViewOnCompletion:Z

    return v0
.end method

.method public isShouldRefreshLocalFeedsFirst()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldRefreshLocalFeedsFirst:Z

    return v0
.end method

.method public isShouldResetContentOffset()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldResetContentOffset:Z

    return v0
.end method

.method public isShouldRestoreIfPossible()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldRestoreIfPossible:Z

    return v0
.end method

.method public isShouldScrollToResults()Z
    .locals 1

    .prologue
    .line 9
    iget-boolean v0, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldScrollToResults:Z

    return v0
.end method

.method public setBannedModesParameter(Ljava/lang/String;)V
    .locals 0
    .param p1, "bannedModesParameter"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->bannedModesParameter:Ljava/lang/String;

    return-void
.end method

.method public setCancelled(Z)V
    .locals 0
    .param p1, "cancelled"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->cancelled:Z

    return-void
.end method

.method public setError(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;)V
    .locals 0
    .param p1, "error"    # Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->error:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    return-void
.end method

.method public setErrorMessage(Ljava/lang/String;)V
    .locals 0
    .param p1, "errorMessage"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->errorMessage:Ljava/lang/String;

    return-void
.end method

.method public setErrorTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "errorTitle"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->errorTitle:Ljava/lang/String;

    return-void
.end method

.method public setFetchDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "fetchDate"    # Ljava/util/Date;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->fetchDate:Ljava/util/Date;

    return-void
.end method

.method public setFetchIsFromServer(Z)V
    .locals 0
    .param p1, "fetchIsFromServer"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->fetchIsFromServer:Z

    return-void
.end method

.method public setFinished(Z)V
    .locals 0
    .param p1, "finished"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->finished:Z

    return-void
.end method

.method public setHudStatus(Ljava/lang/String;)V
    .locals 0
    .param p1, "hudStatus"    # Ljava/lang/String;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->hudStatus:Ljava/lang/String;

    return-void
.end method

.method public setInactiveRoutes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 9
    .local p1, "inactiveRoutes":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Route;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->inactiveRoutes:Ljava/util/List;

    return-void
.end method

.method public setLoadInactives(Z)V
    .locals 0
    .param p1, "loadInactives"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->loadInactives:Z

    return-void
.end method

.method public setLocked(Z)V
    .locals 0
    .param p1, "locked"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->locked:Z

    return-void
.end method

.method public setPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    .locals 0
    .param p1, "placemark"    # Lcom/thetransitapp/droid/model/SimplePlacemark;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->placemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-void
.end method

.method public setRoutes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Route;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 9
    .local p1, "routes":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Route;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->routes:Ljava/util/List;

    return-void
.end method

.method public setRunning(Z)V
    .locals 0
    .param p1, "running"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->running:Z

    return-void
.end method

.method public setShouldExitTripPlanner(Z)V
    .locals 0
    .param p1, "shouldExitTripPlanner"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldExitTripPlanner:Z

    return-void
.end method

.method public setShouldLoadInBackground(Z)V
    .locals 0
    .param p1, "shouldLoadInBackground"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldLoadInBackground:Z

    return-void
.end method

.method public setShouldPopToEmptyMapViewFirst(Z)V
    .locals 0
    .param p1, "shouldPopToEmptyMapViewFirst"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldPopToEmptyMapViewFirst:Z

    return-void
.end method

.method public setShouldPushRoutesViewOnCompletion(Z)V
    .locals 0
    .param p1, "shouldPushRoutesViewOnCompletion"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldPushRoutesViewOnCompletion:Z

    return-void
.end method

.method public setShouldRefreshLocalFeedsFirst(Z)V
    .locals 0
    .param p1, "shouldRefreshLocalFeedsFirst"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldRefreshLocalFeedsFirst:Z

    return-void
.end method

.method public setShouldResetContentOffset(Z)V
    .locals 0
    .param p1, "shouldResetContentOffset"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldResetContentOffset:Z

    return-void
.end method

.method public setShouldRestoreIfPossible(Z)V
    .locals 0
    .param p1, "shouldRestoreIfPossible"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldRestoreIfPossible:Z

    return-void
.end method

.method public setShouldScrollToResults(Z)V
    .locals 0
    .param p1, "shouldScrollToResults"    # Z

    .prologue
    .line 9
    iput-boolean p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->shouldScrollToResults:Z

    return-void
.end method

.method public setWarning(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;)V
    .locals 0
    .param p1, "warning"    # Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    .prologue
    .line 9
    iput-object p1, p0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->warning:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NearbyRoutesRequest(placemark="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", loadInactives="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLoadInactives()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hudStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getHudStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bannedModesParameter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getBannedModesParameter()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fetchDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getFetchDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", routes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getRoutes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", inactiveRoutes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getInactiveRoutes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getError()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getErrorTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", warning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getWarning()Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldRestoreIfPossible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldRestoreIfPossible()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldPopToEmptyMapViewFirst="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldPopToEmptyMapViewFirst()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldRefreshLocalFeedsFirst="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldRefreshLocalFeedsFirst()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldLoadInBackground="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldLoadInBackground()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldExitTripPlanner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldExitTripPlanner()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldPushRoutesViewOnCompletion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldPushRoutesViewOnCompletion()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldResetContentOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldResetContentOffset()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldScrollToResults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isShouldScrollToResults()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", locked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLocked()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", running="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isRunning()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", finished="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isFinished()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cancelled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isCancelled()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fetchIsFromServer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isFetchIsFromServer()Z

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
