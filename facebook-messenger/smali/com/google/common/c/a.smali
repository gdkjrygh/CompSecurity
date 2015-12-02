.class public final Lcom/google/common/c/a;
.super Ljava/lang/Object;
.source "Ints.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(J)I
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 80
    long-to-int v3, p0

    .line 81
    int-to-long v4, v3

    cmp-long v0, v4, p0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v4, "Out of range: %s"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v1, v2

    invoke-static {v0, v4, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return v3

    :cond_0
    move v0, v2

    .line 81
    goto :goto_0
.end method

.method public static b(J)I
    .locals 2

    .prologue
    .line 94
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    .line 95
    const v0, 0x7fffffff

    .line 100
    :goto_0
    return v0

    .line 97
    :cond_0
    const-wide/32 v0, -0x80000000

    cmp-long v0, p0, v0

    if-gez v0, :cond_1

    .line 98
    const/high16 v0, -0x80000000

    goto :goto_0

    .line 100
    :cond_1
    long-to-int v0, p0

    goto :goto_0
.end method
