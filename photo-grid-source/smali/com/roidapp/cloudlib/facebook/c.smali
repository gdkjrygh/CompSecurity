.class final Lcom/roidapp/cloudlib/facebook/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;)V
    .locals 0

    .prologue
    .line 173
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/c;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 177
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/c;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/al;->a(Landroid/content/Context;)V

    .line 178
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/c;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->a()V

    .line 179
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/c;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/c;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->startActivity(Landroid/content/Intent;)V

    .line 181
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/c;->a:Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;->finish()V

    .line 182
    return-void
.end method
