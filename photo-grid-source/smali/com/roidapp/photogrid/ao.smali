.class final Lcom/roidapp/photogrid/ao;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Z

.field final synthetic c:Lcom/roidapp/photogrid/an;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/an;Landroid/os/Bundle;Z)V
    .locals 0

    .prologue
    .line 957
    iput-object p1, p0, Lcom/roidapp/photogrid/ao;->c:Lcom/roidapp/photogrid/an;

    iput-object p2, p0, Lcom/roidapp/photogrid/ao;->a:Landroid/os/Bundle;

    iput-boolean p3, p0, Lcom/roidapp/photogrid/ao;->b:Z

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 987
    iget-object v0, p0, Lcom/roidapp/photogrid/ao;->c:Lcom/roidapp/photogrid/an;

    iget-object v0, v0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 991
    :goto_0
    return-void

    .line 990
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/ao;->c:Lcom/roidapp/photogrid/an;

    iget-object v0, v0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    iget-boolean v1, p0, Lcom/roidapp/photogrid/ao;->b:Z

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/MainPage;->a(Lcom/roidapp/photogrid/MainPage;Z)V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 957
    .line 1959
    iget-object v0, p0, Lcom/roidapp/photogrid/ao;->c:Lcom/roidapp/photogrid/an;

    iget-object v0, v0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1963
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    .line 1964
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v1

    .line 1965
    if-eqz v1, :cond_2

    iget-object v2, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v2, :cond_2

    .line 1967
    iget-object v2, p0, Lcom/roidapp/photogrid/ao;->a:Landroid/os/Bundle;

    const-string v3, "nickname"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1968
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 1969
    iget-object v3, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v2, v3, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    .line 1971
    :cond_0
    iget-object v2, p0, Lcom/roidapp/photogrid/ao;->a:Landroid/os/Bundle;

    const-string v3, "gender"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1972
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 1973
    iget-object v3, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v2, v3, Lcom/roidapp/cloudlib/sns/b/x;->d:Ljava/lang/String;

    .line 1975
    :cond_1
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/q;->a(Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 1977
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v2, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v3, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/x;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/p;Ljava/lang/String;Ljava/lang/String;)V

    .line 1982
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/ao;->c:Lcom/roidapp/photogrid/an;

    iget-object v0, v0, Lcom/roidapp/photogrid/an;->b:Lcom/roidapp/photogrid/MainPage;

    iget-boolean v1, p0, Lcom/roidapp/photogrid/ao;->b:Z

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/MainPage;->a(Lcom/roidapp/photogrid/MainPage;Z)V

    .line 957
    :cond_3
    return-void
.end method
