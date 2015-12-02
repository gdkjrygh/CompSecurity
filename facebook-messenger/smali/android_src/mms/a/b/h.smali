.class public Landroid_src/mms/a/b/h;
.super Landroid_src/mms/a/b/g;
.source "SmilLayoutElementImpl.java"

# interfaces
.implements Lorg/a/a/b/h;


# direct methods
.method constructor <init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Landroid_src/mms/a/b/g;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    .line 30
    return-void
.end method


# virtual methods
.method public b()Lorg/a/a/b/n;
    .locals 7

    .prologue
    .line 46
    invoke-virtual {p0}, Landroid_src/mms/a/b/h;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v2

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v3

    .line 49
    const/4 v0, 0x0

    move v6, v0

    move-object v0, v1

    move v1, v6

    :goto_0
    if-ge v1, v3, :cond_1

    .line 50
    invoke-interface {v2, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "root-layout"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 51
    invoke-interface {v2, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/n;

    .line 49
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 54
    :cond_1
    if-nez v0, :cond_2

    .line 56
    invoke-virtual {p0}, Landroid_src/mms/a/b/h;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    const-string v1, "root-layout"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/n;

    .line 57
    invoke-static {}, Landroid_src/mms/c/a;->a()Landroid_src/mms/c/a;

    move-result-object v1

    invoke-virtual {v1}, Landroid_src/mms/c/a;->b()Landroid_src/mms/c/b;

    move-result-object v1

    invoke-interface {v1}, Landroid_src/mms/c/b;->a()I

    move-result v1

    invoke-interface {v0, v1}, Lorg/a/a/b/n;->b(I)V

    .line 58
    invoke-static {}, Landroid_src/mms/c/a;->a()Landroid_src/mms/c/a;

    move-result-object v1

    invoke-virtual {v1}, Landroid_src/mms/c/a;->b()Landroid_src/mms/c/b;

    move-result-object v1

    invoke-interface {v1}, Landroid_src/mms/c/b;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lorg/a/a/b/n;->a(I)V

    .line 59
    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/h;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 61
    :cond_2
    return-object v0
.end method
