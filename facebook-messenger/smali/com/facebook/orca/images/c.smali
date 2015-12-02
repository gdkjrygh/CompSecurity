.class Lcom/facebook/orca/images/c;
.super Lcom/facebook/fbservice/ops/h;
.source "ImageSearchActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/images/ImageSearchActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/images/ImageSearchActivity;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/facebook/orca/images/c;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 136
    iget-object v1, p0, Lcom/facebook/orca/images/c;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    invoke-static {v1, v0}, Lcom/facebook/orca/images/ImageSearchActivity;->a(Lcom/facebook/orca/images/ImageSearchActivity;Landroid/os/Bundle;)V

    .line 137
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/orca/images/c;->a:Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-static {v0}, Lcom/facebook/orca/images/ImageSearchActivity;->d(Lcom/facebook/orca/images/ImageSearchActivity;)V

    .line 142
    return-void
.end method
