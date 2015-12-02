.class Lcom/facebook/orca/contacts/picker/bz;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 333
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bz;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 333
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/bz;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/i;
    .locals 3

    .prologue
    .line 337
    new-instance v2, Lcom/facebook/orca/protocol/methods/i;

    const-class v0, Lcom/facebook/orca/protocol/methods/p;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bz;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/protocol/methods/p;

    const-class v1, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/bz;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/time/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/protocol/methods/i;-><init>(Lcom/facebook/orca/protocol/methods/p;Lcom/facebook/common/time/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 333
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bz;->a()Lcom/facebook/orca/protocol/methods/i;

    move-result-object v0

    return-object v0
.end method
