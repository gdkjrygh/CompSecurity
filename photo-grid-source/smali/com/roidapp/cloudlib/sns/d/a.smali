.class public final Lcom/roidapp/cloudlib/sns/d/a;
.super Lcom/roidapp/cloudlib/sns/basepost/h;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lcom/roidapp/cloudlib/sns/basepost/u;


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

.field private B:Lcom/roidapp/cloudlib/sns/upload/j;

.field private v:Landroid/view/ViewGroup;

.field private w:Lcom/roidapp/cloudlib/sns/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation
.end field

.field private x:Landroid/view/View;

.field private y:Landroid/widget/LinearLayout;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->z:Z

    .line 51
    new-instance v0, Lcom/roidapp/cloudlib/sns/d/b;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/d/b;-><init>(Lcom/roidapp/cloudlib/sns/d/a;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->A:Lcom/roidapp/cloudlib/sns/aa;

    .line 329
    new-instance v0, Lcom/roidapp/cloudlib/sns/d/d;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/d/d;-><init>(Lcom/roidapp/cloudlib/sns/d/a;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->B:Lcom/roidapp/cloudlib/sns/upload/j;

    return-void
.end method

.method static synthetic A(Lcom/roidapp/cloudlib/sns/d/a;)Z
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    return v0
.end method

.method static synthetic B(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    return-object v0
.end method

.method static synthetic C(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic D(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic E(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic F(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic G(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic H(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic I(Lcom/roidapp/cloudlib/sns/d/a;)Z
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    return v0
.end method

.method static synthetic J(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->y:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic K(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/view/View;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->x:Landroid/view/View;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/b/a/e;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 1

    .prologue
    .line 39
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/d/a;->b(Lcom/roidapp/cloudlib/sns/b/a/e;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/d/a;I)V
    .locals 0

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/d/a;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/d/a;JI)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 39
    .line 1398
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->y:Landroid/widget/LinearLayout;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    .line 1399
    if-eqz v0, :cond_1

    .line 1400
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 1401
    invoke-virtual {v0, p3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    .line 1402
    const/16 v2, 0x64

    if-ne p3, v2, :cond_0

    .line 1403
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/d/a;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 1404
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->onRefresh()V

    :cond_0
    move v0, v1

    .line 1406
    :goto_0
    return v0

    .line 1408
    :cond_1
    const/4 v0, 0x0

    .line 39
    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/d/a;Z)Z
    .locals 0

    .prologue
    .line 39
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/d/a;->z:Z

    return p1
.end method

.method private static b(Lcom/roidapp/cloudlib/sns/b/a/e;)Lcom/roidapp/cloudlib/sns/b/a/e;
    .locals 6

    .prologue
    .line 436
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 456
    :cond_0
    :goto_0
    return-object p0

    .line 440
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/sns/basepost/d;->a()Lcom/roidapp/cloudlib/sns/basepost/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/d;->c()Ljava/util/List;

    move-result-object v2

    .line 442
    new-instance v1, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/b/a/e;-><init>()V

    .line 443
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/b/a/e;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 444
    iget-boolean v4, v0, Lcom/roidapp/cloudlib/sns/b/n;->g:Z

    if-nez v4, :cond_3

    .line 445
    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 447
    :cond_3
    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v4, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 448
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-static {v4}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v4

    .line 449
    iget-object v5, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v5, v5, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-static {v4, v5}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;Lcom/roidapp/cloudlib/sns/b/c;)Lcom/roidapp/cloudlib/sns/b/c;

    move-result-object v4

    .line 450
    sget-object v5, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v4, v5, :cond_2

    .line 451
    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    move-object p0, v1

    .line 456
    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/d/a;I)V
    .locals 0

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/d/a;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/d/a;)Z
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->g:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/d/a;I)V
    .locals 0

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/d/a;->a(I)V

    return-void
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/sns/d/a;)Z
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/cloudlib/sns/d/a;)Z
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    return v0
.end method

.method static synthetic p(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic q(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic r(Lcom/roidapp/cloudlib/sns/d/a;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic s(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic t(Lcom/roidapp/cloudlib/sns/d/a;)Z
    .locals 1

    .prologue
    .line 39
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->g:Z

    return v0
.end method

.method static synthetic u(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic v(Lcom/roidapp/cloudlib/sns/d/a;)Z
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    return v0
.end method

.method static synthetic w(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic x(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic y(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic z(Lcom/roidapp/cloudlib/sns/d/a;)Lcom/roidapp/cloudlib/sns/o;
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->w:Lcom/roidapp/cloudlib/sns/o;

    return-object v0
.end method


# virtual methods
.method protected final a(J)V
    .locals 1

    .prologue
    .line 193
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(J)V

    .line 194
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(J)V

    .line 197
    :cond_0
    return-void
.end method

.method protected final a(Landroid/view/View;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 119
    invoke-super {p0, p1, p2, p3, p4}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Landroid/view/View;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 122
    return-void
.end method

.method protected final a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V
    .locals 1

    .prologue
    .line 128
    invoke-static {p1}, Lcom/roidapp/cloudlib/sns/d/a;->b(Lcom/roidapp/cloudlib/sns/b/a/e;)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v0

    .line 129
    invoke-super {p0, v0, p2, p3}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 130
    return-void
.end method

.method public final a(Ljava/util/Collection;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/roidapp/cloudlib/sns/upload/i;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 412
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 413
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 414
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 415
    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    .line 416
    iget-byte v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->f:B

    .line 417
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/a;->y:Landroid/widget/LinearLayout;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    .line 418
    if-nez v1, :cond_0

    .line 1348
    new-instance v1, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-direct {v1, v6}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;-><init>(Landroid/content/Context;)V

    .line 1349
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->setTag(Ljava/lang/Object;)V

    .line 1350
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 1351
    iget v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    .line 1352
    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(Ljava/lang/String;)V

    .line 1353
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1354
    const/16 v4, 0x14

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1355
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1356
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/d/a;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1357
    new-instance v3, Lcom/roidapp/cloudlib/sns/d/e;

    invoke-direct {v3, p0, v1, v0}, Lcom/roidapp/cloudlib/sns/d/e;-><init>(Lcom/roidapp/cloudlib/sns/d/a;Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;Lcom/roidapp/cloudlib/sns/upload/i;)V

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 421
    :cond_0
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 422
    iget v0, v0, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    goto :goto_0

    .line 426
    :cond_1
    return-void
.end method

.method protected final a(Z)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 134
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Z)V

    .line 135
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "Feed"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->a(Ljava/lang/String;)V

    .line 136
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "FeedPage"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 137
    const-string v0, "FeedPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 139
    if-eqz p1, :cond_2

    .line 140
    invoke-static {}, Lcom/roidapp/cloudlib/sns/basepost/d;->a()Lcom/roidapp/cloudlib/sns/basepost/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/d;->b()V

    .line 143
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->l_()V

    .line 145
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->g:Z

    if-eqz v0, :cond_1

    .line 146
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 147
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 152
    :goto_0
    iput-boolean v4, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    .line 153
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/a;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/a;->A:Lcom/roidapp/cloudlib/sns/aa;

    invoke-static {v0, v2, v3, v4, v1}, Lcom/roidapp/cloudlib/sns/q;->c(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 154
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 163
    :cond_0
    :goto_1
    return-void

    .line 149
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 156
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    if-nez v0, :cond_0

    .line 160
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->m:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {p0, v0, v4, v3}, Lcom/roidapp/cloudlib/sns/d/a;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    goto :goto_1
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 168
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->b()V

    .line 169
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->w:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_1

    .line 170
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->w:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 171
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 174
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    .line 177
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_3

    .line 178
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 179
    const-string v0, "FeedPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->e(Ljava/lang/String;)V

    .line 181
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->g()I

    move-result v0

    .line 182
    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 183
    const-string v1, "FeedPage"

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;I)V

    .line 186
    :cond_3
    const-string v0, "FeedPage"

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 187
    invoke-static {}, Lcom/roidapp/cloudlib/sns/basepost/d;->a()Lcom/roidapp/cloudlib/sns/basepost/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/d;->d()V

    .line 188
    return-void
.end method

.method public final b(Z)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 306
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->b(Z)V

    .line 307
    if-eqz p1, :cond_2

    .line 308
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 309
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->x:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/d/a;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->v:Landroid/view/ViewGroup;

    .line 311
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->v:Landroid/view/ViewGroup;

    sget v1, Lcom/roidapp/cloudlib/ar;->aG:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 313
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 314
    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->k:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/a;->v:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 318
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 327
    :cond_1
    :goto_0
    return-void

    .line 320
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->k:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 321
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->k:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 322
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->k:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method protected final d()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 383
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->y:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/d/a;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->j:Landroid/view/View;

    .line 384
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->J:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->y:Landroid/widget/LinearLayout;

    .line 386
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/d/a;->a(Ljava/util/Collection;)V

    .line 387
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->c:Lcom/roidapp/baselib/c/y;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/a;->j:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/c/y;->a(Landroid/view/View;)V

    .line 388
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->K:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->x:Landroid/view/View;

    .line 389
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->y:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 390
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->x:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 394
    :goto_0
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/a;->B:Lcom/roidapp/cloudlib/sns/upload/j;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Lcom/roidapp/cloudlib/sns/upload/j;)V

    .line 395
    return-void

    .line 392
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->x:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method protected final f()V
    .locals 1

    .prologue
    .line 201
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->f()V

    .line 202
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->r:Z

    .line 203
    return-void
.end method

.method public final j()Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 247
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->j()Z

    .line 248
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/d/a;->z:Z

    if-eqz v2, :cond_1

    .line 300
    :cond_0
    :goto_0
    return v0

    .line 252
    :cond_1
    iget-boolean v2, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    if-nez v2, :cond_0

    .line 256
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    .line 261
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/d/a;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v4}, Lcom/roidapp/cloudlib/sns/basepost/bc;->f()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    new-instance v5, Lcom/roidapp/cloudlib/sns/d/c;

    invoke-direct {v5, p0}, Lcom/roidapp/cloudlib/sns/d/c;-><init>(Lcom/roidapp/cloudlib/sns/d/a;)V

    invoke-static {v0, v2, v3, v4, v5}, Lcom/roidapp/cloudlib/sns/q;->c(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->w:Lcom/roidapp/cloudlib/sns/o;

    .line 298
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->w:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 299
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->w:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    move v0, v1

    .line 300
    goto :goto_0
.end method

.method public final onDestroyView()V
    .locals 2

    .prologue
    .line 207
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->onDestroyView()V

    .line 208
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/a;->B:Lcom/roidapp/cloudlib/sns/upload/j;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->b(Lcom/roidapp/cloudlib/sns/upload/j;)V

    .line 212
    return-void
.end method

.method public final onRefresh()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 217
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->onRefresh()V

    .line 218
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 219
    iput-boolean v4, p0, Lcom/roidapp/cloudlib/sns/d/a;->e:Z

    .line 221
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->w:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_1

    .line 226
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->w:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 227
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_2

    .line 232
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->d()V

    .line 233
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Z)V

    .line 235
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->i:Lcom/roidapp/cloudlib/sns/b/p;

    .line 236
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->h:Lcom/roidapp/cloudlib/sns/b/x;

    .line 237
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/a;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/a;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/d/a;->A:Lcom/roidapp/cloudlib/sns/aa;

    invoke-static {v0, v2, v3, v4, v1}, Lcom/roidapp/cloudlib/sns/q;->c(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 239
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 240
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 242
    :cond_3
    return-void
.end method

.method public final p()V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 430
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->p()V

    .line 431
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "UpGlide"

    const-string v2, "SNS/UpGlide/Feed"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/d/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "UpGlide"

    const-string v4, "SNS/UpGlide/Feed"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 433
    return-void
.end method
