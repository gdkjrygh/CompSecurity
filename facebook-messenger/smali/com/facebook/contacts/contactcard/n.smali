.class Lcom/facebook/contacts/contactcard/n;
.super Lcom/facebook/fbservice/ops/ac;
.source "ContactCardFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/ContactCardFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 1144
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/n;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 1148
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/n;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 1149
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 1153
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/n;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 1154
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1144
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/contactcard/n;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
