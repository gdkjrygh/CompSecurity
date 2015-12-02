.class Lcom/facebook/orca/contacts/picker/cb;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/favorites/ag;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 475
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/cb;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 475
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/cb;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/favorites/ag;
    .locals 5

    .prologue
    .line 479
    new-instance v4, Lcom/facebook/orca/contacts/favorites/ag;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/cb;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/user/e;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/cb;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/e;

    const-class v2, Lcom/facebook/contacts/data/l;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/contacts/picker/cb;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/contacts/data/l;

    const-class v3, Lcom/facebook/contacts/a/e;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/contacts/picker/cb;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/contacts/a/e;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/contacts/favorites/ag;-><init>(Landroid/content/Context;Lcom/facebook/user/e;Lcom/facebook/contacts/data/l;Lcom/facebook/contacts/a/e;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 475
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/cb;->a()Lcom/facebook/orca/contacts/favorites/ag;

    move-result-object v0

    return-object v0
.end method
