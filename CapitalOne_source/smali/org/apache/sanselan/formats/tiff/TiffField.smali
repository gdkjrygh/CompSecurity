.class public Lorg/apache/sanselan/formats/tiff/TiffField;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# static fields
.field private static final gp:Ljava/util/Map;

.field private static final gq:Ljava/util/Map;

.field private static final gr:Ljava/util/Map;

.field private static final gs:Ljava/util/Map;


# instance fields
.field public final a:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public final b:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field private go:I

.field public final h:[B

.field public i:[B

.field public final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->Q:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-static {v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->a([Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->gp:Ljava/util/Map;

    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->aJ:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-static {v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->a([Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->gq:Ljava/util/Map;

    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->fO:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-static {v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->a([Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->gr:Ljava/util/Map;

    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->k:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-static {v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->a([Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->gs:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(IIIII[BI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->i:[B

    const/4 v0, -0x1

    iput v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->go:I

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    iput p2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->d:I

    iput p3, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->e:I

    iput p4, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->f:I

    iput p5, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->g:I

    iput-object p6, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->h:[B

    iput p7, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->j:I

    invoke-static {p3}, Lorg/apache/sanselan/formats/tiff/TiffField;->b(I)Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->b:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffField;->gr:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->aS_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    :goto_0
    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->a:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    return-void

    :cond_0
    invoke-static {p2, v0}, Lorg/apache/sanselan/formats/tiff/TiffField;->a(ILjava/util/List;)Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    move-result-object v0

    goto :goto_0
.end method

.method private static final a([Lorg/apache/sanselan/formats/tiff/constants/TagInfo;)Ljava/util/Map;
    .locals 5

    new-instance v2, Ljava/util/Hashtable;

    invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v0, p0

    if-lt v1, v0, :cond_0

    return-object v2

    :cond_0
    aget-object v3, p0, v1

    new-instance v4, Ljava/lang/Integer;

    iget v0, v3, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->b:I

    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method private static a(ILjava/util/List;)Lorg/apache/sanselan/formats/tiff/constants/TagInfo;
    .locals 5

    const/4 v2, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    move v1, v2

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    move v1, v2

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_b

    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lt v2, v0, :cond_e

    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->aS_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    goto :goto_0

    :cond_2
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->gf:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v3, v4, :cond_a

    const/4 v3, -0x2

    if-ne p0, v3, :cond_3

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->gd:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v3, v4, :cond_0

    :cond_3
    const/4 v3, -0x4

    if-ne p0, v3, :cond_4

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->gb:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v3, v4, :cond_0

    :cond_4
    const/4 v3, -0x3

    if-ne p0, v3, :cond_5

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v3, v4, :cond_0

    :cond_5
    const/4 v3, -0x5

    if-ne p0, v3, :cond_6

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->gc:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v3, v4, :cond_0

    :cond_6
    if-nez p0, :cond_7

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->b_:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v3, v4, :cond_0

    :cond_7
    const/4 v3, 0x1

    if-ne p0, v3, :cond_8

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->d_:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v3, v4, :cond_0

    :cond_8
    const/4 v3, 0x2

    if-ne p0, v3, :cond_9

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->e_:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v3, v4, :cond_0

    :cond_9
    const/4 v3, 0x3

    if-ne p0, v3, :cond_a

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->f_:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v3, v4, :cond_0

    :cond_a
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_b
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/TiffField;->gf:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v3, v4, :cond_d

    if-ltz p0, :cond_c

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;->a()Z

    move-result v3

    if-nez v3, :cond_0

    :cond_c
    if-gez p0, :cond_d

    iget-object v3, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-virtual {v3}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_d
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_2

    :cond_e
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v1, v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->e:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v3, Lorg/apache/sanselan/formats/tiff/TiffField;->gf:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    if-eq v1, v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_3
.end method

.method private static b(I)Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffField;->o_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    array-length v1, v1

    if-lt v0, v1, :cond_0

    sget-object v0, Lorg/apache/sanselan/formats/tiff/TiffField;->n_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    :goto_1
    return-object v0

    :cond_0
    sget-object v1, Lorg/apache/sanselan/formats/tiff/TiffField;->o_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aget-object v1, v1, v0

    iget v2, v1, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->b:I

    if-ne v2, p0, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private e()Ljava/lang/String;
    .locals 7

    const/16 v6, 0x32

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->c()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    instance-of v2, v0, Ljava/util/Date;

    if-eqz v2, :cond_3

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/util/Date;

    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    instance-of v2, v0, [Ljava/lang/Object;

    if-eqz v2, :cond_7

    check-cast v0, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    :goto_1
    array-length v3, v0

    if-lt v1, v3, :cond_4

    :goto_2
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_4
    aget-object v3, v0, v1

    if-le v1, v6, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "... ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Lorg/apache/sanselan/ImageReadException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid value: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/apache/sanselan/ImageReadException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_5
    if-lez v1, :cond_6

    :try_start_1
    const-string v4, ", "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_7
    instance-of v2, v0, [I

    if-eqz v2, :cond_b

    check-cast v0, [I

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    :goto_3
    array-length v3, v0

    if-lt v1, v3, :cond_8

    :goto_4
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_8
    aget v3, v0, v1

    if-le v1, v6, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "... ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_4

    :cond_9
    if-lez v1, :cond_a

    const-string v4, ", "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_a
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_b
    instance-of v2, v0, [J

    if-eqz v2, :cond_f

    check-cast v0, [J

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    :goto_5
    array-length v3, v0

    if-lt v1, v3, :cond_c

    :goto_6
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_c
    aget-wide v4, v0, v1

    if-le v1, v6, :cond_d

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "... ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_6

    :cond_d
    if-lez v1, :cond_e

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_e
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_f
    instance-of v2, v0, [D

    if-eqz v2, :cond_13

    check-cast v0, [D

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    :goto_7
    array-length v3, v0

    if-lt v1, v3, :cond_10

    :goto_8
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_10
    aget-wide v4, v0, v1

    if-le v1, v6, :cond_11

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "... ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_8

    :cond_11
    if-lez v1, :cond_12

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_12
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_13
    instance-of v2, v0, [B

    if-eqz v2, :cond_17

    check-cast v0, [B

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    :goto_9
    array-length v3, v0

    if-lt v1, v3, :cond_14

    :goto_a
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_14
    aget-byte v3, v0, v1

    if-le v1, v6, :cond_15

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "... ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_a

    :cond_15
    if-lez v1, :cond_16

    const-string v4, ", "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_16
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_17
    instance-of v2, v0, [C

    if-eqz v2, :cond_1b

    check-cast v0, [C

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    :goto_b
    array-length v3, v0

    if-lt v1, v3, :cond_18

    :goto_c
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_18
    aget-char v3, v0, v1

    if-le v1, v6, :cond_19

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "... ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_c

    :cond_19
    if-lez v1, :cond_1a

    const-string v4, ", "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1a
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_1b
    instance-of v2, v0, [F

    if-eqz v2, :cond_1f

    check-cast v0, [F

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    :goto_d
    array-length v3, v0

    if-lt v1, v3, :cond_1c

    :goto_e
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_1c
    aget v3, v0, v1

    if-le v1, v6, :cond_1d

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "... ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_e

    :cond_1d
    if-lez v1, :cond_1e

    const-string v4, ", "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1e
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_1f
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Lorg/apache/sanselan/ImageReadException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto/16 :goto_0
.end method


# virtual methods
.method public final a()Lorg/apache/sanselan/formats/tiff/TiffElement;
    .locals 3

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->b:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v0, p0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->a(Lorg/apache/sanselan/formats/tiff/TiffField;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffField$OversizeValueElement;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->g:I

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->i:[B

    array-length v2, v2

    invoke-direct {v0, p0, v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffField$OversizeValueElement;-><init>(Lorg/apache/sanselan/formats/tiff/TiffField;II)V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 0

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->go:I

    return-void
.end method

.method public final a(Lorg/apache/sanselan/common/byteSources/ByteSource;)V
    .locals 2

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->b:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v0, p0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->a(Lorg/apache/sanselan/formats/tiff/TiffField;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->b:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->c:I

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->f:I

    mul-int/2addr v0, v1

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->g:I

    invoke-virtual {p1, v1, v0}, Lorg/apache/sanselan/common/byteSources/ByteSource;->b(II)[B

    move-result-object v0

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->i:[B

    goto :goto_0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, " (0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->a:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v1, v1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->a:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v0, p0}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a(Lorg/apache/sanselan/formats/tiff/TiffField;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final d()[I
    .locals 4

    const/4 v1, 0x0

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    new-array v2, v2, [I

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    aput v0, v2, v1

    move-object v0, v2

    :goto_0
    return-object v0

    :cond_0
    instance-of v2, v0, [Ljava/lang/Number;

    if-eqz v2, :cond_2

    check-cast v0, [Ljava/lang/Number;

    array-length v2, v0

    new-array v2, v2, [I

    :goto_1
    array-length v3, v0

    if-lt v1, v3, :cond_1

    move-object v0, v2

    goto :goto_0

    :cond_1
    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    instance-of v2, v0, [I

    if-eqz v2, :cond_4

    check-cast v0, [I

    array-length v2, v0

    new-array v2, v2, [I

    :goto_2
    array-length v3, v0

    if-lt v1, v3, :cond_3

    move-object v0, v2

    goto :goto_0

    :cond_3
    aget v3, v0, v1

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    new-instance v1, Lorg/apache/sanselan/ImageReadException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown value: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " for: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->a:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v2}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/apache/sanselan/ImageReadException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    iget v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " (0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->a:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lorg/apache/sanselan/formats/tiff/TiffField;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffField;->b:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget-object v2, v2, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
