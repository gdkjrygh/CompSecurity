.class public abstract Landroid/support/v7/widget/RecyclerView$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/support/v7/widget/RecyclerView$b;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5062
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5063
    new-instance v0, Landroid/support/v7/widget/RecyclerView$b;

    invoke-direct {v0}, Landroid/support/v7/widget/RecyclerView$b;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$a;->a:Landroid/support/v7/widget/RecyclerView$b;

    .line 5064
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$a;->b:Z

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public a(I)I
    .locals 1

    .prologue
    .line 5155
    const/4 v0, 0x0

    return v0
.end method

.method public abstract a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$t;
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$c;)V
    .locals 1

    .prologue
    .line 5313
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$a;->a:Landroid/support/v7/widget/RecyclerView$b;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$b;->registerObserver(Ljava/lang/Object;)V

    .line 5314
    return-void
.end method

.method public a(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 0

    .prologue
    .line 5273
    return-void
.end method

.method public abstract a(Landroid/support/v7/widget/RecyclerView$t;I)V
.end method

.method public final b(Landroid/support/v7/widget/RecyclerView$c;)V
    .locals 1

    .prologue
    .line 5327
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$a;->a:Landroid/support/v7/widget/RecyclerView$b;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$b;->unregisterObserver(Ljava/lang/Object;)V

    .line 5328
    return-void
.end method

.method public b(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 0

    .prologue
    .line 5285
    return-void
.end method

.method public final b(Landroid/support/v7/widget/RecyclerView$t;I)V
    .locals 2

    .prologue
    .line 5130
    iput p2, p1, Landroid/support/v7/widget/RecyclerView$t;->b:I

    .line 5131
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$a;->b:Z

    if-eqz v0, :cond_0

    .line 5132
    const-wide/16 v0, -0x1

    iput-wide v0, p1, Landroid/support/v7/widget/RecyclerView$t;->d:J

    .line 5134
    :cond_0
    const/4 v0, 0x1

    const/16 v1, 0x207

    invoke-virtual {p1, v0, v1}, Landroid/support/v7/widget/RecyclerView$t;->a(II)V

    .line 5137
    const-string v0, "RV OnBindView"

    invoke-static {v0}, Landroid/support/v4/os/TraceCompat;->beginSection(Ljava/lang/String;)V

    .line 5138
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$a;->a(Landroid/support/v7/widget/RecyclerView$t;I)V

    .line 5139
    invoke-static {}, Landroid/support/v4/os/TraceCompat;->endSection()V

    .line 5140
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 5201
    iget-boolean v0, p0, Landroid/support/v7/widget/RecyclerView$a;->b:Z

    return v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 5380
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$a;->a:Landroid/support/v7/widget/RecyclerView$b;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$b;->a()V

    .line 5381
    return-void
.end method
