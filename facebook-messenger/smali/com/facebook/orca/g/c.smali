.class Lcom/facebook/orca/g/c;
.super Ljava/lang/Object;
.source "DbCache.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Lcom/facebook/orca/g/d;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/g/b;


# direct methods
.method constructor <init>(Lcom/facebook/orca/g/b;)V
    .locals 0

    .prologue
    .line 151
    iput-object p1, p0, Lcom/facebook/orca/g/c;->a:Lcom/facebook/orca/g/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/g/d;)Ljava/lang/Long;
    .locals 2
    .param p1    # Lcom/facebook/orca/g/d;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 154
    invoke-static {p1}, Lcom/facebook/orca/g/d;->a(Lcom/facebook/orca/g/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 151
    check-cast p1, Lcom/facebook/orca/g/d;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/g/c;->a(Lcom/facebook/orca/g/d;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
