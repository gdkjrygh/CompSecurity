.class public Lcom/roidapp/baselib/c/s;
.super Landroid/support/v7/widget/bi;
.source "SourceFile"


# instance fields
.field public j:I

.field private final k:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0, p1}, Landroid/support/v7/widget/bi;-><init>(Landroid/view/View;)V

    .line 13
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/c/s;->k:Landroid/util/SparseArray;

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0, p1}, Landroid/support/v7/widget/bi;-><init>(Landroid/view/View;)V

    .line 13
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/c/s;->k:Landroid/util/SparseArray;

    .line 22
    iput p2, p0, Lcom/roidapp/baselib/c/s;->j:I

    .line 23
    return-void
.end method


# virtual methods
.method public final b(I)Landroid/view/View;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/baselib/c/s;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 28
    if-nez v0, :cond_0

    .line 29
    iget-object v0, p0, Lcom/roidapp/baselib/c/s;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/roidapp/baselib/c/s;->k:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 32
    :cond_0
    return-object v0
.end method
