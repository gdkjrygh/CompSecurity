.class Lcom/facebook/auth/broadcast/n;
.super Ljava/lang/Object;
.source "ToastThreadUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/facebook/auth/broadcast/m;


# direct methods
.method constructor <init>(Lcom/facebook/auth/broadcast/m;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/auth/broadcast/n;->c:Lcom/facebook/auth/broadcast/m;

    iput-object p2, p0, Lcom/facebook/auth/broadcast/n;->a:Ljava/lang/String;

    iput p3, p0, Lcom/facebook/auth/broadcast/n;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/auth/broadcast/n;->c:Lcom/facebook/auth/broadcast/m;

    invoke-static {v0}, Lcom/facebook/auth/broadcast/m;->a(Lcom/facebook/auth/broadcast/m;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/auth/broadcast/n;->a:Ljava/lang/String;

    iget v2, p0, Lcom/facebook/auth/broadcast/n;->b:I

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 33
    return-void
.end method
