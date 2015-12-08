.class final Lcom/roidapp/cloudlib/facebook/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)V
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/r;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
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
    .line 223
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/r;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a()V

    .line 224
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/r;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->b(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/FbFriend;

    .line 225
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/r;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    const-class v3, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 227
    const-string v2, "user_id"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbFriend;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 228
    const-string v2, "user_name"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbFriend;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 229
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/r;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->startActivity(Landroid/content/Intent;)V

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/r;->a:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->finish()V

    .line 231
    return-void
.end method
