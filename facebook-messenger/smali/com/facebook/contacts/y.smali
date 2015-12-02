.class Lcom/facebook/contacts/y;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/data/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lcom/facebook/contacts/y;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 292
    invoke-direct {p0, p1}, Lcom/facebook/contacts/y;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/data/l;
    .locals 5

    .prologue
    .line 296
    new-instance v4, Lcom/facebook/contacts/data/l;

    const-class v0, Lcom/facebook/contacts/data/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/data/b;

    const-class v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v2, Lcom/facebook/user/ac;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/user/ac;

    const-class v3, Lcom/facebook/contacts/a/c;

    invoke-virtual {p0, v3}, Lcom/facebook/contacts/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/contacts/a/c;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/contacts/data/l;-><init>(Lcom/facebook/contacts/data/b;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/user/ac;Lcom/facebook/contacts/a/c;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 292
    invoke-virtual {p0}, Lcom/facebook/contacts/y;->a()Lcom/facebook/contacts/data/l;

    move-result-object v0

    return-object v0
.end method
