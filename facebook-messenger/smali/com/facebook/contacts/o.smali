.class Lcom/facebook/contacts/o;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/database/g;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 550
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 550
    invoke-direct {p0}, Lcom/facebook/contacts/o;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/database/g;
    .locals 3

    .prologue
    .line 555
    new-instance v2, Lcom/facebook/contacts/database/g;

    const-class v0, Lcom/facebook/contacts/data/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/data/a;

    const-class v1, Lcom/facebook/contacts/models/e;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/models/e;

    invoke-direct {v2, v0, v1}, Lcom/facebook/contacts/database/g;-><init>(Lcom/facebook/contacts/data/a;Lcom/facebook/contacts/models/e;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 550
    invoke-virtual {p0}, Lcom/facebook/contacts/o;->a()Lcom/facebook/contacts/database/g;

    move-result-object v0

    return-object v0
.end method
