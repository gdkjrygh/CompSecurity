.class public final Lkik/android/h/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/c;


# static fields
.field private static final b:Lorg/c/b;


# instance fields
.field final a:Lcom/kik/g/p;

.field private c:Lkik/a/j/n;

.field private d:Lkik/a/e/q;

.field private e:Lkik/a/e/v;

.field private f:Landroid/content/Context;

.field private g:Lkik/a/d/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-string v0, "AndroidAddressBookStorage"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/h/a;->b:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkik/a/e/q;)V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/android/h/a;->a:Lcom/kik/g/p;

    .line 51
    iput-object p1, p0, Lkik/android/h/a;->f:Landroid/content/Context;

    .line 52
    iput-object p2, p0, Lkik/android/h/a;->d:Lkik/a/e/q;

    .line 53
    return-void
.end method

.method static synthetic a(Lkik/android/h/a;)Lkik/a/d/c;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    return-object v0
.end method

.method static synthetic a(Lkik/android/h/a;Lkik/a/d/c;)Lkik/a/d/c;
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    return-object p1
.end method

.method static synthetic b(Lkik/android/h/a;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lkik/android/h/a;->e:Lkik/a/e/v;

    return-object v0
.end method

.method static synthetic i()Lorg/c/b;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lkik/android/h/a;->b:Lorg/c/b;

    return-object v0
.end method

.method private j()Ljava/io/File;
    .locals 2

    .prologue
    .line 124
    iget-object v0, p0, Lkik/android/h/a;->d:Lkik/a/e/q;

    const-string v1, "addressFilterFile"

    invoke-interface {v0, v1}, Lkik/a/e/q;->c(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/c/a/c/c;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 130
    .line 133
    :try_start_0
    invoke-direct {p0}, Lkik/android/h/a;->j()Ljava/io/File;

    move-result-object v0

    .line 134
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 135
    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 138
    :goto_0
    if-eqz v2, :cond_0

    .line 143
    :try_start_1
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/a/c/c;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V

    .line 152
    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    move-object v2, v1

    goto :goto_0

    .line 145
    :catch_1
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V

    move-object v0, v1

    .line 150
    goto :goto_1

    .line 149
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V

    throw v0

    :cond_0
    move-object v0, v1

    goto :goto_1
.end method

.method public final a(Ljava/util/List;)V
    .locals 4

    .prologue
    .line 87
    if-nez p1, :cond_1

    .line 120
    :cond_0
    :goto_0
    return-void

    .line 91
    :cond_1
    invoke-virtual {p0}, Lkik/android/h/a;->a()Lcom/c/a/c/c;

    move-result-object v0

    .line 93
    if-nez v0, :cond_4

    .line 94
    invoke-static {}, Lcom/c/a/c/h;->a()Lcom/c/a/c/g;

    move-result-object v0

    invoke-static {v0}, Lcom/c/a/c/c;->a(Lcom/c/a/c/g;)Lcom/c/a/c/c;

    move-result-object v0

    move-object v1, v0

    .line 96
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/b;

    .line 97
    if-eqz v0, :cond_2

    .line 98
    invoke-virtual {v0}, Lkik/a/d/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/c/a/c/c;->c(Ljava/lang/Object;)Z

    goto :goto_2

    .line 102
    :cond_3
    const/4 v2, 0x0

    .line 104
    :try_start_0
    invoke-direct {p0}, Lkik/android/h/a;->j()Ljava/io/File;

    move-result-object v0

    .line 105
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 106
    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    :goto_3
    if-eqz v0, :cond_0

    .line 114
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V

    goto :goto_0

    .line 108
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    move-object v0, v2

    goto :goto_3

    .line 117
    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V

    throw v1

    :cond_4
    move-object v1, v0

    goto :goto_1
.end method

.method public final a(Lkik/a/j/n;Lkik/a/e/v;Lcom/kik/g/p;Lcom/kik/g/p;)V
    .locals 3

    .prologue
    .line 58
    iput-object p1, p0, Lkik/android/h/a;->c:Lkik/a/j/n;

    .line 59
    iput-object p2, p0, Lkik/android/h/a;->e:Lkik/a/e/v;

    .line 60
    iget-object v0, p0, Lkik/android/h/a;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    .line 61
    new-instance v1, Ljava/io/File;

    const-string v2, "addressFilterFile"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 63
    invoke-direct {p0}, Lkik/android/h/a;->j()Ljava/io/File;

    move-result-object v0

    invoke-static {v1, v0}, Lkik/android/util/d;->a(Ljava/io/File;Ljava/io/File;)V

    .line 65
    new-instance v0, Lkik/android/h/b;

    invoke-direct {v0, p0}, Lkik/android/h/b;-><init>(Lkik/android/h/a;)V

    invoke-virtual {p4, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 74
    new-instance v0, Lkik/android/h/c;

    invoke-direct {v0, p0}, Lkik/android/h/c;-><init>(Lkik/android/h/a;)V

    invoke-virtual {p3, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 82
    return-void
.end method

.method public final b()Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 158
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 159
    iget-object v1, p0, Lkik/android/h/a;->e:Lkik/a/e/v;

    const-string v2, "AddressIntegration.MATCHING_OPT_IN_KEY"

    invoke-interface {v1, v2}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 160
    if-eqz v1, :cond_0

    .line 161
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 162
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 163
    new-instance v2, Lkik/a/d/c;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v2, v1}, Lkik/a/d/c;-><init>(Ljava/lang/Boolean;)V

    iput-object v2, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    .line 196
    :goto_0
    return-object v0

    .line 167
    :cond_0
    iget-object v1, p0, Lkik/android/h/a;->a:Lcom/kik/g/p;

    new-instance v2, Lkik/android/h/d;

    invoke-direct {v2, p0, v0}, Lkik/android/h/d;-><init>(Lkik/android/h/a;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method public final c()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 202
    iget-object v0, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    invoke-virtual {v0, v1}, Lkik/a/d/c;->a(Z)V

    .line 209
    :goto_0
    iget-object v0, p0, Lkik/android/h/a;->e:Lkik/a/e/v;

    const-string v1, "AddressIntegration.MATCHING_OPT_IN_KEY"

    const-string v2, "true"

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 211
    iget-object v0, p0, Lkik/android/h/a;->c:Lkik/a/j/n;

    const-string v1, "ab_settings"

    const/4 v2, 0x0

    iget-object v3, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    invoke-virtual {v3}, Lkik/a/d/c;->b()Lcom/kik/n/a/a/a;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lkik/a/j/n;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/h/e;

    invoke-direct {v1, p0}, Lkik/android/h/e;-><init>(Lkik/android/h/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 224
    return-void

    .line 206
    :cond_0
    new-instance v0, Lkik/a/d/c;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/a/d/c;-><init>(Ljava/lang/Boolean;)V

    iput-object v0, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    goto :goto_0
.end method

.method public final d()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 229
    iget-object v0, p0, Lkik/android/h/a;->e:Lkik/a/e/v;

    const-string v1, "AddressIntegration.MATCHING_OPT_IN_KEY"

    const-string v2, "false"

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 231
    iget-object v0, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    if-eqz v0, :cond_0

    .line 232
    iget-object v0, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    invoke-virtual {v0, v3}, Lkik/a/d/c;->a(Z)V

    .line 238
    :goto_0
    iget-object v0, p0, Lkik/android/h/a;->c:Lkik/a/j/n;

    const-string v1, "ab_settings"

    const/4 v2, 0x0

    iget-object v3, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    invoke-virtual {v3}, Lkik/a/d/c;->b()Lcom/kik/n/a/a/a;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lkik/a/j/n;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/h/f;

    invoke-direct {v1, p0}, Lkik/android/h/f;-><init>(Lkik/android/h/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 252
    return-void

    .line 235
    :cond_0
    new-instance v0, Lkik/a/d/c;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/a/d/c;-><init>(Ljava/lang/Boolean;)V

    iput-object v0, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    goto :goto_0
.end method

.method public final e()V
    .locals 3

    .prologue
    .line 257
    iget-object v0, p0, Lkik/android/h/a;->e:Lkik/a/e/v;

    const-string v1, "AddressIntegration.MATCHING_OPT_IN_KEY"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 262
    if-eqz v0, :cond_1

    .line 263
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 264
    new-instance v1, Lkik/a/d/c;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v1, v0}, Lkik/a/d/c;-><init>(Ljava/lang/Boolean;)V

    iput-object v1, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    .line 265
    iget-object v0, p0, Lkik/android/h/a;->a:Lcom/kik/g/p;

    iget-object v1, p0, Lkik/android/h/a;->g:Lkik/a/d/c;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 307
    :cond_0
    :goto_0
    return-void

    .line 267
    :cond_1
    iget-object v0, p0, Lkik/android/h/a;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 272
    iget-object v0, p0, Lkik/android/h/a;->c:Lkik/a/j/n;

    const-string v1, "ab_settings"

    const-class v2, Lcom/kik/n/a/a/a;

    invoke-interface {v0, v1, v2}, Lkik/a/j/n;->d(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/h/g;

    invoke-direct {v1, p0}, Lkik/android/h/g;-><init>(Lkik/android/h/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method public final f()Z
    .locals 2

    .prologue
    .line 312
    iget-object v0, p0, Lkik/android/h/a;->e:Lkik/a/e/v;

    const-string v1, "AddressIntegration.MATCHING_OPT_IN_KEY"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 313
    const-string v1, "true"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final g()V
    .locals 0

    .prologue
    .line 320
    invoke-virtual {p0}, Lkik/android/h/a;->h()V

    .line 321
    return-void
.end method

.method public final h()V
    .locals 2

    .prologue
    .line 326
    iget-object v0, p0, Lkik/android/h/a;->d:Lkik/a/e/q;

    const-string v1, "addressFilterFile"

    invoke-interface {v0, v1}, Lkik/a/e/q;->c(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 327
    return-void
.end method
