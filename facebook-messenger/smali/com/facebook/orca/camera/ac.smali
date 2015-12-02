.class Lcom/facebook/orca/camera/ac;
.super Ljava/lang/Object;
.source "Util.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/camera/ab;


# direct methods
.method constructor <init>(Lcom/facebook/orca/camera/ab;)V
    .locals 0

    .prologue
    .line 347
    iput-object p1, p0, Lcom/facebook/orca/camera/ac;->a:Lcom/facebook/orca/camera/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 349
    iget-object v0, p0, Lcom/facebook/orca/camera/ac;->a:Lcom/facebook/orca/camera/ab;

    invoke-static {v0}, Lcom/facebook/orca/camera/ab;->a(Lcom/facebook/orca/camera/ab;)Lcom/facebook/orca/camera/x;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/camera/ac;->a:Lcom/facebook/orca/camera/ab;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/camera/x;->b(Lcom/facebook/orca/camera/z;)V

    .line 350
    iget-object v0, p0, Lcom/facebook/orca/camera/ac;->a:Lcom/facebook/orca/camera/ab;

    invoke-static {v0}, Lcom/facebook/orca/camera/ab;->b(Lcom/facebook/orca/camera/ab;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/camera/ac;->a:Lcom/facebook/orca/camera/ab;

    invoke-static {v0}, Lcom/facebook/orca/camera/ab;->b(Lcom/facebook/orca/camera/ab;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 351
    :cond_0
    return-void
.end method
