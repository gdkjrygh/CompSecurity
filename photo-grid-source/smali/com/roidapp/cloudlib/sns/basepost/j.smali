.class final Lcom/roidapp/cloudlib/sns/basepost/j;
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
    .line 132
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/j;->b:Lcom/roidapp/cloudlib/sns/basepost/i;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/j;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    .line 135
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/roidapp/cloudlib/sns/basepost/s;

    .line 136
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/j;->b:Lcom/roidapp/cloudlib/sns/basepost/i;

    iget-object v1, v5, Lcom/roidapp/cloudlib/sns/basepost/s;->a:Landroid/support/v7/widget/bi;

    iget v2, v5, Lcom/roidapp/cloudlib/sns/basepost/s;->b:I

    iget v3, v5, Lcom/roidapp/cloudlib/sns/basepost/s;->c:I

    iget v4, v5, Lcom/roidapp/cloudlib/sns/basepost/s;->d:I

    iget v5, v5, Lcom/roidapp/cloudlib/sns/basepost/s;->e:I

    invoke-static/range {v0 .. v5}, Lcom/roidapp/cloudlib/sns/basepost/i;->a(Lcom/roidapp/cloudlib/sns/basepost/i;Landroid/support/v7/widget/bi;IIII)V

    goto :goto_0

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 140
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/j;->b:Lcom/roidapp/cloudlib/sns/basepost/i;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/i;->a(Lcom/roidapp/cloudlib/sns/basepost/i;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 141
    return-void
.end method
