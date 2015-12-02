.class Lcom/facebook/contacts/m;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/models/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 510
    iput-object p1, p0, Lcom/facebook/contacts/m;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 510
    invoke-direct {p0, p1}, Lcom/facebook/contacts/m;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/models/g;
    .locals 2

    .prologue
    .line 514
    new-instance v1, Lcom/facebook/contacts/models/g;

    const-class v0, Lcom/facebook/contacts/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/a/b;

    invoke-direct {v1, v0}, Lcom/facebook/contacts/models/g;-><init>(Lcom/facebook/contacts/a/b;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 510
    invoke-virtual {p0}, Lcom/facebook/contacts/m;->a()Lcom/facebook/contacts/models/g;

    move-result-object v0

    return-object v0
.end method
