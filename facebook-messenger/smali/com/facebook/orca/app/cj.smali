.class Lcom/facebook/orca/app/cj;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1010
    iput-object p1, p0, Lcom/facebook/orca/app/cj;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1010
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/cj;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/r;
    .locals 12

    .prologue
    .line 1014
    new-instance v0, Lcom/facebook/orca/f/r;

    const-class v1, Lcom/facebook/orca/app/g;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/cj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/app/g;

    const-class v2, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/cj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/ops/k;

    const-class v3, Lcom/facebook/orca/notify/av;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/cj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/notify/av;

    const-class v4, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/cj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/common/executors/a;

    const-class v5, Lcom/facebook/orca/f/ad;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/cj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/f/ad;

    const-class v6, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/cj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/analytics/av;

    const-class v7, Lcom/facebook/orca/g/e;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/app/cj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/time/a;

    const-class v8, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/app/cj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/common/time/a;

    const-class v9, Lcom/facebook/orca/f/ac;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/app/cj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/orca/f/ac;

    const-class v10, Lcom/facebook/orca/threads/FolderName;

    const-class v11, Lcom/facebook/orca/annotations/CurrentFolder;

    invoke-virtual {p0, v10, v11}, Lcom/facebook/orca/app/cj;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v10

    invoke-direct/range {v0 .. v10}, Lcom/facebook/orca/f/r;-><init>(Lcom/facebook/orca/app/g;Lcom/facebook/fbservice/ops/k;Lcom/facebook/orca/notify/av;Lcom/facebook/common/executors/a;Lcom/facebook/orca/f/ad;Lcom/facebook/analytics/av;Lcom/facebook/common/time/a;Lcom/facebook/common/time/a;Lcom/facebook/orca/f/ac;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1010
    invoke-virtual {p0}, Lcom/facebook/orca/app/cj;->a()Lcom/facebook/orca/f/r;

    move-result-object v0

    return-object v0
.end method
