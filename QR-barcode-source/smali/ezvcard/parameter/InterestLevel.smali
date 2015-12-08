.class public Lezvcard/parameter/InterestLevel;
.super Lezvcard/parameter/VCardParameter;
.source "InterestLevel.java"


# static fields
.field public static final HIGH:Lezvcard/parameter/InterestLevel;

.field public static final LOW:Lezvcard/parameter/InterestLevel;

.field public static final MEDIUM:Lezvcard/parameter/InterestLevel;

.field private static final enums:Lezvcard/parameter/VCardParameterCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/VCardParameterCaseClasses",
            "<",
            "Lezvcard/parameter/InterestLevel;",
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

    const-class v1, Lezvcard/parameter/InterestLevel;

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameterCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/InterestLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    .line 48
    new-instance v0, Lezvcard/parameter/InterestLevel;

    const-string v1, "low"

    invoke-direct {v0, v1}, Lezvcard/parameter/InterestLevel;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/InterestLevel;->LOW:Lezvcard/parameter/InterestLevel;

    .line 49
    new-instance v0, Lezvcard/parameter/InterestLevel;

    const-string v1, "medium"

    invoke-direct {v0, v1}, Lezvcard/parameter/InterestLevel;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/InterestLevel;->MEDIUM:Lezvcard/parameter/InterestLevel;

    .line 50
    new-instance v0, Lezvcard/parameter/InterestLevel;

    const-string v1, "high"

    invoke-direct {v0, v1}, Lezvcard/parameter/InterestLevel;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/InterestLevel;->HIGH:Lezvcard/parameter/InterestLevel;

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
            "Lezvcard/parameter/InterestLevel;",
            ">;"
        }
    .end annotation

    .prologue
    .line 83
    sget-object v0, Lezvcard/parameter/InterestLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameterCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/parameter/InterestLevel;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 63
    sget-object v0, Lezvcard/parameter/InterestLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/InterestLevel;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/parameter/InterestLevel;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 74
    sget-object v0, Lezvcard/parameter/InterestLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/InterestLevel;

    return-object v0
.end method
