.class public Lcom/facebook/base/a/h;
.super Lcom/facebook/base/activity/a;
.source "AppInitializationActivityHelper.java"


# instance fields
.field private final a:Lcom/facebook/base/a/d;

.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/c/s;


# direct methods
.method public constructor <init>(Lcom/facebook/base/a/d;Lcom/facebook/c/s;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/base/a/d;",
            "Lcom/facebook/c/s;",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/base/a/h;->a:Lcom/facebook/base/a/d;

    .line 31
    iput-object p3, p0, Lcom/facebook/base/a/h;->b:Ljava/lang/Class;

    .line 32
    iput-object p2, p0, Lcom/facebook/base/a/h;->c:Lcom/facebook/c/s;

    .line 33
    return-void
.end method


# virtual methods
.method public f(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/base/a/h;->a:Lcom/facebook/base/a/d;

    invoke-virtual {v0}, Lcom/facebook/base/a/d;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 50
    :cond_0
    :goto_0
    return-void

    .line 41
    :cond_1
    invoke-static {}, Lcom/facebook/common/annotations/a;->a()Lcom/facebook/common/annotations/a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/facebook/base/activity/AppInitializationNotRequired;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/annotations/a;->b(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 45
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 46
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/base/a/h;->b:Ljava/lang/Class;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 47
    const-string v2, "return_intent"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 48
    iget-object v0, p0, Lcom/facebook/base/a/h;->c:Lcom/facebook/c/s;

    invoke-virtual {v0, v1, p1}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 49
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method
