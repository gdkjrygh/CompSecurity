.class final Lcom/roidapp/cloudlib/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/t;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/t;)V
    .locals 0

    .prologue
    .line 418
    iput-object p1, p0, Lcom/roidapp/cloudlib/ab;->a:Lcom/roidapp/cloudlib/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 422
    iget-object v0, p0, Lcom/roidapp/cloudlib/ab;->a:Lcom/roidapp/cloudlib/t;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/t;->h:Z

    .line 423
    const-string v0, "BaseFragment"

    const-string v1, "download dialog is dismiss, set mIsDownloadDialogShow false."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 424
    return-void
.end method
