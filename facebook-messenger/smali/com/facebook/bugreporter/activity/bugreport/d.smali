.class Lcom/facebook/bugreporter/activity/bugreport/d;
.super Ljava/lang/Object;
.source "BugReportFragment.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/net/Uri;

.field final synthetic b:Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 217
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/bugreport/d;->b:Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    iput-object p2, p0, Lcom/facebook/bugreporter/activity/bugreport/d;->a:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 3

    .prologue
    .line 220
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/net/URI;

    iget-object v2, p0, Lcom/facebook/bugreporter/activity/bugreport/d;->a:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 221
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 217
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/bugreport/d;->a()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
