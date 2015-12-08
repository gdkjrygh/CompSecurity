.class public Lezvcard/parameter/ImageType;
.super Lezvcard/parameter/MediaTypeParameter;
.source "ImageType.java"


# static fields
.field public static final GIF:Lezvcard/parameter/ImageType;

.field public static final JPEG:Lezvcard/parameter/ImageType;

.field public static final PNG:Lezvcard/parameter/ImageType;

.field private static final enums:Lezvcard/parameter/MediaTypeCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/MediaTypeCaseClasses",
            "<",
            "Lezvcard/parameter/ImageType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 76
    new-instance v0, Lezvcard/parameter/MediaTypeCaseClasses;

    const-class v1, Lezvcard/parameter/ImageType;

    invoke-direct {v0, v1}, Lezvcard/parameter/MediaTypeCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/ImageType;->enums:Lezvcard/parameter/MediaTypeCaseClasses;

    .line 78
    new-instance v0, Lezvcard/parameter/ImageType;

    const-string v1, "GIF"

    const-string v2, "image/gif"

    const-string v3, "gif"

    invoke-direct {v0, v1, v2, v3}, Lezvcard/parameter/ImageType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ImageType;->GIF:Lezvcard/parameter/ImageType;

    .line 79
    new-instance v0, Lezvcard/parameter/ImageType;

    const-string v1, "JPEG"

    const-string v2, "image/jpeg"

    const-string v3, "jpg"

    invoke-direct {v0, v1, v2, v3}, Lezvcard/parameter/ImageType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ImageType;->JPEG:Lezvcard/parameter/ImageType;

    .line 80
    new-instance v0, Lezvcard/parameter/ImageType;

    const-string v1, "PNG"

    const-string v2, "image/png"

    const-string v3, "png"

    invoke-direct {v0, v1, v2, v3}, Lezvcard/parameter/ImageType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ImageType;->PNG:Lezvcard/parameter/ImageType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "mediaType"    # Ljava/lang/String;
    .param p3, "extension"    # Ljava/lang/String;

    .prologue
    .line 83
    invoke-direct {p0, p1, p2, p3}, Lezvcard/parameter/MediaTypeParameter;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    return-void
.end method

.method public static all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/parameter/ImageType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 123
    sget-object v0, Lezvcard/parameter/ImageType;->enums:Lezvcard/parameter/MediaTypeCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/MediaTypeCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lezvcard/parameter/ImageType;
    .locals 3
    .param p0, "type"    # Ljava/lang/String;
    .param p1, "mediaType"    # Ljava/lang/String;
    .param p2, "extension"    # Ljava/lang/String;

    .prologue
    .line 98
    sget-object v0, Lezvcard/parameter/ImageType;->enums:Lezvcard/parameter/MediaTypeCaseClasses;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-virtual {v0, v1}, Lezvcard/parameter/MediaTypeCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/ImageType;

    return-object v0
.end method

.method public static get(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lezvcard/parameter/ImageType;
    .locals 3
    .param p0, "type"    # Ljava/lang/String;
    .param p1, "mediaType"    # Ljava/lang/String;
    .param p2, "extension"    # Ljava/lang/String;

    .prologue
    .line 114
    sget-object v0, Lezvcard/parameter/ImageType;->enums:Lezvcard/parameter/MediaTypeCaseClasses;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-virtual {v0, v1}, Lezvcard/parameter/MediaTypeCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/ImageType;

    return-object v0
.end method
