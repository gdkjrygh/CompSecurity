.class public Lorg/spongycastle/util/io/TeeOutputStream;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field private a:Ljava/io/OutputStream;

.field private b:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Ljava/io/OutputStream;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 14
    iput-object p1, p0, Lorg/spongycastle/util/io/TeeOutputStream;->a:Ljava/io/OutputStream;

    .line 15
    iput-object p2, p0, Lorg/spongycastle/util/io/TeeOutputStream;->b:Ljava/io/OutputStream;

    .line 16
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 50
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeOutputStream;->b:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 51
    return-void
.end method

.method public flush()V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 43
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeOutputStream;->b:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 44
    return-void
.end method

.method public write(I)V
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 36
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeOutputStream;->b:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 37
    return-void
.end method

.method public write([B)V
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 22
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeOutputStream;->b:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 23
    return-void
.end method

.method public write([BII)V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeOutputStream;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 29
    iget-object v0, p0, Lorg/spongycastle/util/io/TeeOutputStream;->b:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 30
    return-void
.end method
