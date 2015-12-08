.class public Lezvcard/parameter/VersionedVCardParameter;
.super Lezvcard/parameter/VCardParameter;
.source "VersionedVCardParameter.java"


# instance fields
.field protected final supportedVersions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lezvcard/VCardVersion;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;[Lezvcard/VCardVersion;)V
    .locals 2
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "supportedVersions"    # [Lezvcard/VCardVersion;

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lezvcard/parameter/VCardParameter;-><init>(Ljava/lang/String;)V

    .line 49
    array-length v1, p2

    if-nez v1, :cond_0

    .line 50
    invoke-static {}, Lezvcard/VCardVersion;->values()[Lezvcard/VCardVersion;

    move-result-object p2

    .line 53
    :cond_0
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v0

    .line 54
    .local v0, "set":Ljava/util/Set;, "Ljava/util/Set<Lezvcard/VCardVersion;>;"
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, p0, Lezvcard/parameter/VersionedVCardParameter;->supportedVersions:Ljava/util/Set;

    .line 55
    return-void
.end method


# virtual methods
.method public isSupported(Lezvcard/VCardVersion;)Z
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 64
    iget-object v0, p0, Lezvcard/parameter/VersionedVCardParameter;->supportedVersions:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
