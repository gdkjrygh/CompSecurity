.class public Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# static fields
.field private static final h:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public final c:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public final d:I

.field private e:[B

.field private final f:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->h:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(ILorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->g:I

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->b:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iput-object p3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->c:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iput p4, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->d:I

    iput-object p5, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->e:[B

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->f:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Field Seperate value ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    invoke-direct {v1, v0, p5}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;-><init>(Ljava/lang/String;[B)V

    iput-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->f:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    goto :goto_0
.end method

.method public constructor <init>(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V
    .locals 6

    iget v1, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(ILorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    return-void
.end method

.method protected static final a(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
    .locals 5

    const/4 v4, 0x1

    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    new-array v3, v4, [I

    invoke-virtual {v2, v3, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->a(Ljava/lang/Object;I)[B

    move-result-object v2

    invoke-direct {v0, p0, v1, v4, v2}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    return-object v0
.end method


# virtual methods
.method protected final a()Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->f:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    return-object v0
.end method

.method protected final a(Lorg/apache/sanselan/common/BinaryOutputStream;)V
    .locals 3

    const/4 v1, 0x0

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->a:I

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->b(I)V

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->c:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->b:I

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->b(I)V

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->d:I

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->a(I)V

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->f:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    const-string v1, "Unexpected separate value item."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->e:[B

    array-length v0, v0

    const/4 v2, 0x4

    if-le v0, v2, :cond_1

    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Local value has invalid length: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->e:[B

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->e:[B

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->a([B)V

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->e:[B

    array-length v0, v0

    rsub-int/lit8 v2, v0, 0x4

    move v0, v1

    :goto_0
    if-lt v0, v2, :cond_2

    :goto_1
    return-void

    :cond_2
    invoke-virtual {p1, v1}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->f:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    if-nez v0, :cond_4

    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    const-string v1, "Missing separate value item."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->f:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->a(I)V

    goto :goto_1
.end method

.method protected final a([B)V
    .locals 2

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->e:[B

    array-length v0, v0

    array-length v1, p1

    if-eq v0, v1, :cond_0

    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    const-string v1, "Cannot change size of value."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->e:[B

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->f:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->f:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->a([B)V

    :cond_1
    return-void
.end method

.method protected final b()Z
    .locals 2

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->e:[B

    array-length v0, v0

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->g:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, ""

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->b:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "count: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->c:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
