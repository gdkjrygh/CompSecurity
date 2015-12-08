.class public abstract Lorg/apache/sanselan/formats/jpeg/segments/Segment;
.super Lorg/apache/sanselan/common/BinaryFileParser;


# instance fields
.field public final t_:I

.field public final u_:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileParser;-><init>()V

    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->t_:I

    iput p2, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->u_:I

    return-void
.end method


# virtual methods
.method public abstract d()Ljava/lang/String;
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    const v2, 0xffe0

    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->t_:I

    sparse-switch v0, :sswitch_data_0

    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->t_:I

    const v1, 0xff02

    if-lt v0, v1, :cond_0

    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->t_:I

    const v1, 0xffbf

    if-gt v0, v1, :cond_0

    const-string v0, "Reserved"

    :goto_0
    return-object v0

    :sswitch_0
    const-string v0, "Start Of Frame, Baseline DCT, Huffman coding"

    goto :goto_0

    :sswitch_1
    const-string v0, "Start Of Frame, Extended sequential DCT, Huffman coding"

    goto :goto_0

    :sswitch_2
    const-string v0, "Start Of Frame, Progressive DCT, Huffman coding"

    goto :goto_0

    :sswitch_3
    const-string v0, "Start Of Frame, Lossless (sequential), Huffman coding"

    goto :goto_0

    :sswitch_4
    const-string v0, "Start Of Frame, Differential sequential DCT, Huffman coding"

    goto :goto_0

    :sswitch_5
    const-string v0, "Start Of Frame, Differential progressive DCT, Huffman coding"

    goto :goto_0

    :sswitch_6
    const-string v0, "Start Of Frame, Differential lossless (sequential), Huffman coding"

    goto :goto_0

    :sswitch_7
    const-string v0, "Start Of Frame, Reserved for JPEG extensions, arithmetic coding"

    goto :goto_0

    :sswitch_8
    const-string v0, "Start Of Frame, Extended sequential DCT, arithmetic coding"

    goto :goto_0

    :sswitch_9
    const-string v0, "Start Of Frame, Progressive DCT, arithmetic coding"

    goto :goto_0

    :sswitch_a
    const-string v0, "Start Of Frame, Lossless (sequential), arithmetic coding"

    goto :goto_0

    :sswitch_b
    const-string v0, "Start Of Frame, Differential sequential DCT, arithmetic coding"

    goto :goto_0

    :sswitch_c
    const-string v0, "Start Of Frame, Differential progressive DCT, arithmetic coding"

    goto :goto_0

    :sswitch_d
    const-string v0, "Start Of Frame, Differential lossless (sequential), arithmetic coding"

    goto :goto_0

    :sswitch_e
    const-string v0, "Define Huffman table(s)"

    goto :goto_0

    :sswitch_f
    const-string v0, "Define arithmetic coding conditioning(s)"

    goto :goto_0

    :sswitch_10
    const-string v0, "Restart with modulo 8 count 0"

    goto :goto_0

    :sswitch_11
    const-string v0, "Restart with modulo 8 count 1"

    goto :goto_0

    :sswitch_12
    const-string v0, "Restart with modulo 8 count 2"

    goto :goto_0

    :sswitch_13
    const-string v0, "Restart with modulo 8 count 3"

    goto :goto_0

    :sswitch_14
    const-string v0, "Restart with modulo 8 count 4"

    goto :goto_0

    :sswitch_15
    const-string v0, "Restart with modulo 8 count 5"

    goto :goto_0

    :sswitch_16
    const-string v0, "Restart with modulo 8 count 6"

    goto :goto_0

    :sswitch_17
    const-string v0, "Restart with modulo 8 count 7"

    goto :goto_0

    :sswitch_18
    const-string v0, "Start of image"

    goto :goto_0

    :sswitch_19
    const-string v0, "End of image"

    goto :goto_0

    :sswitch_1a
    const-string v0, "Start of scan"

    goto :goto_0

    :sswitch_1b
    const-string v0, "Define quantization table(s)"

    goto :goto_0

    :sswitch_1c
    const-string v0, "Define number of lines"

    goto :goto_0

    :sswitch_1d
    const-string v0, "Define restart interval"

    goto :goto_0

    :sswitch_1e
    const-string v0, "Define hierarchical progression"

    goto :goto_0

    :sswitch_1f
    const-string v0, "Expand reference component(s)"

    goto :goto_0

    :sswitch_20
    const-string v0, "Comment"

    goto :goto_0

    :sswitch_21
    const-string v0, "For temporary private use in arithmetic coding"

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->t_:I

    if-lt v0, v2, :cond_1

    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->t_:I

    const v1, 0xffef

    if-gt v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "APP"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->t_:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_1
    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->t_:I

    const v1, 0xfff0

    if-lt v0, v1, :cond_2

    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->t_:I

    const v1, 0xfffd

    if-gt v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JPG"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->t_:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_2
    const-string v0, "Unknown"

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xff01 -> :sswitch_21
        0xffc0 -> :sswitch_0
        0xffc1 -> :sswitch_1
        0xffc2 -> :sswitch_2
        0xffc3 -> :sswitch_3
        0xffc4 -> :sswitch_e
        0xffc5 -> :sswitch_4
        0xffc6 -> :sswitch_5
        0xffc7 -> :sswitch_6
        0xffc8 -> :sswitch_7
        0xffc9 -> :sswitch_8
        0xffca -> :sswitch_9
        0xffcb -> :sswitch_a
        0xffcc -> :sswitch_f
        0xffcd -> :sswitch_b
        0xffce -> :sswitch_c
        0xffcf -> :sswitch_d
        0xffd0 -> :sswitch_10
        0xffd1 -> :sswitch_11
        0xffd2 -> :sswitch_12
        0xffd3 -> :sswitch_13
        0xffd4 -> :sswitch_14
        0xffd5 -> :sswitch_15
        0xffd6 -> :sswitch_16
        0xffd7 -> :sswitch_17
        0xffd8 -> :sswitch_18
        0xffd9 -> :sswitch_19
        0xffda -> :sswitch_1a
        0xffdb -> :sswitch_1b
        0xffdc -> :sswitch_1c
        0xffdd -> :sswitch_1d
        0xffde -> :sswitch_1e
        0xffdf -> :sswitch_1f
        0xfffe -> :sswitch_20
    .end sparse-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[Segment: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
