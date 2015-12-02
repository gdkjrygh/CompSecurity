.class Lcom/facebook/contacts/database/d;
.super Lcom/facebook/fbservice/ops/ac;
.source "AddressBookPeriodicRunner.java"


# instance fields
.field final synthetic a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V
    .locals 0

    .prologue
    .line 363
    iput-object p1, p0, Lcom/facebook/contacts/database/d;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 366
    iget-object v0, p0, Lcom/facebook/contacts/database/d;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-static {v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->c(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V

    .line 367
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 371
    iget-object v0, p0, Lcom/facebook/contacts/database/d;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-static {v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->b(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V

    .line 372
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 363
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/database/d;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
