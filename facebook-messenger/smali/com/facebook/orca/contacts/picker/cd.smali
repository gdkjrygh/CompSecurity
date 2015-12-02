.class Lcom/facebook/orca/contacts/picker/cd;
.super Lcom/facebook/inject/d;
.source "MessagesContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/a/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/bi;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/picker/bi;)V
    .locals 0

    .prologue
    .line 238
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/cd;->a:Lcom/facebook/orca/contacts/picker/bi;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/contacts/picker/bi;Lcom/facebook/orca/contacts/picker/bj;)V
    .locals 0

    .prologue
    .line 238
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/cd;-><init>(Lcom/facebook/orca/contacts/picker/bi;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/a/e;
    .locals 1

    .prologue
    .line 242
    new-instance v0, Lcom/facebook/contacts/a/e;

    invoke-direct {v0}, Lcom/facebook/contacts/a/e;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 238
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/cd;->a()Lcom/facebook/contacts/a/e;

    move-result-object v0

    return-object v0
.end method
