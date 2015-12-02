.class public Lcom/facebook/orca/d/r;
.super Lcom/facebook/ui/media/a/a;
.source "AudioMediaDownloader.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/http/b/ap;Lcom/facebook/analytics/j/a;Lcom/facebook/analytics/av;Lcom/facebook/analytics/g/e;)V
    .locals 7

    .prologue
    .line 26
    const-string v3, "audio"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/ui/media/a/a;-><init>(Landroid/content/Context;Lcom/facebook/http/b/ap;Ljava/lang/String;Lcom/facebook/analytics/j/a;Lcom/facebook/analytics/av;Lcom/facebook/analytics/g/e;)V

    .line 28
    return-void
.end method
