.class public final enum Lezvcard/VCardVersion;
.super Ljava/lang/Enum;
.source "VCardVersion.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lezvcard/VCardVersion;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lezvcard/VCardVersion;

.field public static final enum V2_1:Lezvcard/VCardVersion;

.field public static final enum V3_0:Lezvcard/VCardVersion;

.field public static final enum V4_0:Lezvcard/VCardVersion;


# instance fields
.field private final version:Ljava/lang/String;

.field private final xmlNamespace:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 66
    new-instance v0, Lezvcard/VCardVersion;

    const-string v1, "V2_1"

    const-string v2, "2.1"

    invoke-direct {v0, v1, v4, v2, v3}, Lezvcard/VCardVersion;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    new-instance v0, Lezvcard/VCardVersion;

    const-string v1, "V3_0"

    const-string v2, "3.0"

    invoke-direct {v0, v1, v5, v2, v3}, Lezvcard/VCardVersion;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    new-instance v0, Lezvcard/VCardVersion;

    const-string v1, "V4_0"

    const-string v2, "4.0"

    const-string v3, "urn:ietf:params:xml:ns:vcard-4.0"

    invoke-direct {v0, v1, v6, v2, v3}, Lezvcard/VCardVersion;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    .line 65
    const/4 v0, 0x3

    new-array v0, v0, [Lezvcard/VCardVersion;

    sget-object v1, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v1, v0, v4

    sget-object v1, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v1, v0, v5

    sget-object v1, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v1, v0, v6

    sput-object v0, Lezvcard/VCardVersion;->$VALUES:[Lezvcard/VCardVersion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "xmlNamespace"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 74
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 75
    iput-object p3, p0, Lezvcard/VCardVersion;->version:Ljava/lang/String;

    .line 76
    iput-object p4, p0, Lezvcard/VCardVersion;->xmlNamespace:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lezvcard/VCardVersion;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 65
    const-class v0, Lezvcard/VCardVersion;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lezvcard/VCardVersion;

    return-object v0
.end method

.method public static valueOfByStr(Ljava/lang/String;)Lezvcard/VCardVersion;
    .locals 5
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 102
    invoke-static {}, Lezvcard/VCardVersion;->values()[Lezvcard/VCardVersion;

    move-result-object v0

    .local v0, "arr$":[Lezvcard/VCardVersion;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 103
    .local v3, "version":Lezvcard/VCardVersion;
    invoke-virtual {v3}, Lezvcard/VCardVersion;->getVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 107
    .end local v3    # "version":Lezvcard/VCardVersion;
    :goto_1
    return-object v3

    .line 102
    .restart local v3    # "version":Lezvcard/VCardVersion;
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 107
    .end local v3    # "version":Lezvcard/VCardVersion;
    :cond_1
    const/4 v3, 0x0

    goto :goto_1
.end method

.method public static valueOfByXmlNamespace(Ljava/lang/String;)Lezvcard/VCardVersion;
    .locals 6
    .param p0, "ns"    # Ljava/lang/String;

    .prologue
    .line 116
    invoke-static {}, Lezvcard/VCardVersion;->values()[Lezvcard/VCardVersion;

    move-result-object v0

    .local v0, "arr$":[Lezvcard/VCardVersion;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 117
    .local v3, "version":Lezvcard/VCardVersion;
    invoke-virtual {v3}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v4

    .line 118
    .local v4, "versionNs":Ljava/lang/String;
    if-eqz v4, :cond_0

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 122
    .end local v3    # "version":Lezvcard/VCardVersion;
    .end local v4    # "versionNs":Ljava/lang/String;
    :goto_1
    return-object v3

    .line 116
    .restart local v3    # "version":Lezvcard/VCardVersion;
    .restart local v4    # "versionNs":Ljava/lang/String;
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 122
    .end local v3    # "version":Lezvcard/VCardVersion;
    .end local v4    # "versionNs":Ljava/lang/String;
    :cond_1
    const/4 v3, 0x0

    goto :goto_1
.end method

.method public static values()[Lezvcard/VCardVersion;
    .locals 1

    .prologue
    .line 65
    sget-object v0, Lezvcard/VCardVersion;->$VALUES:[Lezvcard/VCardVersion;

    invoke-virtual {v0}, [Lezvcard/VCardVersion;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lezvcard/VCardVersion;

    return-object v0
.end method


# virtual methods
.method public getVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lezvcard/VCardVersion;->version:Ljava/lang/String;

    return-object v0
.end method

.method public getXmlNamespace()Ljava/lang/String;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lezvcard/VCardVersion;->xmlNamespace:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lezvcard/VCardVersion;->version:Ljava/lang/String;

    return-object v0
.end method
