.class public Lezvcard/parameter/TelephoneType;
.super Lezvcard/parameter/VersionedVCardParameter;
.source "TelephoneType.java"


# static fields
.field public static final BBS:Lezvcard/parameter/TelephoneType;

.field public static final CAR:Lezvcard/parameter/TelephoneType;

.field public static final CELL:Lezvcard/parameter/TelephoneType;

.field public static final FAX:Lezvcard/parameter/TelephoneType;

.field public static final HOME:Lezvcard/parameter/TelephoneType;

.field public static final ISDN:Lezvcard/parameter/TelephoneType;

.field public static final MODEM:Lezvcard/parameter/TelephoneType;

.field public static final MSG:Lezvcard/parameter/TelephoneType;

.field public static final PAGER:Lezvcard/parameter/TelephoneType;

.field public static final PCS:Lezvcard/parameter/TelephoneType;

.field public static final PREF:Lezvcard/parameter/TelephoneType;

.field public static final TEXT:Lezvcard/parameter/TelephoneType;

.field public static final TEXTPHONE:Lezvcard/parameter/TelephoneType;

.field public static final VIDEO:Lezvcard/parameter/TelephoneType;

.field public static final VOICE:Lezvcard/parameter/TelephoneType;

.field public static final WORK:Lezvcard/parameter/TelephoneType;

.field private static final enums:Lezvcard/parameter/VCardParameterCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/VCardParameterCaseClasses",
            "<",
            "Lezvcard/parameter/TelephoneType;",
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
    new-instance v0, Lezvcard/parameter/VCardParameterCaseClasses;

    const-class v1, Lezvcard/parameter/TelephoneType;

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameterCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    .line 50
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "bbs"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->BBS:Lezvcard/parameter/TelephoneType;

    .line 55
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "car"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->CAR:Lezvcard/parameter/TelephoneType;

    .line 60
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "cell"

    new-array v2, v4, [Lezvcard/VCardVersion;

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->CELL:Lezvcard/parameter/TelephoneType;

    .line 65
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "fax"

    new-array v2, v4, [Lezvcard/VCardVersion;

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->FAX:Lezvcard/parameter/TelephoneType;

    .line 70
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "home"

    new-array v2, v4, [Lezvcard/VCardVersion;

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->HOME:Lezvcard/parameter/TelephoneType;

    .line 75
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "isdn"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->ISDN:Lezvcard/parameter/TelephoneType;

    .line 80
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "modem"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->MODEM:Lezvcard/parameter/TelephoneType;

    .line 85
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "msg"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->MSG:Lezvcard/parameter/TelephoneType;

    .line 90
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "pager"

    new-array v2, v4, [Lezvcard/VCardVersion;

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->PAGER:Lezvcard/parameter/TelephoneType;

    .line 95
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "pcs"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->PCS:Lezvcard/parameter/TelephoneType;

    .line 100
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "pref"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->PREF:Lezvcard/parameter/TelephoneType;

    .line 105
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "text"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->TEXT:Lezvcard/parameter/TelephoneType;

    .line 110
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "textphone"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->TEXTPHONE:Lezvcard/parameter/TelephoneType;

    .line 115
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "video"

    new-array v2, v4, [Lezvcard/VCardVersion;

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->VIDEO:Lezvcard/parameter/TelephoneType;

    .line 120
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "voice"

    new-array v2, v4, [Lezvcard/VCardVersion;

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->VOICE:Lezvcard/parameter/TelephoneType;

    .line 125
    new-instance v0, Lezvcard/parameter/TelephoneType;

    const-string v1, "work"

    new-array v2, v4, [Lezvcard/VCardVersion;

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/TelephoneType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/TelephoneType;->WORK:Lezvcard/parameter/TelephoneType;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "supportedVersions"    # [Lezvcard/VCardVersion;

    .prologue
    .line 128
    invoke-direct {p0, p1, p2}, Lezvcard/parameter/VersionedVCardParameter;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    .line 129
    return-void
.end method

.method public static all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/parameter/TelephoneType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 158
    sget-object v0, Lezvcard/parameter/TelephoneType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameterCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/parameter/TelephoneType;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 138
    sget-object v0, Lezvcard/parameter/TelephoneType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/TelephoneType;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/parameter/TelephoneType;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 149
    sget-object v0, Lezvcard/parameter/TelephoneType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/TelephoneType;

    return-object v0
.end method
