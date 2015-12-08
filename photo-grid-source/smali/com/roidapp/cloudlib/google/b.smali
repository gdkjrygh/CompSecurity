.class final Lcom/roidapp/cloudlib/google/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/roidapp/cloudlib/google/b;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 60
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 61
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/b;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/cloudlib/google/b;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 62
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/b;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->finish()V

    .line 63
    return-void
.end method
