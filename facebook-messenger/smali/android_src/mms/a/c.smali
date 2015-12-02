.class public Landroid_src/mms/a/c;
.super Landroid_src/mms/a/e;
.source "ElementImpl.java"

# interfaces
.implements Lorg/w3c/dom/Element;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Lorg/w3c/dom/NamedNodeMap;


# direct methods
.method protected constructor <init>(Landroid_src/mms/a/b;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0, p1}, Landroid_src/mms/a/e;-><init>(Landroid_src/mms/a/b;)V

    .line 29
    new-instance v0, Landroid_src/mms/a/d;

    invoke-direct {v0}, Landroid_src/mms/a/d;-><init>()V

    iput-object v0, p0, Landroid_src/mms/a/c;->c:Lorg/w3c/dom/NamedNodeMap;

    .line 37
    iput-object p2, p0, Landroid_src/mms/a/c;->b:Ljava/lang/String;

    .line 38
    return-void
.end method


# virtual methods
.method public getAttribute(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 45
    invoke-virtual {p0, p1}, Landroid_src/mms/a/c;->getAttributeNode(Ljava/lang/String;)Lorg/w3c/dom/Attr;

    move-result-object v1

    .line 46
    const-string v0, ""

    .line 47
    if-eqz v1, :cond_0

    .line 48
    invoke-interface {v1}, Lorg/w3c/dom/Attr;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 50
    :cond_0
    return-object v0
.end method

.method public getAttributeNS(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAttributeNode(Ljava/lang/String;)Lorg/w3c/dom/Attr;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Landroid_src/mms/a/c;->c:Lorg/w3c/dom/NamedNodeMap;

    invoke-interface {v0, p1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Attr;

    return-object v0
.end method

.method public getAttributeNodeNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Attr;
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAttributes()Lorg/w3c/dom/NamedNodeMap;
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Landroid_src/mms/a/c;->c:Lorg/w3c/dom/NamedNodeMap;

    return-object v0
.end method

.method public getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;
    .locals 2

    .prologue
    .line 68
    new-instance v0, Landroid_src/mms/a/f;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Landroid_src/mms/a/f;-><init>(Lorg/w3c/dom/Node;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public getElementsByTagNameNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/NodeList;
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    return-object v0
.end method

.method public getNodeName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Landroid_src/mms/a/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getNodeType()S
    .locals 1

    .prologue
    .line 136
    const/4 v0, 0x1

    return v0
.end method

.method public getSchemaTypeInfo()Lorg/w3c/dom/TypeInfo;
    .locals 1

    .prologue
    .line 156
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTagName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Landroid_src/mms/a/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hasAttribute(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0, p1}, Landroid_src/mms/a/c;->getAttributeNode(Ljava/lang/String;)Lorg/w3c/dom/Attr;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasAttributeNS(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 86
    const/4 v0, 0x0

    return v0
.end method

.method public hasAttributes()Z
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Landroid_src/mms/a/c;->c:Lorg/w3c/dom/NamedNodeMap;

    invoke-interface {v0}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public removeAttribute(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 92
    return-void
.end method

.method public removeAttributeNS(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 98
    return-void
.end method

.method public removeAttributeNode(Lorg/w3c/dom/Attr;)Lorg/w3c/dom/Attr;
    .locals 1

    .prologue
    .line 102
    const/4 v0, 0x0

    return-object v0
.end method

.method public setAttribute(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 106
    invoke-virtual {p0, p1}, Landroid_src/mms/a/c;->getAttributeNode(Ljava/lang/String;)Lorg/w3c/dom/Attr;

    move-result-object v0

    .line 107
    if-nez v0, :cond_0

    .line 108
    iget-object v0, p0, Landroid_src/mms/a/c;->a:Landroid_src/mms/a/b;

    invoke-virtual {v0, p1}, Landroid_src/mms/a/b;->createAttribute(Ljava/lang/String;)Lorg/w3c/dom/Attr;

    move-result-object v0

    .line 110
    :cond_0
    invoke-interface {v0, p2}, Lorg/w3c/dom/Attr;->setNodeValue(Ljava/lang/String;)V

    .line 111
    iget-object v1, p0, Landroid_src/mms/a/c;->c:Lorg/w3c/dom/NamedNodeMap;

    invoke-interface {v1, v0}, Lorg/w3c/dom/NamedNodeMap;->setNamedItem(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 112
    return-void
.end method

.method public setAttributeNS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 118
    return-void
.end method

.method public setAttributeNode(Lorg/w3c/dom/Attr;)Lorg/w3c/dom/Attr;
    .locals 1

    .prologue
    .line 122
    const/4 v0, 0x0

    return-object v0
.end method

.method public setAttributeNodeNS(Lorg/w3c/dom/Attr;)Lorg/w3c/dom/Attr;
    .locals 1

    .prologue
    .line 127
    const/4 v0, 0x0

    return-object v0
.end method

.method public setIdAttribute(Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 160
    new-instance v0, Lorg/w3c/dom/DOMException;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/w3c/dom/DOMException;-><init>(SLjava/lang/String;)V

    throw v0
.end method

.method public setIdAttributeNS(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 165
    new-instance v0, Lorg/w3c/dom/DOMException;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/w3c/dom/DOMException;-><init>(SLjava/lang/String;)V

    throw v0
.end method

.method public setIdAttributeNode(Lorg/w3c/dom/Attr;Z)V
    .locals 3

    .prologue
    .line 170
    new-instance v0, Lorg/w3c/dom/DOMException;

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/w3c/dom/DOMException;-><init>(SLjava/lang/String;)V

    throw v0
.end method
