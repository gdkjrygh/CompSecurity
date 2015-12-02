.class Lcom/facebook/orca/contacts/picker/bk;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/picker/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bk;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 292
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/bk;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/picker/m;
    .locals 4

    .prologue
    .line 297
    new-instance v0, Lcom/facebook/orca/contacts/picker/m;

    const-class v1, Lcom/facebook/contacts/e/e;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/bk;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsInviteByPhonePermitted;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/contacts/picker/bk;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/contacts/picker/m;-><init>(Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 292
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bk;->a()Lcom/facebook/orca/contacts/picker/m;

    move-result-object v0

    return-object v0
.end method
