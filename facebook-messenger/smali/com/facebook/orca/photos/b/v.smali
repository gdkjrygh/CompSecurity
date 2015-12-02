.class Lcom/facebook/orca/photos/b/v;
.super Lcom/facebook/inject/d;
.source "PhotoUploadModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/photos/b/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/b/o;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/photos/b/o;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/facebook/orca/photos/b/v;->a:Lcom/facebook/orca/photos/b/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0, p1}, Lcom/facebook/orca/photos/b/v;-><init>(Lcom/facebook/orca/photos/b/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/photos/b/k;
    .locals 5

    .prologue
    .line 70
    new-instance v4, Lcom/facebook/orca/photos/b/k;

    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    const-class v1, Lcom/facebook/orca/j/c;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/photos/b/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/j/c;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/photos/b/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    const-class v3, Lcom/facebook/orca/f/r;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/photos/b/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/f/r;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/orca/photos/b/k;-><init>(Lcom/facebook/fbservice/ops/k;Lcom/facebook/orca/j/c;Lcom/facebook/common/time/a;Lcom/facebook/orca/f/r;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/facebook/orca/photos/b/v;->a()Lcom/facebook/orca/photos/b/k;

    move-result-object v0

    return-object v0
.end method
