.class public abstract Lnet/jarlehansen/protobuf/javame/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lnet/jarlehansen/protobuf/javame/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public N()[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 10
    invoke-virtual {p0}, Lnet/jarlehansen/protobuf/javame/a;->O()[B

    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lnet/jarlehansen/protobuf/javame/a;->b([B)V

    .line 13
    return-object v0
.end method

.method public O()[B
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0}, Lnet/jarlehansen/protobuf/javame/a;->b()I

    move-result v0

    new-array v0, v0, [B

    return-object v0
.end method

.method public abstract a(Lnet/jarlehansen/protobuf/javame/b/a;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract b()I
.end method

.method public b([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 17
    new-instance v0, Lnet/jarlehansen/protobuf/javame/b/a;

    invoke-direct {v0, p1}, Lnet/jarlehansen/protobuf/javame/b/a;-><init>([B)V

    .line 18
    invoke-virtual {p0, v0}, Lnet/jarlehansen/protobuf/javame/a;->a(Lnet/jarlehansen/protobuf/javame/b/a;)V

    .line 19
    return-void
.end method
