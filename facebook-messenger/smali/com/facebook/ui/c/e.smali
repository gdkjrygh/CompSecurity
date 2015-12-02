.class Lcom/facebook/ui/c/e;
.super Ljava/lang/Object;
.source "DiskUsageUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/ui/c/d;


# direct methods
.method constructor <init>(Lcom/facebook/ui/c/d;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/ui/c/e;->a:Lcom/facebook/ui/c/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/ui/c/e;->a:Lcom/facebook/ui/c/d;

    invoke-static {v0}, Lcom/facebook/ui/c/d;->a(Lcom/facebook/ui/c/d;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/facebook/o;->low_disk_space_warning_message:I

    invoke-static {v0, v1}, Lcom/facebook/ui/i/g;->a(Landroid/content/Context;I)V

    .line 83
    return-void
.end method
