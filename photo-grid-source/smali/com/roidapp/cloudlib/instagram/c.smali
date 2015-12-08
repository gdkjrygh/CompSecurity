.class final Lcom/roidapp/cloudlib/instagram/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/c;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 120
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/c;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    iget-object v1, p0, Lcom/roidapp/cloudlib/instagram/c;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 122
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/c;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->finish()V

    .line 124
    :cond_0
    return v2
.end method
