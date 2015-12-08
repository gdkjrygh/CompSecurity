.class Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;
.super Ljava/lang/Object;
.source "PreferenceListener.java"

# interfaces
.implements Lcom/google/inject/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lroboguice/inject/PreferenceListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "PreferenceMembersInjector"
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
.field protected annotation:Lroboguice/inject/InjectPreference;

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

.field protected instanceRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<TT;>;"
        }
    .end annotation
.end field

.field protected scope:Lroboguice/inject/ContextScope;

.field final synthetic this$0:Lroboguice/inject/PreferenceListener;


# direct methods
.method public constructor <init>(Lroboguice/inject/PreferenceListener;Ljava/lang/reflect/Field;Lcom/google/inject/Provider;Lroboguice/inject/InjectPreference;Lroboguice/inject/ContextScope;)V
    .locals 0
    .param p2, "field"    # Ljava/lang/reflect/Field;
    .param p4, "annotation"    # Lroboguice/inject/InjectPreference;
    .param p5, "scope"    # Lroboguice/inject/ContextScope;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Field;",
            "Lcom/google/inject/Provider",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Lroboguice/inject/InjectPreference;",
            "Lroboguice/inject/ContextScope;",
            ")V"
        }
    .end annotation

    .prologue
    .line 80
    .local p0, "this":Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;, "Lroboguice/inject/PreferenceListener$PreferenceMembersInjector<TT;>;"
    .local p3, "contextProvider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<Landroid/content/Context;>;"
    iput-object p1, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->this$0:Lroboguice/inject/PreferenceListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p2, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->field:Ljava/lang/reflect/Field;

    .line 82
    iput-object p4, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->annotation:Lroboguice/inject/InjectPreference;

    .line 83
    iput-object p3, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->contextProvider:Lcom/google/inject/Provider;

    .line 84
    iput-object p5, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->scope:Lroboguice/inject/ContextScope;

    .line 85
    return-void
.end method


# virtual methods
.method public injectMembers(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 89
    .local p0, "this":Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;, "Lroboguice/inject/PreferenceListener$PreferenceMembersInjector<TT;>;"
    .local p1, "instance":Ljava/lang/Object;, "TT;"
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->instanceRef:Ljava/lang/ref/WeakReference;

    .line 90
    iget-object v0, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->this$0:Lroboguice/inject/PreferenceListener;

    invoke-virtual {v0, p0}, Lroboguice/inject/PreferenceListener;->registerPreferenceForInjection(Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;)V

    .line 91
    return-void
.end method

.method public reallyInjectMembers()V
    .locals 12

    .prologue
    .local p0, "this":Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;, "Lroboguice/inject/PreferenceListener$PreferenceMembersInjector<TT;>;"
    const/4 v11, 0x2

    const/4 v10, 0x0

    const/4 v9, 0x1

    .line 94
    iget-object v4, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->instanceRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    .line 95
    .local v2, "instance":Ljava/lang/Object;, "TT;"
    if-nez v2, :cond_0

    .line 118
    :goto_0
    return-void

    .line 98
    :cond_0
    const/4 v3, 0x0

    .line 102
    .local v3, "value":Ljava/lang/Object;
    :try_start_0
    iget-object v4, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->contextProvider:Lcom/google/inject/Provider;

    invoke-interface {v4}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/preference/PreferenceActivity;

    iget-object v5, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->annotation:Lroboguice/inject/InjectPreference;

    invoke-interface {v5}, Lroboguice/inject/InjectPreference;->value()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/preference/PreferenceActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v3

    .line 104
    .local v3, "value":Landroid/preference/Preference;
    if-nez v3, :cond_1

    iget-object v4, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-static {v4}, Lroboguice/inject/Nullable;->notNullable(Ljava/lang/reflect/Field;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 105
    new-instance v4, Ljava/lang/NullPointerException;

    const-string v5, "Can\'t inject null value into %s.%s when field is not @Nullable"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-object v8, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x1

    iget-object v8, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 111
    .end local v3    # "value":Landroid/preference/Preference;
    :catch_0
    move-exception v0

    .line 112
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4

    .line 108
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    .restart local v3    # "value":Landroid/preference/Preference;
    :cond_1
    :try_start_1
    iget-object v4, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->field:Ljava/lang/reflect/Field;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 109
    iget-object v4, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v4, v2, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 114
    .end local v3    # "value":Landroid/preference/Preference;
    :catch_1
    move-exception v1

    .line 115
    .local v1, "f":Ljava/lang/IllegalArgumentException;
    new-instance v5, Ljava/lang/IllegalArgumentException;

    const-string v6, "Can\'t assign %s value %s to %s field %s"

    const/4 v4, 0x4

    new-array v7, v4, [Ljava/lang/Object;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    :goto_1
    aput-object v4, v7, v10

    aput-object v3, v7, v9

    iget-object v4, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    aput-object v4, v7, v11

    const/4 v4, 0x3

    iget-object v8, p0, Lroboguice/inject/PreferenceListener$PreferenceMembersInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v4

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_2
    const-string v4, "(null)"

    goto :goto_1
.end method
