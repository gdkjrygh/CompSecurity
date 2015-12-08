.class public Lezvcard/Ezvcard$ParserChainTextString;
.super Lezvcard/Ezvcard$ParserChainText;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParserChainTextString"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$ParserChainText",
        "<",
        "Lezvcard/Ezvcard$ParserChainTextString;",
        ">;"
    }
.end annotation


# instance fields
.field private final text:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 763
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lezvcard/Ezvcard$ParserChainText;-><init>(ZLezvcard/Ezvcard$1;)V

    .line 764
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainTextString;->text:Ljava/lang/String;

    .line 765
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 759
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainTextString;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method _constructReader()Lezvcard/io/text/VCardReader;
    .locals 2

    .prologue
    .line 784
    new-instance v0, Lezvcard/io/text/VCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainTextString;->text:Ljava/lang/String;

    invoke-direct {v0, v1}, Lezvcard/io/text/VCardReader;-><init>(Ljava/lang/String;)V

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
    .line 800
    :try_start_0
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainText;->all()Ljava/util/List;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 801
    :catch_0
    move-exception v0

    .line 803
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public caretDecoding(Z)Lezvcard/Ezvcard$ParserChainTextString;
    .locals 1
    .param p1, "enable"    # Z

    .prologue
    .line 779
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainText;->caretDecoding(Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainTextString;

    return-object v0
.end method

.method public bridge synthetic caretDecoding(Z)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Z

    .prologue
    .line 759
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainTextString;->caretDecoding(Z)Lezvcard/Ezvcard$ParserChainTextString;

    move-result-object v0

    return-object v0
.end method

.method public first()Lezvcard/VCard;
    .locals 2

    .prologue
    .line 790
    :try_start_0
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainText;->first()Lezvcard/VCard;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 791
    :catch_0
    move-exception v0

    .line 793
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainTextString;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$ParserChainTextString;"
        }
    .end annotation

    .prologue
    .line 769
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainText;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainTextString;

    return-object v0
.end method

.method public bridge synthetic register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/scribe/VCardPropertyScribe;

    .prologue
    .line 759
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainTextString;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainTextString;

    move-result-object v0

    return-object v0
.end method

.method public warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainTextString;
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
            "Lezvcard/Ezvcard$ParserChainTextString;"
        }
    .end annotation

    .prologue
    .line 774
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainText;->warnings(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainTextString;

    return-object v0
.end method

.method public bridge synthetic warnings(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/util/List;

    .prologue
    .line 759
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainTextString;->warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainTextString;

    move-result-object v0

    return-object v0
.end method
