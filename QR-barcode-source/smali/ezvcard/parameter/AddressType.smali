.class public Lezvcard/parameter/AddressType;
.super Lezvcard/parameter/VersionedVCardParameter;
.source "AddressType.java"


# static fields
.field public static final DOM:Lezvcard/parameter/AddressType;

.field public static final HOME:Lezvcard/parameter/AddressType;

.field public static final INTL:Lezvcard/parameter/AddressType;

.field public static final PARCEL:Lezvcard/parameter/AddressType;

.field public static final POSTAL:Lezvcard/parameter/AddressType;

.field public static final PREF:Lezvcard/parameter/AddressType;

.field public static final WORK:Lezvcard/parameter/AddressType;

.field private static final enums:Lezvcard/parameter/VCardParameterCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/VCardParameterCaseClasses",
            "<",
            "Lezvcard/parameter/AddressType;",
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

    .line 47
    new-instance v0, Lezvcard/parameter/VCardParameterCaseClasses;

    const-class v1, Lezvcard/parameter/AddressType;

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameterCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/AddressType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    .line 52
    new-instance v0, Lezvcard/parameter/AddressType;

    const-string v1, "home"

    new-array v2, v4, [Lezvcard/VCardVersion;

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/AddressType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/AddressType;->HOME:Lezvcard/parameter/AddressType;

    .line 57
    new-instance v0, Lezvcard/parameter/AddressType;

    const-string v1, "work"

    new-array v2, v4, [Lezvcard/VCardVersion;

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/AddressType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/AddressType;->WORK:Lezvcard/parameter/AddressType;

    .line 62
    new-instance v0, Lezvcard/parameter/AddressType;

    const-string v1, "dom"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/AddressType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/AddressType;->DOM:Lezvcard/parameter/AddressType;

    .line 67
    new-instance v0, Lezvcard/parameter/AddressType;

    const-string v1, "intl"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/AddressType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/AddressType;->INTL:Lezvcard/parameter/AddressType;

    .line 72
    new-instance v0, Lezvcard/parameter/AddressType;

    const-string v1, "postal"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/AddressType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/AddressType;->POSTAL:Lezvcard/parameter/AddressType;

    .line 77
    new-instance v0, Lezvcard/parameter/AddressType;

    const-string v1, "parcel"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/AddressType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/AddressType;->PARCEL:Lezvcard/parameter/AddressType;

    .line 82
    new-instance v0, Lezvcard/parameter/AddressType;

    const-string v1, "pref"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/AddressType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/AddressType;->PREF:Lezvcard/parameter/AddressType;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "supportedVersions"    # [Lezvcard/VCardVersion;

    .prologue
    .line 85
    invoke-direct {p0, p1, p2}, Lezvcard/parameter/VersionedVCardParameter;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    .line 86
    return-void
.end method

.method public static all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/parameter/AddressType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 115
    sget-object v0, Lezvcard/parameter/AddressType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameterCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/parameter/AddressType;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 95
    sget-object v0, Lezvcard/parameter/AddressType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/AddressType;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/parameter/AddressType;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 106
    sget-object v0, Lezvcard/parameter/AddressType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/AddressType;

    return-object v0
.end method
