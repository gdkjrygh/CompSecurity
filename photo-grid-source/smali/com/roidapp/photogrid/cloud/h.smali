.class final Lcom/roidapp/photogrid/cloud/h;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcom/roidapp/photogrid/cloud/BaseShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 758
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/h;->b:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/h;->a:Landroid/content/Intent;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 777
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/h;->b:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->m()V

    .line 778
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/h;->b:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v1, "Login Failed"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 779
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 780
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 758
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/p;

    .line 1761
    const/4 v0, 0x0

    .line 1762
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/h;->a:Landroid/content/Intent;

    if-eqz v1, :cond_0

    .line 1763
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/h;->a:Landroid/content/Intent;

    const-string v2, "page_name"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1764
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p1, :cond_0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v1, :cond_0

    .line 1765
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-boolean v1, v0, Lcom/roidapp/cloudlib/sns/b/x;->r:Z

    .line 1766
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v3

    if-eqz v1, :cond_1

    const/4 v0, 0x3

    :goto_0
    invoke-virtual {v3, v2, v0}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    move v0, v1

    .line 1769
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/h;->b:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->m()V

    .line 1770
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/h;->b:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v2, "Login Successfully"

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1772
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/h;->b:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/social/c;->a(ZLandroid/app/Activity;)V

    .line 758
    return-void

    .line 1766
    :cond_1
    const/4 v0, 0x4

    goto :goto_0
.end method
