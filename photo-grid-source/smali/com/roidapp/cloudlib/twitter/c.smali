.class final Lcom/roidapp/cloudlib/twitter/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/roidapp/cloudlib/twitter/c;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 63
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 64
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/c;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->setResult(I)V

    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/c;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->finish()V

    .line 66
    return-void
.end method
