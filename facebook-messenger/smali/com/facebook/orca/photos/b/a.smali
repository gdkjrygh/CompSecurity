.class public Lcom/facebook/orca/photos/b/a;
.super Ljava/lang/Object;
.source "MessengerPhotoResizeExperiment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/orca/photos/b/e;


# instance fields
.field private final c:Lcom/facebook/abtest/qe/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/abtest/qe/d/a",
            "<",
            "Lcom/facebook/orca/photos/b/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/16 v5, 0x3c0

    const/16 v4, 0x280

    const/16 v3, 0x55

    .line 30
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "width"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "height"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "quality"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/photos/b/a;->a:Lcom/google/common/a/ev;

    .line 38
    new-instance v0, Lcom/facebook/orca/photos/b/e;

    invoke-direct {v0, v4, v5, v3}, Lcom/facebook/orca/photos/b/e;-><init>(III)V

    sput-object v0, Lcom/facebook/orca/photos/b/a;->b:Lcom/facebook/orca/photos/b/e;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/abtest/qe/d/e;)V
    .locals 3

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const-string v0, "messenger_photo_resize_android"

    new-instance v1, Lcom/facebook/orca/photos/b/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/orca/photos/b/c;-><init>(Lcom/facebook/orca/photos/b/b;)V

    invoke-virtual {p1, v0, v1}, Lcom/facebook/abtest/qe/d/e;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)Lcom/facebook/abtest/qe/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/photos/b/a;->c:Lcom/facebook/abtest/qe/d/a;

    .line 52
    return-void
.end method

.method static synthetic b()Lcom/facebook/orca/photos/b/e;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/facebook/orca/photos/b/a;->b:Lcom/facebook/orca/photos/b/e;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/photos/b/e;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/orca/photos/b/a;->c:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/e;

    return-object v0
.end method
