.class final Lcom/roidapp/cloudlib/sns/h/l;
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
.field final synthetic a:Lcom/roidapp/cloudlib/sns/b/p;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/h/h;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/p;)V
    .locals 0

    .prologue
    .line 807
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/l;->b:Lcom/roidapp/cloudlib/sns/h/h;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/h/l;->a:Lcom/roidapp/cloudlib/sns/b/p;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 832
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/l;->b:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/h/h;->r(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/l;->a:Lcom/roidapp/cloudlib/sns/b/p;

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;)V

    .line 833
    return-void
.end method

.method public final b(ILjava/lang/Exception;)V
    .locals 4

    .prologue
    .line 822
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/l;->b:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/h/h;->r(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/l;->a:Lcom/roidapp/cloudlib/sns/b/p;

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/c;)V

    .line 823
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/l;->b:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 828
    :goto_0
    return-void

    .line 824
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/l;->b:Lcom/roidapp/cloudlib/sns/h/h;

    sget v1, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->b(Lcom/roidapp/cloudlib/sns/h/h;I)V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 807
    .line 1815
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/l;->b:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/h/h;->r(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/l;->a:Lcom/roidapp/cloudlib/sns/b/p;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 807
    return-void
.end method
