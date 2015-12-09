.class public final Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;
.super Lorg/apache/sanselan/formats/tiff/constants/TagInfo;


# static fields
.field private static final f:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

.field private static final g:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

.field private static final h:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

.field private static final i:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

.field private static final j:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/16 v3, 0x49

    const/16 v7, 0x8

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    new-array v1, v7, [B

    const/16 v2, 0x41

    aput-byte v2, v1, v4

    const/16 v2, 0x53

    aput-byte v2, v1, v5

    const/16 v2, 0x43

    aput-byte v2, v1, v6

    const/4 v2, 0x3

    aput-byte v3, v1, v2

    const/4 v2, 0x4

    aput-byte v3, v1, v2

    const-string v2, "US-ASCII"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;-><init>([BLjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->f:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    new-array v1, v7, [B

    const/16 v2, 0x4a

    aput-byte v2, v1, v4

    aput-byte v3, v1, v5

    const/16 v2, 0x53

    aput-byte v2, v1, v6

    const-string v2, "JIS"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;-><init>([BLjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->g:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    new-array v1, v7, [B

    const/16 v2, 0x55

    aput-byte v2, v1, v4

    const/16 v2, 0x4e

    aput-byte v2, v1, v5

    aput-byte v3, v1, v6

    const/4 v2, 0x3

    const/16 v3, 0x43

    aput-byte v3, v1, v2

    const/4 v2, 0x4

    const/16 v3, 0x4f

    aput-byte v3, v1, v2

    const/4 v2, 0x5

    const/16 v3, 0x44

    aput-byte v3, v1, v2

    const/4 v2, 0x6

    const/16 v3, 0x45

    aput-byte v3, v1, v2

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;-><init>([BLjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->h:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    new-array v1, v7, [B

    const-string v2, "ISO-8859-1"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;-><init>([BLjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->i:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    const/4 v0, 0x4

    new-array v0, v0, [Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->f:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    aput-object v1, v0, v4

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->g:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    aput-object v1, v0, v5

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->h:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    aput-object v1, v0, v6

    const/4 v1, 0x3

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->i:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    aput-object v2, v0, v1

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->j:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V
    .locals 6

    const/4 v4, -0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V
    .locals 6

    const v2, 0x9286

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;ILorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;
    .locals 6

    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->e:I

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->g_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    iget v1, v1, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;->b:I

    if-ne v0, v1, :cond_0

    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->g_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;->c(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->e:I

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->i_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget v1, v1, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->b:I

    if-eq v0, v1, :cond_1

    iget v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->e:I

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->fP:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    iget v1, v1, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;->b:I

    if-eq v0, v1, :cond_1

    const-string v0, "entry.type"

    iget v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->e:I

    invoke-static {v0, v1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/String;I)V

    const-string v0, "entry.directoryType"

    iget v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->d:I

    invoke-static {v0, v1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/String;I)V

    const-string v0, "entry.type"

    invoke-virtual {p1}, Lorg/apache/sanselan/formats/tiff/TiffField;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "entry.type"

    iget-object v1, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->b:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-static {v0, v1}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Text field not encoded as bytes."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p1, Lorg/apache/sanselan/formats/tiff/TiffField;->b:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->b(Lorg/apache/sanselan/formats/tiff/TiffField;)[B

    move-result-object v1

    array-length v0, v1

    const/16 v2, 0x8

    if-ge v0, v2, :cond_2

    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v2, "US-ASCII"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Text field missing encoding prefix."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->j:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    array-length v2, v2

    if-lt v0, v2, :cond_3

    :try_start_1
    new-instance v0, Ljava/lang/String;

    const-string v2, "US-ASCII"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v0, Lorg/apache/sanselan/ImageReadException;

    const-string v1, "Unknown text encoding prefix."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->j:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    aget-object v2, v2, v0

    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    iget-object v4, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    array-length v4, v4

    invoke-static {v1, v3, v4}, Lorg/apache/sanselan/common/BinaryFileFunctions;->a([B[BI)Z

    move-result v3

    if-eqz v3, :cond_4

    :try_start_2
    new-instance v0, Ljava/lang/String;

    iget-object v3, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    array-length v3, v3

    array-length v4, v1

    iget-object v5, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    array-length v5, v5

    sub-int/2addr v4, v5

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v3, v4, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    :catch_2
    move-exception v0

    new-instance v1, Lorg/apache/sanselan/ImageReadException;

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public final a(Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Ljava/lang/Object;I)[B
    .locals 6

    instance-of v0, p2, Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Text value not String: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p2}, Lorg/apache/sanselan/util/Debug;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p2, Ljava/lang/String;

    :try_start_0
    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->f:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    new-instance v0, Ljava/lang/String;

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->f:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, v1

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->f:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    array-length v2, v2

    add-int/2addr v0, v2

    new-array v0, v0, [B

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->f:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->f:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v5, v5, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    array-length v5, v5

    invoke-static {v2, v3, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v2, 0x0

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->f:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v3, v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    array-length v3, v3

    array-length v4, v1

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->h:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    array-length v0, v1

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->h:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    array-length v2, v2

    add-int/2addr v0, v2

    new-array v0, v0, [B

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->h:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->h:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v5, v5, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    array-length v5, v5

    invoke-static {v2, v3, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v2, 0x0

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;->h:Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;

    iget-object v3, v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text$TextEncoding;->a:[B

    array-length v3, v3

    array-length v4, v1

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/apache/sanselan/ImageWriteException;

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method
