.class public Lcom/facebook/reflex/List;
.super Lcom/facebook/reflex/Widget;
.source "List.java"

# interfaces
.implements Lcom/facebook/reflex/af;


# annotations
.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# instance fields
.field private final b:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/facebook/reflex/Widget;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/facebook/reflex/ah;

.field private d:Lcom/facebook/reflex/v;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 23
    sget-object v0, Lcom/facebook/reflex/ai;->Vertical:Lcom/facebook/reflex/ai;

    sget-object v1, Lcom/facebook/reflex/ag;->Inertial:Lcom/facebook/reflex/ag;

    invoke-direct {p0, v0, v1}, Lcom/facebook/reflex/List;-><init>(Lcom/facebook/reflex/ai;Lcom/facebook/reflex/ag;)V

    .line 24
    return-void
.end method

.method public constructor <init>(Lcom/facebook/reflex/ai;Lcom/facebook/reflex/ag;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 25
    invoke-direct {p0}, Lcom/facebook/reflex/Widget;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/facebook/reflex/List;->b:Ljava/util/HashSet;

    .line 26
    sget-object v0, Lcom/facebook/reflex/ai;->Horizontal:Lcom/facebook/reflex/ai;

    if-ne p1, v0, :cond_0

    move v0, v1

    :goto_0
    sget-object v3, Lcom/facebook/reflex/ag;->Paginated:Lcom/facebook/reflex/ag;

    if-ne p2, v3, :cond_1

    :goto_1
    invoke-direct {p0, v0, v1}, Lcom/facebook/reflex/List;->initialize(ZZ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/List;->a(I)V

    .line 29
    return-void

    :cond_0
    move v0, v2

    .line 26
    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method private didContentSizeChange(I)V
    .locals 1
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/reflex/List;->d:Lcom/facebook/reflex/v;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/facebook/reflex/List;->d:Lcom/facebook/reflex/v;

    invoke-interface {v0, p1}, Lcom/facebook/reflex/v;->a(I)V

    .line 106
    :cond_0
    return-void
.end method

.method private drop(Lcom/facebook/reflex/Widget;)V
    .locals 0
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 111
    invoke-virtual {p1}, Lcom/facebook/reflex/Widget;->b()V

    .line 112
    return-void
.end method

.method private native initialize(ZZ)I
.end method

.method private native nativeInsertItemAt(ILcom/facebook/reflex/Widget;)V
.end method

.method private native nativeMoveItemTo(ILcom/facebook/reflex/Widget;)V
.end method

.method private native nativeRemoveItem(Lcom/facebook/reflex/Widget;)V
.end method

.method private prepare(Lcom/facebook/reflex/Widget;)V
    .locals 1
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/reflex/List;->b:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 62
    invoke-virtual {p0}, Lcom/facebook/reflex/List;->f()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/facebook/reflex/Widget;->b(I)V

    .line 63
    invoke-virtual {p1}, Lcom/facebook/reflex/Widget;->a()V

    .line 64
    return-void
.end method

.method private native registerForContentSize(Z)V
.end method

.method private native registerForScroll(Z)V
.end method


# virtual methods
.method public b(I)V
    .locals 0

    .prologue
    .line 67
    invoke-super {p0, p1}, Lcom/facebook/reflex/Widget;->b(I)V

    .line 68
    return-void
.end method

.method protected didScroll(IFF)V
    .locals 2
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/reflex/List;->c:Lcom/facebook/reflex/ah;

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/facebook/reflex/List;->c:Lcom/facebook/reflex/ah;

    invoke-static {p1}, Lcom/facebook/reflex/aj;->convertFromOrdinal(I)Lcom/facebook/reflex/aj;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, Lcom/facebook/reflex/ah;->a(Lcom/facebook/reflex/aj;FF)V

    .line 98
    :cond_0
    return-void
.end method
