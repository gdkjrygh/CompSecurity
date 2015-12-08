.class final Lb/a/a/a/a/e/e;
.super Lb/a/a/a/a/e/d$a;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/io/InputStream;

.field final synthetic b:Ljava/io/OutputStream;

.field final synthetic c:Lb/a/a/a/a/e/d;


# direct methods
.method constructor <init>(Lb/a/a/a/a/e/d;Ljava/io/Closeable;ZLjava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 0

    .prologue
    .line 2419
    iput-object p1, p0, Lb/a/a/a/a/e/e;->c:Lb/a/a/a/a/e/d;

    iput-object p4, p0, Lb/a/a/a/a/e/e;->a:Ljava/io/InputStream;

    iput-object p5, p0, Lb/a/a/a/a/e/e;->b:Ljava/io/OutputStream;

    invoke-direct {p0, p2, p3}, Lb/a/a/a/a/e/d$a;-><init>(Ljava/io/Closeable;Z)V

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 4

    .prologue
    .line 2419
    iget-object v0, p0, Lb/a/a/a/a/e/e;->c:Lb/a/a/a/a/e/d;

    invoke-static {v0}, Lb/a/a/a/a/e/d;->a(Lb/a/a/a/a/e/d;)I

    move-result v0

    new-array v0, v0, [B

    :goto_0
    iget-object v1, p0, Lb/a/a/a/a/e/e;->a:Ljava/io/InputStream;

    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget-object v2, p0, Lb/a/a/a/a/e/e;->b:Ljava/io/OutputStream;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb/a/a/a/a/e/e;->c:Lb/a/a/a/a/e/d;

    return-object v0
.end method
