.class Lcom/facebook/orca/photos/b/s;
.super Lcom/facebook/inject/d;
.source "PhotoUploadModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/photos/b/aa;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/photos/b/o;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/photos/b/o;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/facebook/orca/photos/b/s;->a:Lcom/facebook/orca/photos/b/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0, p1}, Lcom/facebook/orca/photos/b/s;-><init>(Lcom/facebook/orca/photos/b/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/photos/b/aa;
    .locals 5

    .prologue
    .line 92
    new-instance v3, Lcom/facebook/orca/photos/b/aa;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/photos/b/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/e/h;

    const-class v2, Lcom/facebook/j/a/a/a;

    const-class v4, Lcom/facebook/orca/annotations/MessengerImageResizer;

    invoke-virtual {p0, v2, v4}, Lcom/facebook/orca/photos/b/s;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v2, Lcom/google/common/base/Stopwatch;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/photos/b/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/common/base/Stopwatch;

    invoke-direct {v3, v0, v1, v4, v2}, Lcom/facebook/orca/photos/b/aa;-><init>(Lcom/facebook/analytics/av;Lcom/facebook/common/e/h;Ljavax/inject/a;Lcom/google/common/base/Stopwatch;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 87
    invoke-virtual {p0}, Lcom/facebook/orca/photos/b/s;->a()Lcom/facebook/orca/photos/b/aa;

    move-result-object v0

    return-object v0
.end method
