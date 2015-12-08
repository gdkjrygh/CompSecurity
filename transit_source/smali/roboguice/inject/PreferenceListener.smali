.class public Lroboguice/inject/PreferenceListener;
.super Ljava/lang/Object;
.source "PreferenceListener.java"

# interfaces
.implements Lcom/google/inject/spi/TypeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;
    }
.end annotation


# instance fields
.field protected application:Landroid/app/Application;

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

.field protected preferencesForInjection:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lroboguice/inject/PreferenceListener$PreferenceMembersInjector",
            "<*>;>;"
        }
    .end annotation
.end field

.field protected scope:Lroboguice/inject/ContextScope;


# direct methods
.method public constructor <init>(Lcom/google/inject/Provider;Landroid/app/Application;Lroboguice/inject/ContextScope;)V
    .locals 1
    .param p2, "application"    # Landroid/app/Application;
    .param p3, "scope"    # Lroboguice/inject/ContextScope;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Provider",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Landroid/app/Application;",
            "Lroboguice/inject/ContextScope;",
            ")V"
        }
    .end annotation

    .prologue
    .line 44
    .local p1, "contextProvider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<Landroid/content/Context;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lroboguice/inject/PreferenceListener;->preferencesForInjection:Ljava/util/ArrayList;

    .line 45
    iput-object p1, p0, Lroboguice/inject/PreferenceListener;->contextProvider:Lcom/google/inject/Provider;

    .line 46
    iput-object p2, p0, Lroboguice/inject/PreferenceListener;->application:Landroid/app/Application;

    .line 47
    iput-object p3, p0, Lroboguice/inject/PreferenceListener;->scope:Lroboguice/inject/ContextScope;

    .line 48
    return-void
.end method


# virtual methods
.method public hear(Lcom/google/inject/TypeLiteral;Lcom/google/inject/spi/TypeEncounter;)V
    .locals 10
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
    .line 51
    .local p1, "typeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TI;>;"
    .local p2, "typeEncounter":Lcom/google/inject/spi/TypeEncounter;, "Lcom/google/inject/spi/TypeEncounter<TI;>;"
    invoke-virtual {p1}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v7

    .local v7, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    const-class v0, Ljava/lang/Object;

    if-eq v7, v0, :cond_3

    .line 52
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v6

    .local v6, "arr$":[Ljava/lang/reflect/Field;
    array-length v9, v6

    .local v9, "len$":I
    const/4 v8, 0x0

    .local v8, "i$":I
    :goto_1
    if-ge v8, v9, :cond_2

    aget-object v2, v6, v8

    .line 53
    .local v2, "field":Ljava/lang/reflect/Field;
    const-class v0, Lroboguice/inject/InjectPreference;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Preferences may not be statically injected"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :cond_0
    new-instance v0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;

    iget-object v3, p0, Lroboguice/inject/PreferenceListener;->contextProvider:Lcom/google/inject/Provider;

    const-class v1, Lroboguice/inject/InjectPreference;

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Lroboguice/inject/InjectPreference;

    iget-object v5, p0, Lroboguice/inject/PreferenceListener;->scope:Lroboguice/inject/ContextScope;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;-><init>(Lroboguice/inject/PreferenceListener;Ljava/lang/reflect/Field;Lcom/google/inject/Provider;Lroboguice/inject/InjectPreference;Lroboguice/inject/ContextScope;)V

    invoke-interface {p2, v0}, Lcom/google/inject/spi/TypeEncounter;->register(Lcom/google/inject/MembersInjector;)V

    .line 52
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 51
    .end local v2    # "field":Ljava/lang/reflect/Field;
    :cond_2
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v7

    goto :goto_0

    .line 59
    .end local v6    # "arr$":[Ljava/lang/reflect/Field;
    .end local v8    # "i$":I
    .end local v9    # "len$":I
    :cond_3
    return-void
.end method

.method public injectPreferenceViews()V
    .locals 2

    .prologue
    .line 67
    iget-object v1, p0, Lroboguice/inject/PreferenceListener;->preferencesForInjection:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v0, v1, -0x1

    .local v0, "i":I
    :goto_0
    if-ltz v0, :cond_0

    .line 68
    iget-object v1, p0, Lroboguice/inject/PreferenceListener;->preferencesForInjection:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;

    invoke-virtual {v1}, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->reallyInjectMembers()V

    .line 67
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 69
    :cond_0
    return-void
.end method

.method public registerPreferenceForInjection(Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lroboguice/inject/PreferenceListener$PreferenceMembersInjector",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 63
    .local p1, "injector":Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;, "Lroboguice/inject/PreferenceListener$PreferenceMembersInjector<*>;"
    iget-object v0, p0, Lroboguice/inject/PreferenceListener;->preferencesForInjection:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    return-void
.end method
