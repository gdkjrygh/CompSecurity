.class public Lcom/facebook/contacts/database/e;
.super Ljava/lang/Object;
.source "AddressBookPeriodicRunner.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field private a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 275
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 281
    invoke-static {p1}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 282
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 283
    const-class v1, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    iput-object v0, p0, Lcom/facebook/contacts/database/e;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    .line 284
    iget-object v0, p0, Lcom/facebook/contacts/database/e;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->c()V

    .line 285
    return-void
.end method
