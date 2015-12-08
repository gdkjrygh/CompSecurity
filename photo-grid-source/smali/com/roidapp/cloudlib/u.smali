.class final Lcom/roidapp/cloudlib/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/t;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/t;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/roidapp/cloudlib/u;->a:Lcom/roidapp/cloudlib/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 113
    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .prologue
    .line 103
    if-nez p2, :cond_0

    .line 104
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/AbsListView;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_0

    .line 105
    iget-object v0, p0, Lcom/roidapp/cloudlib/u;->a:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/t;->d()V

    .line 108
    :cond_0
    return-void
.end method
