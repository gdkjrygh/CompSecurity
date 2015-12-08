.class Landroid/support/v7/internal/widget/ActionBarView$HomeView;
.super Landroid/widget/FrameLayout;
.source "ActionBarView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActionBarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "HomeView"
.end annotation


# instance fields
.field private mDefaultUpIndicator:Landroid/graphics/drawable/Drawable;

.field private mIconView:Landroid/widget/ImageView;

.field private mUpIndicatorRes:I

.field private mUpView:Landroid/widget/ImageView;

.field private mUpWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 1254
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1255
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 1258
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1259
    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;

    .prologue
    .line 1291
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    .line 1292
    .local v0, "cdesc":Ljava/lang/CharSequence;
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1293
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1295
    :cond_0
    const/4 v1, 0x1

    return v1
.end method

.method public getLeftOffset()I
    .locals 2

    .prologue
    .line 1306
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpWidth:I

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 1282
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1283
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpIndicatorRes:I

    if-eqz v0, :cond_0

    .line 1285
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpIndicatorRes:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUpIndicator(I)V

    .line 1287
    :cond_0
    return-void
.end method

.method protected onFinishInflate()V
    .locals 1

    .prologue
    .line 1300
    sget v0, Landroid/support/v7/appcompat/R$id;->up:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    .line 1301
    sget v0, Landroid/support/v7/appcompat/R$id;->home:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    .line 1302
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mDefaultUpIndicator:Landroid/graphics/drawable/Drawable;

    .line 1303
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 17
    .param p1, "changed"    # Z
    .param p2, "l"    # I
    .param p3, "t"    # I
    .param p4, "r"    # I
    .param p5, "b"    # I

    .prologue
    .line 1354
    sub-int v14, p5, p3

    div-int/lit8 v12, v14, 0x2

    .line 1355
    .local v12, "vCenter":I
    sub-int v13, p4, p2

    .line 1356
    .local v13, "width":I
    const/4 v9, 0x0

    .line 1357
    .local v9, "upOffset":I
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getVisibility()I

    move-result v14

    const/16 v15, 0x8

    if-eq v14, v15, :cond_0

    .line 1358
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 1359
    .local v8, "upLp":Landroid/widget/FrameLayout$LayoutParams;
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v7

    .line 1360
    .local v7, "upHeight":I
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v11

    .line 1361
    .local v11, "upWidth":I
    div-int/lit8 v14, v7, 0x2

    sub-int v10, v12, v14

    .line 1362
    .local v10, "upTop":I
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    const/4 v15, 0x0

    add-int v16, v10, v7

    move/from16 v0, v16

    invoke-virtual {v14, v15, v10, v11, v0}, Landroid/widget/ImageView;->layout(IIII)V

    .line 1363
    iget v14, v8, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v14, v11

    iget v15, v8, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int v9, v14, v15

    .line 1364
    sub-int/2addr v13, v9

    .line 1365
    add-int p2, p2, v9

    .line 1367
    .end local v7    # "upHeight":I
    .end local v8    # "upLp":Landroid/widget/FrameLayout$LayoutParams;
    .end local v10    # "upTop":I
    .end local v11    # "upWidth":I
    :cond_0
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 1368
    .local v4, "iconLp":Landroid/widget/FrameLayout$LayoutParams;
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v2

    .line 1369
    .local v2, "iconHeight":I
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v6

    .line 1370
    .local v6, "iconWidth":I
    sub-int v14, p4, p2

    div-int/lit8 v1, v14, 0x2

    .line 1371
    .local v1, "hCenter":I
    iget v14, v4, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    div-int/lit8 v15, v6, 0x2

    sub-int v15, v1, v15

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v14

    add-int v3, v9, v14

    .line 1372
    .local v3, "iconLeft":I
    iget v14, v4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    div-int/lit8 v15, v2, 0x2

    sub-int v15, v12, v15

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 1373
    .local v5, "iconTop":I
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    add-int v15, v3, v6

    add-int v16, v5, v2

    move/from16 v0, v16

    invoke-virtual {v14, v3, v5, v15, v0}, Landroid/widget/ImageView;->layout(IIII)V

    .line 1374
    return-void
.end method

.method protected onMeasure(II)V
    .locals 13
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    .line 1311
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 1312
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 1313
    .local v10, "upLp":Landroid/widget/FrameLayout$LayoutParams;
    iget v0, v10, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, v10, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpWidth:I

    .line 1314
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v3, 0x0

    .line 1315
    .local v3, "width":I
    :goto_0
    iget v0, v10, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, v10, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int v6, v0, v1

    .line 1316
    .local v6, "height":I
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 1317
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 1318
    .local v9, "iconLp":Landroid/widget/FrameLayout$LayoutParams;
    iget v0, v9, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, v9, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    add-int/2addr v3, v0

    .line 1319
    iget v0, v9, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, v9, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 1322
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    .line 1323
    .local v11, "widthMode":I
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v7

    .line 1324
    .local v7, "heightMode":I
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v12

    .line 1325
    .local v12, "widthSize":I
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v8

    .line 1327
    .local v8, "heightSize":I
    sparse-switch v11, :sswitch_data_0

    .line 1338
    :goto_1
    sparse-switch v7, :sswitch_data_1

    .line 1349
    :goto_2
    invoke-virtual {p0, v3, v6}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setMeasuredDimension(II)V

    .line 1350
    return-void

    .line 1314
    .end local v3    # "width":I
    .end local v6    # "height":I
    .end local v7    # "heightMode":I
    .end local v8    # "heightSize":I
    .end local v9    # "iconLp":Landroid/widget/FrameLayout$LayoutParams;
    .end local v11    # "widthMode":I
    .end local v12    # "widthSize":I
    :cond_0
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpWidth:I

    goto :goto_0

    .line 1329
    .restart local v3    # "width":I
    .restart local v6    # "height":I
    .restart local v7    # "heightMode":I
    .restart local v8    # "heightSize":I
    .restart local v9    # "iconLp":Landroid/widget/FrameLayout$LayoutParams;
    .restart local v11    # "widthMode":I
    .restart local v12    # "widthSize":I
    :sswitch_0
    invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1330
    goto :goto_1

    .line 1332
    :sswitch_1
    move v3, v12

    .line 1333
    goto :goto_1

    .line 1340
    :sswitch_2
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 1341
    goto :goto_2

    .line 1343
    :sswitch_3
    move v6, v8

    .line 1344
    goto :goto_2

    .line 1327
    nop

    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x40000000 -> :sswitch_1
    .end sparse-switch

    .line 1338
    :sswitch_data_1
    .sparse-switch
        -0x80000000 -> :sswitch_2
        0x40000000 -> :sswitch_3
    .end sparse-switch
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 1266
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1267
    return-void
.end method

.method public setUp(Z)V
    .locals 2
    .param p1, "isUp"    # Z

    .prologue
    .line 1262
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1263
    return-void

    .line 1262
    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public setUpIndicator(I)V
    .locals 2
    .param p1, "resId"    # I

    .prologue
    .line 1275
    iput p1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpIndicatorRes:I

    .line 1276
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1278
    return-void

    .line 1276
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mDefaultUpIndicator:Landroid/graphics/drawable/Drawable;

    goto :goto_0
.end method

.method public setUpIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 1270
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    .end local p1    # "d":Landroid/graphics/drawable/Drawable;
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1271
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpIndicatorRes:I

    .line 1272
    return-void

    .line 1270
    .restart local p1    # "d":Landroid/graphics/drawable/Drawable;
    :cond_0
    iget-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mDefaultUpIndicator:Landroid/graphics/drawable/Drawable;

    goto :goto_0
.end method
