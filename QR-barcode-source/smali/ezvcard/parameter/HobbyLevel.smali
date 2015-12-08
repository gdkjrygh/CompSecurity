.class public Lezvcard/parameter/HobbyLevel;
.super Lezvcard/parameter/VCardParameter;
.source "HobbyLevel.java"


# static fields
.field public static final HIGH:Lezvcard/parameter/HobbyLevel;

.field public static final LOW:Lezvcard/parameter/HobbyLevel;

.field public static final MEDIUM:Lezvcard/parameter/HobbyLevel;

.field private static final enums:Lezvcard/parameter/VCardParameterCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/VCardParameterCaseClasses",
            "<",
            "Lezvcard/parameter/HobbyLevel;",
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

    const-class v1, Lezvcard/parameter/HobbyLevel;

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameterCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/HobbyLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    .line 48
    new-instance v0, Lezvcard/parameter/HobbyLevel;

    const-string v1, "low"

    invoke-direct {v0, v1}, Lezvcard/parameter/HobbyLevel;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/HobbyLevel;->LOW:Lezvcard/parameter/HobbyLevel;

    .line 49
    new-instance v0, Lezvcard/parameter/HobbyLevel;

    const-string v1, "medium"

    invoke-direct {v0, v1}, Lezvcard/parameter/HobbyLevel;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/HobbyLevel;->MEDIUM:Lezvcard/parameter/HobbyLevel;

    .line 50
    new-instance v0, Lezvcard/parameter/HobbyLevel;

    const-string v1, "high"

    invoke-direct {v0, v1}, Lezvcard/parameter/HobbyLevel;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/HobbyLevel;->HIGH:Lezvcard/parameter/HobbyLevel;

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
            "Lezvcard/parameter/HobbyLevel;",
            ">;"
        }
    .end annotation

    .prologue
    .line 83
    sget-object v0, Lezvcard/parameter/HobbyLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameterCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/parameter/HobbyLevel;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 63
    sget-object v0, Lezvcard/parameter/HobbyLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/HobbyLevel;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/parameter/HobbyLevel;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 74
    sget-object v0, Lezvcard/parameter/HobbyLevel;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/HobbyLevel;

    return-object v0
.end method
