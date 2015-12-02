.class Lcom/facebook/inject/z;
.super Ljava/lang/Object;
.source "FbInjectorInitializer.java"


# instance fields
.field final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;",
            "Lcom/facebook/inject/e;",
            ">;"
        }
    .end annotation
.end field

.field final b:Lcom/facebook/inject/ba;

.field final c:Lcom/facebook/inject/n;

.field final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Ljavax/inject/a;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Ljavax/inject/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/facebook/inject/ba;Lcom/facebook/inject/n;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/inject/ag;",
            ">;",
            "Lcom/facebook/inject/e;",
            ">;",
            "Lcom/facebook/inject/ba;",
            "Lcom/facebook/inject/n;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Ljavax/inject/a;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/a;",
            "Ljavax/inject/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Lcom/facebook/inject/z;->a:Ljava/util/Map;

    .line 105
    iput-object p2, p0, Lcom/facebook/inject/z;->b:Lcom/facebook/inject/ba;

    .line 106
    iput-object p3, p0, Lcom/facebook/inject/z;->c:Lcom/facebook/inject/n;

    .line 107
    iput-object p4, p0, Lcom/facebook/inject/z;->e:Ljava/util/Map;

    .line 108
    iput-object p5, p0, Lcom/facebook/inject/z;->d:Ljava/util/Map;

    .line 109
    return-void
.end method
