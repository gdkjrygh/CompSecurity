.class public Lroboguice/inject/ViewListener$ViewMembersInjector;
.super Ljava/lang/Object;
.source "ViewListener.java"

# interfaces
.implements Lcom/google/inject/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lroboguice/inject/ViewListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewMembersInjector"
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


# static fields
.field protected static viewMembersInjectors:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList",
            "<",
            "Lroboguice/inject/ViewListener$ViewMembersInjector",
            "<*>;>;>;"
        }
    .end annotation
.end field


# instance fields
.field protected activityProvider:Lcom/google/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Provider",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field protected annotation:Ljava/lang/annotation/Annotation;

.field protected field:Ljava/lang/reflect/Field;

.field protected fragmentManagerProvider:Lcom/google/inject/Provider;

.field protected instanceRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 89
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lroboguice/inject/ViewListener$ViewMembersInjector;->viewMembersInjectors:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;Ljava/lang/annotation/Annotation;Lcom/google/inject/spi/TypeEncounter;)V
    .locals 1
    .param p1, "field"    # Ljava/lang/reflect/Field;
    .param p2, "annotation"    # Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/annotation/Annotation;",
            "Lcom/google/inject/spi/TypeEncounter",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 98
    .local p0, "this":Lroboguice/inject/ViewListener$ViewMembersInjector;, "Lroboguice/inject/ViewListener$ViewMembersInjector<TT;>;"
    .local p3, "typeEncounter":Lcom/google/inject/spi/TypeEncounter;, "Lcom/google/inject/spi/TypeEncounter<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p1, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    .line 100
    iput-object p2, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->annotation:Ljava/lang/annotation/Annotation;

    .line 101
    const-class v0, Landroid/app/Activity;

    invoke-interface {p3, v0}, Lcom/google/inject/spi/TypeEncounter;->getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->activityProvider:Lcom/google/inject/Provider;

    .line 103
    sget-object v0, Lroboguice/inject/ViewListener;->fragmentManagerClass:Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 104
    sget-object v0, Lroboguice/inject/ViewListener;->fragmentManagerClass:Ljava/lang/Class;

    invoke-interface {p3, v0}, Lcom/google/inject/spi/TypeEncounter;->getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->fragmentManagerProvider:Lcom/google/inject/Provider;

    .line 106
    :cond_0
    return-void
.end method

.method protected static injectViews(Ljava/lang/Object;)V
    .locals 5
    .param p0, "activityOrFragment"    # Ljava/lang/Object;

    .prologue
    .line 241
    const-class v4, Lroboguice/inject/ViewListener$ViewMembersInjector;

    monitor-enter v4

    .line 243
    :try_start_0
    sget-object v3, Lroboguice/inject/ViewListener$ViewMembersInjector;->viewMembersInjectors:Ljava/util/WeakHashMap;

    invoke-virtual {v3, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 244
    .local v1, "injectors":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lroboguice/inject/ViewListener$ViewMembersInjector<*>;>;"
    if-eqz v1, :cond_0

    .line 245
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lroboguice/inject/ViewListener$ViewMembersInjector;

    .line 246
    .local v2, "viewMembersInjector":Lroboguice/inject/ViewListener$ViewMembersInjector;, "Lroboguice/inject/ViewListener$ViewMembersInjector<*>;"
    invoke-virtual {v2, p0}, Lroboguice/inject/ViewListener$ViewMembersInjector;->reallyInjectMembers(Ljava/lang/Object;)V

    goto :goto_0

    .line 247
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "injectors":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lroboguice/inject/ViewListener$ViewMembersInjector<*>;>;"
    .end local v2    # "viewMembersInjector":Lroboguice/inject/ViewListener$ViewMembersInjector;, "Lroboguice/inject/ViewListener$ViewMembersInjector<*>;"
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3

    .restart local v1    # "injectors":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lroboguice/inject/ViewListener$ViewMembersInjector<*>;>;"
    :cond_0
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 248
    return-void
.end method


# virtual methods
.method public injectMembers(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 115
    .local p0, "this":Lroboguice/inject/ViewListener$ViewMembersInjector;, "Lroboguice/inject/ViewListener$ViewMembersInjector<TT;>;"
    .local p1, "instance":Ljava/lang/Object;, "TT;"
    const-class v4, Lroboguice/inject/ViewListener$ViewMembersInjector;

    monitor-enter v4

    .line 116
    :try_start_0
    iget-object v3, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->activityProvider:Lcom/google/inject/Provider;

    invoke-interface {v3}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 117
    .local v0, "activity":Landroid/app/Activity;
    sget-object v3, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    if-eqz v3, :cond_0

    sget-object v3, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v2, p1

    .line 118
    .local v2, "key":Ljava/lang/Object;
    :goto_0
    if-nez v2, :cond_1

    .line 119
    monitor-exit v4

    .line 134
    :goto_1
    return-void

    .end local v2    # "key":Ljava/lang/Object;
    :cond_0
    move-object v2, v0

    .line 117
    goto :goto_0

    .line 122
    .restart local v2    # "key":Ljava/lang/Object;
    :cond_1
    sget-object v3, Lroboguice/inject/ViewListener$ViewMembersInjector;->viewMembersInjectors:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 123
    .local v1, "injectors":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lroboguice/inject/ViewListener$ViewMembersInjector<*>;>;"
    if-nez v1, :cond_2

    .line 124
    new-instance v1, Ljava/util/ArrayList;

    .end local v1    # "injectors":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lroboguice/inject/ViewListener$ViewMembersInjector<*>;>;"
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .restart local v1    # "injectors":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lroboguice/inject/ViewListener$ViewMembersInjector<*>;>;"
    sget-object v3, Lroboguice/inject/ViewListener$ViewMembersInjector;->viewMembersInjectors:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v2, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    :cond_2
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v3, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->instanceRef:Ljava/lang/ref/WeakReference;

    .line 133
    monitor-exit v4

    goto :goto_1

    .end local v0    # "activity":Landroid/app/Activity;
    .end local v1    # "injectors":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lroboguice/inject/ViewListener$ViewMembersInjector<*>;>;"
    .end local v2    # "key":Ljava/lang/Object;
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method protected reallyInjectMemberFragments(Ljava/lang/Object;)V
    .locals 14
    .param p1, "activityOrFragment"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lroboguice/inject/ViewListener$ViewMembersInjector;, "Lroboguice/inject/ViewListener$ViewMembersInjector<TT;>;"
    const/4 v13, 0x2

    const/4 v12, 0x0

    const/4 v11, 0x1

    .line 202
    iget-object v6, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->instanceRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    .line 203
    .local v5, "instance":Ljava/lang/Object;, "TT;"
    if-nez v5, :cond_0

    .line 237
    :goto_0
    return-void

    .line 206
    :cond_0
    instance-of v6, p1, Landroid/content/Context;

    if-eqz v6, :cond_1

    instance-of v6, p1, Landroid/app/Activity;

    if-nez v6, :cond_1

    .line 207
    new-instance v6, Ljava/lang/UnsupportedOperationException;

    const-string v7, "Can\'t inject fragment into a non-Activity context"

    invoke-direct {v6, v7}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 209
    :cond_1
    const/4 v2, 0x0

    .line 212
    .local v2, "fragment":Ljava/lang/Object;
    :try_start_0
    iget-object v4, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->annotation:Ljava/lang/annotation/Annotation;

    check-cast v4, Lroboguice/inject/InjectFragment;

    .line 213
    .local v4, "injectFragment":Lroboguice/inject/InjectFragment;
    invoke-interface {v4}, Lroboguice/inject/InjectFragment;->value()I

    move-result v3

    .line 215
    .local v3, "id":I
    if-ltz v3, :cond_2

    .line 216
    sget-object v6, Lroboguice/inject/ViewListener;->fragmentFindFragmentByIdMethod:Ljava/lang/reflect/Method;

    iget-object v7, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->fragmentManagerProvider:Lcom/google/inject/Provider;

    invoke-interface {v7}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-virtual {v6, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 221
    :goto_1
    if-nez v2, :cond_3

    iget-object v6, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-static {v6}, Lroboguice/inject/Nullable;->notNullable(Ljava/lang/reflect/Field;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 222
    new-instance v6, Ljava/lang/NullPointerException;

    const-string v7, "Can\'t inject null value into %s.%s when field is not @Nullable"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    iget-object v10, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    iget-object v10, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    .line 227
    .end local v2    # "fragment":Ljava/lang/Object;
    .end local v3    # "id":I
    .end local v4    # "injectFragment":Lroboguice/inject/InjectFragment;
    :catch_0
    move-exception v0

    .line 228
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v6, Ljava/lang/RuntimeException;

    invoke-direct {v6, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v6

    .line 219
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    .restart local v2    # "fragment":Ljava/lang/Object;
    .restart local v3    # "id":I
    .restart local v4    # "injectFragment":Lroboguice/inject/InjectFragment;
    :cond_2
    :try_start_1
    sget-object v6, Lroboguice/inject/ViewListener;->fragmentFindFragmentByTagMethod:Ljava/lang/reflect/Method;

    iget-object v7, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->fragmentManagerProvider:Lcom/google/inject/Provider;

    invoke-interface {v7}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-interface {v4}, Lroboguice/inject/InjectFragment;->tag()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-virtual {v6, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    .line 224
    :cond_3
    iget-object v6, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 225
    iget-object v6, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v6, v5, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_0

    .line 230
    .end local v2    # "fragment":Ljava/lang/Object;
    .end local v3    # "id":I
    .end local v4    # "injectFragment":Lroboguice/inject/InjectFragment;
    :catch_1
    move-exception v0

    .line 231
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    new-instance v6, Ljava/lang/RuntimeException;

    invoke-direct {v6, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v6

    .line 233
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_2
    move-exception v1

    .line 234
    .local v1, "f":Ljava/lang/IllegalArgumentException;
    new-instance v7, Ljava/lang/IllegalArgumentException;

    const-string v8, "Can\'t assign %s value %s to %s field %s"

    const/4 v6, 0x4

    new-array v9, v6, [Ljava/lang/Object;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    :goto_2
    aput-object v6, v9, v12

    aput-object v2, v9, v11

    iget-object v6, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    aput-object v6, v9, v13

    const/4 v6, 0x3

    iget-object v10, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v6

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v6, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v7

    :cond_4
    const-string v6, "(null)"

    goto :goto_2
.end method

.method protected reallyInjectMemberViews(Ljava/lang/Object;)V
    .locals 14
    .param p1, "activityOrFragment"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lroboguice/inject/ViewListener$ViewMembersInjector;, "Lroboguice/inject/ViewListener$ViewMembersInjector<TT;>;"
    const/4 v13, 0x2

    const/4 v12, 0x1

    const/4 v11, 0x0

    .line 158
    sget-object v6, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    if-eqz v6, :cond_0

    sget-object v6, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    invoke-virtual {v6, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move-object v4, p1

    .line 159
    .local v4, "instance":Ljava/lang/Object;, "TT;"
    :goto_0
    if-nez v4, :cond_1

    .line 194
    .end local p1    # "activityOrFragment":Ljava/lang/Object;
    :goto_1
    return-void

    .line 158
    .end local v4    # "instance":Ljava/lang/Object;, "TT;"
    .restart local p1    # "activityOrFragment":Ljava/lang/Object;
    :cond_0
    iget-object v6, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->instanceRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    .line 162
    .restart local v4    # "instance":Ljava/lang/Object;, "TT;"
    :cond_1
    instance-of v6, p1, Landroid/content/Context;

    if-eqz v6, :cond_2

    instance-of v6, p1, Landroid/app/Activity;

    if-nez v6, :cond_2

    .line 163
    new-instance v6, Ljava/lang/UnsupportedOperationException;

    const-string v7, "Can\'t inject view into a non-Activity context"

    invoke-direct {v6, v7}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 165
    :cond_2
    const/4 v5, 0x0

    .line 168
    .local v5, "view":Landroid/view/View;
    :try_start_0
    iget-object v3, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->annotation:Ljava/lang/annotation/Annotation;

    check-cast v3, Lroboguice/inject/InjectView;

    .line 169
    .local v3, "injectView":Lroboguice/inject/InjectView;
    invoke-interface {v3}, Lroboguice/inject/InjectView;->value()I

    move-result v2

    .line 171
    .local v2, "id":I
    if-ltz v2, :cond_4

    .line 172
    sget-object v6, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    if-eqz v6, :cond_3

    sget-object v6, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    invoke-virtual {v6, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    sget-object v6, Lroboguice/inject/ViewListener;->fragmentGetViewMethod:Ljava/lang/reflect/Method;

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-virtual {v6, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 178
    .end local p1    # "activityOrFragment":Ljava/lang/Object;
    :goto_2
    if-nez v5, :cond_6

    iget-object v6, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-static {v6}, Lroboguice/inject/Nullable;->notNullable(Ljava/lang/reflect/Field;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 179
    new-instance v6, Ljava/lang/NullPointerException;

    const-string v7, "Can\'t inject null value into %s.%s when field is not @Nullable"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    iget-object v10, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    iget-object v10, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    .line 184
    .end local v2    # "id":I
    .end local v3    # "injectView":Lroboguice/inject/InjectView;
    :catch_0
    move-exception v0

    .line 185
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v6, Ljava/lang/RuntimeException;

    invoke-direct {v6, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v6

    .line 172
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    .restart local v2    # "id":I
    .restart local v3    # "injectView":Lroboguice/inject/InjectView;
    .restart local p1    # "activityOrFragment":Ljava/lang/Object;
    :cond_3
    :try_start_1
    check-cast p1, Landroid/app/Activity;

    .end local p1    # "activityOrFragment":Ljava/lang/Object;
    invoke-virtual {p1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    goto :goto_2

    .line 175
    .restart local p1    # "activityOrFragment":Ljava/lang/Object;
    :cond_4
    sget-object v6, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    if-eqz v6, :cond_5

    sget-object v6, Lroboguice/inject/ViewListener;->fragmentClass:Ljava/lang/Class;

    invoke-virtual {v6, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    sget-object v6, Lroboguice/inject/ViewListener;->fragmentGetViewMethod:Ljava/lang/reflect/Method;

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-virtual {v6, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-interface {v3}, Lroboguice/inject/InjectView;->tag()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    .end local p1    # "activityOrFragment":Ljava/lang/Object;
    :goto_3
    goto :goto_2

    .restart local p1    # "activityOrFragment":Ljava/lang/Object;
    :cond_5
    check-cast p1, Landroid/app/Activity;

    .end local p1    # "activityOrFragment":Ljava/lang/Object;
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v6

    invoke-interface {v3}, Lroboguice/inject/InjectView;->tag()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    goto :goto_3

    .line 181
    :cond_6
    iget-object v6, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 182
    iget-object v6, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v6, v4, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_1

    .line 187
    .end local v2    # "id":I
    .end local v3    # "injectView":Lroboguice/inject/InjectView;
    :catch_1
    move-exception v0

    .line 188
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    new-instance v6, Ljava/lang/RuntimeException;

    invoke-direct {v6, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v6

    .line 190
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_2
    move-exception v1

    .line 191
    .local v1, "f":Ljava/lang/IllegalArgumentException;
    new-instance v7, Ljava/lang/IllegalArgumentException;

    const-string v8, "Can\'t assign %s value %s to %s field %s"

    const/4 v6, 0x4

    new-array v9, v6, [Ljava/lang/Object;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    :goto_4
    aput-object v6, v9, v11

    aput-object v5, v9, v12

    iget-object v6, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    aput-object v6, v9, v13

    const/4 v6, 0x3

    iget-object v10, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v6

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v6, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v7

    :cond_7
    const-string v6, "(null)"

    goto :goto_4
.end method

.method public reallyInjectMembers(Ljava/lang/Object;)V
    .locals 1
    .param p1, "activityOrFragment"    # Ljava/lang/Object;

    .prologue
    .line 137
    .local p0, "this":Lroboguice/inject/ViewListener$ViewMembersInjector;, "Lroboguice/inject/ViewListener$ViewMembersInjector<TT;>;"
    iget-object v0, p0, Lroboguice/inject/ViewListener$ViewMembersInjector;->annotation:Ljava/lang/annotation/Annotation;

    instance-of v0, v0, Lroboguice/inject/InjectView;

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {p0, p1}, Lroboguice/inject/ViewListener$ViewMembersInjector;->reallyInjectMemberViews(Ljava/lang/Object;)V

    .line 141
    :goto_0
    return-void

    .line 140
    :cond_0
    invoke-virtual {p0, p1}, Lroboguice/inject/ViewListener$ViewMembersInjector;->reallyInjectMemberFragments(Ljava/lang/Object;)V

    goto :goto_0
.end method
