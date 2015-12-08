.class final Lb/a/a/a/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

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

    iput-object v0, p0, Lb/a/a/a/a$a;->a:Ljava/util/Set;

    .line 87
    iput-object p1, p0, Lb/a/a/a/a$a;->b:Landroid/app/Application;

    .line 88
    return-void
.end method

.method static synthetic a(Lb/a/a/a/a$a;Lb/a/a/a/a$b;)Z
    .locals 2

    .prologue
    .line 81
    iget-object v0, p0, Lb/a/a/a/a$a;->b:Landroid/app/Application;

    if-eqz v0, :cond_0

    new-instance v0, Lb/a/a/a/b;

    invoke-direct {v0, p0, p1}, Lb/a/a/a/b;-><init>(Lb/a/a/a/a$a;Lb/a/a/a/a$b;)V

    iget-object v1, p0, Lb/a/a/a/a$a;->b:Landroid/app/Application;

    invoke-virtual {v1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v1, p0, Lb/a/a/a/a$a;->a:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
