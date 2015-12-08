.class public final Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field public final a:I

.field private final b:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x49

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->b:Ljava/util/ArrayList;

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a:I

    return-void
.end method

.method private a(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    const/4 v0, 0x0

    :cond_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    iget v2, v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a:I

    if-eq v2, p1, :cond_0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method private a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V
    .locals 2

    iget v0, p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a:I

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/apache/sanselan/ImageWriteException;

    const-string v1, "Output set already contains a directory of that type."

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method protected final a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;)Ljava/util/List;
    .locals 3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    return-object v2

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputSummary;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final b()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;-><init>(I)V

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V

    :cond_0
    const/4 v0, -0x2

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a(I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->d()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    move-result-object v0

    goto :goto_0
.end method

.method public final d()Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;
    .locals 2

    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    const/4 v1, -0x2

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;-><init>(I)V

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a(Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    const/4 v2, 0x0

    const-string v4, ""

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "TiffOutputSet {"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->c:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "byteOrder: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->c:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move v1, v2

    :goto_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "}"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->c:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "\tdirectory "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, ": "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, " ("

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v6, v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a:I

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, ")"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v3, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->c:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputDirectory;->a()Ljava/util/ArrayList;

    move-result-object v6

    move v3, v2

    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v3, v0, :cond_1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "\t\tfield "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ": "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v0, v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->b:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputSet;->c:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1
.end method
