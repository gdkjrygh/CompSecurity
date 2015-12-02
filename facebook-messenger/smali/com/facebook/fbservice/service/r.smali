.class Lcom/facebook/fbservice/service/r;
.super Ljava/lang/Object;
.source "BlueServiceRegistry.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field

.field final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/fbservice/service/r;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 40
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Lcom/facebook/fbservice/service/q;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/service/r;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/fbservice/service/r;->a:Ljava/lang/Class;

    .line 35
    iput-object p2, p0, Lcom/facebook/fbservice/service/r;->b:Ljava/lang/Class;

    .line 36
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/facebook/fbservice/service/q;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1, p2}, Lcom/facebook/fbservice/service/r;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method
