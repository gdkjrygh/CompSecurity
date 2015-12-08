.class public Lezvcard/io/json/JCardReader;
.super Ljava/lang/Object;
.source "JCardReader.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/json/JCardReader$1;,
        Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;
    }
.end annotation


# instance fields
.field private index:Lezvcard/io/scribe/ScribeIndex;

.field private final reader:Lezvcard/io/json/JCardRawReader;

.field private final warnings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 110
    invoke-static {p1}, Lezvcard/util/IOUtils;->utf8Reader(Ljava/io/File;)Ljava/io/Reader;

    move-result-object v0

    invoke-direct {p0, v0}, Lezvcard/io/json/JCardReader;-><init>(Ljava/io/Reader;)V

    .line 111
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;

    .prologue
    .line 101
    invoke-static {p1}, Lezvcard/util/IOUtils;->utf8Reader(Ljava/io/InputStream;)Ljava/io/Reader;

    move-result-object v0

    invoke-direct {p0, v0}, Lezvcard/io/json/JCardReader;-><init>(Ljava/io/Reader;)V

    .line 102
    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1
    .param p1, "reader"    # Ljava/io/Reader;

    .prologue
    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/io/json/JCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 85
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lezvcard/io/json/JCardReader;->warnings:Ljava/util/List;

    .line 118
    new-instance v0, Lezvcard/io/json/JCardRawReader;

    invoke-direct {v0, p1}, Lezvcard/io/json/JCardRawReader;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Lezvcard/io/json/JCardReader;->reader:Lezvcard/io/json/JCardRawReader;

    .line 119
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "json"    # Ljava/lang/String;

    .prologue
    .line 93
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lezvcard/io/json/JCardReader;-><init>(Ljava/io/Reader;)V

    .line 94
    return-void
.end method

.method static synthetic access$300(Lezvcard/io/json/JCardReader;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lezvcard/io/json/JCardReader;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Ljava/lang/String;

    .prologue
    .line 83
    invoke-direct {p0, p1, p2}, Lezvcard/io/json/JCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Lezvcard/io/json/JCardReader;)Lezvcard/io/scribe/ScribeIndex;
    .locals 1
    .param p0, "x0"    # Lezvcard/io/json/JCardReader;

    .prologue
    .line 83
    iget-object v0, p0, Lezvcard/io/json/JCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    return-object v0
.end method

.method private addWarning(Ljava/lang/String;)V
    .locals 1
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 181
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lezvcard/io/json/JCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    return-void
.end method

.method private addWarning(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "propertyName"    # Ljava/lang/String;

    .prologue
    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .local v0, "sb":Ljava/lang/StringBuilder;
    const-string v1, "Line "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lezvcard/io/json/JCardReader;->reader:Lezvcard/io/json/JCardRawReader;

    invoke-virtual {v2}, Lezvcard/io/json/JCardRawReader;->getLineNum()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    if-eqz p2, :cond_0

    .line 188
    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " property)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    :cond_0
    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    iget-object v1, p0, Lezvcard/io/json/JCardReader;->warnings:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 193
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 196
    iget-object v0, p0, Lezvcard/io/json/JCardReader;->reader:Lezvcard/io/json/JCardRawReader;

    invoke-virtual {v0}, Lezvcard/io/json/JCardRawReader;->close()V

    .line 197
    return-void
.end method

.method public getScribeIndex()Lezvcard/io/scribe/ScribeIndex;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lezvcard/io/json/JCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    return-object v0
.end method

.method public getWarnings()Ljava/util/List;
    .locals 2
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
    .line 177
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lezvcard/io/json/JCardReader;->warnings:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public readNext()Lezvcard/VCard;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 127
    iget-object v2, p0, Lezvcard/io/json/JCardReader;->reader:Lezvcard/io/json/JCardRawReader;

    invoke-virtual {v2}, Lezvcard/io/json/JCardRawReader;->eof()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 139
    :cond_0
    :goto_0
    return-object v1

    .line 131
    :cond_1
    iget-object v2, p0, Lezvcard/io/json/JCardReader;->warnings:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 133
    new-instance v0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;

    invoke-direct {v0, p0, v1}, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;-><init>(Lezvcard/io/json/JCardReader;Lezvcard/io/json/JCardReader$1;)V

    .line 134
    .local v0, "listener":Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;
    iget-object v2, p0, Lezvcard/io/json/JCardReader;->reader:Lezvcard/io/json/JCardRawReader;

    invoke-virtual {v2, v0}, Lezvcard/io/json/JCardRawReader;->readNext(Lezvcard/io/json/JCardRawReader$JCardDataStreamListener;)V

    .line 135
    # getter for: Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->vcard:Lezvcard/VCard;
    invoke-static {v0}, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->access$100(Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;)Lezvcard/VCard;

    move-result-object v1

    .line 136
    .local v1, "vcard":Lezvcard/VCard;
    if-eqz v1, :cond_0

    # getter for: Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->versionFound:Z
    invoke-static {v0}, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->access$200(Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 137
    const-string v2, "No \"version\" property found."

    invoke-direct {p0, v2}, Lezvcard/io/json/JCardReader;->addWarning(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public registerScribe(Lezvcard/io/scribe/VCardPropertyScribe;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 152
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/io/json/JCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, p1}, Lezvcard/io/scribe/ScribeIndex;->register(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 153
    return-void
.end method

.method public setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V
    .locals 0
    .param p1, "index"    # Lezvcard/io/scribe/ScribeIndex;

    .prologue
    .line 168
    iput-object p1, p0, Lezvcard/io/json/JCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 169
    return-void
.end method
