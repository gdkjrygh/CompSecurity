.class final Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/io/File;

.field private final b:J


# direct methods
.method constructor <init>(Ljava/io/File;)V
    .locals 2

    .prologue
    .line 586
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 587
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->a:Ljava/io/File;

    .line 588
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->b:J

    .line 589
    return-void
.end method

.method private a(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;)I
    .locals 4

    .prologue
    .line 601
    .line 1596
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->b:J

    .line 2596
    iget-wide v2, p1, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->b:J

    .line 601
    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 602
    const/4 v0, -0x1

    .line 606
    :goto_0
    return v0

    .line 3596
    :cond_0
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->b:J

    .line 4596
    iget-wide v2, p1, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->b:J

    .line 603
    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 604
    const/4 v0, 0x1

    goto :goto_0

    .line 5592
    :cond_1
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->a:Ljava/io/File;

    .line 6592
    iget-object v1, p1, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->a:Ljava/io/File;

    .line 606
    invoke-virtual {v0, v1}, Ljava/io/File;->compareTo(Ljava/io/File;)I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method final a()Ljava/io/File;
    .locals 1

    .prologue
    .line 592
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->a:Ljava/io/File;

    return-object v0
.end method

.method final b()J
    .locals 2

    .prologue
    .line 596
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->b:J

    return-wide v0
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 579
    check-cast p1, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;

    invoke-direct {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->a(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;)I

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 612
    instance-of v0, p1, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;

    invoke-direct {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->a(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 6

    .prologue
    .line 621
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x431

    .line 622
    mul-int/lit8 v0, v0, 0x25

    iget-wide v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/i;->b:J

    const-wide/32 v4, 0x7fffffff

    rem-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    .line 624
    return v0
.end method
