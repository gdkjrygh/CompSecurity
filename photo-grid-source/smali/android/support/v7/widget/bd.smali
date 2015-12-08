.class public abstract Landroid/support/v7/widget/bd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Landroid/support/v7/widget/RecyclerView;

.field private c:Landroid/support/v7/widget/au;

.field private d:Z

.field private e:Z

.field private f:Landroid/view/View;

.field private final g:Landroid/support/v7/widget/be;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8480
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8466
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/bd;->a:I

    .line 8481
    new-instance v0, Landroid/support/v7/widget/be;

    invoke-direct {v0}, Landroid/support/v7/widget/be;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/bd;->g:Landroid/support/v7/widget/be;

    .line 8482
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/bd;II)V
    .locals 2

    .prologue
    .line 8464
    .line 11574
    iget-boolean v0, p0, Landroid/support/v7/widget/bd;->e:Z

    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v7/widget/bd;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 11575
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/bd;->c()V

    .line 11577
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/bd;->d:Z

    .line 11578
    iget-object v0, p0, Landroid/support/v7/widget/bd;->f:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 11580
    iget-object v0, p0, Landroid/support/v7/widget/bd;->f:Landroid/view/View;

    .line 11599
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/view/View;)I

    move-result v0

    .line 11580
    iget v1, p0, Landroid/support/v7/widget/bd;->a:I

    if-ne v0, v1, :cond_4

    .line 11581
    iget-object v0, p0, Landroid/support/v7/widget/bd;->f:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v1, p0, Landroid/support/v7/widget/bd;->g:Landroid/support/v7/widget/be;

    invoke-virtual {p0, v0, v1}, Landroid/support/v7/widget/bd;->a(Landroid/view/View;Landroid/support/v7/widget/be;)V

    .line 11582
    iget-object v0, p0, Landroid/support/v7/widget/bd;->g:Landroid/support/v7/widget/be;

    iget-object v1, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0, v1}, Landroid/support/v7/widget/be;->a(Landroid/support/v7/widget/be;Landroid/support/v7/widget/RecyclerView;)V

    .line 11583
    invoke-virtual {p0}, Landroid/support/v7/widget/bd;->c()V

    .line 11589
    :cond_2
    :goto_0
    iget-boolean v0, p0, Landroid/support/v7/widget/bd;->e:Z

    if-eqz v0, :cond_3

    .line 11590
    iget-object v0, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget-object v0, p0, Landroid/support/v7/widget/bd;->g:Landroid/support/v7/widget/be;

    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v7/widget/bd;->a(IILandroid/support/v7/widget/be;)V

    .line 11591
    iget-object v0, p0, Landroid/support/v7/widget/bd;->g:Landroid/support/v7/widget/be;

    iget-object v1, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0, v1}, Landroid/support/v7/widget/be;->a(Landroid/support/v7/widget/be;Landroid/support/v7/widget/RecyclerView;)V

    .line 8464
    :cond_3
    return-void

    .line 11585
    :cond_4
    const-string v0, "RecyclerView"

    const-string v1, "Passed over target position while smooth scrolling."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 11586
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/bd;->f:Landroid/view/View;

    goto :goto_0
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected abstract a(IILandroid/support/v7/widget/be;)V
.end method

.method final a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/au;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 8497
    iput-object p1, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    .line 8498
    iput-object p2, p0, Landroid/support/v7/widget/bd;->c:Landroid/support/v7/widget/au;

    .line 8499
    iget v0, p0, Landroid/support/v7/widget/bd;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 8500
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid target position"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8502
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    iget v1, p0, Landroid/support/v7/widget/bd;->a:I

    invoke-static {v0, v1}, Landroid/support/v7/widget/bf;->c(Landroid/support/v7/widget/bf;I)I

    .line 8503
    iput-boolean v2, p0, Landroid/support/v7/widget/bd;->e:Z

    .line 8504
    iput-boolean v2, p0, Landroid/support/v7/widget/bd;->d:Z

    .line 9570
    iget v0, p0, Landroid/support/v7/widget/bd;->a:I

    .line 9613
    iget-object v1, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/au;->a(I)Landroid/view/View;

    move-result-object v0

    .line 8505
    iput-object v0, p0, Landroid/support/v7/widget/bd;->f:Landroid/view/View;

    .line 8507
    iget-object v0, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->w(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/bh;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/bh;->a()V

    .line 8508
    return-void
.end method

.method protected final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 8624
    .line 10599
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/view/View;)I

    move-result v0

    .line 11570
    iget v1, p0, Landroid/support/v7/widget/bd;->a:I

    .line 8624
    if-ne v0, v1, :cond_0

    .line 8625
    iput-object p1, p0, Landroid/support/v7/widget/bd;->f:Landroid/view/View;

    .line 8630
    :cond_0
    return-void
.end method

.method protected abstract a(Landroid/view/View;Landroid/support/v7/widget/be;)V
.end method

.method public final b()Landroid/support/v7/widget/au;
    .locals 1

    .prologue
    .line 8518
    iget-object v0, p0, Landroid/support/v7/widget/bd;->c:Landroid/support/v7/widget/au;

    return-object v0
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 8511
    iput p1, p0, Landroid/support/v7/widget/bd;->a:I

    .line 8512
    return-void
.end method

.method protected final c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 8528
    iget-boolean v0, p0, Landroid/support/v7/widget/bd;->e:Z

    if-nez v0, :cond_0

    .line 8542
    :goto_0
    return-void

    .line 8531
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/bd;->a()V

    .line 8532
    iget-object v0, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0, v2}, Landroid/support/v7/widget/bf;->c(Landroid/support/v7/widget/bf;I)I

    .line 8533
    iput-object v1, p0, Landroid/support/v7/widget/bd;->f:Landroid/view/View;

    .line 8534
    iput v2, p0, Landroid/support/v7/widget/bd;->a:I

    .line 8535
    iput-boolean v3, p0, Landroid/support/v7/widget/bd;->d:Z

    .line 8536
    iput-boolean v3, p0, Landroid/support/v7/widget/bd;->e:Z

    .line 8538
    iget-object v0, p0, Landroid/support/v7/widget/bd;->c:Landroid/support/v7/widget/au;

    invoke-static {v0, p0}, Landroid/support/v7/widget/au;->a(Landroid/support/v7/widget/au;Landroid/support/v7/widget/bd;)V

    .line 8540
    iput-object v1, p0, Landroid/support/v7/widget/bd;->c:Landroid/support/v7/widget/au;

    .line 8541
    iput-object v1, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    goto :goto_0
.end method

.method public final c(I)V
    .locals 1

    .prologue
    .line 8620
    iget-object v0, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->a_(I)V

    .line 8621
    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 8552
    iget-boolean v0, p0, Landroid/support/v7/widget/bd;->d:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 8560
    iget-boolean v0, p0, Landroid/support/v7/widget/bd;->e:Z

    return v0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 8570
    iget v0, p0, Landroid/support/v7/widget/bd;->a:I

    return v0
.end method

.method public final g()I
    .locals 1

    .prologue
    .line 8606
    iget-object v0, p0, Landroid/support/v7/widget/bd;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/au;->r()I

    move-result v0

    return v0
.end method
