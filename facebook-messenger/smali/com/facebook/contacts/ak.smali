.class Lcom/facebook/contacts/ak;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/c/c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 419
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 419
    invoke-direct {p0}, Lcom/facebook/contacts/ak;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/c/c;
    .locals 2

    .prologue
    .line 424
    new-instance v1, Lcom/facebook/contacts/c/c;

    const-class v0, Lcom/facebook/contacts/f/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/f/a;

    invoke-direct {v1, v0}, Lcom/facebook/contacts/c/c;-><init>(Lcom/facebook/contacts/f/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 419
    invoke-virtual {p0}, Lcom/facebook/contacts/ak;->a()Lcom/facebook/contacts/c/c;

    move-result-object v0

    return-object v0
.end method
