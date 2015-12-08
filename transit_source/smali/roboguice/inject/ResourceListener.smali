.class public Lroboguice/inject/ResourceListener;
.super Ljava/lang/Object;
.source "ResourceListener.java"

# interfaces
.implements Lcom/google/inject/spi/TypeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lroboguice/inject/ResourceListener$ResourceMembersInjector;
    }
.end annotation


# instance fields
.field protected application:Landroid/app/Application;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 0
    .param p1, "application"    # Landroid/app/Application;

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lroboguice/inject/ResourceListener;->application:Landroid/app/Application;

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

    if-eq v1, v5, :cond_2

    .line 49
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Field;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_1
    if-ge v3, v4, :cond_1

    aget-object v2, v0, v3

    .line 50
    .local v2, "field":Ljava/lang/reflect/Field;
    const-class v5, Lroboguice/inject/InjectResource;

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    if-nez v5, :cond_0

    .line 51
    new-instance v6, Lroboguice/inject/ResourceListener$ResourceMembersInjector;

    iget-object v7, p0, Lroboguice/inject/ResourceListener;->application:Landroid/app/Application;

    const-class v5, Lroboguice/inject/InjectResource;

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    check-cast v5, Lroboguice/inject/InjectResource;

    invoke-direct {v6, v2, v7, v5}, Lroboguice/inject/ResourceListener$ResourceMembersInjector;-><init>(Ljava/lang/reflect/Field;Landroid/app/Application;Lroboguice/inject/InjectResource;)V

    invoke-interface {p2, v6}, Lcom/google/inject/spi/TypeEncounter;->register(Lcom/google/inject/MembersInjector;)V

    .line 49
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 48
    .end local v2    # "field":Ljava/lang/reflect/Field;
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    .line 53
    .end local v0    # "arr$":[Ljava/lang/reflect/Field;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    :cond_2
    return-void
.end method

.method public varargs requestStaticInjection([Ljava/lang/Class;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 58
    .local p1, "types":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    move-object v0, p1

    .local v0, "arr$":[Ljava/lang/Class;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    move v5, v4

    .end local v0    # "arr$":[Ljava/lang/Class;
    .end local v4    # "i$":I
    .end local v6    # "len$":I
    .local v5, "i$":I
    :goto_0
    if-ge v5, v6, :cond_3

    aget-object v2, v0, v5

    .line 59
    .end local v5    # "i$":I
    .local v2, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_1
    const-class v8, Ljava/lang/Object;

    if-eq v2, v8, :cond_2

    .line 60
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    .local v1, "arr$":[Ljava/lang/reflect/Field;
    array-length v7, v1

    .local v7, "len$":I
    const/4 v4, 0x0

    .restart local v4    # "i$":I
    :goto_2
    if-ge v4, v7, :cond_1

    aget-object v3, v1, v4

    .line 61
    .local v3, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v8

    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v8

    if-eqz v8, :cond_0

    const-class v8, Lroboguice/inject/InjectResource;

    invoke-virtual {v3, v8}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 62
    new-instance v9, Lroboguice/inject/ResourceListener$ResourceMembersInjector;

    iget-object v10, p0, Lroboguice/inject/ResourceListener;->application:Landroid/app/Application;

    const-class v8, Lroboguice/inject/InjectResource;

    invoke-virtual {v3, v8}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v8

    check-cast v8, Lroboguice/inject/InjectResource;

    invoke-direct {v9, v3, v10, v8}, Lroboguice/inject/ResourceListener$ResourceMembersInjector;-><init>(Ljava/lang/reflect/Field;Landroid/app/Application;Lroboguice/inject/InjectResource;)V

    const/4 v8, 0x0

    invoke-virtual {v9, v8}, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->injectMembers(Ljava/lang/Object;)V

    .line 60
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 59
    .end local v3    # "field":Ljava/lang/reflect/Field;
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_1

    .line 58
    .end local v1    # "arr$":[Ljava/lang/reflect/Field;
    .end local v4    # "i$":I
    .end local v7    # "len$":I
    :cond_2
    add-int/lit8 v4, v5, 0x1

    .restart local v4    # "i$":I
    move v5, v4

    .end local v4    # "i$":I
    .restart local v5    # "i$":I
    goto :goto_0

    .line 65
    .end local v2    # "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_3
    return-void
.end method
