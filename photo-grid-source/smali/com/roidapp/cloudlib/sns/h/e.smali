.class final Lcom/roidapp/cloudlib/sns/h/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/h/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/h/a;)V
    .locals 0

    .prologue
    .line 539
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/e;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 542
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/e;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->f(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 543
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/e;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->f(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 544
    :cond_0
    return-void
.end method
