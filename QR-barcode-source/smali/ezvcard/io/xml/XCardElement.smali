.class public Lezvcard/io/xml/XCardElement;
.super Ljava/lang/Object;
.source "XCardElement.java"


# instance fields
.field private final document:Lorg/w3c/dom/Document;

.field private final element:Lorg/w3c/dom/Element;

.field private final namespace:Ljava/lang/String;

.field private final version:Lezvcard/VCardVersion;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "propertyName"    # Ljava/lang/String;

    .prologue
    .line 59
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-direct {p0, p1, v0}, Lezvcard/io/xml/XCardElement;-><init>(Ljava/lang/String;Lezvcard/VCardVersion;)V

    .line 60
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lezvcard/VCardVersion;)V
    .locals 2
    .param p1, "propertyName"    # Ljava/lang/String;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p2, p0, Lezvcard/io/xml/XCardElement;->version:Lezvcard/VCardVersion;

    .line 69
    invoke-virtual {p2}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/xml/XCardElement;->namespace:Ljava/lang/String;

    .line 70
    invoke-static {}, Lezvcard/util/XmlUtils;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/xml/XCardElement;->document:Lorg/w3c/dom/Document;

    .line 71
    iget-object v0, p0, Lezvcard/io/xml/XCardElement;->document:Lorg/w3c/dom/Document;

    iget-object v1, p0, Lezvcard/io/xml/XCardElement;->namespace:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lorg/w3c/dom/Document;->createElementNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/xml/XCardElement;->element:Lorg/w3c/dom/Element;

    .line 72
    iget-object v0, p0, Lezvcard/io/xml/XCardElement;->document:Lorg/w3c/dom/Document;

    iget-object v1, p0, Lezvcard/io/xml/XCardElement;->element:Lorg/w3c/dom/Element;

    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 73
    return-void
.end method

.method public constructor <init>(Lorg/w3c/dom/Element;)V
    .locals 1
    .param p1, "element"    # Lorg/w3c/dom/Element;

    .prologue
    .line 80
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-direct {p0, p1, v0}, Lezvcard/io/xml/XCardElement;-><init>(Lorg/w3c/dom/Element;Lezvcard/VCardVersion;)V

    .line 81
    return-void
.end method

.method public constructor <init>(Lorg/w3c/dom/Element;Lezvcard/VCardVersion;)V
    .locals 1
    .param p1, "element"    # Lorg/w3c/dom/Element;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/xml/XCardElement;->document:Lorg/w3c/dom/Document;

    .line 90
    iput-object p1, p0, Lezvcard/io/xml/XCardElement;->element:Lorg/w3c/dom/Element;

    .line 91
    iput-object p2, p0, Lezvcard/io/xml/XCardElement;->version:Lezvcard/VCardVersion;

    .line 92
    invoke-virtual {p2}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/xml/XCardElement;->namespace:Ljava/lang/String;

    .line 93
    return-void
.end method

.method private children()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/w3c/dom/Element;",
            ">;"
        }
    .end annotation

    .prologue
    .line 225
    iget-object v0, p0, Lezvcard/io/xml/XCardElement;->element:Lorg/w3c/dom/Element;

    invoke-interface {v0}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v0

    invoke-static {v0}, Lezvcard/util/XmlUtils;->toElementList(Lorg/w3c/dom/NodeList;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private toLocalName(Lezvcard/VCardDataType;)Ljava/lang/String;
    .locals 1
    .param p1, "dataType"    # Lezvcard/VCardDataType;

    .prologue
    .line 229
    if-nez p1, :cond_0

    const-string v0, "unknown"

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lezvcard/VCardDataType;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public all(Lezvcard/VCardDataType;)Ljava/util/List;
    .locals 2
    .param p1, "dataType"    # Lezvcard/VCardDataType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/VCardDataType;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 131
    invoke-direct {p0, p1}, Lezvcard/io/xml/XCardElement;->toLocalName(Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v0

    .line 132
    .local v0, "dataTypeStr":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lezvcard/io/xml/XCardElement;->all(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method public all(Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .param p1, "localName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 141
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .local v1, "childrenText":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Lezvcard/io/xml/XCardElement;->children()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Element;

    .line 143
    .local v0, "child":Lorg/w3c/dom/Element;
    invoke-interface {v0}, Lorg/w3c/dom/Element;->getLocalName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lezvcard/io/xml/XCardElement;->namespace:Ljava/lang/String;

    invoke-interface {v0}, Lorg/w3c/dom/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 144
    invoke-interface {v0}, Lorg/w3c/dom/Element;->getTextContent()Ljava/lang/String;

    move-result-object v3

    .line 145
    .local v3, "text":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_0

    .line 146
    invoke-interface {v0}, Lorg/w3c/dom/Element;->getTextContent()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 150
    .end local v0    # "child":Lorg/w3c/dom/Element;
    .end local v3    # "text":Ljava/lang/String;
    :cond_1
    return-object v1
.end method

.method public append(Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;
    .locals 6
    .param p1, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lorg/w3c/dom/Element;",
            ">;"
        }
    .end annotation

    .prologue
    .line 184
    .local p2, "values":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 185
    const/4 v4, 0x0

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p0, p1, v4}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    .line 186
    .local v0, "element":Lorg/w3c/dom/Element;
    const/4 v4, 0x1

    new-array v4, v4, [Lorg/w3c/dom/Element;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 193
    .end local v0    # "element":Lorg/w3c/dom/Element;
    :cond_0
    return-object v1

    .line 189
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 190
    .local v1, "elements":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 191
    .local v3, "value":Ljava/lang/String;
    invoke-virtual {p0, p1, v3}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;
    .locals 2
    .param p1, "dataType"    # Lezvcard/VCardDataType;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 160
    invoke-direct {p0, p1}, Lezvcard/io/xml/XCardElement;->toLocalName(Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v0

    .line 161
    .local v0, "dataTypeStr":Ljava/lang/String;
    invoke-virtual {p0, v0, p2}, Lezvcard/io/xml/XCardElement;->append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v1

    return-object v1
.end method

.method public append(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 171
    iget-object v1, p0, Lezvcard/io/xml/XCardElement;->document:Lorg/w3c/dom/Document;

    iget-object v2, p0, Lezvcard/io/xml/XCardElement;->namespace:Ljava/lang/String;

    invoke-interface {v1, v2, p1}, Lorg/w3c/dom/Document;->createElementNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    .line 172
    .local v0, "child":Lorg/w3c/dom/Element;
    invoke-interface {v0, p2}, Lorg/w3c/dom/Element;->setTextContent(Ljava/lang/String;)V

    .line 173
    iget-object v1, p0, Lezvcard/io/xml/XCardElement;->element:Lorg/w3c/dom/Element;

    invoke-interface {v1, v0}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 174
    return-object v0
.end method

.method public document()Lorg/w3c/dom/Document;
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lezvcard/io/xml/XCardElement;->document:Lorg/w3c/dom/Document;

    return-object v0
.end method

.method public element()Lorg/w3c/dom/Element;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lezvcard/io/xml/XCardElement;->element:Lorg/w3c/dom/Element;

    return-object v0
.end method

.method public varargs first([Lezvcard/VCardDataType;)Ljava/lang/String;
    .locals 4
    .param p1, "dataTypes"    # [Lezvcard/VCardDataType;

    .prologue
    .line 102
    array-length v3, p1

    new-array v2, v3, [Ljava/lang/String;

    .line 103
    .local v2, "names":[Ljava/lang/String;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v3, p1

    if-ge v1, v3, :cond_0

    .line 104
    aget-object v0, p1, v1

    .line 105
    .local v0, "dataType":Lezvcard/VCardDataType;
    invoke-direct {p0, v0}, Lezvcard/io/xml/XCardElement;->toLocalName(Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    .line 103
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 107
    .end local v0    # "dataType":Lezvcard/VCardDataType;
    :cond_0
    invoke-virtual {p0, v2}, Lezvcard/io/xml/XCardElement;->first([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method public varargs first([Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "names"    # [Ljava/lang/String;

    .prologue
    .line 116
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 117
    .local v2, "localNamesList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Lezvcard/io/xml/XCardElement;->children()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Element;

    .line 118
    .local v0, "child":Lorg/w3c/dom/Element;
    invoke-interface {v0}, Lorg/w3c/dom/Element;->getLocalName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lezvcard/io/xml/XCardElement;->namespace:Ljava/lang/String;

    invoke-interface {v0}, Lorg/w3c/dom/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 119
    invoke-interface {v0}, Lorg/w3c/dom/Element;->getTextContent()Ljava/lang/String;

    move-result-object v3

    .line 122
    .end local v0    # "child":Lorg/w3c/dom/Element;
    :goto_0
    return-object v3

    :cond_1
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public version()Lezvcard/VCardVersion;
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lezvcard/io/xml/XCardElement;->version:Lezvcard/VCardVersion;

    return-object v0
.end method
