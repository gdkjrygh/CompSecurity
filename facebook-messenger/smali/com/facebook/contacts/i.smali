.class Lcom/facebook/contacts/i;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/g/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 272
    iput-object p1, p0, Lcom/facebook/contacts/i;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 272
    invoke-direct {p0, p1}, Lcom/facebook/contacts/i;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/g/c;
    .locals 2

    .prologue
    .line 277
    new-instance v1, Lcom/facebook/contacts/g/c;

    const-class v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v1, v0}, Lcom/facebook/contacts/g/c;-><init>(Lcom/fasterxml/jackson/core/JsonFactory;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 272
    invoke-virtual {p0}, Lcom/facebook/contacts/i;->a()Lcom/facebook/contacts/g/c;

    move-result-object v0

    return-object v0
.end method
