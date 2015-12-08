.class final Lcom/roidapp/cloudlib/sns/basepost/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:J

.field final synthetic c:Lcom/roidapp/cloudlib/sns/basepost/w;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/w;IJ)V
    .locals 1

    .prologue
    .line 293
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    iput p2, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->a:I

    iput-wide p3, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .prologue
    .line 297
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->c(Lcom/roidapp/cloudlib/sns/basepost/w;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 298
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->c(Lcom/roidapp/cloudlib/sns/basepost/w;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    .line 304
    :goto_0
    return-void

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->b(Lcom/roidapp/cloudlib/sns/basepost/w;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    sget v1, Lcom/roidapp/cloudlib/sns/b/b;->b:I

    iput v1, v0, Lcom/roidapp/cloudlib/sns/b/a;->e:I

    .line 302
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->notifyDataSetChanged()V

    .line 303
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->a(Lcom/roidapp/cloudlib/sns/basepost/w;)Lcom/roidapp/cloudlib/sns/basepost/at;

    move-result-object v1

    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->b:J

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->b(Lcom/roidapp/cloudlib/sns/basepost/w;)Ljava/util/List;

    move-result-object v0

    iget v4, p0, Lcom/roidapp/cloudlib/sns/basepost/aa;->a:I

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/a;->c:Ljava/lang/String;

    invoke-interface {v1, v2, v3, v0}, Lcom/roidapp/cloudlib/sns/basepost/at;->a(JLjava/lang/String;)V

    goto :goto_0
.end method
