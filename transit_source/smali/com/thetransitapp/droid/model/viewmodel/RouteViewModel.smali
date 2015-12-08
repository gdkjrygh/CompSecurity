.class public Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;
.super Ljava/lang/Object;
.source "RouteViewModel.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x438c04e2265098a4L


# instance fields
.field private annotationColor:I

.field private arrowColor:I

.field private arrowSelectedColor:I

.field private arrowShadowColor:I

.field private color:I

.field private feed:Lcom/thetransitapp/droid/model/Feed;

.field private glossColor:I

.field private id:Ljava/lang/String;

.field private longName:Ljava/lang/String;

.field private pathColor:I

.field private route:Lcom/thetransitapp/droid/model/Route;

.field private routeImage:Lcom/thetransitapp/droid/model/RouteImage;

.field private shadowColor:I

.field private shortName:Ljava/lang/String;

.field private starColor:I

.field private textColor:I

.field private textSelectedColor:I

.field private textShadowOffset:F

.field private topGlossColor:I

.field private type:Lcom/thetransitapp/droid/model/Route$RouteType;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    return-void
.end method

.method public constructor <init>(Lcom/thetransitapp/droid/model/Route;)V
    .locals 1
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->route:Lcom/thetransitapp/droid/model/Route;

    .line 50
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getType()Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->setType(Lcom/thetransitapp/droid/model/Route$RouteType;)V

    .line 52
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->id:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getShortName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->setShortName(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getLongName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->setLongName(Ljava/lang/String;)V

    .line 56
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getColor()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->setColor(I)V

    .line 57
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->createColorsDerivedFromMainColors()V

    .line 58
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getTextColor()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->setTextColor(I)V

    .line 59
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->createColorsDerivedFromTextColors()V

    .line 60
    return-void
.end method

.method private baseGlossColor()I
    .locals 7

    .prologue
    .line 107
    iget v3, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    move-result v2

    .line 108
    .local v2, "red":I
    iget v3, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v1

    .line 109
    .local v1, "green":I
    iget v3, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    .line 111
    .local v0, "blue":I
    const/16 v3, 0xff

    invoke-direct {p0, v2}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->componentAfterOverlay(I)I

    move-result v4

    invoke-direct {p0, v1}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->componentAfterOverlay(I)I

    move-result v5

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->componentAfterOverlay(I)I

    move-result v6

    invoke-static {v3, v4, v5, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    return v3
.end method

.method private colorByInterpolatingColors(IID)I
    .locals 16
    .param p1, "color"    # I
    .param p2, "secondColor"    # I
    .param p3, "d"    # D

    .prologue
    .line 132
    invoke-static/range {p1 .. p1}, Landroid/graphics/Color;->red(I)I

    move-result v6

    .line 133
    .local v6, "r":I
    invoke-static/range {p1 .. p1}, Landroid/graphics/Color;->green(I)I

    move-result v4

    .line 134
    .local v4, "g":I
    invoke-static/range {p1 .. p1}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    .line 135
    .local v2, "b":I
    invoke-static/range {p1 .. p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    .line 137
    .local v0, "a":I
    invoke-static/range {p2 .. p2}, Landroid/graphics/Color;->red(I)I

    move-result v7

    .line 138
    .local v7, "r2":I
    invoke-static/range {p2 .. p2}, Landroid/graphics/Color;->green(I)I

    move-result v5

    .line 139
    .local v5, "g2":I
    invoke-static/range {p2 .. p2}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    .line 140
    .local v3, "b2":I
    invoke-static/range {p2 .. p2}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    .line 142
    .local v1, "a2":I
    int-to-double v12, v6

    sub-int v14, v7, v6

    int-to-double v14, v14

    mul-double v14, v14, p3

    add-double/2addr v12, v14

    double-to-int v11, v12

    .line 143
    .local v11, "resultRed":I
    int-to-double v12, v4

    sub-int v14, v5, v4

    int-to-double v14, v14

    mul-double v14, v14, p3

    add-double/2addr v12, v14

    double-to-int v10, v12

    .line 144
    .local v10, "resultGreen":I
    int-to-double v12, v2

    sub-int v14, v3, v2

    int-to-double v14, v14

    mul-double v14, v14, p3

    add-double/2addr v12, v14

    double-to-int v9, v12

    .line 145
    .local v9, "resultBlue":I
    int-to-double v12, v0

    sub-int v14, v1, v0

    int-to-double v14, v14

    mul-double v14, v14, p3

    add-double/2addr v12, v14

    double-to-int v8, v12

    .line 147
    .local v8, "resultAlpha":I
    invoke-static {v8, v11, v10, v9}, Landroid/graphics/Color;->argb(IIII)I

    move-result v12

    return v12
.end method

.method private componentAfterOverlay(I)I
    .locals 3
    .param p1, "component"    # I

    .prologue
    .line 115
    const/16 v2, 0x7f

    if-le p1, v2, :cond_0

    .line 116
    rsub-int v2, p1, 0xff

    mul-int/lit8 v1, v2, 0x2

    .line 117
    .local v1, "value":I
    rsub-int v2, p1, 0xff

    sub-int v0, p1, v2

    .line 118
    .local v0, "min":I
    add-int v2, v1, v0

    .line 120
    .end local v0    # "min":I
    .end local v1    # "value":I
    :goto_0
    return v2

    :cond_0
    mul-int/lit8 v2, p1, 0x2

    goto :goto_0
.end method

.method private createColorsDerivedFromMainColors()V
    .locals 5

    .prologue
    const/high16 v4, -0x1000000

    .line 77
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->baseGlossColor()I

    move-result v0

    .line 78
    .local v0, "baseGlossColor":I
    iget v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->colorByInterpolatingColors(IID)I

    move-result v1

    iput v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->topGlossColor:I

    .line 79
    iget v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->colorByInterpolatingColors(IID)I

    move-result v1

    iput v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->glossColor:I

    .line 81
    iget v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    invoke-direct {p0, v1}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shouldUseWhiteForContrast(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 82
    iget v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    const-wide v2, 0x3fd999999999999aL    # 0.4

    invoke-direct {p0, v1, v4, v2, v3}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->colorByInterpolatingColors(IID)I

    move-result v1

    iput v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->starColor:I

    .line 85
    :goto_0
    return-void

    .line 84
    :cond_0
    iget v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    const-wide v2, 0x3fd3333333333333L    # 0.3

    invoke-direct {p0, v1, v4, v2, v3}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->colorByInterpolatingColors(IID)I

    move-result v1

    iput v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->starColor:I

    goto :goto_0
.end method

.method private createColorsDerivedFromTextColors()V
    .locals 7

    .prologue
    const/high16 v6, -0x1000000

    const-wide v4, 0x3fe6666666666666L    # 0.7

    const-wide v2, 0x3fd3333333333333L    # 0.3

    const/16 v1, 0x26

    .line 88
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textColor:I

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shouldUseWhiteForContrast(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->topGlossColor:I

    iput v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shadowColor:I

    .line 90
    iput v6, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->pathColor:I

    .line 91
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->annotationColor:I

    .line 92
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textShadowOffset:F

    .line 100
    :goto_0
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textColor:I

    iget v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    invoke-direct {p0, v0, v1, v4, v5}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->colorByInterpolatingColors(IID)I

    move-result v0

    iput v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->arrowColor:I

    .line 101
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shadowColor:I

    iget v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    invoke-direct {p0, v0, v1, v4, v5}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->colorByInterpolatingColors(IID)I

    move-result v0

    iput v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->arrowShadowColor:I

    .line 102
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textColor:I

    iget v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shadowColor:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->colorByInterpolatingColors(IID)I

    move-result v0

    iput v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textSelectedColor:I

    .line 103
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->arrowColor:I

    iget v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shadowColor:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->colorByInterpolatingColors(IID)I

    move-result v0

    iput v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->arrowSelectedColor:I

    .line 104
    return-void

    .line 94
    :cond_0
    iput v6, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shadowColor:I

    .line 95
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    iput v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->pathColor:I

    .line 96
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    iput v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->annotationColor:I

    .line 97
    const/high16 v0, -0x40000000    # -2.0f

    iput v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textShadowOffset:F

    goto :goto_0
.end method

.method private shouldUseWhiteForContrast(I)Z
    .locals 11
    .param p1, "color"    # I

    .prologue
    .line 124
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    .line 125
    .local v2, "red":I
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    .line 126
    .local v1, "green":I
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    .line 128
    .local v0, "blue":I
    const-wide v3, 0x405fc00000000000L    # 127.0

    const-wide v5, 0x3fcb367a0f9096bcL    # 0.2126

    int-to-double v7, v2

    mul-double/2addr v5, v7

    const-wide v7, 0x3fe6e2eb1c432ca5L    # 0.7152

    int-to-double v9, v1

    mul-double/2addr v7, v9

    add-double/2addr v5, v7

    const-wide v7, 0x3fb27bb2fec56d5dL    # 0.0722

    int-to-double v9, v0

    mul-double/2addr v7, v9

    add-double/2addr v5, v7

    cmpl-double v3, v3, v5

    if-ltz v3, :cond_0

    const/4 v3, 0x1

    :goto_0
    return v3

    :cond_0
    const/4 v3, 0x0

    goto :goto_0
.end method


# virtual methods
.method public getAnnotationColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->annotationColor:I

    return v0
.end method

.method public getArrowColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->arrowColor:I

    return v0
.end method

.method public getArrowSelectedColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->arrowSelectedColor:I

    return v0
.end method

.method public getArrowShadowColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->arrowShadowColor:I

    return v0
.end method

.method public getColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    return v0
.end method

.method public getFeed()Lcom/thetransitapp/droid/model/Feed;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->feed:Lcom/thetransitapp/droid/model/Feed;

    return-object v0
.end method

.method public getGlossColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->glossColor:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLongName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->longName:Ljava/lang/String;

    return-object v0
.end method

.method public getPathColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->pathColor:I

    return v0
.end method

.method public getRoute()Lcom/thetransitapp/droid/model/Route;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->route:Lcom/thetransitapp/droid/model/Route;

    return-object v0
.end method

.method public getRouteImage()Lcom/thetransitapp/droid/model/RouteImage;
    .locals 4

    .prologue
    .line 63
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->routeImage:Lcom/thetransitapp/droid/model/RouteImage;

    if-nez v1, :cond_1

    .line 64
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->feed:Lcom/thetransitapp/droid/model/Feed;

    if-eqz v1, :cond_1

    .line 65
    iget-object v1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->feed:Lcom/thetransitapp/droid/model/Feed;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Feed;->getRouteImages()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->routeImage:Lcom/thetransitapp/droid/model/RouteImage;

    :goto_0
    return-object v0

    .line 65
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/RouteImage;

    .line 66
    .local v0, "image":Lcom/thetransitapp/droid/model/RouteImage;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RouteImage;->getRouteIds()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->id:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0
.end method

.method public getShadowColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shadowColor:I

    return v0
.end method

.method public getShortName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shortName:Ljava/lang/String;

    return-object v0
.end method

.method public getStarColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->starColor:I

    return v0
.end method

.method public getTextColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textColor:I

    return v0
.end method

.method public getTextSelectedColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textSelectedColor:I

    return v0
.end method

.method public getTextShadowOffset()F
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textShadowOffset:F

    return v0
.end method

.method public getTopGlossColor()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->topGlossColor:I

    return v0
.end method

.method public getType()Lcom/thetransitapp/droid/model/Route$RouteType;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->type:Lcom/thetransitapp/droid/model/Route$RouteType;

    return-object v0
.end method

.method public setAnnotationColor(I)V
    .locals 0
    .param p1, "annotationColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->annotationColor:I

    return-void
.end method

.method public setArrowColor(I)V
    .locals 0
    .param p1, "arrowColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->arrowColor:I

    return-void
.end method

.method public setArrowSelectedColor(I)V
    .locals 0
    .param p1, "arrowSelectedColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->arrowSelectedColor:I

    return-void
.end method

.method public setArrowShadowColor(I)V
    .locals 0
    .param p1, "arrowShadowColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->arrowShadowColor:I

    return-void
.end method

.method public setColor(I)V
    .locals 0
    .param p1, "color"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->color:I

    return-void
.end method

.method public setFeed(Lcom/thetransitapp/droid/model/Feed;)V
    .locals 0
    .param p1, "feed"    # Lcom/thetransitapp/droid/model/Feed;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->feed:Lcom/thetransitapp/droid/model/Feed;

    return-void
.end method

.method public setGlossColor(I)V
    .locals 0
    .param p1, "glossColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->glossColor:I

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->id:Ljava/lang/String;

    return-void
.end method

.method public setLongName(Ljava/lang/String;)V
    .locals 0
    .param p1, "longName"    # Ljava/lang/String;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->longName:Ljava/lang/String;

    return-void
.end method

.method public setPathColor(I)V
    .locals 0
    .param p1, "pathColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->pathColor:I

    return-void
.end method

.method public setRoute(Lcom/thetransitapp/droid/model/Route;)V
    .locals 0
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->route:Lcom/thetransitapp/droid/model/Route;

    return-void
.end method

.method public setRouteImage(Lcom/thetransitapp/droid/model/RouteImage;)V
    .locals 0
    .param p1, "routeImage"    # Lcom/thetransitapp/droid/model/RouteImage;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->routeImage:Lcom/thetransitapp/droid/model/RouteImage;

    return-void
.end method

.method public setShadowColor(I)V
    .locals 0
    .param p1, "shadowColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shadowColor:I

    return-void
.end method

.method public setShortName(Ljava/lang/String;)V
    .locals 0
    .param p1, "shortName"    # Ljava/lang/String;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->shortName:Ljava/lang/String;

    return-void
.end method

.method public setStarColor(I)V
    .locals 0
    .param p1, "starColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->starColor:I

    return-void
.end method

.method public setTextColor(I)V
    .locals 0
    .param p1, "textColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textColor:I

    return-void
.end method

.method public setTextSelectedColor(I)V
    .locals 0
    .param p1, "textSelectedColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textSelectedColor:I

    return-void
.end method

.method public setTextShadowOffset(F)V
    .locals 0
    .param p1, "textShadowOffset"    # F

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->textShadowOffset:F

    return-void
.end method

.method public setTopGlossColor(I)V
    .locals 0
    .param p1, "topGlossColor"    # I

    .prologue
    .line 15
    iput p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->topGlossColor:I

    return-void
.end method

.method public setType(Lcom/thetransitapp/droid/model/Route$RouteType;)V
    .locals 0
    .param p1, "type"    # Lcom/thetransitapp/droid/model/Route$RouteType;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/thetransitapp/droid/model/viewmodel/RouteViewModel;->type:Lcom/thetransitapp/droid/model/Route$RouteType;

    return-void
.end method
