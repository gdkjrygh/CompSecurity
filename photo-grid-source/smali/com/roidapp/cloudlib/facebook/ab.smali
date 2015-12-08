.class final Lcom/roidapp/cloudlib/facebook/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/ab;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 110
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 111
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ab;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->setResult(I)V

    .line 112
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ab;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->finish()V

    .line 113
    return-void
.end method
