.class final Lcom/roidapp/cloudlib/sns/login/f;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/login/e;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/login/e;)V
    .locals 0

    .prologue
    .line 272
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/login/f;->a:Lcom/roidapp/cloudlib/sns/login/e;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 283
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 287
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/f;->a:Lcom/roidapp/cloudlib/sns/login/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/e;->f()V

    .line 288
    return-void
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 272
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 272
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/b;

    .line 1278
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/f;->a:Lcom/roidapp/cloudlib/sns/login/e;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/login/e;->a(Lcom/roidapp/cloudlib/sns/b/a/b;)V

    .line 272
    return-void
.end method
