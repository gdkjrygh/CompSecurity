.class final Lcom/roidapp/cloudlib/sns/h/o;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/h/h;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/h/h;)V
    .locals 0

    .prologue
    .line 1156
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/o;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 1177
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/o;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0, p2}, Lcom/roidapp/cloudlib/sns/h/h;->b(Lcom/roidapp/cloudlib/sns/h/h;Ljava/lang/Exception;)V

    .line 1178
    return-void
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1156
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/h;

    .line 2168
    const/4 v0, 0x0

    .line 2169
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/h;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 2170
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roidapp/cloudlib/sns/b/a/h;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/x;

    .line 2172
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/o;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/h/h;->b(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 1156
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1156
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/h;

    .line 3159
    const/4 v0, 0x0

    .line 3160
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/h;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 3161
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roidapp/cloudlib/sns/b/a/h;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/x;

    .line 3163
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/o;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 1156
    return-void
.end method
