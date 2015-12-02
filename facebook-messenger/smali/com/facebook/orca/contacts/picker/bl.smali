.class Lcom/facebook/orca/contacts/picker/bl;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/picker/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 246
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bl;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 246
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/bl;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/picker/n;
    .locals 2

    .prologue
    .line 251
    new-instance v0, Lcom/facebook/contacts/picker/n;

    const-class v1, Lcom/facebook/user/e;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/bl;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/contacts/picker/n;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 246
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bl;->a()Lcom/facebook/contacts/picker/n;

    move-result-object v0

    return-object v0
.end method
