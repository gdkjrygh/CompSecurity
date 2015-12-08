.class public final Lcom/thetransitapp/droid/util/BackgroundUtility;
.super Ljava/lang/Object;
.source "BackgroundUtility.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    return-void
.end method

.method public static setGlossyBackground(Landroid/view/View;IIIZ)V
    .locals 11
    .param p0, "view"    # Landroid/view/View;
    .param p1, "color"    # I
    .param p2, "gloss"    # I
    .param p3, "topGloss"    # I
    .param p4, "withGloss"    # Z

    .prologue
    const/4 v7, 0x3

    const/4 v5, 0x1

    const/4 v4, 0x5

    const/4 v2, 0x0

    const/4 v1, 0x2

    .line 27
    if-eqz p4, :cond_1

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0xb

    if-lt v3, v6, :cond_1

    move v10, v5

    .line 29
    .local v10, "showGloss":Z
    :goto_0
    if-eqz v10, :cond_2

    const/4 v3, 0x6

    :goto_1
    new-array v9, v3, [Landroid/graphics/drawable/Drawable;

    .line 30
    .local v9, "layers":[Landroid/graphics/drawable/Drawable;
    new-instance v3, Landroid/graphics/drawable/PaintDrawable;

    invoke-direct {v3, p1}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    aput-object v3, v9, v2

    .line 31
    new-instance v3, Landroid/graphics/drawable/PaintDrawable;

    const/high16 v6, -0x45000000    # -0.001953125f

    invoke-direct {v3, v6}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    aput-object v3, v9, v5

    .line 32
    new-instance v3, Landroid/graphics/drawable/PaintDrawable;

    invoke-direct {v3, p3}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    aput-object v3, v9, v1

    .line 33
    new-instance v3, Landroid/graphics/drawable/PaintDrawable;

    invoke-direct {v3, p2}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    aput-object v3, v9, v7

    .line 34
    const/4 v3, 0x4

    new-instance v5, Landroid/graphics/drawable/PaintDrawable;

    invoke-direct {v5, p1}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    aput-object v5, v9, v3

    .line 36
    if-eqz v10, :cond_0

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f020092

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    aput-object v3, v9, v4

    .line 38
    aget-object v3, v9, v4

    const/16 v4, 0x56

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 41
    :cond_0
    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {v0, v9}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .local v0, "layerDrawable":Landroid/graphics/drawable/LayerDrawable;
    move v3, v2

    move v4, v2

    move v5, v1

    .line 42
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    move-object v3, v0

    move v4, v7

    move v5, v2

    move v6, v1

    move v7, v2

    move v8, v1

    .line 43
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    .line 44
    const/4 v3, 0x4

    move-object v2, v0

    move v4, v1

    move v5, v1

    move v6, v1

    move v7, v1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    .line 46
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 47
    return-void

    .end local v0    # "layerDrawable":Landroid/graphics/drawable/LayerDrawable;
    .end local v9    # "layers":[Landroid/graphics/drawable/Drawable;
    .end local v10    # "showGloss":Z
    :cond_1
    move v10, v2

    .line 27
    goto :goto_0

    .restart local v10    # "showGloss":Z
    :cond_2
    move v3, v4

    .line 29
    goto :goto_1
.end method

.method public static setGlossyBackground(Landroid/view/View;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 4
    .param p0, "view"    # Landroid/view/View;
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    .line 18
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getColor()I

    move-result v0

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getGlossColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTopGlossColor()I

    move-result v2

    const/4 v3, 0x1

    invoke-static {p0, v0, v1, v2, v3}, Lcom/thetransitapp/droid/util/BackgroundUtility;->setGlossyBackground(Landroid/view/View;IIIZ)V

    .line 19
    return-void
.end method

.method public static setGlossyBackground(Landroid/view/View;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Z)V
    .locals 3
    .param p0, "view"    # Landroid/view/View;
    .param p1, "route"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p2, "withGloss"    # Z

    .prologue
    .line 22
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getColor()I

    move-result v0

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getGlossColor()I

    move-result v1

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTopGlossColor()I

    move-result v2

    invoke-static {p0, v0, v1, v2, p2}, Lcom/thetransitapp/droid/util/BackgroundUtility;->setGlossyBackground(Landroid/view/View;IIIZ)V

    .line 23
    return-void
.end method
