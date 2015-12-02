.class Lcom/facebook/orca/app/ah;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/contacts/divebar/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 1850
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1850
    invoke-direct {p0}, Lcom/facebook/orca/app/ah;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/divebar/a;
    .locals 2

    .prologue
    .line 1855
    new-instance v1, Lcom/facebook/orca/contacts/divebar/a;

    const-class v0, Lcom/facebook/abtest/qe/d/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/ah;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/d/e;

    invoke-direct {v1, v0}, Lcom/facebook/orca/contacts/divebar/a;-><init>(Lcom/facebook/abtest/qe/d/e;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1850
    invoke-virtual {p0}, Lcom/facebook/orca/app/ah;->a()Lcom/facebook/orca/contacts/divebar/a;

    move-result-object v0

    return-object v0
.end method
