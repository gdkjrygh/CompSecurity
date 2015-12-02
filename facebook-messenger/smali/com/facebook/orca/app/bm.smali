.class Lcom/facebook/orca/app/bm;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/photos/a/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1312
    iput-object p1, p0, Lcom/facebook/orca/app/bm;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1312
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bm;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/photos/a/e;
    .locals 8

    .prologue
    .line 1317
    new-instance v0, Lcom/facebook/orca/photos/a/e;

    const-class v1, Lcom/facebook/orca/attachments/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/attachments/a;

    const-class v2, Lcom/facebook/orca/f/z;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/f/z;

    const-class v3, Lcom/facebook/user/tiles/c;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/user/tiles/c;

    const-class v4, Lcom/facebook/orca/photos/a/b;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/photos/a/b;

    const-class v5, Lcom/facebook/user/tiles/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/user/tiles/a;

    const-class v6, Lcom/facebook/orca/threads/q;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/threads/q;

    const-class v7, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/app/bm;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/f/k;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/photos/a/e;-><init>(Lcom/facebook/orca/attachments/a;Lcom/facebook/orca/f/z;Lcom/facebook/user/tiles/c;Lcom/facebook/orca/photos/a/b;Lcom/facebook/user/tiles/a;Lcom/facebook/orca/threads/q;Lcom/facebook/orca/f/k;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1312
    invoke-virtual {p0}, Lcom/facebook/orca/app/bm;->a()Lcom/facebook/orca/photos/a/e;

    move-result-object v0

    return-object v0
.end method
