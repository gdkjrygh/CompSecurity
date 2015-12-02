.class final Lcom/facebook/common/json/jsonmirror/a;
.super Ljava/lang/Object;
.source "JMAutogen.java"

# interfaces
.implements Lcom/facebook/common/w/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/common/w/g",
        "<",
        "Ljava/lang/annotation/Annotation;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Class;


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 207
    iput-object p1, p0, Lcom/facebook/common/json/jsonmirror/a;->a:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/annotation/Annotation;
    .locals 6

    .prologue
    .line 210
    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v3

    .line 211
    const/4 v1, 0x0

    .line 213
    array-length v4, v3

    const/4 v0, 0x0

    move v2, v0

    move-object v0, v1

    :goto_0
    if-ge v2, v4, :cond_3

    aget-object v1, v3, v2

    .line 215
    instance-of v5, v1, Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;

    if-nez v5, :cond_0

    instance-of v5, v1, Lcom/facebook/common/json/jsonmirror/JMAutogen$ExplicitType;

    if-nez v5, :cond_0

    instance-of v5, v1, Lcom/facebook/common/json/jsonmirror/JMAutogen$ListType;

    if-nez v5, :cond_0

    instance-of v5, v1, Lcom/facebook/common/json/jsonmirror/JMAutogen$DynamicKeyDictType;

    if-nez v5, :cond_0

    instance-of v5, v1, Lcom/facebook/common/json/jsonmirror/JMAutogen$EscapedObjectType;

    if-eqz v5, :cond_2

    .line 218
    :cond_0
    if-eqz v0, :cond_1

    .line 219
    new-instance v0, Lcom/facebook/common/json/jsonmirror/f;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/facebook/common/json/jsonmirror/a;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " has more than one JM annotation"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/common/json/jsonmirror/f;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v0, v1

    .line 213
    :cond_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 226
    :cond_3
    return-object v0
.end method

.method public synthetic b(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 207
    invoke-virtual {p0, p1}, Lcom/facebook/common/json/jsonmirror/a;->a(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    return-object v0
.end method
