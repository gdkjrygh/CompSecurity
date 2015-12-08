.class public Lcom/thetransitapp/droid/widget/ScheduleAdapter;
.super Landroid/widget/ArrayAdapter;
.source "ScheduleAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/thetransitapp/droid/widget/ListViewItem",
        "<",
        "Lcom/thetransitapp/droid/model/ScheduleItem;",
        ">;>;"
    }
.end annotation


# instance fields
.field private inflater:Landroid/view/LayoutInflater;

.field private reachEndListener:Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;

.field private reachEndOffset:I

.field private showHeadsign:Z


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;)V
    .locals 2
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "context"    # Landroid/content/Context;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 42
    const v0, 0x7f030027

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p2, v0, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 37
    const/4 v0, 0x1

    iput v0, p0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->reachEndOffset:I

    .line 44
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 45
    return-void
.end method


# virtual methods
.method public addSchedule(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ScheduleItem;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 143
    .local p1, "scheduleItems":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    const/4 v1, 0x0

    .line 145
    .local v1, "lastHeadsign":Ljava/lang/String;
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->showHeadsign:Z

    .line 147
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_0

    .line 160
    return-void

    .line 147
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 148
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    new-instance v2, Lcom/thetransitapp/droid/widget/ListViewItem;

    invoke-direct {v2, v0}, Lcom/thetransitapp/droid/widget/ListViewItem;-><init>(Ljava/lang/Object;)V

    .line 150
    .local v2, "listItem":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    invoke-super {p0, v2}, Landroid/widget/ArrayAdapter;->getPosition(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    .line 151
    invoke-super {p0, v2}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 154
    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getHeadsign()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 155
    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->showHeadsign:Z

    .line 158
    :cond_2
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getHeadsign()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public addTitle(Ljava/lang/String;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 163
    new-instance v0, Lcom/thetransitapp/droid/widget/ListViewItem;

    invoke-direct {v0, p1}, Lcom/thetransitapp/droid/widget/ListViewItem;-><init>(Ljava/lang/String;)V

    invoke-super {p0, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 164
    return-void
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 22
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 49
    move-object/from16 v17, p2

    .line 50
    .local v17, "view":Landroid/view/View;
    invoke-super/range {p0 .. p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/thetransitapp/droid/widget/ListViewItem;

    .line 52
    .local v11, "item":Lcom/thetransitapp/droid/widget/ListViewItem;, "Lcom/thetransitapp/droid/widget/ListViewItem<Lcom/thetransitapp/droid/model/ScheduleItem;>;"
    if-eqz v17, :cond_1

    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v18

    if-nez v18, :cond_0

    const v18, 0x7f050081

    invoke-virtual/range {v17 .. v18}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v18

    if-eqz v18, :cond_1

    .line 53
    :cond_0
    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v18

    if-eqz v18, :cond_2

    const v18, 0x7f05007e

    invoke-virtual/range {v17 .. v18}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v18

    if-nez v18, :cond_2

    .line 54
    :cond_1
    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v18

    if-eqz v18, :cond_6

    .line 55
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->inflater:Landroid/view/LayoutInflater;

    move-object/from16 v18, v0

    const v19, 0x7f030027

    const/16 v20, 0x0

    move-object/from16 v0, v18

    move/from16 v1, v19

    move-object/from16 v2, p3

    move/from16 v3, v20

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v17

    .line 61
    :cond_2
    :goto_0
    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->hasValue()Z

    move-result v18

    if-eqz v18, :cond_b

    .line 62
    const v18, 0x7f05007e

    invoke-virtual/range {v17 .. v18}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/TextView;

    .line 63
    .local v15, "textView":Landroid/widget/TextView;
    const v18, 0x7f050080

    invoke-virtual/range {v17 .. v18}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    .line 64
    .local v9, "headsign":Landroid/widget/TextView;
    const v18, 0x7f05007f

    invoke-virtual/range {v17 .. v18}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/LinearLayout;

    .line 67
    .local v10, "indicator":Landroid/widget/LinearLayout;
    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->getValue()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/ScheduleItem;->isFrequency()Z

    move-result v18

    if-nez v18, :cond_7

    .line 68
    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->getValue()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/ScheduleItem;->getStopTime()Ljava/util/Date;

    move-result-object v14

    .line 69
    .local v14, "stopTime":Ljava/util/Date;
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->getContext()Landroid/content/Context;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v14}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .end local v14    # "stopTime":Ljava/util/Date;
    :goto_1
    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->getValue()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/ScheduleItem;->getRealStopTime()Ljava/util/Date;

    move-result-object v18

    if-eqz v18, :cond_8

    .line 75
    const/16 v18, 0x0

    move/from16 v0, v18

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/thetransitapp/droid/ui/ShadowImageView;

    .line 76
    .local v6, "big":Lcom/thetransitapp/droid/ui/ShadowImageView;
    const/16 v18, 0x1

    move/from16 v0, v18

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lcom/thetransitapp/droid/ui/ShadowImageView;

    .line 78
    .local v13, "small":Lcom/thetransitapp/droid/ui/ShadowImageView;
    new-instance v8, Landroid/graphics/PorterDuffColorFilter;

    const v18, -0x333334

    sget-object v19, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    move/from16 v0, v18

    move-object/from16 v1, v19

    invoke-direct {v8, v0, v1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 79
    .local v8, "filter":Landroid/graphics/ColorFilter;
    new-instance v12, Landroid/graphics/PorterDuffColorFilter;

    const/16 v18, -0x1

    sget-object v19, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    move/from16 v0, v18

    move-object/from16 v1, v19

    invoke-direct {v12, v0, v1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 80
    .local v12, "selectedColorFilter":Landroid/graphics/ColorFilter;
    invoke-virtual {v6, v8}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 81
    invoke-virtual {v13, v8}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 82
    invoke-virtual {v6, v12}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setPressedColorFilter(Landroid/graphics/ColorFilter;)V

    .line 83
    invoke-virtual {v13, v12}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setPressedColorFilter(Landroid/graphics/ColorFilter;)V

    .line 85
    invoke-virtual {v10}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v18

    if-nez v18, :cond_3

    invoke-virtual {v10}, Landroid/widget/LinearLayout;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v18

    if-eqz v18, :cond_3

    .line 86
    invoke-virtual {v10}, Landroid/widget/LinearLayout;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v18

    if-nez v18, :cond_4

    .line 87
    :cond_3
    const/16 v18, 0x0

    move/from16 v0, v18

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 89
    sget v18, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v19, 0xb

    move/from16 v0, v18

    move/from16 v1, v19

    if-lt v0, v1, :cond_4

    .line 90
    invoke-virtual {v6}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getContext()Landroid/content/Context;

    move-result-object v18

    const/high16 v19, 0x7f040000

    invoke-static/range {v18 .. v19}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v4

    .line 91
    .local v4, "animBig":Landroid/view/animation/Animation;
    invoke-virtual {v4}, Landroid/view/animation/Animation;->getStartOffset()J

    move-result-wide v18

    const-wide/16 v20, 0xc8

    add-long v18, v18, v20

    move-wide/from16 v0, v18

    invoke-virtual {v4, v0, v1}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 92
    invoke-virtual {v6}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getContext()Landroid/content/Context;

    move-result-object v18

    const/high16 v19, 0x7f040000

    invoke-static/range {v18 .. v19}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v5

    .line 93
    .local v5, "animSmall":Landroid/view/animation/Animation;
    invoke-virtual {v5}, Landroid/view/animation/Animation;->getDuration()J

    move-result-wide v18

    const-wide/16 v20, 0xc8

    add-long v18, v18, v20

    move-wide/from16 v0, v18

    invoke-virtual {v5, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 95
    invoke-virtual {v6, v4}, Lcom/thetransitapp/droid/ui/ShadowImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 96
    invoke-virtual {v13, v5}, Lcom/thetransitapp/droid/ui/ShadowImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 100
    .end local v4    # "animBig":Landroid/view/animation/Animation;
    .end local v5    # "animSmall":Landroid/view/animation/Animation;
    :cond_4
    invoke-virtual {v15}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v18

    const v19, 0x7f07001f

    invoke-virtual/range {v18 .. v19}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    .line 111
    .end local v6    # "big":Lcom/thetransitapp/droid/ui/ShadowImageView;
    .end local v8    # "filter":Landroid/graphics/ColorFilter;
    .end local v12    # "selectedColorFilter":Landroid/graphics/ColorFilter;
    .end local v13    # "small":Lcom/thetransitapp/droid/ui/ShadowImageView;
    .local v7, "color":Landroid/content/res/ColorStateList;
    :goto_2
    invoke-virtual {v15, v7}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 112
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 114
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->showHeadsign:Z

    move/from16 v18, v0

    if-eqz v18, :cond_a

    .line 115
    const/16 v18, 0x0

    move/from16 v0, v18

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 116
    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->getValue()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/ScheduleItem;->getHeadsign()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .end local v7    # "color":Landroid/content/res/ColorStateList;
    .end local v9    # "headsign":Landroid/widget/TextView;
    .end local v10    # "indicator":Landroid/widget/LinearLayout;
    .end local v15    # "textView":Landroid/widget/TextView;
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->getCount()I

    move-result v18

    move-object/from16 v0, p0

    iget v0, v0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->reachEndOffset:I

    move/from16 v19, v0

    sub-int v18, v18, v19

    move/from16 v0, p1

    move/from16 v1, v18

    if-lt v0, v1, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->reachEndListener:Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;

    move-object/from16 v18, v0

    if-eqz v18, :cond_5

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->reachEndListener:Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;

    move-object/from16 v18, v0

    invoke-interface/range {v18 .. v18}, Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;->onReachEnd()V

    .line 129
    :cond_5
    return-object v17

    .line 57
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->inflater:Landroid/view/LayoutInflater;

    move-object/from16 v18, v0

    const v19, 0x7f030028

    const/16 v20, 0x0

    move-object/from16 v0, v18

    move/from16 v1, v19

    move-object/from16 v2, p3

    move/from16 v3, v20

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v17

    goto/16 :goto_0

    .line 71
    .restart local v9    # "headsign":Landroid/widget/TextView;
    .restart local v10    # "indicator":Landroid/widget/LinearLayout;
    .restart local v15    # "textView":Landroid/widget/TextView;
    :cond_7
    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->getValue()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v15}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Lcom/thetransitapp/droid/model/ScheduleItem;->getScheduleViewString(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 102
    :cond_8
    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->getValue()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual/range {v18 .. v18}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPastItem()Z

    move-result v18

    if-eqz v18, :cond_9

    .line 103
    invoke-virtual {v15}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v18

    const v19, 0x7f07001c

    invoke-virtual/range {v18 .. v19}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    .line 108
    .restart local v7    # "color":Landroid/content/res/ColorStateList;
    :goto_4
    const/16 v18, 0x8

    move/from16 v0, v18

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_2

    .line 105
    .end local v7    # "color":Landroid/content/res/ColorStateList;
    :cond_9
    invoke-virtual {v15}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v18

    const v19, 0x7f07001f

    invoke-virtual/range {v18 .. v19}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    .restart local v7    # "color":Landroid/content/res/ColorStateList;
    goto :goto_4

    .line 118
    :cond_a
    const/16 v18, 0x8

    move/from16 v0, v18

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_3

    .line 121
    .end local v7    # "color":Landroid/content/res/ColorStateList;
    .end local v9    # "headsign":Landroid/widget/TextView;
    .end local v10    # "indicator":Landroid/widget/LinearLayout;
    .end local v15    # "textView":Landroid/widget/TextView;
    :cond_b
    const v18, 0x7f050081

    invoke-virtual/range {v17 .. v18}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/TextView;

    .line 122
    .local v16, "titleView":Landroid/widget/TextView;
    invoke-virtual {v11}, Lcom/thetransitapp/droid/widget/ListViewItem;->getTitle()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3
.end method

.method public setOnReachEndListener(Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;)V
    .locals 1
    .param p1, "reachEndListener"    # Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;

    .prologue
    .line 133
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->setOnReachEndListener(Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;I)V

    .line 134
    return-void
.end method

.method public setOnReachEndListener(Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;I)V
    .locals 0
    .param p1, "reachEndListener"    # Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;
    .param p2, "reachendOffset"    # I

    .prologue
    .line 137
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->reachEndListener:Lcom/thetransitapp/droid/widget/ScheduleAdapter$OnReachEndListener;

    .line 138
    iput p2, p0, Lcom/thetransitapp/droid/widget/ScheduleAdapter;->reachEndOffset:I

    .line 139
    return-void
.end method
