.class Lcom/facebook/contacts/database/c;
.super Lcom/facebook/fbservice/ops/ac;
.source "AddressBookPeriodicRunner.java"


# instance fields
.field final synthetic a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V
    .locals 0

    .prologue
    .line 338
    iput-object p1, p0, Lcom/facebook/contacts/database/c;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 341
    invoke-static {}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->g()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "startFavoritesSync onSuccess"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 342
    iget-object v0, p0, Lcom/facebook/contacts/database/c;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-static {v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V

    .line 343
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 3

    .prologue
    .line 347
    invoke-static {}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->g()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startFavoritesSync onServiceException: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 348
    iget-object v0, p0, Lcom/facebook/contacts/database/c;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-static {v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->b(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V

    .line 349
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 338
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/database/c;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
