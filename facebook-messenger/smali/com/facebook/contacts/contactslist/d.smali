.class Lcom/facebook/contacts/contactslist/d;
.super Ljava/lang/Object;
.source "ContactsListActivity.java"

# interfaces
.implements Landroid/support/v4/app/ah;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/support/v4/app/ah",
        "<",
        "Lcom/facebook/contacts/contactslist/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactslist/ContactsListActivity;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactslist/ContactsListActivity;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/facebook/contacts/contactslist/d;->a:Lcom/facebook/contacts/contactslist/ContactsListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;)Landroid/support/v4/a/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            ")",
            "Landroid/support/v4/a/c",
            "<",
            "Lcom/facebook/contacts/contactslist/g;",
            ">;"
        }
    .end annotation

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/d;->a:Lcom/facebook/contacts/contactslist/ContactsListActivity;

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/contacts/contactslist/f;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    return-object v0
.end method

.method public a(Landroid/support/v4/a/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/a/c",
            "<",
            "Lcom/facebook/contacts/contactslist/g;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 73
    return-void
.end method

.method public a(Landroid/support/v4/a/c;Lcom/facebook/contacts/contactslist/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/a/c",
            "<",
            "Lcom/facebook/contacts/contactslist/g;",
            ">;",
            "Lcom/facebook/contacts/contactslist/g;",
            ")V"
        }
    .end annotation

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/d;->a:Lcom/facebook/contacts/contactslist/ContactsListActivity;

    invoke-static {v0, p2}, Lcom/facebook/contacts/contactslist/ContactsListActivity;->a(Lcom/facebook/contacts/contactslist/ContactsListActivity;Lcom/facebook/contacts/contactslist/g;)V

    .line 69
    return-void
.end method

.method public bridge synthetic a(Landroid/support/v4/a/c;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 57
    check-cast p2, Lcom/facebook/contacts/contactslist/g;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/contactslist/d;->a(Landroid/support/v4/a/c;Lcom/facebook/contacts/contactslist/g;)V

    return-void
.end method
