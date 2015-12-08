.class public Lcom/thetransitapp/droid/widget/route/RouteItemListener;
.super Ljava/lang/Object;
.source "RouteItemListener.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/animation/Animation$AnimationListener;


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType:[I = null

.field private static final SWIPE_THRESHOLD:F = 100.0f


# instance fields
.field private clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

.field private content:Landroid/view/View;

.field private contentBackground:Landroid/view/View;

.field private eventCanceled:Z

.field private longClicked:Z

.field private menu:Landroid/view/View;

.field private menuOpen:Z

.field private final preferences:Landroid/content/SharedPreferences;

.field private final routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

.field private slideThreshold:F

.field private startX:F

.field private top:F

.field private final uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType()[I
    .locals 3

    .prologue
    .line 22
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->$SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->values()[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->DEFAULT:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_6

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->FAVORITE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_5

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MAP:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_4

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MENU_OPEN:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->NONE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_2

    :goto_5
    :try_start_5
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->SWITCH_DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_1

    :goto_6
    :try_start_6
    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->TIMETABLE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_0

    :goto_7
    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->$SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_7

    :catch_1
    move-exception v1

    goto :goto_6

    :catch_2
    move-exception v1

    goto :goto_5

    :catch_3
    move-exception v1

    goto :goto_4

    :catch_4
    move-exception v1

    goto :goto_3

    :catch_5
    move-exception v1

    goto :goto_2

    :catch_6
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;Lcom/thetransitapp/droid/widget/route/RouteItem;Landroid/content/SharedPreferences;)V
    .locals 1
    .param p1, "uiHandlers"    # Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;
    .param p2, "routeItem"    # Lcom/thetransitapp/droid/widget/route/RouteItem;
    .param p3, "preferences"    # Landroid/content/SharedPreferences;

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->DEFAULT:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    .line 43
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    .line 44
    iput-object p2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    .line 45
    iput-object p3, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->preferences:Landroid/content/SharedPreferences;

    .line 46
    return-void
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/widget/route/RouteItemListener;)Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    return-object v0
.end method

.method static synthetic access$2(Lcom/thetransitapp/droid/widget/route/RouteItemListener;)Lcom/thetransitapp/droid/widget/route/RouteItem;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    return-object v0
.end method

.method private calculateLeft(F)F
    .locals 12
    .param p1, "left"    # F

    .prologue
    const/high16 v5, 0x42c80000    # 100.0f

    const/4 v3, 0x0

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 213
    cmpl-float v4, p1, v5

    if-gtz v4, :cond_0

    const/high16 v4, -0x3d380000    # -100.0f

    cmpg-float v4, p1, v4

    if-gez v4, :cond_3

    .line 214
    :cond_0
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->content:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v2, v4

    .line 215
    .local v2, "w":F
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v4

    sub-float v0, v4, v5

    .line 216
    .local v0, "d":F
    float-to-double v4, v0

    float-to-double v6, v0

    const-wide v8, 0x3fd6666666666666L    # 0.35

    mul-double/2addr v6, v8

    float-to-double v8, v2

    div-double/2addr v6, v8

    add-double/2addr v6, v10

    div-double v6, v10, v6

    sub-double v6, v10, v6

    float-to-double v8, v2

    mul-double/2addr v6, v8

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    add-double/2addr v4, v6

    double-to-float v1, v4

    .line 218
    .local v1, "newLeft":F
    cmpg-float v3, p1, v3

    if-gez v3, :cond_1

    .line 219
    const/high16 v3, -0x40800000    # -1.0f

    mul-float/2addr v1, v3

    :cond_1
    move p1, v1

    .line 229
    .end local v0    # "d":F
    .end local v1    # "newLeft":F
    .end local v2    # "w":F
    .end local p1    # "left":F
    :cond_2
    :goto_0
    return p1

    .line 225
    .restart local p1    # "left":F
    :cond_3
    const/high16 v4, 0x40400000    # 3.0f

    cmpg-float v4, p1, v4

    if-gez v4, :cond_2

    const/high16 v4, -0x3fc00000    # -3.0f

    cmpl-float v4, p1, v4

    if-lez v4, :cond_2

    move p1, v3

    .line 226
    goto :goto_0
.end method

.method private setClickListeners(Landroid/view/View;)V
    .locals 5
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 255
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->content:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 256
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->content:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 258
    const v0, 0x7f05005c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 259
    new-instance v1, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    sget-object v3, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MAP:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-direct {v1, v2, v3, v4}, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;-><init>(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    .line 258
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 260
    const v0, 0x7f05005b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 261
    new-instance v1, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    sget-object v3, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->SWITCH_DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-direct {v1, v2, v3, v4}, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;-><init>(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    .line 260
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 262
    const v0, 0x7f05005d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 263
    new-instance v1, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    sget-object v3, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->FAVORITE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-direct {v1, v2, v3, v4}, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;-><init>(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    .line 262
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 264
    const v0, 0x7f05005e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 265
    new-instance v1, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    sget-object v3, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->TIMETABLE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-direct {v1, v2, v3, v4}, Lcom/thetransitapp/droid/widget/route/RouteActionClickListener;-><init>(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    .line 264
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 269
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->content:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setLongClickable(Z)V

    .line 270
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->content:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 278
    return-void
.end method

.method private setClickType(F)V
    .locals 1
    .param p1, "transX"    # F

    .prologue
    .line 233
    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    .line 234
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MAP:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    .line 238
    :cond_0
    :goto_0
    return-void

    .line 235
    :cond_1
    const/high16 v0, -0x3d380000    # -100.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 236
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->SWITCH_DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    goto :goto_0
.end method

.method private slideBack(Landroid/view/View;F)V
    .locals 4
    .param p1, "view"    # Landroid/view/View;
    .param p2, "fromX"    # F
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 242
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    invoke-direct {v0, p2, v3, v3, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 243
    .local v0, "a":Landroid/view/animation/Animation;
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 244
    const-wide/16 v1, 0x96

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 246
    invoke-virtual {p1, v3}, Landroid/view/View;->setTranslationX(F)V

    .line 247
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 249
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    sget-object v2, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MAP:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    sget-object v2, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->SWITCH_DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    if-ne v1, v2, :cond_1

    .line 250
    :cond_0
    invoke-virtual {v0, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 252
    :cond_1
    return-void
.end method

.method private swipeItem(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6
    .param p1, "view"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 104
    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v1

    .line 106
    .local v1, "transX":F
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    :goto_0
    move v2, v3

    .line 170
    :pswitch_0
    return v2

    .line 108
    :pswitch_1
    sget-object v2, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->DEFAULT:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iput-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    .line 109
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->contentBackground:Landroid/view/View;

    iget-boolean v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->menuOpen:Z

    if-eqz v2, :cond_0

    const v2, 0x7f0200a6

    :goto_1
    invoke-virtual {v4, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 111
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iput v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->startX:F

    .line 112
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iput v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->top:F

    .line 114
    iput-boolean v3, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->eventCanceled:Z

    .line 115
    iput-boolean v3, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->longClicked:Z

    goto :goto_0

    .line 110
    :cond_0
    const v2, 0x7f0200a7

    goto :goto_1

    .line 119
    :pswitch_2
    iget-boolean v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->longClicked:Z

    if-eqz v2, :cond_1

    .line 120
    invoke-direct {p0, p1, v1}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->slideBack(Landroid/view/View;F)V

    goto :goto_0

    .line 124
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    add-float/2addr v2, v1

    iget v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->startX:F

    sub-float v0, v2, v4

    .line 125
    .local v0, "left":F
    iget v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->top:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    add-float/2addr v2, v4

    iput v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->top:F

    .line 127
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    sget-object v4, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->NONE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    if-eq v2, v4, :cond_2

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    sget-object v4, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->DEFAULT:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    if-ne v2, v4, :cond_7

    .line 128
    :cond_2
    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->calculateLeft(F)F

    move-result v0

    .line 130
    const/high16 v2, 0x41a00000    # 20.0f

    cmpl-float v2, v0, v2

    if-gtz v2, :cond_3

    const/high16 v2, -0x3e600000    # -20.0f

    cmpg-float v2, v0, v2

    if-gez v2, :cond_4

    .line 131
    :cond_3
    sget-object v2, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->NONE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iput-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    .line 132
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->contentBackground:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 133
    invoke-virtual {p1, v3}, Landroid/view/View;->setPressed(Z)V

    .line 139
    :cond_4
    :goto_2
    iget v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->slideThreshold:F

    cmpl-float v2, v0, v2

    if-gtz v2, :cond_5

    iget v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->slideThreshold:F

    neg-float v2, v2

    cmpg-float v2, v0, v2

    if-ltz v2, :cond_5

    iget v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->top:F

    iget v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->slideThreshold:F

    cmpl-float v2, v2, v4

    if-gtz v2, :cond_5

    .line 140
    iget v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->top:F

    iget v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->slideThreshold:F

    neg-float v4, v4

    cmpg-float v2, v2, v4

    if-gez v2, :cond_6

    .line 141
    :cond_5
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    invoke-interface {v2}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;->viewMovedSieway()V

    .line 144
    :cond_6
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 145
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    goto/16 :goto_0

    .line 136
    :cond_7
    const/4 v0, 0x0

    goto :goto_2

    .line 149
    .end local v0    # "left":F
    :pswitch_3
    invoke-direct {p0, v1}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->setClickType(F)V

    .line 150
    invoke-direct {p0, p1, v1}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->slideBack(Landroid/view/View;F)V

    .line 152
    invoke-static {}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->$SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType()[I

    move-result-object v4

    iget-object v5, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_1

    goto/16 :goto_0

    .line 164
    :pswitch_4
    invoke-virtual {p1, v3}, Landroid/view/View;->setPressed(Z)V

    .line 165
    iget-object v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    invoke-interface {v4}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;->viewMovedSieway()V

    .line 166
    iput-boolean v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->eventCanceled:Z

    goto/16 :goto_0

    .line 106
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_4
    .end packed-switch

    .line 152
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    const/4 v1, 0x0

    .line 198
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->content:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->onClick(Landroid/view/View;)V

    .line 199
    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->showMenu(Z)V

    .line 201
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->content:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 202
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 210
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 206
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "view"    # Landroid/view/View;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 61
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    sget-object v3, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->DEFAULT:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    if-ne v0, v3, :cond_0

    .line 62
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->menu:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->showMenu(Z)V

    .line 63
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "menuPressed"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->NONE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    if-eq v0, v1, :cond_1

    .line 67
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->clickType:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    invoke-interface {v0, v1, v3}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;->onClick(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;)V

    .line 68
    invoke-virtual {p1, v2}, Landroid/view/View;->setPressed(Z)V

    .line 70
    :cond_1
    return-void

    :cond_2
    move v0, v2

    .line 62
    goto :goto_0
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v4, 0x1

    .line 74
    iget-boolean v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->eventCanceled:Z

    if-nez v0, :cond_0

    .line 75
    iget v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->startX:F

    const v1, 0x7f050063

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 76
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->TIME:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    .line 77
    const v3, 0x7f050066

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 76
    invoke-interface {v0, v1, v2, v3}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;->onLongClick(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;Landroid/view/View;)V

    .line 83
    :goto_0
    iput-boolean v4, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->longClicked:Z

    .line 86
    :cond_0
    return v4

    .line 79
    :cond_1
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->uiHandlers:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->routeItem:Lcom/thetransitapp/droid/widget/route/RouteItem;

    .line 80
    const v3, 0x7f050060

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 79
    invoke-interface {v0, v1, v2, v3}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;->onLongClick(Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;Lcom/thetransitapp/droid/widget/route/RouteItem;Landroid/view/View;)V

    goto :goto_0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    .line 91
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 92
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->startX:F

    .line 95
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    .line 96
    invoke-direct {p0, p1, p2}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->swipeItem(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    .line 99
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setView(Landroid/view/View;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080028

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->slideThreshold:F

    .line 50
    const v0, 0x7f05005f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->contentBackground:Landroid/view/View;

    .line 51
    const v0, 0x7f050051

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->content:Landroid/view/View;

    .line 52
    const v0, 0x7f05005a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->menu:Landroid/view/View;

    .line 54
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->menu:Landroid/view/View;

    iget-boolean v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->menuOpen:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 56
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->setClickListeners(Landroid/view/View;)V

    .line 57
    return-void

    .line 54
    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public showMenu(Z)V
    .locals 2
    .param p1, "show"    # Z

    .prologue
    .line 174
    iput-boolean p1, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->menuOpen:Z

    .line 176
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->menu:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 177
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->menu:Landroid/view/View;

    new-instance v1, Lcom/thetransitapp/droid/widget/route/RouteItemListener$1;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/widget/route/RouteItemListener$1;-><init>(Lcom/thetransitapp/droid/widget/route/RouteItemListener;)V

    invoke-static {v0, v1}, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation;->expand(Landroid/view/View;Landroid/view/animation/Animation$AnimationListener;)V

    .line 194
    :cond_0
    :goto_0
    return-void

    .line 191
    :cond_1
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->menu:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/route/RouteItemListener;->menu:Landroid/view/View;

    invoke-static {v0}, Lcom/thetransitapp/droid/util/ExpandCollapseAnimation;->collapse(Landroid/view/View;)V

    goto :goto_0
.end method
