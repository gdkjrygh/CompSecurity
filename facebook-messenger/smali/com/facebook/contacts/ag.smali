.class Lcom/facebook/contacts/ag;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/g/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 400
    iput-object p1, p0, Lcom/facebook/contacts/ag;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 400
    invoke-direct {p0, p1}, Lcom/facebook/contacts/ag;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/g/g;
    .locals 3

    .prologue
    .line 404
    new-instance v2, Lcom/facebook/contacts/g/g;

    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    const-class v1, Lcom/facebook/contacts/server/w;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/server/w;

    invoke-direct {v2, v0, v1}, Lcom/facebook/contacts/g/g;-><init>(Lcom/facebook/common/time/a;Lcom/facebook/contacts/server/w;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 400
    invoke-virtual {p0}, Lcom/facebook/contacts/ag;->a()Lcom/facebook/contacts/g/g;

    move-result-object v0

    return-object v0
.end method
