.class Lcom/facebook/contacts/p;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/data/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 477
    iput-object p1, p0, Lcom/facebook/contacts/p;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 477
    invoke-direct {p0, p1}, Lcom/facebook/contacts/p;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/data/b;
    .locals 5

    .prologue
    .line 482
    new-instance v4, Lcom/facebook/contacts/data/b;

    invoke-virtual {p0}, Lcom/facebook/contacts/p;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/executors/a;

    const-class v2, Lcom/facebook/d/b/a;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/d/b/a;

    const-class v3, Lcom/facebook/contacts/data/c;

    invoke-virtual {p0, v3}, Lcom/facebook/contacts/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/contacts/data/c;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/contacts/data/b;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/facebook/contacts/data/c;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 477
    invoke-virtual {p0}, Lcom/facebook/contacts/p;->a()Lcom/facebook/contacts/data/b;

    move-result-object v0

    return-object v0
.end method
