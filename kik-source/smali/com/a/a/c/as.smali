.class final Lcom/a/a/c/as;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/b/w$c;


# instance fields
.field final synthetic a:[B

.field final synthetic b:[I

.field final synthetic c:Lcom/a/a/c/ar;


# direct methods
.method constructor <init>(Lcom/a/a/c/ar;[B[I)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/a/a/c/as;->c:Lcom/a/a/c/ar;

    iput-object p2, p0, Lcom/a/a/c/as;->a:[B

    iput-object p3, p0, Lcom/a/a/c/as;->b:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/InputStream;I)V
    .locals 3

    .prologue
    .line 168
    :try_start_0
    iget-object v0, p0, Lcom/a/a/c/as;->a:[B

    iget-object v1, p0, Lcom/a/a/c/as;->b:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {p1, v0, v1, p2}, Ljava/io/InputStream;->read([BII)I

    .line 169
    iget-object v0, p0, Lcom/a/a/c/as;->b:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    add-int/2addr v2, p2

    aput v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 172
    return-void

    .line 171
    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw v0
.end method
