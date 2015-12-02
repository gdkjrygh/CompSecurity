.class public Lcom/facebook/orca/chatheads/cf;
.super Lcom/facebook/orca/chatheads/dv;
.source "ChatHeadsFullWindow.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/orca/chatheads/dv",
        "<",
        "Lcom/facebook/orca/chatheads/ca;",
        ">;"
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/facebook/orca/chatheads/cf;

    sput-object v0, Lcom/facebook/orca/chatheads/cf;->b:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowManager;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 22
    invoke-static {}, Lcom/facebook/orca/chatheads/cf;->n()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/dv;-><init>(Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)V

    .line 23
    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/cf;->c(Z)V

    .line 24
    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/cf;->b(Z)V

    .line 25
    return-void
.end method

.method static synthetic g()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 17
    sget-object v0, Lcom/facebook/orca/chatheads/cf;->b:Ljava/lang/Class;

    return-object v0
.end method

.method private static n()Landroid/view/WindowManager$LayoutParams;
    .locals 6

    .prologue
    const/4 v1, -0x1

    .line 87
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    sget v3, Lcom/facebook/orca/chatheads/cf;->a:I

    const v4, 0x1010100

    const/4 v5, -0x3

    move v2, v1

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 96
    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 98
    return-object v0
.end method


# virtual methods
.method public a(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 28
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/ca;->setSystemWindowInsets(Landroid/graphics/Rect;)V

    .line 29
    return-void
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 51
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cf;->c(Z)V

    .line 52
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cf;->b(Z)V

    .line 53
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->b()Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 57
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cf;->b(Z)V

    .line 58
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->c()Lcom/google/common/d/a/s;

    move-result-object v0

    .line 59
    new-instance v1, Lcom/facebook/orca/chatheads/cg;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/cg;-><init>(Lcom/facebook/orca/chatheads/cf;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 72
    return-object v0
.end method

.method public e()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->getCloseTargetView()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    move-result-object v0

    return-object v0
.end method

.method public f()Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 80
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cf;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/ca;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ca;->getThreadViewContainer()Landroid/view/ViewGroup;

    move-result-object v0

    return-object v0
.end method

.method public setX(I)V
    .locals 2

    .prologue
    .line 39
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cf;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 40
    const/16 v1, 0x2710

    if-lt p1, v1, :cond_0

    .line 41
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v1, v1, 0x200

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 45
    :goto_0
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cf;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 47
    invoke-super {p0, p1}, Lcom/facebook/orca/chatheads/dv;->setX(I)V

    .line 48
    return-void

    .line 43
    :cond_0
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v1, v1, -0x201

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    goto :goto_0
.end method
