.class Lcom/facebook/orca/contacts/picker/bx;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/divebar/bk;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 449
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bx;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 449
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/bx;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/bk;
    .locals 5

    .prologue
    .line 454
    new-instance v4, Lcom/facebook/orca/contacts/divebar/bk;

    const-class v0, Lcom/facebook/orca/contacts/divebar/ao;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/ao;

    const-class v1, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/bx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/v/a;

    const-class v2, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/contacts/picker/bx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/auth/b/b;

    const-class v3, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/contacts/picker/bx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/time/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/contacts/divebar/bk;-><init>(Lcom/facebook/orca/contacts/divebar/ao;Lcom/facebook/common/v/a;Lcom/facebook/auth/b/b;Lcom/facebook/common/time/a;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 449
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bx;->a()Lcom/facebook/orca/contacts/divebar/bk;

    move-result-object v0

    return-object v0
.end method
