.class public Lcom/google/inject/a/a;
.super Ljava/lang/Object;
.source "Annotations.java"


# static fields
.field private static final a:Lcom/google/inject/a/b;

.field private static final b:Lcom/google/inject/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 94
    new-instance v0, Lcom/google/inject/a/b;

    new-array v1, v5, [Ljava/lang/Class;

    const-class v2, Lcom/google/inject/ScopeAnnotation;

    aput-object v2, v1, v3

    const-class v2, Ljavax/inject/Scope;

    aput-object v2, v1, v4

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/a/b;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/google/inject/a/a;->a:Lcom/google/inject/a/b;

    .line 101
    new-instance v0, Lcom/google/inject/a/b;

    new-array v1, v5, [Ljava/lang/Class;

    const-class v2, Lcom/google/inject/BindingAnnotation;

    aput-object v2, v1, v3

    const-class v2, Ljavax/inject/Qualifier;

    aput-object v2, v1, v4

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/a/b;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/google/inject/a/a;->b:Lcom/google/inject/a/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    return-void
.end method

.method public static a(Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;
    .locals 1

    .prologue
    .line 116
    instance-of v0, p0, Ljavax/inject/Named;

    if-eqz v0, :cond_0

    .line 117
    check-cast p0, Ljavax/inject/Named;

    invoke-interface {p0}, Ljavax/inject/Named;->value()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/name/b;->a(Ljava/lang/String;)Lcom/google/inject/name/Named;

    move-result-object p0

    .line 119
    :cond_0
    return-object p0
.end method

.method public static a(Ljava/lang/Class;)Z
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
    .line 46
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

.method public static b(Ljava/lang/Class;)Z
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
    .line 108
    sget-object v0, Lcom/google/inject/a/a;->b:Lcom/google/inject/a/b;

    invoke-virtual {v0, p0}, Lcom/google/inject/a/b;->a(Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method

.method public static c(Ljava/lang/Class;)Ljava/lang/Class;
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
    .line 129
    const-class v0, Ljavax/inject/Named;

    if-ne p0, v0, :cond_0

    .line 130
    const-class p0, Lcom/google/inject/name/Named;

    .line 132
    :cond_0
    return-object p0
.end method
