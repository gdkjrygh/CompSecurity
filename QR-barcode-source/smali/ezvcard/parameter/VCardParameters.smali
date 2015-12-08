.class public Lezvcard/parameter/VCardParameters;
.super Lezvcard/util/ListMultimap;
.source "VCardParameters.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/util/ListMultimap",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field public static final ALTID:Ljava/lang/String; = "ALTID"

.field public static final CALSCALE:Ljava/lang/String; = "CALSCALE"

.field public static final CHARSET:Ljava/lang/String; = "CHARSET"

.field public static final ENCODING:Ljava/lang/String; = "ENCODING"

.field public static final GEO:Ljava/lang/String; = "GEO"

.field public static final INDEX:Ljava/lang/String; = "INDEX"

.field public static final LABEL:Ljava/lang/String; = "LABEL"

.field public static final LANGUAGE:Ljava/lang/String; = "LANGUAGE"

.field public static final LEVEL:Ljava/lang/String; = "LEVEL"

.field public static final MEDIATYPE:Ljava/lang/String; = "MEDIATYPE"

.field public static final PID:Ljava/lang/String; = "PID"

.field public static final PREF:Ljava/lang/String; = "PREF"

.field public static final SORT_AS:Ljava/lang/String; = "SORT-AS"

.field public static final TYPE:Ljava/lang/String; = "TYPE"

.field public static final TZ:Ljava/lang/String; = "TZ"

.field public static final VALUE:Ljava/lang/String; = "VALUE"

.field private static final supportedVersions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Lezvcard/VCardVersion;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 73
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 74
    .local v0, "m":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<Lezvcard/VCardVersion;>;>;"
    const-string v1, "ALTID"

    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const-string v1, "CALSCALE"

    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    const-string v1, "CHARSET"

    sget-object v2, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    const-string v1, "GEO"

    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    const-string v1, "INDEX"

    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    const-string v1, "LEVEL"

    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    const-string v1, "MEDIATYPE"

    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    const-string v1, "PID"

    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    const-string v1, "SORT-AS"

    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    const-string v1, "TZ"

    sget-object v2, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lezvcard/parameter/VCardParameters;->supportedVersions:Ljava/util/Map;

    .line 94
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 99
    invoke-direct {p0}, Lezvcard/util/ListMultimap;-><init>()V

    .line 101
    return-void
.end method

.method public constructor <init>(Lezvcard/parameter/VCardParameters;)V
    .locals 0
    .param p1, "orig"    # Lezvcard/parameter/VCardParameters;

    .prologue
    .line 108
    invoke-direct {p0, p1}, Lezvcard/util/ListMultimap;-><init>(Lezvcard/util/ListMultimap;)V

    .line 109
    return-void
.end method


# virtual methods
.method public addPid(I)V
    .locals 3
    .param p1, "localId"    # I

    .prologue
    .line 686
    const-string v0, "PID"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 687
    return-void
.end method

.method public addPid(II)V
    .locals 3
    .param p1, "localId"    # I
    .param p2, "clientPidMapRef"    # I

    .prologue
    .line 709
    const-string v0, "PID"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 710
    return-void
.end method

.method public addType(Ljava/lang/String;)V
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 311
    const-string v0, "TYPE"

    invoke-virtual {p0, v0, p1}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 312
    return-void
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 478
    const-string v0, "ALTID"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCalscale()Lezvcard/parameter/Calscale;
    .locals 2

    .prologue
    .line 613
    const-string v1, "CALSCALE"

    invoke-virtual {p0, v1}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 614
    .local v0, "value":Ljava/lang/String;
    if-nez v0, :cond_0

    const/4 v1, 0x0

    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lezvcard/parameter/Calscale;->get(Ljava/lang/String;)Lezvcard/parameter/Calscale;

    move-result-object v1

    goto :goto_0
.end method

.method public getCharset()Ljava/lang/String;
    .locals 1

    .prologue
    .line 192
    const-string v0, "CHARSET"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getEncoding()Lezvcard/parameter/Encoding;
    .locals 2

    .prologue
    .line 122
    const-string v1, "ENCODING"

    invoke-virtual {p0, v1}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 123
    .local v0, "value":Ljava/lang/String;
    if-nez v0, :cond_0

    const/4 v1, 0x0

    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lezvcard/parameter/Encoding;->get(Ljava/lang/String;)Lezvcard/parameter/Encoding;

    move-result-object v1

    goto :goto_0
.end method

.method public getGeo()[D
    .locals 8

    .prologue
    .line 530
    const-string v3, "GEO"

    invoke-virtual {p0, v3}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 531
    .local v2, "value":Ljava/lang/String;
    if-nez v2, :cond_0

    .line 532
    const/4 v3, 0x0

    .line 537
    :goto_0
    return-object v3

    .line 536
    :cond_0
    :try_start_0
    invoke-static {v2}, Lezvcard/util/GeoUri;->parse(Ljava/lang/String;)Lezvcard/util/GeoUri;

    move-result-object v1

    .line 537
    .local v1, "geoUri":Lezvcard/util/GeoUri;
    const/4 v3, 0x2

    new-array v3, v3, [D

    const/4 v4, 0x0

    invoke-virtual {v1}, Lezvcard/util/GeoUri;->getCoordA()Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    aput-wide v6, v3, v4

    const/4 v4, 0x1

    invoke-virtual {v1}, Lezvcard/util/GeoUri;->getCoordB()Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    aput-wide v6, v3, v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 538
    .end local v1    # "geoUri":Lezvcard/util/GeoUri;
    :catch_0
    move-exception v0

    .line 539
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "GEO parameter value is malformed and could not be parsed. Retrieve its raw text value instead."

    invoke-direct {v3, v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
.end method

.method public getIndex()Ljava/lang/Integer;
    .locals 4

    .prologue
    .line 802
    const-string v2, "INDEX"

    invoke-virtual {p0, v2}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 803
    .local v1, "index":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 804
    const/4 v2, 0x0

    .line 808
    :goto_0
    return-object v2

    :cond_0
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 809
    :catch_0
    move-exception v0

    .line 810
    .local v0, "e":Ljava/lang/NumberFormatException;
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "INDEX parameter value is malformed and could not be parsed. Retrieve its raw text value instead."

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 246
    const-string v0, "LABEL"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 219
    const-string v0, "LANGUAGE"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getLevel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 766
    const-string v0, "LEVEL"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMediaType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 736
    const-string v0, "MEDIATYPE"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPids()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<[",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v10, 0x1

    .line 653
    const-string v8, "PID"

    invoke-virtual {p0, v8}, Lezvcard/parameter/VCardParameters;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 654
    .local v7, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 655
    .local v4, "pids":Ljava/util/List;, "Ljava/util/List<[Ljava/lang/Integer;>;"
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 656
    .local v6, "value":Ljava/lang/String;
    const-string v8, "\\."

    invoke-virtual {v6, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 658
    .local v5, "split":[Ljava/lang/String;
    const/4 v8, 0x0

    :try_start_0
    aget-object v8, v5, v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    .line 659
    .local v3, "localId":Ljava/lang/Integer;
    array-length v8, v5

    if-le v8, v10, :cond_0

    const/4 v8, 0x1

    aget-object v8, v5, v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    .line 660
    .local v0, "clientPidMapRef":Ljava/lang/Integer;
    :goto_1
    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Integer;

    const/4 v9, 0x0

    aput-object v3, v8, v9

    const/4 v9, 0x1

    aput-object v0, v8, v9

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 661
    .end local v0    # "clientPidMapRef":Ljava/lang/Integer;
    .end local v3    # "localId":Ljava/lang/Integer;
    :catch_0
    move-exception v1

    .line 662
    .local v1, "e":Ljava/lang/NumberFormatException;
    new-instance v8, Ljava/lang/IllegalStateException;

    const-string v9, "PID parameter value is malformed and could not be parsed. Retrieve its raw text value instead."

    invoke-direct {v8, v9, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v8

    .line 659
    .end local v1    # "e":Ljava/lang/NumberFormatException;
    .restart local v3    # "localId":Ljava/lang/Integer;
    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 665
    .end local v3    # "localId":Ljava/lang/Integer;
    .end local v5    # "split":[Ljava/lang/String;
    .end local v6    # "value":Ljava/lang/String;
    :cond_1
    return-object v4
.end method

.method public getPref()Ljava/lang/Integer;
    .locals 4

    .prologue
    .line 398
    const-string v2, "PREF"

    invoke-virtual {p0, v2}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 399
    .local v1, "pref":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 400
    const/4 v2, 0x0

    .line 404
    :goto_0
    return-object v2

    :cond_0
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 405
    :catch_0
    move-exception v0

    .line 406
    .local v0, "e":Ljava/lang/NumberFormatException;
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "PREF parameter value is malformed and could not be parsed. Retrieve its raw text value instead."

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public getSortAs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 576
    const-string v0, "SORT-AS"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTimezone()Ljava/lang/String;
    .locals 1

    .prologue
    .line 272
    const-string v0, "TZ"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 2

    .prologue
    .line 324
    invoke-virtual {p0}, Lezvcard/parameter/VCardParameters;->getTypes()Ljava/util/Set;

    move-result-object v0

    .line 325
    .local v0, "types":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    return-object v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_0
.end method

.method public getTypes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 298
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "TYPE"

    invoke-virtual {p0, v1}, Lezvcard/parameter/VCardParameters;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getValue()Lezvcard/VCardDataType;
    .locals 2

    .prologue
    .line 151
    const-string v1, "VALUE"

    invoke-virtual {p0, v1}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 152
    .local v0, "value":Ljava/lang/String;
    if-nez v0, :cond_0

    const/4 v1, 0x0

    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lezvcard/VCardDataType;->get(Ljava/lang/String;)Lezvcard/VCardDataType;

    move-result-object v1

    goto :goto_0
.end method

.method public removePids()V
    .locals 1

    .prologue
    .line 721
    const-string v0, "PID"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->removeAll(Ljava/lang/Object;)Ljava/util/List;

    .line 722
    return-void
.end method

.method public removeType(Ljava/lang/String;)V
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 351
    const-string v0, "TYPE"

    invoke-virtual {p0, v0, p1}, Lezvcard/parameter/VCardParameters;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    return-void
.end method

.method public removeTypes()V
    .locals 1

    .prologue
    .line 363
    const-string v0, "TYPE"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->removeAll(Ljava/lang/Object;)Ljava/util/List;

    .line 364
    return-void
.end method

.method public removeValue()V
    .locals 1

    .prologue
    .line 179
    const-string v0, "VALUE"

    invoke-virtual {p0, v0}, Lezvcard/parameter/VCardParameters;->removeAll(Ljava/lang/Object;)Ljava/util/List;

    .line 180
    return-void
.end method

.method protected bridge synthetic sanitizeKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 53
    check-cast p1, Ljava/lang/String;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lezvcard/parameter/VCardParameters;->sanitizeKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected sanitizeKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 921
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 512
    const-string v0, "ALTID"

    invoke-virtual {p0, v0, p1}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 513
    return-void
.end method

.method public setCalscale(Lezvcard/parameter/Calscale;)V
    .locals 2
    .param p1, "value"    # Lezvcard/parameter/Calscale;

    .prologue
    .line 628
    const-string v1, "CALSCALE"

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v1, v0}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 629
    return-void

    .line 628
    :cond_0
    invoke-virtual {p1}, Lezvcard/parameter/Calscale;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public setCharset(Ljava/lang/String;)V
    .locals 1
    .param p1, "charset"    # Ljava/lang/String;

    .prologue
    .line 205
    const-string v0, "CHARSET"

    invoke-virtual {p0, v0, p1}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 206
    return-void
.end method

.method public setEncoding(Lezvcard/parameter/Encoding;)V
    .locals 2
    .param p1, "encoding"    # Lezvcard/parameter/Encoding;

    .prologue
    .line 137
    const-string v1, "ENCODING"

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v1, v0}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 138
    return-void

    .line 137
    :cond_0
    invoke-virtual {p1}, Lezvcard/parameter/Encoding;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public setGeo(DD)V
    .locals 5
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D

    .prologue
    .line 556
    new-instance v1, Lezvcard/util/GeoUri$Builder;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lezvcard/util/GeoUri$Builder;-><init>(Ljava/lang/Double;Ljava/lang/Double;)V

    invoke-virtual {v1}, Lezvcard/util/GeoUri$Builder;->build()Lezvcard/util/GeoUri;

    move-result-object v0

    .line 557
    .local v0, "geoUri":Lezvcard/util/GeoUri;
    const-string v1, "GEO"

    invoke-virtual {v0}, Lezvcard/util/GeoUri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 558
    return-void
.end method

.method public setIndex(Ljava/lang/Integer;)V
    .locals 3
    .param p1, "index"    # Ljava/lang/Integer;

    .prologue
    .line 830
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-gtz v1, :cond_0

    .line 831
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Index value must be greater than 0."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 833
    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x0

    .line 834
    .local v0, "value":Ljava/lang/String;
    :goto_0
    const-string v1, "INDEX"

    invoke-virtual {p0, v1, v0}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 835
    return-void

    .line 833
    .end local v0    # "value":Ljava/lang/String;
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 1
    .param p1, "label"    # Ljava/lang/String;

    .prologue
    .line 259
    const-string v0, "LABEL"

    invoke-virtual {p0, v0, p1}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 260
    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 1
    .param p1, "language"    # Ljava/lang/String;

    .prologue
    .line 233
    const-string v0, "LANGUAGE"

    invoke-virtual {p0, v0, p1}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 234
    return-void
.end method

.method public setLevel(Ljava/lang/String;)V
    .locals 1
    .param p1, "level"    # Ljava/lang/String;

    .prologue
    .line 781
    const-string v0, "LEVEL"

    invoke-virtual {p0, v0, p1}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 782
    return-void
.end method

.method public setMediaType(Ljava/lang/String;)V
    .locals 1
    .param p1, "mediaType"    # Ljava/lang/String;

    .prologue
    .line 751
    const-string v0, "MEDIATYPE"

    invoke-virtual {p0, v0, p1}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 752
    return-void
.end method

.method public setPref(Ljava/lang/Integer;)V
    .locals 3
    .param p1, "pref"    # Ljava/lang/Integer;

    .prologue
    .line 440
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-lt v1, v2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x64

    if-le v1, v2, :cond_1

    .line 441
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Preference value must be between 1 and 100 inclusive."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 443
    :cond_1
    if-nez p1, :cond_2

    const/4 v0, 0x0

    .line 444
    .local v0, "value":Ljava/lang/String;
    :goto_0
    const-string v1, "PREF"

    invoke-virtual {p0, v1, v0}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 445
    return-void

    .line 443
    .end local v0    # "value":Ljava/lang/String;
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public varargs setSortAs([Ljava/lang/String;)V
    .locals 5
    .param p1, "names"    # [Ljava/lang/String;

    .prologue
    .line 594
    const-string v4, "SORT-AS"

    invoke-virtual {p0, v4}, Lezvcard/parameter/VCardParameters;->removeAll(Ljava/lang/Object;)Ljava/util/List;

    .line 595
    if-eqz p1, :cond_0

    array-length v4, p1

    if-lez v4, :cond_0

    .line 596
    move-object v0, p1

    .local v0, "arr$":[Ljava/lang/String;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 597
    .local v3, "name":Ljava/lang/String;
    const-string v4, "SORT-AS"

    invoke-virtual {p0, v4, v3}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 596
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 600
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v1    # "i$":I
    .end local v2    # "len$":I
    .end local v3    # "name":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public setTimezone(Ljava/lang/String;)V
    .locals 1
    .param p1, "tz"    # Ljava/lang/String;

    .prologue
    .line 285
    const-string v0, "TZ"

    invoke-virtual {p0, v0, p1}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 286
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 338
    const-string v0, "TYPE"

    invoke-virtual {p0, v0, p1}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 339
    return-void
.end method

.method public setValue(Lezvcard/VCardDataType;)V
    .locals 2
    .param p1, "value"    # Lezvcard/VCardDataType;

    .prologue
    .line 166
    const-string v1, "VALUE"

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v1, v0}, Lezvcard/parameter/VCardParameters;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 167
    return-void

    .line 166
    :cond_0
    invoke-virtual {p1}, Lezvcard/VCardDataType;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public validate(Lezvcard/VCardVersion;)Ljava/util/List;
    .locals 18
    .param p1, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/VCardVersion;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 846
    new-instance v14, Ljava/util/ArrayList;

    const/4 v15, 0x0

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 848
    .local v14, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v9, "%s parameter has a non-standard value (\"%s\").  Standard values are: %s"

    .line 849
    .local v9, "nonStandard":Ljava/lang/String;
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "%s parameter value (\"%s\") is not supported by version "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lezvcard/VCardVersion;->getVersion()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "."

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 851
    .local v12, "valueNotSupported":Ljava/lang/String;
    const-string v15, "CALSCALE"

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 852
    .local v11, "value":Ljava/lang/String;
    if-eqz v11, :cond_0

    invoke-static {v11}, Lezvcard/parameter/Calscale;->find(Ljava/lang/String;)Lezvcard/parameter/Calscale;

    move-result-object v15

    if-nez v15, :cond_0

    .line 853
    const/4 v15, 0x3

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    const-string v17, "CALSCALE"

    aput-object v17, v15, v16

    const/16 v16, 0x1

    aput-object v11, v15, v16

    const/16 v16, 0x2

    invoke-static {}, Lezvcard/parameter/Calscale;->all()Ljava/util/Collection;

    move-result-object v17

    aput-object v17, v15, v16

    invoke-static {v9, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 856
    :cond_0
    const-string v15, "ENCODING"

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    .end local v11    # "value":Ljava/lang/String;
    check-cast v11, Ljava/lang/String;

    .line 857
    .restart local v11    # "value":Ljava/lang/String;
    if-eqz v11, :cond_1

    .line 858
    invoke-static {v11}, Lezvcard/parameter/Encoding;->find(Ljava/lang/String;)Lezvcard/parameter/Encoding;

    move-result-object v4

    .line 859
    .local v4, "encoding":Lezvcard/parameter/Encoding;
    if-nez v4, :cond_4

    .line 860
    const/4 v15, 0x3

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    const-string v17, "ENCODING"

    aput-object v17, v15, v16

    const/16 v16, 0x1

    aput-object v11, v15, v16

    const/16 v16, 0x2

    invoke-static {}, Lezvcard/parameter/Encoding;->all()Ljava/util/Collection;

    move-result-object v17

    aput-object v17, v15, v16

    invoke-static {v9, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 866
    .end local v4    # "encoding":Lezvcard/parameter/Encoding;
    :cond_1
    :goto_0
    const-string v15, "VALUE"

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    .end local v11    # "value":Ljava/lang/String;
    check-cast v11, Ljava/lang/String;

    .line 867
    .restart local v11    # "value":Ljava/lang/String;
    if-eqz v11, :cond_2

    .line 868
    invoke-static {v11}, Lezvcard/VCardDataType;->find(Ljava/lang/String;)Lezvcard/VCardDataType;

    move-result-object v2

    .line 869
    .local v2, "dataType":Lezvcard/VCardDataType;
    if-nez v2, :cond_5

    .line 870
    const/4 v15, 0x3

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    const-string v17, "VALUE"

    aput-object v17, v15, v16

    const/16 v16, 0x1

    aput-object v11, v15, v16

    const/16 v16, 0x2

    invoke-static {}, Lezvcard/VCardDataType;->all()Ljava/util/Collection;

    move-result-object v17

    aput-object v17, v15, v16

    invoke-static {v9, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 876
    .end local v2    # "dataType":Lezvcard/VCardDataType;
    :cond_2
    :goto_1
    const-string v7, "%s parameter has a malformed value (\"%s\")."

    .line 879
    .local v7, "malformed":Ljava/lang/String;
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lezvcard/parameter/VCardParameters;->getGeo()[D
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 885
    :goto_2
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lezvcard/parameter/VCardParameters;->getIndex()Ljava/lang/Integer;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 891
    :goto_3
    :try_start_2
    invoke-virtual/range {p0 .. p0}, Lezvcard/parameter/VCardParameters;->getPids()Ljava/util/List;
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 897
    :goto_4
    :try_start_3
    invoke-virtual/range {p0 .. p0}, Lezvcard/parameter/VCardParameters;->getPref()Ljava/lang/Integer;
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    .line 902
    :goto_5
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "%s parameter is not supported by version "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lezvcard/VCardVersion;->getVersion()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "."

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 903
    .local v10, "paramNotSupported":Ljava/lang/String;
    sget-object v15, Lezvcard/parameter/VCardParameters;->supportedVersions:Ljava/util/Map;

    invoke-interface {v15}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .local v6, "i$":Ljava/util/Iterator;
    :cond_3
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 904
    .local v5, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/Set<Lezvcard/VCardVersion;>;>;"
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 905
    .local v8, "name":Ljava/lang/String;
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    .end local v11    # "value":Ljava/lang/String;
    check-cast v11, Ljava/lang/String;

    .line 906
    .restart local v11    # "value":Ljava/lang/String;
    if-eqz v11, :cond_3

    .line 910
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Set;

    .line 911
    .local v13, "versions":Ljava/util/Set;, "Ljava/util/Set<Lezvcard/VCardVersion;>;"
    move-object/from16 v0, p1

    invoke-interface {v13, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_3

    .line 912
    const/4 v15, 0x1

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    aput-object v8, v15, v16

    invoke-static {v10, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 861
    .end local v5    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/Set<Lezvcard/VCardVersion;>;>;"
    .end local v6    # "i$":Ljava/util/Iterator;
    .end local v7    # "malformed":Ljava/lang/String;
    .end local v8    # "name":Ljava/lang/String;
    .end local v10    # "paramNotSupported":Ljava/lang/String;
    .end local v13    # "versions":Ljava/util/Set;, "Ljava/util/Set<Lezvcard/VCardVersion;>;"
    .restart local v4    # "encoding":Lezvcard/parameter/Encoding;
    :cond_4
    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Lezvcard/parameter/Encoding;->isSupported(Lezvcard/VCardVersion;)Z

    move-result v15

    if-nez v15, :cond_1

    .line 862
    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    const-string v17, "ENCODING"

    aput-object v17, v15, v16

    const/16 v16, 0x1

    aput-object v11, v15, v16

    invoke-static {v12, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 871
    .end local v4    # "encoding":Lezvcard/parameter/Encoding;
    .restart local v2    # "dataType":Lezvcard/VCardDataType;
    :cond_5
    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Lezvcard/VCardDataType;->isSupported(Lezvcard/VCardVersion;)Z

    move-result v15

    if-nez v15, :cond_2

    .line 872
    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    const-string v17, "VALUE"

    aput-object v17, v15, v16

    const/16 v16, 0x1

    aput-object v11, v15, v16

    invoke-static {v12, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 880
    .end local v2    # "dataType":Lezvcard/VCardDataType;
    .restart local v7    # "malformed":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 881
    .local v3, "e":Ljava/lang/IllegalStateException;
    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    const-string v17, "GEO"

    aput-object v17, v15, v16

    const/16 v16, 0x1

    const-string v17, "GEO"

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    aput-object v17, v15, v16

    invoke-static {v7, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 886
    .end local v3    # "e":Ljava/lang/IllegalStateException;
    :catch_1
    move-exception v3

    .line 887
    .restart local v3    # "e":Ljava/lang/IllegalStateException;
    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    const-string v17, "INDEX"

    aput-object v17, v15, v16

    const/16 v16, 0x1

    const-string v17, "INDEX"

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    aput-object v17, v15, v16

    invoke-static {v7, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 892
    .end local v3    # "e":Ljava/lang/IllegalStateException;
    :catch_2
    move-exception v3

    .line 893
    .restart local v3    # "e":Ljava/lang/IllegalStateException;
    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    const-string v17, "PID"

    aput-object v17, v15, v16

    const/16 v16, 0x1

    const-string v17, "PID"

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    aput-object v17, v15, v16

    invoke-static {v7, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    .line 898
    .end local v3    # "e":Ljava/lang/IllegalStateException;
    :catch_3
    move-exception v3

    .line 899
    .restart local v3    # "e":Ljava/lang/IllegalStateException;
    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v16, 0x0

    const-string v17, "PREF"

    aput-object v17, v15, v16

    const/16 v16, 0x1

    const-string v17, "PREF"

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    aput-object v17, v15, v16

    invoke-static {v7, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 916
    .end local v3    # "e":Ljava/lang/IllegalStateException;
    .restart local v6    # "i$":Ljava/util/Iterator;
    .restart local v10    # "paramNotSupported":Ljava/lang/String;
    :cond_6
    return-object v14
.end method
