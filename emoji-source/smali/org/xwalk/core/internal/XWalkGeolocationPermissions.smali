.class public final Lorg/xwalk/core/internal/XWalkGeolocationPermissions;
.super Ljava/lang/Object;
.source "XWalkGeolocationPermissions.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/XWalkGeolocationPermissions$Callback;
    }
.end annotation


# static fields
.field private static final PREF_PREFIX:Ljava/lang/String;


# instance fields
.field private final mSharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->PREF_PREFIX:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0
    .param p1, "sharedPreferences"    # Landroid/content/SharedPreferences;

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 37
    return-void
.end method

.method private getOriginKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 136
    invoke-static {p1}, Lorg/chromium/net/GURLUtils;->getOrigin(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 137
    .local v0, "origin":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 138
    const/4 v1, 0x0

    .line 141
    :goto_0
    return-object v1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->PREF_PREFIX:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method


# virtual methods
.method public allow(Ljava/lang/String;)V
    .locals 3
    .param p1, "origin"    # Ljava/lang/String;

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->getOriginKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 44
    .local v0, "key":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 45
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->mSharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 47
    :cond_0
    return-void
.end method

.method public clear(Ljava/lang/String;)V
    .locals 2
    .param p1, "origin"    # Ljava/lang/String;

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->getOriginKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 64
    .local v0, "key":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 65
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->mSharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 67
    :cond_0
    return-void
.end method

.method public clearAll()V
    .locals 4

    .prologue
    .line 73
    const/4 v0, 0x0

    .line 74
    .local v0, "editor":Landroid/content/SharedPreferences$Editor;
    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->mSharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 75
    .local v2, "name":Ljava/lang/String;
    sget-object v3, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->PREF_PREFIX:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 76
    if-nez v0, :cond_1

    .line 77
    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->mSharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 79
    :cond_1
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 82
    .end local v2    # "name":Ljava/lang/String;
    :cond_2
    if-eqz v0, :cond_3

    .line 83
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 85
    :cond_3
    return-void
.end method

.method public deny(Ljava/lang/String;)V
    .locals 3
    .param p1, "origin"    # Ljava/lang/String;

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->getOriginKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 54
    .local v0, "key":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 55
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->mSharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 57
    :cond_0
    return-void
.end method

.method public getAllowed(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .locals 2
    .param p1, "origin"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/webkit/ValueCallback",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 105
    .local p2, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/lang/Boolean;>;"
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->isOriginAllowed(Ljava/lang/String;)Z

    move-result v0

    .line 106
    .local v0, "finalAllowed":Z
    new-instance v1, Lorg/xwalk/core/internal/XWalkGeolocationPermissions$1;

    invoke-direct {v1, p0, p2, v0}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions$1;-><init>(Lorg/xwalk/core/internal/XWalkGeolocationPermissions;Landroid/webkit/ValueCallback;Z)V

    invoke-static {v1}, Lorg/chromium/base/ThreadUtils;->postOnUiThread(Ljava/lang/Runnable;)V

    .line 112
    return-void
.end method

.method public getOrigins(Landroid/webkit/ValueCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback",
            "<",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 118
    .local p1, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<Ljava/util/Set<Ljava/lang/String;>;>;"
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 119
    .local v2, "origins":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->mSharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 120
    .local v1, "name":Ljava/lang/String;
    sget-object v3, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->PREF_PREFIX:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 121
    sget-object v3, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->PREF_PREFIX:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 124
    .end local v1    # "name":Ljava/lang/String;
    :cond_1
    new-instance v3, Lorg/xwalk/core/internal/XWalkGeolocationPermissions$2;

    invoke-direct {v3, p0, p1, v2}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions$2;-><init>(Lorg/xwalk/core/internal/XWalkGeolocationPermissions;Landroid/webkit/ValueCallback;Ljava/util/Set;)V

    invoke-static {v3}, Lorg/chromium/base/ThreadUtils;->postOnUiThread(Ljava/lang/Runnable;)V

    .line 130
    return-void
.end method

.method public hasOrigin(Ljava/lang/String;)Z
    .locals 2
    .param p1, "origin"    # Ljava/lang/String;

    .prologue
    .line 98
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->mSharedPreferences:Landroid/content/SharedPreferences;

    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->getOriginKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isOriginAllowed(Ljava/lang/String;)Z
    .locals 3
    .param p1, "origin"    # Ljava/lang/String;

    .prologue
    .line 91
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->mSharedPreferences:Landroid/content/SharedPreferences;

    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->getOriginKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method
