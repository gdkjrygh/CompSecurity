.class final Lcom/roidapp/cloudlib/facebook/ai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/ai;->a:Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 155
    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .prologue
    .line 139
    if-nez p2, :cond_0

    .line 140
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ai;->a:Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->a(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 150
    :cond_0
    :goto_0
    return-void

    .line 142
    :cond_1
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/AbsListView;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    .line 143
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ai;->a:Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->a(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;Z)Z

    .line 144
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ai;->a:Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->d()V

    goto :goto_0

    .line 145
    :cond_2
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v0

    if-nez v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ai;->a:Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->a(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;Z)Z

    .line 147
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ai;->a:Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;->d()V

    goto :goto_0
.end method
