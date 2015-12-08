.class public Lroboguice/inject/ViewListener;
.super Ljava/lang/Object;
.source "ViewListener.java"

# interfaces
.implements Lcom/google/inject/spi/TypeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lroboguice/inject/ViewListener$ViewMembersInjector;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static fragmentClass:Ljava/lang/Class;

.field protected static fragmentFindFragmentByIdMethod:Ljava/lang/reflect/Method;

.field protected static fragmentFindFragmentByTagMethod:Ljava/lang/reflect/Method;

.field protected static fragmentGetViewMethod:Ljava/lang/reflect/Method;

.field protected static fragmentManagerClass:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 41
    sput-object v0, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    .line 42
    sput-object v0, Lroboguice/inject/ViewListener;->fragmentManagerClass:Ljava/lang/Class;

    .line 43
    sput-object v0, Lroboguice/inject/ViewListener;->fragmentGetViewMethod:Ljava/lang/reflect/Method;

    .line 44
    sput-object v0, Lroboguice/inject/ViewListener;->fragmentFindFragmentByIdMethod:Ljava/lang/reflect/Method;

    .line 45
    sput-object v0, Lroboguice/inject/ViewListener;->fragmentFindFragmentByTagMethod:Ljava/lang/reflect/Method;

    .line 49
    :try_start_0
    const-string v0, "android.support.v4.app.Fragment"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    .line 50
    const-string v0, "android.support.v4.app.FragmentManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lroboguice/inject/ViewListener;->fragmentManagerClass:Ljava/lang/Class;

    .line 51
    sget-object v0, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    const-string v1, "getView"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lroboguice/inject/ViewListener;->fragmentGetViewMethod:Ljava/lang/reflect/Method;

    .line 52
    sget-object v0, Lroboguice/inject/ViewListener;->fragmentManagerClass:Ljava/lang/Class;

    const-string v1, "findFragmentById"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lroboguice/inject/ViewListener;->fragmentFindFragmentByIdMethod:Ljava/lang/reflect/Method;

    .line 53
    sget-object v0, Lroboguice/inject/ViewListener;->fragmentManagerClass:Ljava/lang/Class;

    const-string v1, "findFragmentByTag"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lroboguice/inject/ViewListener;->fragmentFindFragmentByTagMethod:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    :goto_0
    return-void

    .line 54
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    return-void
.end method


# virtual methods
.method public hear(Lcom/google/inject/TypeLiteral;Lcom/google/inject/spi/TypeEncounter;)V
    .locals 7
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
    .line 59
    .local p1, "typeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TI;>;"
    .local p2, "typeEncounter":Lcom/google/inject/spi/TypeEncounter;, "Lcom/google/inject/spi/TypeEncounter<TI;>;"
    invoke-virtual {p1}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v1

    .local v1, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    const-class v5, Ljava/lang/Object;

    if-eq v1, v5, :cond_9

    .line 60
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Field;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_1
    if-ge v3, v4, :cond_8

    aget-object v2, v0, v3

    .line 61
    .local v2, "field":Ljava/lang/reflect/Field;
    const-class v5, Lroboguice/inject/InjectView;

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 62
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 63
    new-instance v5, Ljava/lang/UnsupportedOperationException;

    const-string v6, "Views may not be statically injected"

    invoke-direct {v5, v6}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 64
    :cond_0
    const-class v5, Landroid/view/View;

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 65
    new-instance v5, Ljava/lang/UnsupportedOperationException;

    const-string v6, "You may only use @InjectView on fields descended from type View"

    invoke-direct {v5, v6}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 66
    :cond_1
    const-class v5, Landroid/content/Context;

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-class v5, Landroid/app/Activity;

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 67
    new-instance v5, Ljava/lang/UnsupportedOperationException;

    const-string v6, "You may only use @InjectView in Activity contexts"

    invoke-direct {v5, v6}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 69
    :cond_2
    new-instance v5, Lroboguice/inject/ViewListener$ViewMembersInjector;

    const-class v6, Lroboguice/inject/InjectView;

    invoke-virtual {v2, v6}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    invoke-direct {v5, v2, v6, p2}, Lroboguice/inject/ViewListener$ViewMembersInjector;-><init>(Ljava/lang/reflect/Field;Ljava/lang/annotation/Annotation;Lcom/google/inject/spi/TypeEncounter;)V

    invoke-interface {p2, v5}, Lcom/google/inject/spi/TypeEncounter;->register(Lcom/google/inject/MembersInjector;)V

    .line 60
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 72
    :cond_4
    const-class v5, Lroboguice/inject/InjectFragment;

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 73
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 74
    new-instance v5, Ljava/lang/UnsupportedOperationException;

    const-string v6, "Fragments may not be statically injected"

    invoke-direct {v5, v6}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 75
    :cond_5
    sget-object v5, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    if-eqz v5, :cond_6

    sget-object v5, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_6

    .line 76
    new-instance v5, Ljava/lang/UnsupportedOperationException;

    const-string v6, "You may only use @InjectFragment on fields descended from type Fragment"

    invoke-direct {v5, v6}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 77
    :cond_6
    const-class v5, Landroid/content/Context;

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_7

    const-class v5, Landroid/app/Activity;

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 78
    new-instance v5, Ljava/lang/UnsupportedOperationException;

    const-string v6, "You may only use @InjectFragment in Activity contexts"

    invoke-direct {v5, v6}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 80
    :cond_7
    new-instance v5, Lroboguice/inject/ViewListener$ViewMembersInjector;

    const-class v6, Lroboguice/inject/InjectFragment;

    invoke-virtual {v2, v6}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    invoke-direct {v5, v2, v6, p2}, Lroboguice/inject/ViewListener$ViewMembersInjector;-><init>(Ljava/lang/reflect/Field;Ljava/lang/annotation/Annotation;Lcom/google/inject/spi/TypeEncounter;)V

    invoke-interface {p2, v5}, Lcom/google/inject/spi/TypeEncounter;->register(Lcom/google/inject/MembersInjector;)V

    goto :goto_2

    .line 59
    .end local v2    # "field":Ljava/lang/reflect/Field;
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto/16 :goto_0

    .line 82
    .end local v0    # "arr$":[Ljava/lang/reflect/Field;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    :cond_9
    return-void
.end method
