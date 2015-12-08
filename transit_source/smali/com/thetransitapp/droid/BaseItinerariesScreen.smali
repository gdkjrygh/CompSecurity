.class public abstract Lcom/thetransitapp/droid/BaseItinerariesScreen;
.super Lcom/thetransitapp/droid/BaseMapScreen;
.source "BaseItinerariesScreen.java"


# instance fields
.field private directionImage:Landroid/widget/ImageView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050055
    .end annotation
.end field

.field private flipper:Landroid/widget/ViewFlipper;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050056
    .end annotation
.end field

.field private routeContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050052
    .end annotation
.end field

.field private routeContent:Landroid/widget/LinearLayout;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050051
    .end annotation
.end field

.field private routeImage:Lcom/thetransitapp/droid/ui/ShadowImageView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050054
    .end annotation
.end field

.field private routeNumber:Landroid/widget/TextView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050053
    .end annotation
.end field

.field private stopName:Landroid/widget/TextView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050057
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V
    .locals 0
    .param p1, "screen"    # Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/BaseMapScreen;-><init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 46
    return-void
.end method

.method private setDirections(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 8
    .param p1, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    const v5, 0x7f080015

    const/4 v7, 0x0

    const v4, 0x3f333333    # 0.7f

    const/4 v6, 0x1

    .line 119
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    mul-float/2addr v3, v4

    invoke-static {p1, v3}, Lcom/thetransitapp/droid/util/BitmapUtility;->getArrow(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;F)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 120
    .local v0, "arrows":Landroid/graphics/Bitmap;
    iget-object v3, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->directionImage:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 121
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    mul-float/2addr v3, v4

    .line 120
    invoke-static {p1, v3, v6}, Lcom/thetransitapp/droid/util/BitmapUtility;->getArrow(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;FZ)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 123
    .local v2, "pressedArrows":Landroid/graphics/Bitmap;
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 124
    .local v1, "drawable":Landroid/graphics/drawable/StateListDrawable;
    new-array v3, v6, [I

    const v4, -0x10100a7

    aput v4, v3, v7

    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v3, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 125
    new-array v3, v6, [I

    const v4, 0x10100a7

    aput v4, v3, v7

    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 126
    invoke-direct {v4, v5, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 125
    invoke-virtual {v1, v3, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 128
    iget-object v3, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->directionImage:Landroid/widget/ImageView;

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 129
    return-void
.end method

.method private setTextView(Landroid/widget/TextView;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 7
    .param p1, "view"    # Landroid/widget/TextView;
    .param p2, "text"    # Ljava/lang/String;
    .param p3, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 88
    new-instance v0, Landroid/content/res/ColorStateList;

    new-array v1, v6, [[I

    new-array v2, v5, [I

    const v3, -0x10100a7

    aput v3, v2, v4

    aput-object v2, v1, v4

    .line 89
    new-array v2, v5, [I

    const v3, 0x10100a7

    aput v3, v2, v4

    aput-object v2, v1, v5

    new-array v2, v6, [I

    invoke-virtual {p3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextColor()I

    move-result v3

    aput v3, v2, v4

    .line 90
    invoke-virtual {p3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextSelectedColor()I

    move-result v3

    aput v3, v2, v5

    .line 88
    invoke-direct {v0, v1, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 92
    .local v0, "colorStateList":Landroid/content/res/ColorStateList;
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 93
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    iget-object v1, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeNumber:Landroid/widget/TextView;

    if-ne p1, v1, :cond_0

    .line 96
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/thetransitapp/droid/util/FontUtility;->getInterstateBold(Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 99
    :cond_0
    const v1, 0x3dcccccd    # 0.1f

    const/4 v2, 0x0

    invoke-virtual {p3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextShadowOffset()F

    move-result v3

    invoke-virtual {p3}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShadowColor()I

    move-result v4

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 100
    return-void
.end method

.method private setupRouteName(Ljava/lang/String;ZLcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V
    .locals 5
    .param p1, "routeName"    # Ljava/lang/String;
    .param p2, "animated"    # Z
    .param p3, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .prologue
    const/4 v3, 0x0

    .line 103
    iget-object v2, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->flipper:Landroid/widget/ViewFlipper;

    invoke-virtual {v2}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x1

    .line 104
    .local v0, "index":I
    :goto_0
    iget-object v2, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->flipper:Landroid/widget/ViewFlipper;

    invoke-virtual {v2, v0}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 105
    .local v1, "name":Landroid/widget/TextView;
    invoke-direct {p0, v1, p1, p3}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->setTextView(Landroid/widget/TextView;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    .line 107
    if-eqz p2, :cond_1

    .line 108
    iget-object v2, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->flipper:Landroid/widget/ViewFlipper;

    iget-object v3, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->flipper:Landroid/widget/ViewFlipper;

    invoke-virtual {v3}, Landroid/widget/ViewFlipper;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f040003

    invoke-virtual {v2, v3, v4}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/content/Context;I)V

    .line 109
    iget-object v2, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->flipper:Landroid/widget/ViewFlipper;

    iget-object v3, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->flipper:Landroid/widget/ViewFlipper;

    invoke-virtual {v3}, Landroid/widget/ViewFlipper;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f040005

    invoke-virtual {v2, v3, v4}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/content/Context;I)V

    .line 115
    :goto_1
    iget-object v2, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->flipper:Landroid/widget/ViewFlipper;

    invoke-virtual {v2}, Landroid/widget/ViewFlipper;->showNext()V

    .line 116
    return-void

    .line 103
    .end local v0    # "index":I
    .end local v1    # "name":Landroid/widget/TextView;
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 111
    .restart local v0    # "index":I
    .restart local v1    # "name":Landroid/widget/TextView;
    :cond_1
    iget-object v2, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->flipper:Landroid/widget/ViewFlipper;

    invoke-virtual {v2, v3}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 112
    iget-object v2, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->flipper:Landroid/widget/ViewFlipper;

    invoke-virtual {v2, v3}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V

    goto :goto_1
.end method


# virtual methods
.method public shakeRoute()V
    .locals 3

    .prologue
    .line 49
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f040001

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 50
    .local v0, "anim":Landroid/view/animation/Animation;
    iget-object v1, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 51
    return-void
.end method

.method public updateContent(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Z)V
    .locals 11
    .param p1, "viewModel"    # Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    .param p2, "animated"    # Z

    .prologue
    const/16 v10, 0x8

    const/4 v9, 0x0

    .line 54
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeNumber:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShortName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v4, v5, p1}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->setTextView(Landroid/widget/TextView;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    .line 55
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getRouteImage()Lcom/thetransitapp/droid/model/RouteImage;

    move-result-object v2

    .line 57
    .local v2, "routeImage":Lcom/thetransitapp/droid/model/RouteImage;
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RouteImage;->isReplaceName()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 58
    invoke-virtual {p0}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 59
    .local v1, "metrics":Landroid/util/DisplayMetrics;
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeImage:Lcom/thetransitapp/droid/ui/ShadowImageView;

    invoke-virtual {v2, v1, v9}, Lcom/thetransitapp/droid/model/RouteImage;->getUrlWithScreenMetrics(Landroid/util/DisplayMetrics;Z)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->setUrlDrawable(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 61
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeImage:Lcom/thetransitapp/droid/ui/ShadowImageView;

    invoke-virtual {v4, v9}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    .line 62
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeImage:Lcom/thetransitapp/droid/ui/ShadowImageView;

    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextColor()I

    move-result v6

    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v6, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v4, v5}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 63
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeImage:Lcom/thetransitapp/droid/ui/ShadowImageView;

    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextColor()I

    move-result v6

    const v7, -0x44000001

    and-int/2addr v6, v7

    .line 64
    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v6, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 63
    invoke-virtual {v4, v5}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setPressedColorFilter(Landroid/graphics/ColorFilter;)V

    .line 65
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeImage:Lcom/thetransitapp/droid/ui/ShadowImageView;

    const v5, 0x3dcccccd    # 0.1f

    const/4 v6, 0x0

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getTextShadowOffset()F

    move-result v7

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShadowColor()I

    move-result v8

    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setShadowLayer(FFFI)V

    .line 66
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeNumber:Landroid/widget/TextView;

    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 72
    .end local v1    # "metrics":Landroid/util/DisplayMetrics;
    :goto_0
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentHeadsign()Ljava/lang/String;

    move-result-object v3

    .line 73
    .local v3, "routeName":Ljava/lang/String;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getBranch()Ljava/lang/String;

    move-result-object v0

    .line 75
    .local v0, "branchName":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 76
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, " - "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 79
    :cond_0
    invoke-direct {p0, v3, p2, p1}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->setupRouteName(Ljava/lang/String;ZLcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    .line 80
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->stopName:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getClosestStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/Stop;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v4, v5, p1}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->setTextView(Landroid/widget/TextView;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    .line 82
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeContent:Landroid/widget/LinearLayout;

    invoke-static {v4, p1, v9}, Lcom/thetransitapp/droid/util/BackgroundUtility;->setGlossyBackground(Landroid/view/View;Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;Z)V

    .line 84
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/BaseItinerariesScreen;->setDirections(Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;)V

    .line 85
    return-void

    .line 68
    .end local v0    # "branchName":Ljava/lang/String;
    .end local v3    # "routeName":Ljava/lang/String;
    :cond_1
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeNumber:Landroid/widget/TextView;

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 69
    iget-object v4, p0, Lcom/thetransitapp/droid/BaseItinerariesScreen;->routeImage:Lcom/thetransitapp/droid/ui/ShadowImageView;

    invoke-virtual {v4, v10}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    goto :goto_0
.end method
