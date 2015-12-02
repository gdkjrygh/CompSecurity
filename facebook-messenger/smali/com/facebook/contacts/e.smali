.class Lcom/facebook/contacts/e;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/service/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 623
    iput-object p1, p0, Lcom/facebook/contacts/e;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 623
    invoke-direct {p0, p1}, Lcom/facebook/contacts/e;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/service/b;
    .locals 15

    .prologue
    .line 628
    new-instance v0, Lcom/facebook/contacts/service/b;

    const-class v1, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/e;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/contacts/g/a/j;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/contacts/g/a/j;

    const-class v3, Lcom/facebook/contacts/g/a/e;

    invoke-virtual {p0, v3}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/contacts/g/a/e;

    const-class v4, Lcom/facebook/contacts/g/a/f;

    invoke-virtual {p0, v4}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/contacts/g/a/f;

    const-class v5, Lcom/facebook/contacts/g/a/g;

    invoke-virtual {p0, v5}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/contacts/g/a/g;

    const-class v6, Lcom/facebook/contacts/g/a/h;

    invoke-virtual {p0, v6}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/contacts/g/a/h;

    const-class v7, Lcom/facebook/contacts/g/a/a;

    invoke-virtual {p0, v7}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/contacts/g/a/a;

    const-class v8, Lcom/facebook/contacts/data/m;

    invoke-virtual {p0, v8}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/contacts/data/m;

    const-class v9, Lcom/facebook/contacts/a/d;

    invoke-virtual {p0, v9}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/contacts/a/d;

    const-class v10, Lcom/facebook/contacts/a/e;

    invoke-virtual {p0, v10}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/contacts/a/e;

    const-class v11, Lcom/facebook/contacts/data/k;

    invoke-virtual {p0, v11}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/contacts/data/k;

    const-class v12, Lcom/facebook/base/broadcast/a;

    invoke-virtual {p0, v12}, Lcom/facebook/contacts/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/base/broadcast/a;

    const-class v13, Ljava/lang/Boolean;

    const-class v14, Lcom/facebook/contacts/annotations/IsMobileAppDataEnabled;

    invoke-virtual {p0, v13, v14}, Lcom/facebook/contacts/e;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v13

    invoke-direct/range {v0 .. v13}, Lcom/facebook/contacts/service/b;-><init>(Ljavax/inject/a;Lcom/facebook/contacts/g/a/j;Lcom/facebook/contacts/g/a/e;Lcom/facebook/contacts/g/a/f;Lcom/facebook/contacts/g/a/g;Lcom/facebook/contacts/g/a/h;Lcom/facebook/contacts/g/a/a;Lcom/facebook/contacts/data/m;Lcom/facebook/contacts/a/d;Lcom/facebook/contacts/a/e;Lcom/facebook/contacts/data/k;Lcom/facebook/base/broadcast/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 623
    invoke-virtual {p0}, Lcom/facebook/contacts/e;->a()Lcom/facebook/contacts/service/b;

    move-result-object v0

    return-object v0
.end method
