.class public Lezvcard/VCardDataType;
.super Ljava/lang/Object;
.source "VCardDataType.java"


# static fields
.field public static final BINARY:Lezvcard/VCardDataType;

.field public static final BOOLEAN:Lezvcard/VCardDataType;

.field public static final CONTENT_ID:Lezvcard/VCardDataType;

.field public static final DATE:Lezvcard/VCardDataType;

.field public static final DATE_AND_OR_TIME:Lezvcard/VCardDataType;

.field public static final DATE_TIME:Lezvcard/VCardDataType;

.field public static final FLOAT:Lezvcard/VCardDataType;

.field public static final INTEGER:Lezvcard/VCardDataType;

.field public static final LANGUAGE_TAG:Lezvcard/VCardDataType;

.field public static final TEXT:Lezvcard/VCardDataType;

.field public static final TIME:Lezvcard/VCardDataType;

.field public static final TIMESTAMP:Lezvcard/VCardDataType;

.field public static final URI:Lezvcard/VCardDataType;

.field public static final URL:Lezvcard/VCardDataType;

.field public static final UTC_OFFSET:Lezvcard/VCardDataType;

.field private static final enums:Lezvcard/util/CaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/util/CaseClasses",
            "<",
            "Lezvcard/VCardDataType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final name:Ljava/lang/String;

.field private final supportedVersions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lezvcard/VCardVersion;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 45
    new-instance v0, Lezvcard/VCardDataType$1;

    const-class v1, Lezvcard/VCardDataType;

    invoke-direct {v0, v1}, Lezvcard/VCardDataType$1;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/VCardDataType;->enums:Lezvcard/util/CaseClasses;

    .line 60
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "url"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->URL:Lezvcard/VCardDataType;

    .line 65
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "content-id"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->CONTENT_ID:Lezvcard/VCardDataType;

    .line 70
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "binary"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->BINARY:Lezvcard/VCardDataType;

    .line 75
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "uri"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    .line 80
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "text"

    new-array v2, v4, [Lezvcard/VCardVersion;

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    .line 85
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "date"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->DATE:Lezvcard/VCardDataType;

    .line 90
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "time"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->TIME:Lezvcard/VCardDataType;

    .line 95
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "date-time"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->DATE_TIME:Lezvcard/VCardDataType;

    .line 100
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "date-and-or-time"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->DATE_AND_OR_TIME:Lezvcard/VCardDataType;

    .line 105
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "timestamp"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->TIMESTAMP:Lezvcard/VCardDataType;

    .line 110
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "boolean"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->BOOLEAN:Lezvcard/VCardDataType;

    .line 115
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "integer"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->INTEGER:Lezvcard/VCardDataType;

    .line 120
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "float"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->FLOAT:Lezvcard/VCardDataType;

    .line 125
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "utc-offset"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->UTC_OFFSET:Lezvcard/VCardDataType;

    .line 130
    new-instance v0, Lezvcard/VCardDataType;

    const-string v1, "language-tag"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/VCardDataType;->LANGUAGE_TAG:Lezvcard/VCardDataType;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "supportedVersions"    # [Lezvcard/VCardVersion;

    .prologue
    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p1, p0, Lezvcard/VCardDataType;->name:Ljava/lang/String;

    .line 137
    array-length v1, p2

    if-nez v1, :cond_0

    .line 138
    invoke-static {}, Lezvcard/VCardVersion;->values()[Lezvcard/VCardVersion;

    move-result-object p2

    .line 141
    :cond_0
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v0

    .line 142
    .local v0, "set":Ljava/util/Set;, "Ljava/util/Set<Lezvcard/VCardVersion;>;"
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, p0, Lezvcard/VCardDataType;->supportedVersions:Ljava/util/Set;

    .line 143
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;[Lezvcard/VCardVersion;Lezvcard/VCardDataType$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # [Lezvcard/VCardVersion;
    .param p3, "x2"    # Lezvcard/VCardDataType$1;

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lezvcard/VCardDataType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    return-void
.end method

.method static synthetic access$100(Lezvcard/VCardDataType;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/VCardDataType;

    .prologue
    .line 44
    iget-object v0, p0, Lezvcard/VCardDataType;->name:Ljava/lang/String;

    return-object v0
.end method

.method public static all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/VCardDataType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 194
    sget-object v0, Lezvcard/VCardDataType;->enums:Lezvcard/util/CaseClasses;

    invoke-virtual {v0}, Lezvcard/util/CaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/VCardDataType;
    .locals 1
    .param p0, "dataType"    # Ljava/lang/String;

    .prologue
    .line 174
    sget-object v0, Lezvcard/VCardDataType;->enums:Lezvcard/util/CaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/util/CaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/VCardDataType;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/VCardDataType;
    .locals 1
    .param p0, "dataType"    # Ljava/lang/String;

    .prologue
    .line 185
    sget-object v0, Lezvcard/VCardDataType;->enums:Lezvcard/util/CaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/util/CaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/VCardDataType;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lezvcard/VCardDataType;->name:Ljava/lang/String;

    return-object v0
.end method

.method public isSupported(Lezvcard/VCardVersion;)Z
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 159
    iget-object v0, p0, Lezvcard/VCardDataType;->supportedVersions:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lezvcard/VCardDataType;->name:Ljava/lang/String;

    return-object v0
.end method
