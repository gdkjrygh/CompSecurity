.class Lcom/facebook/orca/l/l;
.super Ljava/lang/Object;
.source "MergeServiceHandler.java"

# interfaces
.implements Lcom/facebook/orca/l/v;


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Lcom/facebook/fbservice/service/OperationType;

.field final synthetic c:Lcom/facebook/fbservice/service/e;

.field final synthetic d:Lcom/facebook/orca/l/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/l/a;Landroid/os/Bundle;Lcom/facebook/fbservice/service/OperationType;Lcom/facebook/fbservice/service/e;)V
    .locals 0

    .prologue
    .line 1232
    iput-object p1, p0, Lcom/facebook/orca/l/l;->d:Lcom/facebook/orca/l/a;

    iput-object p2, p0, Lcom/facebook/orca/l/l;->a:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/facebook/orca/l/l;->b:Lcom/facebook/fbservice/service/OperationType;

    iput-object p4, p0, Lcom/facebook/orca/l/l;->c:Lcom/facebook/fbservice/service/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 1235
    iget-object v0, p0, Lcom/facebook/orca/l/l;->a:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 1236
    const-string v1, "folderName"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1237
    new-instance v1, Lcom/facebook/fbservice/service/ad;

    iget-object v2, p0, Lcom/facebook/orca/l/l;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-direct {v1, v2, v0}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 1238
    iget-object v0, p0, Lcom/facebook/orca/l/l;->c:Lcom/facebook/fbservice/service/e;

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
