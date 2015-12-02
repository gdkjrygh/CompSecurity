.class Lcom/facebook/messages/b/c;
.super Lcom/facebook/inject/d;
.source "ContactPickerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/messages/a/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/messages/b/a;


# direct methods
.method private constructor <init>(Lcom/facebook/messages/b/a;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/facebook/messages/b/c;->a:Lcom/facebook/messages/b/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/messages/b/a;Lcom/facebook/messages/b/b;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/messages/b/c;-><init>(Lcom/facebook/messages/b/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/a/a/a;
    .locals 3

    .prologue
    .line 37
    new-instance v2, Lcom/facebook/messages/a/a/a;

    const-class v0, Lcom/facebook/abtest/qe/c;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/b/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/c;

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v1}, Lcom/facebook/messages/b/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/e/h;

    invoke-direct {v2, v0, v1}, Lcom/facebook/messages/a/a/a;-><init>(Lcom/facebook/abtest/qe/c;Lcom/facebook/common/e/h;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    invoke-virtual {p0}, Lcom/facebook/messages/b/c;->a()Lcom/facebook/messages/a/a/a;

    move-result-object v0

    return-object v0
.end method
