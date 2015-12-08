.class final Lcom/roidapp/cloudlib/template/c/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/template/c/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/template/c/a;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/c/b;->a:Lcom/roidapp/cloudlib/template/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/b;->a:Lcom/roidapp/cloudlib/template/c/a;

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/c/a;->c:Lcom/roidapp/cloudlib/template/b/a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->cw:I

    if-ne v0, v1, :cond_0

    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/b;->a:Lcom/roidapp/cloudlib/template/c/a;

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/c/a;->c:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/template/b/a;->e()V

    .line 49
    :cond_0
    return-void
.end method
