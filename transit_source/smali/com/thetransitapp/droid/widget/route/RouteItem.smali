.class public Lcom/thetransitapp/droid/widget/route/RouteItem;
.super Ljava/lang/Object;
.source "RouteItem.java"


# static fields
.field private static dialog:Landroid/app/AlertDialog;


# instance fields
.field private final routeItemListener:Lcom/thetransitapp/droid/widget/route/RouteItemListener;

.field private view:Landroid/view/View;

.field private final viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;


# direct methods
.method public constructor <init>(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;Landroid/content/SharedPreferences;)V
    .locals 1
    .param p1, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p2, "uiHandlers"    # Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;
    .param p3, "preferences"    # Landroid/content/SharedPreferences;

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    invoke-direct {v0, p2, p0, p3}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;-><init>(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;Lcom/thetransitapp/droid/widget/route/RouteItem;Landroid/content/SharedPreferences;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->routeItemListener:Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    .line 52
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .line 53
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/widget/route/RouteItem;)Lcom/thetransitapp/droid/widget/route/RouteItemListener;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->routeItemListener:Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    return-object v0
.end method

.method private setTextView(Landroid/view/View;ILjava/lang/String;II)V
    .locals 2
    .param p1, "item"    # Landroid/view/View;
    .param p2, "id"    # I
    .param p3, "text"    # Ljava/lang/String;
    .param p4, "color"    # I
    .param p5, "selectedColor"    # I

    .prologue
    .line 308
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 309
    .local v0, "textView":Landroid/widget/TextView;
    invoke-direct {p0, v0, p3, p4, p5}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setTextView(Landroid/widget/TextView;Ljava/lang/String;II)V

    .line 311
    sparse-switch p2, :sswitch_data_0

    .line 319
    :goto_0
    return-void

    .line 316
    :sswitch_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/thetransitapp/droid/util/FontUtility;->getInterstateBold(Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_0

    .line 311
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f050053 -> :sswitch_0
        0x7f050062 -> :sswitch_0
        0x7f050068 -> :sswitch_0
        0x7f050069 -> :sswitch_0
    .end sparse-switch
.end method

.method private setTextView(Landroid/widget/TextView;Ljava/lang/String;II)V
    .locals 7
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "text"    # Ljava/lang/String;
    .param p3, "color"    # I
    .param p4, "selectedColor"    # I

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 322
    new-instance v0, Landroid/content/res/ColorStateList;

    new-array v1, v6, [[I

    new-array v2, v5, [I

    const v3, -0x10100a7

    aput v3, v2, v4

    aput-object v2, v1, v4

    .line 323
    new-array v2, v5, [I

    const v3, 0x10100a7

    aput v3, v2, v4

    aput-object v2, v1, v5

    new-array v2, v6, [I

    aput p3, v2, v4

    aput p4, v2, v5

    .line 322
    invoke-direct {v0, v1, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 325
    .local v0, "colorStateList":Landroid/content/res/ColorStateList;
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 326
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 327
    const v1, 0x3dcccccd    # 0.1f

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextShadowOffset()F

    move-result v3

    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShadowColor()I

    move-result v4

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 328
    return-void
.end method

.method private setupBranchCode(Landroid/view/View;II)V
    .locals 6
    .param p1, "view"    # Landroid/view/View;
    .param p2, "color"    # I
    .param p3, "selectedColor"    # I

    .prologue
    const v2, 0x7f050062

    .line 226
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getBranch()Ljava/lang/String;

    move-result-object v3

    .line 227
    .local v3, "branchCode":Ljava/lang/String;
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v3, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 228
    if-eqz v3, :cond_0

    move-object v0, p0

    move-object v1, p1

    move v4, p2

    move v5, p3

    .line 229
    invoke-direct/range {v0 .. v5}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setTextView(Landroid/view/View;ILjava/lang/String;II)V

    .line 231
    :cond_0
    return-void

    .line 227
    :cond_1
    const/16 v0, 0x8

    goto :goto_0
.end method

.method private setupDirections(Landroid/view/View;)V
    .locals 10
    .param p1, "view"    # Landroid/view/View;

    .prologue
    const v9, 0x7f080015

    const/4 v8, 0x0

    const v6, 0x3f333333    # 0.7f

    const/4 v7, 0x1

    .line 353
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .line 354
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    mul-float/2addr v5, v6

    .line 353
    invoke-static {v4, v5}, Lcom/thetransitapp/droid/util/BitmapUtility;->getArrow(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;F)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 355
    .local v0, "arrows":Landroid/graphics/Bitmap;
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .line 356
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    mul-float/2addr v5, v6

    .line 355
    invoke-static {v4, v5, v7}, Lcom/thetransitapp/droid/util/BitmapUtility;->getArrow(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;FZ)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 358
    .local v3, "pressedArrows":Landroid/graphics/Bitmap;
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 359
    .local v1, "drawable":Landroid/graphics/drawable/StateListDrawable;
    new-array v4, v7, [I

    const v5, -0x10100a7

    aput v5, v4, v8

    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-direct {v5, v6, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v4, v5}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 360
    new-array v4, v7, [I

    const v5, 0x10100a7

    aput v5, v4, v8

    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 361
    invoke-direct {v5, v6, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 360
    invoke-virtual {v1, v4, v5}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 363
    const v4, 0x7f050055

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 364
    .local v2, "image":Landroid/widget/ImageView;
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 365
    return-void
.end method

.method private setupFavorite(Landroid/view/View;)V
    .locals 5
    .param p1, "view"    # Landroid/view/View;

    .prologue
    const v2, 0x7f050064

    const/high16 v4, 0x40000000    # 2.0f

    .line 234
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route;->isFavorite()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 235
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/ui/ShadowImageView;

    .line 236
    .local v0, "isFav":Lcom/thetransitapp/droid/ui/ShadowImageView;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    .line 237
    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getStarColor()I

    move-result v2

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 238
    const/4 v1, 0x0

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getGlossColor()I

    move-result v2

    invoke-virtual {v0, v4, v1, v4, v2}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setShadowLayer(FFFI)V

    .line 242
    .end local v0    # "isFav":Lcom/thetransitapp/droid/ui/ShadowImageView;
    :goto_0
    return-void

    .line 240
    :cond_0
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method private setupOutOfServiceIcon(Landroid/view/View;II)V
    .locals 7
    .param p1, "view"    # Landroid/view/View;
    .param p2, "color"    # I
    .param p3, "time"    # I

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x0

    const/16 v4, 0x8

    .line 205
    const v3, 0x7f050069

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 206
    .local v2, "text":Landroid/widget/TextView;
    const v3, 0x7f05006a

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/ui/ShadowImageView;

    .line 207
    .local v1, "noService":Lcom/thetransitapp/droid/ui/ShadowImageView;
    const v3, 0x7f05006c

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 209
    .local v0, "minutes":Landroid/widget/TextView;
    const/4 v3, -0x1

    if-eq p3, v3, :cond_0

    const/16 v3, 0x5a

    if-le p3, v3, :cond_3

    .line 210
    :cond_0
    invoke-virtual {v1}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getVisibility()I

    move-result v3

    if-ne v3, v4, :cond_1

    .line 211
    invoke-virtual {v1, v5}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    .line 212
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 213
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 216
    :cond_1
    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, p2, v4}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v3}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 217
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextShadowOffset()F

    move-result v3

    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShadowColor()I

    move-result v4

    invoke-virtual {v1, v6, v6, v3, v4}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setShadowLayer(FFFI)V

    .line 223
    :cond_2
    :goto_0
    return-void

    .line 218
    :cond_3
    invoke-virtual {v1}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getVisibility()I

    move-result v3

    if-nez v3, :cond_2

    .line 219
    invoke-virtual {v1, v4}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    .line 220
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 221
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method private setupRealTimeIndicator(Landroid/view/View;I)V
    .locals 12
    .param p1, "view"    # Landroid/view/View;
    .param p2, "color"    # I

    .prologue
    const/high16 v11, 0x7f040000

    const/high16 v9, 0x40000000    # 2.0f

    const/4 v8, 0x0

    const/high16 v7, -0x40000000    # -2.0f

    const/4 v10, 0x0

    .line 176
    const v6, 0x7f05006b

    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    .line 178
    .local v4, "indicator":Landroid/widget/LinearLayout;
    invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/ui/ShadowImageView;

    .line 179
    .local v2, "big":Lcom/thetransitapp/droid/ui/ShadowImageView;
    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/ui/ShadowImageView;

    .line 181
    .local v5, "small":Lcom/thetransitapp/droid/ui/ShadowImageView;
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShadowColor()I

    move-result v6

    invoke-virtual {v2, v9, v8, v7, v6}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setShadowLayer(FFFI)V

    .line 182
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShadowColor()I

    move-result v6

    invoke-virtual {v5, v9, v8, v7, v6}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setShadowLayer(FFFI)V

    .line 184
    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, p2, v6}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 185
    .local v3, "filter":Landroid/graphics/ColorFilter;
    invoke-virtual {v2, v3}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 186
    invoke-virtual {v5, v3}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 188
    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v2}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v2}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v6

    if-nez v6, :cond_1

    .line 189
    :cond_0
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0xb

    if-lt v6, v7, :cond_1

    .line 190
    invoke-virtual {v2}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v11}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 191
    .local v0, "animBig":Landroid/view/animation/Animation;
    invoke-virtual {v0}, Landroid/view/animation/Animation;->getStartOffset()J

    move-result-wide v6

    const-wide/16 v8, 0xc8

    add-long/2addr v6, v8

    invoke-virtual {v0, v6, v7}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 192
    invoke-virtual {v2}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v11}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 193
    .local v1, "animSmall":Landroid/view/animation/Animation;
    invoke-virtual {v1}, Landroid/view/animation/Animation;->getDuration()J

    move-result-wide v6

    const-wide/16 v8, 0xc8

    add-long/2addr v6, v8

    invoke-virtual {v1, v6, v7}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 195
    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/ui/ShadowImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 196
    invoke-virtual {v5, v1}, Lcom/thetransitapp/droid/ui/ShadowImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 200
    .end local v0    # "animBig":Landroid/view/animation/Animation;
    .end local v1    # "animSmall":Landroid/view/animation/Animation;
    :cond_1
    invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 201
    const v6, 0x7f050067

    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v10}, Landroid/view/View;->setVisibility(I)V

    .line 202
    return-void
.end method

.method private setupRouteImage(Landroid/view/View;)V
    .locals 9
    .param p1, "view"    # Landroid/view/View;

    .prologue
    const v7, 0x7f050061

    const/4 v6, 0x0

    .line 245
    iget-object v5, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRouteImage()Lcom/thetransitapp/droid/model/RouteImage;

    move-result-object v2

    .line 246
    .local v2, "routeImage":Lcom/thetransitapp/droid/model/RouteImage;
    const v5, 0x7f050054

    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/ui/ShadowImageView;

    .line 248
    .local v0, "imageView":Lcom/thetransitapp/droid/ui/ShadowImageView;
    if-eqz v2, :cond_0

    .line 249
    invoke-virtual {v0}, Lcom/thetransitapp/droid/ui/ShadowImageView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 251
    .local v1, "metrics":Landroid/util/DisplayMetrics;
    const v5, 0x7f050053

    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 252
    .local v3, "routeNumber":Landroid/view/View;
    invoke-virtual {p1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 253
    .local v4, "spacer":Landroid/view/View;
    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 254
    invoke-virtual {v0, v6}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    .line 256
    invoke-virtual {v2, v1, v6}, Lcom/thetransitapp/droid/model/RouteImage;->getUrlWithScreenMetrics(Landroid/util/DisplayMetrics;Z)Ljava/lang/String;

    move-result-object v5

    .line 257
    new-instance v6, Lcom/thetransitapp/droid/widget/route/RouteItem$2;

    invoke-direct {v6, p0, v2, v3, v4}, Lcom/thetransitapp/droid/widget/route/RouteItem$2;-><init>(Lcom/thetransitapp/droid/widget/route/RouteItem;Lcom/thetransitapp/droid/model/RouteImage;Landroid/view/View;Landroid/view/View;)V

    .line 256
    invoke-static {v0, v5, v6}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;Lcom/koushikdutta/urlimageviewhelper/UrlImageViewCallback;)V

    .line 271
    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    iget-object v6, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextColor()I

    move-result v6

    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v6, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v5}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 272
    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    iget-object v6, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextSelectedColor()I

    move-result v6

    .line 273
    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v6, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 272
    invoke-virtual {v0, v5}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setPressedColorFilter(Landroid/graphics/ColorFilter;)V

    .line 274
    const v5, 0x3dcccccd    # 0.1f

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v7}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextShadowOffset()F

    move-result v7

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShadowColor()I

    move-result v8

    invoke-virtual {v0, v5, v6, v7, v8}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setShadowLayer(FFFI)V

    .line 279
    .end local v1    # "metrics":Landroid/util/DisplayMetrics;
    .end local v3    # "routeNumber":Landroid/view/View;
    .end local v4    # "spacer":Landroid/view/View;
    :goto_0
    return-void

    .line 276
    :cond_0
    invoke-virtual {p1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 277
    const/16 v5, 0x8

    invoke-virtual {v0, v5}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method private setupRouteName(Landroid/view/View;Ljava/lang/String;IIZ)V
    .locals 5
    .param p1, "view"    # Landroid/view/View;
    .param p2, "routeName"    # Ljava/lang/String;
    .param p3, "color"    # I
    .param p4, "selectedColor"    # I
    .param p5, "animated"    # Z

    .prologue
    const/4 v3, 0x1

    .line 331
    const v4, 0x7f050056

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    .line 333
    .local v0, "flipper":Landroid/widget/ViewFlipper;
    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v4

    if-nez v4, :cond_0

    move v1, v3

    .line 334
    .local v1, "index":I
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 335
    .local v2, "name":Landroid/widget/TextView;
    invoke-direct {p0, v2, p2, p3, p4}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setTextView(Landroid/widget/TextView;Ljava/lang/String;II)V

    .line 337
    invoke-direct {p0, v0, p5, v3}, Lcom/thetransitapp/droid/widget/route/RouteItem;->showNext(Landroid/widget/ViewFlipper;ZZ)V

    .line 338
    return-void

    .line 333
    .end local v1    # "index":I
    .end local v2    # "name":Landroid/widget/TextView;
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private setupTimeAndFrequency(Landroid/view/View;IILcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Z)V
    .locals 13
    .param p1, "view"    # Landroid/view/View;
    .param p2, "color"    # I
    .param p3, "selectedColor"    # I
    .param p4, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .param p5, "animated"    # Z

    .prologue
    .line 121
    const v1, 0x7f050063

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ViewFlipper;

    .line 122
    .local v7, "flipper":Landroid/widget/ViewFlipper;
    invoke-virtual {v7}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v1

    if-nez v1, :cond_4

    const/4 v9, 0x1

    .line 124
    .local v9, "index":I
    :goto_0
    if-nez p5, :cond_0

    .line 125
    invoke-virtual {v7}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v9

    .line 128
    :cond_0
    invoke-virtual {v7, v9}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 130
    .local v2, "minuteView":Landroid/view/View;
    const v3, 0x7f050068

    const-string v4, ""

    move-object v1, p0

    move v5, p2

    move/from16 v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setTextView(Landroid/view/View;ILjava/lang/String;II)V

    .line 132
    const/4 v12, -0x1

    .line 135
    .local v12, "time":I
    invoke-virtual/range {p4 .. p4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 136
    invoke-virtual/range {p4 .. p4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v10

    .line 137
    .local v10, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/ScheduleItem;->getMinutesRemaining()I

    move-result v11

    .line 139
    .local v11, "min":I
    if-ltz v11, :cond_2

    .line 140
    invoke-virtual/range {p4 .. p4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/ScheduleItem;->isFrequency()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 141
    const v3, 0x7f050068

    const-string v4, "< "

    move-object v1, p0

    move v5, p2

    move/from16 v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setTextView(Landroid/view/View;ILjava/lang/String;II)V

    .line 144
    :cond_1
    move v12, v11

    .line 147
    :cond_2
    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/ScheduleItem;->getRealStopTime()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_5

    const/4 v8, 0x1

    .line 149
    .local v8, "hasRealTime":Z
    :goto_1
    const/4 v1, -0x1

    if-le v12, v1, :cond_6

    const/16 v1, 0x5a

    if-gt v12, v1, :cond_6

    .line 150
    const v3, 0x7f050069

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v1, p0

    move v5, p2

    move/from16 v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setTextView(Landroid/view/View;ILjava/lang/String;II)V

    .line 158
    .end local v10    # "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    .end local v11    # "min":I
    :goto_2
    if-eqz v8, :cond_8

    .line 159
    invoke-direct {p0, v2, p2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setupRealTimeIndicator(Landroid/view/View;I)V

    .line 165
    :goto_3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v3, 0x7f0a0095

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    invoke-static {v1, v3}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 166
    .local v4, "minutes":Ljava/lang/String;
    const v3, 0x7f05006c

    move-object v1, p0

    move v5, p2

    move/from16 v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setTextView(Landroid/view/View;ILjava/lang/String;II)V

    .line 168
    invoke-direct {p0, v2, p2, v12}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setupOutOfServiceIcon(Landroid/view/View;II)V

    .line 170
    if-eqz p5, :cond_3

    .line 171
    const/4 v1, 0x0

    move/from16 v0, p5

    invoke-direct {p0, v7, v0, v1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->showNext(Landroid/widget/ViewFlipper;ZZ)V

    .line 173
    :cond_3
    return-void

    .line 122
    .end local v2    # "minuteView":Landroid/view/View;
    .end local v4    # "minutes":Ljava/lang/String;
    .end local v8    # "hasRealTime":Z
    .end local v9    # "index":I
    .end local v12    # "time":I
    :cond_4
    const/4 v9, 0x0

    goto/16 :goto_0

    .line 147
    .restart local v2    # "minuteView":Landroid/view/View;
    .restart local v9    # "index":I
    .restart local v10    # "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    .restart local v11    # "min":I
    .restart local v12    # "time":I
    :cond_5
    const/4 v8, 0x0

    goto :goto_1

    .line 152
    .restart local v8    # "hasRealTime":Z
    :cond_6
    const v3, 0x7f050069

    const-string v4, ""

    move-object v1, p0

    move v5, p2

    move/from16 v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setTextView(Landroid/view/View;ILjava/lang/String;II)V

    goto :goto_2

    .line 155
    .end local v8    # "hasRealTime":Z
    .end local v10    # "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    .end local v11    # "min":I
    :cond_7
    const/4 v8, 0x0

    .restart local v8    # "hasRealTime":Z
    goto :goto_2

    .line 161
    :cond_8
    const v1, 0x7f05006b

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 162
    const v1, 0x7f050067

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3
.end method

.method private showNext(Landroid/widget/ViewFlipper;ZZ)V
    .locals 2
    .param p1, "flipper"    # Landroid/widget/ViewFlipper;
    .param p2, "animated"    # Z
    .param p3, "near"    # Z

    .prologue
    const/4 v0, 0x0

    .line 341
    if-eqz p2, :cond_2

    .line 342
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz p3, :cond_0

    const v0, 0x7f040003

    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/content/Context;I)V

    .line 343
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz p3, :cond_1

    const v0, 0x7f040005

    :goto_1
    invoke-virtual {p1, v1, v0}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/content/Context;I)V

    .line 349
    :goto_2
    invoke-virtual {p1}, Landroid/widget/ViewFlipper;->showNext()V

    .line 350
    return-void

    .line 342
    :cond_0
    const v0, 0x7f040002

    goto :goto_0

    .line 343
    :cond_1
    const v0, 0x7f040004

    goto :goto_1

    .line 345
    :cond_2
    invoke-virtual {p1, v0}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 346
    invoke-virtual {p1, v0}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V

    goto :goto_2
.end method


# virtual methods
.method public animateMenu()V
    .locals 5

    .prologue
    .line 100
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->routeItemListener:Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 101
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    const v2, 0x7f05005f

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 102
    .local v0, "backgroundView":Landroid/view/View;
    const v1, 0x7f0200a7

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 103
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 105
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/thetransitapp/droid/widget/route/RouteItem$1;

    invoke-direct {v2, p0, v0}, Lcom/thetransitapp/droid/widget/route/RouteItem$1;-><init>(Lcom/thetransitapp/droid/widget/route/RouteItem;Landroid/view/View;)V

    .line 115
    const-wide/16 v3, 0x1f4

    .line 105
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 117
    .end local v0    # "backgroundView":Landroid/view/View;
    :cond_0
    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    return-object v0
.end method

.method public getViewModel()Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    return-object v0
.end method

.method public hideMenu()V
    .locals 2

    .prologue
    .line 302
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->routeItemListener:Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->showMenu(Z)V

    .line 305
    :cond_0
    return-void
.end method

.method public onChangeDirection()Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 282
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->isActive()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0, v2}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getNextItinerary(ZZ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 283
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteItem;->dialog:Landroid/app/AlertDialog;

    if-nez v0, :cond_0

    .line 284
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteItem;->dialog:Landroid/app/AlertDialog;

    .line 285
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteItem;->dialog:Landroid/app/AlertDialog;

    const v2, 0x7f0a005a

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog;->setTitle(I)V

    .line 286
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteItem;->dialog:Landroid/app/AlertDialog;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0a0082

    invoke-virtual {v2, v3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 287
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteItem;->dialog:Landroid/app/AlertDialog;

    const/4 v2, -0x1

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f0a002f

    invoke-virtual {v3, v4}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    .line 288
    const/4 v4, 0x0

    .line 287
    invoke-virtual {v0, v2, v3, v4}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 289
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteItem;->dialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 298
    :cond_0
    :goto_1
    return v1

    :cond_1
    move v0, v2

    .line 282
    goto :goto_0

    .line 295
    :cond_2
    invoke-virtual {p0, v2}, Lcom/thetransitapp/droid/widget/route/RouteItem;->refreshView(Z)V

    .line 297
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v1

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {v1, v0, p0}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->updateRealTimeDataOnList(Landroid/widget/ListView;Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    move v1, v2

    .line 298
    goto :goto_1
.end method

.method public refreshView()V
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/widget/route/RouteItem;->refreshView(Z)V

    .line 57
    return-void
.end method

.method public refreshView(Z)V
    .locals 2
    .param p1, "animated"    # Z

    .prologue
    .line 60
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    invoke-virtual {p0, v0, p1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setView(Landroid/view/View;Z)V

    .line 63
    :cond_0
    return-void
.end method

.method public setView(Landroid/view/View;Z)V
    .locals 11
    .param p1, "view"    # Landroid/view/View;
    .param p2, "animated"    # Z

    .prologue
    .line 66
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    .line 67
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->routeItemListener:Lcom/thetransitapp/droid/widget/route/RouteItemListener;

    invoke-virtual {v0, p1}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->setView(Landroid/view/View;)V

    .line 68
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextColor()I

    move-result v2

    .line 71
    .local v2, "color":I
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextSelectedColor()I

    move-result v3

    .line 72
    .local v3, "selectedColor":I
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v4

    .line 74
    .local v4, "itinerary":Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getOngoingScheduleItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->isPastItem()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    :cond_0
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->loadOngoingScheduleItems()V

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v5, p2

    .line 79
    invoke-direct/range {v0 .. v5}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setupTimeAndFrequency(Landroid/view/View;IILcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Z)V

    .line 81
    const v7, 0x7f050053

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShortName()Ljava/lang/String;

    move-result-object v8

    move-object v5, p0

    move-object v6, p1

    move v9, v2

    move v10, v3

    invoke-direct/range {v5 .. v10}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setTextView(Landroid/view/View;ILjava/lang/String;II)V

    .line 82
    const v7, 0x7f050057

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Stop;->getName()Ljava/lang/String;

    move-result-object v8

    move-object v5, p0

    move-object v6, p1

    move v9, v2

    move v10, v3

    invoke-direct/range {v5 .. v10}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setTextView(Landroid/view/View;ILjava/lang/String;II)V

    .line 84
    invoke-direct {p0, p1, v2, v3}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setupBranchCode(Landroid/view/View;II)V

    .line 85
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setupRouteImage(Landroid/view/View;)V

    .line 86
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setupFavorite(Landroid/view/View;)V

    .line 88
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentHeadsign()Ljava/lang/String;

    move-result-object v7

    move-object v5, p0

    move-object v6, p1

    move v8, v2

    move v9, v3

    move v10, p2

    invoke-direct/range {v5 .. v10}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setupRouteName(Landroid/view/View;Ljava/lang/String;IIZ)V

    .line 89
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/widget/route/RouteItem;->setupDirections(Landroid/view/View;)V

    .line 91
    const v0, 0x7f050051

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->viewModel:Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    invoke-static {v0, v1}, Lcom/thetransitapp/droid/util/BackgroundUtility;->setGlossyBackground(Landroid/view/View;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    .line 92
    return-void
.end method

.method public shakeTime()V
    .locals 3

    .prologue
    .line 95
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f040001

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 96
    .local v0, "anim":Landroid/view/animation/Animation;
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItem;->view:Landroid/view/View;

    const v2, 0x7f050063

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 97
    return-void
.end method
