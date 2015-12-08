.class public final Lcom/roidapp/cloudlib/sns/topic/a/b;
.super Lcom/roidapp/cloudlib/sns/topic/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/topic/b",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/e;",
        ">;"
    }
.end annotation


# instance fields
.field private m:Z

.field private n:I

.field private final o:Lcom/roidapp/cloudlib/sns/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/aa",
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
    .line 26
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/topic/b;-><init>()V

    .line 28
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->n:I

    .line 30
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/a/c;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/topic/a/c;-><init>(Lcom/roidapp/cloudlib/sns/topic/a/b;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->o:Lcom/roidapp/cloudlib/sns/aa;

    return-void
.end method

.method private a(IZ)Lcom/roidapp/cloudlib/sns/o;
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
    const/16 v5, 0x15

    .line 139
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->i:Z

    .line 140
    iput-boolean p2, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->m:Z

    .line 141
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->g:Lcom/roidapp/cloudlib/sns/b/p;

    .line 143
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->g:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->f:Lcom/roidapp/cloudlib/sns/b/x;

    .line 144
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->g:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->f:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v6, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->o:Lcom/roidapp/cloudlib/sns/aa;

    move v4, p1

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JIILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 146
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->o:Lcom/roidapp/cloudlib/sns/aa;

    invoke-static {p1, v5, v0}, Lcom/roidapp/cloudlib/sns/q;->a(IILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/a/b;II)V
    .locals 0

    .prologue
    .line 26
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/a/b;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 26
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->b(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->j:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/topic/a/b;II)V
    .locals 0

    .prologue
    .line 26
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a(II)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/topic/a/b;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 26
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->b(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->m:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->j:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/topic/a/b;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->k:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/topic/a/b;)I
    .locals 2

    .prologue
    .line 26
    iget v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->n:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->n:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/sns/topic/a/b;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->k:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/sns/topic/a/b;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->k:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/baselib/c/y;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->d:Lcom/roidapp/baselib/c/y;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/baselib/c/y;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->d:Lcom/roidapp/baselib/c/y;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/sns/topic/a/b;)Landroid/support/v7/widget/RecyclerView;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->e:Landroid/support/v7/widget/RecyclerView;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/o;
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->h:Lcom/roidapp/cloudlib/sns/o;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->j:Z

    return v0
.end method

.method static synthetic o(Lcom/roidapp/cloudlib/sns/topic/a/b;)I
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->n:I

    return v0
.end method

.method static synthetic p(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic q(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->i:Z

    return v0
.end method

.method static synthetic r(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic s(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/o;
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->h:Lcom/roidapp/cloudlib/sns/o;

    return-object v0
.end method

.method static synthetic t(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic u(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->i:Z

    return v0
.end method

.method static synthetic v(Lcom/roidapp/cloudlib/sns/topic/a/b;)Z
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->j:Z

    return v0
.end method

.method static synthetic w(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/baselib/c/y;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->d:Lcom/roidapp/baselib/c/y;

    return-object v0
.end method

.method static synthetic x(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/baselib/c/y;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->d:Lcom/roidapp/baselib/c/y;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .prologue
    .line 88
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    .line 89
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->A:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    .line 90
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 91
    return-object v0
.end method

.method protected final a(Lcom/roidapp/cloudlib/sns/b/n;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 182
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/TopicPopular/onPostClick"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/TopicPopular/onPostClick"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 184
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 185
    new-instance v2, Lcom/roidapp/cloudlib/sns/topic/a/e;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/sns/topic/a/e;-><init>()V

    .line 186
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a/e;

    add-int/lit8 v1, v1, 0x1

    iget v3, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->n:I

    iget-boolean v4, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->j:Z

    invoke-virtual {v2, v0, v1, v3, v4}, Lcom/roidapp/cloudlib/sns/topic/a/e;->a(Lcom/roidapp/cloudlib/sns/b/a/e;IIZ)V

    .line 187
    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 188
    return-void
.end method

.method protected final a(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 96
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/topic/b;->a(Z)V

    .line 97
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "TopicPopular"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->a(Ljava/lang/String;)V

    .line 98
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "TopicPopular"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 99
    const-string v0, "TopicPopular"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    .line 100
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v0

    const-string v1, "Explore_Popularnow_Page"

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    .line 101
    if-eqz p1, :cond_0

    .line 102
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 103
    invoke-direct {p0, v3, v4}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a(IZ)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 115
    :goto_0
    return-void

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->d:Lcom/roidapp/baselib/c/y;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->k:Ljava/lang/Object;

    if-nez v0, :cond_2

    .line 107
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 108
    invoke-direct {p0, v3, v4}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a(IZ)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 109
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 111
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->i:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 112
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->k:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->b(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected final synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 26
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 1152
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 26
    goto :goto_0
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 119
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->b()V

    .line 121
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->i:Z

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->d:Lcom/roidapp/baselib/c/y;

    if-eqz v0, :cond_2

    .line 125
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 126
    const-string v0, "TopicPopular"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->e(Ljava/lang/String;)V

    .line 128
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->k()I

    move-result v0

    .line 129
    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 130
    const-string v1, "TopicPopular"

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;I)V

    .line 134
    :cond_2
    const-string v0, "TopicPopular"

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 135
    return-void
.end method

.method protected final d()V
    .locals 1

    .prologue
    .line 211
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->l:Z

    .line 212
    return-void
.end method

.method protected final f()Landroid/support/v7/widget/au;
    .locals 2

    .prologue
    .line 158
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroid/support/v7/widget/GridLayoutManager;-><init>(I)V

    .line 159
    new-instance v1, Lcom/roidapp/cloudlib/sns/topic/a/d;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/topic/a/d;-><init>(Lcom/roidapp/cloudlib/sns/topic/a/b;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/support/v7/widget/t;)V

    .line 166
    return-object v0
.end method

.method protected final g()Lcom/roidapp/cloudlib/sns/topic/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/roidapp/cloudlib/sns/topic/a",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation

    .prologue
    .line 171
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/a/a;

    invoke-direct {v0, p0, p0}, Lcom/roidapp/cloudlib/sns/topic/a/a;-><init>(Landroid/support/v4/app/Fragment;Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method protected final i()V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 192
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->i()V

    .line 193
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "UpGlide"

    const-string v2, "SNS/UpGlide/TopicPopular"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "UpGlide"

    const-string v4, "SNS/UpGlide/TopicPopular"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 195
    return-void
.end method

.method protected final l()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 199
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->j:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->i:Z

    if-eqz v1, :cond_1

    .line 200
    :cond_0
    const/4 v0, 0x0

    .line 205
    :goto_0
    return v0

    .line 203
    :cond_1
    iget v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->n:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a(IZ)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->h:Lcom/roidapp/cloudlib/sns/o;

    .line 204
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/a/b;->h:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v1, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final onRefresh()V
    .locals 2

    .prologue
    .line 176
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->m()Z

    .line 177
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/topic/a/b;->a(IZ)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 178
    return-void
.end method
