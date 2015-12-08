.class public abstract Landroid/support/v7/widget/RecyclerView$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/RecyclerView$e$a;
    }
.end annotation


# instance fields
.field private a:Landroid/support/v7/widget/RecyclerView$e$a;

.field private b:Ljava/util/ArrayList;

.field private c:J

.field private d:J

.field private e:J

.field private f:J

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const-wide/16 v4, 0xfa

    const-wide/16 v2, 0x78

    .line 9362
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9364
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->a:Landroid/support/v7/widget/RecyclerView$e$a;

    .line 9365
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->b:Ljava/util/ArrayList;

    .line 9368
    iput-wide v2, p0, Landroid/support/v7/widget/RecyclerView$e;->c:J

    .line 9369
    iput-wide v2, p0, Landroid/support/v7/widget/RecyclerView$e;->d:J

    .line 9370
    iput-wide v4, p0, Landroid/support/v7/widget/RecyclerView$e;->e:J

    .line 9371
    iput-wide v4, p0, Landroid/support/v7/widget/RecyclerView$e;->f:J

    .line 9373
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$e;->g:Z

    .line 9787
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method final a(Landroid/support/v7/widget/RecyclerView$e$a;)V
    .locals 0

    .prologue
    .line 9485
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView$e;->a:Landroid/support/v7/widget/RecyclerView$e$a;

    .line 9486
    return-void
.end method

.method public abstract a(Landroid/support/v7/widget/RecyclerView$t;)Z
.end method

.method public abstract a(Landroid/support/v7/widget/RecyclerView$t;IIII)Z
.end method

.method public abstract a(Landroid/support/v7/widget/RecyclerView$t;Landroid/support/v7/widget/RecyclerView$t;IIII)Z
.end method

.method public abstract b()Z
.end method

.method public abstract b(Landroid/support/v7/widget/RecyclerView$t;)Z
.end method

.method public abstract c()V
.end method

.method public abstract c(Landroid/support/v7/widget/RecyclerView$t;)V
.end method

.method public final d()J
    .locals 2

    .prologue
    .line 9381
    iget-wide v0, p0, Landroid/support/v7/widget/RecyclerView$e;->e:J

    return-wide v0
.end method

.method public final d(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 1

    .prologue
    .line 9606
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->a:Landroid/support/v7/widget/RecyclerView$e$a;

    if-eqz v0, :cond_0

    .line 9608
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->a:Landroid/support/v7/widget/RecyclerView$e$a;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/RecyclerView$e$a;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 9610
    :cond_0
    return-void
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 9399
    iget-wide v0, p0, Landroid/support/v7/widget/RecyclerView$e;->c:J

    return-wide v0
.end method

.method public final e(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 1

    .prologue
    .line 9618
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->a:Landroid/support/v7/widget/RecyclerView$e$a;

    if-eqz v0, :cond_0

    .line 9620
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->a:Landroid/support/v7/widget/RecyclerView$e$a;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/RecyclerView$e$a;->c(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 9622
    :cond_0
    return-void
.end method

.method public final f()J
    .locals 2

    .prologue
    .line 9417
    iget-wide v0, p0, Landroid/support/v7/widget/RecyclerView$e;->d:J

    return-wide v0
.end method

.method public final f(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 1

    .prologue
    .line 9630
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->a:Landroid/support/v7/widget/RecyclerView$e$a;

    if-eqz v0, :cond_0

    .line 9632
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->a:Landroid/support/v7/widget/RecyclerView$e$a;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/RecyclerView$e$a;->b(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 9634
    :cond_0
    return-void
.end method

.method public final g()J
    .locals 2

    .prologue
    .line 9435
    iget-wide v0, p0, Landroid/support/v7/widget/RecyclerView$e;->f:J

    return-wide v0
.end method

.method public final g(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 1

    .prologue
    .line 9647
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->a:Landroid/support/v7/widget/RecyclerView$e$a;

    if-eqz v0, :cond_0

    .line 9649
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->a:Landroid/support/v7/widget/RecyclerView$e$a;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/RecyclerView$e$a;->d(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 9651
    :cond_0
    return-void
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 9453
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$e;->g:Z

    return v0
.end method

.method public final i()V
    .locals 3

    .prologue
    .line 9773
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 9774
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 9775
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9774
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9777
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9778
    return-void
.end method
