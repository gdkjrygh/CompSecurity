.class public Lcom/facebook/widget/listview/n;
.super Ljava/lang/Object;
.source "ScrollState.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Lcom/facebook/widget/listview/o;

.field private final b:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/widget/listview/o;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/listview/o;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/widget/listview/n;->a:Lcom/facebook/widget/listview/o;

    .line 30
    invoke-static {p2}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/listview/n;->b:Lcom/google/common/a/ev;

    .line 31
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/widget/listview/o;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/widget/listview/n;->a:Lcom/facebook/widget/listview/o;

    return-object v0
.end method

.method public b()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/widget/listview/n;->b:Lcom/google/common/a/ev;

    return-object v0
.end method
