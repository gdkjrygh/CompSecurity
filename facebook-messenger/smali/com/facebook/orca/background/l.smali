.class Lcom/facebook/orca/background/l;
.super Lcom/facebook/inject/d;
.source "MessagesBackgroundModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/background/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/background/f;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/background/f;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/facebook/orca/background/l;->a:Lcom/facebook/orca/background/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/background/f;Lcom/facebook/orca/background/g;)V
    .locals 0

    .prologue
    .line 123
    invoke-direct {p0, p1}, Lcom/facebook/orca/background/l;-><init>(Lcom/facebook/orca/background/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/background/p;
    .locals 6

    .prologue
    .line 128
    new-instance v3, Lcom/facebook/orca/background/p;

    const-class v0, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/background/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/b;

    const-class v1, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/contacts/annotations/IsMobileAppDataEnabled;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/background/l;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v1, Lcom/facebook/contacts/data/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/background/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/data/k;

    invoke-virtual {p0}, Lcom/facebook/orca/background/l;->e()Lcom/facebook/inject/ab;

    move-result-object v2

    const-class v5, Lcom/facebook/fbservice/ops/k;

    invoke-interface {v2, v5}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/ops/k;

    invoke-direct {v3, v0, v4, v1, v2}, Lcom/facebook/orca/background/p;-><init>(Lcom/facebook/auth/b/b;Ljavax/inject/a;Lcom/facebook/contacts/data/k;Lcom/facebook/fbservice/ops/k;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 123
    invoke-virtual {p0}, Lcom/facebook/orca/background/l;->a()Lcom/facebook/orca/background/p;

    move-result-object v0

    return-object v0
.end method
