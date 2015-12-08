.class public Lroboguice/inject/ResourceListener$ResourceMembersInjector;
.super Ljava/lang/Object;
.source "ResourceListener.java"

# interfaces
.implements Lcom/google/inject/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lroboguice/inject/ResourceListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "ResourceMembersInjector"
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
.field protected annotation:Lroboguice/inject/InjectResource;

.field protected application:Landroid/app/Application;

.field protected field:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;Landroid/app/Application;Lroboguice/inject/InjectResource;)V
    .locals 0
    .param p1, "field"    # Ljava/lang/reflect/Field;
    .param p2, "application"    # Landroid/app/Application;
    .param p3, "annotation"    # Lroboguice/inject/InjectResource;

    .prologue
    .line 81
    .local p0, "this":Lroboguice/inject/ResourceListener$ResourceMembersInjector;, "Lroboguice/inject/ResourceListener$ResourceMembersInjector<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->field:Ljava/lang/reflect/Field;

    .line 83
    iput-object p2, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->application:Landroid/app/Application;

    .line 84
    iput-object p3, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->annotation:Lroboguice/inject/InjectResource;

    .line 85
    return-void
.end method


# virtual methods
.method protected getId(Landroid/content/res/Resources;Lroboguice/inject/InjectResource;)I
    .locals 3
    .param p1, "resources"    # Landroid/content/res/Resources;
    .param p2, "annotation"    # Lroboguice/inject/InjectResource;

    .prologue
    .local p0, "this":Lroboguice/inject/ResourceListener$ResourceMembersInjector;, "Lroboguice/inject/ResourceListener$ResourceMembersInjector<TT;>;"
    const/4 v2, 0x0

    .line 135
    invoke-interface {p2}, Lroboguice/inject/InjectResource;->value()I

    move-result v0

    .line 136
    .local v0, "id":I
    if-ltz v0, :cond_0

    .end local v0    # "id":I
    :goto_0
    return v0

    .restart local v0    # "id":I
    :cond_0
    invoke-interface {p2}, Lroboguice/inject/InjectResource;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v2, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public injectMembers(Ljava/lang/Object;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lroboguice/inject/ResourceListener$ResourceMembersInjector;, "Lroboguice/inject/ResourceListener$ResourceMembersInjector<TT;>;"
    .local p1, "instance":Ljava/lang/Object;, "TT;"
    const/4 v13, 0x2

    const/4 v12, 0x0

    const/4 v11, 0x1

    .line 89
    const/4 v5, 0x0

    .line 93
    .local v5, "value":Ljava/lang/Object;
    :try_start_0
    iget-object v6, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->application:Landroid/app/Application;

    invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 94
    .local v3, "resources":Landroid/content/res/Resources;
    iget-object v6, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->annotation:Lroboguice/inject/InjectResource;

    invoke-virtual {p0, v3, v6}, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->getId(Landroid/content/res/Resources;Lroboguice/inject/InjectResource;)I

    move-result v2

    .line 95
    .local v2, "id":I
    iget-object v6, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    .line 97
    .local v4, "t":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v6, Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 98
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 117
    .end local v5    # "value":Ljava/lang/Object;
    :cond_0
    :goto_0
    if-nez v5, :cond_c

    iget-object v6, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-static {v6}, Lroboguice/inject/Nullable;->notNullable(Ljava/lang/reflect/Field;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 118
    new-instance v6, Ljava/lang/NullPointerException;

    const-string v7, "Can\'t inject null value into %s.%s when field is not @Nullable"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    iget-object v10, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    iget-object v10, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 125
    .end local v2    # "id":I
    .end local v3    # "resources":Landroid/content/res/Resources;
    .end local v4    # "t":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :catch_0
    move-exception v0

    .line 126
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v6, Ljava/lang/RuntimeException;

    invoke-direct {v6, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v6

    .line 99
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    .restart local v2    # "id":I
    .restart local v3    # "resources":Landroid/content/res/Resources;
    .restart local v4    # "t":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_1
    :try_start_1
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-nez v6, :cond_2

    const-class v6, Ljava/lang/Boolean;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 100
    :cond_2
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .local v5, "value":Ljava/lang/Boolean;
    goto :goto_0

    .line 101
    .local v5, "value":Ljava/lang/Object;
    :cond_3
    const-class v6, Landroid/content/res/ColorStateList;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 102
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    .local v5, "value":Landroid/content/res/ColorStateList;
    goto :goto_0

    .line 103
    .local v5, "value":Ljava/lang/Object;
    :cond_4
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-nez v6, :cond_5

    const-class v6, Ljava/lang/Integer;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 104
    :cond_5
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .local v5, "value":Ljava/lang/Integer;
    goto :goto_0

    .line 105
    .local v5, "value":Ljava/lang/Object;
    :cond_6
    const-class v6, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 106
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .local v5, "value":Landroid/graphics/drawable/Drawable;
    goto :goto_0

    .line 107
    .local v5, "value":Ljava/lang/Object;
    :cond_7
    const-class v6, [Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 108
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v5

    .local v5, "value":[Ljava/lang/String;
    goto/16 :goto_0

    .line 109
    .local v5, "value":Ljava/lang/Object;
    :cond_8
    const-class v6, [I

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-nez v6, :cond_9

    const-class v6, [Ljava/lang/Integer;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 110
    :cond_9
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    .local v5, "value":[I
    goto/16 :goto_0

    .line 111
    .local v5, "value":Ljava/lang/Object;
    :cond_a
    const-class v6, Landroid/view/animation/Animation;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 112
    iget-object v6, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->application:Landroid/app/Application;

    invoke-static {v6, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v5

    .local v5, "value":Landroid/view/animation/Animation;
    goto/16 :goto_0

    .line 113
    .local v5, "value":Ljava/lang/Object;
    :cond_b
    const-class v6, Landroid/graphics/Movie;

    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 114
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getMovie(I)Landroid/graphics/Movie;

    move-result-object v5

    .local v5, "value":Landroid/graphics/Movie;
    goto/16 :goto_0

    .line 122
    .end local v5    # "value":Landroid/graphics/Movie;
    :cond_c
    iget-object v6, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->field:Ljava/lang/reflect/Field;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 123
    iget-object v6, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v6, p1, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 132
    return-void

    .line 128
    .end local v2    # "id":I
    .end local v3    # "resources":Landroid/content/res/Resources;
    .end local v4    # "t":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :catch_1
    move-exception v1

    .line 129
    .local v1, "f":Ljava/lang/IllegalArgumentException;
    new-instance v7, Ljava/lang/IllegalArgumentException;

    const-string v8, "Can\'t assign %s value %s to %s field %s"

    const/4 v6, 0x4

    new-array v9, v6, [Ljava/lang/Object;

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    :goto_1
    aput-object v6, v9, v12

    aput-object v5, v9, v11

    iget-object v6, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    aput-object v6, v9, v13

    const/4 v6, 0x3

    iget-object v10, p0, Lroboguice/inject/ResourceListener$ResourceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v6

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v7

    :cond_d
    const-string v6, "(null)"

    goto :goto_1
.end method
