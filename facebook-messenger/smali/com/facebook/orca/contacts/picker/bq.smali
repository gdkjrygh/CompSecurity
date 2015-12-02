.class Lcom/facebook/orca/contacts/picker/bq;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/divebar/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bq;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 226
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/bq;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/e;
    .locals 4

    .prologue
    .line 230
    new-instance v2, Lcom/facebook/orca/contacts/divebar/e;

    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    const-class v1, Lcom/facebook/l/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/bq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/l/k;

    const-class v3, Lcom/facebook/l/j;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/contacts/picker/bq;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lcom/facebook/orca/contacts/divebar/e;-><init>(Lcom/facebook/common/time/a;Lcom/facebook/l/k;Ljavax/inject/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 226
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bq;->a()Lcom/facebook/orca/contacts/divebar/e;

    move-result-object v0

    return-object v0
.end method
