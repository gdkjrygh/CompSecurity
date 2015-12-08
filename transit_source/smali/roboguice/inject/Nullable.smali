.class public Lroboguice/inject/Nullable;
.super Ljava/lang/Object;
.source "Nullable.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
.end method

.method public static isNullable(Ljava/lang/reflect/Field;)Z
    .locals 6
    .param p0, "field"    # Ljava/lang/reflect/Field;

    .prologue
    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    .local v1, "arr$":[Ljava/lang/annotation/Annotation;
    array-length v3, v1

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v0, v1, v2

    .line 18
    .local v0, "a":Ljava/lang/annotation/Annotation;
    const-string v4, "Nullable"

    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lroboguice/util/Strings;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 19
    const/4 v4, 0x1

    .line 21
    .end local v0    # "a":Ljava/lang/annotation/Annotation;
    :goto_1
    return v4

    .line 17
    .restart local v0    # "a":Ljava/lang/annotation/Annotation;
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 21
    .end local v0    # "a":Ljava/lang/annotation/Annotation;
    :cond_1
    const/4 v4, 0x0

    goto :goto_1
.end method

.method public static notNullable(Ljava/lang/reflect/Field;)Z
    .locals 1
    .param p0, "field"    # Ljava/lang/reflect/Field;

    .prologue
    .line 13
    invoke-static {p0}, Lroboguice/inject/Nullable;->isNullable(Ljava/lang/reflect/Field;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
