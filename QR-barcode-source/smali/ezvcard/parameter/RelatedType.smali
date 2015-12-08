.class public Lezvcard/parameter/RelatedType;
.super Lezvcard/parameter/VCardParameter;
.source "RelatedType.java"


# static fields
.field public static final ACQUAINTANCE:Lezvcard/parameter/RelatedType;

.field public static final AGENT:Lezvcard/parameter/RelatedType;

.field public static final CHILD:Lezvcard/parameter/RelatedType;

.field public static final COLLEAGUE:Lezvcard/parameter/RelatedType;

.field public static final CONTACT:Lezvcard/parameter/RelatedType;

.field public static final CO_RESIDENT:Lezvcard/parameter/RelatedType;

.field public static final CO_WORKER:Lezvcard/parameter/RelatedType;

.field public static final CRUSH:Lezvcard/parameter/RelatedType;

.field public static final DATE:Lezvcard/parameter/RelatedType;

.field public static final EMERGENCY:Lezvcard/parameter/RelatedType;

.field public static final FRIEND:Lezvcard/parameter/RelatedType;

.field public static final KIN:Lezvcard/parameter/RelatedType;

.field public static final ME:Lezvcard/parameter/RelatedType;

.field public static final MET:Lezvcard/parameter/RelatedType;

.field public static final MUSE:Lezvcard/parameter/RelatedType;

.field public static final NEIGHBOR:Lezvcard/parameter/RelatedType;

.field public static final PARENT:Lezvcard/parameter/RelatedType;

.field public static final SIBLING:Lezvcard/parameter/RelatedType;

.field public static final SPOUSE:Lezvcard/parameter/RelatedType;

.field public static final SWEETHEART:Lezvcard/parameter/RelatedType;

.field private static final enums:Lezvcard/parameter/VCardParameterCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/VCardParameterCaseClasses",
            "<",
            "Lezvcard/parameter/RelatedType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 44
    new-instance v0, Lezvcard/parameter/VCardParameterCaseClasses;

    const-class v1, Lezvcard/parameter/RelatedType;

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameterCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    .line 46
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "acquaintance"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->ACQUAINTANCE:Lezvcard/parameter/RelatedType;

    .line 47
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "agent"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->AGENT:Lezvcard/parameter/RelatedType;

    .line 48
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "child"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->CHILD:Lezvcard/parameter/RelatedType;

    .line 49
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "co-resident"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->CO_RESIDENT:Lezvcard/parameter/RelatedType;

    .line 50
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "co-worker"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->CO_WORKER:Lezvcard/parameter/RelatedType;

    .line 51
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "colleague"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->COLLEAGUE:Lezvcard/parameter/RelatedType;

    .line 52
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "contact"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->CONTACT:Lezvcard/parameter/RelatedType;

    .line 53
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "crush"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->CRUSH:Lezvcard/parameter/RelatedType;

    .line 54
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "date"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->DATE:Lezvcard/parameter/RelatedType;

    .line 55
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "emergency"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->EMERGENCY:Lezvcard/parameter/RelatedType;

    .line 56
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "friend"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->FRIEND:Lezvcard/parameter/RelatedType;

    .line 57
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "kin"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->KIN:Lezvcard/parameter/RelatedType;

    .line 58
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "me"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->ME:Lezvcard/parameter/RelatedType;

    .line 59
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "met"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->MET:Lezvcard/parameter/RelatedType;

    .line 60
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "muse"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->MUSE:Lezvcard/parameter/RelatedType;

    .line 61
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "neighbor"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->NEIGHBOR:Lezvcard/parameter/RelatedType;

    .line 62
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "parent"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->PARENT:Lezvcard/parameter/RelatedType;

    .line 63
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "sibling"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->SIBLING:Lezvcard/parameter/RelatedType;

    .line 64
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "spouse"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->SPOUSE:Lezvcard/parameter/RelatedType;

    .line 65
    new-instance v0, Lezvcard/parameter/RelatedType;

    const-string v1, "sweetheart"

    invoke-direct {v0, v1}, Lezvcard/parameter/RelatedType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/RelatedType;->SWEETHEART:Lezvcard/parameter/RelatedType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lezvcard/parameter/VCardParameter;-><init>(Ljava/lang/String;)V

    .line 69
    return-void
.end method

.method public static all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/parameter/RelatedType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 98
    sget-object v0, Lezvcard/parameter/RelatedType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameterCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/parameter/RelatedType;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 78
    sget-object v0, Lezvcard/parameter/RelatedType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/RelatedType;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/parameter/RelatedType;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 89
    sget-object v0, Lezvcard/parameter/RelatedType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/RelatedType;

    return-object v0
.end method
