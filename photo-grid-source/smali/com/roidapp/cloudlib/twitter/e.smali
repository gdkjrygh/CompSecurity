.class final Lcom/roidapp/cloudlib/twitter/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lcom/roidapp/cloudlib/twitter/e;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/e;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a()V

    .line 119
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/e;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->finish()V

    .line 120
    return-void
.end method
