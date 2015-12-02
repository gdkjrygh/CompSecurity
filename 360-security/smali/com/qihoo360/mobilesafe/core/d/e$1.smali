.class Lcom/qihoo360/mobilesafe/core/d/e$1;
.super Ljava/util/LinkedHashMap;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/d/e;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/LinkedHashMap",
        "<",
        "Ljava/lang/String;",
        "Lcom/qihoo360/mobilesafe/core/d/e$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/d/e;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/d/e;IFZ)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/d/e$1;->a:Lcom/qihoo360/mobilesafe/core/d/e;

    .line 31
    invoke-direct {p0, p2, p3, p4}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    return-void
.end method


# virtual methods
.method protected removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo360/mobilesafe/core/d/e$a;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/core/d/e$1;->size()I

    move-result v0

    const/16 v1, 0xc8

    if-le v0, v1, :cond_0

    .line 42
    const/4 v0, 0x1

    .line 44
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
