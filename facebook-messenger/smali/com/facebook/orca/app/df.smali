.class Lcom/facebook/orca/app/df;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/threadview/ci;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1993
    iput-object p1, p0, Lcom/facebook/orca/app/df;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1993
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/df;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threadview/ci;
    .locals 8

    .prologue
    .line 1997
    new-instance v0, Lcom/facebook/orca/threadview/ci;

    const-class v1, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/df;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/f/k;

    const-class v2, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/df;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/ops/k;

    const-class v3, Lcom/facebook/orca/threads/l;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/df;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/threads/l;

    const-class v4, Lcom/facebook/orca/f/r;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/df;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/f/r;

    const-class v5, Lcom/facebook/orca/threadview/z;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/df;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/threadview/z;

    const-class v6, Lcom/facebook/orca/threads/i;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/df;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/threads/i;

    const-class v7, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/app/df;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/e/h;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/threadview/ci;-><init>(Lcom/facebook/orca/f/k;Lcom/facebook/fbservice/ops/k;Lcom/facebook/orca/threads/l;Lcom/facebook/orca/f/r;Lcom/facebook/orca/threadview/z;Lcom/facebook/orca/threads/i;Lcom/facebook/common/e/h;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1993
    invoke-virtual {p0}, Lcom/facebook/orca/app/df;->a()Lcom/facebook/orca/threadview/ci;

    move-result-object v0

    return-object v0
.end method
