.class Lcom/google/inject/spi/InjectionPoint$InjectableField;
.super Lcom/google/inject/spi/InjectionPoint$InjectableMember;
.source "InjectionPoint.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/spi/InjectionPoint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "InjectableField"
.end annotation


# instance fields
.field final field:Ljava/lang/reflect/Field;


# direct methods
.method constructor <init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Field;Ljava/lang/annotation/Annotation;)V
    .locals 0
    .param p2, "field"    # Ljava/lang/reflect/Field;
    .param p3, "atInject"    # Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/annotation/Annotation;",
            ")V"
        }
    .end annotation

    .prologue
    .line 433
    .local p1, "declaringType":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    invoke-direct {p0, p1, p3}, Lcom/google/inject/spi/InjectionPoint$InjectableMember;-><init>(Lcom/google/inject/TypeLiteral;Ljava/lang/annotation/Annotation;)V

    .line 434
    iput-object p2, p0, Lcom/google/inject/spi/InjectionPoint$InjectableField;->field:Ljava/lang/reflect/Field;

    .line 435
    return-void
.end method


# virtual methods
.method toInjectionPoint()Lcom/google/inject/spi/InjectionPoint;
    .locals 4

    .prologue
    .line 438
    new-instance v0, Lcom/google/inject/spi/InjectionPoint;

    iget-object v1, p0, Lcom/google/inject/spi/InjectionPoint$InjectableField;->declaringType:Lcom/google/inject/TypeLiteral;

    iget-object v2, p0, Lcom/google/inject/spi/InjectionPoint$InjectableField;->field:Ljava/lang/reflect/Field;

    iget-boolean v3, p0, Lcom/google/inject/spi/InjectionPoint$InjectableField;->optional:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/google/inject/spi/InjectionPoint;-><init>(Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Field;Z)V

    return-object v0
.end method
