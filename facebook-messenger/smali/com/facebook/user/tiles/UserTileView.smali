.class public Lcom/facebook/user/tiles/UserTileView;
.super Landroid/widget/FrameLayout;
.source "UserTileView.java"


# instance fields
.field private a:Lcom/facebook/user/tiles/c;

.field private b:Lcom/facebook/user/tiles/a;

.field private c:Lcom/facebook/widget/images/UrlImage;

.field private d:Lcom/facebook/user/tiles/e;

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 45
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/user/tiles/UserTileView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/facebook/user/tiles/UserTileView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/facebook/user/tiles/UserTileView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method private a()V
    .locals 5

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->a:Lcom/facebook/user/tiles/c;

    iget-object v1, p0, Lcom/facebook/user/tiles/UserTileView;->d:Lcom/facebook/user/tiles/e;

    iget v2, p0, Lcom/facebook/user/tiles/UserTileView;->e:I

    iget v3, p0, Lcom/facebook/user/tiles/UserTileView;->e:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/user/tiles/c;->a(Lcom/facebook/user/tiles/e;II)Lcom/facebook/ui/images/b/m;

    move-result-object v0

    .line 84
    iget-object v1, p0, Lcom/facebook/user/tiles/UserTileView;->c:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v1, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    .line 85
    iget-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->d:Lcom/facebook/user/tiles/e;

    if-nez v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->c:Lcom/facebook/widget/images/UrlImage;

    iget-object v1, p0, Lcom/facebook/user/tiles/UserTileView;->b:Lcom/facebook/user/tiles/a;

    iget v2, p0, Lcom/facebook/user/tiles/UserTileView;->e:I

    iget v3, p0, Lcom/facebook/user/tiles/UserTileView;->e:I

    invoke-virtual {v1, v2, v3}, Lcom/facebook/user/tiles/a;->a(II)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 93
    :goto_0
    return-void

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->c:Lcom/facebook/widget/images/UrlImage;

    iget-object v1, p0, Lcom/facebook/user/tiles/UserTileView;->b:Lcom/facebook/user/tiles/a;

    iget-object v2, p0, Lcom/facebook/user/tiles/UserTileView;->d:Lcom/facebook/user/tiles/e;

    invoke-virtual {v2}, Lcom/facebook/user/tiles/e;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    iget v3, p0, Lcom/facebook/user/tiles/UserTileView;->e:I

    iget v4, p0, Lcom/facebook/user/tiles/UserTileView;->e:I

    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/user/tiles/a;->a(Lcom/facebook/user/UserKey;II)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .param p2    # Landroid/util/AttributeSet;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/16 v4, 0x32

    const/4 v3, -0x1

    .line 49
    const-string v0, "UserTileView.init"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 50
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v2

    .line 51
    const-class v0, Lcom/facebook/user/tiles/c;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/c;

    iput-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->a:Lcom/facebook/user/tiles/c;

    .line 52
    const-class v0, Lcom/facebook/user/tiles/a;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/a;

    iput-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->b:Lcom/facebook/user/tiles/a;

    .line 54
    sget-object v0, Lcom/facebook/q;->UserTileView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 55
    sget v2, Lcom/facebook/q;->UserTileView_tileSize:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p0, Lcom/facebook/user/tiles/UserTileView;->e:I

    .line 56
    iget v2, p0, Lcom/facebook/user/tiles/UserTileView;->e:I

    if-ne v2, v3, :cond_0

    .line 57
    const/high16 v2, 0x42480000    # 50.0f

    invoke-static {p1, v2}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v2

    iput v2, p0, Lcom/facebook/user/tiles/UserTileView;->e:I

    .line 59
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 61
    new-instance v0, Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {p0}, Lcom/facebook/user/tiles/UserTileView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/facebook/widget/images/UrlImage;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->c:Lcom/facebook/widget/images/UrlImage;

    .line 62
    iget-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->c:Lcom/facebook/widget/images/UrlImage;

    iget-object v2, p0, Lcom/facebook/user/tiles/UserTileView;->b:Lcom/facebook/user/tiles/a;

    invoke-virtual {v2, v4, v4}, Lcom/facebook/user/tiles/a;->a(II)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    iget-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->c:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {p0, v0}, Lcom/facebook/user/tiles/UserTileView;->addView(Landroid/view/View;)V

    .line 65
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 66
    return-void
.end method


# virtual methods
.method public getParams()Lcom/facebook/user/tiles/e;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->d:Lcom/facebook/user/tiles/e;

    return-object v0
.end method

.method public getUserTileViewParams()Lcom/facebook/user/tiles/e;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/user/tiles/UserTileView;->d:Lcom/facebook/user/tiles/e;

    return-object v0
.end method

.method public setParams(Lcom/facebook/user/tiles/e;)V
    .locals 0
    .param p1    # Lcom/facebook/user/tiles/e;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 73
    iput-object p1, p0, Lcom/facebook/user/tiles/UserTileView;->d:Lcom/facebook/user/tiles/e;

    .line 74
    invoke-direct {p0}, Lcom/facebook/user/tiles/UserTileView;->a()V

    .line 75
    return-void
.end method
