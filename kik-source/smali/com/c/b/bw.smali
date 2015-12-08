.class final Lcom/c/b/bw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bu$a;


# instance fields
.field final synthetic a:[B


# direct methods
.method constructor <init>([B)V
    .locals 0

    .prologue
    .line 1711
    iput-object p1, p0, Lcom/c/b/bw;->a:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)B
    .locals 1

    .prologue
    .line 1718
    iget-object v0, p0, Lcom/c/b/bw;->a:[B

    aget-byte v0, v0, p1

    return v0
.end method

.method public final a()I
    .locals 1

    .prologue
    .line 1714
    iget-object v0, p0, Lcom/c/b/bw;->a:[B

    array-length v0, v0

    return v0
.end method
