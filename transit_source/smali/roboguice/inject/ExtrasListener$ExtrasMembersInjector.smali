.class public Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;
.super Ljava/lang/Object;
.source "ExtrasListener.java"

# interfaces
.implements Lcom/google/inject/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lroboguice/inject/ExtrasListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "ExtrasMembersInjector"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/MembersInjector",
        "<TT;>;"
    }
.end annotation


# instance fields
.field protected annotation:Lroboguice/inject/InjectExtra;

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

.field protected field:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;Lcom/google/inject/Provider;Lroboguice/inject/InjectExtra;)V
    .locals 0
    .param p1, "field"    # Ljava/lang/reflect/Field;
    .param p3, "annotation"    # Lroboguice/inject/InjectExtra;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Field;",
            "Lcom/google/inject/Provider",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Lroboguice/inject/InjectExtra;",
            ")V"
        }
    .end annotation

    .prologue
    .line 67
    .local p0, "this":Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;, "Lroboguice/inject/ExtrasListener$ExtrasMembersInjector<TT;>;"
    .local p2, "contextProvider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<Landroid/content/Context;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    .line 69
    iput-object p2, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->contextProvider:Lcom/google/inject/Provider;

    .line 70
    iput-object p3, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->annotation:Lroboguice/inject/InjectExtra;

    .line 71
    return-void
.end method


# virtual methods
.method protected convert(Ljava/lang/reflect/Field;Ljava/lang/Object;Lcom/google/inject/Injector;)Ljava/lang/Object;
    .locals 9
    .param p1, "field"    # Ljava/lang/reflect/Field;
    .param p2, "value"    # Ljava/lang/Object;
    .param p3, "injector"    # Lcom/google/inject/Injector;

    .prologue
    .line 132
    .local p0, "this":Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;, "Lroboguice/inject/ExtrasListener$ExtrasMembersInjector<TT;>;"
    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_0
    move-object v4, p2

    .line 151
    .end local p2    # "value":Ljava/lang/Object;
    .local v4, "value":Ljava/lang/Object;
    :goto_0
    return-object v4

    .line 139
    .end local v4    # "value":Ljava/lang/Object;
    .restart local p2    # "value":Ljava/lang/Object;
    :cond_1
    const-class v5, Lroboguice/inject/ExtraConverter;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/reflect/Type;

    const/4 v7, 0x0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v5, v6}, Lcom/google/inject/util/Types;->newParameterizedType(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v3

    .line 140
    .local v3, "pt":Ljava/lang/reflect/ParameterizedType;
    invoke-static {v3}, Lcom/google/inject/Key;->get(Ljava/lang/reflect/Type;)Lcom/google/inject/Key;

    move-result-object v2

    .line 144
    .local v2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    invoke-interface {p3}, Lcom/google/inject/Injector;->getBindings()Ljava/util/Map;

    move-result-object v0

    .line 146
    .local v0, "bindings":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/inject/Key<*>;Lcom/google/inject/Binding<*>;>;"
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 147
    invoke-interface {p3, v2}, Lcom/google/inject/Injector;->getInstance(Lcom/google/inject/Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/inject/ExtraConverter;

    .line 148
    .local v1, "converter":Lroboguice/inject/ExtraConverter;
    invoke-interface {v1, p2}, Lroboguice/inject/ExtraConverter;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .end local v1    # "converter":Lroboguice/inject/ExtraConverter;
    :cond_2
    move-object v4, p2

    .line 151
    .end local p2    # "value":Ljava/lang/Object;
    .restart local v4    # "value":Ljava/lang/Object;
    goto :goto_0
.end method

.method public injectMembers(Ljava/lang/Object;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 74
    .local p0, "this":Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;, "Lroboguice/inject/ExtrasListener$ExtrasMembersInjector<TT;>;"
    .local p1, "instance":Ljava/lang/Object;, "TT;"
    iget-object v7, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->contextProvider:Lcom/google/inject/Provider;

    invoke-interface {v7}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    .line 76
    .local v1, "context":Landroid/content/Context;
    instance-of v7, v1, Landroid/app/Activity;

    if-nez v7, :cond_0

    .line 77
    new-instance v8, Ljava/lang/UnsupportedOperationException;

    const-string v9, "Extras may not be injected into contexts that are not Activities (error in class %s)"

    const/4 v7, 0x1

    new-array v10, v7, [Ljava/lang/Object;

    const/4 v11, 0x0

    iget-object v7, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->contextProvider:Lcom/google/inject/Provider;

    invoke-interface {v7}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v10, v11

    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v7}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v8

    :cond_0
    move-object v0, v1

    .line 80
    check-cast v0, Landroid/app/Activity;

    .line 83
    .local v0, "activity":Landroid/app/Activity;
    iget-object v7, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->annotation:Lroboguice/inject/InjectExtra;

    invoke-interface {v7}, Lroboguice/inject/InjectExtra;->value()Ljava/lang/String;

    move-result-object v5

    .line 84
    .local v5, "id":Ljava/lang/String;
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 86
    .local v3, "extras":Landroid/os/Bundle;
    if-eqz v3, :cond_1

    invoke-virtual {v3, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_3

    .line 89
    :cond_1
    iget-object v7, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->annotation:Lroboguice/inject/InjectExtra;

    invoke-interface {v7}, Lroboguice/inject/InjectExtra;->optional()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 126
    :goto_0
    return-void

    .line 92
    :cond_2
    new-instance v7, Ljava/lang/IllegalStateException;

    const-string v8, "Can\'t find the mandatory extra identified by key [%s] on field %s.%s"

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v5, v9, v10

    const/4 v10, 0x1

    iget-object v11, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v11

    aput-object v11, v9, v10

    const/4 v10, 0x2

    iget-object v11, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 97
    :cond_3
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 99
    .local v6, "value":Ljava/lang/Object;
    iget-object v7, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v8

    invoke-static {v8}, Lroboguice/RoboGuice;->getBaseApplicationInjector(Landroid/app/Application;)Lcom/google/inject/Injector;

    move-result-object v8

    invoke-virtual {p0, v7, v6, v8}, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->convert(Ljava/lang/reflect/Field;Ljava/lang/Object;Lcom/google/inject/Injector;)Ljava/lang/Object;

    move-result-object v6

    .line 109
    if-nez v6, :cond_4

    iget-object v7, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-static {v7}, Lroboguice/inject/Nullable;->notNullable(Ljava/lang/reflect/Field;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 110
    new-instance v7, Ljava/lang/NullPointerException;

    const-string v8, "Can\'t inject null value into %s.%s when field is not @Nullable"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    iget-object v11, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v11

    aput-object v11, v9, v10

    const/4 v10, 0x1

    iget-object v11, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v9, v10

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 114
    :cond_4
    iget-object v7, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 117
    :try_start_0
    iget-object v7, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v7, p1, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 119
    :catch_0
    move-exception v2

    .line 120
    .local v2, "e":Ljava/lang/IllegalAccessException;
    new-instance v7, Ljava/lang/RuntimeException;

    invoke-direct {v7, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v7

    .line 122
    .end local v2    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v4

    .line 123
    .local v4, "f":Ljava/lang/IllegalArgumentException;
    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v9, "Can\'t assign %s value %s to %s field %s"

    const/4 v7, 0x4

    new-array v10, v7, [Ljava/lang/Object;

    const/4 v11, 0x0

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    :goto_1
    aput-object v7, v10, v11

    const/4 v7, 0x1

    aput-object v6, v10, v7

    const/4 v7, 0x2

    iget-object v11, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v11

    aput-object v11, v10, v7

    const/4 v7, 0x3

    iget-object v11, p0, Lroboguice/inject/ExtrasListener$ExtrasMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v7

    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    :cond_5
    const-string v7, "(null)"

    goto :goto_1
.end method
