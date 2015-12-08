.class final Lcom/roidapp/cloudlib/facebook/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V
    .locals 0

    .prologue
    .line 563
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 569
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a()V

    .line 570
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->e(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/b;

    .line 571
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "<friends_albums>"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 572
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    const-class v3, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->startActivity(Landroid/content/Intent;)V

    .line 574
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->finish()V

    .line 587
    :goto_0
    return-void

    .line 576
    :cond_0
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    const-string v2, "FaceBook"

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/al;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/facebook/a;

    .line 577
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    iget-object v1, v1, Lcom/roidapp/cloudlib/facebook/a;->b:Ljava/lang/Class;

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 578
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->a()I

    move-result v4

    iget-object v5, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v5}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->f(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v6}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->g(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v3, v4, v5, v6}, Lcom/roidapp/cloudlib/common/a;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 580
    const-string v1, "albumid[%s],albumName[%s],albumCount[%d],userid[%s],username[%s]"

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->c()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->d()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/b;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x3

    iget-object v4, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v4}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->f(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v0, 0x4

    iget-object v4, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v4}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->g(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 583
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->n(Landroid/content/Context;)V

    .line 584
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->startActivity(Landroid/content/Intent;)V

    .line 585
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/j;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->finish()V

    goto :goto_0
.end method
