.class Lcom/facebook/orca/protocol/s;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/g/a/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 293
    iput-object p1, p0, Lcom/facebook/orca/protocol/s;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 293
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/s;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/g/a/g;
    .locals 1

    .prologue
    .line 297
    new-instance v0, Lcom/facebook/contacts/g/a/g;

    invoke-direct {v0}, Lcom/facebook/contacts/g/a/g;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 293
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/s;->a()Lcom/facebook/contacts/g/a/g;

    move-result-object v0

    return-object v0
.end method
