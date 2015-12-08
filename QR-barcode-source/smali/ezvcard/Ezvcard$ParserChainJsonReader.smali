.class public Lezvcard/Ezvcard$ParserChainJsonReader;
.super Lezvcard/Ezvcard$ParserChainJson;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParserChainJsonReader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$ParserChainJson",
        "<",
        "Lezvcard/Ezvcard$ParserChainJsonReader;",
        ">;"
    }
.end annotation


# instance fields
.field private final file:Ljava/io/File;

.field private final in:Ljava/io/InputStream;

.field private final reader:Ljava/io/Reader;


# direct methods
.method private constructor <init>(Ljava/io/File;)V
    .locals 2
    .param p1, "file"    # Ljava/io/File;

    .prologue
    const/4 v1, 0x0

    .line 1233
    const/4 v0, 0x1

    invoke-direct {p0, v0, v1}, Lezvcard/Ezvcard$ParserChainJson;-><init>(ZLezvcard/Ezvcard$1;)V

    .line 1234
    iput-object v1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->in:Ljava/io/InputStream;

    .line 1235
    iput-object v1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->reader:Ljava/io/Reader;

    .line 1236
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->file:Ljava/io/File;

    .line 1237
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/File;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/File;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1220
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainJsonReader;-><init>(Ljava/io/File;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;)V
    .locals 2
    .param p1, "in"    # Ljava/io/InputStream;

    .prologue
    const/4 v1, 0x0

    .line 1226
    const/4 v0, 0x0

    invoke-direct {p0, v0, v1}, Lezvcard/Ezvcard$ParserChainJson;-><init>(ZLezvcard/Ezvcard$1;)V

    .line 1227
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->in:Ljava/io/InputStream;

    .line 1228
    iput-object v1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->reader:Ljava/io/Reader;

    .line 1229
    iput-object v1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->file:Ljava/io/File;

    .line 1230
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/InputStream;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/InputStream;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1220
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainJsonReader;-><init>(Ljava/io/InputStream;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/Reader;)V
    .locals 2
    .param p1, "reader"    # Ljava/io/Reader;

    .prologue
    const/4 v1, 0x0

    .line 1240
    const/4 v0, 0x0

    invoke-direct {p0, v0, v1}, Lezvcard/Ezvcard$ParserChainJson;-><init>(ZLezvcard/Ezvcard$1;)V

    .line 1241
    iput-object v1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->in:Ljava/io/InputStream;

    .line 1242
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->reader:Ljava/io/Reader;

    .line 1243
    iput-object v1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->file:Ljava/io/File;

    .line 1244
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/Reader;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/Reader;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1220
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainJsonReader;-><init>(Ljava/io/Reader;)V

    return-void
.end method


# virtual methods
.method _constructReader()Lezvcard/io/json/JCardReader;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1258
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->in:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 1259
    new-instance v0, Lezvcard/io/json/JCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->in:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Lezvcard/io/json/JCardReader;-><init>(Ljava/io/InputStream;)V

    .line 1264
    :goto_0
    return-object v0

    .line 1261
    :cond_0
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->file:Ljava/io/File;

    if-eqz v0, :cond_1

    .line 1262
    new-instance v0, Lezvcard/io/json/JCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->file:Ljava/io/File;

    invoke-direct {v0, v1}, Lezvcard/io/json/JCardReader;-><init>(Ljava/io/File;)V

    goto :goto_0

    .line 1264
    :cond_1
    new-instance v0, Lezvcard/io/json/JCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainJsonReader;->reader:Ljava/io/Reader;

    invoke-direct {v0, v1}, Lezvcard/io/json/JCardReader;-><init>(Ljava/io/Reader;)V

    goto :goto_0
.end method

.method public bridge synthetic all()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1220
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainJson;->all()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic first()Lezvcard/VCard;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1220
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainJson;->first()Lezvcard/VCard;

    move-result-object v0

    return-object v0
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainJsonReader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$ParserChainJsonReader;"
        }
    .end annotation

    .prologue
    .line 1248
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainJson;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainJsonReader;

    return-object v0
.end method

.method public bridge synthetic register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/scribe/VCardPropertyScribe;

    .prologue
    .line 1220
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainJsonReader;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainJsonReader;

    move-result-object v0

    return-object v0
.end method

.method public warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainJsonReader;
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
            "Lezvcard/Ezvcard$ParserChainJsonReader;"
        }
    .end annotation

    .prologue
    .line 1253
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainJson;->warnings(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainJsonReader;

    return-object v0
.end method

.method public bridge synthetic warnings(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/util/List;

    .prologue
    .line 1220
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainJsonReader;->warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainJsonReader;

    move-result-object v0

    return-object v0
.end method
