.class final Lcom/roidapp/cloudlib/instagram/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/b;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 112
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/b;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/cloudlib/instagram/b;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 114
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/b;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->finish()V

    .line 115
    return-void
.end method
