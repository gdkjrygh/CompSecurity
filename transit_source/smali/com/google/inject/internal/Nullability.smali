.class public Lcom/google/inject/internal/Nullability;
.super Ljava/lang/Object;
.source "Nullability.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static allowsNull([Ljava/lang/annotation/Annotation;)Z
    .locals 7
    .param p0, "annotations"    # [Ljava/lang/annotation/Annotation;

    .prologue
    .line 26
    move-object v1, p0

    .local v1, "arr$":[Ljava/lang/annotation/Annotation;
    array-length v3, v1

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_2

    aget-object v0, v1, v2

    .line 27
    .local v0, "a":Ljava/lang/annotation/Annotation;
    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v4

    .line 31
    .local v4, "type":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    const-string v5, "Nullable"

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const-class v5, Lcom/google/inject/internal/util/$Nullable;

    if-ne v4, v5, :cond_1

    .line 32
    :cond_0
    const/4 v5, 0x1

    .line 35
    .end local v0    # "a":Ljava/lang/annotation/Annotation;
    .end local v4    # "type":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    :goto_1
    return v5

    .line 26
    .restart local v0    # "a":Ljava/lang/annotation/Annotation;
    .restart local v4    # "type":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 35
    .end local v0    # "a":Ljava/lang/annotation/Annotation;
    .end local v4    # "type":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    :cond_2
    const/4 v5, 0x0

    goto :goto_1
.end method
