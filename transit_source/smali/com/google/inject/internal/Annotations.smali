.class public Lcom/google/inject/internal/Annotations;
.super Ljava/lang/Object;
.source "Annotations.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/Annotations$AnnotationChecker;
    }
.end annotation


# static fields
.field private static final bindingAnnotationChecker:Lcom/google/inject/internal/Annotations$AnnotationChecker;

.field private static final scopeChecker:Lcom/google/inject/internal/Annotations$AnnotationChecker;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 120
    new-instance v0, Lcom/google/inject/internal/Annotations$AnnotationChecker;

    new-array v1, v5, [Ljava/lang/Class;

    const-class v2, Lcom/google/inject/ScopeAnnotation;

    aput-object v2, v1, v3

    const-class v2, Ljavax/inject/Scope;

    aput-object v2, v1, v4

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/internal/Annotations$AnnotationChecker;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/google/inject/internal/Annotations;->scopeChecker:Lcom/google/inject/internal/Annotations$AnnotationChecker;

    .line 173
    new-instance v0, Lcom/google/inject/internal/Annotations$AnnotationChecker;

    new-array v1, v5, [Ljava/lang/Class;

    const-class v2, Lcom/google/inject/BindingAnnotation;

    aput-object v2, v1, v3

    const-class v2, Ljavax/inject/Qualifier;

    aput-object v2, v1, v4

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/internal/Annotations$AnnotationChecker;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/google/inject/internal/Annotations;->bindingAnnotationChecker:Lcom/google/inject/internal/Annotations$AnnotationChecker;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    return-void
.end method

.method public static canonicalizeIfNamed(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 201
    .local p0, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    const-class v0, Ljavax/inject/Named;

    if-ne p0, v0, :cond_0

    .line 202
    const-class p0, Lcom/google/inject/name/Named;

    .line 204
    .end local p0    # "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    :cond_0
    return-object p0
.end method

.method public static canonicalizeIfNamed(Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;
    .locals 1
    .param p0, "annotation"    # Ljava/lang/annotation/Annotation;

    .prologue
    .line 188
    instance-of v0, p0, Ljavax/inject/Named;

    if-eqz v0, :cond_0

    .line 189
    check-cast p0, Ljavax/inject/Named;

    .end local p0    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {p0}, Ljavax/inject/Named;->value()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/name/Names;->named(Ljava/lang/String;)Lcom/google/inject/name/Named;

    move-result-object p0

    .line 191
    :cond_0
    return-object p0
.end method

.method public static checkForMisplacedScopeAnnotations(Ljava/lang/Class;Ljava/lang/Object;Lcom/google/inject/internal/Errors;)V
    .locals 2
    .param p1, "source"    # Ljava/lang/Object;
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/internal/Errors;",
            ")V"
        }
    .end annotation

    .prologue
    .line 133
    .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Classes;->isConcrete(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 141
    :cond_0
    :goto_0
    return-void

    .line 137
    :cond_1
    invoke-static {p2, p0}, Lcom/google/inject/internal/Annotations;->findScopeAnnotation(Lcom/google/inject/internal/Errors;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 138
    .local v0, "scopeAnnotation":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {p2, p0}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v1

    invoke-virtual {v1, v0, p0, p1}, Lcom/google/inject/internal/Errors;->scopeAnnotationOnAbstractType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    goto :goto_0
.end method

.method public static findBindingAnnotation(Lcom/google/inject/internal/Errors;Ljava/lang/reflect/Member;[Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;
    .locals 7
    .param p0, "errors"    # Lcom/google/inject/internal/Errors;
    .param p1, "member"    # Ljava/lang/reflect/Member;
    .param p2, "annotations"    # [Ljava/lang/annotation/Annotation;

    .prologue
    .line 157
    const/4 v3, 0x0

    .line 159
    .local v3, "found":Ljava/lang/annotation/Annotation;
    move-object v2, p2

    .local v2, "arr$":[Ljava/lang/annotation/Annotation;
    array-length v5, v2

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_0
    if-ge v4, v5, :cond_2

    aget-object v0, v2, v4

    .line 160
    .local v0, "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v1

    .line 161
    .local v1, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-static {v1}, Lcom/google/inject/internal/Annotations;->isBindingAnnotation(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 162
    if-eqz v3, :cond_1

    .line 163
    invoke-interface {v3}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {p0, p1, v6, v1}, Lcom/google/inject/internal/Errors;->duplicateBindingAnnotations(Ljava/lang/reflect/Member;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/internal/Errors;

    .line 159
    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 165
    :cond_1
    move-object v3, v0

    goto :goto_1

    .line 170
    .end local v0    # "annotation":Ljava/lang/annotation/Annotation;
    .end local v1    # "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    :cond_2
    return-object v3
.end method

.method public static findScopeAnnotation(Lcom/google/inject/internal/Errors;Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .param p0, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 62
    .local p1, "implementation":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p1}, Ljava/lang/Class;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/inject/internal/Annotations;->findScopeAnnotation(Lcom/google/inject/internal/Errors;[Ljava/lang/annotation/Annotation;)Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public static findScopeAnnotation(Lcom/google/inject/internal/Errors;[Ljava/lang/annotation/Annotation;)Ljava/lang/Class;
    .locals 7
    .param p0, "errors"    # Lcom/google/inject/internal/Errors;
    .param p1, "annotations"    # [Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 67
    const/4 v3, 0x0

    .line 69
    .local v3, "found":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    move-object v2, p1

    .local v2, "arr$":[Ljava/lang/annotation/Annotation;
    array-length v5, v2

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_0
    if-ge v4, v5, :cond_2

    aget-object v0, v2, v4

    .line 70
    .local v0, "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v1

    .line 71
    .local v1, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-static {v1}, Lcom/google/inject/internal/Annotations;->isScopeAnnotation(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 72
    if-eqz v3, :cond_1

    .line 73
    invoke-virtual {p0, v3, v1}, Lcom/google/inject/internal/Errors;->duplicateScopeAnnotations(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/internal/Errors;

    .line 69
    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 75
    :cond_1
    move-object v3, v1

    goto :goto_1

    .line 80
    .end local v0    # "annotation":Ljava/lang/annotation/Annotation;
    .end local v1    # "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    :cond_2
    return-object v3
.end method

.method public static getKey(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Member;[Ljava/lang/annotation/Annotation;Lcom/google/inject/internal/Errors;)Lcom/google/inject/Key;
    .locals 3
    .param p1, "member"    # Ljava/lang/reflect/Member;
    .param p2, "annotations"    # [Ljava/lang/annotation/Annotation;
    .param p3, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Ljava/lang/reflect/Member;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lcom/google/inject/internal/Errors;",
            ")",
            "Lcom/google/inject/Key",
            "<*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 146
    .local p0, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    invoke-virtual {p3}, Lcom/google/inject/internal/Errors;->size()I

    move-result v1

    .line 147
    .local v1, "numErrorsBefore":I
    invoke-static {p3, p1, p2}, Lcom/google/inject/internal/Annotations;->findBindingAnnotation(Lcom/google/inject/internal/Errors;Ljava/lang/reflect/Member;[Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 148
    .local v0, "found":Ljava/lang/annotation/Annotation;
    invoke-virtual {p3, v1}, Lcom/google/inject/internal/Errors;->throwIfNewErrors(I)V

    .line 149
    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/Key;

    move-result-object v2

    :goto_0
    return-object v2

    :cond_0
    invoke-static {p0, v0}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;Ljava/lang/annotation/Annotation;)Lcom/google/inject/Key;

    move-result-object v2

    goto :goto_0
.end method

.method public static isBindingAnnotation(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 180
    .local p0, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    sget-object v0, Lcom/google/inject/internal/Annotations;->bindingAnnotationChecker:Lcom/google/inject/internal/Annotations$AnnotationChecker;

    invoke-virtual {v0, p0}, Lcom/google/inject/internal/Annotations$AnnotationChecker;->hasAnnotations(Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method

.method public static isMarker(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 48
    .local p0, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isRetainedAtRuntime(Ljava/lang/Class;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 55
    .local p0, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    const-class v1, Ljava/lang/annotation/Retention;

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ljava/lang/annotation/Retention;

    .line 56
    .local v0, "retention":Ljava/lang/annotation/Retention;
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/annotation/Retention;->value()Ljava/lang/annotation/RetentionPolicy;

    move-result-object v1

    sget-object v2, Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static isScopeAnnotation(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 124
    .local p0, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    sget-object v0, Lcom/google/inject/internal/Annotations;->scopeChecker:Lcom/google/inject/internal/Annotations$AnnotationChecker;

    invoke-virtual {v0, p0}, Lcom/google/inject/internal/Annotations$AnnotationChecker;->hasAnnotations(Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method
