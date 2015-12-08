.class final Lcom/roidapp/cloudlib/template/c/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/template/c/c;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/template/c/c;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/c/e;->a:Lcom/roidapp/cloudlib/template/c/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 66
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/e;->a:Lcom/roidapp/cloudlib/template/c/c;

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/c/c;->c:Lcom/roidapp/cloudlib/template/b/a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->ct:I

    if-ne v0, v1, :cond_0

    .line 67
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/e;->a:Lcom/roidapp/cloudlib/template/c/c;

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/c/c;->c:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/template/b/a;->f()V

    .line 69
    :cond_0
    return-void
.end method
