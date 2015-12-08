.class public Lezvcard/parameter/ImppType;
.super Lezvcard/parameter/VCardParameter;
.source "ImppType.java"


# static fields
.field public static final BUSINESS:Lezvcard/parameter/ImppType;

.field public static final HOME:Lezvcard/parameter/ImppType;

.field public static final MOBILE:Lezvcard/parameter/ImppType;

.field public static final PERSONAL:Lezvcard/parameter/ImppType;

.field public static final PREF:Lezvcard/parameter/ImppType;

.field public static final WORK:Lezvcard/parameter/ImppType;

.field private static final enums:Lezvcard/parameter/VCardParameterCaseClasses;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/parameter/VCardParameterCaseClasses",
            "<",
            "Lezvcard/parameter/ImppType;",
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

    const-class v1, Lezvcard/parameter/ImppType;

    invoke-direct {v0, v1}, Lezvcard/parameter/VCardParameterCaseClasses;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lezvcard/parameter/ImppType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    .line 46
    new-instance v0, Lezvcard/parameter/ImppType;

    const-string v1, "personal"

    invoke-direct {v0, v1}, Lezvcard/parameter/ImppType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ImppType;->PERSONAL:Lezvcard/parameter/ImppType;

    .line 47
    new-instance v0, Lezvcard/parameter/ImppType;

    const-string v1, "business"

    invoke-direct {v0, v1}, Lezvcard/parameter/ImppType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ImppType;->BUSINESS:Lezvcard/parameter/ImppType;

    .line 48
    new-instance v0, Lezvcard/parameter/ImppType;

    const-string v1, "home"

    invoke-direct {v0, v1}, Lezvcard/parameter/ImppType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ImppType;->HOME:Lezvcard/parameter/ImppType;

    .line 49
    new-instance v0, Lezvcard/parameter/ImppType;

    const-string v1, "work"

    invoke-direct {v0, v1}, Lezvcard/parameter/ImppType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ImppType;->WORK:Lezvcard/parameter/ImppType;

    .line 50
    new-instance v0, Lezvcard/parameter/ImppType;

    const-string v1, "mobile"

    invoke-direct {v0, v1}, Lezvcard/parameter/ImppType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ImppType;->MOBILE:Lezvcard/parameter/ImppType;

    .line 51
    new-instance v0, Lezvcard/parameter/ImppType;

    const-string v1, "pref"

    invoke-direct {v0, v1}, Lezvcard/parameter/ImppType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lezvcard/parameter/ImppType;->PREF:Lezvcard/parameter/ImppType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 54
    invoke-direct {p0, p1}, Lezvcard/parameter/VCardParameter;-><init>(Ljava/lang/String;)V

    .line 55
    return-void
.end method

.method public static all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/parameter/ImppType;",
            ">;"
        }
    .end annotation

    .prologue
    .line 84
    sget-object v0, Lezvcard/parameter/ImppType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameterCaseClasses;->all()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public static find(Ljava/lang/String;)Lezvcard/parameter/ImppType;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 64
    sget-object v0, Lezvcard/parameter/ImppType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/ImppType;

    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lezvcard/parameter/ImppType;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 75
    sget-object v0, Lezvcard/parameter/ImppType;->enums:Lezvcard/parameter/VCardParameterCaseClasses;

    invoke-virtual {v0, p0}, Lezvcard/parameter/VCardParameterCaseClasses;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/parameter/ImppType;

    return-object v0
.end method
