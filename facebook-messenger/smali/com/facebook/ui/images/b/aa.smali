.class public Lcom/facebook/ui/images/b/aa;
.super Lcom/facebook/ui/media/a/a;
.source "ImageMediaDownloader.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/facebook/ui/images/b/aa;

    sput-object v0, Lcom/facebook/ui/images/b/aa;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/http/b/ap;Lcom/facebook/analytics/j/a;Lcom/facebook/analytics/av;Lcom/facebook/analytics/g/e;)V
    .locals 7

    .prologue
    .line 28
    const-string v3, "image"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/ui/media/a/a;-><init>(Landroid/content/Context;Lcom/facebook/http/b/ap;Ljava/lang/String;Lcom/facebook/analytics/j/a;Lcom/facebook/analytics/av;Lcom/facebook/analytics/g/e;)V

    .line 30
    return-void
.end method
