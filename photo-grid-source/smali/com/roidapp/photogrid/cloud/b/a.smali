.class public final Lcom/roidapp/photogrid/cloud/b/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/b;
.implements Ljava/util/Observer;


# static fields
.field private static c:Z

.field private static final g:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/roidapp/photogrid/cloud/b/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Z

.field private volatile b:Z

.field private d:Lcom/roidapp/photogrid/MainPage;

.field private e:Lcom/roidapp/photogrid/cloud/b/e;

.field private f:Lcom/roidapp/photogrid/cloud/b/d;

.field private final h:Lcom/roidapp/photogrid/cloud/b/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/photogrid/cloud/b/a;->c:Z

    .line 57
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/cloud/b/a;->g:Ljava/util/LinkedList;

    return-void
.end method

.method public constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 1

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Lcom/roidapp/photogrid/cloud/b/b;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/b/b;-><init>(Lcom/roidapp/photogrid/cloud/b/a;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->h:Lcom/roidapp/photogrid/cloud/b/f;

    .line 97
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/b/a;->d:Lcom/roidapp/photogrid/MainPage;

    .line 98
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/b/a;)Z
    .locals 1

    .prologue
    .line 43
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->b:Z

    return v0
.end method

.method private a(Lcom/roidapp/photogrid/cloud/b/d;Ljava/lang/String;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 171
    iget-boolean v2, p0, Lcom/roidapp/photogrid/cloud/b/a;->b:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/b/a;->d:Lcom/roidapp/photogrid/MainPage;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/b/a;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/MainPage;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move v0, v1

    .line 184
    :goto_0
    return v0

    .line 175
    :cond_1
    new-instance v2, Lcom/roidapp/photogrid/cloud/b/c;

    invoke-direct {v2}, Lcom/roidapp/photogrid/cloud/b/c;-><init>()V

    .line 176
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/b/a;->h:Lcom/roidapp/photogrid/cloud/b/f;

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/cloud/b/c;->a(Lcom/roidapp/photogrid/cloud/b/c;Lcom/roidapp/photogrid/cloud/b/f;)V

    .line 177
    invoke-static {v2, p1, p2}, Lcom/roidapp/photogrid/cloud/b/c;->a(Lcom/roidapp/photogrid/cloud/b/c;Lcom/roidapp/photogrid/cloud/b/d;Ljava/lang/String;)V

    .line 178
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/b/a;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/MainPage;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    const-string v4, "PushDialogFragment"

    invoke-virtual {v2, v3, v4}, Lcom/roidapp/photogrid/cloud/b/c;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 179
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    const-string v3, "cloud_push_dialog"

    invoke-virtual {v2, v3, v1}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget v2, p1, Lcom/roidapp/photogrid/cloud/b/d;->a:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0
.end method

.method private a(Ljava/util/List;)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/cloud/b/d;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 122
    if-eqz p1, :cond_a

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 123
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/b/d;

    .line 124
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    .line 1188
    const-string v2, "cloud_push_dialog"

    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    iget v6, v0, Lcom/roidapp/photogrid/cloud/b/d;->a:I

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    move v1, v4

    .line 124
    :goto_1
    if-eqz v1, :cond_0

    .line 2134
    sget-object v1, Lcom/roidapp/photogrid/cloud/b/a;->g:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2135
    sget-object v1, Lcom/roidapp/photogrid/cloud/b/a;->g:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    .line 1192
    :cond_1
    invoke-static {v1}, Lcom/roidapp/baselib/c/n;->c(Landroid/content/Context;)I

    move-result v6

    .line 1193
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    div-long/2addr v8, v10

    .line 1194
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v7

    .line 1196
    iget-wide v10, v0, Lcom/roidapp/photogrid/cloud/b/d;->c:J

    cmp-long v1, v8, v10

    if-ltz v1, :cond_2

    iget-wide v10, v0, Lcom/roidapp/photogrid/cloud/b/d;->d:J

    cmp-long v1, v8, v10

    if-gtz v1, :cond_2

    move v1, v3

    .line 1197
    :goto_2
    if-nez v1, :cond_3

    move v1, v4

    .line 1198
    goto :goto_1

    :cond_2
    move v1, v4

    .line 1196
    goto :goto_2

    .line 1202
    :cond_3
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/b/d;->b:Ljava/util/List;

    if-eqz v1, :cond_c

    .line 1203
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/b/d;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/baselib/c/x;

    .line 1204
    iget-object v2, v1, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v6, v2, :cond_4

    iget-object v1, v1, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-gt v6, v1, :cond_4

    move v1, v3

    .line 1210
    :goto_3
    if-nez v1, :cond_5

    move v1, v4

    .line 1211
    goto :goto_1

    .line 1216
    :cond_5
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/b/d;->j:Ljava/util/Set;

    if-eqz v1, :cond_7

    .line 1217
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/b/d;->j:Ljava/util/Set;

    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    move v1, v3

    goto :goto_1

    :cond_6
    move v1, v4

    goto :goto_1

    .line 1218
    :cond_7
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/b/d;->k:Ljava/util/Set;

    if-eqz v1, :cond_8

    .line 1219
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/b/d;->k:Ljava/util/Set;

    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_1

    .line 1220
    :cond_8
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/b/d;->j:Ljava/util/Set;

    if-nez v1, :cond_b

    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/b/d;->k:Ljava/util/Set;

    if-nez v1, :cond_b

    move v1, v3

    .line 1221
    goto/16 :goto_1

    .line 128
    :cond_9
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/b/a;->c()Z

    move-result v4

    .line 130
    :cond_a
    return v4

    :cond_b
    move v1, v4

    goto/16 :goto_1

    :cond_c
    move v1, v4

    goto :goto_3
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/b/a;)Lcom/roidapp/photogrid/MainPage;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->d:Lcom/roidapp/photogrid/MainPage;

    return-object v0
.end method

.method private c()Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 140
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->a:Z

    if-eqz v0, :cond_0

    move v0, v1

    .line 155
    :goto_0
    return v0

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->f:Lcom/roidapp/photogrid/cloud/b/d;

    if-nez v0, :cond_1

    .line 145
    sget-object v0, Lcom/roidapp/photogrid/cloud/b/a;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/b/d;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->f:Lcom/roidapp/photogrid/cloud/b/d;

    .line 146
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->f:Lcom/roidapp/photogrid/cloud/b/d;

    if-nez v0, :cond_1

    sget-object v0, Lcom/roidapp/photogrid/cloud/b/a;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->f:Lcom/roidapp/photogrid/cloud/b/d;

    if-eqz v0, :cond_3

    .line 151
    iput-boolean v2, p0, Lcom/roidapp/photogrid/cloud/b/a;->a:Z

    .line 152
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->f:Lcom/roidapp/photogrid/cloud/b/d;

    .line 2159
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/b/a;->d:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v4}, Lcom/roidapp/baselib/d/a;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v0, Lcom/roidapp/photogrid/cloud/b/d;->g:Ljava/lang/String;

    invoke-static {v4}, Lcom/roidapp/baselib/d/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 2161
    invoke-static {v3, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2162
    invoke-direct {p0, v0, v3}, Lcom/roidapp/photogrid/cloud/b/a;->a(Lcom/roidapp/photogrid/cloud/b/d;Ljava/lang/String;)Z

    :goto_1
    move v0, v2

    .line 153
    goto :goto_0

    .line 2165
    :cond_2
    new-instance v1, Lcom/roidapp/baselib/e/a;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/b/d;->g:Ljava/lang/String;

    invoke-direct {v1, v0, v3, p0}, Lcom/roidapp/baselib/e/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/e/b;)V

    .line 2166
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_1

    :cond_3
    move v0, v1

    .line 155
    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->b:Z

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->d:Lcom/roidapp/photogrid/MainPage;

    .line 103
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->e:Lcom/roidapp/photogrid/cloud/b/e;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->e:Lcom/roidapp/photogrid/cloud/b/e;

    .line 1061
    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/b/e;->deleteObservers()V

    .line 106
    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 246
    return-void
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 0

    .prologue
    .line 241
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 43
    check-cast p1, Ljava/lang/String;

    .line 2235
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->f:Lcom/roidapp/photogrid/cloud/b/d;

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/cloud/b/a;->a(Lcom/roidapp/photogrid/cloud/b/d;Ljava/lang/String;)Z

    .line 43
    return-void
.end method

.method public final b()Z
    .locals 2

    .prologue
    .line 109
    sget-boolean v0, Lcom/roidapp/photogrid/cloud/b/a;->c:Z

    if-eqz v0, :cond_0

    .line 110
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/cloud/b/a;->c:Z

    .line 111
    new-instance v0, Lcom/roidapp/photogrid/cloud/b/e;

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/cloud/b/e;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->e:Lcom/roidapp/photogrid/cloud/b/e;

    .line 112
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->e:Lcom/roidapp/photogrid/cloud/b/e;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/b/e;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/b/a;->a(Ljava/util/List;)Z

    move-result v0

    .line 113
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/b/a;->e:Lcom/roidapp/photogrid/cloud/b/e;

    invoke-virtual {v1, p0}, Lcom/roidapp/photogrid/cloud/b/e;->a(Ljava/util/Observer;)V

    .line 117
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/b/a;->c()Z

    move-result v0

    goto :goto_0
.end method

.method public final update(Ljava/util/Observable;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/b/a;->b:Z

    if-nez v0, :cond_0

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 229
    check-cast p2, Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/roidapp/photogrid/cloud/b/a;->a(Ljava/util/List;)Z

    .line 231
    :cond_0
    return-void
.end method
