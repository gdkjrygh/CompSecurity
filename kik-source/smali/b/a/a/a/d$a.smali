.class public final Lb/a/a/a/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:[Lb/a/a/a/l;

.field private c:Lb/a/a/a/a/c/p;

.field private d:Landroid/os/Handler;

.field private e:Lb/a/a/a/o;

.field private f:Z

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Lb/a/a/a/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    if-nez p1, :cond_0

    .line 92
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Context must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/a/d$a;->a:Landroid/content/Context;

    .line 96
    return-void
.end method


# virtual methods
.method public final varargs a([Lb/a/a/a/l;)Lb/a/a/a/d$a;
    .locals 2

    .prologue
    .line 102
    if-nez p1, :cond_0

    .line 103
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Kits must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 105
    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    .line 106
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Kits must not be empty."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 108
    :cond_1
    iget-object v0, p0, Lb/a/a/a/d$a;->b:[Lb/a/a/a/l;

    if-eqz v0, :cond_2

    .line 109
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Kits already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 112
    :cond_2
    iput-object p1, p0, Lb/a/a/a/d$a;->b:[Lb/a/a/a/l;

    .line 113
    return-object p0
.end method

.method public final a()Lb/a/a/a/d;
    .locals 9

    .prologue
    .line 226
    iget-object v0, p0, Lb/a/a/a/d$a;->b:[Lb/a/a/a/l;

    if-nez v0, :cond_0

    .line 227
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Kits must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 230
    :cond_0
    iget-object v0, p0, Lb/a/a/a/d$a;->c:Lb/a/a/a/a/c/p;

    if-nez v0, :cond_1

    .line 231
    invoke-static {}, Lb/a/a/a/a/c/p;->a()Lb/a/a/a/a/c/p;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/a/d$a;->c:Lb/a/a/a/a/c/p;

    .line 234
    :cond_1
    iget-object v0, p0, Lb/a/a/a/d$a;->d:Landroid/os/Handler;

    if-nez v0, :cond_2

    .line 235
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lb/a/a/a/d$a;->d:Landroid/os/Handler;

    .line 238
    :cond_2
    iget-object v0, p0, Lb/a/a/a/d$a;->e:Lb/a/a/a/o;

    if-nez v0, :cond_3

    .line 239
    iget-boolean v0, p0, Lb/a/a/a/d$a;->f:Z

    if-eqz v0, :cond_6

    .line 240
    new-instance v0, Lb/a/a/a/c;

    invoke-direct {v0}, Lb/a/a/a/c;-><init>()V

    iput-object v0, p0, Lb/a/a/a/d$a;->e:Lb/a/a/a/o;

    .line 247
    :cond_3
    :goto_0
    iget-object v0, p0, Lb/a/a/a/d$a;->h:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 248
    iget-object v0, p0, Lb/a/a/a/d$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/a/d$a;->h:Ljava/lang/String;

    .line 251
    :cond_4
    iget-object v0, p0, Lb/a/a/a/d$a;->i:Lb/a/a/a/i;

    if-nez v0, :cond_5

    .line 252
    sget-object v0, Lb/a/a/a/i;->d:Lb/a/a/a/i;

    iput-object v0, p0, Lb/a/a/a/d$a;->i:Lb/a/a/a/i;

    .line 255
    :cond_5
    iget-object v0, p0, Lb/a/a/a/d$a;->b:[Lb/a/a/a/l;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lb/a/a/a/d;->a(Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v2

    .line 257
    new-instance v8, Lb/a/a/a/a/b/t;

    iget-object v0, p0, Lb/a/a/a/d$a;->a:Landroid/content/Context;

    iget-object v1, p0, Lb/a/a/a/d$a;->h:Ljava/lang/String;

    iget-object v3, p0, Lb/a/a/a/d$a;->g:Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-direct {v8, v0, v1, v3, v4}, Lb/a/a/a/a/b/t;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V

    .line 260
    new-instance v0, Lb/a/a/a/d;

    iget-object v1, p0, Lb/a/a/a/d$a;->a:Landroid/content/Context;

    iget-object v3, p0, Lb/a/a/a/d$a;->c:Lb/a/a/a/a/c/p;

    iget-object v4, p0, Lb/a/a/a/d$a;->d:Landroid/os/Handler;

    iget-object v5, p0, Lb/a/a/a/d$a;->e:Lb/a/a/a/o;

    iget-boolean v6, p0, Lb/a/a/a/d$a;->f:Z

    iget-object v7, p0, Lb/a/a/a/d$a;->i:Lb/a/a/a/i;

    invoke-direct/range {v0 .. v8}, Lb/a/a/a/d;-><init>(Landroid/content/Context;Ljava/util/Map;Lb/a/a/a/a/c/p;Landroid/os/Handler;Lb/a/a/a/o;ZLb/a/a/a/i;Lb/a/a/a/a/b/t;)V

    return-object v0

    .line 242
    :cond_6
    new-instance v0, Lb/a/a/a/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb/a/a/a/c;-><init>(B)V

    iput-object v0, p0, Lb/a/a/a/d$a;->e:Lb/a/a/a/o;

    goto :goto_0
.end method
