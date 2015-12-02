.class public Lcom/facebook/reflex/Scroller;
.super Lcom/facebook/reflex/Widget;
.source "Scroller.java"

# interfaces
.implements Lcom/facebook/reflex/af;


# annotations
.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# instance fields
.field private b:Lcom/facebook/reflex/Widget;

.field private c:Lcom/facebook/reflex/ah;

.field private d:F

.field private e:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 15
    sget-object v0, Lcom/facebook/reflex/ai;->Vertical:Lcom/facebook/reflex/ai;

    sget-object v1, Lcom/facebook/reflex/ag;->Inertial:Lcom/facebook/reflex/ag;

    invoke-direct {p0, v0, v1}, Lcom/facebook/reflex/Scroller;-><init>(Lcom/facebook/reflex/ai;Lcom/facebook/reflex/ag;)V

    .line 16
    return-void
.end method

.method public constructor <init>(Lcom/facebook/reflex/ai;Lcom/facebook/reflex/ag;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0}, Lcom/facebook/reflex/Widget;-><init>()V

    .line 11
    iput v0, p0, Lcom/facebook/reflex/Scroller;->d:F

    .line 12
    iput v0, p0, Lcom/facebook/reflex/Scroller;->e:F

    .line 21
    sget-object v0, Lcom/facebook/reflex/ai;->Horizontal:Lcom/facebook/reflex/ai;

    if-ne p1, v0, :cond_0

    move v0, v1

    :goto_0
    sget-object v3, Lcom/facebook/reflex/ag;->Paginated:Lcom/facebook/reflex/ag;

    if-ne p2, v3, :cond_1

    :goto_1
    invoke-virtual {p0, v0, v1}, Lcom/facebook/reflex/Scroller;->initialize(ZZ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/Scroller;->a(I)V

    .line 23
    return-void

    :cond_0
    move v0, v2

    .line 21
    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method private native nativeSetChild(Lcom/facebook/reflex/Widget;)V
.end method

.method private native nativeSetMaxFlingVelocity(F)V
.end method

.method private native nativeSetScrollPosition(F)V
.end method

.method private native nativeSetScrollableRegion(FF)V
.end method

.method private native registerForScroll(Z)V
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 44
    invoke-super {p0}, Lcom/facebook/reflex/Widget;->a()V

    .line 45
    iget-object v0, p0, Lcom/facebook/reflex/Scroller;->b:Lcom/facebook/reflex/Widget;

    invoke-virtual {v0}, Lcom/facebook/reflex/Widget;->a()V

    .line 46
    return-void
.end method

.method public a(F)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/reflex/Scroller;->nativeSetMaxFlingVelocity(F)V

    .line 86
    return-void
.end method

.method public a(FF)V
    .locals 1

    .prologue
    .line 55
    iget v0, p0, Lcom/facebook/reflex/Scroller;->d:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/reflex/Scroller;->e:F

    cmpl-float v0, v0, p2

    if-eqz v0, :cond_1

    .line 56
    :cond_0
    iput p1, p0, Lcom/facebook/reflex/Scroller;->d:F

    .line 57
    iput p2, p0, Lcom/facebook/reflex/Scroller;->e:F

    .line 58
    invoke-direct {p0, p1, p2}, Lcom/facebook/reflex/Scroller;->nativeSetScrollableRegion(FF)V

    .line 60
    :cond_1
    return-void
.end method

.method public a(Lcom/facebook/reflex/Widget;)V
    .locals 2

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/reflex/Scroller;->b:Lcom/facebook/reflex/Widget;

    .line 27
    invoke-virtual {p0}, Lcom/facebook/reflex/Scroller;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 28
    invoke-virtual {p1}, Lcom/facebook/reflex/Widget;->a()V

    .line 31
    :cond_0
    iput-object p1, p0, Lcom/facebook/reflex/Scroller;->b:Lcom/facebook/reflex/Widget;

    .line 32
    iget-object v1, p0, Lcom/facebook/reflex/Scroller;->b:Lcom/facebook/reflex/Widget;

    invoke-direct {p0, v1}, Lcom/facebook/reflex/Scroller;->nativeSetChild(Lcom/facebook/reflex/Widget;)V

    .line 33
    invoke-virtual {p0}, Lcom/facebook/reflex/Scroller;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 34
    invoke-virtual {v0}, Lcom/facebook/reflex/Widget;->b()V

    .line 36
    :cond_1
    return-void
.end method

.method public a(Lcom/facebook/reflex/ah;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 71
    iget-object v2, p0, Lcom/facebook/reflex/Scroller;->c:Lcom/facebook/reflex/ah;

    if-eqz v2, :cond_1

    move v2, v0

    .line 72
    :goto_0
    if-eqz p1, :cond_2

    .line 74
    :goto_1
    iput-object p1, p0, Lcom/facebook/reflex/Scroller;->c:Lcom/facebook/reflex/ah;

    .line 76
    if-eq v0, v2, :cond_0

    .line 77
    invoke-direct {p0, v0}, Lcom/facebook/reflex/Scroller;->registerForScroll(Z)V

    .line 79
    :cond_0
    return-void

    :cond_1
    move v2, v1

    .line 71
    goto :goto_0

    :cond_2
    move v0, v1

    .line 72
    goto :goto_1
.end method

.method public b()V
    .locals 1

    .prologue
    .line 50
    invoke-super {p0}, Lcom/facebook/reflex/Widget;->b()V

    .line 51
    iget-object v0, p0, Lcom/facebook/reflex/Scroller;->b:Lcom/facebook/reflex/Widget;

    invoke-virtual {v0}, Lcom/facebook/reflex/Widget;->b()V

    .line 52
    return-void
.end method

.method public c()F
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/facebook/reflex/Scroller;->d:F

    return v0
.end method

.method public d()F
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/facebook/reflex/Scroller;->e:F

    return v0
.end method

.method protected didScroll(IFF)V
    .locals 2
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/reflex/Scroller;->c:Lcom/facebook/reflex/ah;

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/facebook/reflex/Scroller;->c:Lcom/facebook/reflex/ah;

    invoke-static {p1}, Lcom/facebook/reflex/aj;->convertFromOrdinal(I)Lcom/facebook/reflex/aj;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, Lcom/facebook/reflex/ah;->a(Lcom/facebook/reflex/aj;FF)V

    .line 94
    :cond_0
    return-void
.end method

.method protected native initialize(ZZ)I
.end method
