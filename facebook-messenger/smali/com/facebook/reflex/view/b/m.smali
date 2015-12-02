.class public Lcom/facebook/reflex/view/b/m;
.super Lcom/facebook/reflex/b;
.source "ViewContent.java"


# static fields
.field private static b:Landroid/graphics/Paint;

.field private static final c:Lcom/facebook/reflex/view/b/o;


# instance fields
.field private d:Landroid/view/View;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 32
    sput-object v1, Lcom/facebook/reflex/view/b/m;->b:Landroid/graphics/Paint;

    .line 34
    new-instance v0, Lcom/facebook/reflex/view/b/o;

    invoke-direct {v0, v1}, Lcom/facebook/reflex/view/b/o;-><init>(Lcom/facebook/reflex/view/b/n;)V

    sput-object v0, Lcom/facebook/reflex/view/b/m;->c:Lcom/facebook/reflex/view/b/o;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/reflex/b;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/reflex/view/b/m;->e:I

    .line 43
    iput-object p1, p0, Lcom/facebook/reflex/view/b/m;->d:Landroid/view/View;

    .line 44
    sget-object v0, Lcom/facebook/reflex/view/b/m;->c:Lcom/facebook/reflex/view/b/o;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/b/o;->a(Landroid/content/Context;)V

    .line 45
    sget-object v0, Lcom/facebook/reflex/view/b/m;->c:Lcom/facebook/reflex/view/b/o;

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/view/b/m;->a(Lcom/facebook/reflex/a;)V

    .line 46
    return-void
.end method

.method private static a(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 126
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    .line 127
    invoke-static {p0}, Lcom/facebook/reflex/view/b/m;->b(Landroid/view/View;)V

    .line 129
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 130
    invoke-virtual {p0}, Landroid/view/View;->destroyDrawingCache()V

    .line 131
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    .line 132
    check-cast p0, Landroid/view/ViewGroup;

    move v2, v0

    .line 133
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 134
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 135
    instance-of v0, v1, Lcom/facebook/reflex/view/b/r;

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 136
    check-cast v0, Lcom/facebook/reflex/view/b/r;

    .line 137
    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    :goto_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 142
    :cond_1
    invoke-static {v1}, Lcom/facebook/reflex/view/b/m;->a(Landroid/view/View;)V

    goto :goto_1

    .line 145
    :cond_2
    return-void
.end method

.method private static b(Landroid/view/View;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 149
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 150
    return-void
.end method

.method private static c(Landroid/view/View;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->willNotDraw()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_3

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    if-lez v2, :cond_3

    move v2, v1

    .line 157
    :goto_0
    if-nez v2, :cond_1

    invoke-static {p0}, Lcom/facebook/reflex/view/b/m;->d(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    move v0, v1

    :cond_2
    return v0

    :cond_3
    move v2, v0

    .line 153
    goto :goto_0
.end method

.method private static d(Landroid/view/View;)Z
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 161
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 162
    check-cast p0, Landroid/view/ViewGroup;

    move v2, v3

    .line 163
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 164
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 165
    instance-of v0, v1, Lcom/facebook/reflex/view/b/r;

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 166
    check-cast v0, Lcom/facebook/reflex/view/b/r;

    .line 167
    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 168
    invoke-static {v1}, Lcom/facebook/reflex/view/b/m;->c(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v3, v4

    .line 175
    :cond_0
    :goto_1
    return v3

    .line 171
    :cond_1
    invoke-static {v1}, Lcom/facebook/reflex/view/b/m;->c(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v3, v4

    goto :goto_1

    .line 163
    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 88
    invoke-virtual {p0}, Lcom/facebook/reflex/view/b/m;->i()V

    .line 89
    iget-object v0, p0, Lcom/facebook/reflex/view/b/m;->d:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 90
    return-void
.end method

.method public b(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 107
    return-void
.end method

.method public i()V
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/reflex/view/b/m;->d:Landroid/view/View;

    invoke-static {v0}, Lcom/facebook/reflex/view/b/m;->a(Landroid/view/View;)V

    .line 114
    return-void
.end method

.method public j()Z
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/facebook/reflex/view/b/m;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/reflex/view/b/m;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/b/m;->d:Landroid/view/View;

    invoke-static {v0}, Lcom/facebook/reflex/view/b/m;->d(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
