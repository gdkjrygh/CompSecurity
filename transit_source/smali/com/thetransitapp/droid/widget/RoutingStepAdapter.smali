.class public Lcom/thetransitapp/droid/widget/RoutingStepAdapter;
.super Landroid/widget/ArrayAdapter;
.source "RoutingStepAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/thetransitapp/droid/model/RoutingLeg;",
        ">;"
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$LegType:[I


# instance fields
.field private preferences:Landroid/content/SharedPreferences;


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$LegType()[I
    .locals 3

    .prologue
    .line 32
    sget-object v0, Lcom/thetransitapp/droid/widget/RoutingStepAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$LegType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->values()[Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->END:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_4

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->START:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_3

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_1

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_0

    :goto_5
    sput-object v0, Lcom/thetransitapp/droid/widget/RoutingStepAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$LegType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_5

    :catch_1
    move-exception v1

    goto :goto_4

    :catch_2
    move-exception v1

    goto :goto_3

    :catch_3
    move-exception v1

    goto :goto_2

    :catch_4
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "preferences"    # Landroid/content/SharedPreferences;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 37
    const v0, 0x7f030027

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 39
    iput-object p2, p0, Lcom/thetransitapp/droid/widget/RoutingStepAdapter;->preferences:Landroid/content/SharedPreferences;

    .line 40
    return-void
.end method


# virtual methods
.method public addAll(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+",
            "Lcom/thetransitapp/droid/model/RoutingLeg;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 141
    .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+Lcom/thetransitapp/droid/model/RoutingLeg;>;"
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 144
    return-void

    .line 141
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/RoutingLeg;

    .line 142
    .local v0, "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    invoke-super {p0, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 32
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 44
    move-object/from16 v25, p2

    .line 46
    .local v25, "view":Landroid/view/View;
    if-nez v25, :cond_0

    .line 47
    invoke-super/range {p0 .. p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    move-result-object v28

    .line 48
    const-string v29, "layout_inflater"

    .line 47
    invoke-virtual/range {v28 .. v29}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/LayoutInflater;

    .line 49
    .local v11, "inflater":Landroid/view/LayoutInflater;
    const v28, 0x7f030026

    const/16 v29, 0x0

    move/from16 v0, v28

    move-object/from16 v1, v29

    invoke-virtual {v11, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v25

    .line 52
    .end local v11    # "inflater":Landroid/view/LayoutInflater;
    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/thetransitapp/droid/model/RoutingLeg;

    .line 53
    .local v13, "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v28

    sget-object v29, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    if-ne v0, v1, :cond_1

    const/4 v12, 0x1

    .line 54
    .local v12, "isTransit":Z
    :goto_0
    if-eqz v12, :cond_2

    const/16 v26, 0x0

    .line 56
    .local v26, "visibility":I
    :goto_1
    const v28, 0x7f050076

    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v21

    check-cast v21, Landroid/widget/TextView;

    .line 57
    .local v21, "timeStart":Landroid/widget/TextView;
    const v28, 0x7f050078

    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v20

    check-cast v20, Landroid/widget/TextView;

    .line 58
    .local v20, "timeEnd":Landroid/widget/TextView;
    const v28, 0x7f050079

    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/ImageView;

    .line 59
    .local v14, "legIcon":Landroid/widget/ImageView;
    const v28, 0x7f05007a

    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Lcom/thetransitapp/droid/ui/ShadowImageView;

    .line 60
    .local v23, "titleIcon":Lcom/thetransitapp/droid/ui/ShadowImageView;
    const v28, 0x7f05007b

    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v22

    check-cast v22, Landroid/widget/TextView;

    .line 61
    .local v22, "title":Landroid/widget/TextView;
    const v28, 0x7f05007c

    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v17

    check-cast v17, Landroid/widget/TextView;

    .line 62
    .local v17, "stopStart":Landroid/widget/TextView;
    const v28, 0x7f05007d

    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/TextView;

    .line 64
    .local v16, "stopEnd":Landroid/widget/TextView;
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 65
    .local v5, "context":Landroid/content/Context;
    invoke-static {v5}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v8

    .line 67
    .local v8, "formatter":Ljava/text/DateFormat;
    const/16 v28, 0x8

    move-object/from16 v0, v23

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    .line 68
    move-object/from16 v0, v20

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 69
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v28

    sget-object v29, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-object/from16 v0, v28

    move-object/from16 v1, v29

    if-eq v0, v1, :cond_3

    const/16 v28, 0x0

    :goto_2
    move-object/from16 v0, v17

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 70
    move-object/from16 v0, v16

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 71
    const v28, 0x7f050077

    move-object/from16 v0, v25

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v28

    move-object/from16 v0, v28

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 73
    invoke-static {}, Lcom/thetransitapp/droid/widget/RoutingStepAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$LegType()[I

    move-result-object v28

    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->ordinal()I

    move-result v29

    aget v28, v28, v29

    packed-switch v28, :pswitch_data_0

    .line 121
    :pswitch_0
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDuration()J

    move-result-wide v28

    const-wide/32 v30, 0xea60

    div-long v28, v28, v30

    move-wide/from16 v0, v28

    long-to-int v0, v0

    move/from16 v19, v0

    .line 122
    .local v19, "time":I
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getDistance()D

    move-result-wide v6

    .line 124
    .local v6, "distance":D
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v29

    invoke-direct/range {v28 .. v29}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v29, " min"

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v21

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-virtual/range {v22 .. v22}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v29

    const v30, 0x7f0a0093

    invoke-virtual/range {v29 .. v30}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v29

    invoke-static/range {v29 .. v29}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v29

    invoke-direct/range {v28 .. v29}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v29, " "

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 127
    .local v18, "text":Ljava/lang/String;
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v29

    invoke-direct/range {v28 .. v29}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/widget/RoutingStepAdapter;->preferences:Landroid/content/SharedPreferences;

    move-object/from16 v29, v0

    const-string v30, "useImperialSystem"

    const/16 v31, 0x0

    invoke-interface/range {v29 .. v31}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v29

    .line 127
    move/from16 v0, v29

    invoke-static {v6, v7, v0}, Lcom/thetransitapp/droid/util/DistanceUtility;->getDistanceString(DZ)Ljava/lang/String;

    move-result-object v29

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 130
    move-object/from16 v0, v22

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    const v28, 0x7f0200b9

    move/from16 v0, v28

    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 136
    .end local v6    # "distance":D
    .end local v18    # "text":Ljava/lang/String;
    .end local v19    # "time":I
    :goto_3
    return-object v25

    .line 53
    .end local v5    # "context":Landroid/content/Context;
    .end local v8    # "formatter":Ljava/text/DateFormat;
    .end local v12    # "isTransit":Z
    .end local v14    # "legIcon":Landroid/widget/ImageView;
    .end local v16    # "stopEnd":Landroid/widget/TextView;
    .end local v17    # "stopStart":Landroid/widget/TextView;
    .end local v20    # "timeEnd":Landroid/widget/TextView;
    .end local v21    # "timeStart":Landroid/widget/TextView;
    .end local v22    # "title":Landroid/widget/TextView;
    .end local v23    # "titleIcon":Lcom/thetransitapp/droid/ui/ShadowImageView;
    .end local v26    # "visibility":I
    :cond_1
    const/4 v12, 0x0

    goto/16 :goto_0

    .line 54
    .restart local v12    # "isTransit":Z
    :cond_2
    const/16 v26, 0x8

    goto/16 :goto_1

    .line 69
    .restart local v5    # "context":Landroid/content/Context;
    .restart local v8    # "formatter":Ljava/text/DateFormat;
    .restart local v14    # "legIcon":Landroid/widget/ImageView;
    .restart local v16    # "stopEnd":Landroid/widget/TextView;
    .restart local v17    # "stopStart":Landroid/widget/TextView;
    .restart local v20    # "timeEnd":Landroid/widget/TextView;
    .restart local v21    # "timeStart":Landroid/widget/TextView;
    .restart local v22    # "title":Landroid/widget/TextView;
    .restart local v23    # "titleIcon":Lcom/thetransitapp/droid/ui/ShadowImageView;
    .restart local v26    # "visibility":I
    :cond_3
    const/16 v28, 0x8

    goto/16 :goto_2

    .line 75
    :pswitch_1
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getEndTime()Ljava/util/Date;

    move-result-object v28

    move-object/from16 v0, v28

    invoke-virtual {v8, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v21

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    invoke-virtual/range {v22 .. v22}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v28

    const v29, 0x7f0a0094

    invoke-virtual/range {v28 .. v29}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v22

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getToPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v17

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    const v28, 0x7f0200b7

    move/from16 v0, v28

    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    .line 82
    :pswitch_2
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStartTime()Ljava/util/Date;

    move-result-object v28

    move-object/from16 v0, v28

    invoke-virtual {v8, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v21

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    invoke-virtual/range {v22 .. v22}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v28

    const v29, 0x7f0a0092

    invoke-virtual/range {v28 .. v29}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v22

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getFromPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v17

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    const v28, 0x7f0200b8

    move/from16 v0, v28

    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_3

    .line 89
    :pswitch_3
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getStartTime()Ljava/util/Date;

    move-result-object v28

    move-object/from16 v0, v28

    invoke-virtual {v8, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v21

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getEndTime()Ljava/util/Date;

    move-result-object v28

    move-object/from16 v0, v28

    invoke-virtual {v8, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v20

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    const-string v9, ""

    .line 94
    .local v9, "headsign":Ljava/lang/String;
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getRouteImage()Lcom/thetransitapp/droid/model/RouteImage;

    move-result-object v28

    if-eqz v28, :cond_4

    .line 95
    const/16 v28, 0x0

    move-object/from16 v0, v23

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 96
    const/16 v28, 0x0

    move-object/from16 v0, v23

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    .line 97
    new-instance v28, Landroid/graphics/PorterDuffColorFilter;

    const/16 v29, -0x1

    sget-object v30, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct/range {v28 .. v30}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    move-object/from16 v0, v23

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 98
    const/high16 v28, 0x40000000    # 2.0f

    const/16 v29, 0x0

    const/high16 v30, -0x40000000    # -2.0f

    const/high16 v31, -0x1000000

    move-object/from16 v0, v23

    move/from16 v1, v28

    move/from16 v2, v29

    move/from16 v3, v30

    move/from16 v4, v31

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setShadowLayer(FFFI)V

    .line 100
    invoke-virtual/range {v23 .. v23}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v15

    .line 101
    .local v15, "metrics":Landroid/util/DisplayMetrics;
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getRouteImage()Lcom/thetransitapp/droid/model/RouteImage;

    move-result-object v28

    const/16 v29, 0x1

    move-object/from16 v0, v28

    move/from16 v1, v29

    invoke-virtual {v0, v15, v1}, Lcom/thetransitapp/droid/model/RouteImage;->getUrlWithScreenMetrics(Landroid/util/DisplayMetrics;Z)Ljava/lang/String;

    move-result-object v24

    .line 102
    .local v24, "url":Ljava/lang/String;
    invoke-static/range {v23 .. v24}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 107
    .end local v15    # "metrics":Landroid/util/DisplayMetrics;
    .end local v24    # "url":Ljava/lang/String;
    :goto_4
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v29

    invoke-direct/range {v28 .. v29}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getHeadsign()Ljava/lang/String;

    move-result-object v29

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 108
    move-object/from16 v0, v22

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getFromPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v17

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getToPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getName()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v16

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    const/16 v28, -0x2

    const/16 v29, -0x2

    move-object/from16 v0, v25

    move/from16 v1, v28

    move/from16 v2, v29

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V

    .line 114
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v28

    const v29, 0x7f0200b9

    invoke-virtual/range {v28 .. v29}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v27

    .line 115
    .local v27, "width":I
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredHeight()I

    move-result v28

    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getPaddingTop()I

    move-result v29

    sub-int v28, v28, v29

    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getPaddingBottom()I

    move-result v29

    sub-int v10, v28, v29

    .line 117
    .local v10, "height":I
    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getColor()I

    move-result v28

    move/from16 v0, v28

    move/from16 v1, v27

    invoke-static {v0, v1, v10}, Lcom/thetransitapp/droid/util/BitmapUtility;->getStepIcon(III)Landroid/graphics/Bitmap;

    move-result-object v28

    move-object/from16 v0, v28

    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_3

    .line 104
    .end local v10    # "height":I
    .end local v27    # "width":I
    :cond_4
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Lcom/thetransitapp/droid/model/RoutingLeg;->getRoute()Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->getShortName()Ljava/lang/String;

    move-result-object v29

    invoke-static/range {v29 .. v29}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v29

    invoke-direct/range {v28 .. v29}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v29, " "

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_4

    .line 73
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method
