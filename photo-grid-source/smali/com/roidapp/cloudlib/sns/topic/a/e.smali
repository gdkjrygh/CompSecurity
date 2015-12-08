.class public final Lcom/roidapp/cloudlib/sns/topic/a/e;
.super Lcom/roidapp/cloudlib/sns/basepost/h;
.source "SourceFile"


# instance fields
.field private final A:Lcom/roidapp/cloudlib/sns/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/aa",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation
.end field

.field private v:I

.field private w:I

.field private x:Z

.field private y:Z

.field private z:Lcom/roidapp/cloudlib/sns/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;-><init>()V

    .line 30
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/a/f;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/topic/a/f;-><init>(Lcom/roidapp/cloudlib/sns/topic/a/e;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->A:Lcom/roidapp/cloudlib/sns/aa;

    return-void
.end method

.method private B()Z
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->z:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_0

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->z:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 231
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->z:Lcom/roidapp/cloudlib/sns/o;

    .line 232
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 233
    const/4 v0, 0x1

    .line 235
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/a/e;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/a/e;I)V
    .locals 0

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/a/e;Z)Z
    .locals 0

    .prologue
    .line 23
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->x:Z

    return p1
.end method

.method private b(IZ)Lcom/roidapp/cloudlib/sns/o;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation

    .prologue
    const/16 v5, 0x14

    .line 155
    iput-boolean p2, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->y:Z

    .line 156
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->i:Lcom/roidapp/cloudlib/sns/b/p;

    .line 158
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->h:Lcom/roidapp/cloudlib/sns/b/x;

    .line 159
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v6, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->A:Lcom/roidapp/cloudlib/sns/aa;

    move v4, p1

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JIILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 161
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->A:Lcom/roidapp/cloudlib/sns/aa;

    invoke-static {p1, v5, v0}, Lcom/roidapp/cloudlib/sns/q;->a(IILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/topic/a/e;I)V
    .locals 0

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z
    .locals 1

    .prologue
    .line 23
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->y:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z
    .locals 1

    .prologue
    .line 23
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->x:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/o;
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->z:Lcom/roidapp/cloudlib/sns/o;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->e:Z

    return v0
.end method

.method static synthetic l(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->g:Z

    return v0
.end method

.method static synthetic m(Lcom/roidapp/cloudlib/sns/topic/a/e;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic p(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic q(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic r(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic s(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->e:Z

    return v0
.end method

.method static synthetic t(Lcom/roidapp/cloudlib/sns/topic/a/e;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic u(Lcom/roidapp/cloudlib/sns/topic/a/e;)Z
    .locals 1

    .prologue
    .line 23
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->g:Z

    return v0
.end method

.method static synthetic v(Lcom/roidapp/cloudlib/sns/topic/a/e;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .prologue
    .line 111
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    .line 112
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->A:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    .line 113
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 114
    return-object v0
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/b/a/e;IIZ)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 104
    iput p2, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->v:I

    .line 105
    iput p3, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->w:I

    .line 106
    iput-boolean p4, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->x:Z

    .line 107
    return-void
.end method

.method protected final a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 173
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 174
    iget v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->v:I

    if-eq v0, v2, :cond_0

    .line 175
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    iget v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->v:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a_(I)V

    .line 176
    iput v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->v:I

    .line 178
    :cond_0
    return-void
.end method

.method protected final a(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 119
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Z)V

    .line 120
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "TopicPopularListPage"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 121
    const-string v0, "TopicPopularListPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-nez v0, :cond_1

    .line 123
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->e:Z

    .line 124
    iput v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->w:I

    .line 125
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 126
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 127
    invoke-direct {p0, v3, v4}, Lcom/roidapp/cloudlib/sns/topic/a/e;->b(IZ)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 134
    :cond_0
    :goto_0
    return-void

    .line 129
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {p0, v0, v3, v4}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 130
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    iget v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->w:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->f(I)V

    goto :goto_0
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 138
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->b()V

    .line 139
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->e:Z

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_2

    .line 143
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    const-string v0, "TopicPopularListPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->e(Ljava/lang/String;)V

    .line 146
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->g()I

    move-result v0

    .line 147
    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 148
    const-string v1, "TopicPopularListPage"

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;I)V

    .line 151
    :cond_2
    const-string v0, "TopicPopularListPage"

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 152
    return-void
.end method

.method public final b(Z)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 182
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->b(Z)V

    .line 183
    if-eqz p1, :cond_1

    .line 184
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 185
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->ah:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 186
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 187
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 194
    :cond_0
    :goto_0
    return-void

    .line 189
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->k:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 191
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->k:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method protected final f()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 167
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->n:Z

    .line 168
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->r:Z

    .line 169
    return-void
.end method

.method public final j()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 205
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->x:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->e:Z

    if-eqz v1, :cond_1

    .line 206
    :cond_0
    const/4 v0, 0x0

    .line 213
    :goto_0
    return v0

    .line 209
    :cond_1
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->e:Z

    .line 210
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->B()Z

    .line 211
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->f()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->b(IZ)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->z:Lcom/roidapp/cloudlib/sns/o;

    .line 212
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->z:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v1, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final k()V
    .locals 3

    .prologue
    .line 218
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 219
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/sns/topic/a/g;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/topic/a/g;-><init>(Lcom/roidapp/cloudlib/sns/topic/a/e;)V

    const-string v2, "Explore_Popularnow_Page"

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/aj;Ljava/lang/String;)V

    .line 226
    :cond_0
    return-void
.end method

.method public final onRefresh()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 198
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->B()Z

    .line 199
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/e;->e:Z

    .line 200
    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/topic/a/e;->b(IZ)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 201
    return-void
.end method
