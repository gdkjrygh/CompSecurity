.class public Lnet/jarlehansen/protobuf/javame/a/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private final a:Lnet/jarlehansen/protobuf/javame/a/a/b;

.field private final b:Lnet/jarlehansen/protobuf/javame/original/input/a;

.field private c:I


# direct methods
.method public constructor <init>([BLnet/jarlehansen/protobuf/javame/a/a/b;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->c:I

    .line 24
    invoke-static {p1}, Lnet/jarlehansen/protobuf/javame/original/input/a;->a([B)Lnet/jarlehansen/protobuf/javame/original/input/a;

    move-result-object v0

    iput-object v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    .line 25
    iput-object p2, p0, Lnet/jarlehansen/protobuf/javame/a/a;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    .line 26
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 71
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->a()I

    move-result v0

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->c:I

    .line 72
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->c:I

    invoke-static {v0}, Lnet/jarlehansen/protobuf/javame/original/a;->b(I)I

    move-result v0

    return v0
.end method

.method public a(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 39
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->e()I

    move-result v0

    return v0
.end method

.method public b(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 43
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 76
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->c:I

    invoke-static {v0}, Lnet/jarlehansen/protobuf/javame/original/a;->a(I)I

    move-result v0

    .line 77
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 78
    const-string/jumbo v2, "FieldNumber: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    iget v3, p0, Lnet/jarlehansen/protobuf/javame/a/a;->c:I

    invoke-static {v3}, Lnet/jarlehansen/protobuf/javame/original/a;->b(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v2

    const-string/jumbo v3, " - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 80
    packed-switch v0, :pswitch_data_0

    .line 97
    :goto_0
    :pswitch_0
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/jarlehansen/protobuf/javame/a/a/b;->a(Ljava/lang/String;)V

    .line 98
    return-void

    .line 82
    :pswitch_1
    const-string/jumbo v0, "float value: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v2}, Lnet/jarlehansen/protobuf/javame/original/input/a;->c()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 85
    :pswitch_2
    const-string/jumbo v0, "double value: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v2}, Lnet/jarlehansen/protobuf/javame/original/input/a;->b()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 88
    :pswitch_3
    const-string/jumbo v0, "Length delimited (String or ByteString) value: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v2}, Lnet/jarlehansen/protobuf/javame/original/input/a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 91
    :pswitch_4
    const-string/jumbo v0, "varint (long, int or boolean) value: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v2}, Lnet/jarlehansen/protobuf/javame/original/input/a;->i()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 80
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public c(I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 47
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->f()Z

    move-result v0

    return v0
.end method

.method public d(I)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 59
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public e(I)Lnet/jarlehansen/protobuf/javame/b;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 63
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v0}, Lnet/jarlehansen/protobuf/javame/original/input/a;->h()Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    return-object v0
.end method

.method public f(I)Ljava/util/Vector;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 101
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/a/a;->b:Lnet/jarlehansen/protobuf/javame/original/input/a;

    invoke-virtual {v0, p1}, Lnet/jarlehansen/protobuf/javame/original/input/a;->a(I)Ljava/util/Vector;

    move-result-object v0

    return-object v0
.end method
