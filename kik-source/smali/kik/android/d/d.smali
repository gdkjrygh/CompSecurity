.class public final Lkik/android/d/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/d/c;


# static fields
.field private static final a:Ljava/util/Hashtable;

.field private static b:Lkik/android/d/d;


# instance fields
.field private c:Lkik/a/e/v;

.field private d:Lcom/kik/l/ab;

.field private e:Lkik/android/util/ar;

.field private f:Landroid/content/Context;

.field private g:Ljava/util/Hashtable;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 43
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 46
    sput-object v0, Lkik/android/d/d;->a:Ljava/util/Hashtable;

    const-string v1, "prod"

    new-instance v2, Lkik/a/f/s;

    invoke-direct {v2}, Lkik/a/f/s;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Lkik/android/d/d;->a:Ljava/util/Hashtable;

    const-string v1, "beta"

    new-instance v2, Lkik/a/f/e;

    invoke-direct {v2}, Lkik/a/f/e;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lkik/android/d/d;->a:Ljava/util/Hashtable;

    const-string v1, "piranha"

    new-instance v2, Lkik/a/f/r;

    invoke-direct {v2}, Lkik/a/f/r;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lkik/android/d/d;->a:Ljava/util/Hashtable;

    const-string v1, "scancode-changes"

    new-instance v2, Lkik/a/f/r;

    const-string v3, "scancode-stanza-changes"

    invoke-direct {v2, v3}, Lkik/a/f/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lkik/android/d/d;->a:Ljava/util/Hashtable;

    const-string v1, "bad-ssl"

    new-instance v2, Lkik/android/d/e;

    invoke-direct {v2}, Lkik/android/d/e;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, Lkik/android/d/d;->f:Landroid/content/Context;

    .line 93
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/android/d/d;->g:Ljava/util/Hashtable;

    .line 94
    return-void
.end method

.method public static a(Landroid/content/Context;)Lkik/android/d/c;
    .locals 1

    .prologue
    .line 70
    sget-object v0, Lkik/android/d/d;->b:Lkik/android/d/d;

    if-nez v0, :cond_0

    .line 71
    new-instance v0, Lkik/android/d/d;

    invoke-direct {v0, p0}, Lkik/android/d/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Lkik/android/d/d;->b:Lkik/android/d/d;

    .line 73
    :cond_0
    sget-object v0, Lkik/android/d/d;->b:Lkik/android/d/d;

    return-object v0
.end method

.method static synthetic a(Lkik/android/d/d;)Lkik/android/util/ar;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lkik/android/d/d;->e:Lkik/android/util/ar;

    return-object v0
.end method

.method static synthetic b(Lkik/android/d/d;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lkik/android/d/d;->f:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public final a(Lkik/android/util/ar;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 316
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 317
    invoke-interface {p1}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "kik.server.profile"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 318
    if-eqz v0, :cond_0

    sget-object v1, Lkik/android/d/d;->a:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 322
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "prod"

    goto :goto_0
.end method

.method public final a()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lkik/android/d/d;->g:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/d/b;
    .locals 1

    .prologue
    .line 286
    iget-object v0, p0, Lkik/android/d/d;->g:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/d/b;

    return-object v0
.end method

.method public final a(Lkik/a/e/v;Lcom/kik/l/ab;Lkik/android/util/ar;)V
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 78
    iput-object p1, p0, Lkik/android/d/d;->c:Lkik/a/e/v;

    .line 79
    iput-object p2, p0, Lkik/android/d/d;->d:Lcom/kik/l/ab;

    .line 80
    iput-object p3, p0, Lkik/android/d/d;->e:Lkik/android/util/ar;

    .line 81
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lkik/android/d/a;

    iget-object v1, p0, Lkik/android/d/d;->f:Landroid/content/Context;

    const-string v2, "show-lock-icon"

    new-instance v3, Ljava/lang/Boolean;

    invoke-direct {v3, v8}, Ljava/lang/Boolean;-><init>(Z)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x0

    iget-object v5, p0, Lkik/android/d/d;->e:Lkik/android/util/ar;

    invoke-direct/range {v0 .. v5}, Lkik/android/d/a;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lkik/android/d/d;->f:Landroid/content/Context;

    invoke-static {v0}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lkik/android/d/f;

    iget-object v2, p0, Lkik/android/d/d;->f:Landroid/content/Context;

    const-string v3, "eula-has-been-accepted"

    new-instance v4, Ljava/lang/Boolean;

    invoke-direct {v4, v8}, Ljava/lang/Boolean;-><init>(Z)V

    new-array v5, v10, [Ljava/lang/Boolean;

    new-instance v1, Ljava/lang/Boolean;

    invoke-direct {v1, v8}, Ljava/lang/Boolean;-><init>(Z)V

    aput-object v1, v5, v8

    new-instance v1, Ljava/lang/Boolean;

    invoke-direct {v1, v9}, Ljava/lang/Boolean;-><init>(Z)V

    aput-object v1, v5, v9

    iget-object v6, p0, Lkik/android/d/d;->e:Lkik/android/util/ar;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lkik/android/d/f;-><init>(Lkik/android/d/d;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;[Ljava/lang/Boolean;Lkik/android/util/ar;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lkik/android/d/g;

    iget-object v2, p0, Lkik/android/d/d;->f:Landroid/content/Context;

    const-string v3, "eula-has-been-accepted"

    new-instance v4, Ljava/lang/Boolean;

    invoke-direct {v4, v8}, Ljava/lang/Boolean;-><init>(Z)V

    new-array v5, v10, [Ljava/lang/Boolean;

    new-instance v1, Ljava/lang/Boolean;

    invoke-direct {v1, v8}, Ljava/lang/Boolean;-><init>(Z)V

    aput-object v1, v5, v8

    new-instance v1, Ljava/lang/Boolean;

    invoke-direct {v1, v9}, Ljava/lang/Boolean;-><init>(Z)V

    aput-object v1, v5, v9

    iget-object v6, p0, Lkik/android/d/d;->e:Lkik/android/util/ar;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lkik/android/d/g;-><init>(Lkik/android/d/d;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;[Ljava/lang/Boolean;Lkik/android/util/ar;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lkik/android/d/h;

    iget-object v2, p0, Lkik/android/d/d;->f:Landroid/content/Context;

    const-string v3, "metrics-use-alt"

    new-instance v4, Ljava/lang/Boolean;

    invoke-direct {v4, v8}, Ljava/lang/Boolean;-><init>(Z)V

    new-array v5, v10, [Ljava/lang/Boolean;

    new-instance v1, Ljava/lang/Boolean;

    invoke-direct {v1, v8}, Ljava/lang/Boolean;-><init>(Z)V

    aput-object v1, v5, v8

    new-instance v1, Ljava/lang/Boolean;

    invoke-direct {v1, v9}, Ljava/lang/Boolean;-><init>(Z)V

    aput-object v1, v5, v9

    iget-object v6, p0, Lkik/android/d/d;->e:Lkik/android/util/ar;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lkik/android/d/h;-><init>(Lkik/android/d/d;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;[Ljava/lang/Boolean;Lkik/android/util/ar;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lkik/android/d/i;

    iget-object v2, p0, Lkik/android/d/d;->f:Landroid/content/Context;

    const-string v3, "force-crash"

    new-instance v4, Ljava/lang/Boolean;

    invoke-direct {v4, v8}, Ljava/lang/Boolean;-><init>(Z)V

    new-array v5, v10, [Ljava/lang/Boolean;

    new-instance v1, Ljava/lang/Boolean;

    invoke-direct {v1, v8}, Ljava/lang/Boolean;-><init>(Z)V

    aput-object v1, v5, v8

    new-instance v1, Ljava/lang/Boolean;

    invoke-direct {v1, v9}, Ljava/lang/Boolean;-><init>(Z)V

    aput-object v1, v5, v9

    iget-object v6, p0, Lkik/android/d/d;->e:Lkik/android/util/ar;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lkik/android/d/i;-><init>(Lkik/android/d/d;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;[Ljava/lang/Boolean;Lkik/android/util/ar;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    :cond_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/d/b;

    .line 83
    iget-object v2, p0, Lkik/android/d/d;->g:Ljava/util/Hashtable;

    invoke-virtual {v0}, Lkik/android/d/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 85
    :cond_1
    return-void
.end method

.method public final a(Lkik/android/d/b;)Z
    .locals 2

    .prologue
    .line 276
    iget-object v0, p0, Lkik/android/d/d;->g:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lkik/android/d/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 277
    iget-object v0, p0, Lkik/android/d/d;->g:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lkik/android/d/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    const/4 v0, 0x1

    .line 280
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 328
    sget-object v0, Lkik/android/d/d;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Hashtable;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 298
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 299
    sget-object v1, Lkik/android/d/d;->a:Ljava/util/Hashtable;

    invoke-virtual {v1, p1}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 300
    iget-object v1, p0, Lkik/android/d/d;->e:Lkik/android/util/ar;

    invoke-interface {v1}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "kik.server.profile"

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 301
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 302
    const/4 v0, 0x1

    .line 305
    :cond_0
    return v0
.end method
