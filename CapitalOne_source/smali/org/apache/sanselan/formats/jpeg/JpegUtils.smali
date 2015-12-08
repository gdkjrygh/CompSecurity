.class public Lorg/apache/sanselan/formats/jpeg/JpegUtils;
.super Lorg/apache/sanselan/common/BinaryFileParser;

# interfaces
.implements Lorg/apache/sanselan/formats/jpeg/JpegConstants;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileParser;-><init>()V

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->b()V

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v0, "Unknown"

    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "SOS_Marker"

    goto :goto_0

    :pswitch_2
    const-string v0, "JPEG_APP1_Marker"

    goto :goto_0

    :pswitch_3
    const-string v0, "JPEG_APP2_Marker"

    goto :goto_0

    :pswitch_4
    const-string v0, "JPEG_APP13_Marker"

    goto :goto_0

    :pswitch_5
    const-string v0, "JPEG_APP14_Marker"

    goto :goto_0

    :pswitch_6
    const-string v0, "JPEG_APP15_Marker"

    goto :goto_0

    :pswitch_7
    const-string v0, "JFIFMarker"

    goto :goto_0

    :pswitch_8
    const-string v0, "SOF0Marker"

    goto :goto_0

    :pswitch_9
    const-string v0, "SOF1Marker"

    goto :goto_0

    :pswitch_a
    const-string v0, "SOF2Marker"

    goto :goto_0

    :pswitch_b
    const-string v0, "SOF3Marker"

    goto :goto_0

    :pswitch_c
    const-string v0, "SOF4Marker"

    goto :goto_0

    :pswitch_d
    const-string v0, "SOF5Marker"

    goto :goto_0

    :pswitch_e
    const-string v0, "SOF6Marker"

    goto :goto_0

    :pswitch_f
    const-string v0, "SOF7Marker"

    goto :goto_0

    :pswitch_10
    const-string v0, "SOF8Marker"

    goto :goto_0

    :pswitch_11
    const-string v0, "SOF9Marker"

    goto :goto_0

    :pswitch_12
    const-string v0, "SOF10Marker"

    goto :goto_0

    :pswitch_13
    const-string v0, "SOF11Marker"

    goto :goto_0

    :pswitch_14
    const-string v0, "SOF12Marker"

    goto :goto_0

    :pswitch_15
    const-string v0, "SOF13Marker"

    goto :goto_0

    :pswitch_16
    const-string v0, "SOF14Marker"

    goto :goto_0

    :pswitch_17
    const-string v0, "SOF15Marker"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0xffc0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method


# virtual methods
.method public final a(Lorg/apache/sanselan/common/byteSources/ByteSource;Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;)V
    .locals 8

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Lorg/apache/sanselan/common/byteSources/ByteSource;->b()Ljava/io/InputStream;

    move-result-object v1

    sget-object v0, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->e:[B

    const-string v2, "Not a Valid JPEG File: doesn\'t begin with 0xffd8"

    invoke-static {v1, v0, v2}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->a(Ljava/io/InputStream;[BLjava/lang/String;)V

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->c()I

    move-result v0

    :cond_0
    const-string v2, "markerBytes"

    const/4 v3, 0x2

    const-string v4, "markerBytes"

    invoke-virtual {p0, v2, v3, v1, v4}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->a(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object v2

    const-string v3, "marker"

    invoke-virtual {p0, v3, v2, v0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->c(Ljava/lang/String;[BI)I

    move-result v3

    const v4, 0xffd9

    if-eq v3, v4, :cond_1

    const v4, 0xffda

    if-ne v3, v4, :cond_5

    :cond_1
    invoke-interface {p2}, Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;->a()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_3

    if-eqz v1, :cond_2

    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    :try_start_2
    invoke-interface {p2, v2, v1}, Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;->a([BLjava/io/InputStream;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    :goto_1
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-static {v0}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    :try_start_4
    const-string v4, "segmentLengthBytes"

    const/4 v5, 0x2

    const-string v6, "segmentLengthBytes"

    invoke-virtual {p0, v4, v5, v1, v6}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->a(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object v4

    const-string v5, "segmentLength"

    invoke-virtual {p0, v5, v4, v0}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->c(Ljava/lang/String;[BI)I

    move-result v5

    const-string v6, "Segment Data"

    add-int/lit8 v5, v5, -0x2

    const-string v7, "Invalid Segment: insufficient data"

    invoke-virtual {p0, v6, v5, v1, v7}, Lorg/apache/sanselan/formats/jpeg/JpegUtils;->a(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object v5

    invoke-interface {p2, v3, v2, v4, v5}, Lorg/apache/sanselan/formats/jpeg/JpegUtils$Visitor;->a(I[B[B[B)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result v2

    if-nez v2, :cond_0

    if-eqz v1, :cond_2

    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_0

    :catch_2
    move-exception v0

    invoke-static {v0}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_6

    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    :cond_6
    :goto_2
    throw v0

    :catch_3
    move-exception v1

    invoke-static {v1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Throwable;)V

    goto :goto_2
.end method
