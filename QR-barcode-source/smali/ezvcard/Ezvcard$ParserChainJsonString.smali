.class public Lezvcard/Ezvcard$ParserChainJsonString;
.super Lezvcard/Ezvcard$ParserChainJson;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParserChainJsonString"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$ParserChainJson",
        "<",
        "Lezvcard/Ezvcard$ParserChainJsonString;",
        ">;"
    }
.end annotation


# instance fields
.field private final json:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1, "json"    # Ljava/lang/String;

    .prologue
    .line 1276
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lezvcard/Ezvcard$ParserChainJson;-><init>(ZLezvcard/Ezvcard$1;)V

    .line 1277
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainJsonString;->json:Ljava/lang/String;

    .line 1278
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1272
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainJsonString;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method _constructReader()Lezvcard/io/json/JCardReader;
    .locals 2

    .prologue
    .line 1292
    new-instance v0, Lezvcard/io/json/JCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainJsonString;->json:Ljava/lang/String;

    invoke-direct {v0, v1}, Lezvcard/io/json/JCardReader;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public all()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/VCard;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1308
    :try_start_0
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainJson;->all()Ljava/util/List;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 1309
    :catch_0
    move-exception v0

    .line 1311
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public first()Lezvcard/VCard;
    .locals 2

    .prologue
    .line 1298
    :try_start_0
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainJson;->first()Lezvcard/VCard;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 1299
    :catch_0
    move-exception v0

    .line 1301
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainJsonString;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$ParserChainJsonString;"
        }
    .end annotation

    .prologue
    .line 1282
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainJson;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainJsonString;

    return-object v0
.end method

.method public bridge synthetic register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/scribe/VCardPropertyScribe;

    .prologue
    .line 1272
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainJsonString;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainJsonString;

    move-result-object v0

    return-object v0
.end method

.method public warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainJsonString;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lezvcard/Ezvcard$ParserChainJsonString;"
        }
    .end annotation

    .prologue
    .line 1287
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainJson;->warnings(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainJsonString;

    return-object v0
.end method

.method public bridge synthetic warnings(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/util/List;

    .prologue
    .line 1272
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainJsonString;->warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainJsonString;

    move-result-object v0

    return-object v0
.end method
