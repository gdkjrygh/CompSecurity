.class public final Lcom/roidapp/cloudlib/sns/topic/c;
.super Landroid/support/v7/widget/ax;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/topic/b;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/sns/topic/b;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/c;->a:Lcom/roidapp/cloudlib/sns/topic/b;

    invoke-direct {p0}, Landroid/support/v7/widget/ax;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 2

    .prologue
    .line 52
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/ax;->a(Landroid/support/v7/widget/RecyclerView;II)V

    .line 54
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/c;->a:Lcom/roidapp/cloudlib/sns/topic/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/b;->a(Lcom/roidapp/cloudlib/sns/topic/b;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/au;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/GridLayoutManager;

    .line 56
    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->l()I

    move-result v0

    .line 57
    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 58
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/c;->a:Lcom/roidapp/cloudlib/sns/topic/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/b;->b(Lcom/roidapp/cloudlib/sns/topic/b;)Z

    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/c;->a:Lcom/roidapp/cloudlib/sns/topic/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/topic/b;->i()V

    .line 62
    :cond_0
    return-void
.end method
