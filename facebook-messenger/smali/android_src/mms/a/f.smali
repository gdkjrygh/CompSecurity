.class public Landroid_src/mms/a/f;
.super Ljava/lang/Object;
.source "NodeListImpl.java"

# interfaces
.implements Lorg/w3c/dom/NodeList;


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/w3c/dom/Node;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/w3c/dom/Node;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lorg/w3c/dom/Node;

.field private d:Ljava/lang/String;

.field private e:Z


# direct methods
.method public constructor <init>(Lorg/w3c/dom/Node;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Landroid_src/mms/a/f;->c:Lorg/w3c/dom/Node;

    .line 47
    iput-object p2, p0, Landroid_src/mms/a/f;->d:Ljava/lang/String;

    .line 48
    iput-boolean p3, p0, Landroid_src/mms/a/f;->e:Z

    .line 49
    return-void
.end method

.method private a(Lorg/w3c/dom/Node;)V
    .locals 3

    .prologue
    .line 104
    iget-object v0, p0, Landroid_src/mms/a/f;->c:Lorg/w3c/dom/Node;

    if-ne p1, v0, :cond_2

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid_src/mms/a/f;->a:Ljava/util/ArrayList;

    .line 113
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v0

    .line 117
    :goto_1
    if-eqz v0, :cond_6

    .line 118
    iget-boolean v1, p0, Landroid_src/mms/a/f;->e:Z

    if-eqz v1, :cond_4

    .line 119
    invoke-direct {p0, v0}, Landroid_src/mms/a/f;->a(Lorg/w3c/dom/Node;)V

    .line 125
    :cond_1
    :goto_2
    invoke-interface {v0}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v0

    goto :goto_1

    .line 107
    :cond_2
    iget-object v0, p0, Landroid_src/mms/a/f;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroid_src/mms/a/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    :cond_3
    iget-object v0, p0, Landroid_src/mms/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 121
    :cond_4
    iget-object v1, p0, Landroid_src/mms/a/f;->d:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-interface {v0}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroid_src/mms/a/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 122
    :cond_5
    iget-object v1, p0, Landroid_src/mms/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 127
    :cond_6
    return-void
.end method


# virtual methods
.method public getLength()I
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Landroid_src/mms/a/f;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 65
    iget-object v0, p0, Landroid_src/mms/a/f;->c:Lorg/w3c/dom/Node;

    invoke-direct {p0, v0}, Landroid_src/mms/a/f;->a(Lorg/w3c/dom/Node;)V

    .line 66
    iget-object v0, p0, Landroid_src/mms/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 68
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid_src/mms/a/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0
.end method

.method public item(I)Lorg/w3c/dom/Node;
    .locals 2

    .prologue
    .line 73
    const/4 v1, 0x0

    .line 74
    iget-object v0, p0, Landroid_src/mms/a/f;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 75
    iget-object v0, p0, Landroid_src/mms/a/f;->c:Lorg/w3c/dom/Node;

    invoke-direct {p0, v0}, Landroid_src/mms/a/f;->a(Lorg/w3c/dom/Node;)V

    .line 77
    :try_start_0
    iget-object v0, p0, Landroid_src/mms/a/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Node;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    :goto_0
    return-object v0

    .line 78
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 80
    goto :goto_0

    .line 83
    :cond_0
    :try_start_1
    iget-object v0, p0, Landroid_src/mms/a/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Node;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 84
    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method
