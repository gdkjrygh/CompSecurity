.class public final Lcom/roidapp/cloudlib/sns/topic/i;
.super Lcom/roidapp/cloudlib/sns/basepost/h;
.source "SourceFile"


# instance fields
.field private final A:Lcom/roidapp/cloudlib/sns/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/aa",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            ">;"
        }
    .end annotation
.end field

.field private final B:Lcom/roidapp/cloudlib/sns/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/aa",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            ">;"
        }
    .end annotation
.end field

.field private v:Ljava/lang/String;

.field private w:Z

.field private x:I

.field private y:Ljava/lang/String;

.field private z:Lcom/roidapp/cloudlib/sns/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
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

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->w:Z

    .line 30
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/j;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/topic/j;-><init>(Lcom/roidapp/cloudlib/sns/topic/i;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->A:Lcom/roidapp/cloudlib/sns/aa;

    .line 93
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/k;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/topic/k;-><init>(Lcom/roidapp/cloudlib/sns/topic/i;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->B:Lcom/roidapp/cloudlib/sns/aa;

    return-void
.end method

.method static synthetic A(Lcom/roidapp/cloudlib/sns/topic/i;)Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->e:Z

    return v0
.end method

.method static synthetic B(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/o;
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->z:Lcom/roidapp/cloudlib/sns/o;

    return-object v0
.end method

.method private B()Z
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->z:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->z:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 276
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->z:Lcom/roidapp/cloudlib/sns/o;

    .line 277
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 278
    const/4 v0, 0x1

    .line 280
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic C(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic D(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic E(Lcom/roidapp/cloudlib/sns/topic/i;)Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->e:Z

    return v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/i;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/i;Lcom/roidapp/cloudlib/sns/b/a/e;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    return-object p1
.end method

.method private a(ZI)Lcom/roidapp/cloudlib/sns/o;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            ">;"
        }
    .end annotation

    .prologue
    .line 176
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 177
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->i:Lcom/roidapp/cloudlib/sns/b/p;

    .line 178
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->h:Lcom/roidapp/cloudlib/sns/b/x;

    .line 180
    if-nez p1, :cond_0

    .line 181
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    iget-object v6, p0, Lcom/roidapp/cloudlib/sns/topic/i;->A:Lcom/roidapp/cloudlib/sns/aa;

    move v5, p2

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;JLjava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 197
    :goto_0
    return-object v0

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    iget-object v6, p0, Lcom/roidapp/cloudlib/sns/topic/i;->B:Lcom/roidapp/cloudlib/sns/aa;

    move v5, p2

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;JLjava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    goto :goto_0

    .line 192
    :cond_1
    if-nez p1, :cond_2

    .line 193
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->A:Lcom/roidapp/cloudlib/sns/aa;

    invoke-static {v0, p2, v1}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    goto :goto_0

    .line 197
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->B:Lcom/roidapp/cloudlib/sns/aa;

    invoke-static {v0, p2, v1}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/i;I)V
    .locals 0

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/topic/i;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/topic/i;Z)Z
    .locals 0

    .prologue
    .line 23
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->w:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/topic/i;I)V
    .locals 0

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/topic/i;->a(I)V

    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/topic/i;I)V
    .locals 0

    .prologue
    .line 23
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/topic/i;->a(I)V

    return-void
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/sns/topic/i;)Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->g:Z

    return v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/sns/topic/i;)Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->e:Z

    return v0
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/cloudlib/sns/topic/i;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/cloudlib/sns/topic/i;)Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->e:Z

    return v0
.end method

.method static synthetic o(Lcom/roidapp/cloudlib/sns/topic/i;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic p(Lcom/roidapp/cloudlib/sns/topic/i;)Z
    .locals 1

    .prologue
    .line 23
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->g:Z

    return v0
.end method

.method static synthetic q(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic r(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    return-object v0
.end method

.method static synthetic s(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    return-object v0
.end method

.method static synthetic t(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    return-object v0
.end method

.method static synthetic u(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    return-object v0
.end method

.method static synthetic v(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic w(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic x(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    return-object v0
.end method

.method static synthetic y(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic z(Lcom/roidapp/cloudlib/sns/topic/i;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .prologue
    .line 133
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    .line 134
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    .line 135
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 136
    return-object v0
.end method

.method protected final a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 213
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 214
    iget v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->x:I

    if-eq v0, v2, :cond_0

    .line 215
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    iget v1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->x:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a_(I)V

    .line 216
    iput v2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->x:I

    .line 219
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/a/e;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 125
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    .line 126
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 127
    iput p3, p0, Lcom/roidapp/cloudlib/sns/topic/i;->x:I

    .line 128
    iput-object p4, p0, Lcom/roidapp/cloudlib/sns/topic/i;->y:Ljava/lang/String;

    .line 129
    return-void
.end method

.method protected final a(Z)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 141
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Z)V

    .line 142
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TopicListPage/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 143
    const-string v0, "TopicListPage"

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-nez v0, :cond_0

    .line 145
    iput-boolean v5, p0, Lcom/roidapp/cloudlib/sns/topic/i;->e:Z

    .line 146
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v5}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 147
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 148
    invoke-direct {p0, v4, v4}, Lcom/roidapp/cloudlib/sns/topic/i;->a(ZI)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 152
    :goto_0
    return-void

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {p0, v0, v5, v4}, Lcom/roidapp/cloudlib/sns/topic/i;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    goto :goto_0
.end method

.method protected final b()V
    .locals 3

    .prologue
    .line 156
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->b()V

    .line 157
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->e:Z

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_2

    .line 162
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 163
    const-string v0, "TopicListPage"

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->g()I

    move-result v0

    .line 166
    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 167
    const-string v1, "TopicListPage"

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;Ljava/lang/String;I)V

    .line 170
    :cond_2
    const-string v0, "TopicListPage"

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->v:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->a()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 171
    return-void
.end method

.method public final b(Z)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 223
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->b(Z)V

    .line 224
    if-eqz p1, :cond_1

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 226
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->ah:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 227
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 228
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 235
    :cond_0
    :goto_0
    return-void

    .line 230
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->k:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 232
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->k:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method protected final f()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 206
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->f()V

    .line 207
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->n:Z

    .line 208
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->r:Z

    .line 209
    return-void
.end method

.method public final j()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 246
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->w:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->e:Z

    if-eqz v2, :cond_1

    .line 258
    :cond_0
    :goto_0
    return v0

    .line 250
    :cond_1
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 254
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/topic/i;->e:Z

    .line 255
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->B()Z

    .line 256
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/b/a/e;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-direct {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/topic/i;->a(ZI)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->z:Lcom/roidapp/cloudlib/sns/o;

    .line 257
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->z:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    move v0, v1

    .line 258
    goto :goto_0
.end method

.method public final k()V
    .locals 3

    .prologue
    .line 263
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 264
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/sns/topic/l;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/topic/l;-><init>(Lcom/roidapp/cloudlib/sns/topic/i;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/i;->y:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/aj;Ljava/lang/String;)V

    .line 271
    :cond_0
    return-void
.end method

.method public final onRefresh()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 239
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/topic/i;->B()Z

    .line 240
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/i;->e:Z

    .line 241
    invoke-direct {p0, v1, v1}, Lcom/roidapp/cloudlib/sns/topic/i;->a(ZI)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 242
    return-void
.end method
