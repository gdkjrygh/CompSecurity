.class final Lcom/roidapp/cloudlib/sns/notification/m;
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
.field final synthetic a:Lcom/roidapp/cloudlib/sns/b/h;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/b/p;

.field final synthetic c:Lcom/roidapp/cloudlib/sns/notification/f;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/f;Lcom/roidapp/cloudlib/sns/b/h;Lcom/roidapp/cloudlib/sns/b/p;)V
    .locals 0

    .prologue
    .line 451
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/m;->c:Lcom/roidapp/cloudlib/sns/notification/f;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/notification/m;->a:Lcom/roidapp/cloudlib/sns/b/h;

    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/notification/m;->b:Lcom/roidapp/cloudlib/sns/b/p;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 474
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/m;->a:Lcom/roidapp/cloudlib/sns/b/h;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/m;->b:Lcom/roidapp/cloudlib/sns/b/p;

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;)V

    .line 475
    return-void
.end method

.method public final b(ILjava/lang/Exception;)V
    .locals 4

    .prologue
    .line 468
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/m;->c:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Lcom/roidapp/cloudlib/sns/notification/f;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/m;->c:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Lcom/roidapp/cloudlib/sns/notification/f;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->k:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 469
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/m;->a:Lcom/roidapp/cloudlib/sns/b/h;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/m;->b:Lcom/roidapp/cloudlib/sns/b/p;

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;)V

    .line 470
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 451
    .line 1461
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/m;->a:Lcom/roidapp/cloudlib/sns/b/h;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/m;->b:Lcom/roidapp/cloudlib/sns/b/p;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 451
    return-void
.end method
