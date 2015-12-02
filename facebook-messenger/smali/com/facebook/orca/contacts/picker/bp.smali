.class Lcom/facebook/orca/contacts/picker/bp;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/picker/bf;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 269
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bp;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 269
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/bp;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/picker/bf;
    .locals 3

    .prologue
    .line 274
    new-instance v2, Lcom/facebook/orca/contacts/picker/bf;

    const-class v0, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bp;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    const-class v1, Lcom/facebook/orca/protocol/methods/i;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/bp;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/protocol/methods/i;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/contacts/picker/bf;-><init>(Lcom/facebook/http/protocol/aq;Lcom/facebook/orca/protocol/methods/i;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 269
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bp;->a()Lcom/facebook/orca/contacts/picker/bf;

    move-result-object v0

    return-object v0
.end method
