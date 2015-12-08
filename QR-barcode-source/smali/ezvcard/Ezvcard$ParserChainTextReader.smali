.class public Lezvcard/Ezvcard$ParserChainTextReader;
.super Lezvcard/Ezvcard$ParserChainText;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParserChainTextReader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$ParserChainText",
        "<",
        "Lezvcard/Ezvcard$ParserChainTextReader;",
        ">;"
    }
.end annotation


# instance fields
.field private final file:Ljava/io/File;

.field private final reader:Ljava/io/Reader;


# direct methods
.method private constructor <init>(Ljava/io/File;)V
    .locals 2
    .param p1, "file"    # Ljava/io/File;

    .prologue
    const/4 v1, 0x0

    .line 728
    const/4 v0, 0x1

    invoke-direct {p0, v0, v1}, Lezvcard/Ezvcard$ParserChainText;-><init>(ZLezvcard/Ezvcard$1;)V

    .line 729
    iput-object v1, p0, Lezvcard/Ezvcard$ParserChainTextReader;->reader:Ljava/io/Reader;

    .line 730
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainTextReader;->file:Ljava/io/File;

    .line 731
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/File;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/File;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 717
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainTextReader;-><init>(Ljava/io/File;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/Reader;)V
    .locals 2
    .param p1, "reader"    # Ljava/io/Reader;

    .prologue
    const/4 v1, 0x0

    .line 722
    const/4 v0, 0x0

    invoke-direct {p0, v0, v1}, Lezvcard/Ezvcard$ParserChainText;-><init>(ZLezvcard/Ezvcard$1;)V

    .line 723
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainTextReader;->reader:Ljava/io/Reader;

    .line 724
    iput-object v1, p0, Lezvcard/Ezvcard$ParserChainTextReader;->file:Ljava/io/File;

    .line 725
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/Reader;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/Reader;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 717
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainTextReader;-><init>(Ljava/io/Reader;)V

    return-void
.end method


# virtual methods
.method _constructReader()Lezvcard/io/text/VCardReader;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 751
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChainTextReader;->reader:Ljava/io/Reader;

    if-eqz v0, :cond_0

    new-instance v0, Lezvcard/io/text/VCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainTextReader;->reader:Ljava/io/Reader;

    invoke-direct {v0, v1}, Lezvcard/io/text/VCardReader;-><init>(Ljava/io/Reader;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lezvcard/io/text/VCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainTextReader;->file:Ljava/io/File;

    invoke-direct {v0, v1}, Lezvcard/io/text/VCardReader;-><init>(Ljava/io/File;)V

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
    .line 717
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainText;->all()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public caretDecoding(Z)Lezvcard/Ezvcard$ParserChainTextReader;
    .locals 1
    .param p1, "enable"    # Z

    .prologue
    .line 745
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainText;->caretDecoding(Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainTextReader;

    return-object v0
.end method

.method public bridge synthetic caretDecoding(Z)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Z

    .prologue
    .line 717
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainTextReader;->caretDecoding(Z)Lezvcard/Ezvcard$ParserChainTextReader;

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
    .line 717
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainText;->first()Lezvcard/VCard;

    move-result-object v0

    return-object v0
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainTextReader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$ParserChainTextReader;"
        }
    .end annotation

    .prologue
    .line 735
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainText;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainTextReader;

    return-object v0
.end method

.method public bridge synthetic register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/scribe/VCardPropertyScribe;

    .prologue
    .line 717
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainTextReader;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainTextReader;

    move-result-object v0

    return-object v0
.end method

.method public warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainTextReader;
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
            "Lezvcard/Ezvcard$ParserChainTextReader;"
        }
    .end annotation

    .prologue
    .line 740
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainText;->warnings(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainTextReader;

    return-object v0
.end method

.method public bridge synthetic warnings(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/util/List;

    .prologue
    .line 717
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainTextReader;->warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainTextReader;

    move-result-object v0

    return-object v0
.end method
