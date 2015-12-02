.class Lcom/facebook/contacts/data/g;
.super Lcom/facebook/inject/d;
.source "ContactsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/contactslist/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/data/d;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/data/d;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/facebook/contacts/data/g;->a:Lcom/facebook/contacts/data/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/data/d;Lcom/facebook/contacts/data/e;)V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0, p1}, Lcom/facebook/contacts/data/g;-><init>(Lcom/facebook/contacts/data/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/contactslist/f;
    .locals 3

    .prologue
    .line 80
    new-instance v2, Lcom/facebook/contacts/contactslist/f;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/data/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/contacts/e/c;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/data/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/e/c;

    invoke-direct {v2, v0, v1}, Lcom/facebook/contacts/contactslist/f;-><init>(Landroid/content/Context;Lcom/facebook/contacts/e/c;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/facebook/contacts/data/g;->a()Lcom/facebook/contacts/contactslist/f;

    move-result-object v0

    return-object v0
.end method
