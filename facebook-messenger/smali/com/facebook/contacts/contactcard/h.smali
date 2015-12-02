.class Lcom/facebook/contacts/contactcard/h;
.super Ljava/lang/Object;
.source "ContactCardFragment.java"

# interfaces
.implements Lcom/facebook/contacts/contactcard/af;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/ContactCardFragment;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 411
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/h;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 426
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/h;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->c()V

    .line 427
    return-void
.end method

.method public a(Lcom/facebook/contacts/models/entry/Entry;)V
    .locals 1

    .prologue
    .line 415
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/h;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-static {v0, p1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/facebook/contacts/models/entry/Entry;)V

    .line 416
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 431
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/h;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->k(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    .line 432
    return-void
.end method

.method public b(Lcom/facebook/contacts/models/entry/Entry;)V
    .locals 1

    .prologue
    .line 420
    check-cast p1, Lcom/facebook/contacts/models/entry/PhoneEntry;

    .line 421
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/h;->a:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-static {v0, p1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/facebook/contacts/models/entry/PhoneEntry;)V

    .line 422
    return-void
.end method
