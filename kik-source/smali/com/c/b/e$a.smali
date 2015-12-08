.class final Lcom/c/b/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/c/b/e;

.field private b:I

.field private final c:I


# direct methods
.method private constructor <init>(Lcom/c/b/e;)V
    .locals 2

    .prologue
    .line 155
    iput-object p1, p0, Lcom/c/b/e$a;->a:Lcom/c/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    invoke-virtual {p1}, Lcom/c/b/e;->b()I

    move-result v0

    iput v0, p0, Lcom/c/b/e$a;->b:I

    .line 157
    iget v0, p0, Lcom/c/b/e$a;->b:I

    invoke-virtual {p1}, Lcom/c/b/e;->a()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/c/b/e$a;->c:I

    .line 158
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/e;B)V
    .locals 0

    .prologue
    .line 150
    invoke-direct {p0, p1}, Lcom/c/b/e$a;-><init>(Lcom/c/b/e;)V

    return-void
.end method


# virtual methods
.method public final a()B
    .locals 3

    .prologue
    .line 170
    iget v0, p0, Lcom/c/b/e$a;->b:I

    iget v1, p0, Lcom/c/b/e$a;->c:I

    if-lt v0, v1, :cond_0

    .line 171
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 173
    :cond_0
    iget-object v0, p0, Lcom/c/b/e$a;->a:Lcom/c/b/e;

    iget-object v0, v0, Lcom/c/b/e;->c:[B

    iget v1, p0, Lcom/c/b/e$a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/c/b/e$a;->b:I

    aget-byte v0, v0, v1

    return v0
.end method

.method public final hasNext()Z
    .locals 2

    .prologue
    .line 161
    iget v0, p0, Lcom/c/b/e$a;->b:I

    iget v1, p0, Lcom/c/b/e$a;->c:I

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
    .line 150
    invoke-virtual {p0}, Lcom/c/b/e$a;->a()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 177
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
