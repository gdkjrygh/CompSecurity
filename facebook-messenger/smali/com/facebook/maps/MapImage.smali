.class public Lcom/facebook/maps/MapImage;
.super Lcom/facebook/widget/f;
.source "MapImage.java"


# static fields
.field public static final a:Landroid/location/Location;


# instance fields
.field private b:Landroid/location/Location;

.field private c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Lcom/facebook/widget/images/UrlImage;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 28
    new-instance v0, Landroid/location/Location;

    const-string v1, ""

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/maps/MapImage;->a:Landroid/location/Location;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/maps/MapImage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/maps/MapImage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 52
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    iput-boolean v2, p0, Lcom/facebook/maps/MapImage;->h:Z

    .line 53
    sget v0, Lcom/facebook/k;->map_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/maps/MapImage;->setContentView(I)V

    .line 54
    sget v0, Lcom/facebook/i;->map_url_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/maps/MapImage;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    iput-object v0, p0, Lcom/facebook/maps/MapImage;->i:Lcom/facebook/widget/images/UrlImage;

    .line 56
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/maps/MapImage;->d:Ljava/util/List;

    .line 58
    sget-object v0, Lcom/facebook/q;->MapImage:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 60
    sget v1, Lcom/facebook/q;->MapImage_keepMarkerAtCenter:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/maps/MapImage;->f:Z

    .line 61
    sget v1, Lcom/facebook/q;->MapImage_retainMapDuringUpdate:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/maps/MapImage;->g:Z

    .line 63
    iget-object v1, p0, Lcom/facebook/maps/MapImage;->i:Lcom/facebook/widget/images/UrlImage;

    iget-boolean v2, p0, Lcom/facebook/maps/MapImage;->g:Z

    invoke-virtual {v1, v2}, Lcom/facebook/widget/images/UrlImage;->setRetainImageDuringUpdate(Z)V

    .line 65
    iget-object v1, p0, Lcom/facebook/maps/MapImage;->i:Lcom/facebook/widget/images/UrlImage;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 66
    iget-object v1, p0, Lcom/facebook/maps/MapImage;->i:Lcom/facebook/widget/images/UrlImage;

    sget v2, Lcom/facebook/h;->map_placeholder_background_repeat:I

    invoke-virtual {v1, v2}, Lcom/facebook/widget/images/UrlImage;->setPlaceholderBackgroundResourceId(I)V

    .line 67
    sget v1, Lcom/facebook/q;->MapImage_zoom:I

    const/16 v2, 0xc

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/maps/MapImage;->c:I

    .line 68
    sget v1, Lcom/facebook/q;->MapImage_markerColor:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/maps/MapImage;->e:Ljava/lang/String;

    .line 69
    iget-object v1, p0, Lcom/facebook/maps/MapImage;->e:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/maps/MapImage;->e:Ljava/lang/String;

    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/maps/MapImage;->e:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/maps/MapImage;->e:Ljava/lang/String;

    .line 73
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    return-void
.end method

.method static synthetic a(Lcom/facebook/maps/MapImage;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/maps/MapImage;->c()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/maps/MapImage;Z)Z
    .locals 0

    .prologue
    .line 23
    iput-boolean p1, p0, Lcom/facebook/maps/MapImage;->h:Z

    return p1
.end method

.method private b()V
    .locals 1

    .prologue
    .line 220
    iget-boolean v0, p0, Lcom/facebook/maps/MapImage;->h:Z

    if-eqz v0, :cond_0

    .line 232
    :goto_0
    return-void

    .line 224
    :cond_0
    new-instance v0, Lcom/facebook/maps/p;

    invoke-direct {v0, p0}, Lcom/facebook/maps/p;-><init>(Lcom/facebook/maps/MapImage;)V

    invoke-virtual {p0, v0}, Lcom/facebook/maps/MapImage;->post(Ljava/lang/Runnable;)Z

    .line 231
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/maps/MapImage;->h:Z

    goto :goto_0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Lcom/facebook/maps/MapImage;->b:Landroid/location/Location;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/maps/MapImage;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 236
    :cond_0
    invoke-direct {p0}, Lcom/facebook/maps/MapImage;->d()V

    .line 238
    :cond_1
    return-void
.end method

.method private d()V
    .locals 4

    .prologue
    .line 241
    invoke-virtual {p0}, Lcom/facebook/maps/MapImage;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/maps/MapImage;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/facebook/maps/MapImage;->getPaddingRight()I

    move-result v1

    sub-int v1, v0, v1

    .line 242
    invoke-virtual {p0}, Lcom/facebook/maps/MapImage;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/maps/MapImage;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Lcom/facebook/maps/MapImage;->getPaddingTop()I

    move-result v2

    sub-int v2, v0, v2

    .line 244
    iget-object v0, p0, Lcom/facebook/maps/MapImage;->d:Ljava/util/List;

    .line 245
    iget-boolean v3, p0, Lcom/facebook/maps/MapImage;->f:Z

    if-eqz v3, :cond_0

    .line 246
    iget-object v0, p0, Lcom/facebook/maps/MapImage;->d:Ljava/util/List;

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 247
    iget-object v3, p0, Lcom/facebook/maps/MapImage;->b:Landroid/location/Location;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    :cond_0
    if-lez v2, :cond_1

    if-lez v1, :cond_1

    .line 252
    invoke-virtual {p0}, Lcom/facebook/maps/MapImage;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/maps/q;->a(Landroid/content/Context;)Lcom/facebook/maps/q;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lcom/facebook/maps/q;->a(II)Lcom/facebook/maps/q;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/maps/MapImage;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/maps/q;->a(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/maps/q;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/maps/MapImage;->b:Landroid/location/Location;

    invoke-virtual {v0, v1}, Lcom/facebook/maps/q;->a(Landroid/location/Location;)Lcom/facebook/maps/q;

    move-result-object v0

    iget v1, p0, Lcom/facebook/maps/MapImage;->c:I

    invoke-virtual {v0, v1}, Lcom/facebook/maps/q;->a(I)Lcom/facebook/maps/q;

    move-result-object v0

    .line 257
    iget-object v1, p0, Lcom/facebook/maps/MapImage;->i:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0}, Lcom/facebook/maps/q;->a()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    .line 259
    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 169
    iget-object v0, p0, Lcom/facebook/maps/MapImage;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 170
    invoke-direct {p0}, Lcom/facebook/maps/MapImage;->b()V

    .line 171
    return-void
.end method

.method public a(Landroid/location/Location;)V
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/maps/MapImage;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    invoke-direct {p0}, Lcom/facebook/maps/MapImage;->b()V

    .line 163
    return-void
.end method

.method public getCenter()Landroid/location/Location;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/maps/MapImage;->b:Landroid/location/Location;

    return-object v0
.end method

.method public getKeepMarkerAtCenter()Z
    .locals 1

    .prologue
    .line 200
    iget-boolean v0, p0, Lcom/facebook/maps/MapImage;->f:Z

    return v0
.end method

.method public getMarkerColor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/facebook/maps/MapImage;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getRetainMapDuringUpdate()Z
    .locals 1

    .prologue
    .line 91
    iget-boolean v0, p0, Lcom/facebook/maps/MapImage;->g:Z

    return v0
.end method

.method public getZoom()I
    .locals 1

    .prologue
    .line 152
    iget v0, p0, Lcom/facebook/maps/MapImage;->c:I

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .prologue
    .line 97
    invoke-super/range {p0 .. p5}, Lcom/facebook/widget/f;->onLayout(ZIIII)V

    .line 98
    if-eqz p1, :cond_0

    .line 99
    invoke-direct {p0}, Lcom/facebook/maps/MapImage;->b()V

    .line 101
    :cond_0
    return-void
.end method

.method public setCenter(Landroid/location/Location;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/facebook/maps/MapImage;->b:Landroid/location/Location;

    .line 110
    invoke-direct {p0}, Lcom/facebook/maps/MapImage;->b()V

    .line 111
    return-void
.end method

.method public setKeepMarkerAtCenter(Z)V
    .locals 0

    .prologue
    .line 210
    iput-boolean p1, p0, Lcom/facebook/maps/MapImage;->f:Z

    .line 211
    invoke-direct {p0}, Lcom/facebook/maps/MapImage;->b()V

    .line 212
    return-void
.end method

.method public setMarkerColor(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lcom/facebook/maps/MapImage;->e:Ljava/lang/String;

    .line 181
    invoke-direct {p0}, Lcom/facebook/maps/MapImage;->b()V

    .line 182
    return-void
.end method

.method public setRetainMapDuringUpdate(Z)V
    .locals 1

    .prologue
    .line 86
    iput-boolean p1, p0, Lcom/facebook/maps/MapImage;->g:Z

    .line 87
    iget-object v0, p0, Lcom/facebook/maps/MapImage;->i:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/images/UrlImage;->setRetainImageDuringUpdate(Z)V

    .line 88
    return-void
.end method

.method public setZoom(I)V
    .locals 0

    .prologue
    .line 142
    iput p1, p0, Lcom/facebook/maps/MapImage;->c:I

    .line 143
    invoke-direct {p0}, Lcom/facebook/maps/MapImage;->b()V

    .line 144
    return-void
.end method
