.class public Lcom/facebook/f/b;
.super Ljava/lang/Object;
.source "FetchGatekeepersParams.java"


# instance fields
.field public final a:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/facebook/f/c;


# direct methods
.method public constructor <init>(Lcom/google/common/a/fi;Lcom/facebook/f/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/f/c;",
            ")V"
        }
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/f/b;->a:Lcom/google/common/a/fi;

    .line 21
    iput-object p2, p0, Lcom/facebook/f/b;->b:Lcom/facebook/f/c;

    .line 22
    return-void
.end method
