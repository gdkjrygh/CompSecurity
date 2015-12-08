.class final Lcom/c/b/ba$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ba;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/c/b/ba;

.field private b:I

.field private final c:I


# direct methods
.method private constructor <init>(Lcom/c/b/ba;)V
    .locals 1

    .prologue
    .line 324
    iput-object p1, p0, Lcom/c/b/ba$a;->a:Lcom/c/b/ba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 325
    const/4 v0, 0x0

    iput v0, p0, Lcom/c/b/ba$a;->b:I

    .line 326
    invoke-virtual {p1}, Lcom/c/b/ba;->a()I

    move-result v0

    iput v0, p0, Lcom/c/b/ba$a;->c:I

    .line 327
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/ba;B)V
    .locals 0

    .prologue
    .line 320
    invoke-direct {p0, p1}, Lcom/c/b/ba$a;-><init>(Lcom/c/b/ba;)V

    return-void
.end method


# virtual methods
.method public final a()B
    .locals 3

    .prologue
    .line 340
    :try_start_0
    iget-object v0, p0, Lcom/c/b/ba$a;->a:Lcom/c/b/ba;

    iget-object v0, v0, Lcom/c/b/ba;->c:[B

    iget v1, p0, Lcom/c/b/ba$a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/c/b/ba$a;->b:I

    aget-byte v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 341
    :catch_0
    move-exception v0

    .line 342
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final hasNext()Z
    .locals 2

    .prologue
    .line 330
    iget v0, p0, Lcom/c/b/ba$a;->b:I

    iget v1, p0, Lcom/c/b/ba$a;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 320
    invoke-virtual {p0}, Lcom/c/b/ba$a;->a()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 347
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
