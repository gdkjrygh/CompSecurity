.class Lcom/facebook/contacts/database/a;
.super Ljava/lang/Object;
.source "AddressBookPeriodicRunner.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;Z)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/facebook/contacts/database/a;->b:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    iput-boolean p2, p0, Lcom/facebook/contacts/database/a;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/contacts/database/a;->b:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    iget-boolean v1, p0, Lcom/facebook/contacts/database/a;->a:Z

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a(Z)V

    .line 134
    return-void
.end method
