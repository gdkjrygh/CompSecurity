.class public Lezvcard/parameter/Encoding;
.super Lezvcard/parameter/VersionedVCardParameter;
.source "Encoding.java"


# static fields
.field public static final B:Lezvcard/parameter/Encoding;

.field public static final BASE64:Lezvcard/parameter/Encoding;

.field public static final QUOTED_PRINTABLE:Lezvcard/parameter/Encoding;

.field public static final _7BIT:Lezvcard/parameter/Encoding;

.field public static final _8BIT:Lezvcard/parameter/Encoding;

.field private static final enums:Lezvcard/parameter/VCardParameterCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/VCardParameterCaseClasses",
            "<",
            "Lezvcard/parameter/Encoding;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 73
    new-instance v0, Lezvcard/parameter/VCardParameterCaseClasses;

    const-class v1, Lezvcard/parameter/Encoding;

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameterCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/Encoding;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    .line 78
    new-instance v0, Lezvcard/parameter/Encoding;

    const-string v1, "quoted-printable"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/Encoding;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/Encoding;->QUOTED_PRINTABLE:Lezvcard/parameter/Encoding;

    .line 83
    new-instance v0, Lezvcard/parameter/Encoding;

    const-string v1, "base64"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/Encoding;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/Encoding;->BASE64:Lezvcard/parameter/Encoding;

    .line 88
    new-instance v0, Lezvcard/parameter/Encoding;

    const-string v1, "8bit"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/Encoding;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/Encoding;->_8BIT:Lezvcard/parameter/Encoding;

    .line 93
    new-instance v0, Lezvcard/parameter/Encoding;

    const-string v1, "7bit"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/Encoding;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/Encoding;->_7BIT:Lezvcard/parameter/Encoding;

    .line 98
    new-instance v0, Lezvcard/parameter/Encoding;

    const-string v1, "b"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/Encoding;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/Encoding;->B:Lezvcard/parameter/Encoding;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "supportedVersions"    # [Lezvcard/VCardVersion;

    .prologue
    .line 101
    invoke-direct {p0, p1, p2}, Lezvcard/parameter/VersionedVCardParameter;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    .line 102
    return-void
.end method

.method public static all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/parameter/Encoding;",
            ">;"
        }
    .end annotation

    .prologue
    .line 131
    sget-object v0, Lezvcard/parameter/Encoding;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameterCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/parameter/Encoding;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 111
    sget-object v0, Lezvcard/parameter/Encoding;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/Encoding;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/parameter/Encoding;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 122
    sget-object v0, Lezvcard/parameter/Encoding;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/Encoding;

    return-object v0
.end method
