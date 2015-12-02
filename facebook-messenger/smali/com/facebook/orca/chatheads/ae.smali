.class public Lcom/facebook/orca/chatheads/ae;
.super Lcom/facebook/orca/chatheads/dv;
.source "ChatHeadTextBubbleWindow.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/orca/chatheads/dv",
        "<",
        "Lcom/facebook/orca/chatheads/v;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private c:I


# direct methods
.method public constructor <init>(Landroid/view/WindowManager;)V
    .locals 1

    .prologue
    .line 23
    invoke-static {}, Lcom/facebook/orca/chatheads/ae;->d()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/dv;-><init>(Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)V

    .line 25
    new-instance v0, Lcom/facebook/orca/chatheads/af;

    invoke-direct {v0, p0}, Lcom/facebook/orca/chatheads/af;-><init>(Lcom/facebook/orca/chatheads/ae;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ae;->b:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 31
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ae;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ae;->c()V

    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 81
    iget v1, p0, Lcom/facebook/orca/chatheads/ae;->c:I

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/v;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/v;->getMeasuredHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ae;->setY(I)V

    .line 82
    return-void
.end method

.method private static final d()Landroid/view/WindowManager$LayoutParams;
    .locals 6

    .prologue
    const/4 v1, -0x2

    .line 96
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    sget v3, Lcom/facebook/orca/chatheads/ae;->a:I

    const v4, 0x1000308

    const/4 v5, -0x3

    move v2, v1

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 106
    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 108
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 35
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/v;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/v;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ae;->b:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 38
    :cond_0
    invoke-super {p0}, Lcom/facebook/orca/chatheads/dv;->a()V

    .line 39
    return-void
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 72
    invoke-virtual {p0, p1}, Lcom/facebook/orca/chatheads/ae;->setX(I)V

    .line 73
    return-void
.end method

.method public a(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/v;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/v;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    return-void
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 1

    .prologue
    .line 88
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/v;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/v;->setMessage(Lcom/facebook/messages/model/threads/Message;)V

    .line 89
    return-void
.end method

.method public a(Lcom/facebook/orca/chatheads/ac;II)V
    .locals 2

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/v;

    .line 54
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/v;->getOrigin()Lcom/facebook/orca/chatheads/ac;

    move-result-object v1

    if-ne p1, v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->getX()I

    move-result v1

    if-ne v1, p2, :cond_0

    iget v1, p0, Lcom/facebook/orca/chatheads/ae;->c:I

    if-ne v1, p3, :cond_0

    .line 69
    :goto_0
    return-void

    .line 57
    :cond_0
    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/v;->setOrigin(Lcom/facebook/orca/chatheads/ac;)V

    .line 58
    invoke-virtual {p0, p2}, Lcom/facebook/orca/chatheads/ae;->a(I)V

    .line 59
    invoke-virtual {p0, p3}, Lcom/facebook/orca/chatheads/ae;->b(I)V

    .line 62
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 63
    sget-object v1, Lcom/facebook/orca/chatheads/ac;->LEFT:Lcom/facebook/orca/chatheads/ac;

    if-ne p1, v1, :cond_2

    .line 64
    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 68
    :cond_1
    :goto_1
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ae;->a(Landroid/view/WindowManager$LayoutParams;)V

    goto :goto_0

    .line 65
    :cond_2
    sget-object v1, Lcom/facebook/orca/chatheads/ac;->RIGHT:Lcom/facebook/orca/chatheads/ac;

    if-ne p1, v1, :cond_1

    .line 66
    const/16 v1, 0x35

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    goto :goto_1
.end method

.method public b()V
    .locals 2

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/v;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/v;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ae;->b:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 46
    :cond_0
    invoke-super {p0}, Lcom/facebook/orca/chatheads/dv;->b()V

    .line 47
    return-void
.end method

.method public b(I)V
    .locals 2

    .prologue
    .line 76
    iput p1, p0, Lcom/facebook/orca/chatheads/ae;->c:I

    .line 77
    iget v1, p0, Lcom/facebook/orca/chatheads/ae;->c:I

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ae;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/v;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/v;->getMeasuredHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ae;->setY(I)V

    .line 78
    return-void
.end method
