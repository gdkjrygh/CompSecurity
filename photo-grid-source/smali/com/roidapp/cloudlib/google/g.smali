.class final Lcom/roidapp/cloudlib/google/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

.field final synthetic b:Landroid/os/Bundle;

.field final synthetic c:Lcom/roidapp/cloudlib/google/d;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/google/d;Lcom/roidapp/cloudlib/google/GoogleAuthActivity;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 245
    iput-object p1, p0, Lcom/roidapp/cloudlib/google/g;->c:Lcom/roidapp/cloudlib/google/d;

    iput-object p2, p0, Lcom/roidapp/cloudlib/google/g;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    iput-object p3, p0, Lcom/roidapp/cloudlib/google/g;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 248
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/g;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/g;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 250
    const-string v1, "signData"

    iget-object v2, p0, Lcom/roidapp/cloudlib/google/g;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 251
    iget-object v1, p0, Lcom/roidapp/cloudlib/google/g;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    const/4 v2, -0x1

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 252
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/g;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->finish()V

    .line 254
    :cond_0
    return-void
.end method
