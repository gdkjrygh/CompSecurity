.class abstract Lcom/google/inject/spi/InjectionPoint$InjectableMember;
.super Ljava/lang/Object;
.source "InjectionPoint.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/spi/InjectionPoint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "InjectableMember"
.end annotation


# instance fields
.field final declaringType:Lcom/google/inject/TypeLiteral;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/TypeLiteral",
            "<*>;"
        }
    .end annotation
.end field

.field final jsr330:Z

.field next:Lcom/google/inject/spi/InjectionPoint$InjectableMember;

.field final optional:Z

.field previous:Lcom/google/inject/spi/InjectionPoint$InjectableMember;


# direct methods
.method constructor <init>(Lcom/google/inject/TypeLiteral;Ljava/lang/annotation/Annotation;)V
    .locals 3
    .param p2, "atInject"    # Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Ljava/lang/annotation/Annotation;",
            ")V"
        }
    .end annotation

    .prologue
    .local p1, "declaringType":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const/4 v2, 0x0

    .line 413
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 414
    iput-object p1, p0, Lcom/google/inject/spi/InjectionPoint$InjectableMember;->declaringType:Lcom/google/inject/TypeLiteral;

    .line 416
    invoke-interface {p2}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljavax/inject/Inject;

    if-ne v0, v1, :cond_0

    .line 417
    iput-boolean v2, p0, Lcom/google/inject/spi/InjectionPoint$InjectableMember;->optional:Z

    .line 418
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/inject/spi/InjectionPoint$InjectableMember;->jsr330:Z

    .line 424
    .end local p2    # "atInject":Ljava/lang/annotation/Annotation;
    :goto_0
    return-void

    .line 422
    .restart local p2    # "atInject":Ljava/lang/annotation/Annotation;
    :cond_0
    iput-boolean v2, p0, Lcom/google/inject/spi/InjectionPoint$InjectableMember;->jsr330:Z

    .line 423
    check-cast p2, Lcom/google/inject/Inject;

    .end local p2    # "atInject":Ljava/lang/annotation/Annotation;
    invoke-interface {p2}, Lcom/google/inject/Inject;->optional()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/inject/spi/InjectionPoint$InjectableMember;->optional:Z

    goto :goto_0
.end method


# virtual methods
.method abstract toInjectionPoint()Lcom/google/inject/spi/InjectionPoint;
.end method
