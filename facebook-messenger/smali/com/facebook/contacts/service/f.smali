.class Lcom/facebook/contacts/service/f;
.super Lcom/facebook/inject/d;
.source "ContactsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/database/f;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 122
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/service/e;)V
    .locals 0

    .prologue
    .line 122
    invoke-direct {p0}, Lcom/facebook/contacts/service/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/database/f;
    .locals 2

    .prologue
    .line 127
    new-instance v1, Lcom/facebook/contacts/database/f;

    const-class v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/service/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-direct {v1, v0}, Lcom/facebook/contacts/database/f;-><init>(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 122
    invoke-virtual {p0}, Lcom/facebook/contacts/service/f;->a()Lcom/facebook/contacts/database/f;

    move-result-object v0

    return-object v0
.end method
