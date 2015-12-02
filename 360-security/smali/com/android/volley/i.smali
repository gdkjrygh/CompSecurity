.class public Lcom/android/volley/i;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field public final a:I

.field public final b:[B

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Z


# direct methods
.method public constructor <init>(I[BLjava/util/Map;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput p1, p0, Lcom/android/volley/i;->a:I

    .line 42
    iput-object p2, p0, Lcom/android/volley/i;->b:[B

    .line 43
    iput-object p3, p0, Lcom/android/volley/i;->c:Ljava/util/Map;

    .line 44
    iput-boolean p4, p0, Lcom/android/volley/i;->d:Z

    .line 45
    return-void
.end method

.method public constructor <init>([B)V
    .locals 3

    .prologue
    .line 48
    const/16 v0, 0xc8

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/android/volley/i;-><init>(I[BLjava/util/Map;Z)V

    .line 49
    return-void
.end method

.method public constructor <init>([BLjava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 52
    const/16 v0, 0xc8

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lcom/android/volley/i;-><init>(I[BLjava/util/Map;Z)V

    .line 53
    return-void
.end method
