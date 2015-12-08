.class public Lezvcard/property/Gender;
.super Lezvcard/property/VCardProperty;
.source "Gender.java"


# static fields
.field public static final FEMALE:Ljava/lang/String; = "F"

.field public static final MALE:Ljava/lang/String; = "M"

.field public static final NONE:Ljava/lang/String; = "N"

.field public static final OTHER:Ljava/lang/String; = "O"

.field public static final UNKNOWN:Ljava/lang/String; = "U"


# instance fields
.field private gender:Ljava/lang/String;

.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "gender"    # Ljava/lang/String;

    .prologue
    .line 92
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 93
    iput-object p1, p0, Lezvcard/property/Gender;->gender:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public static female()Lezvcard/property/Gender;
    .locals 2

    .prologue
    .line 188
    new-instance v0, Lezvcard/property/Gender;

    const-string v1, "F"

    invoke-direct {v0, v1}, Lezvcard/property/Gender;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static male()Lezvcard/property/Gender;
    .locals 2

    .prologue
    .line 180
    new-instance v0, Lezvcard/property/Gender;

    const-string v1, "M"

    invoke-direct {v0, v1}, Lezvcard/property/Gender;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static none()Lezvcard/property/Gender;
    .locals 2

    .prologue
    .line 205
    new-instance v0, Lezvcard/property/Gender;

    const-string v1, "N"

    invoke-direct {v0, v1}, Lezvcard/property/Gender;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static other()Lezvcard/property/Gender;
    .locals 2

    .prologue
    .line 196
    new-instance v0, Lezvcard/property/Gender;

    const-string v1, "O"

    invoke-direct {v0, v1}, Lezvcard/property/Gender;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static unknown()Lezvcard/property/Gender;
    .locals 2

    .prologue
    .line 213
    new-instance v0, Lezvcard/property/Gender;

    const-string v1, "U"

    invoke-direct {v0, v1}, Lezvcard/property/Gender;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public _supportedVersions()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lezvcard/VCardVersion;",
            ">;"
        }
    .end annotation

    .prologue
    .line 98
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method protected _validate(Ljava/util/List;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 1
    .param p2, "version"    # Lezvcard/VCardVersion;
    .param p3, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/VCard;",
            ")V"
        }
    .end annotation

    .prologue
    .line 218
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v0, p0, Lezvcard/property/Gender;->gender:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 219
    const-string v0, "Property value is null."

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    :cond_0
    return-void
.end method

.method public getGender()Ljava/lang/String;
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lezvcard/property/Gender;->gender:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lezvcard/property/Gender;->text:Ljava/lang/String;

    return-object v0
.end method

.method public isFemale()Z
    .locals 2

    .prologue
    .line 147
    const-string v0, "F"

    iget-object v1, p0, Lezvcard/property/Gender;->gender:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isMale()Z
    .locals 2

    .prologue
    .line 139
    const-string v0, "M"

    iget-object v1, p0, Lezvcard/property/Gender;->gender:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isNone()Z
    .locals 2

    .prologue
    .line 164
    const-string v0, "N"

    iget-object v1, p0, Lezvcard/property/Gender;->gender:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isOther()Z
    .locals 2

    .prologue
    .line 155
    const-string v0, "O"

    iget-object v1, p0, Lezvcard/property/Gender;->gender:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isUnknown()Z
    .locals 2

    .prologue
    .line 172
    const-string v0, "U"

    iget-object v1, p0, Lezvcard/property/Gender;->gender:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public setGender(Ljava/lang/String;)V
    .locals 0
    .param p1, "gender"    # Ljava/lang/String;

    .prologue
    .line 131
    iput-object p1, p0, Lezvcard/property/Gender;->gender:Ljava/lang/String;

    .line 132
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 114
    iput-object p1, p0, Lezvcard/property/Gender;->text:Ljava/lang/String;

    .line 115
    return-void
.end method
