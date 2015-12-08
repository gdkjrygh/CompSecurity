.class final Lcom/roidapp/cloudlib/google/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

.field final synthetic b:Lcom/roidapp/cloudlib/google/d;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/google/d;Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)V
    .locals 0

    .prologue
    .line 181
    iput-object p1, p0, Lcom/roidapp/cloudlib/google/f;->b:Lcom/roidapp/cloudlib/google/d;

    iput-object p2, p0, Lcom/roidapp/cloudlib/google/f;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 184
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/f;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 186
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->i:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 188
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/f;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/cloudlib/google/f;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 189
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/f;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->finish()V

    .line 191
    :cond_0
    return-void
.end method
