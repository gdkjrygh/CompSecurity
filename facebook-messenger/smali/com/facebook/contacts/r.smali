.class Lcom/facebook/contacts/r;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/d/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 722
    iput-object p1, p0, Lcom/facebook/contacts/r;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 722
    invoke-direct {p0, p1}, Lcom/facebook/contacts/r;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/d/a;
    .locals 7

    .prologue
    .line 727
    new-instance v0, Lcom/facebook/contacts/d/a;

    const-class v1, Lcom/facebook/contacts/e/e;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/r;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/r;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Ljava/lang/String;

    const-class v4, Lcom/facebook/common/hardware/PhoneIsoCountryCode;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/contacts/r;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/contacts/data/k;

    invoke-virtual {p0, v4}, Lcom/facebook/contacts/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/contacts/data/k;

    const-class v5, Lcom/facebook/contacts/g/a/k;

    invoke-virtual {p0, v5}, Lcom/facebook/contacts/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/contacts/g/a/k;

    const-class v6, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v6}, Lcom/facebook/contacts/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/contacts/d/a;-><init>(Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/contacts/data/k;Lcom/facebook/contacts/g/a/k;Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 722
    invoke-virtual {p0}, Lcom/facebook/contacts/r;->a()Lcom/facebook/contacts/d/a;

    move-result-object v0

    return-object v0
.end method
