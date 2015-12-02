.class public Lcom/facebook/common/c/i;
.super Ljava/lang/Object;
.source "MemoryInfo.java"


# static fields
.field private static f:Ljava/text/DecimalFormat;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field private final g:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 18
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "##0.0"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/common/c/i;->f:Ljava/text/DecimalFormat;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runtime;)V
    .locals 4

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p1}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/common/c/i;->a:J

    .line 41
    invoke-virtual {p1}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/common/c/i;->b:J

    .line 42
    iget-wide v0, p0, Lcom/facebook/common/c/i;->b:J

    iget-wide v2, p0, Lcom/facebook/common/c/i;->a:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/common/c/i;->g:J

    .line 48
    iget-wide v0, p0, Lcom/facebook/common/c/i;->b:J

    iput-wide v0, p0, Lcom/facebook/common/c/i;->e:J

    .line 49
    invoke-static {}, Landroid/os/Debug;->getNativeHeapAllocatedSize()J

    move-result-wide v0

    invoke-static {}, Landroid/os/Debug;->getNativeHeapFreeSize()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/common/c/i;->c:J

    .line 50
    iget-wide v0, p0, Lcom/facebook/common/c/i;->e:J

    iget-wide v2, p0, Lcom/facebook/common/c/i;->c:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/common/c/i;->d:J

    .line 51
    return-void
.end method

.method private static a(JJ)Ljava/lang/String;
    .locals 10

    .prologue
    const-wide/high16 v6, 0x4130000000000000L    # 1048576.0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 65
    long-to-double v0, p0

    mul-double/2addr v0, v4

    div-double/2addr v0, v6

    .line 66
    long-to-double v2, p2

    mul-double/2addr v2, v4

    div-double/2addr v2, v6

    .line 68
    const-string v4, "Max: %sM Used: %sM %s%%"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    sget-object v7, Lcom/facebook/common/c/i;->f:Ljava/text/DecimalFormat;

    invoke-virtual {v7, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    sget-object v7, Lcom/facebook/common/c/i;->f:Ljava/text/DecimalFormat;

    invoke-virtual {v7, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x2

    sget-object v7, Lcom/facebook/common/c/i;->f:Ljava/text/DecimalFormat;

    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    mul-double/2addr v2, v8

    div-double v0, v2, v0

    invoke-virtual {v7, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v6

    invoke-static {v4, v5}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 73
    iget-wide v0, p0, Lcom/facebook/common/c/i;->g:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .prologue
    .line 59
    const-string v0, "Memory: JAVA [%s]  NATIVE [%s]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-wide v3, p0, Lcom/facebook/common/c/i;->b:J

    iget-wide v5, p0, Lcom/facebook/common/c/i;->a:J

    invoke-static {v3, v4, v5, v6}, Lcom/facebook/common/c/i;->a(JJ)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-wide v3, p0, Lcom/facebook/common/c/i;->e:J

    iget-wide v5, p0, Lcom/facebook/common/c/i;->c:J

    invoke-static {v3, v4, v5, v6}, Lcom/facebook/common/c/i;->a(JJ)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
