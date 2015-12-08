.class public Lcom/a/a/a;
.super Lb/a/a/a/l;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/m;


# instance fields
.field public final a:Lcom/a/a/a/a;

.field public final b:Lcom/a/a/b/a;

.field public final c:Lcom/a/a/c/g;

.field public final d:Ljava/util/Collection;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 29
    new-instance v0, Lcom/a/a/a/a;

    invoke-direct {v0}, Lcom/a/a/a/a;-><init>()V

    new-instance v1, Lcom/a/a/b/a;

    invoke-direct {v1}, Lcom/a/a/b/a;-><init>()V

    new-instance v2, Lcom/a/a/c/g;

    invoke-direct {v2}, Lcom/a/a/c/g;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/a/a/a;-><init>(Lcom/a/a/a/a;Lcom/a/a/b/a;Lcom/a/a/c/g;)V

    .line 30
    return-void
.end method

.method private constructor <init>(Lcom/a/a/a/a;Lcom/a/a/b/a;Lcom/a/a/c/g;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Lb/a/a/a/l;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/a/a/a;->a:Lcom/a/a/a/a;

    .line 34
    iput-object p2, p0, Lcom/a/a/a;->b:Lcom/a/a/b/a;

    .line 35
    iput-object p3, p0, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    .line 37
    const/4 v0, 0x3

    new-array v0, v0, [Lb/a/a/a/l;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    const/4 v1, 0x2

    aput-object p3, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/a;->d:Ljava/util/Collection;

    .line 38
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 213
    invoke-static {}, Lcom/a/a/a;->f()V

    .line 214
    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v0

    iget-object v0, v0, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    invoke-virtual {v0, p0}, Lcom/a/a/c/g;->a(Ljava/lang/String;)V

    .line 215
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 222
    invoke-static {}, Lcom/a/a/a;->f()V

    .line 223
    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v0

    iget-object v0, v0, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    invoke-virtual {v0, p0, p1}, Lcom/a/a/c/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    return-void
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 204
    invoke-static {}, Lcom/a/a/a;->f()V

    .line 205
    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v0

    iget-object v0, v0, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    invoke-virtual {v0, p0}, Lcom/a/a/c/g;->a(Ljava/lang/Throwable;)V

    .line 206
    return-void
.end method

.method public static d()Lcom/a/a/a;
    .locals 1

    .prologue
    .line 185
    const-class v0, Lcom/a/a/a;

    invoke-static {v0}, Lb/a/a/a/d;->a(Ljava/lang/Class;)Lb/a/a/a/l;

    move-result-object v0

    check-cast v0, Lcom/a/a/a;

    return-object v0
.end method

.method private static f()V
    .locals 2

    .prologue
    .line 363
    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v0

    if-nez v0, :cond_0

    .line 364
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 367
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 166
    const-string v0, "2.3.2.56"

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 171
    const-string v0, "com.crashlytics.sdk.android:crashlytics"

    return-object v0
.end method

.method public final c()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/a/a/a;->d:Ljava/util/Collection;

    return-object v0
.end method

.method protected final bridge synthetic e()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    return-object v0
.end method
