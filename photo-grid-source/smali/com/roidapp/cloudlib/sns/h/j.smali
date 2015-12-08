.class final Lcom/roidapp/cloudlib/sns/h/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/upload/j;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/h/h;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/h/h;)V
    .locals 0

    .prologue
    .line 504
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/j;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 507
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b()I

    .line 508
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/j;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->a(Ljava/util/Collection;)V

    .line 509
    return-void
.end method

.method public final a(JI)V
    .locals 1

    .prologue
    .line 518
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/j;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {v0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/h/h;JI)Z

    .line 519
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 513
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/j;->a:Lcom/roidapp/cloudlib/sns/h/h;

    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->a(Ljava/util/Collection;)V

    .line 514
    return-void
.end method
