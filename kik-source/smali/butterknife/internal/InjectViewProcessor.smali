.class public final Lbutterknife/internal/InjectViewProcessor;
.super Ljavax/annotation/processing/AbstractProcessor;
.source "SourceFile"


# static fields
.field private static final LISTENERS:Ljava/util/List;

.field private static final LISTENER_MAP:Ljava/util/Map;

.field public static final SUFFIX:Ljava/lang/String; = "$$ViewInjector"

.field static final VIEW_TYPE:Ljava/lang/String; = "android.view.View"


# instance fields
.field private elementUtils:Ljavax/lang/model/util/Elements;

.field private filer:Ljavax/annotation/processing/Filer;

.field private typeUtils:Ljavax/lang/model/util/Types;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 52
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lbutterknife/internal/InjectViewProcessor;->LISTENER_MAP:Ljava/util/Map;

    .line 53
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Lbutterknife/OnCheckedChanged;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-class v2, Lbutterknife/OnClick;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-class v2, Lbutterknife/OnEditorAction;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-class v2, Lbutterknife/OnFocusChanged;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-class v2, Lbutterknife/OnItemClick;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-class v2, Lbutterknife/OnItemLongClick;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-class v2, Lbutterknife/OnLongClick;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lbutterknife/internal/InjectViewProcessor;->LISTENERS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Ljavax/annotation/processing/AbstractProcessor;-><init>()V

    return-void
.end method

.method private containsTypeMirror(Ljava/util/Collection;Ljavax/lang/model/type/TypeMirror;)Z
    .locals 4

    .prologue
    .line 450
    iget-object v0, p0, Lbutterknife/internal/InjectViewProcessor;->typeUtils:Ljavax/lang/model/util/Types;

    invoke-interface {v0, p2}, Ljavax/lang/model/util/Types;->erasure(Ljavax/lang/model/type/TypeMirror;)Ljavax/lang/model/type/TypeMirror;

    move-result-object v1

    .line 452
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/lang/model/type/TypeMirror;

    .line 453
    iget-object v3, p0, Lbutterknife/internal/InjectViewProcessor;->typeUtils:Ljavax/lang/model/util/Types;

    invoke-interface {v3, v0, v1}, Ljavax/lang/model/util/Types;->isSameType(Ljavax/lang/model/type/TypeMirror;Ljavax/lang/model/type/TypeMirror;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 454
    const/4 v0, 0x1

    .line 457
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private varargs error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 465
    iget-object v0, p0, Lbutterknife/internal/InjectViewProcessor;->processingEnv:Ljavax/annotation/processing/ProcessingEnvironment;

    invoke-interface {v0}, Ljavax/annotation/processing/ProcessingEnvironment;->getMessager()Ljavax/annotation/processing/Messager;

    move-result-object v0

    sget-object v1, Ljavax/tools/Diagnostic$Kind;->ERROR:Ljavax/tools/Diagnostic$Kind;

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, Ljavax/annotation/processing/Messager;->printMessage(Ljavax/tools/Diagnostic$Kind;Ljava/lang/CharSequence;Ljavax/lang/model/element/Element;)V

    .line 466
    return-void
.end method

.method private findAndParseListener(Ljavax/annotation/processing/RoundEnvironment;Ljava/lang/Class;Ljava/util/Map;Ljava/util/Set;)V
    .locals 7

    .prologue
    .line 208
    invoke-interface {p1, p2}, Ljavax/annotation/processing/RoundEnvironment;->getElementsAnnotatedWith(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/lang/model/element/Element;

    .line 210
    :try_start_0
    invoke-direct {p0, p2, v0, p3, p4}, Lbutterknife/internal/InjectViewProcessor;->parseListenerAnnotation(Ljava/lang/Class;Ljavax/lang/model/element/Element;Ljava/util/Map;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 211
    :catch_0
    move-exception v2

    .line 212
    new-instance v3, Ljava/io/StringWriter;

    invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V

    .line 213
    new-instance v4, Ljava/io/PrintWriter;

    invoke-direct {v4, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v2, v4}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 215
    const-string v2, "Unable to generate view injector for @%s.\n\n%s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-virtual {v3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v4, v5

    invoke-direct {p0, v0, v2, v4}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 219
    :cond_0
    return-void
.end method

.method private findAndParseTargets(Ljavax/annotation/processing/RoundEnvironment;)Ljava/util/Map;
    .locals 8

    .prologue
    .line 107
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 108
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 111
    const-class v0, Lbutterknife/InjectView;

    invoke-interface {p1, v0}, Ljavax/annotation/processing/RoundEnvironment;->getElementsAnnotatedWith(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/lang/model/element/Element;

    .line 113
    :try_start_0
    invoke-direct {p0, v0, v2, v3}, Lbutterknife/internal/InjectViewProcessor;->parseInjectView(Ljavax/lang/model/element/Element;Ljava/util/Map;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 114
    :catch_0
    move-exception v4

    .line 115
    new-instance v5, Ljava/io/StringWriter;

    invoke-direct {v5}, Ljava/io/StringWriter;-><init>()V

    .line 116
    new-instance v6, Ljava/io/PrintWriter;

    invoke-direct {v6, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v4, v6}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 118
    const-string v4, "Unable to generate view injector for @InjectView.\n\n%s"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-virtual {v5}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v6, v7

    invoke-direct {p0, v0, v4, v6}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 124
    :cond_0
    sget-object v0, Lbutterknife/internal/InjectViewProcessor;->LISTENERS:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 125
    invoke-direct {p0, p1, v0, v2, v3}, Lbutterknife/internal/InjectViewProcessor;->findAndParseListener(Ljavax/annotation/processing/RoundEnvironment;Ljava/lang/Class;Ljava/util/Map;Ljava/util/Set;)V

    goto :goto_1

    .line 129
    :cond_1
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 130
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljavax/lang/model/element/TypeElement;

    invoke-direct {p0, v1, v3}, Lbutterknife/internal/InjectViewProcessor;->findParentFqcn(Ljavax/lang/model/element/TypeElement;Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    .line 131
    if-eqz v1, :cond_2

    .line 132
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbutterknife/internal/ViewInjector;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "$$ViewInjector"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbutterknife/internal/ViewInjector;->setParentInjector(Ljava/lang/String;)V

    goto :goto_2

    .line 136
    :cond_3
    return-object v2
.end method

.method private findParentFqcn(Ljavax/lang/model/element/TypeElement;Ljava/util/Set;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 436
    :goto_0
    invoke-interface {p1}, Ljavax/lang/model/element/TypeElement;->getSuperclass()Ljavax/lang/model/type/TypeMirror;

    move-result-object v1

    .line 437
    invoke-interface {v1}, Ljavax/lang/model/type/TypeMirror;->getKind()Ljavax/lang/model/type/TypeKind;

    move-result-object v0

    sget-object v2, Ljavax/lang/model/type/TypeKind;->NONE:Ljavax/lang/model/type/TypeKind;

    if-ne v0, v2, :cond_0

    .line 438
    const/4 v0, 0x0

    .line 443
    :goto_1
    return-object v0

    :cond_0
    move-object v0, v1

    .line 440
    check-cast v0, Ljavax/lang/model/type/DeclaredType;

    invoke-interface {v0}, Ljavax/lang/model/type/DeclaredType;->asElement()Ljavax/lang/model/element/Element;

    move-result-object v0

    check-cast v0, Ljavax/lang/model/element/TypeElement;

    .line 441
    invoke-direct {p0, p2, v1}, Lbutterknife/internal/InjectViewProcessor;->containsTypeMirror(Ljava/util/Collection;Ljavax/lang/model/type/TypeMirror;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 442
    invoke-direct {p0, v0}, Lbutterknife/internal/InjectViewProcessor;->getPackageName(Ljavax/lang/model/element/TypeElement;)Ljava/lang/String;

    move-result-object v1

    .line 443
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0, v1}, Lbutterknife/internal/InjectViewProcessor;->getClassName(Ljavax/lang/model/element/TypeElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object p1, v0

    goto :goto_0
.end method

.method private static getClassName(Ljavax/lang/model/element/TypeElement;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 428
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 429
    invoke-interface {p0}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    const/16 v2, 0x24

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getOrCreateTargetClass(Ljava/util/Map;Ljavax/lang/model/element/TypeElement;)Lbutterknife/internal/ViewInjector;
    .locals 4

    .prologue
    .line 415
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbutterknife/internal/ViewInjector;

    .line 416
    if-nez v0, :cond_0

    .line 417
    invoke-interface {p2}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 418
    invoke-direct {p0, p2}, Lbutterknife/internal/InjectViewProcessor;->getPackageName(Ljavax/lang/model/element/TypeElement;)Ljava/lang/String;

    move-result-object v2

    .line 419
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p2, v2}, Lbutterknife/internal/InjectViewProcessor;->getClassName(Ljavax/lang/model/element/TypeElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "$$ViewInjector"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 421
    new-instance v0, Lbutterknife/internal/ViewInjector;

    invoke-direct {v0, v2, v3, v1}, Lbutterknife/internal/ViewInjector;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    :cond_0
    return-object v0
.end method

.method private getPackageName(Ljavax/lang/model/element/TypeElement;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 469
    iget-object v0, p0, Lbutterknife/internal/InjectViewProcessor;->elementUtils:Ljavax/lang/model/util/Elements;

    invoke-interface {v0, p1}, Ljavax/lang/model/util/Elements;->getPackageOf(Ljavax/lang/model/element/Element;)Ljavax/lang/model/element/PackageElement;

    move-result-object v0

    invoke-interface {v0}, Ljavax/lang/model/element/PackageElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private isSubtypeOfType(Ljavax/lang/model/type/TypeMirror;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 374
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v1, v2

    .line 410
    :cond_0
    :goto_0
    return v1

    .line 377
    :cond_1
    instance-of v0, p1, Ljavax/lang/model/type/DeclaredType;

    if-eqz v0, :cond_0

    .line 380
    check-cast p1, Ljavax/lang/model/type/DeclaredType;

    .line 381
    invoke-interface {p1}, Ljavax/lang/model/type/DeclaredType;->getTypeArguments()Ljava/util/List;

    move-result-object v3

    .line 382
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 383
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljavax/lang/model/type/DeclaredType;->asElement()Ljavax/lang/model/element/Element;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 384
    const/16 v0, 0x3c

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v0, v1

    .line 385
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v0, v5, :cond_3

    .line 386
    if-lez v0, :cond_2

    .line 387
    const/16 v5, 0x2c

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 389
    :cond_2
    const/16 v5, 0x3f

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 385
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 391
    :cond_3
    const/16 v0, 0x3e

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 392
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v1, v2

    .line 393
    goto :goto_0

    .line 396
    :cond_4
    invoke-interface {p1}, Ljavax/lang/model/type/DeclaredType;->asElement()Ljavax/lang/model/element/Element;

    move-result-object v0

    .line 397
    instance-of v3, v0, Ljavax/lang/model/element/TypeElement;

    if-eqz v3, :cond_0

    .line 400
    check-cast v0, Ljavax/lang/model/element/TypeElement;

    .line 401
    invoke-interface {v0}, Ljavax/lang/model/element/TypeElement;->getSuperclass()Ljavax/lang/model/type/TypeMirror;

    move-result-object v3

    .line 402
    invoke-direct {p0, v3, p2}, Lbutterknife/internal/InjectViewProcessor;->isSubtypeOfType(Ljavax/lang/model/type/TypeMirror;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    move v1, v2

    .line 403
    goto :goto_0

    .line 405
    :cond_5
    invoke-interface {v0}, Ljavax/lang/model/element/TypeElement;->getInterfaces()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/lang/model/type/TypeMirror;

    .line 406
    invoke-direct {p0, v0, p2}, Lbutterknife/internal/InjectViewProcessor;->isSubtypeOfType(Ljavax/lang/model/type/TypeMirror;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    move v1, v2

    .line 407
    goto :goto_0
.end method

.method private isValidForGeneratedCode(Ljava/lang/Class;Ljava/lang/String;Ljavax/lang/model/element/Element;)Z
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 141
    .line 142
    invoke-interface {p3}, Ljavax/lang/model/element/Element;->getEnclosingElement()Ljavax/lang/model/element/Element;

    move-result-object v0

    check-cast v0, Ljavax/lang/model/element/TypeElement;

    .line 145
    invoke-interface {p3}, Ljavax/lang/model/element/Element;->getModifiers()Ljava/util/Set;

    move-result-object v1

    .line 146
    sget-object v4, Ljavax/lang/model/element/Modifier;->PRIVATE:Ljavax/lang/model/element/Modifier;

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Ljavax/lang/model/element/Modifier;->STATIC:Ljavax/lang/model/element/Modifier;

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 147
    :cond_0
    const-string v1, "@%s %s must not be private or static. (%s.%s)"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    aput-object p2, v4, v3

    invoke-interface {v0}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-interface {p3}, Ljavax/lang/model/element/Element;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-direct {p0, p3, v1, v4}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    move v1, v3

    .line 154
    :goto_0
    invoke-interface {v0}, Ljavax/lang/model/element/TypeElement;->getKind()Ljavax/lang/model/element/ElementKind;

    move-result-object v4

    sget-object v5, Ljavax/lang/model/element/ElementKind;->CLASS:Ljavax/lang/model/element/ElementKind;

    if-eq v4, v5, :cond_1

    .line 155
    const-string v1, "@%s %s may only be contained in classes. (%s.%s)"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    aput-object p2, v4, v3

    invoke-interface {v0}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-interface {p3}, Ljavax/lang/model/element/Element;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-direct {p0, v0, v1, v4}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    move v1, v3

    .line 162
    :cond_1
    invoke-interface {v0}, Ljavax/lang/model/element/TypeElement;->getModifiers()Ljava/util/Set;

    move-result-object v4

    sget-object v5, Ljavax/lang/model/element/Modifier;->PRIVATE:Ljavax/lang/model/element/Modifier;

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 163
    const-string v1, "@%s %s may not be contained in private classes. (%s.%s)"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    aput-object p2, v4, v3

    invoke-interface {v0}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v2

    aput-object v2, v4, v6

    invoke-interface {p3}, Ljavax/lang/model/element/Element;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v2

    aput-object v2, v4, v7

    invoke-direct {p0, v0, v1, v4}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    :goto_1
    return v3

    :cond_2
    move v3, v1

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_0
.end method

.method private parseInjectView(Ljavax/lang/model/element/Element;Ljava/util/Map;Ljava/util/Set;)V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 174
    .line 175
    invoke-interface {p1}, Ljavax/lang/model/element/Element;->getEnclosingElement()Ljavax/lang/model/element/Element;

    move-result-object v0

    check-cast v0, Ljavax/lang/model/element/TypeElement;

    .line 178
    invoke-interface {p1}, Ljavax/lang/model/element/Element;->asType()Ljavax/lang/model/type/TypeMirror;

    move-result-object v1

    const-string v4, "android.view.View"

    invoke-direct {p0, v1, v4}, Lbutterknife/internal/InjectViewProcessor;->isSubtypeOfType(Ljavax/lang/model/type/TypeMirror;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 179
    const-string v1, "@InjectView fields must extend from View (%s.%s)."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-interface {p1}, Ljavax/lang/model/element/Element;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-direct {p0, p1, v1, v4}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    move v1, v2

    .line 185
    :goto_0
    const-class v4, Lbutterknife/InjectView;

    const-string v5, "fields"

    invoke-direct {p0, v4, v5, p1}, Lbutterknife/internal/InjectViewProcessor;->isValidForGeneratedCode(Ljava/lang/Class;Ljava/lang/String;Ljavax/lang/model/element/Element;)Z

    move-result v4

    or-int/2addr v1, v4

    .line 187
    if-eqz v1, :cond_0

    .line 203
    :goto_1
    return-void

    .line 192
    :cond_0
    invoke-interface {p1}, Ljavax/lang/model/element/Element;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 193
    const-class v1, Lbutterknife/InjectView;

    invoke-interface {p1, v1}, Ljavax/lang/model/element/Element;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Lbutterknife/InjectView;

    invoke-interface {v1}, Lbutterknife/InjectView;->value()I

    move-result v1

    .line 194
    invoke-interface {p1}, Ljavax/lang/model/element/Element;->asType()Ljavax/lang/model/type/TypeMirror;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 195
    const-class v6, Lbutterknife/Optional;

    invoke-interface {p1, v6}, Ljavax/lang/model/element/Element;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    if-nez v6, :cond_1

    .line 197
    :goto_2
    invoke-direct {p0, p2, v0}, Lbutterknife/internal/InjectViewProcessor;->getOrCreateTargetClass(Ljava/util/Map;Ljavax/lang/model/element/TypeElement;)Lbutterknife/internal/ViewInjector;

    move-result-object v3

    .line 198
    invoke-virtual {v3, v1, v4, v5, v2}, Lbutterknife/internal/ViewInjector;->addField(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 201
    iget-object v1, p0, Lbutterknife/internal/InjectViewProcessor;->typeUtils:Ljavax/lang/model/util/Types;

    invoke-interface {v0}, Ljavax/lang/model/element/TypeElement;->asType()Ljavax/lang/model/type/TypeMirror;

    move-result-object v0

    invoke-interface {v1, v0}, Ljavax/lang/model/util/Types;->erasure(Ljavax/lang/model/type/TypeMirror;)Ljavax/lang/model/type/TypeMirror;

    move-result-object v0

    .line 202
    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    move v2, v3

    .line 195
    goto :goto_2

    :cond_2
    move v1, v3

    goto :goto_0
.end method

.method private parseListenerAnnotation(Ljava/lang/Class;Ljavax/lang/model/element/Element;Ljava/util/Map;Ljava/util/Set;)V
    .locals 17

    .prologue
    .line 225
    move-object/from16 v0, p2

    instance-of v3, v0, Ljavax/lang/model/element/ExecutableElement;

    if-eqz v3, :cond_0

    invoke-interface/range {p2 .. p2}, Ljavax/lang/model/element/Element;->getKind()Ljavax/lang/model/element/ElementKind;

    move-result-object v3

    sget-object v4, Ljavax/lang/model/element/ElementKind;->METHOD:Ljavax/lang/model/element/ElementKind;

    if-eq v3, v4, :cond_2

    .line 226
    :cond_0
    const-string v3, "@%s annotation must be on a method."

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v3, v4}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    :cond_1
    :goto_0
    return-void

    :cond_2
    move-object/from16 v3, p2

    .line 230
    check-cast v3, Ljavax/lang/model/element/ExecutableElement;

    .line 231
    invoke-interface/range {p2 .. p2}, Ljavax/lang/model/element/Element;->getEnclosingElement()Ljavax/lang/model/element/Element;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ljavax/lang/model/element/TypeElement;

    .line 234
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Ljavax/lang/model/element/Element;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    .line 235
    const-string v5, "value"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Class;

    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 236
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    const-class v7, [I

    if-eq v6, v7, :cond_4

    .line 237
    :cond_3
    const-string v3, "@%s annotation lacks int[] value property. (%s.%s)"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x1

    invoke-interface {v9}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x2

    invoke-interface/range {p2 .. p2}, Ljavax/lang/model/element/Element;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v6

    aput-object v6, v4, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v3, v4}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 242
    :cond_4
    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v5, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, [I

    .line 243
    invoke-interface {v3}, Ljavax/lang/model/element/ExecutableElement;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 244
    const-class v4, Lbutterknife/Optional;

    move-object/from16 v0, p2

    invoke-interface {v0, v4}, Ljavax/lang/model/element/Element;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    if-nez v4, :cond_5

    const/4 v8, 0x1

    .line 247
    :goto_1
    const-string v4, "methods"

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v4, v2}, Lbutterknife/internal/InjectViewProcessor;->isValidForGeneratedCode(Ljava/lang/Class;Ljava/lang/String;Ljavax/lang/model/element/Element;)Z

    move-result v7

    .line 249
    new-instance v11, Ljava/util/LinkedHashSet;

    array-length v4, v10

    invoke-direct {v11, v4}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 250
    array-length v12, v10

    const/4 v4, 0x0

    move v5, v4

    :goto_2
    if-ge v5, v12, :cond_6

    aget v4, v10, v5

    .line 251
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v11, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_15

    .line 252
    const-string v7, "@%s annotation for method contains duplicate ID %d. (%s.%s)"

    const/4 v13, 0x4

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v15

    aput-object v15, v13, v14

    const/4 v14, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v13, v14

    const/4 v4, 0x2

    invoke-interface {v9}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v14

    aput-object v14, v13, v4

    const/4 v4, 0x3

    invoke-interface/range {p2 .. p2}, Ljavax/lang/model/element/Element;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v14

    aput-object v14, v13, v4

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v7, v13}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    const/4 v4, 0x1

    .line 250
    :goto_3
    add-int/lit8 v5, v5, 0x1

    move v7, v4

    goto :goto_2

    .line 244
    :cond_5
    const/4 v8, 0x0

    goto :goto_1

    .line 259
    :cond_6
    const-class v4, Lbutterknife/internal/ListenerClass;

    move-object/from16 v0, p1

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Lbutterknife/internal/ListenerClass;

    .line 260
    if-nez v4, :cond_7

    .line 261
    const-string v3, "No @%s defined on @%s."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-class v6, Lbutterknife/internal/ListenerClass;

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v3, v4}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 267
    :cond_7
    invoke-interface {v4}, Lbutterknife/internal/ListenerClass;->value()Ljava/lang/String;

    move-result-object v11

    .line 268
    sget-object v4, Lbutterknife/internal/InjectViewProcessor;->LISTENER_MAP:Ljava/util/Map;

    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbutterknife/internal/Listener;

    .line 269
    if-nez v4, :cond_14

    .line 271
    :try_start_0
    move-object/from16 v0, p0

    iget-object v4, v0, Lbutterknife/internal/InjectViewProcessor;->elementUtils:Ljavax/lang/model/util/Elements;

    invoke-interface {v4, v11}, Ljavax/lang/model/util/Elements;->getTypeElement(Ljava/lang/CharSequence;)Ljavax/lang/model/element/TypeElement;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lbutterknife/internal/InjectViewProcessor;->typeUtils:Ljavax/lang/model/util/Types;

    invoke-static {v4, v5}, Lbutterknife/internal/Listener;->from(Ljavax/lang/model/element/TypeElement;Ljavax/lang/model/util/Types;)Lbutterknife/internal/Listener;

    move-result-object v5

    .line 272
    sget-object v4, Lbutterknife/internal/InjectViewProcessor;->LISTENER_MAP:Ljava/util/Map;

    invoke-interface {v4, v11, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    :goto_4
    invoke-interface {v3}, Ljavax/lang/model/element/ExecutableElement;->getParameters()Ljava/util/List;

    move-result-object v13

    .line 282
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v5}, Lbutterknife/internal/Listener;->getParameterTypes()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-le v4, v11, :cond_8

    .line 283
    const-string v4, "@%s methods can have at most %s parameter(s). (%s.%s)"

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v11, 0x0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v7, v11

    const/4 v11, 0x1

    invoke-virtual {v5}, Lbutterknife/internal/Listener;->getParameterTypes()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v7, v11

    const/4 v11, 0x2

    invoke-interface {v9}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v12

    aput-object v12, v7, v11

    const/4 v11, 0x3

    invoke-interface/range {p2 .. p2}, Ljavax/lang/model/element/Element;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v12

    aput-object v12, v7, v11

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v4, v7}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    const/4 v7, 0x1

    .line 290
    :cond_8
    invoke-interface {v3}, Ljavax/lang/model/element/ExecutableElement;->getReturnType()Ljavax/lang/model/type/TypeMirror;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5}, Lbutterknife/internal/Listener;->getReturnType()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    .line 291
    const-string v4, "@%s methods must have a \'%s\' return type. (%s.%s)"

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v11, 0x0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v7, v11

    const/4 v11, 0x1

    invoke-virtual {v5}, Lbutterknife/internal/Listener;->getReturnType()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v7, v11

    const/4 v11, 0x2

    invoke-interface {v9}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v12

    aput-object v12, v7, v11

    const/4 v11, 0x3

    invoke-interface/range {p2 .. p2}, Ljavax/lang/model/element/Element;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v12

    aput-object v12, v7, v11

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v4, v7}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    const/4 v7, 0x1

    .line 297
    :cond_9
    if-nez v7, :cond_1

    .line 301
    sget-object v4, Lbutterknife/internal/Parameter;->NONE:[Lbutterknife/internal/Parameter;

    .line 302
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_13

    .line 303
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v4

    new-array v12, v4, [Lbutterknife/internal/Parameter;

    .line 304
    new-instance v14, Ljava/util/BitSet;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v14, v4}, Ljava/util/BitSet;-><init>(I)V

    .line 305
    invoke-virtual {v5}, Lbutterknife/internal/Listener;->getParameterTypes()Ljava/util/List;

    move-result-object v15

    .line 306
    const/4 v4, 0x0

    move v7, v4

    :goto_5
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v4

    if-ge v7, v4, :cond_10

    .line 307
    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljavax/lang/model/element/VariableElement;

    .line 308
    invoke-interface {v4}, Ljavax/lang/model/element/VariableElement;->asType()Ljavax/lang/model/type/TypeMirror;

    move-result-object v16

    .line 310
    const/4 v4, 0x0

    move v11, v4

    :goto_6
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v4

    if-ge v11, v4, :cond_a

    .line 311
    invoke-virtual {v14, v11}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-nez v4, :cond_b

    .line 312
    invoke-interface {v15, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1, v4}, Lbutterknife/internal/InjectViewProcessor;->isSubtypeOfType(Ljavax/lang/model/type/TypeMirror;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 315
    new-instance v4, Lbutterknife/internal/Parameter;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-direct {v4, v11, v0}, Lbutterknife/internal/Parameter;-><init>(ILjava/lang/String;)V

    aput-object v4, v12, v7

    .line 316
    invoke-virtual {v14, v11}, Ljava/util/BitSet;->set(I)V

    .line 320
    :cond_a
    aget-object v4, v12, v7

    if-nez v4, :cond_f

    .line 321
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    const-string v4, "Unable to match @"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, " method arguments. ("

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-interface {v9}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v4

    const/16 v6, 0x2e

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-interface/range {p2 .. p2}, Ljavax/lang/model/element/Element;->getSimpleName()Ljavax/lang/model/element/Name;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v4

    const/16 v6, 0x29

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 329
    const/4 v4, 0x0

    move v6, v4

    :goto_7
    array-length v4, v12

    if-ge v6, v4, :cond_d

    .line 330
    aget-object v8, v12, v6

    .line 331
    const-string v4, "\n\n  Parameter #"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    add-int/lit8 v9, v6, 0x1

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v9, ": "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-interface {v13, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljavax/lang/model/element/VariableElement;

    invoke-interface {v4}, Ljavax/lang/model/element/VariableElement;->asType()Ljavax/lang/model/type/TypeMirror;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v9, "\n    "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    if-nez v8, :cond_c

    .line 337
    const-string v4, "did not match any listener parameters"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    :goto_8
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    goto :goto_7

    .line 273
    :catch_0
    move-exception v3

    .line 274
    move-object/from16 v0, p0

    iget-object v4, v0, Lbutterknife/internal/InjectViewProcessor;->elementUtils:Ljavax/lang/model/util/Elements;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljavax/lang/model/util/Elements;->getTypeElement(Ljava/lang/CharSequence;)Ljavax/lang/model/element/TypeElement;

    move-result-object v4

    const-string v5, "%s (%s on @%s)"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-virtual {v3}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v6, v7

    const/4 v3, 0x1

    aput-object v11, v6, v3

    const/4 v3, 0x2

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v3

    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5, v6}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 310
    :cond_b
    add-int/lit8 v4, v11, 0x1

    move v11, v4

    goto/16 :goto_6

    .line 339
    :cond_c
    const-string v4, "matched listener parameter #"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v8}, Lbutterknife/internal/Parameter;->getListenerPosition()I

    move-result v9

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v9, ": "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v8}, Lbutterknife/internal/Parameter;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 345
    :cond_d
    const-string v4, "\n\nMethods may have up to "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v5}, Lbutterknife/internal/Listener;->getParameterTypes()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, " parameter(s):\n"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    invoke-virtual {v5}, Lbutterknife/internal/Listener;->getParameterTypes()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 349
    const-string v6, "\n  "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_9

    .line 351
    :cond_e
    const-string v4, "\n\nThese may be listed in any order but will be searched for from top to bottom."

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-direct {v0, v3, v4, v5}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 306
    :cond_f
    add-int/lit8 v4, v7, 0x1

    move v7, v4

    goto/16 :goto_5

    :cond_10
    move-object v11, v12

    .line 359
    :goto_a
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1, v9}, Lbutterknife/internal/InjectViewProcessor;->getOrCreateTargetClass(Ljava/util/Map;Ljavax/lang/model/element/TypeElement;)Lbutterknife/internal/ViewInjector;

    move-result-object v3

    .line 360
    array-length v13, v10

    const/4 v4, 0x0

    move v12, v4

    :goto_b
    if-ge v12, v13, :cond_12

    aget v4, v10, v12

    .line 361
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {v3 .. v8}, Lbutterknife/internal/ViewInjector;->addMethod(ILbutterknife/internal/Listener;Ljava/lang/String;Ljava/util/List;Z)Z

    move-result v7

    if-nez v7, :cond_11

    .line 362
    const-string v3, "Multiple @%s methods declared for ID %s in %s."

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v5, v6

    const/4 v4, 0x2

    invoke-interface {v9}, Ljavax/lang/model/element/TypeElement;->getQualifiedName()Ljavax/lang/model/element/Name;

    move-result-object v6

    aput-object v6, v5, v4

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v3, v5}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 360
    :cond_11
    add-int/lit8 v4, v12, 0x1

    move v12, v4

    goto :goto_b

    .line 369
    :cond_12
    move-object/from16 v0, p0

    iget-object v3, v0, Lbutterknife/internal/InjectViewProcessor;->typeUtils:Ljavax/lang/model/util/Types;

    invoke-interface {v9}, Ljavax/lang/model/element/TypeElement;->asType()Ljavax/lang/model/type/TypeMirror;

    move-result-object v4

    invoke-interface {v3, v4}, Ljavax/lang/model/util/Types;->erasure(Ljavax/lang/model/type/TypeMirror;)Ljavax/lang/model/type/TypeMirror;

    move-result-object v3

    .line 370
    move-object/from16 v0, p4

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_13
    move-object v11, v4

    goto :goto_a

    :cond_14
    move-object v5, v4

    goto/16 :goto_4

    :cond_15
    move v4, v7

    goto/16 :goto_3
.end method


# virtual methods
.method public final getSupportedAnnotationTypes()Ljava/util/Set;
    .locals 3

    .prologue
    .line 76
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 77
    const-class v0, Lbutterknife/InjectView;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 78
    sget-object v0, Lbutterknife/internal/InjectViewProcessor;->LISTENERS:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 79
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 82
    :cond_0
    return-object v1
.end method

.method public final getSupportedSourceVersion()Ljavax/lang/model/SourceVersion;
    .locals 1

    .prologue
    .line 461
    invoke-static {}, Ljavax/lang/model/SourceVersion;->latestSupported()Ljavax/lang/model/SourceVersion;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized init(Ljavax/annotation/processing/ProcessingEnvironment;)V
    .locals 1

    .prologue
    .line 68
    monitor-enter p0

    :try_start_0
    invoke-super {p0, p1}, Ljavax/annotation/processing/AbstractProcessor;->init(Ljavax/annotation/processing/ProcessingEnvironment;)V

    .line 70
    invoke-interface {p1}, Ljavax/annotation/processing/ProcessingEnvironment;->getElementUtils()Ljavax/lang/model/util/Elements;

    move-result-object v0

    iput-object v0, p0, Lbutterknife/internal/InjectViewProcessor;->elementUtils:Ljavax/lang/model/util/Elements;

    .line 71
    invoke-interface {p1}, Ljavax/annotation/processing/ProcessingEnvironment;->getTypeUtils()Ljavax/lang/model/util/Types;

    move-result-object v0

    iput-object v0, p0, Lbutterknife/internal/InjectViewProcessor;->typeUtils:Ljavax/lang/model/util/Types;

    .line 72
    invoke-interface {p1}, Ljavax/annotation/processing/ProcessingEnvironment;->getFiler()Ljavax/annotation/processing/Filer;

    move-result-object v0

    iput-object v0, p0, Lbutterknife/internal/InjectViewProcessor;->filer:Ljavax/annotation/processing/Filer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit p0

    return-void

    .line 68
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final process(Ljava/util/Set;Ljavax/annotation/processing/RoundEnvironment;)Z
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 86
    invoke-direct {p0, p2}, Lbutterknife/internal/InjectViewProcessor;->findAndParseTargets(Ljavax/annotation/processing/RoundEnvironment;)Ljava/util/Map;

    move-result-object v0

    .line 88
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Map$Entry;

    .line 89
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/lang/model/element/TypeElement;

    .line 90
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbutterknife/internal/ViewInjector;

    .line 93
    :try_start_0
    iget-object v3, p0, Lbutterknife/internal/InjectViewProcessor;->filer:Ljavax/annotation/processing/Filer;

    invoke-virtual {v1}, Lbutterknife/internal/ViewInjector;->getFqcn()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljavax/lang/model/element/Element;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    invoke-interface {v3, v4, v5}, Ljavax/annotation/processing/Filer;->createSourceFile(Ljava/lang/CharSequence;[Ljavax/lang/model/element/Element;)Ljavax/tools/JavaFileObject;

    move-result-object v3

    .line 94
    invoke-interface {v3}, Ljavax/tools/JavaFileObject;->openWriter()Ljava/io/Writer;

    move-result-object v3

    .line 95
    invoke-virtual {v1}, Lbutterknife/internal/ViewInjector;->brewJava()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 96
    invoke-virtual {v3}, Ljava/io/Writer;->flush()V

    .line 97
    invoke-virtual {v3}, Ljava/io/Writer;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 98
    :catch_0
    move-exception v1

    .line 99
    const-string v3, "Unable to write injector for type %s: %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v8

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v7

    invoke-direct {p0, v0, v3, v4}, Lbutterknife/internal/InjectViewProcessor;->error(Ljavax/lang/model/element/Element;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 103
    :cond_0
    return v7
.end method
