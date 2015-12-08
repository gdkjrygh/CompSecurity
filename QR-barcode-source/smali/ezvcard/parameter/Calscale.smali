.class public Lezvcard/parameter/Calscale;
.super Lezvcard/parameter/VCardParameter;
.source "Calscale.java"


# static fields
.field public static final GREGORIAN:Lezvcard/parameter/Calscale;

.field private static final enums:Lezvcard/parameter/VCardParameterCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/VCardParameterCaseClasses",
            "<",
            "Lezvcard/parameter/Calscale;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 42
    new-instance v0, Lezvcard/parameter/VCardParameterCaseClasses;

    const-class v1, Lezvcard/parameter/Calscale;

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameterCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/Calscale;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    .line 44
    new-instance v0, Lezvcard/parameter/Calscale;

    const-string v1, "gregorian"

    invoke-direct {v0, v1}, Lezvcard/parameter/Calscale;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/Calscale;->GREGORIAN:Lezvcard/parameter/Calscale;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lezvcard/parameter/VCardParameter;-><init>(Ljava/lang/String;)V

    .line 48
    return-void
.end method

.method public static all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/parameter/Calscale;",
            ">;"
        }
    .end annotation

    .prologue
    .line 77
    sget-object v0, Lezvcard/parameter/Calscale;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameterCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/parameter/Calscale;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 57
    sget-object v0, Lezvcard/parameter/Calscale;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/Calscale;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/parameter/Calscale;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 68
    sget-object v0, Lezvcard/parameter/Calscale;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/Calscale;

    return-object v0
.end method
