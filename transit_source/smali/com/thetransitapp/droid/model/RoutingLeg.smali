.class public Lcom/thetransitapp/droid/model/RoutingLeg;
.super Ljava/lang/Object;
.source "RoutingLeg.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/model/RoutingLeg$LegType;,
        Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x36d18ec4241297b3L


# instance fields
.field private distance:D

.field private duration:J

.field private endScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

.field private fromPlacemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

.field private headsign:Ljava/lang/String;

.field private intermediateStops:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Stop;",
            ">;"
        }
    .end annotation
.end field

.field private legSequence:I

.field private legType:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

.field private previousStopLatitude:D

.field private previousStopLongitude:D

.field private route:Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

.field private shape:Ljava/lang/String;

.field private startScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

.field private stepSubtitle:Ljava/lang/String;

.field private stepTimeString:Ljava/lang/String;

.field private stepTitle:Ljava/lang/String;

.field private timeBarColor:I

.field private toPlacemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

.field private totalDuration:J

.field private transportationMode:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field private waitDuration:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->intermediateStops:Ljava/util/List;

    .line 54
    return-void
.end method


# virtual methods
.method public canEqual(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "other"    # Ljava/lang/Object;

    .prologue
    .line 13
    instance-of v0, p1, Lcom/thetransitapp/droid/model/RoutingLeg;

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 33
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 13
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_0

    const/16 v29, 0x1

    :goto_0
    return v29

    :cond_0
    move-object/from16 v0, p1

    instance-of v0, v0, Lcom/thetransitapp/droid/model/RoutingLeg;

    move/from16 v29, v0

    if-nez v29, :cond_1

    const/16 v29, 0x0

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/thetransitapp/droid/model/RoutingLeg;

    .local v2, "other":Lcom/thetransitapp/droid/model/RoutingLeg;
    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->canEqual(Ljava/lang/Object;)Z

    move-result v29

    if-nez v29, :cond_2

    const/16 v29, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTransportationMode()Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    move-result-object v28

    .local v28, "this$transportationMode":Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTransportationMode()Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    move-result-object v15

    .local v15, "other$transportationMode":Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;
    if-nez v28, :cond_4

    if-eqz v15, :cond_5

    :cond_3
    const/16 v29, 0x0

    goto :goto_0

    :cond_4
    move-object/from16 v0, v28

    invoke-virtual {v0, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v20

    .local v20, "this$legType":Lcom/thetransitapp/droid/model/RoutingLeg$LegType;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v7

    .local v7, "other$legType":Lcom/thetransitapp/droid/model/RoutingLeg$LegType;
    if-nez v20, :cond_7

    if-eqz v7, :cond_8

    :cond_6
    const/16 v29, 0x0

    goto :goto_0

    :cond_7
    move-object/from16 v0, v20

    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_6

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDuration()J

    move-result-wide v29

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDuration()J

    move-result-wide v31

    cmp-long v29, v29, v31

    if-eqz v29, :cond_9

    const/16 v29, 0x0

    goto :goto_0

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getWaitDuration()J

    move-result-wide v29

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getWaitDuration()J

    move-result-wide v31

    cmp-long v29, v29, v31

    if-eqz v29, :cond_a

    const/16 v29, 0x0

    goto :goto_0

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTotalDuration()J

    move-result-wide v29

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTotalDuration()J

    move-result-wide v31

    cmp-long v29, v29, v31

    if-eqz v29, :cond_b

    const/16 v29, 0x0

    goto :goto_0

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStartScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v23

    .local v23, "this$startScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStartScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v10

    .local v10, "other$startScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    if-nez v23, :cond_d

    if-eqz v10, :cond_e

    :cond_c
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_d
    move-object/from16 v0, v23

    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_c

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getEndScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v16

    .local v16, "this$endScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getEndScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v3

    .local v3, "other$endScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    if-nez v16, :cond_10

    if-eqz v3, :cond_11

    :cond_f
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_10
    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_f

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDistance()D

    move-result-wide v29

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDistance()D

    move-result-wide v31

    invoke-static/range {v29 .. v32}, Ljava/lang/Double;->compare(DD)I

    move-result v29

    if-eqz v29, :cond_12

    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegSequence()I

    move-result v29

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegSequence()I

    move-result v30

    move/from16 v0, v29

    move/from16 v1, v30

    if-eq v0, v1, :cond_13

    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_13
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v21

    .local v21, "this$route":Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v8

    .local v8, "other$route":Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;
    if-nez v21, :cond_15

    if-eqz v8, :cond_16

    :cond_14
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_15
    move-object/from16 v0, v21

    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_14

    :cond_16
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getHeadsign()Ljava/lang/String;

    move-result-object v18

    .local v18, "this$headsign":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getHeadsign()Ljava/lang/String;

    move-result-object v5

    .local v5, "other$headsign":Ljava/lang/String;
    if-nez v18, :cond_18

    if-eqz v5, :cond_19

    :cond_17
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_18
    move-object/from16 v0, v18

    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_17

    :cond_19
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getFromPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v17

    .local v17, "this$fromPlacemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getFromPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v4

    .local v4, "other$fromPlacemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    if-nez v17, :cond_1b

    if-eqz v4, :cond_1c

    :cond_1a
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_1b
    move-object/from16 v0, v17

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_1a

    :cond_1c
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getToPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v27

    .local v27, "this$toPlacemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getToPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v14

    .local v14, "other$toPlacemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    if-nez v27, :cond_1e

    if-eqz v14, :cond_1f

    :cond_1d
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_1e
    move-object/from16 v0, v27

    invoke-virtual {v0, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_1d

    :cond_1f
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getIntermediateStops()Ljava/util/List;

    move-result-object v19

    .local v19, "this$intermediateStops":Ljava/util/List;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getIntermediateStops()Ljava/util/List;

    move-result-object v6

    .local v6, "other$intermediateStops":Ljava/util/List;
    if-nez v19, :cond_21

    if-eqz v6, :cond_22

    :cond_20
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_21
    move-object/from16 v0, v19

    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_20

    :cond_22
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getPreviousStopLatitude()D

    move-result-wide v29

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getPreviousStopLatitude()D

    move-result-wide v31

    invoke-static/range {v29 .. v32}, Ljava/lang/Double;->compare(DD)I

    move-result v29

    if-eqz v29, :cond_23

    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_23
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getPreviousStopLongitude()D

    move-result-wide v29

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getPreviousStopLongitude()D

    move-result-wide v31

    invoke-static/range {v29 .. v32}, Ljava/lang/Double;->compare(DD)I

    move-result v29

    if-eqz v29, :cond_24

    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_24
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepTitle()Ljava/lang/String;

    move-result-object v26

    .local v26, "this$stepTitle":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepTitle()Ljava/lang/String;

    move-result-object v13

    .local v13, "other$stepTitle":Ljava/lang/String;
    if-nez v26, :cond_26

    if-eqz v13, :cond_27

    :cond_25
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_26
    move-object/from16 v0, v26

    invoke-virtual {v0, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_25

    :cond_27
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepSubtitle()Ljava/lang/String;

    move-result-object v24

    .local v24, "this$stepSubtitle":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepSubtitle()Ljava/lang/String;

    move-result-object v11

    .local v11, "other$stepSubtitle":Ljava/lang/String;
    if-nez v24, :cond_29

    if-eqz v11, :cond_2a

    :cond_28
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_29
    move-object/from16 v0, v24

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_28

    :cond_2a
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepTimeString()Ljava/lang/String;

    move-result-object v25

    .local v25, "this$stepTimeString":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepTimeString()Ljava/lang/String;

    move-result-object v12

    .local v12, "other$stepTimeString":Ljava/lang/String;
    if-nez v25, :cond_2c

    if-eqz v12, :cond_2d

    :cond_2b
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_2c
    move-object/from16 v0, v25

    invoke-virtual {v0, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_2b

    :cond_2d
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTimeBarColor()I

    move-result v29

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTimeBarColor()I

    move-result v30

    move/from16 v0, v29

    move/from16 v1, v30

    if-eq v0, v1, :cond_2e

    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_2e
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getShape()Ljava/lang/String;

    move-result-object v22

    .local v22, "this$shape":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingLeg;->getShape()Ljava/lang/String;

    move-result-object v9

    .local v9, "other$shape":Ljava/lang/String;
    if-nez v22, :cond_30

    if-eqz v9, :cond_31

    :cond_2f
    const/16 v29, 0x0

    goto/16 :goto_0

    :cond_30
    move-object/from16 v0, v22

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_2f

    :cond_31
    const/16 v29, 0x1

    goto/16 :goto_0
.end method

.method public getBounds()Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 2

    .prologue
    .line 65
    new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    .line 67
    .local v0, "builder":Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    iget-object v1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->fromPlacemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    if-eqz v1, :cond_0

    .line 68
    iget-object v1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->fromPlacemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 71
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->toPlacemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    if-eqz v1, :cond_1

    .line 72
    iget-object v1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->toPlacemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    .line 75
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v1

    return-object v1
.end method

.method public getDistance()D
    .locals 2

    .prologue
    .line 13
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->distance:D

    return-wide v0
.end method

.method public getDuration()J
    .locals 2

    .prologue
    .line 13
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->duration:J

    return-wide v0
.end method

.method public getEndScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->endScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    return-object v0
.end method

.method public getEndTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->endScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public getFromPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->fromPlacemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-object v0
.end method

.method public getHeadsign()Ljava/lang/String;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->headsign:Ljava/lang/String;

    return-object v0
.end method

.method public getIntermediateStops()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Stop;",
            ">;"
        }
    .end annotation

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->intermediateStops:Ljava/util/List;

    return-object v0
.end method

.method public getLegSequence()I
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->legSequence:I

    return v0
.end method

.method public getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->legType:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    return-object v0
.end method

.method public getPreviousStopLatitude()D
    .locals 2

    .prologue
    .line 13
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->previousStopLatitude:D

    return-wide v0
.end method

.method public getPreviousStopLongitude()D
    .locals 2

    .prologue
    .line 13
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->previousStopLongitude:D

    return-wide v0
.end method

.method public getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->route:Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    return-object v0
.end method

.method public getShape()Ljava/lang/String;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->shape:Ljava/lang/String;

    return-object v0
.end method

.method public getStartScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->startScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    return-object v0
.end method

.method public getStartTime()Ljava/util/Date;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->startScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public getStepSubtitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->stepSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public getStepTimeString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->stepTimeString:Ljava/lang/String;

    return-object v0
.end method

.method public getStepTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->stepTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeBarColor()I
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->timeBarColor:I

    return v0
.end method

.method public getToPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->toPlacemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-object v0
.end method

.method public getTotalDuration()J
    .locals 2

    .prologue
    .line 13
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->totalDuration:J

    return-wide v0
.end method

.method public getTransportationMode()Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->transportationMode:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    return-object v0
.end method

.method public getWaitDuration()J
    .locals 2

    .prologue
    .line 13
    iget-wide v0, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->waitDuration:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 32

    .prologue
    .line 13
    const/16 v27, 0x1f

    .local v27, "PRIME":I
    const/16 v28, 0x1

    .local v28, "result":I
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTransportationMode()Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    move-result-object v24

    .local v24, "$transportationMode":Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;
    if-nez v24, :cond_0

    const/16 v29, 0x0

    :goto_0
    add-int/lit8 v28, v29, 0x1f

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v10

    .local v10, "$legType":Lcom/thetransitapp/droid/model/RoutingLeg$LegType;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v10, :cond_1

    const/16 v29, 0x0

    :goto_1
    add-int v28, v30, v29

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDuration()J

    move-result-wide v4

    .local v4, "$duration":J
    mul-int/lit8 v29, v28, 0x1f

    const/16 v30, 0x20

    ushr-long v30, v4, v30

    xor-long v30, v30, v4

    move-wide/from16 v0, v30

    long-to-int v0, v0

    move/from16 v30, v0

    add-int v28, v29, v30

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getWaitDuration()J

    move-result-wide v25

    .local v25, "$waitDuration":J
    mul-int/lit8 v29, v28, 0x1f

    const/16 v30, 0x20

    ushr-long v30, v25, v30

    xor-long v30, v30, v25

    move-wide/from16 v0, v30

    long-to-int v0, v0

    move/from16 v30, v0

    add-int v28, v29, v30

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTotalDuration()J

    move-result-wide v22

    .local v22, "$totalDuration":J
    mul-int/lit8 v29, v28, 0x1f

    const/16 v30, 0x20

    ushr-long v30, v22, v30

    xor-long v30, v30, v22

    move-wide/from16 v0, v30

    long-to-int v0, v0

    move/from16 v30, v0

    add-int v28, v29, v30

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStartScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v17

    .local v17, "$startScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v17, :cond_2

    const/16 v29, 0x0

    :goto_2
    add-int v28, v30, v29

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getEndScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v6

    .local v6, "$endScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v6, :cond_3

    const/16 v29, 0x0

    :goto_3
    add-int v28, v30, v29

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDistance()D

    move-result-wide v29

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    .local v2, "$distance":J
    mul-int/lit8 v29, v28, 0x1f

    const/16 v30, 0x20

    ushr-long v30, v2, v30

    xor-long v30, v30, v2

    move-wide/from16 v0, v30

    long-to-int v0, v0

    move/from16 v30, v0

    add-int v28, v29, v30

    mul-int/lit8 v29, v28, 0x1f

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegSequence()I

    move-result v30

    add-int v28, v29, v30

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v15

    .local v15, "$route":Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v15, :cond_4

    const/16 v29, 0x0

    :goto_4
    add-int v28, v30, v29

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getHeadsign()Ljava/lang/String;

    move-result-object v8

    .local v8, "$headsign":Ljava/lang/String;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v8, :cond_5

    const/16 v29, 0x0

    :goto_5
    add-int v28, v30, v29

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getFromPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v7

    .local v7, "$fromPlacemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v7, :cond_6

    const/16 v29, 0x0

    :goto_6
    add-int v28, v30, v29

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getToPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v21

    .local v21, "$toPlacemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v21, :cond_7

    const/16 v29, 0x0

    :goto_7
    add-int v28, v30, v29

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getIntermediateStops()Ljava/util/List;

    move-result-object v9

    .local v9, "$intermediateStops":Ljava/util/List;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v9, :cond_8

    const/16 v29, 0x0

    :goto_8
    add-int v28, v30, v29

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getPreviousStopLatitude()D

    move-result-wide v29

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v11

    .local v11, "$previousStopLatitude":J
    mul-int/lit8 v29, v28, 0x1f

    const/16 v30, 0x20

    ushr-long v30, v11, v30

    xor-long v30, v30, v11

    move-wide/from16 v0, v30

    long-to-int v0, v0

    move/from16 v30, v0

    add-int v28, v29, v30

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getPreviousStopLongitude()D

    move-result-wide v29

    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v13

    .local v13, "$previousStopLongitude":J
    mul-int/lit8 v29, v28, 0x1f

    const/16 v30, 0x20

    ushr-long v30, v13, v30

    xor-long v30, v30, v13

    move-wide/from16 v0, v30

    long-to-int v0, v0

    move/from16 v30, v0

    add-int v28, v29, v30

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepTitle()Ljava/lang/String;

    move-result-object v20

    .local v20, "$stepTitle":Ljava/lang/String;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v20, :cond_9

    const/16 v29, 0x0

    :goto_9
    add-int v28, v30, v29

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepSubtitle()Ljava/lang/String;

    move-result-object v18

    .local v18, "$stepSubtitle":Ljava/lang/String;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v18, :cond_a

    const/16 v29, 0x0

    :goto_a
    add-int v28, v30, v29

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepTimeString()Ljava/lang/String;

    move-result-object v19

    .local v19, "$stepTimeString":Ljava/lang/String;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v19, :cond_b

    const/16 v29, 0x0

    :goto_b
    add-int v28, v30, v29

    mul-int/lit8 v29, v28, 0x1f

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTimeBarColor()I

    move-result v30

    add-int v28, v29, v30

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getShape()Ljava/lang/String;

    move-result-object v16

    .local v16, "$shape":Ljava/lang/String;
    mul-int/lit8 v30, v28, 0x1f

    if-nez v16, :cond_c

    const/16 v29, 0x0

    :goto_c
    add-int v28, v30, v29

    return v28

    .end local v2    # "$distance":J
    .end local v4    # "$duration":J
    .end local v6    # "$endScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    .end local v7    # "$fromPlacemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    .end local v8    # "$headsign":Ljava/lang/String;
    .end local v9    # "$intermediateStops":Ljava/util/List;
    .end local v10    # "$legType":Lcom/thetransitapp/droid/model/RoutingLeg$LegType;
    .end local v11    # "$previousStopLatitude":J
    .end local v13    # "$previousStopLongitude":J
    .end local v15    # "$route":Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;
    .end local v16    # "$shape":Ljava/lang/String;
    .end local v17    # "$startScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    .end local v18    # "$stepSubtitle":Ljava/lang/String;
    .end local v19    # "$stepTimeString":Ljava/lang/String;
    .end local v20    # "$stepTitle":Ljava/lang/String;
    .end local v21    # "$toPlacemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    .end local v22    # "$totalDuration":J
    .end local v25    # "$waitDuration":J
    :cond_0
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto/16 :goto_0

    .restart local v10    # "$legType":Lcom/thetransitapp/droid/model/RoutingLeg$LegType;
    :cond_1
    invoke-virtual {v10}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto/16 :goto_1

    .restart local v4    # "$duration":J
    .restart local v17    # "$startScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    .restart local v22    # "$totalDuration":J
    .restart local v25    # "$waitDuration":J
    :cond_2
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto/16 :goto_2

    .restart local v6    # "$endScheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    :cond_3
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto/16 :goto_3

    .restart local v2    # "$distance":J
    .restart local v15    # "$route":Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;
    :cond_4
    invoke-virtual {v15}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto/16 :goto_4

    .restart local v8    # "$headsign":Ljava/lang/String;
    :cond_5
    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto/16 :goto_5

    .restart local v7    # "$fromPlacemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    :cond_6
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto/16 :goto_6

    .restart local v21    # "$toPlacemark":Lcom/thetransitapp/droid/model/SimplePlacemark;
    :cond_7
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto/16 :goto_7

    .restart local v9    # "$intermediateStops":Ljava/util/List;
    :cond_8
    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto/16 :goto_8

    .restart local v11    # "$previousStopLatitude":J
    .restart local v13    # "$previousStopLongitude":J
    .restart local v20    # "$stepTitle":Ljava/lang/String;
    :cond_9
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto :goto_9

    .restart local v18    # "$stepSubtitle":Ljava/lang/String;
    :cond_a
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto :goto_a

    .restart local v19    # "$stepTimeString":Ljava/lang/String;
    :cond_b
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto :goto_b

    .restart local v16    # "$shape":Ljava/lang/String;
    :cond_c
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->hashCode()I

    move-result v29

    goto :goto_c
.end method

.method public setDistance(D)V
    .locals 0
    .param p1, "distance"    # D

    .prologue
    .line 13
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->distance:D

    return-void
.end method

.method public setDuration(J)V
    .locals 0
    .param p1, "duration"    # J

    .prologue
    .line 13
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->duration:J

    return-void
.end method

.method public setEndScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V
    .locals 0
    .param p1, "endScheduleItem"    # Lcom/thetransitapp/droid/model/ScheduleItem;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->endScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    return-void
.end method

.method public setFromPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    .locals 0
    .param p1, "fromPlacemark"    # Lcom/thetransitapp/droid/model/SimplePlacemark;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->fromPlacemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-void
.end method

.method public setHeadsign(Ljava/lang/String;)V
    .locals 0
    .param p1, "headsign"    # Ljava/lang/String;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->headsign:Ljava/lang/String;

    return-void
.end method

.method public setIntermediateStops(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Stop;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 13
    .local p1, "intermediateStops":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Stop;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->intermediateStops:Ljava/util/List;

    return-void
.end method

.method public setLegSequence(I)V
    .locals 0
    .param p1, "legSequence"    # I

    .prologue
    .line 13
    iput p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->legSequence:I

    return-void
.end method

.method public setLegType(Lcom/thetransitapp/droid/model/RoutingLeg$LegType;)V
    .locals 0
    .param p1, "legType"    # Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->legType:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    return-void
.end method

.method public setPreviousStopLatitude(D)V
    .locals 0
    .param p1, "previousStopLatitude"    # D

    .prologue
    .line 13
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->previousStopLatitude:D

    return-void
.end method

.method public setPreviousStopLongitude(D)V
    .locals 0
    .param p1, "previousStopLongitude"    # D

    .prologue
    .line 13
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->previousStopLongitude:D

    return-void
.end method

.method public setRoute(Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;)V
    .locals 0
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->route:Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    return-void
.end method

.method public setShape(Ljava/lang/String;)V
    .locals 0
    .param p1, "shape"    # Ljava/lang/String;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->shape:Ljava/lang/String;

    return-void
.end method

.method public setStartScheduleItem(Lcom/thetransitapp/droid/model/ScheduleItem;)V
    .locals 0
    .param p1, "startScheduleItem"    # Lcom/thetransitapp/droid/model/ScheduleItem;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->startScheduleItem:Lcom/thetransitapp/droid/model/ScheduleItem;

    return-void
.end method

.method public setStepSubtitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "stepSubtitle"    # Ljava/lang/String;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->stepSubtitle:Ljava/lang/String;

    return-void
.end method

.method public setStepTimeString(Ljava/lang/String;)V
    .locals 0
    .param p1, "stepTimeString"    # Ljava/lang/String;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->stepTimeString:Ljava/lang/String;

    return-void
.end method

.method public setStepTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "stepTitle"    # Ljava/lang/String;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->stepTitle:Ljava/lang/String;

    return-void
.end method

.method public setTimeBarColor(I)V
    .locals 0
    .param p1, "timeBarColor"    # I

    .prologue
    .line 13
    iput p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->timeBarColor:I

    return-void
.end method

.method public setToPlacemark(Lcom/thetransitapp/droid/model/SimplePlacemark;)V
    .locals 0
    .param p1, "toPlacemark"    # Lcom/thetransitapp/droid/model/SimplePlacemark;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->toPlacemark:Lcom/thetransitapp/droid/model/SimplePlacemark;

    return-void
.end method

.method public setTotalDuration(J)V
    .locals 0
    .param p1, "totalDuration"    # J

    .prologue
    .line 13
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->totalDuration:J

    return-void
.end method

.method public setTransportationMode(Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;)V
    .locals 0
    .param p1, "transportationMode"    # Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    .prologue
    .line 13
    iput-object p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->transportationMode:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    return-void
.end method

.method public setWaitDuration(J)V
    .locals 0
    .param p1, "waitDuration"    # J

    .prologue
    .line 13
    iput-wide p1, p0, Lcom/thetransitapp/droid/model/RoutingLeg;->waitDuration:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RoutingLeg(transportationMode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTransportationMode()Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", legType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDuration()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", waitDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getWaitDuration()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTotalDuration()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startScheduleItem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStartScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endScheduleItem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getEndScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDistance()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", legSequence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegSequence()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", route="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headsign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getHeadsign()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fromPlacemark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getFromPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", toPlacemark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getToPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", intermediateStops="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getIntermediateStops()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", previousStopLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getPreviousStopLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", previousStopLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getPreviousStopLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepSubtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepTimeString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStepTimeString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeBarColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getTimeBarColor()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getShape()Ljava/lang/String;

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
