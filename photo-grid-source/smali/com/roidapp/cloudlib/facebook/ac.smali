.class final Lcom/roidapp/cloudlib/facebook/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/ac;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 118
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 119
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ac;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->setResult(I)V

    .line 120
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/ac;->a:Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->finish()V

    .line 122
    :cond_0
    return v2
.end method
