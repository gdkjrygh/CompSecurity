.class public final Lcom/android/volley/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[B

.field public final c:Ljava/util/Map;

.field public final d:Z


# direct methods
.method public constructor <init>(I[BLjava/util/Map;Z)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p1, p0, Lcom/android/volley/k;->a:I

    .line 40
    iput-object p2, p0, Lcom/android/volley/k;->b:[B

    .line 41
    iput-object p3, p0, Lcom/android/volley/k;->c:Ljava/util/Map;

    .line 42
    iput-boolean p4, p0, Lcom/android/volley/k;->d:Z

    .line 43
    return-void
.end method

.method public constructor <init>([BLjava/util/Map;)V
    .locals 2

    .prologue
    .line 52
    const/16 v0, 0xc8

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lcom/android/volley/k;-><init>(I[BLjava/util/Map;Z)V

    .line 53
    return-void
.end method
