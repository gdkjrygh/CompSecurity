.class public Lcom/google/inject/matcher/Matchers;
.super Ljava/lang/Object;
.source "Matchers.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/matcher/Matchers$1;,
        Lcom/google/inject/matcher/Matchers$Returns;,
        Lcom/google/inject/matcher/Matchers$InSubpackage;,
        Lcom/google/inject/matcher/Matchers$InPackage;,
        Lcom/google/inject/matcher/Matchers$IdenticalTo;,
        Lcom/google/inject/matcher/Matchers$Only;,
        Lcom/google/inject/matcher/Matchers$SubclassesOf;,
        Lcom/google/inject/matcher/Matchers$AnnotatedWith;,
        Lcom/google/inject/matcher/Matchers$AnnotatedWithType;,
        Lcom/google/inject/matcher/Matchers$Not;,
        Lcom/google/inject/matcher/Matchers$Any;
    }
.end annotation


# static fields
.field private static final ANY:Lcom/google/inject/matcher/Matcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/matcher/Matcher",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 43
    new-instance v0, Lcom/google/inject/matcher/Matchers$Any;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/inject/matcher/Matchers$Any;-><init>(Lcom/google/inject/matcher/Matchers$1;)V

    sput-object v0, Lcom/google/inject/matcher/Matchers;->ANY:Lcom/google/inject/matcher/Matcher;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$200(Ljava/lang/Class;)V
    .locals 0
    .param p0, "x0"    # Ljava/lang/Class;

    .prologue
    .line 33
    invoke-static {p0}, Lcom/google/inject/matcher/Matchers;->checkForRuntimeRetention(Ljava/lang/Class;)V

    return-void
.end method

.method public static annotatedWith(Ljava/lang/Class;)Lcom/google/inject/matcher/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/matcher/Matcher",
            "<",
            "Ljava/lang/reflect/AnnotatedElement;",
            ">;"
        }
    .end annotation

    .prologue
    .line 108
    .local p0, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    new-instance v0, Lcom/google/inject/matcher/Matchers$AnnotatedWithType;

    invoke-direct {v0, p0}, Lcom/google/inject/matcher/Matchers$AnnotatedWithType;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public static annotatedWith(Ljava/lang/annotation/Annotation;)Lcom/google/inject/matcher/Matcher;
    .locals 1
    .param p0, "annotation"    # Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lcom/google/inject/matcher/Matcher",
            "<",
            "Ljava/lang/reflect/AnnotatedElement;",
            ">;"
        }
    .end annotation

    .prologue
    .line 146
    new-instance v0, Lcom/google/inject/matcher/Matchers$AnnotatedWith;

    invoke-direct {v0, p0}, Lcom/google/inject/matcher/Matchers$AnnotatedWith;-><init>(Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public static any()Lcom/google/inject/matcher/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/matcher/Matcher",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 40
    sget-object v0, Lcom/google/inject/matcher/Matchers;->ANY:Lcom/google/inject/matcher/Matcher;

    return-object v0
.end method

.method private static checkForRuntimeRetention(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 97
    .local p0, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    const-class v1, Ljava/lang/annotation/Retention;

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ljava/lang/annotation/Retention;

    .line 98
    .local v0, "retention":Ljava/lang/annotation/Retention;
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/annotation/Retention;->value()Ljava/lang/annotation/RetentionPolicy;

    move-result-object v1

    sget-object v2, Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Annotation "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is missing RUNTIME retention"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/inject/internal/util/$Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 100
    return-void

    .line 98
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static identicalTo(Ljava/lang/Object;)Lcom/google/inject/matcher/Matcher;
    .locals 1
    .param p0, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/inject/matcher/Matcher",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 254
    new-instance v0, Lcom/google/inject/matcher/Matchers$IdenticalTo;

    invoke-direct {v0, p0}, Lcom/google/inject/matcher/Matchers$IdenticalTo;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static inPackage(Ljava/lang/Package;)Lcom/google/inject/matcher/Matcher;
    .locals 1
    .param p0, "targetPackage"    # Ljava/lang/Package;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Package;",
            ")",
            "Lcom/google/inject/matcher/Matcher",
            "<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation

    .prologue
    .line 290
    new-instance v0, Lcom/google/inject/matcher/Matchers$InPackage;

    invoke-direct {v0, p0}, Lcom/google/inject/matcher/Matchers$InPackage;-><init>(Ljava/lang/Package;)V

    return-object v0
.end method

.method public static inSubpackage(Ljava/lang/String;)Lcom/google/inject/matcher/Matcher;
    .locals 1
    .param p0, "targetPackageName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/inject/matcher/Matcher",
            "<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation

    .prologue
    .line 333
    new-instance v0, Lcom/google/inject/matcher/Matchers$InSubpackage;

    invoke-direct {v0, p0}, Lcom/google/inject/matcher/Matchers$InSubpackage;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static not(Lcom/google/inject/matcher/Matcher;)Lcom/google/inject/matcher/Matcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/matcher/Matcher",
            "<-TT;>;)",
            "Lcom/google/inject/matcher/Matcher",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 65
    .local p0, "p":Lcom/google/inject/matcher/Matcher;, "Lcom/google/inject/matcher/Matcher<-TT;>;"
    new-instance v0, Lcom/google/inject/matcher/Matchers$Not;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/inject/matcher/Matchers$Not;-><init>(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/matcher/Matchers$1;)V

    return-object v0
.end method

.method public static only(Ljava/lang/Object;)Lcom/google/inject/matcher/Matcher;
    .locals 1
    .param p0, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/inject/matcher/Matcher",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 219
    new-instance v0, Lcom/google/inject/matcher/Matchers$Only;

    invoke-direct {v0, p0}, Lcom/google/inject/matcher/Matchers$Only;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static returns(Lcom/google/inject/matcher/Matcher;)Lcom/google/inject/matcher/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/matcher/Matcher",
            "<-",
            "Ljava/lang/Class",
            "<*>;>;)",
            "Lcom/google/inject/matcher/Matcher",
            "<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .prologue
    .line 370
    .local p0, "returnType":Lcom/google/inject/matcher/Matcher;, "Lcom/google/inject/matcher/Matcher<-Ljava/lang/Class<*>;>;"
    new-instance v0, Lcom/google/inject/matcher/Matchers$Returns;

    invoke-direct {v0, p0}, Lcom/google/inject/matcher/Matchers$Returns;-><init>(Lcom/google/inject/matcher/Matcher;)V

    return-object v0
.end method

.method public static subclassesOf(Ljava/lang/Class;)Lcom/google/inject/matcher/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/matcher/Matcher",
            "<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation

    .prologue
    .line 184
    .local p0, "superclass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-instance v0, Lcom/google/inject/matcher/Matchers$SubclassesOf;

    invoke-direct {v0, p0}, Lcom/google/inject/matcher/Matchers$SubclassesOf;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method
