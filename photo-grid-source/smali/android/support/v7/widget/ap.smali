.class public abstract Landroid/support/v7/widget/ap;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/support/v7/widget/aq;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

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

    .line 9250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9252
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/ap;->a:Landroid/support/v7/widget/aq;

    .line 9253
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/ap;->b:Ljava/util/ArrayList;

    .line 9256
    iput-wide v2, p0, Landroid/support/v7/widget/ap;->c:J

    .line 9257
    iput-wide v2, p0, Landroid/support/v7/widget/ap;->d:J

    .line 9258
    iput-wide v4, p0, Landroid/support/v7/widget/ap;->e:J

    .line 9259
    iput-wide v4, p0, Landroid/support/v7/widget/ap;->f:J

    .line 9261
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/ap;->g:Z

    .line 9675
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method final a(Landroid/support/v7/widget/aq;)V
    .locals 0

    .prologue
    .line 9373
    iput-object p1, p0, Landroid/support/v7/widget/ap;->a:Landroid/support/v7/widget/aq;

    .line 9374
    return-void
.end method

.method public abstract a(Landroid/support/v7/widget/bi;)Z
.end method

.method public abstract a(Landroid/support/v7/widget/bi;IIII)Z
.end method

.method public abstract a(Landroid/support/v7/widget/bi;Landroid/support/v7/widget/bi;IIII)Z
.end method

.method public abstract b()Z
.end method

.method public abstract b(Landroid/support/v7/widget/bi;)Z
.end method

.method public abstract c()V
.end method

.method public abstract c(Landroid/support/v7/widget/bi;)V
.end method

.method public final d()J
    .locals 2

    .prologue
    .line 9269
    iget-wide v0, p0, Landroid/support/v7/widget/ap;->e:J

    return-wide v0
.end method

.method public final d(Landroid/support/v7/widget/bi;)V
    .locals 1

    .prologue
    .line 9495
    iget-object v0, p0, Landroid/support/v7/widget/ap;->a:Landroid/support/v7/widget/aq;

    if-eqz v0, :cond_0

    .line 9496
    iget-object v0, p0, Landroid/support/v7/widget/ap;->a:Landroid/support/v7/widget/aq;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/aq;->a(Landroid/support/v7/widget/bi;)V

    .line 9498
    :cond_0
    return-void
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 9287
    iget-wide v0, p0, Landroid/support/v7/widget/ap;->c:J

    return-wide v0
.end method

.method public final e(Landroid/support/v7/widget/bi;)V
    .locals 1

    .prologue
    .line 9507
    iget-object v0, p0, Landroid/support/v7/widget/ap;->a:Landroid/support/v7/widget/aq;

    if-eqz v0, :cond_0

    .line 9508
    iget-object v0, p0, Landroid/support/v7/widget/ap;->a:Landroid/support/v7/widget/aq;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/aq;->c(Landroid/support/v7/widget/bi;)V

    .line 9510
    :cond_0
    return-void
.end method

.method public final f()J
    .locals 2

    .prologue
    .line 9305
    iget-wide v0, p0, Landroid/support/v7/widget/ap;->d:J

    return-wide v0
.end method

.method public final f(Landroid/support/v7/widget/bi;)V
    .locals 1

    .prologue
    .line 9519
    iget-object v0, p0, Landroid/support/v7/widget/ap;->a:Landroid/support/v7/widget/aq;

    if-eqz v0, :cond_0

    .line 9520
    iget-object v0, p0, Landroid/support/v7/widget/ap;->a:Landroid/support/v7/widget/aq;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/aq;->b(Landroid/support/v7/widget/bi;)V

    .line 9522
    :cond_0
    return-void
.end method

.method public final g()J
    .locals 2

    .prologue
    .line 9323
    iget-wide v0, p0, Landroid/support/v7/widget/ap;->f:J

    return-wide v0
.end method

.method public final g(Landroid/support/v7/widget/bi;)V
    .locals 1

    .prologue
    .line 9536
    iget-object v0, p0, Landroid/support/v7/widget/ap;->a:Landroid/support/v7/widget/aq;

    if-eqz v0, :cond_0

    .line 9537
    iget-object v0, p0, Landroid/support/v7/widget/ap;->a:Landroid/support/v7/widget/aq;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/aq;->d(Landroid/support/v7/widget/bi;)V

    .line 9539
    :cond_0
    return-void
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 9341
    iget-boolean v0, p0, Landroid/support/v7/widget/ap;->g:Z

    return v0
.end method

.method public final i()V
    .locals 3

    .prologue
    .line 9661
    iget-object v0, p0, Landroid/support/v7/widget/ap;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 9662
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 9663
    iget-object v2, p0, Landroid/support/v7/widget/ap;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9662
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9665
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/ap;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9666
    return-void
.end method
