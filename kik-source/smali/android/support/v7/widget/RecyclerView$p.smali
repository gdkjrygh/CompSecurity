.class public abstract Landroid/support/v7/widget/RecyclerView$p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "p"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/RecyclerView$p$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/support/v7/widget/RecyclerView;

.field private c:Landroid/support/v7/widget/RecyclerView$i;

.field private d:Z

.field private e:Z

.field private f:Landroid/view/View;

.field private final g:Landroid/support/v7/widget/RecyclerView$p$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8544
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8530
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/RecyclerView$p;->a:I

    .line 8545
    new-instance v0, Landroid/support/v7/widget/RecyclerView$p$a;

    invoke-direct {v0}, Landroid/support/v7/widget/RecyclerView$p$a;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$p;->g:Landroid/support/v7/widget/RecyclerView$p$a;

    .line 8546
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView$p;II)V
    .locals 3

    .prologue
    .line 8528
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$p;->b:Landroid/support/v7/widget/RecyclerView;

    iget-boolean v1, p0, Landroid/support/v7/widget/RecyclerView$p;->e:Z

    if-eqz v1, :cond_0

    iget v1, p0, Landroid/support/v7/widget/RecyclerView$p;->a:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$p;->c()V

    :cond_1
    const/4 v1, 0x0

    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView$p;->d:Z

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->f:Landroid/view/View;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->f:Landroid/view/View;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/view/View;)I

    move-result v1

    iget v2, p0, Landroid/support/v7/widget/RecyclerView$p;->a:I

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->f:Landroid/view/View;

    iget-object v2, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$p;->g:Landroid/support/v7/widget/RecyclerView$p$a;

    invoke-virtual {p0, v1, v2}, Landroid/support/v7/widget/RecyclerView$p;->a(Landroid/view/View;Landroid/support/v7/widget/RecyclerView$p$a;)V

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->g:Landroid/support/v7/widget/RecyclerView$p$a;

    invoke-static {v1, v0}, Landroid/support/v7/widget/RecyclerView$p$a;->a(Landroid/support/v7/widget/RecyclerView$p$a;Landroid/support/v7/widget/RecyclerView;)V

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$p;->c()V

    :cond_2
    :goto_0
    iget-boolean v1, p0, Landroid/support/v7/widget/RecyclerView$p;->e:Z

    if-eqz v1, :cond_3

    iget-object v1, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->g:Landroid/support/v7/widget/RecyclerView$p$a;

    invoke-virtual {p0, p1, p2, v1}, Landroid/support/v7/widget/RecyclerView$p;->a(IILandroid/support/v7/widget/RecyclerView$p$a;)V

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->g:Landroid/support/v7/widget/RecyclerView$p$a;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$p$a;->a()Z

    move-result v1

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$p;->g:Landroid/support/v7/widget/RecyclerView$p$a;

    invoke-static {v2, v0}, Landroid/support/v7/widget/RecyclerView$p$a;->a(Landroid/support/v7/widget/RecyclerView$p$a;Landroid/support/v7/widget/RecyclerView;)V

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Landroid/support/v7/widget/RecyclerView$p;->e:Z

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v7/widget/RecyclerView$p;->d:Z

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->r(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$s;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$s;->a()V

    :cond_3
    :goto_1
    return-void

    :cond_4
    const-string v1, "RecyclerView"

    const-string v2, "Passed over target position while smooth scrolling."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    iput-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->f:Landroid/view/View;

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$p;->c()V

    goto :goto_1
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected abstract a(IILandroid/support/v7/widget/RecyclerView$p$a;)V
.end method

.method final a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$i;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 8561
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView$p;->b:Landroid/support/v7/widget/RecyclerView;

    .line 8562
    iput-object p2, p0, Landroid/support/v7/widget/RecyclerView$p;->c:Landroid/support/v7/widget/RecyclerView$i;

    .line 8563
    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 8564
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid target position"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8566
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$p;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    iget v1, p0, Landroid/support/v7/widget/RecyclerView$p;->a:I

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView$q;->c(Landroid/support/v7/widget/RecyclerView$q;I)I

    .line 8567
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView$p;->e:Z

    .line 8568
    iput-boolean v2, p0, Landroid/support/v7/widget/RecyclerView$p;->d:Z

    .line 8569
    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p;->a:I

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView$i;->b(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$p;->f:Landroid/view/View;

    .line 8570
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$p;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->r(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$s;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$s;->a()V

    .line 8572
    return-void
.end method

.method protected final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 8703
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->d(Landroid/view/View;)I

    move-result v0

    iget v1, p0, Landroid/support/v7/widget/RecyclerView$p;->a:I

    if-ne v0, v1, :cond_0

    .line 8704
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView$p;->f:Landroid/view/View;

    .line 8709
    :cond_0
    return-void
.end method

.method protected abstract a(Landroid/view/View;Landroid/support/v7/widget/RecyclerView$p$a;)V
.end method

.method public final b()Landroid/support/v7/widget/RecyclerView$i;
    .locals 1

    .prologue
    .line 8584
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$p;->c:Landroid/support/v7/widget/RecyclerView$i;

    return-object v0
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 8575
    iput p1, p0, Landroid/support/v7/widget/RecyclerView$p;->a:I

    .line 8576
    return-void
.end method

.method protected final c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 8594
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$p;->e:Z

    if-nez v0, :cond_0

    .line 8608
    :goto_0
    return-void

    .line 8597
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$p;->a()V

    .line 8598
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$p;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v0, v2}, Landroid/support/v7/widget/RecyclerView$q;->c(Landroid/support/v7/widget/RecyclerView$q;I)I

    .line 8599
    iput-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->f:Landroid/view/View;

    .line 8600
    iput v2, p0, Landroid/support/v7/widget/RecyclerView$p;->a:I

    .line 8601
    iput-boolean v3, p0, Landroid/support/v7/widget/RecyclerView$p;->d:Z

    .line 8602
    iput-boolean v3, p0, Landroid/support/v7/widget/RecyclerView$p;->e:Z

    .line 8604
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$p;->c:Landroid/support/v7/widget/RecyclerView$i;

    invoke-static {v0, p0}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/support/v7/widget/RecyclerView$i;Landroid/support/v7/widget/RecyclerView$p;)V

    .line 8606
    iput-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->c:Landroid/support/v7/widget/RecyclerView$i;

    .line 8607
    iput-object v1, p0, Landroid/support/v7/widget/RecyclerView$p;->b:Landroid/support/v7/widget/RecyclerView;

    goto :goto_0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 8618
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$p;->d:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 8626
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$p;->e:Z

    return v0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 8636
    iget v0, p0, Landroid/support/v7/widget/RecyclerView$p;->a:I

    return v0
.end method

.method public final g()I
    .locals 1

    .prologue
    .line 8683
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$p;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$i;->p()I

    move-result v0

    return v0
.end method
