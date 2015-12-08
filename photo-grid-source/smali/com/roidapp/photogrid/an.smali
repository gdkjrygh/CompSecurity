.class final Lcom/roidapp/photogrid/an;
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

.field final synthetic b:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 936
    iput-object p1, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    iput-object p2, p0, Lcom/roidapp/photogrid/an;->a:Landroid/content/Intent;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 1011
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1023
    :cond_0
    :goto_0
    return-void

    .line 1014
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 1015
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    const-string v1, "Login failed"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1016
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->j()V

    .line 1018
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->t(Lcom/roidapp/photogrid/MainPage;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1019
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/MainPage;->b(Lcom/roidapp/photogrid/MainPage;Z)Z

    .line 1021
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->u(Lcom/roidapp/photogrid/MainPage;)Z

    goto :goto_0
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 936
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 936
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/p;

    .line 1939
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1944
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->a:Landroid/content/Intent;

    if-eqz v0, :cond_4

    .line 1946
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->a:Landroid/content/Intent;

    const-string v1, "signData"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 1948
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->a:Landroid/content/Intent;

    const-string v2, "page_name"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1950
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz p1, :cond_3

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_3

    .line 1951
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-boolean v3, v0, Lcom/roidapp/cloudlib/sns/b/x;->r:Z

    .line 1952
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v4

    if-eqz v3, :cond_1

    const/4 v0, 0x3

    :goto_0
    invoke-virtual {v4, v2, v0}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    .line 1955
    if-eqz v1, :cond_2

    .line 1956
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v2, Lcom/roidapp/photogrid/ao;

    invoke-direct {v2, p0, v1, v3}, Lcom/roidapp/photogrid/ao;-><init>(Lcom/roidapp/photogrid/an;Landroid/os/Bundle;Z)V

    invoke-static {v0, v4, v5, v1, v2}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JLandroid/os/Bundle;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 2004
    :cond_0
    :goto_1
    return-void

    .line 1952
    :cond_1
    const/4 v0, 0x4

    goto :goto_0

    .line 1995
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/MainPage;->a(Lcom/roidapp/photogrid/MainPage;Z)V

    goto :goto_1

    .line 1999
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/MainPage;->a(Lcom/roidapp/photogrid/MainPage;Z)V

    goto :goto_1

    .line 2005
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/MainPage;->a(Lcom/roidapp/photogrid/MainPage;Z)V

    goto :goto_1
.end method
