.class public Lcom/facebook/orca/chatheads/ag;
.super Lcom/facebook/orca/chatheads/e;
.source "ChatHeadView.java"


# static fields
.field private static final a:[I


# instance fields
.field private final b:Lcom/facebook/orca/threadview/ci;

.field private final c:Lcom/facebook/orca/f/k;

.field private final d:Lcom/facebook/orca/threadview/cb;

.field private final e:Lcom/facebook/orca/photos/a/e;

.field private final f:Lcom/facebook/common/hardware/q;

.field private final g:Lcom/facebook/orca/photos/a/b;

.field private final h:Lcom/facebook/common/hardware/t;

.field private final i:Lcom/facebook/widget/tiles/ThreadTileView;

.field private final j:Landroid/widget/TextView;

.field private k:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field private l:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field private m:Lcom/facebook/orca/chatheads/d;

.field private n:Z

.field private o:I

.field private p:Z

.field private q:Lcom/facebook/orca/threads/ThreadSummary;

.field private r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 43
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lcom/facebook/d;->state_deleting:I

    aput v2, v0, v1

    sput-object v0, Lcom/facebook/orca/chatheads/ag;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .prologue
    .line 73
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/e;-><init>(Landroid/content/Context;)V

    .line 75
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ag;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 76
    const-class v0, Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ci;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->b:Lcom/facebook/orca/threadview/ci;

    .line 77
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->c:Lcom/facebook/orca/f/k;

    .line 78
    const-class v0, Lcom/facebook/orca/photos/a/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/a/e;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->e:Lcom/facebook/orca/photos/a/e;

    .line 80
    const-class v0, Lcom/facebook/common/hardware/q;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/hardware/q;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->f:Lcom/facebook/common/hardware/q;

    .line 81
    const-class v0, Lcom/facebook/orca/photos/a/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/a/b;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->g:Lcom/facebook/orca/photos/a/b;

    .line 83
    new-instance v0, Lcom/facebook/orca/chatheads/ah;

    invoke-direct {v0, p0}, Lcom/facebook/orca/chatheads/ah;-><init>(Lcom/facebook/orca/chatheads/ag;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->h:Lcom/facebook/common/hardware/t;

    .line 94
    new-instance v0, Lcom/facebook/orca/chatheads/ai;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ag;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/chatheads/ai;-><init>(Lcom/facebook/orca/chatheads/ag;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->d:Lcom/facebook/orca/threadview/cb;

    .line 116
    sget v0, Lcom/facebook/k;->orca_chat_head:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ag;->setContentView(I)V

    .line 118
    sget v0, Lcom/facebook/i;->thread_tile_img:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ag;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/tiles/ThreadTileView;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->i:Lcom/facebook/widget/tiles/ThreadTileView;

    .line 119
    sget v0, Lcom/facebook/i;->unread_message_count:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/ag;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->j:Landroid/widget/TextView;

    .line 121
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ag;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 122
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ag;->j:Landroid/widget/TextView;

    sget v2, Lcom/facebook/g;->chat_head_badge_shadow_radius:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    sget v3, Lcom/facebook/g;->chat_head_badge_shadow_dx:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    sget v4, Lcom/facebook/g;->chat_head_badge_shadow_dy:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    sget v5, Lcom/facebook/f;->chat_heads_badge_shadow:I

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 129
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ag;->r()V

    .line 131
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ag;->p()V

    .line 132
    return-void
.end method

.method private a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 3

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->i:Lcom/facebook/widget/tiles/ThreadTileView;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ag;->e:Lcom/facebook/orca/photos/a/e;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/ag;->g:Lcom/facebook/orca/photos/a/b;

    invoke-virtual {v2, p1}, Lcom/facebook/orca/photos/a/b;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/widget/tiles/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/photos/a/e;->a(Lcom/facebook/widget/tiles/a;)Lcom/facebook/widget/tiles/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/tiles/ThreadTileView;->setThreadTileViewData(Lcom/facebook/widget/tiles/j;)V

    .line 236
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ag;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ag;->o()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ag;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/threadview/cp;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ag;->a(Lcom/facebook/orca/threadview/cp;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ag;Lcom/facebook/user/User;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ag;->a(Lcom/facebook/user/User;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 290
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ag;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 291
    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/cp;)V
    .locals 1

    .prologue
    .line 294
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->l:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 298
    :goto_0
    return-void

    .line 297
    :cond_0
    iget-object v0, p1, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ag;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/user/User;)V
    .locals 2

    .prologue
    .line 286
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->i:Lcom/facebook/widget/tiles/ThreadTileView;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ag;->e:Lcom/facebook/orca/photos/a/e;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/photos/a/e;->a(Lcom/facebook/user/User;)Lcom/facebook/widget/tiles/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/tiles/ThreadTileView;->setThreadTileViewData(Lcom/facebook/widget/tiles/j;)V

    .line 287
    return-void
.end method

.method private b(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 2

    .prologue
    .line 308
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ag;->q()Z

    move-result v0

    if-nez v0, :cond_1

    .line 309
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ag;->q:Lcom/facebook/orca/threads/ThreadSummary;

    .line 317
    :cond_0
    :goto_0
    return-void

    .line 312
    :cond_1
    if-eqz p1, :cond_0

    .line 313
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->i:Lcom/facebook/widget/tiles/ThreadTileView;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ag;->e:Lcom/facebook/orca/photos/a/e;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/photos/a/e;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/widget/tiles/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/tiles/ThreadTileView;->setThreadTileViewData(Lcom/facebook/widget/tiles/j;)V

    .line 315
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ag;->invalidate()V

    goto :goto_0
.end method

.method private o()V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->q:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->q:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ag;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 169
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->q:Lcom/facebook/orca/threads/ThreadSummary;

    .line 171
    :cond_0
    return-void
.end method

.method private p()V
    .locals 2

    .prologue
    .line 203
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->b:Lcom/facebook/orca/threadview/ci;

    new-instance v1, Lcom/facebook/orca/chatheads/aj;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/aj;-><init>(Lcom/facebook/orca/chatheads/ag;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/cl;)V

    .line 230
    return-void
.end method

.method private q()Z
    .locals 1

    .prologue
    .line 304
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->f:Lcom/facebook/common/hardware/q;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/q;->a()Z

    move-result v0

    return v0
.end method

.method private r()V
    .locals 2

    .prologue
    .line 367
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ag;->r:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/facebook/orca/chatheads/ag;->o:I

    if-lez v0, :cond_0

    .line 368
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->j:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 369
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->j:Landroid/widget/TextView;

    iget v1, p0, Lcom/facebook/orca/chatheads/ag;->o:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 373
    :goto_0
    return-void

    .line 371
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->j:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public getActionState()Lcom/facebook/orca/chatheads/d;
    .locals 1

    .prologue
    .line 411
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->m:Lcom/facebook/orca/chatheads/d;

    return-object v0
.end method

.method public getPendingThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->k:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    return-object v0
.end method

.method public getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->l:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    return-object v0
.end method

.method public getUnreadCount()I
    .locals 1

    .prologue
    .line 325
    iget v0, p0, Lcom/facebook/orca/chatheads/ag;->o:I

    return v0
.end method

.method public i()Lcom/facebook/orca/chatheads/ag;
    .locals 2

    .prologue
    .line 139
    new-instance v0, Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ag;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/ag;-><init>(Landroid/content/Context;)V

    .line 140
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ag;->setPendingThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 141
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ag;->setThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 142
    iget v1, p0, Lcom/facebook/orca/chatheads/ag;->o:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ag;->setUnreadCount(I)V

    .line 143
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ag;->m:Lcom/facebook/orca/chatheads/d;

    iput-object v1, v0, Lcom/facebook/orca/chatheads/ag;->m:Lcom/facebook/orca/chatheads/d;

    .line 144
    iget-boolean v1, p0, Lcom/facebook/orca/chatheads/ag;->n:Z

    iput-boolean v1, v0, Lcom/facebook/orca/chatheads/ag;->n:Z

    .line 145
    iget-boolean v1, p0, Lcom/facebook/orca/chatheads/ag;->p:Z

    iput-boolean v1, v0, Lcom/facebook/orca/chatheads/ag;->p:Z

    .line 146
    return-object v0
.end method

.method public j()Z
    .locals 1

    .prologue
    .line 153
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ag;->p:Z

    return v0
.end method

.method public k()V
    .locals 1

    .prologue
    .line 160
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/ag;->p:Z

    .line 161
    return-void
.end method

.method public l()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 278
    new-instance v0, Lcom/facebook/orca/threadview/co;

    invoke-direct {v0, v1, v1}, Lcom/facebook/orca/threadview/co;-><init>(ZZ)V

    .line 282
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ag;->b:Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/co;)V

    .line 283
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 188
    invoke-super {p0}, Lcom/facebook/orca/chatheads/e;->onAttachedToWindow()V

    .line 189
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->d:Lcom/facebook/orca/threadview/cb;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/cb;->a()V

    .line 190
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->d:Lcom/facebook/orca/threadview/cb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/cb;->a(Z)V

    .line 191
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->f:Lcom/facebook/common/hardware/q;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ag;->h:Lcom/facebook/common/hardware/t;

    invoke-virtual {v0, v1}, Lcom/facebook/common/hardware/q;->a(Lcom/facebook/common/hardware/t;)V

    .line 192
    return-void
.end method

.method protected onCreateDrawableState(I)[I
    .locals 3

    .prologue
    .line 416
    add-int/lit8 v0, p1, 0x1

    invoke-super {p0, v0}, Lcom/facebook/orca/chatheads/e;->onCreateDrawableState(I)[I

    move-result-object v0

    .line 418
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ag;->m:Lcom/facebook/orca/chatheads/d;

    sget-object v2, Lcom/facebook/orca/chatheads/d;->CLOSE:Lcom/facebook/orca/chatheads/d;

    if-ne v1, v2, :cond_0

    .line 419
    sget-object v1, Lcom/facebook/orca/chatheads/ag;->a:[I

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/ag;->mergeDrawableStates([I[I)[I

    .line 422
    :cond_0
    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 196
    invoke-super {p0}, Lcom/facebook/orca/chatheads/e;->onDetachedFromWindow()V

    .line 197
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->d:Lcom/facebook/orca/threadview/cb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/cb;->a(Z)V

    .line 198
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->d:Lcom/facebook/orca/threadview/cb;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/cb;->b()V

    .line 199
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->f:Lcom/facebook/common/hardware/q;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ag;->h:Lcom/facebook/common/hardware/t;

    invoke-virtual {v0, v1}, Lcom/facebook/common/hardware/q;->b(Lcom/facebook/common/hardware/t;)V

    .line 200
    return-void
.end method

.method public setActionState(Lcom/facebook/orca/chatheads/d;)V
    .locals 1

    .prologue
    .line 398
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->m:Lcom/facebook/orca/chatheads/d;

    if-ne v0, p1, :cond_0

    .line 405
    :goto_0
    return-void

    .line 402
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ag;->m:Lcom/facebook/orca/chatheads/d;

    .line 404
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ag;->refreshDrawableState()V

    goto :goto_0
.end method

.method public setPendingThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 0

    .prologue
    .line 183
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ag;->k:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 184
    return-void
.end method

.method public setShouldShowUnreadCount(Z)V
    .locals 1

    .prologue
    .line 359
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ag;->r:Z

    if-ne p1, v0, :cond_0

    .line 364
    :goto_0
    return-void

    .line 362
    :cond_0
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/ag;->r:Z

    .line 363
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ag;->r()V

    goto :goto_0
.end method

.method public setThreadViewSpec(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 2

    .prologue
    .line 239
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->k:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 240
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ag;->k:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 242
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->l:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {p1, v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 264
    :goto_1
    return-void

    .line 239
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 247
    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ag;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 249
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ag;->l:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 250
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->b:Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 251
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->d:Lcom/facebook/orca/threadview/cb;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/cb;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 253
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 254
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 255
    if-nez v0, :cond_2

    .line 256
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ag;->l()V

    goto :goto_1

    .line 258
    :cond_2
    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/ag;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_1

    .line 262
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/ag;->l()V

    goto :goto_1
.end method

.method public setUnreadCount(I)V
    .locals 1

    .prologue
    .line 337
    iget v0, p0, Lcom/facebook/orca/chatheads/ag;->o:I

    if-ne v0, p1, :cond_0

    .line 342
    :goto_0
    return-void

    .line 340
    :cond_0
    iput p1, p0, Lcom/facebook/orca/chatheads/ag;->o:I

    .line 341
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/ag;->r()V

    goto :goto_0
.end method

.method public setUnreadCountOnLeftSide(Z)V
    .locals 2

    .prologue
    .line 379
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/ag;->n:Z

    if-ne v0, p1, :cond_0

    .line 392
    :goto_0
    return-void

    .line 383
    :cond_0
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/ag;->n:Z

    .line 385
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ag;->j:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 386
    iget-boolean v1, p0, Lcom/facebook/orca/chatheads/ag;->n:Z

    if-eqz v1, :cond_1

    .line 387
    const/16 v1, 0x33

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 391
    :goto_1
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ag;->j:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 389
    :cond_1
    const/16 v1, 0x35

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_1
.end method
