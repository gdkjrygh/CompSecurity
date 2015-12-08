.class public final Lcom/roidapp/photogrid/release/nl;
.super Lcom/roidapp/photogrid/release/mm;
.source "SourceFile"


# instance fields
.field private L:[Lcom/roidapp/photogrid/release/ig;

.field private M:I

.field private N:I

.field private O:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;)V
    .locals 2

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nl;->O:Ljava/util/ArrayList;

    .line 31
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/nl;->F:Z

    .line 32
    iput-object p2, p0, Lcom/roidapp/photogrid/release/nl;->h:Landroid/app/Activity;

    .line 33
    iput-object p3, p0, Lcom/roidapp/photogrid/release/nl;->L:[Lcom/roidapp/photogrid/release/ig;

    .line 34
    iput-object p4, p0, Lcom/roidapp/photogrid/release/nl;->l:Lcom/roidapp/photogrid/release/ml;

    .line 35
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    .line 36
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/nl;)[Lcom/roidapp/photogrid/release/ig;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->L:[Lcom/roidapp/photogrid/release/ig;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/nl;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/roidapp/photogrid/release/nl;->M:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/nl;)I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/roidapp/photogrid/release/nl;->N:I

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/nl;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->O:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/nl;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/nl;->m()V

    return-void
.end method

.method private declared-synchronized m()V
    .locals 3

    .prologue
    .line 146
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->O:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 147
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 148
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 146
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 152
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->O:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    const/16 v6, 0x8

    const/4 v5, 0x1

    const/4 v1, 0x0

    .line 40
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v6, v1}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    move v0, v1

    .line 42
    :goto_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/nl;->L:[Lcom/roidapp/photogrid/release/ig;

    array-length v3, v3

    if-ge v0, v3, :cond_0

    .line 43
    iget-object v3, p0, Lcom/roidapp/photogrid/release/nl;->L:[Lcom/roidapp/photogrid/release/ig;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 44
    iget-object v4, p0, Lcom/roidapp/photogrid/release/nl;->L:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, v0

    iput-boolean v5, v4, Lcom/roidapp/photogrid/release/ig;->w:Z

    .line 45
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    iget-object v3, p0, Lcom/roidapp/photogrid/release/nl;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v4, v0, 0x2

    add-int/lit8 v4, v4, 0xa

    invoke-virtual {v3, v4, v1}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 42
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v2, 0x1e

    invoke-virtual {v0, v2, v1}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 50
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->h:Landroid/app/Activity;

    const v2, 0x7f0d0085

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nl;->h:Landroid/app/Activity;

    const-string v3, "wide_high"

    invoke-static {v2, v3, v5}, Lcom/roidapp/photogrid/common/a;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nl;->h:Landroid/app/Activity;

    invoke-static {v2}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v2

    if-eq v2, v5, :cond_3

    .line 53
    sget-boolean v2, Lcom/roidapp/photogrid/common/az;->B:Z

    if-nez v2, :cond_2

    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->h:Landroid/app/Activity;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_1

    .line 57
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 58
    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    if-eqz v2, :cond_1

    .line 59
    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    .line 60
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C()V

    .line 71
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->h:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/nl;->M:I

    .line 72
    iget v0, p0, Lcom/roidapp/photogrid/release/nl;->M:I

    int-to-float v0, v0

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/nl;->N:I

    .line 73
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/nm;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/nm;-><init>(Lcom/roidapp/photogrid/release/nl;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 111
    return-void

    .line 64
    :cond_2
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method

.method public final a(Landroid/widget/RelativeLayout;Landroid/view/View$OnTouchListener;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/16 v3, 0xa

    .line 115
    if-eqz p1, :cond_1

    .line 116
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->h:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03000f

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nl;->j:Landroid/view/ViewGroup;

    .line 117
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0063

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 118
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nl;->h:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nl;->L:[Lcom/roidapp/photogrid/release/ig;

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/widget/LinearLayout;Landroid/content/Context;[Lcom/roidapp/photogrid/release/ig;)V

    .line 119
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 120
    invoke-virtual {v1, v3, v3, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 121
    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 122
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 123
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nl;->j:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 125
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nl;->L:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nl;->O:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v1, v2, :cond_1

    move v3, v4

    .line 126
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nl;->L:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ge v3, v1, :cond_0

    .line 127
    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/rn;

    .line 128
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nl;->O:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/rn;->a(Landroid/graphics/Bitmap;)V

    .line 129
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nl;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v2, v3, 0x2

    add-int/lit8 v2, v2, 0x4a

    invoke-virtual {v1, v2, v4}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 126
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_0

    .line 131
    :cond_0
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->requestFocus()Z

    .line 132
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->invalidate()V

    .line 135
    :cond_1
    return-void
.end method

.method public final b(Z)I
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nl;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 142
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/nl;->m()V

    .line 143
    return-void
.end method

.method public final b(II)V
    .locals 0

    .prologue
    .line 171
    return-void
.end method

.method public final b(IZ)V
    .locals 0

    .prologue
    .line 194
    return-void
.end method

.method public final c(I)V
    .locals 0

    .prologue
    .line 183
    return-void
.end method

.method public final c(II)V
    .locals 0

    .prologue
    .line 177
    return-void
.end method

.method public final f()V
    .locals 0

    .prologue
    .line 159
    return-void
.end method
