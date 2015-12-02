.class Lcom/facebook/orca/background/i;
.super Lcom/facebook/inject/d;
.source "MessagesBackgroundModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/background/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/background/f;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/background/f;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/orca/background/i;->a:Lcom/facebook/orca/background/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/background/f;Lcom/facebook/orca/background/g;)V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0, p1}, Lcom/facebook/orca/background/i;-><init>(Lcom/facebook/orca/background/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/background/c;
    .locals 8

    .prologue
    .line 83
    new-instance v0, Lcom/facebook/orca/background/c;

    const-class v1, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/background/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/b;

    const-class v2, Lcom/facebook/orca/threads/FolderType;

    const-class v3, Lcom/facebook/orca/annotations/CurrentFolder;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/background/i;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Lcom/facebook/orca/g/b;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/background/i;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/background/i;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    invoke-virtual {p0}, Lcom/facebook/orca/background/i;->e()Lcom/facebook/inject/ab;

    move-result-object v5

    const-class v6, Lcom/facebook/fbservice/ops/k;

    invoke-interface {v5, v6}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/fbservice/ops/k;

    const-class v6, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/background/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/v/a;

    const-class v7, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/background/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/background/c;-><init>(Lcom/facebook/auth/b/b;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/fbservice/ops/k;Lcom/facebook/common/v/a;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p0}, Lcom/facebook/orca/background/i;->a()Lcom/facebook/orca/background/c;

    move-result-object v0

    return-object v0
.end method
