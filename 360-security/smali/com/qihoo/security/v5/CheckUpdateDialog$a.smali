.class Lcom/qihoo/security/v5/CheckUpdateDialog$a;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v5/CheckUpdateDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/v5/CheckUpdateDialog;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qihoo/security/v5/CheckUpdateDialog;)V
    .locals 1

    .prologue
    .line 207
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 208
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$a;->a:Ljava/lang/ref/WeakReference;

    .line 209
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/v5/CheckUpdateDialog;

    .line 214
    if-eqz v0, :cond_0

    .line 215
    invoke-static {v0, p1}, Lcom/qihoo/security/v5/CheckUpdateDialog;->a(Lcom/qihoo/security/v5/CheckUpdateDialog;Landroid/os/Message;)V

    .line 217
    :cond_0
    return-void
.end method
