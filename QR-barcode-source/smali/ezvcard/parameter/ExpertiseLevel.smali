.class public Lezvcard/parameter/ExpertiseLevel;
.super Lezvcard/parameter/VCardParameter;
.source "ExpertiseLevel.java"


# static fields
.field public static final AVERAGE:Lezvcard/parameter/ExpertiseLevel;

.field public static final BEGINNER:Lezvcard/parameter/ExpertiseLevel;

.field public static final EXPERT:Lezvcard/parameter/ExpertiseLevel;

.field private static final enums:Lezvcard/parameter/VCardParameterCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/VCardParameterCaseClasses",
            "<",
            "Lezvcard/parameter/ExpertiseLevel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 46
    new-instance v0, Lezvcard/parameter/VCardParameterCaseClasses;

    const-class v1, Lezvcard/parameter/ExpertiseLevel;

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameterCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/ExpertiseLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    .line 48
    new-instance v0, Lezvcard/parameter/ExpertiseLevel;

    const-string v1, "beginner"

    invoke-direct {v0, v1}, Lezvcard/parameter/ExpertiseLevel;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ExpertiseLevel;->BEGINNER:Lezvcard/parameter/ExpertiseLevel;

    .line 49
    new-instance v0, Lezvcard/parameter/ExpertiseLevel;

    const-string v1, "average"

    invoke-direct {v0, v1}, Lezvcard/parameter/ExpertiseLevel;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ExpertiseLevel;->AVERAGE:Lezvcard/parameter/ExpertiseLevel;

    .line 50
    new-instance v0, Lezvcard/parameter/ExpertiseLevel;

    const-string v1, "expert"

    invoke-direct {v0, v1}, Lezvcard/parameter/ExpertiseLevel;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ExpertiseLevel;->EXPERT:Lezvcard/parameter/ExpertiseLevel;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lezvcard/parameter/VCardParameter;-><init>(Ljava/lang/String;)V

    .line 54
    return-void
.end method

.method public static all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/parameter/ExpertiseLevel;",
            ">;"
        }
    .end annotation

    .prologue
    .line 83
    sget-object v0, Lezvcard/parameter/ExpertiseLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameterCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/parameter/ExpertiseLevel;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 63
    sget-object v0, Lezvcard/parameter/ExpertiseLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/ExpertiseLevel;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/parameter/ExpertiseLevel;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 74
    sget-object v0, Lezvcard/parameter/ExpertiseLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/ExpertiseLevel;

    return-object v0
.end method
