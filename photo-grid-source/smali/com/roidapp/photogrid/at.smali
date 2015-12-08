.class final Lcom/roidapp/photogrid/at;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/a/k;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/as;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/as;)V
    .locals 0

    .prologue
    .line 1262
    iput-object p1, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/n;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 1266
    invoke-virtual {p1}, Lcom/roidapp/photogrid/a/l;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1268
    const-string v0, "com.roidapp.photogrid.remove_ad_year"

    invoke-virtual {p2, v0}, Lcom/roidapp/photogrid/a/n;->a(Ljava/lang/String;)Lcom/roidapp/photogrid/a/o;

    move-result-object v0

    .line 1269
    const-string v1, "com.roidapp.photogrid.remove_ad_lifelong"

    invoke-virtual {p2, v1}, Lcom/roidapp/photogrid/a/n;->a(Ljava/lang/String;)Lcom/roidapp/photogrid/a/o;

    move-result-object v1

    .line 1271
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/roidapp/photogrid/a/o;->b()I

    move-result v1

    if-nez v1, :cond_2

    .line 1272
    iget-object v1, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v1, v1, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v1, v1, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    iput-boolean v2, v1, Lcom/roidapp/photogrid/MainPage;->d:Z

    .line 1273
    iget-object v1, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v1, v1, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v1, v1, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/a/m;->c(Landroid/content/Context;I)V

    .line 1277
    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/roidapp/photogrid/a/o;->b()I

    move-result v0

    if-nez v0, :cond_3

    .line 1278
    iget-object v0, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v0, v0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v0, v0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/MainPage;->e:Z

    .line 1279
    iget-object v0, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v0, v0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v0, v0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/a/m;->b(Landroid/content/Context;I)V

    .line 1283
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v0, v0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v0, v0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/MainPage;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v0, v0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v0, v0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/MainPage;->e:Z

    if-eqz v0, :cond_4

    .line 1284
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v0, v0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v0, v0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/MainPage;->c:Z

    .line 1286
    iget-object v0, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v0, v0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v0, v0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;I)V

    .line 1296
    :cond_1
    :goto_2
    return-void

    .line 1275
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v1, v1, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v1, v1, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v1, v3}, Lcom/roidapp/photogrid/a/m;->c(Landroid/content/Context;I)V

    goto :goto_0

    .line 1281
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v0, v0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v0, v0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/a/m;->b(Landroid/content/Context;I)V

    goto :goto_1

    .line 1288
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v0, v0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v0, v0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    iput-boolean v3, v0, Lcom/roidapp/photogrid/MainPage;->c:Z

    .line 1289
    iget-object v0, p0, Lcom/roidapp/photogrid/at;->a:Lcom/roidapp/photogrid/as;

    iget-object v0, v0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v0, v0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;I)V

    goto :goto_2
.end method
