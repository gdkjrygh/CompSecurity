.class Lcom/facebook/contacts/h;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/data/a/b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 304
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 304
    invoke-direct {p0}, Lcom/facebook/contacts/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/data/a/b;
    .locals 1

    .prologue
    .line 309
    new-instance v0, Lcom/facebook/contacts/data/a/a;

    invoke-direct {v0}, Lcom/facebook/contacts/data/a/a;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 304
    invoke-virtual {p0}, Lcom/facebook/contacts/h;->a()Lcom/facebook/contacts/data/a/b;

    move-result-object v0

    return-object v0
.end method
