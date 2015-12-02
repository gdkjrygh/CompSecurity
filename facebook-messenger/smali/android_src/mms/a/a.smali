.class public Landroid_src/mms/a/a;
.super Landroid_src/mms/a/e;
.source "AttrImpl.java"

# interfaces
.implements Lorg/w3c/dom/Attr;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Landroid_src/mms/a/b;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Landroid_src/mms/a/e;-><init>(Landroid_src/mms/a/b;)V

    .line 36
    iput-object p2, p0, Landroid_src/mms/a/a;->b:Ljava/lang/String;

    .line 37
    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Landroid_src/mms/a/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getNextSibling()Lorg/w3c/dom/Node;
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x0

    return-object v0
.end method

.method public getNodeName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Landroid_src/mms/a/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getNodeType()S
    .locals 1

    .prologue
    .line 78
    const/4 v0, 0x2

    return v0
.end method

.method public getOwnerElement()Lorg/w3c/dom/Element;
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x0

    return-object v0
.end method

.method public getParentNode()Lorg/w3c/dom/Node;
    .locals 1

    .prologue
    .line 83
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPreviousSibling()Lorg/w3c/dom/Node;
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSchemaTypeInfo()Lorg/w3c/dom/TypeInfo;
    .locals 1

    .prologue
    .line 102
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSpecified()Z
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Landroid_src/mms/a/a;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Landroid_src/mms/a/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public isId()Z
    .locals 1

    .prologue
    .line 106
    const/4 v0, 0x0

    return v0
.end method

.method public setNodeValue(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 98
    invoke-virtual {p0, p1}, Landroid_src/mms/a/a;->setValue(Ljava/lang/String;)V

    .line 99
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Landroid_src/mms/a/a;->c:Ljava/lang/String;

    .line 65
    return-void
.end method
