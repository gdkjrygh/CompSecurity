.class final Lcom/roidapp/cloudlib/google/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

.field final synthetic b:Landroid/content/Intent;

.field final synthetic c:Lcom/roidapp/cloudlib/google/d;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/google/d;Lcom/roidapp/cloudlib/google/GoogleAuthActivity;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Lcom/roidapp/cloudlib/google/e;->c:Lcom/roidapp/cloudlib/google/d;

    iput-object p2, p0, Lcom/roidapp/cloudlib/google/e;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    iput-object p3, p0, Lcom/roidapp/cloudlib/google/e;->b:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 173
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/e;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/e;->a:Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    iget-object v1, p0, Lcom/roidapp/cloudlib/google/e;->b:Landroid/content/Intent;

    const/16 v2, 0x5454

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 176
    :cond_0
    return-void
.end method
