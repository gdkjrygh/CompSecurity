.class public Lcom/facebook/fbservice/ops/aa;
.super Ljava/lang/Object;
.source "DialogBasedProgressIndicator.java"

# interfaces
.implements Lcom/facebook/fbservice/ops/ab;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private c:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/fbservice/ops/aa;->a:Landroid/content/Context;

    .line 30
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/aa;->b:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/fbservice/ops/aa;->a:Landroid/content/Context;

    .line 25
    iput-object p2, p0, Lcom/facebook/fbservice/ops/aa;->b:Ljava/lang/String;

    .line 26
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/fbservice/ops/aa;->c:Landroid/app/ProgressDialog;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/aa;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/fbservice/ops/aa;->c:Landroid/app/ProgressDialog;

    .line 37
    iget-object v0, p0, Lcom/facebook/fbservice/ops/aa;->c:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 38
    iget-object v0, p0, Lcom/facebook/fbservice/ops/aa;->c:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/facebook/fbservice/ops/aa;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 39
    iget-object v0, p0, Lcom/facebook/fbservice/ops/aa;->c:Landroid/app/ProgressDialog;

    invoke-static {v0}, Lcom/facebook/base/b/a;->a(Landroid/app/Dialog;)V

    .line 40
    iget-object v0, p0, Lcom/facebook/fbservice/ops/aa;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 42
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/fbservice/ops/aa;->c:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/fbservice/ops/aa;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/facebook/fbservice/ops/aa;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/fbservice/ops/aa;->c:Landroid/app/ProgressDialog;

    .line 50
    :cond_0
    return-void
.end method
