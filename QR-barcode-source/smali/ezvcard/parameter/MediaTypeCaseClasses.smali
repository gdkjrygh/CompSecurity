.class public Lezvcard/parameter/MediaTypeCaseClasses;
.super Lezvcard/util/CaseClasses;
.source "MediaTypeCaseClasses.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lezvcard/parameter/MediaTypeParameter;",
        ">",
        "Lezvcard/util/CaseClasses",
        "<TT;[",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 39
    .local p0, "this":Lezvcard/parameter/MediaTypeCaseClasses;, "Lezvcard/parameter/MediaTypeCaseClasses<TT;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-direct {p0, p1}, Lezvcard/util/CaseClasses;-><init>(Ljava/lang/Class;)V

    .line 40
    return-void
.end method


# virtual methods
.method protected create([Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;
    .locals 6
    .param p1, "value"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 46
    .local p0, "this":Lezvcard/parameter/MediaTypeCaseClasses;, "Lezvcard/parameter/MediaTypeCaseClasses<TT;>;"
    :try_start_0
    iget-object v2, p0, Lezvcard/parameter/MediaTypeCaseClasses;->clazz:Ljava/lang/Class;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 47
    .local v0, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TT;>;"
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 48
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    aget-object v4, p1, v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const/4 v4, 0x1

    aget-object v4, p1, v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    const/4 v4, 0x2

    aget-object v4, p1, v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lezvcard/parameter/MediaTypeParameter;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    .line 49
    .end local v0    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TT;>;"
    :catch_0
    move-exception v1

    .line 50
    .local v1, "e":Ljava/lang/Exception;
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method protected bridge synthetic create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 37
    .local p0, "this":Lezvcard/parameter/MediaTypeCaseClasses;, "Lezvcard/parameter/MediaTypeCaseClasses<TT;>;"
    check-cast p1, [Ljava/lang/String;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lezvcard/parameter/MediaTypeCaseClasses;->create([Ljava/lang/String;)Lezvcard/parameter/MediaTypeParameter;

    move-result-object v0

    return-object v0
.end method

.method protected matches(Lezvcard/parameter/MediaTypeParameter;[Ljava/lang/String;)Z
    .locals 7
    .param p2, "value"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lezvcard/parameter/MediaTypeCaseClasses;, "Lezvcard/parameter/MediaTypeCaseClasses<TT;>;"
    .local p1, "object":Lezvcard/parameter/MediaTypeParameter;, "TT;"
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 56
    const/4 v5, 0x3

    new-array v1, v5, [Ljava/lang/String;

    invoke-virtual {p1}, Lezvcard/parameter/MediaTypeParameter;->getValue()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v1, v3

    invoke-virtual {p1}, Lezvcard/parameter/MediaTypeParameter;->getMediaType()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v1, v4

    const/4 v5, 0x2

    invoke-virtual {p1}, Lezvcard/parameter/MediaTypeParameter;->getExtension()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v1, v5

    .line 57
    .local v1, "objectValues":[Ljava/lang/String;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v5, p2

    if-ge v0, v5, :cond_1

    .line 58
    aget-object v2, p2, v0

    .line 59
    .local v2, "v":Ljava/lang/String;
    if-eqz v2, :cond_0

    aget-object v5, v1, v0

    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 63
    .end local v2    # "v":Ljava/lang/String;
    :goto_1
    return v3

    .line 57
    .restart local v2    # "v":Ljava/lang/String;
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .end local v2    # "v":Ljava/lang/String;
    :cond_1
    move v3, v4

    .line 63
    goto :goto_1
.end method

.method protected bridge synthetic matches(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;
    .param p2, "x1"    # Ljava/lang/Object;

    .prologue
    .line 37
    .local p0, "this":Lezvcard/parameter/MediaTypeCaseClasses;, "Lezvcard/parameter/MediaTypeCaseClasses<TT;>;"
    check-cast p1, Lezvcard/parameter/MediaTypeParameter;

    .end local p1    # "x0":Ljava/lang/Object;
    check-cast p2, [Ljava/lang/String;

    .end local p2    # "x1":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Lezvcard/parameter/MediaTypeCaseClasses;->matches(Lezvcard/parameter/MediaTypeParameter;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
