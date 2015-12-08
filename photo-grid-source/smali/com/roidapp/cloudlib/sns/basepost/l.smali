.class final Lcom/roidapp/cloudlib/sns/basepost/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/basepost/i;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/i;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 179
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/l;->b:Lcom/roidapp/cloudlib/sns/basepost/i;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/l;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 181
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/l;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 182
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/l;->b:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v2, v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->a(Lcom/roidapp/cloudlib/sns/basepost/i;Landroid/support/v7/widget/bi;)V

    goto :goto_0

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/l;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 185
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/l;->b:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->c(Lcom/roidapp/cloudlib/sns/basepost/i;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/l;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 186
    return-void
.end method
