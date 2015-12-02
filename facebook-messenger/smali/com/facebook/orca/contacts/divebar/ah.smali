.class Lcom/facebook/orca/contacts/divebar/ah;
.super Lcom/facebook/fbservice/ops/ac;
.source "DivebarLoader.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/ad;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/ad;)V
    .locals 0

    .prologue
    .line 361
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ah;->a:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 364
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ah;->a:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-static {v0, p1}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/ad;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 365
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 369
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "SYNC_TOP_LAST_ACTIVE error"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 370
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 361
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/divebar/ah;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
