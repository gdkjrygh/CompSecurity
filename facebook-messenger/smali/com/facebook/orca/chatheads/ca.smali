.class public Lcom/facebook/orca/chatheads/ca;
.super Lcom/facebook/widget/d;
.source "ChatHeadsFullView.java"


# static fields
.field private static final a:Lcom/facebook/n/g;


# instance fields
.field private final b:Landroid/view/View;

.field private final c:Landroid/view/ViewGroup;

.field private final d:Landroid/widget/FrameLayout;

.field private final e:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

.field private final f:Lcom/facebook/n/c;

.field private final g:Landroid/graphics/Rect;

.field private final h:Landroid/graphics/Rect;

.field private i:Lcom/facebook/orca/chatheads/ce;

.field private j:Lcom/facebook/orca/chatheads/cd;

.field private k:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 48
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/ca;->a:Lcom/facebook/n/g;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const-wide v3, 0x3f747ae147ae147bL    # 0.005

    .line 70
    invoke-direct {p0, p1}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;)V

    .line 61
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ca;->g:Landroid/graphics/Rect;

    .line 63
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ca;->h:Landroid/graphics/Rect;

    .line 72
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ca;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    .line 73
    const-class v1, Lcom/facebook/n/j;

    const-class v2, Lcom/facebook/orca/chatheads/annotations/ForChatHeads;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/j;

    .line 75
    sget v1, Lcom/facebook/k;->orca_chat_heads_full_view:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/ca;->setContentView(I)V

    .line 77
    sget v1, Lcom/facebook/i;->background_darken:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/ca;->c(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/chatheads/ca;->b:Landroid/view/View;

    .line 78
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ca;->b:Landroid/view/View;

    new-instance v2, Lcom/facebook/orca/chatheads/cb;

    invoke-direct {v2, p0}, Lcom/facebook/orca/chatheads/cb;-><init>(Lcom/facebook/orca/chatheads/ca;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ca;->b:Landroid/view/View;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/a/c/a;->a(Landroid/view/View;F)V

    .line 88
    sget v1, Lcom/facebook/i;->thread_view_container:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/ca;->c(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/facebook/orca/chatheads/ca;->c:Landroid/view/ViewGroup;

    .line 89
    sget v1, Lcom/facebook/i;->chat_heads_container:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/ca;->c(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    iput-object v1, p0, Lcom/facebook/orca/chatheads/ca;->d:Landroid/widget/FrameLayout;

    .line 90
    sget v1, Lcom/facebook/i;->close_target:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/ca;->c(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    iput-object v1, p0, Lcom/facebook/orca/chatheads/ca;->e:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    .line 92
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/chatheads/ca;->a:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/cc;

    invoke-direct {v1, p0, v5}, Lcom/facebook/orca/chatheads/cc;-><init>(Lcom/facebook/orca/chatheads/ca;Lcom/facebook/orca/chatheads/cb;)V

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ca;->f:Lcom/facebook/n/c;

    .line 99
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, v5}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 101
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ca;)Lcom/facebook/orca/chatheads/cd;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->j:Lcom/facebook/orca/chatheads/cd;

    return-object v0
.end method

.method private a(D)Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 223
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->d()D

    move-result-wide v0

    cmpl-double v0, v0, p1

    if-eqz v0, :cond_0

    .line 224
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ca;->d()V

    .line 226
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    .line 227
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->f:Lcom/facebook/n/c;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 230
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_1

    .line 231
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    .line 234
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/ca;)Landroid/view/View;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->b:Landroid/view/View;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/ca;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    .line 119
    :cond_0
    return-void
.end method

.method private e()V
    .locals 3

    .prologue
    .line 206
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 207
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ca;->g:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lcom/facebook/orca/chatheads/ca;->h:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 208
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ca;->g:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/facebook/orca/chatheads/ca;->h:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 209
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ca;->g:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    iget-object v2, p0, Lcom/facebook/orca/chatheads/ca;->h:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 210
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ca;->g:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, Lcom/facebook/orca/chatheads/ca;->h:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 211
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ca;->c:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 212
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->k:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->e:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    if-eqz v0, :cond_1

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->e:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;->a()V

    .line 112
    :cond_1
    return-void
.end method

.method public b()Lcom/google/common/d/a/s;
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
    .line 215
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/ca;->a(D)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/common/d/a/s;
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
    .line 219
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/ca;->a(D)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 143
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    .line 144
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ca;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v1

    .line 145
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_0

    .line 146
    invoke-virtual {v1, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    .line 155
    :goto_0
    return v0

    .line 148
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-ne v2, v0, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1, p1}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ca;->j:Lcom/facebook/orca/chatheads/cd;

    if-eqz v1, :cond_1

    .line 151
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ca;->j:Lcom/facebook/orca/chatheads/cd;

    const-string v2, "back_button"

    invoke-interface {v1, v2}, Lcom/facebook/orca/chatheads/cd;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 155
    :cond_1
    invoke-super {p0, p1}, Lcom/facebook/widget/d;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected fitSystemWindows(Landroid/graphics/Rect;)Z
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->h:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 177
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ca;->e()V

    .line 178
    const/4 v0, 0x1

    return v0
.end method

.method public getChatHeadsContainer()Landroid/widget/FrameLayout;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->d:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public getCloseTargetView()Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->e:Lcom/facebook/orca/chatheads/ChatHeadCloseTargetView;

    return-object v0
.end method

.method public getThreadViewContainer()Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->c:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public onSizeChanged(IIII)V
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->i:Lcom/facebook/orca/chatheads/ce;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->i:Lcom/facebook/orca/chatheads/ce;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/facebook/orca/chatheads/ce;->a(IIII)V

    .line 167
    :cond_0
    return-void
.end method

.method public setOnDismissListener(Lcom/facebook/orca/chatheads/cd;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ca;->j:Lcom/facebook/orca/chatheads/cd;

    .line 127
    return-void
.end method

.method public setOnSizeChangeListener(Lcom/facebook/orca/chatheads/ce;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ca;->i:Lcom/facebook/orca/chatheads/ce;

    .line 123
    return-void
.end method

.method public setSystemWindowInsets(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ca;->g:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 171
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ca;->e()V

    .line 172
    return-void
.end method
