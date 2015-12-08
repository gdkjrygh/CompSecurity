.class final Lcom/roidapp/imagelib/retouch/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/roidapp/imagelib/retouch/m;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/m;Landroid/app/Dialog;)V
    .locals 0

    .prologue
    .line 321
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/q;->b:Lcom/roidapp/imagelib/retouch/m;

    iput-object p2, p0, Lcom/roidapp/imagelib/retouch/q;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 325
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/q;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/m;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/q;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V

    .line 327
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/q;->b:Lcom/roidapp/imagelib/retouch/m;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/m;->p(Lcom/roidapp/imagelib/retouch/m;)Z

    .line 329
    :cond_0
    return-void
.end method
