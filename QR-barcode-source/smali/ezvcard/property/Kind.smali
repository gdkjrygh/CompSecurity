.class public Lezvcard/property/Kind;
.super Lezvcard/property/TextProperty;
.source "Kind.java"


# static fields
.field public static final APPLICATION:Ljava/lang/String; = "application"

.field public static final DEVICE:Ljava/lang/String; = "device"

.field public static final GROUP:Ljava/lang/String; = "group"

.field public static final INDIVIDUAL:Ljava/lang/String; = "individual"

.field public static final LOCATION:Ljava/lang/String; = "location"

.field public static final ORG:Ljava/lang/String; = "org"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "kind"    # Ljava/lang/String;

    .prologue
    .line 92
    invoke-direct {p0, p1}, Lezvcard/property/TextProperty;-><init>(Ljava/lang/String;)V

    .line 93
    return-void
.end method

.method public static application()Lezvcard/property/Kind;
    .locals 2

    .prologue
    .line 188
    new-instance v0, Lezvcard/property/Kind;

    const-string v1, "application"

    invoke-direct {v0, v1}, Lezvcard/property/Kind;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static device()Lezvcard/property/Kind;
    .locals 2

    .prologue
    .line 197
    new-instance v0, Lezvcard/property/Kind;

    const-string v1, "device"

    invoke-direct {v0, v1}, Lezvcard/property/Kind;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static group()Lezvcard/property/Kind;
    .locals 2

    .prologue
    .line 163
    new-instance v0, Lezvcard/property/Kind;

    const-string v1, "group"

    invoke-direct {v0, v1}, Lezvcard/property/Kind;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static individual()Lezvcard/property/Kind;
    .locals 2

    .prologue
    .line 155
    new-instance v0, Lezvcard/property/Kind;

    const-string v1, "individual"

    invoke-direct {v0, v1}, Lezvcard/property/Kind;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static location()Lezvcard/property/Kind;
    .locals 2

    .prologue
    .line 179
    new-instance v0, Lezvcard/property/Kind;

    const-string v1, "location"

    invoke-direct {v0, v1}, Lezvcard/property/Kind;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static org()Lezvcard/property/Kind;
    .locals 2

    .prologue
    .line 171
    new-instance v0, Lezvcard/property/Kind;

    const-string v1, "org"

    invoke-direct {v0, v1}, Lezvcard/property/Kind;-><init>(Ljava/lang/String;)V

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
    .line 97
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method public isApplication()Z
    .locals 2

    .prologue
    .line 138
    const-string v0, "application"

    iget-object v1, p0, Lezvcard/property/Kind;->value:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isDevice()Z
    .locals 2

    .prologue
    .line 147
    const-string v0, "device"

    iget-object v1, p0, Lezvcard/property/Kind;->value:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isGroup()Z
    .locals 2

    .prologue
    .line 113
    const-string v0, "group"

    iget-object v1, p0, Lezvcard/property/Kind;->value:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isIndividual()Z
    .locals 2

    .prologue
    .line 105
    const-string v0, "individual"

    iget-object v1, p0, Lezvcard/property/Kind;->value:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isLocation()Z
    .locals 2

    .prologue
    .line 129
    const-string v0, "location"

    iget-object v1, p0, Lezvcard/property/Kind;->value:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isOrg()Z
    .locals 2

    .prologue
    .line 121
    const-string v0, "org"

    iget-object v1, p0, Lezvcard/property/Kind;->value:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
