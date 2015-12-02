.class Lcom/facebook/bugreporter/n;
.super Ljava/lang/Object;
.source "BugReporterFileUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/net/Uri;

.field final synthetic b:Lcom/facebook/bugreporter/m;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/m;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/facebook/bugreporter/n;->b:Lcom/facebook/bugreporter/m;

    iput-object p2, p0, Lcom/facebook/bugreporter/n;->a:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/bugreporter/n;->b:Lcom/facebook/bugreporter/m;

    iget-object v1, p0, Lcom/facebook/bugreporter/n;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/m;->b(Landroid/net/Uri;)V

    .line 66
    return-void
.end method
