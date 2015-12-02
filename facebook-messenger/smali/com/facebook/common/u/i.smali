.class public Lcom/facebook/common/u/i;
.super Ljava/lang/Object;
.source "UriTemplateMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<X:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TX;"
        }
    .end annotation
.end field

.field public final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TX;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .prologue
    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p1, p0, Lcom/facebook/common/u/i;->a:Ljava/lang/Object;

    .line 104
    iput-object p2, p0, Lcom/facebook/common/u/i;->b:Landroid/os/Bundle;

    .line 105
    return-void
.end method
