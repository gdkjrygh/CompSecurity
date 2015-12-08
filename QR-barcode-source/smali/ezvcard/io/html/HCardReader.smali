.class public Lezvcard/io/html/HCardReader;
.super Ljava/lang/Object;
.source "HCardReader.java"


# instance fields
.field private categories:Lezvcard/property/Categories;

.field private final categoriesName:Ljava/lang/String;

.field private curVCard:Lezvcard/VCard;

.field private final emailName:Ljava/lang/String;

.field private embeddedVCards:Lorg/jsoup/select/Elements;

.field private index:Lezvcard/io/scribe/ScribeIndex;

.field private it:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Lorg/jsoup/nodes/Element;",
            ">;"
        }
    .end annotation
.end field

.field private final labels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Label;",
            ">;"
        }
    .end annotation
.end field

.field private nickname:Lezvcard/property/Nickname;

.field private pageUrl:Ljava/lang/String;

.field private final telName:Ljava/lang/String;

.field private final urlPropertyName:Ljava/lang/String;

.field private vcardElements:Lorg/jsoup/select/Elements;

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
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 149
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lezvcard/io/html/HCardReader;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 150
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 5
    .param p1, "file"    # Ljava/io/File;
    .param p2, "pageUrl"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v2, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v2}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 96
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->warnings:Ljava/util/List;

    .line 99
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->labels:Ljava/util/List;

    .line 101
    new-instance v2, Lorg/jsoup/select/Elements;

    invoke-direct {v2}, Lorg/jsoup/select/Elements;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->embeddedVCards:Lorg/jsoup/select/Elements;

    .line 105
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Url;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->urlPropertyName:Ljava/lang/String;

    .line 106
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Categories;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->categoriesName:Ljava/lang/String;

    .line 107
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Email;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->emailName:Ljava/lang/String;

    .line 108
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Telephone;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->telName:Ljava/lang/String;

    .line 159
    iput-object p2, p0, Lezvcard/io/html/HCardReader;->pageUrl:Ljava/lang/String;

    .line 160
    if-nez p2, :cond_0

    const-string v2, ""

    invoke-static {p1, v4, v2}, Lorg/jsoup/Jsoup;->parse(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    move-result-object v1

    .line 161
    .local v1, "document":Lorg/jsoup/nodes/Document;
    :goto_0
    invoke-direct {p0, p2}, Lezvcard/io/html/HCardReader;->getAnchor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 162
    .local v0, "anchor":Ljava/lang/String;
    invoke-direct {p0, v1, v0}, Lezvcard/io/html/HCardReader;->init(Lorg/jsoup/nodes/Document;Ljava/lang/String;)V

    .line 163
    return-void

    .line 160
    .end local v0    # "anchor":Ljava/lang/String;
    .end local v1    # "document":Lorg/jsoup/nodes/Document;
    :cond_0
    invoke-static {p1, v4, p2}, Lorg/jsoup/Jsoup;->parse(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    move-result-object v1

    goto :goto_0
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 127
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lezvcard/io/html/HCardReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 128
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 5
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "pageUrl"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v2, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v2}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 96
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->warnings:Ljava/util/List;

    .line 99
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->labels:Ljava/util/List;

    .line 101
    new-instance v2, Lorg/jsoup/select/Elements;

    invoke-direct {v2}, Lorg/jsoup/select/Elements;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->embeddedVCards:Lorg/jsoup/select/Elements;

    .line 105
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Url;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->urlPropertyName:Ljava/lang/String;

    .line 106
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Categories;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->categoriesName:Ljava/lang/String;

    .line 107
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Email;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->emailName:Ljava/lang/String;

    .line 108
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Telephone;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->telName:Ljava/lang/String;

    .line 137
    iput-object p2, p0, Lezvcard/io/html/HCardReader;->pageUrl:Ljava/lang/String;

    .line 138
    if-nez p2, :cond_0

    const-string v2, ""

    invoke-static {p1, v4, v2}, Lorg/jsoup/Jsoup;->parse(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    move-result-object v1

    .line 139
    .local v1, "document":Lorg/jsoup/nodes/Document;
    :goto_0
    invoke-direct {p0, p2}, Lezvcard/io/html/HCardReader;->getAnchor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 140
    .local v0, "anchor":Ljava/lang/String;
    invoke-direct {p0, v1, v0}, Lezvcard/io/html/HCardReader;->init(Lorg/jsoup/nodes/Document;Ljava/lang/String;)V

    .line 141
    return-void

    .line 138
    .end local v0    # "anchor":Ljava/lang/String;
    .end local v1    # "document":Lorg/jsoup/nodes/Document;
    :cond_0
    invoke-static {p1, v4, p2}, Lorg/jsoup/Jsoup;->parse(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    move-result-object v1

    goto :goto_0
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1
    .param p1, "reader"    # Ljava/io/Reader;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 171
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lezvcard/io/html/HCardReader;-><init>(Ljava/io/Reader;Ljava/lang/String;)V

    .line 172
    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;Ljava/lang/String;)V
    .locals 8
    .param p1, "reader"    # Ljava/io/Reader;
    .param p2, "pageUrl"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v6, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v6}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v6, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 96
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lezvcard/io/html/HCardReader;->warnings:Ljava/util/List;

    .line 99
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lezvcard/io/html/HCardReader;->labels:Ljava/util/List;

    .line 101
    new-instance v6, Lorg/jsoup/select/Elements;

    invoke-direct {v6}, Lorg/jsoup/select/Elements;-><init>()V

    iput-object v6, p0, Lezvcard/io/html/HCardReader;->embeddedVCards:Lorg/jsoup/select/Elements;

    .line 105
    iget-object v6, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v7, Lezvcard/property/Url;

    invoke-virtual {v6, v7}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v6

    invoke-virtual {v6}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lezvcard/io/html/HCardReader;->urlPropertyName:Ljava/lang/String;

    .line 106
    iget-object v6, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v7, Lezvcard/property/Categories;

    invoke-virtual {v6, v7}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v6

    invoke-virtual {v6}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lezvcard/io/html/HCardReader;->categoriesName:Ljava/lang/String;

    .line 107
    iget-object v6, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v7, Lezvcard/property/Email;

    invoke-virtual {v6, v7}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v6

    invoke-virtual {v6}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lezvcard/io/html/HCardReader;->emailName:Ljava/lang/String;

    .line 108
    iget-object v6, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v7, Lezvcard/property/Telephone;

    invoke-virtual {v6, v7}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v6

    invoke-virtual {v6}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lezvcard/io/html/HCardReader;->telName:Ljava/lang/String;

    .line 181
    iput-object p2, p0, Lezvcard/io/html/HCardReader;->pageUrl:Ljava/lang/String;

    .line 183
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    .local v5, "sb":Ljava/lang/StringBuilder;
    const/16 v6, 0x1000

    new-array v1, v6, [C

    .line 186
    .local v1, "buffer":[C
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/Reader;->read([C)I

    move-result v4

    .local v4, "read":I
    const/4 v6, -0x1

    if-eq v4, v6, :cond_0

    .line 187
    const/4 v6, 0x0

    invoke-virtual {v5, v1, v6, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 189
    :cond_0
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 191
    .local v3, "html":Ljava/lang/String;
    if-nez p2, :cond_1

    invoke-static {v3}, Lorg/jsoup/Jsoup;->parse(Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    move-result-object v2

    .line 192
    .local v2, "document":Lorg/jsoup/nodes/Document;
    :goto_1
    invoke-direct {p0, p2}, Lezvcard/io/html/HCardReader;->getAnchor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 193
    .local v0, "anchor":Ljava/lang/String;
    invoke-direct {p0, v2, v0}, Lezvcard/io/html/HCardReader;->init(Lorg/jsoup/nodes/Document;Ljava/lang/String;)V

    .line 194
    return-void

    .line 191
    .end local v0    # "anchor":Ljava/lang/String;
    .end local v2    # "document":Lorg/jsoup/nodes/Document;
    :cond_1
    invoke-static {v3, p2}, Lorg/jsoup/Jsoup;->parse(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    move-result-object v2

    goto :goto_1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "html"    # Ljava/lang/String;

    .prologue
    .line 201
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lezvcard/io/html/HCardReader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "html"    # Ljava/lang/String;
    .param p2, "pageUrl"    # Ljava/lang/String;

    .prologue
    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v2, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v2}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 96
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->warnings:Ljava/util/List;

    .line 99
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->labels:Ljava/util/List;

    .line 101
    new-instance v2, Lorg/jsoup/select/Elements;

    invoke-direct {v2}, Lorg/jsoup/select/Elements;-><init>()V

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->embeddedVCards:Lorg/jsoup/select/Elements;

    .line 105
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Url;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->urlPropertyName:Ljava/lang/String;

    .line 106
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Categories;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->categoriesName:Ljava/lang/String;

    .line 107
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Email;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->emailName:Ljava/lang/String;

    .line 108
    iget-object v2, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v3, Lezvcard/property/Telephone;

    invoke-virtual {v2, v3}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v2

    invoke-virtual {v2}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lezvcard/io/html/HCardReader;->telName:Ljava/lang/String;

    .line 210
    iput-object p2, p0, Lezvcard/io/html/HCardReader;->pageUrl:Ljava/lang/String;

    .line 212
    if-nez p2, :cond_0

    invoke-static {p1}, Lorg/jsoup/Jsoup;->parse(Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    move-result-object v1

    .line 213
    .local v1, "document":Lorg/jsoup/nodes/Document;
    :goto_0
    invoke-direct {p0, p2}, Lezvcard/io/html/HCardReader;->getAnchor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 214
    .local v0, "anchor":Ljava/lang/String;
    invoke-direct {p0, v1, v0}, Lezvcard/io/html/HCardReader;->init(Lorg/jsoup/nodes/Document;Ljava/lang/String;)V

    .line 215
    return-void

    .line 212
    .end local v0    # "anchor":Ljava/lang/String;
    .end local v1    # "document":Lorg/jsoup/nodes/Document;
    :cond_0
    invoke-static {p1, p2}, Lorg/jsoup/Jsoup;->parse(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    move-result-object v1

    goto :goto_0
.end method

.method public constructor <init>(Ljava/net/URL;)V
    .locals 3
    .param p1, "url"    # Ljava/net/URL;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v1, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v1}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 96
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->warnings:Ljava/util/List;

    .line 99
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->labels:Ljava/util/List;

    .line 101
    new-instance v1, Lorg/jsoup/select/Elements;

    invoke-direct {v1}, Lorg/jsoup/select/Elements;-><init>()V

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->embeddedVCards:Lorg/jsoup/select/Elements;

    .line 105
    iget-object v1, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v2, Lezvcard/property/Url;

    invoke-virtual {v1, v2}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v1

    invoke-virtual {v1}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->urlPropertyName:Ljava/lang/String;

    .line 106
    iget-object v1, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v2, Lezvcard/property/Categories;

    invoke-virtual {v1, v2}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v1

    invoke-virtual {v1}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->categoriesName:Ljava/lang/String;

    .line 107
    iget-object v1, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v2, Lezvcard/property/Email;

    invoke-virtual {v1, v2}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v1

    invoke-virtual {v1}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->emailName:Ljava/lang/String;

    .line 108
    iget-object v1, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v2, Lezvcard/property/Telephone;

    invoke-virtual {v1, v2}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v1

    invoke-virtual {v1}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->telName:Ljava/lang/String;

    .line 116
    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->pageUrl:Ljava/lang/String;

    .line 117
    const/16 v1, 0x7530

    invoke-static {p1, v1}, Lorg/jsoup/Jsoup;->parse(Ljava/net/URL;I)Lorg/jsoup/nodes/Document;

    move-result-object v0

    .line 118
    .local v0, "document":Lorg/jsoup/nodes/Document;
    invoke-virtual {p1}, Ljava/net/URL;->getRef()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lezvcard/io/html/HCardReader;->init(Lorg/jsoup/nodes/Document;Ljava/lang/String;)V

    .line 119
    return-void
.end method

.method private constructor <init>(Lorg/jsoup/nodes/Element;Ljava/lang/String;)V
    .locals 3
    .param p1, "embeddedVCard"    # Lorg/jsoup/nodes/Element;
    .param p2, "pageUrl"    # Ljava/lang/String;

    .prologue
    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lezvcard/io/html/HCardReader;->warnings:Ljava/util/List;

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lezvcard/io/html/HCardReader;->labels:Ljava/util/List;

    .line 101
    new-instance v0, Lorg/jsoup/select/Elements;

    invoke-direct {v0}, Lorg/jsoup/select/Elements;-><init>()V

    iput-object v0, p0, Lezvcard/io/html/HCardReader;->embeddedVCards:Lorg/jsoup/select/Elements;

    .line 105
    iget-object v0, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v1, Lezvcard/property/Url;

    invoke-virtual {v0, v1}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/html/HCardReader;->urlPropertyName:Ljava/lang/String;

    .line 106
    iget-object v0, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v1, Lezvcard/property/Categories;

    invoke-virtual {v0, v1}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/html/HCardReader;->categoriesName:Ljava/lang/String;

    .line 107
    iget-object v0, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v1, Lezvcard/property/Email;

    invoke-virtual {v0, v1}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/html/HCardReader;->emailName:Ljava/lang/String;

    .line 108
    iget-object v0, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v1, Lezvcard/property/Telephone;

    invoke-virtual {v0, v1}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/html/HCardReader;->telName:Ljava/lang/String;

    .line 223
    iput-object p2, p0, Lezvcard/io/html/HCardReader;->pageUrl:Ljava/lang/String;

    .line 224
    new-instance v0, Lorg/jsoup/select/Elements;

    const/4 v1, 0x1

    new-array v1, v1, [Lorg/jsoup/nodes/Element;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-direct {v0, v1}, Lorg/jsoup/select/Elements;-><init>([Lorg/jsoup/nodes/Element;)V

    iput-object v0, p0, Lezvcard/io/html/HCardReader;->vcardElements:Lorg/jsoup/select/Elements;

    .line 225
    iget-object v0, p0, Lezvcard/io/html/HCardReader;->vcardElements:Lorg/jsoup/select/Elements;

    invoke-virtual {v0}, Lorg/jsoup/select/Elements;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/html/HCardReader;->it:Ljava/util/Iterator;

    .line 226
    return-void
.end method

.method private addWarning(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "propertyName"    # Ljava/lang/String;

    .prologue
    .line 470
    iget-object v0, p0, Lezvcard/io/html/HCardReader;->warnings:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " property: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 471
    return-void
.end method

.method private getAnchor(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "urlStr"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 248
    if-nez p1, :cond_0

    .line 256
    :goto_0
    return-object v2

    .line 253
    :cond_0
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 254
    .local v1, "url":Ljava/net/URL;
    invoke-virtual {v1}, Ljava/net/URL;->getRef()Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 255
    .end local v1    # "url":Ljava/net/URL;
    :catch_0
    move-exception v0

    .line 256
    .local v0, "e":Ljava/net/MalformedURLException;
    goto :goto_0
.end method

.method private init(Lorg/jsoup/nodes/Document;Ljava/lang/String;)V
    .locals 2
    .param p1, "document"    # Lorg/jsoup/nodes/Document;
    .param p2, "anchor"    # Ljava/lang/String;

    .prologue
    .line 229
    const/4 v0, 0x0

    .line 230
    .local v0, "searchIn":Lorg/jsoup/nodes/Element;
    if-eqz p2, :cond_0

    .line 231
    invoke-virtual {p1, p2}, Lorg/jsoup/nodes/Document;->getElementById(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    move-result-object v0

    .line 233
    :cond_0
    if-nez v0, :cond_1

    .line 234
    move-object v0, p1

    .line 237
    :cond_1
    const-string v1, "vcard"

    invoke-virtual {v0, v1}, Lorg/jsoup/nodes/Element;->getElementsByClass(Ljava/lang/String;)Lorg/jsoup/select/Elements;

    move-result-object v1

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->vcardElements:Lorg/jsoup/select/Elements;

    .line 238
    iget-object v1, p0, Lezvcard/io/html/HCardReader;->vcardElements:Lorg/jsoup/select/Elements;

    invoke-virtual {v1}, Lorg/jsoup/select/Elements;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iput-object v1, p0, Lezvcard/io/html/HCardReader;->it:Ljava/util/Iterator;

    .line 239
    return-void
.end method

.method private visit(Lorg/jsoup/nodes/Element;)V
    .locals 23
    .param p1, "element"    # Lorg/jsoup/nodes/Element;

    .prologue
    .line 351
    invoke-virtual/range {p1 .. p1}, Lorg/jsoup/nodes/Element;->classNames()Ljava/util/Set;

    move-result-object v6

    .line 352
    .local v6, "classNames":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_0
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 353
    .local v5, "className":Ljava/lang/String;
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 355
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->urlPropertyName:Ljava/lang/String;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v20

    if-eqz v20, :cond_1

    .line 356
    const-string v20, "href"

    move-object/from16 v0, p1

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 357
    .local v10, "href":Ljava/lang/String;
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v20

    if-lez v20, :cond_1

    .line 358
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->emailName:Ljava/lang/String;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    invoke-interface {v6, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v20

    if-nez v20, :cond_4

    const-string v20, "(?i)mailto:.*"

    move-object/from16 v0, v20

    invoke-virtual {v10, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v20

    if-eqz v20, :cond_4

    .line 359
    move-object/from16 v0, p0

    iget-object v5, v0, Lezvcard/io/html/HCardReader;->emailName:Ljava/lang/String;

    .line 382
    .end local v10    # "href":Ljava/lang/String;
    :cond_1
    :goto_1
    const-string v20, "category"

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v20

    if-eqz v20, :cond_2

    .line 383
    move-object/from16 v0, p0

    iget-object v5, v0, Lezvcard/io/html/HCardReader;->categoriesName:Ljava/lang/String;

    .line 386
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v17

    .line 387
    .local v17, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    if-nez v17, :cond_3

    .line 389
    const-string v20, "x-"

    move-object/from16 v0, v20

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v20

    if-eqz v20, :cond_0

    .line 392
    new-instance v17, Lezvcard/io/scribe/RawPropertyScribe;

    .end local v17    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    move-object/from16 v0, v17

    invoke-direct {v0, v5}, Lezvcard/io/scribe/RawPropertyScribe;-><init>(Ljava/lang/String;)V

    .line 397
    .restart local v17    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :cond_3
    :try_start_0
    move-object/from16 v0, v17

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;->parseHtml(Lorg/jsoup/nodes/Element;)Lezvcard/io/scribe/VCardPropertyScribe$Result;

    move-result-object v16

    .line 399
    .local v16, "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    invoke-virtual/range {v16 .. v16}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getWarnings()Ljava/util/List;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    .local v13, "i$":Ljava/util/Iterator;
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/String;

    .line 400
    .local v19, "warning":Ljava/lang/String;
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-direct {v0, v1, v5}, Lezvcard/io/html/HCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lezvcard/io/SkipMeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lezvcard/io/CannotParseException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_2

    .line 434
    .end local v13    # "i$":Ljava/util/Iterator;
    .end local v16    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    .end local v19    # "warning":Ljava/lang/String;
    :catch_0
    move-exception v7

    .line 435
    .local v7, "e":Lezvcard/io/SkipMeException;
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "Property has requested that it be skipped: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual {v7}, Lezvcard/io/SkipMeException;->getMessage()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    invoke-direct {v0, v1, v5}, Lezvcard/io/html/HCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 360
    .end local v7    # "e":Lezvcard/io/SkipMeException;
    .end local v17    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    .restart local v10    # "href":Ljava/lang/String;
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->telName:Ljava/lang/String;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    invoke-interface {v6, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v20

    if-nez v20, :cond_5

    const-string v20, "(?i)tel:.*"

    move-object/from16 v0, v20

    invoke-virtual {v10, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v20

    if-eqz v20, :cond_5

    .line 361
    move-object/from16 v0, p0

    iget-object v5, v0, Lezvcard/io/html/HCardReader;->telName:Ljava/lang/String;

    goto/16 :goto_1

    .line 364
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    move-object/from16 v20, v0

    const-class v21, Lezvcard/property/Impp;

    invoke-virtual/range {v20 .. v21}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v17

    .line 366
    .restart local v17    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :try_start_1
    move-object/from16 v0, v17

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;->parseHtml(Lorg/jsoup/nodes/Element;)Lezvcard/io/scribe/VCardPropertyScribe$Result;

    move-result-object v16

    .line 367
    .restart local v16    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->curVCard:Lezvcard/VCard;

    move-object/from16 v20, v0

    invoke-virtual/range {v16 .. v16}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 368
    invoke-virtual/range {v16 .. v16}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getWarnings()Ljava/util/List;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    .restart local v13    # "i$":Ljava/util/Iterator;
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_0

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/String;

    .line 369
    .restart local v19    # "warning":Ljava/lang/String;
    invoke-virtual/range {v17 .. v17}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    invoke-direct {v0, v1, v2}, Lezvcard/io/html/HCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lezvcard/io/SkipMeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lezvcard/io/CannotParseException; {:try_start_1 .. :try_end_1} :catch_4

    goto :goto_3

    .line 372
    .end local v13    # "i$":Ljava/util/Iterator;
    .end local v16    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    .end local v19    # "warning":Ljava/lang/String;
    :catch_1
    move-exception v20

    goto/16 :goto_1

    .line 403
    .end local v10    # "href":Ljava/lang/String;
    .restart local v13    # "i$":Ljava/util/Iterator;
    .restart local v16    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :cond_6
    :try_start_2
    invoke-virtual/range {v16 .. v16}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v15

    .line 406
    .local v15, "property":Lezvcard/property/VCardProperty;
    instance-of v0, v15, Lezvcard/property/Label;

    move/from16 v20, v0

    if-eqz v20, :cond_8

    .line 407
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->labels:Ljava/util/List;

    move-object/from16 v20, v0

    check-cast v15, Lezvcard/property/Label;

    .end local v15    # "property":Lezvcard/property/VCardProperty;
    move-object/from16 v0, v20

    invoke-interface {v0, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lezvcard/io/SkipMeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lezvcard/io/CannotParseException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_2 .. :try_end_2} :catch_3

    goto/16 :goto_0

    .line 437
    .end local v13    # "i$":Ljava/util/Iterator;
    .end local v16    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :catch_2
    move-exception v7

    .line 438
    .local v7, "e":Lezvcard/io/CannotParseException;
    invoke-virtual/range {p1 .. p1}, Lorg/jsoup/nodes/Element;->outerHtml()Ljava/lang/String;

    move-result-object v11

    .line 439
    .local v11, "html":Ljava/lang/String;
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "Property value could not be parsed.  Property will be saved as an extended property instead."

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    sget-object v21, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, "  HTML: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    sget-object v21, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    const-string v21, "  Reason: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual {v7}, Lezvcard/io/CannotParseException;->getMessage()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    invoke-direct {v0, v1, v5}, Lezvcard/io/html/HCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    new-instance v15, Lezvcard/property/RawProperty;

    invoke-direct {v15, v5, v11}, Lezvcard/property/RawProperty;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 461
    .end local v7    # "e":Lezvcard/io/CannotParseException;
    .end local v11    # "html":Ljava/lang/String;
    .restart local v15    # "property":Lezvcard/property/VCardProperty;
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->curVCard:Lezvcard/VCard;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    invoke-virtual {v0, v15}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    goto/16 :goto_0

    .line 412
    .restart local v13    # "i$":Ljava/util/Iterator;
    .restart local v16    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :cond_8
    :try_start_3
    instance-of v0, v15, Lezvcard/property/Nickname;

    move/from16 v20, v0

    if-eqz v20, :cond_a

    .line 413
    move-object v0, v15

    check-cast v0, Lezvcard/property/Nickname;

    move-object v14, v0

    .line 414
    .local v14, "nn":Lezvcard/property/Nickname;
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->nickname:Lezvcard/property/Nickname;

    move-object/from16 v20, v0

    if-nez v20, :cond_9

    .line 415
    move-object/from16 v0, p0

    iput-object v14, v0, Lezvcard/io/html/HCardReader;->nickname:Lezvcard/property/Nickname;

    .line 416
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->curVCard:Lezvcard/VCard;

    move-object/from16 v20, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->nickname:Lezvcard/property/Nickname;

    move-object/from16 v21, v0

    invoke-virtual/range {v20 .. v21}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V
    :try_end_3
    .catch Lezvcard/io/SkipMeException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lezvcard/io/CannotParseException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_0

    .line 441
    .end local v13    # "i$":Ljava/util/Iterator;
    .end local v14    # "nn":Lezvcard/property/Nickname;
    .end local v15    # "property":Lezvcard/property/VCardProperty;
    .end local v16    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :catch_3
    move-exception v7

    .line 442
    .local v7, "e":Lezvcard/io/EmbeddedVCardException;
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->embeddedVCards:Lorg/jsoup/select/Elements;

    move-object/from16 v20, v0

    move-object/from16 v0, p1

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lezvcard/util/HtmlUtils;->isChildOf(Lorg/jsoup/nodes/Element;Lorg/jsoup/select/Elements;)Z

    move-result v20

    if-nez v20, :cond_0

    .line 447
    invoke-virtual {v7}, Lezvcard/io/EmbeddedVCardException;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v15

    .line 449
    .restart local v15    # "property":Lezvcard/property/VCardProperty;
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->embeddedVCards:Lorg/jsoup/select/Elements;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lorg/jsoup/select/Elements;->add(Lorg/jsoup/nodes/Element;)Z

    .line 450
    new-instance v8, Lezvcard/io/html/HCardReader;

    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->pageUrl:Ljava/lang/String;

    move-object/from16 v20, v0

    move-object/from16 v0, p1

    move-object/from16 v1, v20

    invoke-direct {v8, v0, v1}, Lezvcard/io/html/HCardReader;-><init>(Lorg/jsoup/nodes/Element;Ljava/lang/String;)V

    .line 452
    .local v8, "embeddedReader":Lezvcard/io/html/HCardReader;
    :try_start_4
    invoke-virtual {v8}, Lezvcard/io/html/HCardReader;->readNext()Lezvcard/VCard;

    move-result-object v9

    .line 453
    .local v9, "embeddedVCard":Lezvcard/VCard;
    invoke-virtual {v7, v9}, Lezvcard/io/EmbeddedVCardException;->injectVCard(Lezvcard/VCard;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 455
    invoke-virtual {v8}, Lezvcard/io/html/HCardReader;->getWarnings()Ljava/util/List;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    .restart local v13    # "i$":Ljava/util/Iterator;
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    .line 456
    .local v18, "w":Ljava/lang/String;
    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "Problem unmarshalling nested vCard value: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v0, p0

    move-object/from16 v1, v20

    invoke-direct {v0, v1, v5}, Lezvcard/io/html/HCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 418
    .end local v7    # "e":Lezvcard/io/EmbeddedVCardException;
    .end local v8    # "embeddedReader":Lezvcard/io/html/HCardReader;
    .end local v9    # "embeddedVCard":Lezvcard/VCard;
    .end local v18    # "w":Ljava/lang/String;
    .restart local v14    # "nn":Lezvcard/property/Nickname;
    .restart local v16    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :cond_9
    :try_start_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->nickname:Lezvcard/property/Nickname;

    move-object/from16 v20, v0

    invoke-virtual/range {v20 .. v20}, Lezvcard/property/Nickname;->getValues()Ljava/util/List;

    move-result-object v20

    invoke-virtual {v14}, Lezvcard/property/Nickname;->getValues()Ljava/util/List;

    move-result-object v21

    invoke-interface/range {v20 .. v21}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_0

    .line 424
    .end local v14    # "nn":Lezvcard/property/Nickname;
    :cond_a
    instance-of v0, v15, Lezvcard/property/Categories;

    move/from16 v20, v0

    if-eqz v20, :cond_7

    .line 425
    move-object v0, v15

    check-cast v0, Lezvcard/property/Categories;

    move-object v3, v0

    .line 426
    .local v3, "c":Lezvcard/property/Categories;
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->categories:Lezvcard/property/Categories;

    move-object/from16 v20, v0

    if-nez v20, :cond_b

    .line 427
    move-object/from16 v0, p0

    iput-object v3, v0, Lezvcard/io/html/HCardReader;->categories:Lezvcard/property/Categories;

    .line 428
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->curVCard:Lezvcard/VCard;

    move-object/from16 v20, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->categories:Lezvcard/property/Categories;

    move-object/from16 v21, v0

    invoke-virtual/range {v20 .. v21}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    goto/16 :goto_0

    .line 430
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/html/HCardReader;->categories:Lezvcard/property/Categories;

    move-object/from16 v20, v0

    invoke-virtual/range {v20 .. v20}, Lezvcard/property/Categories;->getValues()Ljava/util/List;

    move-result-object v20

    invoke-virtual {v3}, Lezvcard/property/Categories;->getValues()Ljava/util/List;

    move-result-object v21

    invoke-interface/range {v20 .. v21}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_5
    .catch Lezvcard/io/SkipMeException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Lezvcard/io/CannotParseException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_5 .. :try_end_5} :catch_3

    goto/16 :goto_0

    .line 455
    .end local v3    # "c":Lezvcard/property/Categories;
    .end local v13    # "i$":Ljava/util/Iterator;
    .end local v16    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    .restart local v7    # "e":Lezvcard/io/EmbeddedVCardException;
    .restart local v8    # "embeddedReader":Lezvcard/io/html/HCardReader;
    :catchall_0
    move-exception v20

    invoke-virtual {v8}, Lezvcard/io/html/HCardReader;->getWarnings()Ljava/util/List;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .local v12, "i$":Ljava/util/Iterator;
    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_c

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    .line 456
    .restart local v18    # "w":Ljava/lang/String;
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    const-string v22, "Problem unmarshalling nested vCard value: "

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    move-object/from16 v0, v21

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-direct {v0, v1, v5}, Lezvcard/io/html/HCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .end local v18    # "w":Ljava/lang/String;
    :cond_c
    throw v20

    .line 464
    .end local v5    # "className":Ljava/lang/String;
    .end local v7    # "e":Lezvcard/io/EmbeddedVCardException;
    .end local v8    # "embeddedReader":Lezvcard/io/html/HCardReader;
    .end local v12    # "i$":Ljava/util/Iterator;
    .end local v15    # "property":Lezvcard/property/VCardProperty;
    .end local v17    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :cond_d
    invoke-virtual/range {p1 .. p1}, Lorg/jsoup/nodes/Element;->children()Lorg/jsoup/select/Elements;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lorg/jsoup/select/Elements;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .restart local v12    # "i$":Ljava/util/Iterator;
    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_e

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jsoup/nodes/Element;

    .line 465
    .local v4, "child":Lorg/jsoup/nodes/Element;
    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lezvcard/io/html/HCardReader;->visit(Lorg/jsoup/nodes/Element;)V

    goto :goto_6

    .line 467
    .end local v4    # "child":Lorg/jsoup/nodes/Element;
    :cond_e
    return-void

    .line 374
    .end local v12    # "i$":Ljava/util/Iterator;
    .restart local v5    # "className":Ljava/lang/String;
    .restart local v10    # "href":Ljava/lang/String;
    .restart local v17    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :catch_4
    move-exception v20

    goto/16 :goto_1
.end method


# virtual methods
.method public getScribeIndex()Lezvcard/io/scribe/ScribeIndex;
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

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
    .line 295
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lezvcard/io/html/HCardReader;->warnings:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public readNext()Lezvcard/VCard;
    .locals 10

    .prologue
    const/4 v7, 0x0

    .line 303
    const/4 v6, 0x0

    .line 304
    .local v6, "vcardElement":Lorg/jsoup/nodes/Element;
    :cond_0
    :goto_0
    iget-object v8, p0, Lezvcard/io/html/HCardReader;->it:Ljava/util/Iterator;

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    if-nez v6, :cond_1

    .line 305
    iget-object v8, p0, Lezvcard/io/html/HCardReader;->it:Ljava/util/Iterator;

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .end local v6    # "vcardElement":Lorg/jsoup/nodes/Element;
    check-cast v6, Lorg/jsoup/nodes/Element;

    .line 308
    .restart local v6    # "vcardElement":Lorg/jsoup/nodes/Element;
    iget-object v8, p0, Lezvcard/io/html/HCardReader;->vcardElements:Lorg/jsoup/select/Elements;

    invoke-static {v6, v8}, Lezvcard/util/HtmlUtils;->isChildOf(Lorg/jsoup/nodes/Element;Lorg/jsoup/select/Elements;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 309
    const/4 v6, 0x0

    goto :goto_0

    .line 312
    :cond_1
    if-nez v6, :cond_2

    .line 347
    :goto_1
    return-object v7

    .line 316
    :cond_2
    iget-object v8, p0, Lezvcard/io/html/HCardReader;->warnings:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 317
    iget-object v8, p0, Lezvcard/io/html/HCardReader;->labels:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 318
    iput-object v7, p0, Lezvcard/io/html/HCardReader;->nickname:Lezvcard/property/Nickname;

    .line 319
    iput-object v7, p0, Lezvcard/io/html/HCardReader;->categories:Lezvcard/property/Categories;

    .line 321
    new-instance v7, Lezvcard/VCard;

    invoke-direct {v7}, Lezvcard/VCard;-><init>()V

    iput-object v7, p0, Lezvcard/io/html/HCardReader;->curVCard:Lezvcard/VCard;

    .line 322
    iget-object v7, p0, Lezvcard/io/html/HCardReader;->curVCard:Lezvcard/VCard;

    sget-object v8, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    invoke-virtual {v7, v8}, Lezvcard/VCard;->setVersion(Lezvcard/VCardVersion;)V

    .line 323
    iget-object v7, p0, Lezvcard/io/html/HCardReader;->pageUrl:Ljava/lang/String;

    if-eqz v7, :cond_3

    .line 324
    iget-object v7, p0, Lezvcard/io/html/HCardReader;->curVCard:Lezvcard/VCard;

    new-instance v8, Lezvcard/property/Source;

    iget-object v9, p0, Lezvcard/io/html/HCardReader;->pageUrl:Ljava/lang/String;

    invoke-direct {v8, v9}, Lezvcard/property/Source;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Lezvcard/VCard;->addSource(Lezvcard/property/Source;)V

    .line 328
    :cond_3
    invoke-virtual {v6}, Lorg/jsoup/nodes/Element;->children()Lorg/jsoup/select/Elements;

    move-result-object v7

    invoke-virtual {v7}, Lorg/jsoup/select/Elements;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jsoup/nodes/Element;

    .line 329
    .local v1, "child":Lorg/jsoup/nodes/Element;
    invoke-direct {p0, v1}, Lezvcard/io/html/HCardReader;->visit(Lorg/jsoup/nodes/Element;)V

    goto :goto_2

    .line 333
    .end local v1    # "child":Lorg/jsoup/nodes/Element;
    :cond_4
    iget-object v7, p0, Lezvcard/io/html/HCardReader;->labels:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .end local v2    # "i$":Ljava/util/Iterator;
    :cond_5
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lezvcard/property/Label;

    .line 334
    .local v4, "label":Lezvcard/property/Label;
    const/4 v5, 0x1

    .line 335
    .local v5, "orphaned":Z
    iget-object v7, p0, Lezvcard/io/html/HCardReader;->curVCard:Lezvcard/VCard;

    invoke-virtual {v7}, Lezvcard/VCard;->getAddresses()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/property/Address;

    .line 336
    .local v0, "adr":Lezvcard/property/Address;
    invoke-virtual {v0}, Lezvcard/property/Address;->getLabel()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_6

    invoke-virtual {v0}, Lezvcard/property/Address;->getTypes()Ljava/util/Set;

    move-result-object v7

    invoke-virtual {v4}, Lezvcard/property/Label;->getTypes()Ljava/util/Set;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 337
    invoke-virtual {v4}, Lezvcard/property/Label;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0, v7}, Lezvcard/property/Address;->setLabel(Ljava/lang/String;)V

    .line 338
    const/4 v5, 0x0

    .line 342
    .end local v0    # "adr":Lezvcard/property/Address;
    :cond_7
    if-eqz v5, :cond_5

    .line 343
    iget-object v7, p0, Lezvcard/io/html/HCardReader;->curVCard:Lezvcard/VCard;

    invoke-virtual {v7, v4}, Lezvcard/VCard;->addOrphanedLabel(Lezvcard/property/Label;)V

    goto :goto_3

    .line 347
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v4    # "label":Lezvcard/property/Label;
    .end local v5    # "orphaned":Z
    :cond_8
    iget-object v7, p0, Lezvcard/io/html/HCardReader;->curVCard:Lezvcard/VCard;

    goto/16 :goto_1
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
    .line 270
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, p1}, Lezvcard/io/scribe/ScribeIndex;->register(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 271
    return-void
.end method

.method public setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V
    .locals 0
    .param p1, "index"    # Lezvcard/io/scribe/ScribeIndex;

    .prologue
    .line 286
    iput-object p1, p0, Lezvcard/io/html/HCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 287
    return-void
.end method
