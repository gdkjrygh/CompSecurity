.class final La/a/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Landroid/app/Application$ActivityLifecycleCallbacks;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/app/Application;


# direct methods
.method constructor <init>(Landroid/app/Application;)V
    .locals 1

    .prologue
    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, La/a/a/a/b;->a:Ljava/util/Set;

    .line 87
    iput-object p1, p0, La/a/a/a/b;->b:Landroid/app/Application;

    .line 88
    return-void
.end method

.method static synthetic a(La/a/a/a/b;)V
    .locals 3

    .prologue
    .line 81
    .line 2092
    iget-object v0, p0, La/a/a/a/b;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 2093
    iget-object v2, p0, La/a/a/a/b;->b:Landroid/app/Application;

    invoke-virtual {v2, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    goto :goto_0

    .line 81
    :cond_0
    return-void
.end method

.method static synthetic a(La/a/a/a/b;La/a/a/a/d;)Z
    .locals 2

    .prologue
    .line 81
    .line 1100
    iget-object v0, p0, La/a/a/a/b;->b:Landroid/app/Application;

    if-eqz v0, :cond_0

    .line 1101
    new-instance v0, La/a/a/a/c;

    invoke-direct {v0, p0, p1}, La/a/a/a/c;-><init>(La/a/a/a/b;La/a/a/a/d;)V

    .line 1140
    iget-object v1, p0, La/a/a/a/b;->b:Landroid/app/Application;

    invoke-virtual {v1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1141
    iget-object v1, p0, La/a/a/a/b;->a:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1142
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 1144
    :cond_0
    const/4 v0, 0x0

    .line 81
    goto :goto_0
.end method
