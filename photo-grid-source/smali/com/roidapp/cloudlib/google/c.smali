.class final Lcom/roidapp/cloudlib/google/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/roidapp/cloudlib/google/c;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 68
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/c;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    iget-object v1, p0, Lcom/roidapp/cloudlib/google/c;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 70
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/c;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->finish()V

    .line 72
    :cond_0
    return v2
.end method
