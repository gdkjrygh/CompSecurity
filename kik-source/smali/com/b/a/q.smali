.class public final Lcom/b/a/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/b/a/q;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/b/a/q;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([BLjava/lang/Object;Lcom/b/a/u;)V
    .locals 3

    .prologue
    .line 95
    array-length v0, p0

    :try_start_0
    new-instance v1, Lcom/b/a/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lcom/b/a/a;-><init>([BIZ)V

    invoke-interface {p2, v1, p1}, Lcom/b/a/u;->a(Lcom/b/a/k;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/b/a/a;->a(I)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Reading from a byte array threw an IOException (should never happen)."

    invoke-static {v0}, Lcom/b/a/p;->a(Ljava/lang/Throwable;)Lcom/b/a/p;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Reading from a byte array threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a(Ljava/lang/Object;Lcom/b/a/u;Lcom/b/a/m;)[B
    .locals 3

    .prologue
    .line 170
    iget v0, p2, Lcom/b/a/m;->b:I

    iget v1, p2, Lcom/b/a/m;->c:I

    if-eq v0, v1, :cond_0

    .line 171
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Buffer previously used and had not been reset."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 173
    :cond_0
    new-instance v0, Lcom/b/a/r;

    invoke-direct {v0, p2}, Lcom/b/a/r;-><init>(Lcom/b/a/m;)V

    .line 176
    :try_start_0
    invoke-interface {p1, v0, p0}, Lcom/b/a/u;->a(Lcom/b/a/o;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    invoke-virtual {v0}, Lcom/b/a/r;->a()[B

    move-result-object v0

    return-object v0

    .line 178
    :catch_0
    move-exception v0

    .line 180
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Serializing to a byte array threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
