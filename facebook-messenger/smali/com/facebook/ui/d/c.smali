.class Lcom/facebook/ui/d/c;
.super Ljava/lang/Object;
.source "ErrorDialogBuilder.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/ui/d/a;


# direct methods
.method constructor <init>(Lcom/facebook/ui/d/a;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/facebook/ui/d/c;->a:Lcom/facebook/ui/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 130
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 131
    iget-object v0, p0, Lcom/facebook/ui/d/c;->a:Lcom/facebook/ui/d/a;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/ui/d/a;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/facebook/ui/d/c;->a:Lcom/facebook/ui/d/a;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/ui/d/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 134
    :cond_0
    new-instance v0, Lcom/facebook/ui/d/e;

    iget-object v1, p0, Lcom/facebook/ui/d/c;->a:Lcom/facebook/ui/d/a;

    invoke-static {v1}, Lcom/facebook/ui/d/a;->c(Lcom/facebook/ui/d/a;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/ui/d/e;-><init>(Landroid/content/Context;)V

    .line 135
    iget-object v1, p0, Lcom/facebook/ui/d/c;->a:Lcom/facebook/ui/d/a;

    invoke-static {v1}, Lcom/facebook/ui/d/a;->d(Lcom/facebook/ui/d/a;)Lcom/facebook/fbservice/service/ServiceException;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/e;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 136
    return-void
.end method
