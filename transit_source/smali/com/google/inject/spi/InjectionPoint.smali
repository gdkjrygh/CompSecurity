.class public final Lcom/google/inject/spi/InjectionPoint;
.super Ljava/lang/Object;
.source "InjectionPoint.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/spi/InjectionPoint$Signature;,
        Lcom/google/inject/spi/InjectionPoint$OverrideIndex;,
        Lcom/google/inject/spi/InjectionPoint$Position;,
        Lcom/google/inject/spi/InjectionPoint$InjectableMembers;,
        Lcom/google/inject/spi/InjectionPoint$InjectableMethod;,
        Lcom/google/inject/spi/InjectionPoint$InjectableField;,
        Lcom/google/inject/spi/InjectionPoint$InjectableMember;
    }
.end annotation


# static fields
.field private static final logger:Ljava/util/logging/Logger;


# instance fields
.field private final declaringType:Lcom/google/inject/TypeLiteral;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/TypeLiteral",
            "<*>;"
        }
    .end annotation
.end field

.field private final dependencies:Lcom/google/inject/internal/util/$ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/spi/Dependency",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final member:Ljava/lang/reflect/Member;

.field private final optional:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 60
    const-class v0, Lcom/google/inject/spi/InjectionPoint;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/inject/spi/InjectionPoint;->logger:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Constructor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Ljava/lang/reflect/Constructor",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 74
    .local p1, "declaringType":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    .local p2, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p2, p0, Lcom/google/inject/spi/InjectionPoint;->member:Ljava/lang/reflect/Member;

    .line 76
    iput-object p1, p0, Lcom/google/inject/spi/InjectionPoint;->declaringType:Lcom/google/inject/TypeLiteral;

    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/inject/spi/InjectionPoint;->optional:Z

    .line 78
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v0

    invoke-direct {p0, p2, p1, v0}, Lcom/google/inject/spi/InjectionPoint;->forMember(Ljava/lang/reflect/Member;Lcom/google/inject/TypeLiteral;[[Ljava/lang/annotation/Annotation;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/spi/InjectionPoint;->dependencies:Lcom/google/inject/internal/util/$ImmutableList;

    .line 80
    return-void
.end method

.method constructor <init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Field;Z)V
    .locals 6
    .param p2, "field"    # Ljava/lang/reflect/Field;
    .param p3, "optional"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Ljava/lang/reflect/Field;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 82
    .local p1, "declaringType":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p2, p0, Lcom/google/inject/spi/InjectionPoint;->member:Ljava/lang/reflect/Member;

    .line 84
    iput-object p1, p0, Lcom/google/inject/spi/InjectionPoint;->declaringType:Lcom/google/inject/TypeLiteral;

    .line 85
    iput-boolean p3, p0, Lcom/google/inject/spi/InjectionPoint;->optional:Z

    .line 87
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 89
    .local v0, "annotations":[Ljava/lang/annotation/Annotation;
    new-instance v2, Lcom/google/inject/internal/Errors;

    invoke-direct {v2, p2}, Lcom/google/inject/internal/Errors;-><init>(Ljava/lang/Object;)V

    .line 90
    .local v2, "errors":Lcom/google/inject/internal/Errors;
    const/4 v3, 0x0

    .line 92
    .local v3, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/google/inject/TypeLiteral;->getFieldType(Ljava/lang/reflect/Field;)Lcom/google/inject/TypeLiteral;

    move-result-object v4

    invoke-static {v4, p2, v0, v2}, Lcom/google/inject/internal/Annotations;->getKey(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Member;[Ljava/lang/annotation/Annotation;Lcom/google/inject/internal/Errors;)Lcom/google/inject/Key;
    :try_end_0
    .catch Lcom/google/inject/ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 98
    :goto_0
    invoke-virtual {v2}, Lcom/google/inject/internal/Errors;->throwConfigurationExceptionIfErrorsExist()V

    .line 100
    invoke-static {v0}, Lcom/google/inject/internal/Nullability;->allowsNull([Ljava/lang/annotation/Annotation;)Z

    move-result v4

    const/4 v5, -0x1

    invoke-direct {p0, v3, v4, v5}, Lcom/google/inject/spi/InjectionPoint;->newDependency(Lcom/google/inject/Key;ZI)Lcom/google/inject/spi/Dependency;

    move-result-object v4

    invoke-static {v4}, Lcom/google/inject/internal/util/$ImmutableList;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v4

    iput-object v4, p0, Lcom/google/inject/spi/InjectionPoint;->dependencies:Lcom/google/inject/internal/util/$ImmutableList;

    .line 102
    return-void

    .line 93
    :catch_0
    move-exception v1

    .line 94
    .local v1, "e":Lcom/google/inject/ConfigurationException;
    invoke-virtual {v1}, Lcom/google/inject/ConfigurationException;->getErrorMessages()Ljava/util/Collection;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/inject/internal/Errors;->merge(Ljava/util/Collection;)Lcom/google/inject/internal/Errors;

    goto :goto_0

    .line 95
    .end local v1    # "e":Lcom/google/inject/ConfigurationException;
    :catch_1
    move-exception v1

    .line 96
    .local v1, "e":Lcom/google/inject/internal/ErrorsException;
    invoke-virtual {v1}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Method;Z)V
    .locals 1
    .param p2, "method"    # Ljava/lang/reflect/Method;
    .param p3, "optional"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Ljava/lang/reflect/Method;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 67
    .local p1, "declaringType":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p2, p0, Lcom/google/inject/spi/InjectionPoint;->member:Ljava/lang/reflect/Member;

    .line 69
    iput-object p1, p0, Lcom/google/inject/spi/InjectionPoint;->declaringType:Lcom/google/inject/TypeLiteral;

    .line 70
    iput-boolean p3, p0, Lcom/google/inject/spi/InjectionPoint;->optional:Z

    .line 71
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v0

    invoke-direct {p0, p2, p1, v0}, Lcom/google/inject/spi/InjectionPoint;->forMember(Ljava/lang/reflect/Member;Lcom/google/inject/TypeLiteral;[[Ljava/lang/annotation/Annotation;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/spi/InjectionPoint;->dependencies:Lcom/google/inject/internal/util/$ImmutableList;

    .line 72
    return-void
.end method

.method static synthetic access$000(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z
    .locals 1
    .param p0, "x0"    # Ljava/lang/reflect/Method;
    .param p1, "x1"    # Ljava/lang/reflect/Method;

    .prologue
    .line 58
    invoke-static {p0, p1}, Lcom/google/inject/spi/InjectionPoint;->overrides(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z

    move-result v0

    return v0
.end method

.method private static checkForMisplacedBindingAnnotations(Ljava/lang/reflect/Member;Lcom/google/inject/internal/Errors;)Z
    .locals 4
    .param p0, "member"    # Ljava/lang/reflect/Member;
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    const/4 v2, 0x0

    .line 382
    move-object v1, p0

    check-cast v1, Ljava/lang/reflect/AnnotatedElement;

    invoke-interface {v1}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    invoke-static {p1, p0, v1}, Lcom/google/inject/internal/Annotations;->findBindingAnnotation(Lcom/google/inject/internal/Errors;Ljava/lang/reflect/Member;[Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 384
    .local v0, "misplacedBindingAnnotation":Ljava/lang/annotation/Annotation;
    if-nez v0, :cond_0

    move v1, v2

    .line 400
    :goto_0
    return v1

    .line 390
    :cond_0
    instance-of v1, p0, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_1

    .line 392
    :try_start_0
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    if-eqz v1, :cond_1

    move v1, v2

    .line 393
    goto :goto_0

    .line 395
    :catch_0
    move-exception v1

    .line 399
    :cond_1
    invoke-virtual {p1, p0, v0}, Lcom/google/inject/internal/Errors;->misplacedBindingAnnotation(Ljava/lang/reflect/Member;Ljava/lang/annotation/Annotation;)Lcom/google/inject/internal/Errors;

    .line 400
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public static forConstructor(Ljava/lang/reflect/Constructor;)Lcom/google/inject/spi/InjectionPoint;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Constructor",
            "<TT;>;)",
            "Lcom/google/inject/spi/InjectionPoint;"
        }
    .end annotation

    .prologue
    .line 207
    .local p0, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TT;>;"
    new-instance v0, Lcom/google/inject/spi/InjectionPoint;

    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/google/inject/spi/InjectionPoint;-><init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Constructor;)V

    return-object v0
.end method

.method public static forConstructor(Ljava/lang/reflect/Constructor;Lcom/google/inject/TypeLiteral;)Lcom/google/inject/spi/InjectionPoint;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Constructor",
            "<TT;>;",
            "Lcom/google/inject/TypeLiteral",
            "<+TT;>;)",
            "Lcom/google/inject/spi/InjectionPoint;"
        }
    .end annotation

    .prologue
    .line 220
    .local p0, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TT;>;"
    .local p1, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<+TT;>;"
    invoke-virtual {p1}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 221
    new-instance v0, Lcom/google/inject/internal/Errors;

    invoke-direct {v0, p1}, Lcom/google/inject/internal/Errors;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p0, p1}, Lcom/google/inject/internal/Errors;->constructorNotDefinedByType(Ljava/lang/reflect/Constructor;Lcom/google/inject/TypeLiteral;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/Errors;->throwConfigurationExceptionIfErrorsExist()V

    .line 226
    :cond_0
    new-instance v0, Lcom/google/inject/spi/InjectionPoint;

    invoke-direct {v0, p1, p0}, Lcom/google/inject/spi/InjectionPoint;-><init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Constructor;)V

    return-object v0
.end method

.method public static forConstructorOf(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/spi/InjectionPoint;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;)",
            "Lcom/google/inject/spi/InjectionPoint;"
        }
    .end annotation

    .prologue
    .line 239
    .local p0, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    invoke-virtual {p0}, Lcom/google/inject/TypeLiteral;->getType()Ljava/lang/reflect/Type;

    move-result-object v12

    invoke-static {v12}, Lcom/google/inject/internal/MoreTypes;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v11

    .line 240
    .local v11, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-instance v3, Lcom/google/inject/internal/Errors;

    invoke-direct {v3, v11}, Lcom/google/inject/internal/Errors;-><init>(Ljava/lang/Object;)V

    .line 242
    .local v3, "errors":Lcom/google/inject/internal/Errors;
    const/4 v6, 0x0

    .line 243
    .local v6, "injectableConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Constructor;
    array-length v8, v0

    .local v8, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_0
    if-ge v5, v8, :cond_4

    aget-object v1, v0, v5

    .line 246
    .local v1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    const-class v12, Lcom/google/inject/Inject;

    invoke-virtual {v1, v12}, Ljava/lang/reflect/Constructor;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Lcom/google/inject/Inject;

    .line 247
    .local v4, "guiceInject":Lcom/google/inject/Inject;
    if-nez v4, :cond_3

    .line 248
    const-class v12, Ljavax/inject/Inject;

    invoke-virtual {v1, v12}, Ljava/lang/reflect/Constructor;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v7

    check-cast v7, Ljavax/inject/Inject;

    .line 249
    .local v7, "javaxInject":Ljavax/inject/Inject;
    if-nez v7, :cond_0

    .line 243
    .end local v7    # "javaxInject":Ljavax/inject/Inject;
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 252
    .restart local v7    # "javaxInject":Ljavax/inject/Inject;
    :cond_0
    const/4 v10, 0x0

    .line 257
    .end local v7    # "javaxInject":Ljavax/inject/Inject;
    .local v10, "optional":Z
    :goto_2
    if-eqz v10, :cond_1

    .line 258
    invoke-virtual {v3, v1}, Lcom/google/inject/internal/Errors;->optionalConstructor(Ljava/lang/reflect/Constructor;)Lcom/google/inject/internal/Errors;

    .line 261
    :cond_1
    if-eqz v6, :cond_2

    .line 262
    invoke-virtual {v3, v11}, Lcom/google/inject/internal/Errors;->tooManyConstructors(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;

    .line 265
    :cond_2
    move-object v6, v1

    .line 266
    invoke-static {v6, v3}, Lcom/google/inject/spi/InjectionPoint;->checkForMisplacedBindingAnnotations(Ljava/lang/reflect/Member;Lcom/google/inject/internal/Errors;)Z

    goto :goto_1

    .line 254
    .end local v10    # "optional":Z
    :cond_3
    invoke-interface {v4}, Lcom/google/inject/Inject;->optional()Z

    move-result v10

    .restart local v10    # "optional":Z
    goto :goto_2

    .line 269
    .end local v1    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    .end local v4    # "guiceInject":Lcom/google/inject/Inject;
    .end local v10    # "optional":Z
    :cond_4
    invoke-virtual {v3}, Lcom/google/inject/internal/Errors;->throwConfigurationExceptionIfErrorsExist()V

    .line 271
    if-eqz v6, :cond_5

    .line 272
    new-instance v12, Lcom/google/inject/spi/InjectionPoint;

    invoke-direct {v12, p0, v6}, Lcom/google/inject/spi/InjectionPoint;-><init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Constructor;)V

    .line 287
    :goto_3
    return-object v12

    .line 277
    :cond_5
    const/4 v12, 0x0

    :try_start_0
    new-array v12, v12, [Ljava/lang/Class;

    invoke-virtual {v11, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    .line 280
    .local v9, "noArgConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v12

    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-virtual {v11}, Ljava/lang/Class;->getModifiers()I

    move-result v12

    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v12

    if-nez v12, :cond_6

    .line 282
    invoke-virtual {v3, v11}, Lcom/google/inject/internal/Errors;->missingConstructor(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;

    .line 283
    new-instance v12, Lcom/google/inject/ConfigurationException;

    invoke-virtual {v3}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v13

    invoke-direct {v12, v13}, Lcom/google/inject/ConfigurationException;-><init>(Ljava/lang/Iterable;)V

    throw v12
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    .end local v9    # "noArgConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    :catch_0
    move-exception v2

    .line 289
    .local v2, "e":Ljava/lang/NoSuchMethodException;
    invoke-virtual {v3, v11}, Lcom/google/inject/internal/Errors;->missingConstructor(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;

    .line 290
    new-instance v12, Lcom/google/inject/ConfigurationException;

    invoke-virtual {v3}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v13

    invoke-direct {v12, v13}, Lcom/google/inject/ConfigurationException;-><init>(Ljava/lang/Iterable;)V

    throw v12

    .line 286
    .end local v2    # "e":Ljava/lang/NoSuchMethodException;
    .restart local v9    # "noArgConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    :cond_6
    :try_start_1
    invoke-static {v9, v3}, Lcom/google/inject/spi/InjectionPoint;->checkForMisplacedBindingAnnotations(Ljava/lang/reflect/Member;Lcom/google/inject/internal/Errors;)Z

    .line 287
    new-instance v12, Lcom/google/inject/spi/InjectionPoint;

    invoke-direct {v12, p0, v9}, Lcom/google/inject/spi/InjectionPoint;-><init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Constructor;)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3
.end method

.method public static forConstructorOf(Ljava/lang/Class;)Lcom/google/inject/spi/InjectionPoint;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/spi/InjectionPoint;"
        }
    .end annotation

    .prologue
    .line 304
    .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {p0}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/spi/InjectionPoint;->forConstructorOf(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/spi/InjectionPoint;

    move-result-object v0

    return-object v0
.end method

.method public static forInstanceMethodsAndFields(Lcom/google/inject/TypeLiteral;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;)",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation

    .prologue
    .line 355
    .local p0, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    new-instance v0, Lcom/google/inject/internal/Errors;

    invoke-direct {v0}, Lcom/google/inject/internal/Errors;-><init>()V

    .line 356
    .local v0, "errors":Lcom/google/inject/internal/Errors;
    const/4 v2, 0x0

    invoke-static {p0, v2, v0}, Lcom/google/inject/spi/InjectionPoint;->getInjectionPoints(Lcom/google/inject/TypeLiteral;ZLcom/google/inject/internal/Errors;)Ljava/util/Set;

    move-result-object v1

    .line 357
    .local v1, "result":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    invoke-virtual {v0}, Lcom/google/inject/internal/Errors;->hasErrors()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 358
    new-instance v2, Lcom/google/inject/ConfigurationException;

    invoke-virtual {v0}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/inject/ConfigurationException;-><init>(Ljava/lang/Iterable;)V

    invoke-virtual {v2, v1}, Lcom/google/inject/ConfigurationException;->withPartialValue(Ljava/lang/Object;)Lcom/google/inject/ConfigurationException;

    move-result-object v2

    throw v2

    .line 360
    :cond_0
    return-object v1
.end method

.method public static forInstanceMethodsAndFields(Ljava/lang/Class;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation

    .prologue
    .line 375
    .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {p0}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/spi/InjectionPoint;->forInstanceMethodsAndFields(Lcom/google/inject/TypeLiteral;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private forMember(Ljava/lang/reflect/Member;Lcom/google/inject/TypeLiteral;[[Ljava/lang/annotation/Annotation;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 10
    .param p1, "member"    # Ljava/lang/reflect/Member;
    .param p3, "paramterAnnotations"    # [[Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Member;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;[[",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/spi/Dependency",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 106
    .local p2, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    new-instance v3, Lcom/google/inject/internal/Errors;

    invoke-direct {v3, p1}, Lcom/google/inject/internal/Errors;-><init>(Ljava/lang/Object;)V

    .line 107
    .local v3, "errors":Lcom/google/inject/internal/Errors;
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 109
    .local v0, "annotationsIterator":Ljava/util/Iterator;, "Ljava/util/Iterator<[Ljava/lang/annotation/Annotation;>;"
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v1

    .line 110
    .local v1, "dependencies":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/Dependency<*>;>;"
    const/4 v5, 0x0

    .line 112
    .local v5, "index":I
    invoke-virtual {p2, p1}, Lcom/google/inject/TypeLiteral;->getParameterTypes(Ljava/lang/reflect/Member;)Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/inject/TypeLiteral;

    .line 114
    .local v8, "parameterType":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ljava/lang/annotation/Annotation;

    .line 115
    .local v7, "parameterAnnotations":[Ljava/lang/annotation/Annotation;
    invoke-static {v8, p1, v7, v3}, Lcom/google/inject/internal/Annotations;->getKey(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Member;[Ljava/lang/annotation/Annotation;Lcom/google/inject/internal/Errors;)Lcom/google/inject/Key;

    move-result-object v6

    .line 116
    .local v6, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    invoke-static {v7}, Lcom/google/inject/internal/Nullability;->allowsNull([Ljava/lang/annotation/Annotation;)Z

    move-result v9

    invoke-direct {p0, v6, v9, v5}, Lcom/google/inject/spi/InjectionPoint;->newDependency(Lcom/google/inject/Key;ZI)Lcom/google/inject/spi/Dependency;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/inject/ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 117
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 118
    .end local v6    # "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    .end local v7    # "parameterAnnotations":[Ljava/lang/annotation/Annotation;
    :catch_0
    move-exception v2

    .line 119
    .local v2, "e":Lcom/google/inject/ConfigurationException;
    invoke-virtual {v2}, Lcom/google/inject/ConfigurationException;->getErrorMessages()Ljava/util/Collection;

    move-result-object v9

    invoke-virtual {v3, v9}, Lcom/google/inject/internal/Errors;->merge(Ljava/util/Collection;)Lcom/google/inject/internal/Errors;

    goto :goto_0

    .line 120
    .end local v2    # "e":Lcom/google/inject/ConfigurationException;
    :catch_1
    move-exception v2

    .line 121
    .local v2, "e":Lcom/google/inject/internal/ErrorsException;
    invoke-virtual {v2}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v9

    invoke-virtual {v3, v9}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0

    .line 125
    .end local v2    # "e":Lcom/google/inject/internal/ErrorsException;
    .end local v8    # "parameterType":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    :cond_0
    invoke-virtual {v3}, Lcom/google/inject/internal/Errors;->throwConfigurationExceptionIfErrorsExist()V

    .line 126
    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableList;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v9

    return-object v9
.end method

.method public static forStaticMethodsAndFields(Lcom/google/inject/TypeLiteral;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;)",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation

    .prologue
    .line 319
    .local p0, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    new-instance v0, Lcom/google/inject/internal/Errors;

    invoke-direct {v0}, Lcom/google/inject/internal/Errors;-><init>()V

    .line 321
    .local v0, "errors":Lcom/google/inject/internal/Errors;
    const/4 v2, 0x1

    invoke-static {p0, v2, v0}, Lcom/google/inject/spi/InjectionPoint;->getInjectionPoints(Lcom/google/inject/TypeLiteral;ZLcom/google/inject/internal/Errors;)Ljava/util/Set;

    move-result-object v1

    .line 322
    .local v1, "result":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    invoke-virtual {v0}, Lcom/google/inject/internal/Errors;->hasErrors()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 323
    new-instance v2, Lcom/google/inject/ConfigurationException;

    invoke-virtual {v0}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/inject/ConfigurationException;-><init>(Ljava/lang/Iterable;)V

    invoke-virtual {v2, v1}, Lcom/google/inject/ConfigurationException;->withPartialValue(Ljava/lang/Object;)Lcom/google/inject/ConfigurationException;

    move-result-object v2

    throw v2

    .line 325
    :cond_0
    return-object v1
.end method

.method public static forStaticMethodsAndFields(Ljava/lang/Class;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation

    .prologue
    .line 340
    .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {p0}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/spi/InjectionPoint;->forStaticMethodsAndFields(Lcom/google/inject/TypeLiteral;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method static getAtInject(Ljava/lang/reflect/AnnotatedElement;)Ljava/lang/annotation/Annotation;
    .locals 2
    .param p0, "member"    # Ljava/lang/reflect/AnnotatedElement;

    .prologue
    .line 466
    const-class v1, Ljavax/inject/Inject;

    invoke-interface {p0, v1}, Ljava/lang/reflect/AnnotatedElement;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 467
    .local v0, "a":Ljava/lang/annotation/Annotation;
    if-nez v0, :cond_0

    const-class v1, Lcom/google/inject/Inject;

    invoke-interface {p0, v1}, Ljava/lang/reflect/AnnotatedElement;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    .end local v0    # "a":Ljava/lang/annotation/Annotation;
    :cond_0
    return-object v0
.end method

.method private static getInjectionPoints(Lcom/google/inject/TypeLiteral;ZLcom/google/inject/internal/Errors;)Ljava/util/Set;
    .locals 25
    .param p1, "statics"    # Z
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;Z",
            "Lcom/google/inject/internal/Errors;",
            ")",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation

    .prologue
    .line 632
    .local p0, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    new-instance v15, Lcom/google/inject/spi/InjectionPoint$InjectableMembers;

    invoke-direct {v15}, Lcom/google/inject/spi/InjectionPoint$InjectableMembers;-><init>()V

    .line 633
    .local v15, "injectableMembers":Lcom/google/inject/spi/InjectionPoint$InjectableMembers;
    const/16 v19, 0x0

    .line 635
    .local v19, "overrideIndex":Lcom/google/inject/spi/InjectionPoint$OverrideIndex;
    invoke-static/range {p0 .. p0}, Lcom/google/inject/spi/InjectionPoint;->hierarchyFor(Lcom/google/inject/TypeLiteral;)Ljava/util/List;

    move-result-object v9

    .line 636
    .local v9, "hierarchy":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/TypeLiteral<*>;>;"
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v22

    add-int/lit8 v21, v22, -0x1

    .line 637
    .local v21, "topIndex":I
    move/from16 v10, v21

    .local v10, "i":I
    :goto_0
    if-ltz v10, :cond_c

    .line 638
    if-eqz v19, :cond_0

    move/from16 v0, v21

    if-ge v10, v0, :cond_0

    .line 640
    if-nez v10, :cond_3

    .line 641
    sget-object v22, Lcom/google/inject/spi/InjectionPoint$Position;->BOTTOM:Lcom/google/inject/spi/InjectionPoint$Position;

    move-object/from16 v0, v22

    move-object/from16 v1, v19

    iput-object v0, v1, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->position:Lcom/google/inject/spi/InjectionPoint$Position;

    .line 647
    :cond_0
    :goto_1
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/inject/TypeLiteral;

    .line 649
    .local v7, "current":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    invoke-virtual {v7}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    .local v4, "arr$":[Ljava/lang/reflect/Field;
    array-length v0, v4

    move/from16 v17, v0

    .local v17, "len$":I
    const/4 v11, 0x0

    .local v11, "i$":I
    :goto_2
    move/from16 v0, v17

    if-ge v11, v0, :cond_4

    aget-object v8, v4, v11

    .line 650
    .local v8, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v22

    invoke-static/range {v22 .. v22}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v22

    move/from16 v0, v22

    move/from16 v1, p1

    if-ne v0, v1, :cond_2

    .line 651
    invoke-static {v8}, Lcom/google/inject/spi/InjectionPoint;->getAtInject(Ljava/lang/reflect/AnnotatedElement;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    .line 652
    .local v5, "atInject":Ljava/lang/annotation/Annotation;
    if-eqz v5, :cond_2

    .line 653
    new-instance v14, Lcom/google/inject/spi/InjectionPoint$InjectableField;

    invoke-direct {v14, v7, v8, v5}, Lcom/google/inject/spi/InjectionPoint$InjectableField;-><init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Field;Ljava/lang/annotation/Annotation;)V

    .line 654
    .local v14, "injectableField":Lcom/google/inject/spi/InjectionPoint$InjectableField;
    iget-boolean v0, v14, Lcom/google/inject/spi/InjectionPoint$InjectableField;->jsr330:Z

    move/from16 v22, v0

    if-eqz v22, :cond_1

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v22

    invoke-static/range {v22 .. v22}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v22

    if-eqz v22, :cond_1

    .line 655
    move-object/from16 v0, p2

    invoke-virtual {v0, v8}, Lcom/google/inject/internal/Errors;->cannotInjectFinalField(Ljava/lang/reflect/Field;)Lcom/google/inject/internal/Errors;

    .line 657
    :cond_1
    invoke-virtual {v15, v14}, Lcom/google/inject/spi/InjectionPoint$InjectableMembers;->add(Lcom/google/inject/spi/InjectionPoint$InjectableMember;)V

    .line 649
    .end local v5    # "atInject":Ljava/lang/annotation/Annotation;
    .end local v14    # "injectableField":Lcom/google/inject/spi/InjectionPoint$InjectableField;
    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 643
    .end local v4    # "arr$":[Ljava/lang/reflect/Field;
    .end local v7    # "current":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    .end local v8    # "field":Ljava/lang/reflect/Field;
    .end local v11    # "i$":I
    .end local v17    # "len$":I
    :cond_3
    sget-object v22, Lcom/google/inject/spi/InjectionPoint$Position;->MIDDLE:Lcom/google/inject/spi/InjectionPoint$Position;

    move-object/from16 v0, v22

    move-object/from16 v1, v19

    iput-object v0, v1, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->position:Lcom/google/inject/spi/InjectionPoint$Position;

    goto :goto_1

    .line 662
    .restart local v4    # "arr$":[Ljava/lang/reflect/Field;
    .restart local v7    # "current":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    .restart local v11    # "i$":I
    .restart local v17    # "len$":I
    :cond_4
    invoke-virtual {v7}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    .local v4, "arr$":[Ljava/lang/reflect/Method;
    array-length v0, v4

    move/from16 v17, v0

    const/4 v11, 0x0

    :goto_3
    move/from16 v0, v17

    if-ge v11, v0, :cond_b

    aget-object v18, v4, v11

    .line 663
    .local v18, "method":Ljava/lang/reflect/Method;
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v22

    invoke-static/range {v22 .. v22}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v22

    move/from16 v0, v22

    move/from16 v1, p1

    if-ne v0, v1, :cond_5

    .line 664
    invoke-static/range {v18 .. v18}, Lcom/google/inject/spi/InjectionPoint;->getAtInject(Ljava/lang/reflect/AnnotatedElement;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    .line 665
    .restart local v5    # "atInject":Ljava/lang/annotation/Annotation;
    if-eqz v5, :cond_a

    .line 666
    new-instance v16, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;

    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-direct {v0, v7, v1, v5}, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;-><init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Method;Ljava/lang/annotation/Annotation;)V

    .line 668
    .local v16, "injectableMethod":Lcom/google/inject/spi/InjectionPoint$InjectableMethod;
    move-object/from16 v0, v18

    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lcom/google/inject/spi/InjectionPoint;->checkForMisplacedBindingAnnotations(Ljava/lang/reflect/Member;Lcom/google/inject/internal/Errors;)Z

    move-result v23

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lcom/google/inject/spi/InjectionPoint;->isValidMethod(Lcom/google/inject/spi/InjectionPoint$InjectableMethod;Lcom/google/inject/internal/Errors;)Z

    move-result v22

    if-nez v22, :cond_6

    const/16 v22, 0x1

    :goto_4
    or-int v22, v22, v23

    if-eqz v22, :cond_7

    .line 670
    if-eqz v19, :cond_5

    .line 671
    const/16 v22, 0x0

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    move/from16 v2, v22

    move-object/from16 v3, v16

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->removeIfOverriddenBy(Ljava/lang/reflect/Method;ZLcom/google/inject/spi/InjectionPoint$InjectableMethod;)Z

    move-result v20

    .line 672
    .local v20, "removed":Z
    if-eqz v20, :cond_5

    .line 673
    sget-object v22, Lcom/google/inject/spi/InjectionPoint;->logger:Ljava/util/logging/Logger;

    sget-object v23, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v24, "Method: {0} is not a valid injectable method (because it either has misplaced binding annotations or specifies type parameters) but is overriding a method that is valid. Because it is not valid, the method will not be injected. To fix this, make the method a valid injectable method."

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    move-object/from16 v2, v24

    move-object/from16 v3, v18

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 662
    .end local v5    # "atInject":Ljava/lang/annotation/Annotation;
    .end local v16    # "injectableMethod":Lcom/google/inject/spi/InjectionPoint$InjectableMethod;
    .end local v20    # "removed":Z
    :cond_5
    :goto_5
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 668
    .restart local v5    # "atInject":Ljava/lang/annotation/Annotation;
    .restart local v16    # "injectableMethod":Lcom/google/inject/spi/InjectionPoint$InjectableMethod;
    :cond_6
    const/16 v22, 0x0

    goto :goto_4

    .line 682
    :cond_7
    if-eqz p1, :cond_8

    .line 683
    invoke-virtual/range {v15 .. v16}, Lcom/google/inject/spi/InjectionPoint$InjectableMembers;->add(Lcom/google/inject/spi/InjectionPoint$InjectableMember;)V

    goto :goto_5

    .line 685
    :cond_8
    if-nez v19, :cond_9

    .line 692
    new-instance v19, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;

    .end local v19    # "overrideIndex":Lcom/google/inject/spi/InjectionPoint$OverrideIndex;
    move-object/from16 v0, v19

    invoke-direct {v0, v15}, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;-><init>(Lcom/google/inject/spi/InjectionPoint$InjectableMembers;)V

    .line 698
    .restart local v19    # "overrideIndex":Lcom/google/inject/spi/InjectionPoint$OverrideIndex;
    :goto_6
    move-object/from16 v0, v19

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->add(Lcom/google/inject/spi/InjectionPoint$InjectableMethod;)V

    goto :goto_5

    .line 696
    :cond_9
    const/16 v22, 0x1

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    move/from16 v2, v22

    move-object/from16 v3, v16

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->removeIfOverriddenBy(Ljava/lang/reflect/Method;ZLcom/google/inject/spi/InjectionPoint$InjectableMethod;)Z

    goto :goto_6

    .line 701
    .end local v16    # "injectableMethod":Lcom/google/inject/spi/InjectionPoint$InjectableMethod;
    :cond_a
    if-eqz v19, :cond_5

    .line 702
    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v0, v19

    move-object/from16 v1, v18

    move/from16 v2, v22

    move-object/from16 v3, v23

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->removeIfOverriddenBy(Ljava/lang/reflect/Method;ZLcom/google/inject/spi/InjectionPoint$InjectableMethod;)Z

    move-result v20

    .line 703
    .restart local v20    # "removed":Z
    if-eqz v20, :cond_5

    .line 704
    sget-object v22, Lcom/google/inject/spi/InjectionPoint;->logger:Ljava/util/logging/Logger;

    sget-object v23, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v24, "Method: {0} is not annotated with @Inject but is overriding a method that is annotated with @javax.inject.Inject.  Because it is not annotated with @Inject, the method will not be injected. To fix this, annotate the method with @Inject."

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    move-object/from16 v2, v24

    move-object/from16 v3, v18

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    .line 637
    .end local v5    # "atInject":Ljava/lang/annotation/Annotation;
    .end local v18    # "method":Ljava/lang/reflect/Method;
    .end local v20    # "removed":Z
    :cond_b
    add-int/lit8 v10, v10, -0x1

    goto/16 :goto_0

    .line 715
    .end local v4    # "arr$":[Ljava/lang/reflect/Method;
    .end local v7    # "current":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    .end local v11    # "i$":I
    .end local v17    # "len$":I
    :cond_c
    invoke-virtual {v15}, Lcom/google/inject/spi/InjectionPoint$InjectableMembers;->isEmpty()Z

    move-result v22

    if-eqz v22, :cond_d

    .line 716
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v22

    .line 730
    :goto_7
    return-object v22

    .line 719
    :cond_d
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableSet;->builder()Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    move-result-object v6

    .line 720
    .local v6, "builder":Lcom/google/inject/internal/util/$ImmutableSet$Builder;, "Lcom/google/inject/internal/util/$ImmutableSet$Builder<Lcom/google/inject/spi/InjectionPoint;>;"
    iget-object v13, v15, Lcom/google/inject/spi/InjectionPoint$InjectableMembers;->head:Lcom/google/inject/spi/InjectionPoint$InjectableMember;

    .local v13, "im":Lcom/google/inject/spi/InjectionPoint$InjectableMember;
    :goto_8
    if-eqz v13, :cond_f

    .line 723
    :try_start_0
    invoke-virtual {v13}, Lcom/google/inject/spi/InjectionPoint$InjectableMember;->toInjectionPoint()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v6, v0}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->add(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;
    :try_end_0
    .catch Lcom/google/inject/ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 721
    :cond_e
    :goto_9
    iget-object v13, v13, Lcom/google/inject/spi/InjectionPoint$InjectableMember;->next:Lcom/google/inject/spi/InjectionPoint$InjectableMember;

    goto :goto_8

    .line 724
    :catch_0
    move-exception v12

    .line 725
    .local v12, "ignorable":Lcom/google/inject/ConfigurationException;
    iget-boolean v0, v13, Lcom/google/inject/spi/InjectionPoint$InjectableMember;->optional:Z

    move/from16 v22, v0

    if-nez v22, :cond_e

    .line 726
    invoke-virtual {v12}, Lcom/google/inject/ConfigurationException;->getErrorMessages()Ljava/util/Collection;

    move-result-object v22

    move-object/from16 v0, p2

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/Errors;->merge(Ljava/util/Collection;)Lcom/google/inject/internal/Errors;

    goto :goto_9

    .line 730
    .end local v12    # "ignorable":Lcom/google/inject/ConfigurationException;
    :cond_f
    invoke-virtual {v6}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->build()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v22

    goto :goto_7
.end method

.method private static hierarchyFor(Lcom/google/inject/TypeLiteral;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/TypeLiteral",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 751
    .local p0, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 752
    .local v1, "hierarchy":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/TypeLiteral<*>;>;"
    move-object v0, p0

    .line 753
    .local v0, "current":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    :goto_0
    invoke-virtual {v0}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ljava/lang/Object;

    if-eq v2, v3, :cond_0

    .line 754
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 755
    invoke-virtual {v0}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/inject/TypeLiteral;->getSupertype(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v0

    goto :goto_0

    .line 757
    :cond_0
    return-object v1
.end method

.method private static isValidMethod(Lcom/google/inject/spi/InjectionPoint$InjectableMethod;Lcom/google/inject/internal/Errors;)Z
    .locals 3
    .param p0, "injectableMethod"    # Lcom/google/inject/spi/InjectionPoint$InjectableMethod;
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 735
    const/4 v1, 0x1

    .line 736
    .local v1, "result":Z
    iget-boolean v2, p0, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->jsr330:Z

    if-eqz v2, :cond_1

    .line 737
    iget-object v0, p0, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->method:Ljava/lang/reflect/Method;

    .line 738
    .local v0, "method":Ljava/lang/reflect/Method;
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 739
    invoke-virtual {p1, v0}, Lcom/google/inject/internal/Errors;->cannotInjectAbstractMethod(Ljava/lang/reflect/Method;)Lcom/google/inject/internal/Errors;

    .line 740
    const/4 v1, 0x0

    .line 742
    :cond_0
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v2

    array-length v2, v2

    if-lez v2, :cond_1

    .line 743
    invoke-virtual {p1, v0}, Lcom/google/inject/internal/Errors;->cannotInjectMethodWithTypeParameters(Ljava/lang/reflect/Method;)Lcom/google/inject/internal/Errors;

    .line 744
    const/4 v1, 0x0

    .line 747
    .end local v0    # "method":Ljava/lang/reflect/Method;
    :cond_1
    return v1
.end method

.method private newDependency(Lcom/google/inject/Key;ZI)Lcom/google/inject/spi/Dependency;
    .locals 1
    .param p2, "allowsNull"    # Z
    .param p3, "parameterIndex"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;ZI)",
            "Lcom/google/inject/spi/Dependency",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 131
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    new-instance v0, Lcom/google/inject/spi/Dependency;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/inject/spi/Dependency;-><init>(Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/Key;ZI)V

    return-object v0
.end method

.method private static overrides(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z
    .locals 3
    .param p0, "a"    # Ljava/lang/reflect/Method;
    .param p1, "b"    # Ljava/lang/reflect/Method;

    .prologue
    .line 766
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    .line 767
    .local v0, "modifiers":I
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 768
    :cond_0
    const/4 v1, 0x1

    .line 774
    :goto_0
    return v1

    .line 770
    :cond_1
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 771
    const/4 v1, 0x0

    goto :goto_0

    .line 774
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 184
    instance-of v0, p1, Lcom/google/inject/spi/InjectionPoint;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/inject/spi/InjectionPoint;->member:Ljava/lang/reflect/Member;

    move-object v0, p1

    check-cast v0, Lcom/google/inject/spi/InjectionPoint;

    iget-object v0, v0, Lcom/google/inject/spi/InjectionPoint;->member:Ljava/lang/reflect/Member;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/inject/spi/InjectionPoint;->declaringType:Lcom/google/inject/TypeLiteral;

    check-cast p1, Lcom/google/inject/spi/InjectionPoint;

    .end local p1    # "o":Ljava/lang/Object;
    iget-object v1, p1, Lcom/google/inject/spi/InjectionPoint;->declaringType:Lcom/google/inject/TypeLiteral;

    invoke-virtual {v0, v1}, Lcom/google/inject/TypeLiteral;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getDeclaringType()Lcom/google/inject/TypeLiteral;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/TypeLiteral",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 180
    iget-object v0, p0, Lcom/google/inject/spi/InjectionPoint;->declaringType:Lcom/google/inject/TypeLiteral;

    return-object v0
.end method

.method public getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Dependency",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 150
    iget-object v0, p0, Lcom/google/inject/spi/InjectionPoint;->dependencies:Lcom/google/inject/internal/util/$ImmutableList;

    return-object v0
.end method

.method public getMember()Ljava/lang/reflect/Member;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/google/inject/spi/InjectionPoint;->member:Ljava/lang/reflect/Member;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 190
    iget-object v0, p0, Lcom/google/inject/spi/InjectionPoint;->member:Ljava/lang/reflect/Member;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/google/inject/spi/InjectionPoint;->declaringType:Lcom/google/inject/TypeLiteral;

    invoke-virtual {v1}, Lcom/google/inject/TypeLiteral;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public isOptional()Z
    .locals 1

    .prologue
    .line 160
    iget-boolean v0, p0, Lcom/google/inject/spi/InjectionPoint;->optional:Z

    return v0
.end method

.method public isToolable()Z
    .locals 2

    .prologue
    .line 169
    iget-object v0, p0, Lcom/google/inject/spi/InjectionPoint;->member:Ljava/lang/reflect/Member;

    check-cast v0, Ljava/lang/reflect/AnnotatedElement;

    const-class v1, Lcom/google/inject/spi/Toolable;

    invoke-interface {v0, v1}, Ljava/lang/reflect/AnnotatedElement;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lcom/google/inject/spi/InjectionPoint;->member:Ljava/lang/reflect/Member;

    invoke-static {v0}, Lcom/google/inject/internal/util/$Classes;->toString(Ljava/lang/reflect/Member;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
