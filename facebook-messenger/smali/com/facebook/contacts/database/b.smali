.class Lcom/facebook/contacts/database/b;
.super Ljava/lang/Object;
.source "AddressBookPeriodicRunner.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V
    .locals 0

    .prologue
    .line 289
    iput-object p1, p0, Lcom/facebook/contacts/database/b;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lcom/facebook/contacts/database/b;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->e()V

    .line 293
    iget-object v0, p0, Lcom/facebook/contacts/database/b;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->f()V

    .line 294
    return-void
.end method
