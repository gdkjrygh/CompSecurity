.class public Lnet/jarlehansen/protobuf/javame/b/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private final a:[B

.field private final b:Ljava/io/OutputStream;

.field private final c:Lnet/jarlehansen/protobuf/javame/original/a/a;


# direct methods
.method public constructor <init>([B)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lnet/jarlehansen/protobuf/javame/b/a;->a:[B

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/jarlehansen/protobuf/javame/b/a;->b:Ljava/io/OutputStream;

    .line 26
    invoke-static {p1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a([B)Lnet/jarlehansen/protobuf/javame/original/a/a;

    move-result-object v0

    iput-object v0, p0, Lnet/jarlehansen/protobuf/javame/b/a;->c:Lnet/jarlehansen/protobuf/javame/original/a/a;

    .line 27
    return-void
.end method


# virtual methods
.method public a(ID)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 45
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b/a;->c:Lnet/jarlehansen/protobuf/javame/original/a/a;

    invoke-virtual {v0, p1, p2, p3}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(ID)V

    .line 46
    return-void
.end method

.method public a(IF)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 49
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b/a;->c:Lnet/jarlehansen/protobuf/javame/original/a/a;

    invoke-virtual {v0, p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(IF)V

    .line 50
    return-void
.end method

.method public a(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 53
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b/a;->c:Lnet/jarlehansen/protobuf/javame/original/a/a;

    invoke-virtual {v0, p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(II)V

    .line 54
    return-void
.end method

.method public a(IILjava/util/Vector;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 82
    if-eqz p3, :cond_0

    .line 83
    packed-switch p2, :pswitch_data_0

    .line 127
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string/jumbo v2, "The data type was not found, the id used was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    move v1, v0

    .line 85
    :goto_0
    invoke-virtual {p3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 86
    invoke-virtual {p3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/jarlehansen/protobuf/javame/b;

    invoke-virtual {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILnet/jarlehansen/protobuf/javame/b;)V

    .line 85
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :pswitch_1
    move v1, v0

    .line 90
    :goto_1
    invoke-virtual {p3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 91
    invoke-virtual {p3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, p1, v2, v3}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ID)V

    .line 90
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :pswitch_2
    move v1, v0

    .line 95
    :goto_2
    invoke-virtual {p3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 96
    invoke-virtual {p3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/b/a;->a(IF)V

    .line 95
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :pswitch_3
    move v1, v0

    .line 100
    :goto_3
    invoke-virtual {p3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 101
    invoke-virtual {p3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/b/a;->a(II)V

    .line 100
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :pswitch_4
    move v1, v0

    .line 105
    :goto_4
    invoke-virtual {p3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 106
    invoke-virtual {p3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, p1, v2, v3}, Lnet/jarlehansen/protobuf/javame/b/a;->a(IJ)V

    .line 105
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    :pswitch_5
    move v1, v0

    .line 110
    :goto_5
    invoke-virtual {p3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 111
    invoke-virtual {p3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILjava/lang/String;)V

    .line 110
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_5

    :pswitch_6
    move v1, v0

    .line 115
    :goto_6
    invoke-virtual {p3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 116
    invoke-virtual {p3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/b/a;->a(IZ)V

    .line 115
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    :pswitch_7
    move v1, v0

    .line 120
    :goto_7
    invoke-virtual {p3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 121
    invoke-virtual {p3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/jarlehansen/protobuf/javame/d;

    .line 122
    invoke-interface {v0}, Lnet/jarlehansen/protobuf/javame/d;->b()I

    move-result v2

    invoke-virtual {p0, p1, v2}, Lnet/jarlehansen/protobuf/javame/b/a;->b(II)V

    .line 123
    invoke-interface {v0, p0}, Lnet/jarlehansen/protobuf/javame/d;->a(Lnet/jarlehansen/protobuf/javame/b/a;)V

    .line 120
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_7

    .line 130
    :cond_0
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_3
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public a(IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 57
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b/a;->c:Lnet/jarlehansen/protobuf/javame/original/a/a;

    invoke-virtual {v0, p1, p2, p3}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(IJ)V

    .line 58
    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 61
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b/a;->c:Lnet/jarlehansen/protobuf/javame/original/a/a;

    invoke-virtual {v0, p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(ILjava/lang/String;)V

    .line 62
    return-void
.end method

.method public a(ILnet/jarlehansen/protobuf/javame/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 41
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b/a;->c:Lnet/jarlehansen/protobuf/javame/original/a/a;

    invoke-virtual {v0, p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(ILnet/jarlehansen/protobuf/javame/b;)V

    .line 42
    return-void
.end method

.method public a(IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 37
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b/a;->c:Lnet/jarlehansen/protobuf/javame/original/a/a;

    invoke-virtual {v0, p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(IZ)V

    .line 38
    return-void
.end method

.method public b(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 69
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/b/a;->c:Lnet/jarlehansen/protobuf/javame/original/a/a;

    invoke-virtual {v0, p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(II)V

    .line 70
    return-void
.end method
