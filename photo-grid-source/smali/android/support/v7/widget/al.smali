.class public abstract Landroid/support/v7/widget/al;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VH:",
        "Landroid/support/v7/widget/bi;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Landroid/support/v7/widget/am;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5008
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5009
    new-instance v0, Landroid/support/v7/widget/am;

    invoke-direct {v0}, Landroid/support/v7/widget/am;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/al;->a:Landroid/support/v7/widget/am;

    .line 5010
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/al;->b:Z

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public a(I)I
    .locals 1

    .prologue
    .line 5101
    const/4 v0, 0x0

    return v0
.end method

.method public abstract a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/bi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)TVH;"
        }
    .end annotation
.end method

.method public final a(II)V
    .locals 1

    .prologue
    .line 5358
    iget-object v0, p0, Landroid/support/v7/widget/al;->a:Landroid/support/v7/widget/am;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/am;->a(II)V

    .line 5359
    return-void
.end method

.method public final a(Landroid/support/v7/widget/an;)V
    .locals 1

    .prologue
    .line 5259
    iget-object v0, p0, Landroid/support/v7/widget/al;->a:Landroid/support/v7/widget/am;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/am;->registerObserver(Ljava/lang/Object;)V

    .line 5260
    return-void
.end method

.method public abstract a(Landroid/support/v7/widget/bi;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;I)V"
        }
    .end annotation
.end method

.method public b(I)J
    .locals 2

    .prologue
    .line 5129
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final b(II)V
    .locals 1

    .prologue
    .line 5443
    iget-object v0, p0, Landroid/support/v7/widget/al;->a:Landroid/support/v7/widget/am;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/am;->b(II)V

    .line 5444
    return-void
.end method

.method public final b(Landroid/support/v7/widget/an;)V
    .locals 1

    .prologue
    .line 5273
    iget-object v0, p0, Landroid/support/v7/widget/al;->a:Landroid/support/v7/widget/am;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/am;->unregisterObserver(Ljava/lang/Object;)V

    .line 5274
    return-void
.end method

.method public final b(Landroid/support/v7/widget/bi;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;I)V"
        }
    .end annotation

    .prologue
    .line 5076
    iput p2, p1, Landroid/support/v7/widget/bi;->b:I

    .line 6147
    iget-boolean v0, p0, Landroid/support/v7/widget/al;->b:Z

    .line 5077
    if-eqz v0, :cond_0

    .line 5078
    invoke-virtual {p0, p2}, Landroid/support/v7/widget/al;->b(I)J

    move-result-wide v0

    iput-wide v0, p1, Landroid/support/v7/widget/bi;->d:J

    .line 5080
    :cond_0
    const/4 v0, 0x1

    const/16 v1, 0x207

    invoke-virtual {p1, v0, v1}, Landroid/support/v7/widget/bi;->a(II)V

    .line 5083
    const-string v0, "RV OnBindView"

    invoke-static {v0}, Landroid/support/v4/os/TraceCompat;->beginSection(Ljava/lang/String;)V

    .line 5084
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/al;->a(Landroid/support/v7/widget/bi;I)V

    .line 5085
    invoke-static {}, Landroid/support/v4/os/TraceCompat;->endSection()V

    .line 5086
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 5326
    iget-object v0, p0, Landroid/support/v7/widget/al;->a:Landroid/support/v7/widget/am;

    invoke-virtual {v0}, Landroid/support/v7/widget/am;->a()V

    .line 5327
    return-void
.end method

.method public final c_(I)V
    .locals 2

    .prologue
    .line 5341
    iget-object v0, p0, Landroid/support/v7/widget/al;->a:Landroid/support/v7/widget/am;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v7/widget/am;->a(II)V

    .line 5342
    return-void
.end method

.method public final d(I)V
    .locals 2

    .prologue
    .line 5426
    iget-object v0, p0, Landroid/support/v7/widget/al;->a:Landroid/support/v7/widget/am;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v7/widget/am;->b(II)V

    .line 5427
    return-void
.end method

.method public final k_()Z
    .locals 1

    .prologue
    .line 5147
    iget-boolean v0, p0, Landroid/support/v7/widget/al;->b:Z

    return v0
.end method
