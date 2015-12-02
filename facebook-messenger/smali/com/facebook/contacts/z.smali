.class Lcom/facebook/contacts/z;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/data/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 333
    iput-object p1, p0, Lcom/facebook/contacts/z;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 333
    invoke-direct {p0, p1}, Lcom/facebook/contacts/z;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/data/n;
    .locals 4

    .prologue
    .line 338
    new-instance v3, Lcom/facebook/contacts/data/n;

    const-class v0, Lcom/facebook/contacts/data/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/data/b;

    const-class v1, Lcom/facebook/user/a/l;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/a/l;

    const-class v2, Lcom/facebook/user/a/n;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/user/a/n;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/contacts/data/n;-><init>(Lcom/facebook/contacts/data/b;Lcom/facebook/user/a/l;Lcom/facebook/user/a/n;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 333
    invoke-virtual {p0}, Lcom/facebook/contacts/z;->a()Lcom/facebook/contacts/data/n;

    move-result-object v0

    return-object v0
.end method
