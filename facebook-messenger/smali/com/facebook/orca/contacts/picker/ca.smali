.class Lcom/facebook/orca/contacts/picker/ca;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/favorites/ai;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 488
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ca;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 488
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/ca;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/favorites/ai;
    .locals 2

    .prologue
    .line 493
    new-instance v0, Lcom/facebook/orca/contacts/favorites/ai;

    const-class v1, Lcom/facebook/orca/contacts/favorites/ag;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/ca;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/contacts/favorites/ai;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 488
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ca;->a()Lcom/facebook/orca/contacts/favorites/ai;

    move-result-object v0

    return-object v0
.end method
