.class Lcom/facebook/contacts/ac;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/service/m;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 738
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 738
    invoke-direct {p0}, Lcom/facebook/contacts/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/service/m;
    .locals 10

    .prologue
    .line 743
    new-instance v0, Lcom/facebook/contacts/service/m;

    const-class v1, Lcom/facebook/contacts/data/m;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/data/m;

    const-class v2, Lcom/facebook/contacts/data/l;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/contacts/data/l;

    const-class v3, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v3}, Lcom/facebook/contacts/ac;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/contacts/g/g;

    invoke-virtual {p0, v4}, Lcom/facebook/contacts/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/contacts/g/g;

    const-class v5, Lcom/facebook/contacts/g/a/d;

    invoke-virtual {p0, v5}, Lcom/facebook/contacts/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/contacts/g/a/d;

    const-class v6, Lcom/facebook/contacts/a/c;

    invoke-virtual {p0, v6}, Lcom/facebook/contacts/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/contacts/a/c;

    const-class v7, Lcom/facebook/contacts/a/a;

    invoke-virtual {p0, v7}, Lcom/facebook/contacts/ac;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v7

    const-class v8, Ljava/lang/Boolean;

    const-class v9, Lcom/facebook/contacts/annotations/IsMoreLastActiveEnabled;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/contacts/ac;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    const-class v9, Lcom/facebook/contacts/data/k;

    invoke-virtual {p0, v9}, Lcom/facebook/contacts/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/contacts/data/k;

    invoke-direct/range {v0 .. v9}, Lcom/facebook/contacts/service/m;-><init>(Lcom/facebook/contacts/data/m;Lcom/facebook/contacts/data/l;Ljavax/inject/a;Lcom/facebook/contacts/g/g;Lcom/facebook/contacts/g/a/d;Lcom/facebook/contacts/a/c;Ljava/util/Set;Ljavax/inject/a;Lcom/facebook/contacts/data/k;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 738
    invoke-virtual {p0}, Lcom/facebook/contacts/ac;->a()Lcom/facebook/contacts/service/m;

    move-result-object v0

    return-object v0
.end method
