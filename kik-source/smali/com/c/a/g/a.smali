.class public final Lcom/c/a/g/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 639
    const/16 v1, 0x80

    new-array v1, v1, [B

    .line 642
    sput-object v1, Lcom/c/a/g/a;->a:[B

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([BB)V

    move v1, v0

    .line 643
    :goto_0
    const/16 v2, 0x9

    if-gt v1, v2, :cond_0

    .line 644
    sget-object v2, Lcom/c/a/g/a;->a:[B

    add-int/lit8 v3, v1, 0x30

    int-to-byte v4, v1

    aput-byte v4, v2, v3

    .line 643
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 646
    :cond_0
    :goto_1
    const/16 v1, 0x1a

    if-gt v0, v1, :cond_1

    .line 647
    sget-object v1, Lcom/c/a/g/a;->a:[B

    add-int/lit8 v2, v0, 0x41

    add-int/lit8 v3, v0, 0xa

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 648
    sget-object v1, Lcom/c/a/g/a;->a:[B

    add-int/lit8 v2, v0, 0x61

    add-int/lit8 v3, v0, 0xa

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 646
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 650
    :cond_1
    return-void
.end method

.method public static a()I
    .locals 4

    .prologue
    const-wide/16 v2, 0x6

    .line 105
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 106
    const v0, 0x7fffffff

    .line 111
    :goto_0
    return v0

    .line 108
    :cond_0
    const-wide/32 v0, -0x80000000

    cmp-long v0, v2, v0

    if-gez v0, :cond_1

    .line 109
    const/high16 v0, -0x80000000

    goto :goto_0

    .line 111
    :cond_1
    const/4 v0, 0x6

    goto :goto_0
.end method

.method public static a(J)I
    .locals 4

    .prologue
    .line 88
    long-to-int v0, p0

    .line 89
    int-to-long v2, v0

    cmp-long v1, v2, p0

    if-eqz v1, :cond_0

    .line 91
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x22

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Out of range: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_0
    return v0
.end method
