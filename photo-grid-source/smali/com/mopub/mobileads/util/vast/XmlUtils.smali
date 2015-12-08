.class final Lcom/mopub/mobileads/util/vast/XmlUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 218
    .line 1222
    new-instance v3, Lcom/mopub/mobileads/util/vast/f;

    invoke-direct {v3}, Lcom/mopub/mobileads/util/vast/f;-><init>()V

    .line 2192
    if-eqz p0, :cond_1

    .line 2196
    invoke-interface {p0, p1}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v4

    .line 2197
    if-eqz v4, :cond_1

    .line 2203
    const/4 v0, 0x0

    :goto_0
    invoke-interface {v4}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2204
    invoke-interface {v4, v0}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v1

    .line 2206
    if-eqz v1, :cond_0

    invoke-static {v1, v2, v2}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 2207
    invoke-interface {v3, v1}, Lcom/mopub/mobileads/util/vast/XmlUtils$NodeProcessor;->process(Lorg/w3c/dom/Node;)Ljava/lang/Object;

    move-result-object v1

    .line 2208
    if-eqz v1, :cond_0

    move-object v0, v1

    .line 1222
    :goto_1
    check-cast v0, Ljava/lang/String;

    .line 218
    return-object v0

    .line 2203
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move-object v0, v2

    .line 2214
    goto :goto_1
.end method

.method static a(Lorg/w3c/dom/Node;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    if-eqz p0, :cond_0

    invoke-interface {p0}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v0

    invoke-interface {v0}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 105
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v0

    invoke-interface {v0}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 107
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static a(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Document;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 235
    new-instance v0, Lcom/mopub/mobileads/util/vast/g;

    invoke-direct {v0}, Lcom/mopub/mobileads/util/vast/g;-><init>()V

    invoke-static {p0, p1, p2, p3, v0}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mopub/mobileads/util/vast/XmlUtils$NodeProcessor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mopub/mobileads/util/vast/XmlUtils$NodeProcessor;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/w3c/dom/Document;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/mopub/mobileads/util/vast/XmlUtils$NodeProcessor",
            "<TT;>;)",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 150
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 152
    if-nez p0, :cond_0

    move-object v0, v2

    .line 174
    :goto_0
    return-object v0

    .line 156
    :cond_0
    invoke-interface {p0, p1}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v3

    .line 157
    if-nez v3, :cond_1

    move-object v0, v2

    .line 158
    goto :goto_0

    .line 161
    :cond_1
    if-nez p3, :cond_3

    const/4 v0, 0x0

    .line 163
    :goto_1
    invoke-interface {v3}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v4

    if-ge v1, v4, :cond_4

    .line 164
    invoke-interface {v3, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 166
    if-eqz v4, :cond_2

    invoke-static {v4, p2, v0}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 167
    invoke-interface {p4, v4}, Lcom/mopub/mobileads/util/vast/XmlUtils$NodeProcessor;->process(Lorg/w3c/dom/Node;)Ljava/lang/Object;

    move-result-object v4

    .line 168
    if-eqz v4, :cond_2

    .line 169
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 161
    :cond_3
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    aput-object p3, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_4
    move-object v0, v2

    .line 174
    goto :goto_0
.end method

.method static a(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Node;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lorg/w3c/dom/Node;",
            ">;"
        }
    .end annotation

    .prologue
    .line 65
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 66
    :cond_0
    const/4 v0, 0x0

    .line 78
    :goto_0
    return-object v0

    .line 69
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v2

    .line 71
    const/4 v0, 0x0

    :goto_1
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 72
    invoke-interface {v2, v0}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v3

    .line 73
    invoke-interface {v3}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v3, p2, p3}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/List;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 75
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    move-object v0, v1

    .line 78
    goto :goto_0
.end method

.method static a(Lorg/w3c/dom/Node;Ljava/lang/String;)Lorg/w3c/dom/Node;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 21
    .line 1039
    if-nez p0, :cond_1

    .line 1045
    :cond_0
    :goto_0
    return-object v0

    .line 1043
    :cond_1
    invoke-static {p0, p1, v0, v0}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 1044
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 1045
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Node;

    goto :goto_0
.end method

.method private static a(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Node;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 86
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 98
    :cond_0
    :goto_0
    return v0

    .line 90
    :cond_1
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    invoke-interface {v1, p1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v1

    .line 93
    if-eqz v1, :cond_2

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 98
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static b(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 111
    if-nez p0, :cond_0

    .line 118
    :goto_0
    return-object v0

    .line 116
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->c(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 118
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static b(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Document;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lorg/w3c/dom/Node;",
            ">;"
        }
    .end annotation

    .prologue
    .line 244
    new-instance v0, Lcom/mopub/mobileads/util/vast/h;

    invoke-direct {v0}, Lcom/mopub/mobileads/util/vast/h;-><init>()V

    invoke-static {p0, p1, p2, p3, v0}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mopub/mobileads/util/vast/XmlUtils$NodeProcessor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static c(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 123
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 132
    :cond_0
    :goto_0
    return-object v0

    .line 127
    :cond_1
    invoke-interface {p0}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v1

    .line 128
    invoke-interface {v1, p1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v1

    .line 129
    if-eqz v1, :cond_0

    .line 130
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
