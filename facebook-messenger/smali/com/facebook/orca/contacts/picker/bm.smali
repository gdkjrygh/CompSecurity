.class Lcom/facebook/orca/contacts/picker/bm;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/picker/ac;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 257
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bm;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 257
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/bm;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/picker/ac;
    .locals 3

    .prologue
    .line 262
    new-instance v2, Lcom/facebook/orca/contacts/picker/ac;

    const-class v0, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    const-class v1, Lcom/facebook/orca/protocol/methods/ah;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/protocol/methods/ah;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/contacts/picker/ac;-><init>(Lcom/facebook/http/protocol/aq;Lcom/facebook/orca/protocol/methods/ah;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 257
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bm;->a()Lcom/facebook/orca/contacts/picker/ac;

    move-result-object v0

    return-object v0
.end method
