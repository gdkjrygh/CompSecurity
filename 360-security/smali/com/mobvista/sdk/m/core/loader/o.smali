.class final Lcom/mobvista/sdk/m/core/loader/o;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/mobvista/sdk/m/core/loader/n;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/loader/n;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/o;->b:Lcom/mobvista/sdk/m/core/loader/n;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/loader/o;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 85
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/o;->b:Lcom/mobvista/sdk/m/core/loader/n;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/o;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/o;->b:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/loader/n;->a(Lcom/mobvista/sdk/m/core/loader/n;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/mobvista/sdk/m/core/loader/n;->a(Lcom/mobvista/sdk/m/core/loader/n;Landroid/content/Context;Ljava/lang/String;)V

    .line 86
    return-void
.end method
