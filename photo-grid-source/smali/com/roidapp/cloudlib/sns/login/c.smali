.class final Lcom/roidapp/cloudlib/sns/login/c;
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
.field final synthetic a:Lcom/roidapp/cloudlib/sns/b/x;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/b/p;

.field final synthetic c:Lcom/roidapp/cloudlib/sns/login/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/login/a;Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V
    .locals 0

    .prologue
    .line 248
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/login/c;->c:Lcom/roidapp/cloudlib/sns/login/a;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/login/c;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/login/c;->b:Lcom/roidapp/cloudlib/sns/b/p;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 265
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/c;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/login/c;->b:Lcom/roidapp/cloudlib/sns/b/p;

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;)V

    .line 266
    return-void
.end method

.method public final b(ILjava/lang/Exception;)V
    .locals 4

    .prologue
    .line 260
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/c;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/login/c;->b:Lcom/roidapp/cloudlib/sns/b/p;

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;)V

    .line 261
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 248
    .line 1254
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/c;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/login/c;->b:Lcom/roidapp/cloudlib/sns/b/p;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 248
    return-void
.end method
