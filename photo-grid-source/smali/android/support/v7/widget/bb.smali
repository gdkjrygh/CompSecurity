.class final Landroid/support/v7/widget/bb;
.super Landroid/support/v7/widget/an;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 3920
    iput-object p1, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Landroid/support/v7/widget/an;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/RecyclerView;B)V
    .locals 0

    .prologue
    .line 3920
    invoke-direct {p0, p1}, Landroid/support/v7/widget/bb;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 3972
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->n(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->o(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->p(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3973
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->q(Landroid/support/v7/widget/RecyclerView;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 3978
    :goto_0
    return-void

    .line 3975
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->r(Landroid/support/v7/widget/RecyclerView;)Z

    .line 3976
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 3923
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 3924
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/al;->k_()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3928
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0, v2}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;Z)Z

    .line 3929
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->m(Landroid/support/v7/widget/RecyclerView;)V

    .line 3934
    :goto_0
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3935
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 3937
    :cond_0
    return-void

    .line 3931
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0, v2}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;Z)Z

    .line 3932
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->m(Landroid/support/v7/widget/RecyclerView;)V

    goto :goto_0
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 3941
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 3942
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/a;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3943
    invoke-direct {p0}, Landroid/support/v7/widget/bb;->b()V

    .line 3945
    :cond_0
    return-void
.end method

.method public final b(II)V
    .locals 2

    .prologue
    .line 3957
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 3958
    iget-object v0, p0, Landroid/support/v7/widget/bb;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/a;->c(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3959
    invoke-direct {p0}, Landroid/support/v7/widget/bb;->b()V

    .line 3961
    :cond_0
    return-void
.end method
