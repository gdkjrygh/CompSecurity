.class Lcom/facebook/user/ah;
.super Lcom/fasterxml/jackson/core/type/TypeReference;
.source "UserSerialization.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/core/type/TypeReference",
        "<",
        "Ljava/util/Map",
        "<",
        "Ljava/lang/Long;",
        "Ljava/lang/Long;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/user/ac;


# direct methods
.method constructor <init>(Lcom/facebook/user/ac;)V
    .locals 0

    .prologue
    .line 443
    iput-object p1, p0, Lcom/facebook/user/ah;->a:Lcom/facebook/user/ac;

    invoke-direct {p0}, Lcom/fasterxml/jackson/core/type/TypeReference;-><init>()V

    return-void
.end method
