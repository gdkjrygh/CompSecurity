.class public Lezvcard/parameter/EmailType;
.super Lezvcard/parameter/VersionedVCardParameter;
.source "EmailType.java"


# static fields
.field public static final AOL:Lezvcard/parameter/EmailType;

.field public static final APPLELINK:Lezvcard/parameter/EmailType;

.field public static final ATTMAIL:Lezvcard/parameter/EmailType;

.field public static final CIS:Lezvcard/parameter/EmailType;

.field public static final EWORLD:Lezvcard/parameter/EmailType;

.field public static final HOME:Lezvcard/parameter/EmailType;

.field public static final IBMMAIL:Lezvcard/parameter/EmailType;

.field public static final INTERNET:Lezvcard/parameter/EmailType;

.field public static final MCIMAIL:Lezvcard/parameter/EmailType;

.field public static final POWERSHARE:Lezvcard/parameter/EmailType;

.field public static final PREF:Lezvcard/parameter/EmailType;

.field public static final PRODIGY:Lezvcard/parameter/EmailType;

.field public static final TLX:Lezvcard/parameter/EmailType;

.field public static final WORK:Lezvcard/parameter/EmailType;

.field public static final X400:Lezvcard/parameter/EmailType;

.field private static final enums:Lezvcard/parameter/VCardParameterCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/VCardParameterCaseClasses",
            "<",
            "Lezvcard/parameter/EmailType;",
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

    const-class v1, Lezvcard/parameter/EmailType;

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameterCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/EmailType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    .line 50
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "internet"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->INTERNET:Lezvcard/parameter/EmailType;

    .line 55
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "x400"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->X400:Lezvcard/parameter/EmailType;

    .line 60
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "pref"

    new-array v2, v6, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->PREF:Lezvcard/parameter/EmailType;

    .line 65
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "aol"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->AOL:Lezvcard/parameter/EmailType;

    .line 70
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "applelink"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->APPLELINK:Lezvcard/parameter/EmailType;

    .line 75
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "attmail"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->ATTMAIL:Lezvcard/parameter/EmailType;

    .line 80
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "cis"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->CIS:Lezvcard/parameter/EmailType;

    .line 85
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "eworld"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->EWORLD:Lezvcard/parameter/EmailType;

    .line 90
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "ibmmail"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->IBMMAIL:Lezvcard/parameter/EmailType;

    .line 95
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "mcimail"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->MCIMAIL:Lezvcard/parameter/EmailType;

    .line 100
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "powershare"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->POWERSHARE:Lezvcard/parameter/EmailType;

    .line 105
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "prodigy"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->PRODIGY:Lezvcard/parameter/EmailType;

    .line 110
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "tlx"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->TLX:Lezvcard/parameter/EmailType;

    .line 115
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "home"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->HOME:Lezvcard/parameter/EmailType;

    .line 120
    new-instance v0, Lezvcard/parameter/EmailType;

    const-string v1, "work"

    new-array v2, v5, [Lezvcard/VCardVersion;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lezvcard/parameter/EmailType;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    sput-object v0, Lezvcard/parameter/EmailType;->WORK:Lezvcard/parameter/EmailType;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "supportedVersions"    # [Lezvcard/VCardVersion;

    .prologue
    .line 123
    invoke-direct {p0, p1, p2}, Lezvcard/parameter/VersionedVCardParameter;-><init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V

    .line 124
    return-void
.end method

.method public static all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/parameter/EmailType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 153
    sget-object v0, Lezvcard/parameter/EmailType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameterCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/parameter/EmailType;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 133
    sget-object v0, Lezvcard/parameter/EmailType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/EmailType;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/parameter/EmailType;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 144
    sget-object v0, Lezvcard/parameter/EmailType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/EmailType;

    return-object v0
.end method
