.class final Lcom/roidapp/cloudlib/sns/d/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/upload/j;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/d/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/d/a;)V
    .locals 0

    .prologue
    .line 329
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/d/d;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 332
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b()I

    .line 333
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/d;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/d/a;->a(Ljava/util/Collection;)V

    .line 334
    return-void
.end method

.method public final a(JI)V
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/d;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {v0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/d/a;->a(Lcom/roidapp/cloudlib/sns/d/a;JI)Z

    .line 344
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 338
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/d;->a:Lcom/roidapp/cloudlib/sns/d/a;

    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/d/a;->a(Ljava/util/Collection;)V

    .line 339
    return-void
.end method
