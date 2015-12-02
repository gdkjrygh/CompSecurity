.class public Lnet/jarlehansen/protobuf/javame/c;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(ID)I
    .locals 1

    .prologue
    .line 35
    invoke-static {p0, p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(ID)I

    move-result v0

    return v0
.end method

.method public static a(IF)I
    .locals 1

    .prologue
    .line 39
    invoke-static {p0, p1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(IF)I

    move-result v0

    return v0
.end method

.method public static a(II)I
    .locals 1

    .prologue
    .line 23
    invoke-static {p0, p1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->c(II)I

    move-result v0

    return v0
.end method

.method public static a(IILjava/util/Vector;)I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 55
    .line 57
    if-eqz p2, :cond_0

    .line 58
    packed-switch p1, :pswitch_data_0

    .line 100
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string/jumbo v2, "The data type was not found, the id used was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    move v1, v0

    move v2, v0

    .line 60
    :goto_0
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 61
    invoke-virtual {p2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/jarlehansen/protobuf/javame/b;

    invoke-static {p0, v0}, Lnet/jarlehansen/protobuf/javame/c;->a(ILnet/jarlehansen/protobuf/javame/b;)I

    move-result v0

    add-int/2addr v2, v0

    .line 60
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :pswitch_1
    move v1, v0

    move v2, v0

    .line 65
    :goto_1
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 66
    invoke-virtual {p2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {p0, v4, v5}, Lnet/jarlehansen/protobuf/javame/c;->a(ID)I

    move-result v0

    add-int/2addr v2, v0

    .line 65
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :pswitch_2
    move v1, v0

    move v2, v0

    .line 70
    :goto_2
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 71
    invoke-virtual {p2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {p0, v0}, Lnet/jarlehansen/protobuf/javame/c;->a(IF)I

    move-result v0

    add-int/2addr v2, v0

    .line 70
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :pswitch_3
    move v1, v0

    move v2, v0

    .line 75
    :goto_3
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 76
    invoke-virtual {p2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {p0, v0}, Lnet/jarlehansen/protobuf/javame/c;->a(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 75
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :pswitch_4
    move v1, v0

    move v2, v0

    .line 80
    :goto_4
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 81
    invoke-virtual {p2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {p0, v4, v5}, Lnet/jarlehansen/protobuf/javame/c;->a(IJ)I

    move-result v0

    add-int/2addr v2, v0

    .line 80
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    :pswitch_5
    move v1, v0

    move v2, v0

    .line 85
    :goto_5
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 86
    invoke-virtual {p2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lnet/jarlehansen/protobuf/javame/c;->a(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v2, v0

    .line 85
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_5

    :pswitch_6
    move v1, v0

    move v2, v0

    .line 90
    :goto_6
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 91
    invoke-virtual {p2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {p0, v0}, Lnet/jarlehansen/protobuf/javame/c;->a(IZ)I

    move-result v0

    add-int/2addr v2, v0

    .line 90
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    :pswitch_7
    move v1, v0

    move v2, v0

    .line 95
    :goto_7
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 96
    invoke-virtual {p2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/jarlehansen/protobuf/javame/d;

    invoke-interface {v0}, Lnet/jarlehansen/protobuf/javame/d;->b()I

    move-result v0

    invoke-static {p0, v0}, Lnet/jarlehansen/protobuf/javame/c;->b(II)I

    move-result v0

    add-int/2addr v2, v0

    .line 95
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_7

    :cond_0
    move v2, v0

    .line 104
    :cond_1
    return v2

    .line 58
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

.method public static a(IJ)I
    .locals 1

    .prologue
    .line 43
    invoke-static {p0, p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(IJ)I

    move-result v0

    return v0
.end method

.method public static a(ILjava/lang/String;)I
    .locals 1

    .prologue
    .line 27
    invoke-static {p0, p1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static a(ILnet/jarlehansen/protobuf/javame/b;)I
    .locals 1

    .prologue
    .line 47
    invoke-static {p0, p1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(ILnet/jarlehansen/protobuf/javame/b;)I

    move-result v0

    return v0
.end method

.method public static a(IZ)I
    .locals 1

    .prologue
    .line 31
    invoke-static {p0, p1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(IZ)I

    move-result v0

    return v0
.end method

.method public static b(II)I
    .locals 2

    .prologue
    .line 51
    invoke-static {p0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(I)I

    move-result v0

    invoke-static {p1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->c(I)I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    return v0
.end method
