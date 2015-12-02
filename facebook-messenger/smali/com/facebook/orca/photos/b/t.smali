.class Lcom/facebook/orca/photos/b/t;
.super Lcom/facebook/inject/d;
.source "PhotoUploadModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/photos/b/x;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/b/o;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/photos/b/o;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/facebook/orca/photos/b/t;->a:Lcom/facebook/orca/photos/b/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V
    .locals 0

    .prologue
    .line 109
    invoke-direct {p0, p1}, Lcom/facebook/orca/photos/b/t;-><init>(Lcom/facebook/orca/photos/b/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/photos/b/x;
    .locals 11

    .prologue
    .line 114
    new-instance v0, Lcom/facebook/orca/photos/b/x;

    const-class v1, Lcom/facebook/http/protocol/i;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/photos/b/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/i;

    const-class v2, Lcom/facebook/orca/protocol/methods/ab;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/photos/b/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/protocol/methods/ab;

    const-class v3, Lcom/facebook/orca/j/c;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/photos/b/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/j/c;

    const-class v4, Lcom/facebook/ui/media/b/a;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/photos/b/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/ui/media/b/a;

    const-class v5, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/photos/b/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/time/a;

    const-class v6, Lcom/facebook/orca/photos/b/h;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/photos/b/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/photos/b/h;

    const-class v7, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/photos/b/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/executors/a;

    const-class v8, Lcom/facebook/j/a/a/a;

    const-class v9, Lcom/facebook/orca/annotations/MessengerImageResizer;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/orca/photos/b/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    const-class v9, Lcom/facebook/orca/photos/b/a;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/photos/b/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/orca/photos/b/a;

    const-class v10, Lcom/facebook/orca/photos/b/aa;

    invoke-virtual {p0, v10}, Lcom/facebook/orca/photos/b/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/orca/photos/b/aa;

    invoke-direct/range {v0 .. v10}, Lcom/facebook/orca/photos/b/x;-><init>(Lcom/facebook/http/protocol/i;Lcom/facebook/orca/protocol/methods/ab;Lcom/facebook/orca/j/c;Lcom/facebook/ui/media/b/a;Lcom/facebook/common/time/a;Lcom/facebook/orca/photos/b/h;Lcom/facebook/common/executors/a;Ljavax/inject/a;Lcom/facebook/orca/photos/b/a;Lcom/facebook/orca/photos/b/aa;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 109
    invoke-virtual {p0}, Lcom/facebook/orca/photos/b/t;->a()Lcom/facebook/orca/photos/b/x;

    move-result-object v0

    return-object v0
.end method
