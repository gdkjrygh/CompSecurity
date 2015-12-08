.class final Lkik/android/widget/b;
.super Landroid/support/v7/widget/GridLayoutManager$b;
.source "SourceFile"


# instance fields
.field final synthetic b:Lkik/android/widget/AutoResizeRecyclerGridView;


# direct methods
.method constructor <init>(Lkik/android/widget/AutoResizeRecyclerGridView;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lkik/android/widget/b;->b:Lkik/android/widget/AutoResizeRecyclerGridView;

    invoke-direct {p0}, Landroid/support/v7/widget/GridLayoutManager$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lkik/android/widget/b;->b:Lkik/android/widget/AutoResizeRecyclerGridView;

    invoke-virtual {v0}, Lkik/android/widget/AutoResizeRecyclerGridView;->b()Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v0

    .line 52
    iget-object v1, p0, Lkik/android/widget/b;->b:Lkik/android/widget/AutoResizeRecyclerGridView;

    invoke-static {v1}, Lkik/android/widget/AutoResizeRecyclerGridView;->a(Lkik/android/widget/AutoResizeRecyclerGridView;)I

    move-result v1

    if-ge p1, v1, :cond_0

    instance-of v1, v0, Landroid/support/v7/widget/GridLayoutManager;

    if-eqz v1, :cond_0

    .line 53
    check-cast v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->c()I

    move-result v0

    .line 55
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method
