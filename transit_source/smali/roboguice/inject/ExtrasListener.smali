.class public Lroboguice/inject/ExtrasListener;
.super Ljava/lang/Object;
.source "ExtrasListener.java"

# interfaces
.implements Lcom/google/inject/spi/TypeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;
    }
.end annotation


# instance fields
.field protected contextProvider:Lcom/google/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Provider",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Provider",
            "<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 42
    .local p1, "contextProvider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<Landroid/content/Context;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lroboguice/inject/ExtrasListener;->contextProvider:Lcom/google/inject/Provider;

    .line 44
    return-void
.end method


# virtual methods
.method public hear(Lcom/google/inject/TypeLiteral;Lcom/google/inject/spi/TypeEncounter;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TI;>;",
            "Lcom/google/inject/spi/TypeEncounter",
            "<TI;>;)V"
        }
    .end annotation

    .prologue
    .line 48
    .local p1, "typeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TI;>;"
    .local p2, "typeEncounter":Lcom/google/inject/spi/TypeEncounter;, "Lcom/google/inject/spi/TypeEncounter<TI;>;"
    invoke-virtual {p1}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v1

    .local v1, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    const-class v5, Ljava/lang/Object;

    if-eq v1, v5, :cond_3

    .line 49
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Field;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_1
    if-ge v3, v4, :cond_2

    aget-object v2, v0, v3

    .line 50
    .local v2, "field":Ljava/lang/reflect/Field;
    const-class v5, Lroboguice/inject/InjectExtra;

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 51
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 52
    new-instance v5, Ljava/lang/UnsupportedOperationException;

    const-string v6, "Extras may not be statically injected"

    invoke-direct {v5, v6}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 54
    :cond_0
    new-instance v6, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;

    iget-object v7, p0, Lroboguice/inject/ExtrasListener;->contextProvider:Lcom/google/inject/Provider;

    const-class v5, Lroboguice/inject/InjectExtra;

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    check-cast v5, Lroboguice/inject/InjectExtra;

    invoke-direct {v6, v2, v7, v5}, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;-><init>(Ljava/lang/reflect/Field;Lcom/google/inject/Provider;Lroboguice/inject/InjectExtra;)V

    invoke-interface {p2, v6}, Lcom/google/inject/spi/TypeEncounter;->register(Lcom/google/inject/MembersInjector;)V

    .line 49
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 48
    .end local v2    # "field":Ljava/lang/reflect/Field;
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    .line 57
    .end local v0    # "arr$":[Ljava/lang/reflect/Field;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    :cond_3
    return-void
.end method
